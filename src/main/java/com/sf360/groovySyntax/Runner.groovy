package com.sf360.groovySyntax

import java.lang.reflect.Modifier

class Runner {
	static <T> T run(Class<T> taskClass) {
		def tasks = taskClass.newInstance()

		def params = [jdk:6, windows: false]

		tasks.class.declaredMethods.each { m ->

			if(Modifier.isPublic(m.modifiers) && m.parameterTypes.length == 0) {

				def onlyIf = m.getAnnotation(OnlyIf)

				if(onlyIf) {
					Closure cl = onlyIf.value().newInstance(tasks, tasks)

					cl.delegate = params

					if(cl()) {
						m.invoke(tasks)
					}
				}else {
					m.invoke(tasks)
				}
			}
		}
		tasks
	}
}

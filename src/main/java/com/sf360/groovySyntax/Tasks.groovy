package com.sf360.groovySyntax

class Tasks {
	Set result = []
	void alwaysExecuted() {
		result << 1
	}

	@OnlyIf({ jdk>=6 })
	void supoortedOnlyInJDK6() {
		result << 'JDK 6'
	}

	@OnlyIf({ jdk>=7 && windows })
	void requiredJDK7AndWindows() {
		result << 'JDK 7 Windows'
	}
}

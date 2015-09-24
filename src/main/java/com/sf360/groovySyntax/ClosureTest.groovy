package com.sf360.groovySyntax

import com.sf360.groovySyntax.User;

class ClosureTest {

	static main(args) {
		
		println "Closures as an object"
		
		def personName = {e -> println "cicked on $e.name"}
		
		User currentUser = new User("New Branch 2", 19)
		
		personName(currentUser)
	
	}

}

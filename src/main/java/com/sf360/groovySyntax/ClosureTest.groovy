package com.sf360.groovySyntax

import com.sf360.groovySyntax.User;

class ClosureTest {

	static main(args) {
		
		println "Closures as an object"
		
		def personName = {e -> println "cicked on $e.name"}
		
		User currentUser = new User("Joseph", 19)
		
		personName(currentUser)
	
	}

}

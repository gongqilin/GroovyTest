package com.sf360.groovySyntax

class User {
	public final String name
	public final int age
	
	User(String name) {
		this.name = name
	}
	
	User(String name, int age) {
		this.name = name
		this.age = age
	}
	
	String getName() {
		"Name: $name"
	}
	
	String getAge() {
		"Age: $age"
	}

}

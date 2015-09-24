package com.sf360.groovySyntax

import java.util.regex.Matcher
import org.codehaus.groovy.runtime.InvokerHelper;

class GSyntax extends Script {

	def transform(List elements, Closure action) {
		def result = []
		elements.each {  result << action(it)}
		result
	}

	String describe(User user) {
		"$user.name is $user.age"
	}

	def run() {
		println 'Groovy world!'
		/*
		 def action = this.&describe
		 def list = [
		 new User('Bob', 42),
		 new User('Julia', 35)
		 ]
		 println transform(list, action)
		 */
		
		def tasks = Runner.run(Tasks)
		assert tasks.reult == [1, 'JDK 6'] as Set
	}

	static void main( String[] args) {
		//InvokerHelper.runScript(GSyntax, args)
		/**
		 * Example 1
		 def x = 1
		 assert x == 2
		 def x = [1,2,3,4,5]
		 assert (x << 6) == [6,7,8,9,10]
		 */


		/**
		 * Example 2
		 def service = [convert : {String key -> 'some text'}] as TranslationService
		 assert 'some text' == service.convert('key.text')
		 println service.convert('key.text')
		 */

		/**
		 * Example 3
		 def numbers = [1, 2, 3]
		 assert numbers instanceof List
		 assert numbers.size() == 2
		 */

		/**
		 * Example 4
		 def letters = ['a', 'b', 'c', 'd']
		 println letters[0]
		 println letters[-1]
		 letters << 'e'
		 println letters
		 */

		/**
		 * def colors = [red: '#FF0000', green: '#00FF00', blue: '#0000FF']
		 println colors['red']
		 println colors.green
		 */

		/**
		 * 
		 * def user = new User('Bob')
		 println user.@name  //only retrieve the direct field
		 */





		/**
		 def text = "some text to match"
		 def m = text =~ /match/
		 assert m instanceof Matcher
		 if(!m) {
		 throw new RuntimeException("Oops, text not found!")
		 }
		 */
	}
}


package nz.net.ultraq.groovy.tests

import nz.net.ultraq.groovy.FunctionalAliasesExtension

import spock.lang.Specification

/**
 * Spock unit tests for the {@link FunctionalAliasesExtension} class.
 * 
 * @author Juan Vazquez
 */
class FunctionalAliasesExtensionTests extends Specification {

	def 'test filter'() {
		expect:
		[1,2,3,4,5,6,7,8,9].filter { it % 2 == 0 } == [2,4,6,8]
		[1,2,3,4,5,6,7,8,9].filter { it > 2 } == [3,4,5,6,7,8,9]
		'Juan Vazquez'.toList().filter { it ==~ /[aeiou]/ } == ['u','a','a','u','e']
	}

	def 'test map'() {
		expect:
		[1,2,3,4].map {it * 2} == [1,2,3,4].collect { it * 2 }
	}

	def 'test reduce'() {
		expect:
		[1,2,3].reduce({ acc, val -> acc + val}) == [1,2,3].inject { acc, val -> acc + val }
	}
}

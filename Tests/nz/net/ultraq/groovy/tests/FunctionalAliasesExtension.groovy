/*
 * Copyright 2015, Emanuel Rabina (http://www.ultraq.net.nz/)
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package nz.net.ultraq.groovy.tests

import spock.lang.Specification

/**
 * Spock unit tests for the <tt>FunctionalAliasesExtension</tt> class.
 * 
 * @author Juan Vazquez
 */
class FunctionalAliasesExtension extends Specification {

	def 'test filter'() {
		expect:
		[1,2,3,4,5,6,7,8,9].filter { it % 2 == 0 } == [2,4,6,8]
		[1,2,3,4,5,6,7,8,9].filter { it > 2 } == [3,4,5,6,7,8,9]
		'Juan Vazquez'.toList().filter { it ==~ /[aeiou]/ } == ['u','a','a','u','e']
	}

	def 'test map'() {
		expect:
		[1 ,2 ,3 ,4].map {it * 2} == [1 ,2 ,3 ,4].collect { it * 2 }
	}

	def 'test reduce'() {
		expect:
		[1 ,2 ,3].reduce({ acc, val -> acc + val}) == [1 ,2 ,3].inject { acc, val -> acc + val }
	}
}

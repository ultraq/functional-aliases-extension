
package nz.net.ultraq.groovy

/**
 * Extends collection classes to alias filter/map/reduce to grep/collect/inject.
 * 
 * @author Juan Vazquez
 */
class FunctionalAliasesExtension {

	static Collection filter(Collection self, Closure closure) {
		return self.grep(closure)
	}

	static Collection map(Collection self, Closure closure) {
		return self.collect(closure)
	}

	static Object reduce(Collection self, Closure closure) {
		return self.inject(closure)
	}
}

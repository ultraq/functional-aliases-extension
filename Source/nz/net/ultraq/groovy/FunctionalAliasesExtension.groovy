
package nz.net.ultraq.groovy

/**
 * Extends collection classes to alias filter/map/reduce to grep/collect/inject.
 * 
 * @author Juan Vazquez
 */
public class FunctionalAliasesExtension {

	public static Collection filter(Collection self, Closure clozure) {
		return self.grep(clozure)
	}

	public static Collection map(Collection self, Closure clozure) {
		return self.collect(clozure)
	}

	public static Object reduce(Collection self, Closure clozure) {
		return self.inject(clozure)
	}
}

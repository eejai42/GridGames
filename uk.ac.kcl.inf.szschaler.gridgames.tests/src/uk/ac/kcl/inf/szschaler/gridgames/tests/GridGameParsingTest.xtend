/*
 * generated by Xtext 2.18.0.M3
 */
package uk.ac.kcl.inf.szschaler.gridgames.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import uk.ac.kcl.inf.szschaler.gridgames.gridGame.GridGame

@RunWith(XtextRunner)
@InjectWith(GridGameInjectorProvider)
class GridGameParsingTest {
	@Inject
	ParseHelper<GridGame> parseHelper
	
	@Test
	def void loadModel() {
		val result = parseHelper.parse('''
			Hello Xtext!
		''')
		Assert.assertNotNull(result)
		val errors = result.eResource.errors
		Assert.assertTrue('''Unexpected errors: «errors.join(", ")»''', errors.isEmpty)
	}
}

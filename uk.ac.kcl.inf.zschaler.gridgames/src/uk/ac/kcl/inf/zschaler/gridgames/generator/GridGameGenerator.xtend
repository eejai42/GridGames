/*
 * generated by Xtext
 */
package uk.ac.kcl.inf.zschaler.gridgames.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGame

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class GridGameGenerator implements IGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		val GridGame gg = resource.allContents.filter(typeof(GridGame)).head;
		new FieldGenerator (gg).generate(fsa);
		new CellGenerator (gg).generate (fsa);
	}

}

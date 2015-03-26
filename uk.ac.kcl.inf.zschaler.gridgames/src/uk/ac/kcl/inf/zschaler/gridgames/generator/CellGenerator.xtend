package uk.ac.kcl.inf.zschaler.gridgames.generator

import org.eclipse.xtext.generator.IFileSystemAccess
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellSpecification
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGame
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellDisplaySpec
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellVarSpec

/**
 * Generates all stuff to do with handling cells.
 */
class CellGenerator extends CommonGenerator {

	new(GridGame gg) {
		super(gg)
	}

	/**
	 * Basic generation routine.
	 */
	def generate(IFileSystemAccess fsa) {
		fsa.generateFile('''«generateCellClassFileName()»''', generateCellClass())
		gg.cells.forEach[c|fsa.generateFile('''«generateCellClassFileName(c)»''', generateCellClass(c))]
		fsa.generateFile('''«generateFactoryClassFileName»''', generateFactory)
	}

	/**
	 * Generate the basic cell class. 
	 */
	def generateCellClass() '''
		package «generateCellPackage»;
		
		import javax.swing.JButton;
		import javax.swing.JLabel;
		
		import java.awt.Component;
		
		public abstract class Cell {
			public abstract Component formatUIRepresentation(JButton jb, JLabel jl);
			
			«gg.cells.join(" ", [c | '''public boolean is«c.name.toFirstUpper»() { return false; }'''])»
		}
	'''

	/**
	 * Generate code for the specified cell specification
	 */
	def generateCellClass(CellSpecification c) '''
		package «generateCellPackage»;
		
		import javax.swing.JButton;
		import javax.swing.JLabel;
		
		import java.awt.Component;
		
		public class «c.generateCellClassName» extends Cell {
			«c.members.filter(CellVarSpec).join(" ", [v | '''private «v.type» «v.name.toFirstLower»Variable;'''])»
			
			public «c.generateCellClassName»(«c.members.filter(CellVarSpec).join(", ", [v | '''«v.type» «v.name.toFirstLower»'''])») {
				«c.members.filter(CellVarSpec).join("; ", [v | '''«v.name.toFirstLower»Variable = «v.name.toFirstLower»;'''])»
			}
			
			@Override
			public Component formatUIRepresentation(JButton jb, JLabel jl) {
				«if (c.members.exists[m | m instanceof CellDisplaySpec]) {
					val d = c.members.findFirst[m | m instanceof CellDisplaySpec] as CellDisplaySpec
					if (d.display_type.equals ("button")) {
						'''
						jb.setText («d.generateTextCalculation»);
						return jb;
						'''
					} else {
						'''
						jl.setText («d.generateTextCalculation»);
						return jl;
						'''
					}
				} else {
					'''return jb;'''
				}»
			}
			
			@Override
			public boolean is«c.name.toFirstUpper»() {
				return true;
			}
		}
	'''
	
	def generateTextCalculation(CellDisplaySpec cds) {
		if (cds.text != null) '''"«cds.text»"'''
		else '''"" + «cds.^var»Variable'''
	}
	
	def generateFactory() '''
		package «generateCellPackage»;
			
		public class CellFactory {
			«gg.cells.join (" ", [c | c.generateFactoryMethod])»
		}
	'''
	
	def generateFactoryMethod (CellSpecification cs) '''
		public Cell «cs.name.generateCellFactoryMethodName»(«cs.members.filter(CellVarSpec).join(", ", [v | '''«v.type» «v.name»'''])») {
			return new «cs.generateCellClassName»(«cs.members.filter(CellVarSpec).join(", ", [v | v.name])»);
		}
	'''
}
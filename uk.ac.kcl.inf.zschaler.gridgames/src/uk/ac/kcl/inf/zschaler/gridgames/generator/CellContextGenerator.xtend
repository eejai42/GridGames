package uk.ac.kcl.inf.zschaler.gridgames.generator

import uk.ac.kcl.inf.zschaler.gridgames.gridGame.ContextInitialisation
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.ContextTrigger
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.CountExpression
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.FilterExpression
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGame
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.NotEmptyExpression
import java.util.Set

class CellContextGenerator extends CommonGenerator {

	new(ModelPreprocessor mpp) {
		super(mpp)
	}

	public def generateCellContext() {
		if (gg.fields.exists[f|mpp.allInitialisations(f).exists[i|i.value instanceof ContextInitialisation]]) {
			// Generate helper functions for context initialisation
			'''
				private CellContext getContextAt (int x, int y) {
					return new CellContext(x, y);
				}
				
				private class CellContext implements Iterable<Cell> {
					private ArrayList<Cell> al = new ArrayList<> (8);
					
					public CellContext (int x, int y) {
						for (int dx = -1; dx <= 1; dx ++) {
							for (int dy = -1; dy <= 1; dy++) {
								if (((dx != 0) || (dy != 0)) && 
								    ((x + dx >= 0) && (x + dx < width)) &&
								    ((y + dy >= 0) && (y + dy < height)) &&
								    (field[x + dx][y + dy] != null)) {
									al.add (field[x + dx][y + dy]);
								}
							}
						}
					}
					
					public Iterator<Cell> iterator() {
						return al.iterator();
					}
					
					«// Slightly annoyingly have to convert the CharSequences into Strings here to make
 					 // sure the equality check in toSet works
					 gg.contextExpInvocations.map[e | e.generateImplementation.toString].toSet.join(" ")»
				}
			'''
		}
	}

	def getContextExpInvocations(GridGame gg) {
		var contextExpInvs = gg.fields.map [ f |
			mpp.allInitialisations(f).filter[p|p.value instanceof ContextInitialisation].map [ cip |
				val ci = cip.value as ContextInitialisation
				var checkExps = ci.check.sub_exp
				var valExps = ci.exp.sub_exp
				checkExps.toList.addAll(valExps)
				checkExps
			].flatten
		].flatten.toList

		contextExpInvs.addAll(mpp.allCellStates.map [ csp |
			csp.key.transitions.filter[t|t.trigger instanceof ContextTrigger].map [t |
				(t.trigger as ContextTrigger).exp.sub_exp
			].flatten
		].flatten)

		contextExpInvs
	}
	
	def dispatch generateImplementation(FilterExpression fe) '''
		public CellContext filter«fe.cell_type.name.toFirstUpper»() {
			ArrayList<Cell> newAL = new ArrayList<>();
			
			for (Cell c : al) {
				if (c.is«fe.cell_type.name.toFirstUpper»()) {
					newAL.add (c);
				}
			}
			
			al = newAL;
			return this;
		}
	'''

	def dispatch generateImplementation(NotEmptyExpression nee) '''
		public boolean notEmpty() {
			return al.size() > 0;
		}
	'''

	def dispatch generateImplementation(CountExpression ce) '''
		public int size() {
			return al.size();
		}
	'''
	
	/**
	 * Add required imports to the set given
	 */
	def addImports(Set<String> imports) {
		if (gg.fields.exists[f|mpp.allInitialisations(f).exists[i|i.value instanceof ContextInitialisation]]) {
			imports.add("java.util.List")
			imports.add("java.util.ArrayList")
			imports.add("java.util.Iterator")
		}
	}
	
}
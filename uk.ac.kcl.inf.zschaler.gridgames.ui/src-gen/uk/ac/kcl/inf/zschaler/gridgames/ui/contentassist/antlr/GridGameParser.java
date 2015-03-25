/*
 * generated by Xtext
 */
package uk.ac.kcl.inf.zschaler.gridgames.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import uk.ac.kcl.inf.zschaler.gridgames.services.GridGameGrammarAccess;

public class GridGameParser extends AbstractContentAssistParser {
	
	@Inject
	private GridGameGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected uk.ac.kcl.inf.zschaler.gridgames.ui.contentassist.antlr.internal.InternalGridGameParser createParser() {
		uk.ac.kcl.inf.zschaler.gridgames.ui.contentassist.antlr.internal.InternalGridGameParser result = new uk.ac.kcl.inf.zschaler.gridgames.ui.contentassist.antlr.internal.InternalGridGameParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getCellDisplaySpecAccess().getDisplay_typeAlternatives_3_0(), "rule__CellDisplaySpec__Display_typeAlternatives_3_0");
					put(grammarAccess.getOptionSpecificationAccess().getAlternatives(), "rule__OptionSpecification__Alternatives");
					put(grammarAccess.getFieldInitialisationAccess().getAlternatives(), "rule__FieldInitialisation__Alternatives");
					put(grammarAccess.getGridGameAccess().getGroup(), "rule__GridGame__Group__0");
					put(grammarAccess.getCellSpecificationAccess().getGroup(), "rule__CellSpecification__Group__0");
					put(grammarAccess.getCellDisplaySpecAccess().getGroup(), "rule__CellDisplaySpec__Group__0");
					put(grammarAccess.getFieldSpecificationAccess().getGroup(), "rule__FieldSpecification__Group__0");
					put(grammarAccess.getAllowRestartMenuAccess().getGroup(), "rule__AllowRestartMenu__Group__0");
					put(grammarAccess.getStartFieldDeclarationAccess().getGroup(), "rule__StartFieldDeclaration__Group__0");
					put(grammarAccess.getFieldInitialisationsAccess().getGroup(), "rule__FieldInitialisations__Group__0");
					put(grammarAccess.getDefaultInitialisationAccess().getGroup(), "rule__DefaultInitialisation__Group__0");
					put(grammarAccess.getRandomInitialisationAccess().getGroup(), "rule__RandomInitialisation__Group__0");
					put(grammarAccess.getGridGameAccess().getNameAssignment_1(), "rule__GridGame__NameAssignment_1");
					put(grammarAccess.getGridGameAccess().getCellsAssignment_3(), "rule__GridGame__CellsAssignment_3");
					put(grammarAccess.getGridGameAccess().getFieldsAssignment_4(), "rule__GridGame__FieldsAssignment_4");
					put(grammarAccess.getGridGameAccess().getOptionsAssignment_5(), "rule__GridGame__OptionsAssignment_5");
					put(grammarAccess.getCellSpecificationAccess().getNameAssignment_1(), "rule__CellSpecification__NameAssignment_1");
					put(grammarAccess.getCellSpecificationAccess().getMembersAssignment_3(), "rule__CellSpecification__MembersAssignment_3");
					put(grammarAccess.getCellDisplaySpecAccess().getDisplay_typeAssignment_3(), "rule__CellDisplaySpec__Display_typeAssignment_3");
					put(grammarAccess.getCellDisplaySpecAccess().getTextAssignment_5(), "rule__CellDisplaySpec__TextAssignment_5");
					put(grammarAccess.getFieldSpecificationAccess().getNameAssignment_1(), "rule__FieldSpecification__NameAssignment_1");
					put(grammarAccess.getFieldSpecificationAccess().getWidthAssignment_5(), "rule__FieldSpecification__WidthAssignment_5");
					put(grammarAccess.getFieldSpecificationAccess().getHeightAssignment_8(), "rule__FieldSpecification__HeightAssignment_8");
					put(grammarAccess.getFieldSpecificationAccess().getField_initialisationAssignment_9(), "rule__FieldSpecification__Field_initialisationAssignment_9");
					put(grammarAccess.getStartFieldDeclarationAccess().getField_nameAssignment_2(), "rule__StartFieldDeclaration__Field_nameAssignment_2");
					put(grammarAccess.getFieldInitialisationsAccess().getInitialisationsAssignment_1(), "rule__FieldInitialisations__InitialisationsAssignment_1");
					put(grammarAccess.getDefaultInitialisationAccess().getCellAssignment_2(), "rule__DefaultInitialisation__CellAssignment_2");
					put(grammarAccess.getRandomInitialisationAccess().getCellAssignment_2(), "rule__RandomInitialisation__CellAssignment_2");
					put(grammarAccess.getRandomInitialisationAccess().getCountAssignment_4(), "rule__RandomInitialisation__CountAssignment_4");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			uk.ac.kcl.inf.zschaler.gridgames.ui.contentassist.antlr.internal.InternalGridGameParser typedParser = (uk.ac.kcl.inf.zschaler.gridgames.ui.contentassist.antlr.internal.InternalGridGameParser) parser;
			typedParser.entryRuleGridGame();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public GridGameGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(GridGameGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}

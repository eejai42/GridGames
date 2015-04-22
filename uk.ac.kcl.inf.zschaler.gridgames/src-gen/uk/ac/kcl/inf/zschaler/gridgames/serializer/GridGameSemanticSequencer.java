/*
 * generated by Xtext
 */
package uk.ac.kcl.inf.zschaler.gridgames.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.AllowRestartMenu;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.BehaviourReference;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellDisplaySpec;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellSpecification;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellState;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellStateSpecReference;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.CellVarSpec;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.ContextExpression;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.ContextInitialisation;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.ContextTrigger;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.CountExpression;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.DefaultInitialisation;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.EndGameBehaviour;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.FieldInitialisationsRef;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.FieldSpecification;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.FilterExpression;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.GenerationalContexts;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.GlobalCellStateSpec;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.GlobalFieldInitialisation;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGame;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.GridGamePackage;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.IntValue;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.LocalCellStateSpec;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.LocalFieldInitialisations;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.MouseTrigger;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.NoOpBehaviour;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.NotEmptyExpression;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.ParamSpec;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.RandomInitialisation;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.StartFieldDeclaration;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.StateFilterExpression;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.StringValue;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.TransitionSpec;
import uk.ac.kcl.inf.zschaler.gridgames.gridGame.VarRefValue;
import uk.ac.kcl.inf.zschaler.gridgames.services.GridGameGrammarAccess;

@SuppressWarnings("all")
public class GridGameSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private GridGameGrammarAccess grammarAccess;
	
	@Override
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == GridGamePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case GridGamePackage.ALLOW_RESTART_MENU:
				sequence_AllowRestartMenu(context, (AllowRestartMenu) semanticObject); 
				return; 
			case GridGamePackage.BEHAVIOUR_REFERENCE:
				sequence_BehaviourReference(context, (BehaviourReference) semanticObject); 
				return; 
			case GridGamePackage.CELL_DISPLAY_SPEC:
				sequence_CellDisplaySpec(context, (CellDisplaySpec) semanticObject); 
				return; 
			case GridGamePackage.CELL_SPECIFICATION:
				sequence_CellSpecification(context, (CellSpecification) semanticObject); 
				return; 
			case GridGamePackage.CELL_STATE:
				sequence_CellState(context, (CellState) semanticObject); 
				return; 
			case GridGamePackage.CELL_STATE_SPEC_REFERENCE:
				sequence_CellStateSpecReference(context, (CellStateSpecReference) semanticObject); 
				return; 
			case GridGamePackage.CELL_VAR_SPEC:
				sequence_CellVarSpec(context, (CellVarSpec) semanticObject); 
				return; 
			case GridGamePackage.CONTEXT_EXPRESSION:
				sequence_ContextExpression(context, (ContextExpression) semanticObject); 
				return; 
			case GridGamePackage.CONTEXT_INITIALISATION:
				sequence_ContextInitialisation(context, (ContextInitialisation) semanticObject); 
				return; 
			case GridGamePackage.CONTEXT_TRIGGER:
				sequence_ContextTrigger(context, (ContextTrigger) semanticObject); 
				return; 
			case GridGamePackage.COUNT_EXPRESSION:
				sequence_CountExpression(context, (CountExpression) semanticObject); 
				return; 
			case GridGamePackage.DEFAULT_INITIALISATION:
				sequence_DefaultInitialisation(context, (DefaultInitialisation) semanticObject); 
				return; 
			case GridGamePackage.END_GAME_BEHAVIOUR:
				sequence_EndGameBehaviour(context, (EndGameBehaviour) semanticObject); 
				return; 
			case GridGamePackage.FIELD_INITIALISATIONS_REF:
				sequence_FieldInitialisationsRef(context, (FieldInitialisationsRef) semanticObject); 
				return; 
			case GridGamePackage.FIELD_SPECIFICATION:
				sequence_FieldSpecification(context, (FieldSpecification) semanticObject); 
				return; 
			case GridGamePackage.FILTER_EXPRESSION:
				sequence_FilterExpression(context, (FilterExpression) semanticObject); 
				return; 
			case GridGamePackage.GENERATIONAL_CONTEXTS:
				sequence_GenerationalContexts(context, (GenerationalContexts) semanticObject); 
				return; 
			case GridGamePackage.GLOBAL_CELL_STATE_SPEC:
				sequence_GlobalCellStateSpec(context, (GlobalCellStateSpec) semanticObject); 
				return; 
			case GridGamePackage.GLOBAL_FIELD_INITIALISATION:
				sequence_GlobalFieldInitialisation(context, (GlobalFieldInitialisation) semanticObject); 
				return; 
			case GridGamePackage.GRID_GAME:
				sequence_GridGame(context, (GridGame) semanticObject); 
				return; 
			case GridGamePackage.INT_VALUE:
				sequence_IntValue(context, (IntValue) semanticObject); 
				return; 
			case GridGamePackage.LOCAL_CELL_STATE_SPEC:
				sequence_LocalCellStateSpec(context, (LocalCellStateSpec) semanticObject); 
				return; 
			case GridGamePackage.LOCAL_FIELD_INITIALISATIONS:
				sequence_LocalFieldInitialisations(context, (LocalFieldInitialisations) semanticObject); 
				return; 
			case GridGamePackage.MOUSE_TRIGGER:
				sequence_MouseTrigger(context, (MouseTrigger) semanticObject); 
				return; 
			case GridGamePackage.NO_OP_BEHAVIOUR:
				sequence_DirectBehaviour(context, (NoOpBehaviour) semanticObject); 
				return; 
			case GridGamePackage.NOT_EMPTY_EXPRESSION:
				sequence_NotEmptyExpression(context, (NotEmptyExpression) semanticObject); 
				return; 
			case GridGamePackage.PARAM_SPEC:
				sequence_ParamSpec(context, (ParamSpec) semanticObject); 
				return; 
			case GridGamePackage.RANDOM_INITIALISATION:
				sequence_RandomInitialisation(context, (RandomInitialisation) semanticObject); 
				return; 
			case GridGamePackage.START_FIELD_DECLARATION:
				sequence_StartFieldDeclaration(context, (StartFieldDeclaration) semanticObject); 
				return; 
			case GridGamePackage.STATE_FILTER_EXPRESSION:
				sequence_StateFilterExpression(context, (StateFilterExpression) semanticObject); 
				return; 
			case GridGamePackage.STRING_VALUE:
				sequence_StringValue(context, (StringValue) semanticObject); 
				return; 
			case GridGamePackage.TRANSITION_SPEC:
				sequence_TransitionSpec(context, (TransitionSpec) semanticObject); 
				return; 
			case GridGamePackage.VAR_REF_VALUE:
				sequence_VarRefValue(context, (VarRefValue) semanticObject); 
				return; 
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     {AllowRestartMenu}
	 */
	protected void sequence_AllowRestartMenu(EObject context, AllowRestartMenu semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ref=[VarSpec|ID]
	 */
	protected void sequence_BehaviourReference(EObject context, BehaviourReference semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GridGamePackage.Literals.BEHAVIOUR_REFERENCE__REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GridGamePackage.Literals.BEHAVIOUR_REFERENCE__REF));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBehaviourReferenceAccess().getRefVarSpecIDTerminalRuleCall_0_1(), semanticObject.getRef());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (display_type='label' | display_type='button') 
	 *         (
	 *             text=STRING | 
	 *             var=[VarSpec|ID] | 
	 *             color='black' | 
	 *             color='white' | 
	 *             color='yellow' | 
	 *             color='red' | 
	 *             color='green'
	 *         )
	 *     )
	 */
	protected void sequence_CellDisplaySpec(EObject context, CellDisplaySpec semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID members+=CellMember*)
	 */
	protected void sequence_CellSpecification(EObject context, CellSpecification semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (stateSpec=[GlobalCellStateSpec|ID] (params+=Value params+=Value*)?)
	 */
	protected void sequence_CellStateSpecReference(EObject context, CellStateSpecReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID display=CellDisplaySpec transitions+=TransitionSpec* (onEnter+=CellStateBehaviour onEnter+=CellStateBehaviour*)?)
	 */
	protected void sequence_CellState(EObject context, CellState semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((type='int' | type='String') name=ID)
	 */
	protected void sequence_CellVarSpec(EObject context, CellVarSpec semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (sub_exp+=AtomicExpression sub_exp+=AtomicExpression*)
	 */
	protected void sequence_ContextExpression(EObject context, ContextExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (cell=[CellSpecification|ID] check=ContextExpression exp=ContextExpression)
	 */
	protected void sequence_ContextInitialisation(EObject context, ContextInitialisation semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GridGamePackage.Literals.FIELD_INITIALISATION__CELL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GridGamePackage.Literals.FIELD_INITIALISATION__CELL));
			if(transientValues.isValueTransient(semanticObject, GridGamePackage.Literals.CONTEXT_INITIALISATION__CHECK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GridGamePackage.Literals.CONTEXT_INITIALISATION__CHECK));
			if(transientValues.isValueTransient(semanticObject, GridGamePackage.Literals.CONTEXT_INITIALISATION__EXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GridGamePackage.Literals.CONTEXT_INITIALISATION__EXP));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getContextInitialisationAccess().getCellCellSpecificationIDTerminalRuleCall_2_0_1(), semanticObject.getCell());
		feeder.accept(grammarAccess.getContextInitialisationAccess().getCheckContextExpressionParserRuleCall_4_0(), semanticObject.getCheck());
		feeder.accept(grammarAccess.getContextInitialisationAccess().getExpContextExpressionParserRuleCall_7_0(), semanticObject.getExp());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     exp=ContextExpression
	 */
	protected void sequence_ContextTrigger(EObject context, ContextTrigger semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GridGamePackage.Literals.CONTEXT_TRIGGER__EXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GridGamePackage.Literals.CONTEXT_TRIGGER__EXP));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getContextTriggerAccess().getExpContextExpressionParserRuleCall_2_0(), semanticObject.getExp());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (((op='==' | op='>' | op='<') cmpVal=INT)?)
	 */
	protected void sequence_CountExpression(EObject context, CountExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     cell=[CellSpecification|ID]
	 */
	protected void sequence_DefaultInitialisation(EObject context, DefaultInitialisation semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GridGamePackage.Literals.FIELD_INITIALISATION__CELL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GridGamePackage.Literals.FIELD_INITIALISATION__CELL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDefaultInitialisationAccess().getCellCellSpecificationIDTerminalRuleCall_2_0_1(), semanticObject.getCell());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {NoOpBehaviour}
	 */
	protected void sequence_DirectBehaviour(EObject context, NoOpBehaviour semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     message=STRING
	 */
	protected void sequence_EndGameBehaviour(EObject context, EndGameBehaviour semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GridGamePackage.Literals.END_GAME_BEHAVIOUR__MESSAGE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GridGamePackage.Literals.END_GAME_BEHAVIOUR__MESSAGE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEndGameBehaviourAccess().getMessageSTRINGTerminalRuleCall_2_0(), semanticObject.getMessage());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (ref=[GlobalFieldInitialisation|ID] (params+=Value params+=Value*)?)
	 */
	protected void sequence_FieldInitialisationsRef(EObject context, FieldInitialisationsRef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID width=INT height=INT field_initialisation=FieldInitialisations?)
	 */
	protected void sequence_FieldSpecification(EObject context, FieldSpecification semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     cell_type=[CellSpecification|ID]
	 */
	protected void sequence_FilterExpression(EObject context, FilterExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GridGamePackage.Literals.FILTER_EXPRESSION__CELL_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GridGamePackage.Literals.FILTER_EXPRESSION__CELL_TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFilterExpressionAccess().getCell_typeCellSpecificationIDTerminalRuleCall_2_0_1(), semanticObject.getCell_type());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {GenerationalContexts}
	 */
	protected void sequence_GenerationalContexts(EObject context, GenerationalContexts semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (params+=ParamSpec params+=ParamSpec*)? states+=CellState+ start=[CellState|ID])
	 */
	protected void sequence_GlobalCellStateSpec(EObject context, GlobalCellStateSpec semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (params+=ParamSpec params+=ParamSpec*)? initialisations+=FieldInitialisation+)
	 */
	protected void sequence_GlobalFieldInitialisation(EObject context, GlobalFieldInitialisation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (states+=GlobalCellStateSpec | cells+=CellSpecification | inits+=GlobalFieldInitialisation | fields+=FieldSpecification | options+=OptionSpecification)+
	 *     )
	 */
	protected void sequence_GridGame(EObject context, GridGame semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_IntValue(EObject context, IntValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GridGamePackage.Literals.INT_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GridGamePackage.Literals.INT_VALUE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (states+=CellState+ start=[CellState|ID])
	 */
	protected void sequence_LocalCellStateSpec(EObject context, LocalCellStateSpec semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     initialisations+=FieldInitialisation+
	 */
	protected void sequence_LocalFieldInitialisations(EObject context, LocalFieldInitialisations semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {MouseTrigger}
	 */
	protected void sequence_MouseTrigger(EObject context, MouseTrigger semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {NotEmptyExpression}
	 */
	protected void sequence_NotEmptyExpression(EObject context, NotEmptyExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((type='int' | type='String' | type='Behaviour') name=ID)
	 */
	protected void sequence_ParamSpec(EObject context, ParamSpec semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (cell=[CellSpecification|ID] (count=INT | var=[VarSpec|ID]))
	 */
	protected void sequence_RandomInitialisation(EObject context, RandomInitialisation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     field=[FieldSpecification|ID]
	 */
	protected void sequence_StartFieldDeclaration(EObject context, StartFieldDeclaration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GridGamePackage.Literals.START_FIELD_DECLARATION__FIELD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GridGamePackage.Literals.START_FIELD_DECLARATION__FIELD));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStartFieldDeclarationAccess().getFieldFieldSpecificationIDTerminalRuleCall_2_0_1(), semanticObject.getField());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     cell_state=[CellState|ID]
	 */
	protected void sequence_StateFilterExpression(EObject context, StateFilterExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GridGamePackage.Literals.STATE_FILTER_EXPRESSION__CELL_STATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GridGamePackage.Literals.STATE_FILTER_EXPRESSION__CELL_STATE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStateFilterExpressionAccess().getCell_stateCellStateIDTerminalRuleCall_2_0_1(), semanticObject.getCell_state());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_StringValue(EObject context, StringValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GridGamePackage.Literals.STRING_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GridGamePackage.Literals.STRING_VALUE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (trigger=TransitionTriggerSpec target=[CellState|ID])
	 */
	protected void sequence_TransitionSpec(EObject context, TransitionSpec semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GridGamePackage.Literals.TRANSITION_SPEC__TRIGGER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GridGamePackage.Literals.TRANSITION_SPEC__TRIGGER));
			if(transientValues.isValueTransient(semanticObject, GridGamePackage.Literals.TRANSITION_SPEC__TARGET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GridGamePackage.Literals.TRANSITION_SPEC__TARGET));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTransitionSpecAccess().getTriggerTransitionTriggerSpecParserRuleCall_1_0(), semanticObject.getTrigger());
		feeder.accept(grammarAccess.getTransitionSpecAccess().getTargetCellStateIDTerminalRuleCall_3_0_1(), semanticObject.getTarget());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ref=[CellVarSpec|ID]
	 */
	protected void sequence_VarRefValue(EObject context, VarRefValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GridGamePackage.Literals.VAR_REF_VALUE__REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GridGamePackage.Literals.VAR_REF_VALUE__REF));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVarRefValueAccess().getRefCellVarSpecIDTerminalRuleCall_0_1(), semanticObject.getRef());
		feeder.finish();
	}
}

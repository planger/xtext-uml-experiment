/*
 * generated by Xtext 2.10.0
 */
grammar InternalUMLText;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.eclipse.papyrusrt.uml.umltext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.eclipse.papyrusrt.uml.umltext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.papyrusrt.uml.umltext.services.UMLTextGrammarAccess;

}

@parser::members {

 	private UMLTextGrammarAccess grammarAccess;

    public InternalUMLTextParser(TokenStream input, UMLTextGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Model";
   	}

   	@Override
   	protected UMLTextGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='model'
		{
			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getModelKeyword_0());
		}
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getModelAccess().getModelAction_1(),
					$current);
			}
		)
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getModelAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getModelRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getPackagedElementPackageParserRuleCall_4_0());
				}
				lv_packagedElement_4_0=rulePackage
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					add(
						$current,
						"packagedElement",
						lv_packagedElement_4_0,
						"org.eclipse.papyrusrt.uml.umltext.UMLText.Package");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_5='}'
		{
			newLeafNode(otherlv_5, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRulePackage
entryRulePackage returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPackageRule()); }
	iv_rulePackage=rulePackage
	{ $current=$iv_rulePackage.current; }
	EOF;

// Rule Package
rulePackage returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='package'
		{
			newLeafNode(otherlv_0, grammarAccess.getPackageAccess().getPackageKeyword_0());
		}
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getPackageAccess().getPackageAction_1(),
					$current);
			}
		)
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getPackageAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPackageRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPackageAccess().getPackagedElementClassParserRuleCall_4_0());
				}
				lv_packagedElement_4_0=ruleClass
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPackageRule());
					}
					add(
						$current,
						"packagedElement",
						lv_packagedElement_4_0,
						"org.eclipse.papyrusrt.uml.umltext.UMLText.Class");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_5='}'
		{
			newLeafNode(otherlv_5, grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleClass
entryRuleClass returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getClassRule()); }
	iv_ruleClass=ruleClass
	{ $current=$iv_ruleClass.current; }
	EOF;

// Rule Class
ruleClass returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='class'
		{
			newLeafNode(otherlv_0, grammarAccess.getClassAccess().getClassKeyword_0());
		}
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getClassAccess().getClassAction_1(),
					$current);
			}
		)
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getClassAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getClassRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_3=';'
		{
			newLeafNode(otherlv_3, grammarAccess.getClassAccess().getSemicolonKeyword_3());
		}
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;

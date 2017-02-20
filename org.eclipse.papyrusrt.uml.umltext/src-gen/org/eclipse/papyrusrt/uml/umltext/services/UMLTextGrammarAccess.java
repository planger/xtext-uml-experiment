/*
 * generated by Xtext 2.10.0
 */
package org.eclipse.papyrusrt.uml.umltext.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class UMLTextGrammarAccess extends AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.papyrusrt.uml.umltext.UMLText.Model");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cModelKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Action cModelAction_1 = (Action)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cPackagedElementAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cPackagedElementPackageParserRuleCall_4_0 = (RuleCall)cPackagedElementAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//// generate uMLText "http://www.eclipse.org/papyrusrt/uml/umltext/UMLText"
		//Model uml::Model:
		//	'model' {uml::Model} name=ID '{'
		//	packagedElement+=Package*
		//	'}'
		@Override public ParserRule getRule() { return rule; }
		
		//'model' {uml::Model} name=ID '{' packagedElement+=Package* '}'
		public Group getGroup() { return cGroup; }
		
		//'model'
		public Keyword getModelKeyword_0() { return cModelKeyword_0; }
		
		//{uml::Model}
		public Action getModelAction_1() { return cModelAction_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//packagedElement+=Package*
		public Assignment getPackagedElementAssignment_4() { return cPackagedElementAssignment_4; }
		
		//Package
		public RuleCall getPackagedElementPackageParserRuleCall_4_0() { return cPackagedElementPackageParserRuleCall_4_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class PackageElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.papyrusrt.uml.umltext.UMLText.Package");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPackageKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Action cPackageAction_1 = (Action)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cPackagedElementAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cPackagedElementPackagedElementParserRuleCall_4_0 = (RuleCall)cPackagedElementAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Package uml::Package:
		//	'package' {uml::Package} name=ID '{'
		//	packagedElement+=PackagedElement*
		//	'}'
		@Override public ParserRule getRule() { return rule; }
		
		//'package' {uml::Package} name=ID '{' packagedElement+=PackagedElement* '}'
		public Group getGroup() { return cGroup; }
		
		//'package'
		public Keyword getPackageKeyword_0() { return cPackageKeyword_0; }
		
		//{uml::Package}
		public Action getPackageAction_1() { return cPackageAction_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//packagedElement+=PackagedElement*
		public Assignment getPackagedElementAssignment_4() { return cPackagedElementAssignment_4; }
		
		//PackagedElement
		public RuleCall getPackagedElementPackagedElementParserRuleCall_4_0() { return cPackagedElementPackagedElementParserRuleCall_4_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class PackagedElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.papyrusrt.uml.umltext.UMLText.PackagedElement");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cPackageParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cClassParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//PackagedElement uml::PackageableElement:
		//	Package | Class
		@Override public ParserRule getRule() { return rule; }
		
		//Package | Class
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Package
		public RuleCall getPackageParserRuleCall_0() { return cPackageParserRuleCall_0; }
		
		//Class
		public RuleCall getClassParserRuleCall_1() { return cClassParserRuleCall_1; }
	}
	public class ClassElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.papyrusrt.uml.umltext.UMLText.Class");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cClassKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Action cClassAction_1 = (Action)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cSuperKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cSuperClassAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final CrossReference cSuperClassClassCrossReference_3_1_0 = (CrossReference)cSuperClassAssignment_3_1.eContents().get(0);
		private final RuleCall cSuperClassClassQualifiedNameParserRuleCall_3_1_0_1 = (RuleCall)cSuperClassClassCrossReference_3_1_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cOwnedAttributeAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cOwnedAttributePropertyParserRuleCall_5_0 = (RuleCall)cOwnedAttributeAssignment_5.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//Class uml::Class:
		//	'class' {uml::Class} name=ID ('super' superClass+=[uml::Class|QualifiedName])? '{'
		//	ownedAttribute+=Property*
		//	'}'
		@Override public ParserRule getRule() { return rule; }
		
		//'class' {uml::Class} name=ID ('super' superClass+=[uml::Class|QualifiedName])? '{' ownedAttribute+=Property* '}'
		public Group getGroup() { return cGroup; }
		
		//'class'
		public Keyword getClassKeyword_0() { return cClassKeyword_0; }
		
		//{uml::Class}
		public Action getClassAction_1() { return cClassAction_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//('super' superClass+=[uml::Class|QualifiedName])?
		public Group getGroup_3() { return cGroup_3; }
		
		//'super'
		public Keyword getSuperKeyword_3_0() { return cSuperKeyword_3_0; }
		
		//superClass+=[uml::Class|QualifiedName]
		public Assignment getSuperClassAssignment_3_1() { return cSuperClassAssignment_3_1; }
		
		//[uml::Class|QualifiedName]
		public CrossReference getSuperClassClassCrossReference_3_1_0() { return cSuperClassClassCrossReference_3_1_0; }
		
		//QualifiedName
		public RuleCall getSuperClassClassQualifiedNameParserRuleCall_3_1_0_1() { return cSuperClassClassQualifiedNameParserRuleCall_3_1_0_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_4() { return cLeftCurlyBracketKeyword_4; }
		
		//ownedAttribute+=Property*
		public Assignment getOwnedAttributeAssignment_5() { return cOwnedAttributeAssignment_5; }
		
		//Property
		public RuleCall getOwnedAttributePropertyParserRuleCall_5_0() { return cOwnedAttributePropertyParserRuleCall_5_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}
	public class PropertyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.papyrusrt.uml.umltext.UMLText.Property");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPropertyKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Action cPropertyAction_1 = (Action)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cColonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cTypeAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cTypeTypeCrossReference_4_0 = (CrossReference)cTypeAssignment_4.eContents().get(0);
		private final RuleCall cTypeTypeQualifiedNameParserRuleCall_4_0_1 = (RuleCall)cTypeTypeCrossReference_4_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Property uml::Property:
		//	'property' {uml::Property} name=ID ':' type=[uml::Type|QualifiedName] ';'
		@Override public ParserRule getRule() { return rule; }
		
		//'property' {uml::Property} name=ID ':' type=[uml::Type|QualifiedName] ';'
		public Group getGroup() { return cGroup; }
		
		//'property'
		public Keyword getPropertyKeyword_0() { return cPropertyKeyword_0; }
		
		//{uml::Property}
		public Action getPropertyAction_1() { return cPropertyAction_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//':'
		public Keyword getColonKeyword_3() { return cColonKeyword_3; }
		
		//type=[uml::Type|QualifiedName]
		public Assignment getTypeAssignment_4() { return cTypeAssignment_4; }
		
		//[uml::Type|QualifiedName]
		public CrossReference getTypeTypeCrossReference_4_0() { return cTypeTypeCrossReference_4_0; }
		
		//QualifiedName
		public RuleCall getTypeTypeQualifiedNameParserRuleCall_4_0_1() { return cTypeTypeQualifiedNameParserRuleCall_4_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
	}
	public class QualifiedNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.papyrusrt.uml.umltext.UMLText.QualifiedName");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cValidIDParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cValidIDParserRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//QualifiedName:
		//	ValidID ('.' ValidID)*;
		@Override public ParserRule getRule() { return rule; }
		
		//ValidID ('.' ValidID)*
		public Group getGroup() { return cGroup; }
		
		//ValidID
		public RuleCall getValidIDParserRuleCall_0() { return cValidIDParserRuleCall_0; }
		
		//('.' ValidID)*
		public Group getGroup_1() { return cGroup_1; }
		
		//'.'
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }
		
		//ValidID
		public RuleCall getValidIDParserRuleCall_1_1() { return cValidIDParserRuleCall_1_1; }
	}
	public class ValidIDElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.papyrusrt.uml.umltext.UMLText.ValidID");
		private final RuleCall cIDTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//ValidID:
		//	ID;
		@Override public ParserRule getRule() { return rule; }
		
		//ID
		public RuleCall getIDTerminalRuleCall() { return cIDTerminalRuleCall; }
	}
	
	
	private final ModelElements pModel;
	private final PackageElements pPackage;
	private final PackagedElementElements pPackagedElement;
	private final ClassElements pClass;
	private final PropertyElements pProperty;
	private final QualifiedNameElements pQualifiedName;
	private final ValidIDElements pValidID;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public UMLTextGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pPackage = new PackageElements();
		this.pPackagedElement = new PackagedElementElements();
		this.pClass = new ClassElements();
		this.pProperty = new PropertyElements();
		this.pQualifiedName = new QualifiedNameElements();
		this.pValidID = new ValidIDElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.papyrusrt.uml.umltext.UMLText".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//// generate uMLText "http://www.eclipse.org/papyrusrt/uml/umltext/UMLText"
	//Model uml::Model:
	//	'model' {uml::Model} name=ID '{'
	//	packagedElement+=Package*
	//	'}'
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//Package uml::Package:
	//	'package' {uml::Package} name=ID '{'
	//	packagedElement+=PackagedElement*
	//	'}'
	public PackageElements getPackageAccess() {
		return pPackage;
	}
	
	public ParserRule getPackageRule() {
		return getPackageAccess().getRule();
	}
	
	//PackagedElement uml::PackageableElement:
	//	Package | Class
	public PackagedElementElements getPackagedElementAccess() {
		return pPackagedElement;
	}
	
	public ParserRule getPackagedElementRule() {
		return getPackagedElementAccess().getRule();
	}
	
	//Class uml::Class:
	//	'class' {uml::Class} name=ID ('super' superClass+=[uml::Class|QualifiedName])? '{'
	//	ownedAttribute+=Property*
	//	'}'
	public ClassElements getClassAccess() {
		return pClass;
	}
	
	public ParserRule getClassRule() {
		return getClassAccess().getRule();
	}
	
	//Property uml::Property:
	//	'property' {uml::Property} name=ID ':' type=[uml::Type|QualifiedName] ';'
	public PropertyElements getPropertyAccess() {
		return pProperty;
	}
	
	public ParserRule getPropertyRule() {
		return getPropertyAccess().getRule();
	}
	
	//QualifiedName:
	//	ValidID ('.' ValidID)*;
	public QualifiedNameElements getQualifiedNameAccess() {
		return pQualifiedName;
	}
	
	public ParserRule getQualifiedNameRule() {
		return getQualifiedNameAccess().getRule();
	}
	
	//ValidID:
	//	ID;
	public ValidIDElements getValidIDAccess() {
		return pValidID;
	}
	
	public ParserRule getValidIDRule() {
		return getValidIDAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/ *'->'* /';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}

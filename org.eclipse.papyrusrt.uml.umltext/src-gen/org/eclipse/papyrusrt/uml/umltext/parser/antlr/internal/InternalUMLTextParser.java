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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalUMLTextParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'model'", "'{'", "'}'", "'package'", "'class'", "'super'", "'property'", "':'", "';'", "'.'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;

    // delegates
    // delegators


        public InternalUMLTextParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalUMLTextParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalUMLTextParser.tokenNames; }
    public String getGrammarFileName() { return "InternalUMLText.g"; }



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




    // $ANTLR start "entryRuleModel"
    // InternalUMLText.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalUMLText.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalUMLText.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalUMLText.g:71:1: ruleModel returns [EObject current=null] : (otherlv_0= 'model' () ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_packagedElement_4_0= rulePackage ) )* otherlv_5= '}' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_packagedElement_4_0 = null;



        	enterRule();

        try {
            // InternalUMLText.g:77:2: ( (otherlv_0= 'model' () ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_packagedElement_4_0= rulePackage ) )* otherlv_5= '}' ) )
            // InternalUMLText.g:78:2: (otherlv_0= 'model' () ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_packagedElement_4_0= rulePackage ) )* otherlv_5= '}' )
            {
            // InternalUMLText.g:78:2: (otherlv_0= 'model' () ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_packagedElement_4_0= rulePackage ) )* otherlv_5= '}' )
            // InternalUMLText.g:79:3: otherlv_0= 'model' () ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_packagedElement_4_0= rulePackage ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getModelKeyword_0());
            		
            // InternalUMLText.g:83:3: ()
            // InternalUMLText.g:84:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getModelAccess().getModelAction_1(),
            					current);
            			

            }

            // InternalUMLText.g:90:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalUMLText.g:91:4: (lv_name_2_0= RULE_ID )
            {
            // InternalUMLText.g:91:4: (lv_name_2_0= RULE_ID )
            // InternalUMLText.g:92:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_2_0, grammarAccess.getModelAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalUMLText.g:112:3: ( (lv_packagedElement_4_0= rulePackage ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalUMLText.g:113:4: (lv_packagedElement_4_0= rulePackage )
            	    {
            	    // InternalUMLText.g:113:4: (lv_packagedElement_4_0= rulePackage )
            	    // InternalUMLText.g:114:5: lv_packagedElement_4_0= rulePackage
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getPackagedElementPackageParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_packagedElement_4_0=rulePackage();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"packagedElement",
            	    						lv_packagedElement_4_0,
            	    						"org.eclipse.papyrusrt.uml.umltext.UMLText.Package");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRulePackage"
    // InternalUMLText.g:139:1: entryRulePackage returns [EObject current=null] : iv_rulePackage= rulePackage EOF ;
    public final EObject entryRulePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage = null;


        try {
            // InternalUMLText.g:139:48: (iv_rulePackage= rulePackage EOF )
            // InternalUMLText.g:140:2: iv_rulePackage= rulePackage EOF
            {
             newCompositeNode(grammarAccess.getPackageRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePackage=rulePackage();

            state._fsp--;

             current =iv_rulePackage; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePackage"


    // $ANTLR start "rulePackage"
    // InternalUMLText.g:146:1: rulePackage returns [EObject current=null] : (otherlv_0= 'package' () ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_packagedElement_4_0= rulePackagedElement ) )* otherlv_5= '}' ) ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_packagedElement_4_0 = null;



        	enterRule();

        try {
            // InternalUMLText.g:152:2: ( (otherlv_0= 'package' () ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_packagedElement_4_0= rulePackagedElement ) )* otherlv_5= '}' ) )
            // InternalUMLText.g:153:2: (otherlv_0= 'package' () ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_packagedElement_4_0= rulePackagedElement ) )* otherlv_5= '}' )
            {
            // InternalUMLText.g:153:2: (otherlv_0= 'package' () ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_packagedElement_4_0= rulePackagedElement ) )* otherlv_5= '}' )
            // InternalUMLText.g:154:3: otherlv_0= 'package' () ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_packagedElement_4_0= rulePackagedElement ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPackageAccess().getPackageKeyword_0());
            		
            // InternalUMLText.g:158:3: ()
            // InternalUMLText.g:159:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPackageAccess().getPackageAction_1(),
            					current);
            			

            }

            // InternalUMLText.g:165:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalUMLText.g:166:4: (lv_name_2_0= RULE_ID )
            {
            // InternalUMLText.g:166:4: (lv_name_2_0= RULE_ID )
            // InternalUMLText.g:167:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_2_0, grammarAccess.getPackageAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPackageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalUMLText.g:187:3: ( (lv_packagedElement_4_0= rulePackagedElement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=14 && LA2_0<=15)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalUMLText.g:188:4: (lv_packagedElement_4_0= rulePackagedElement )
            	    {
            	    // InternalUMLText.g:188:4: (lv_packagedElement_4_0= rulePackagedElement )
            	    // InternalUMLText.g:189:5: lv_packagedElement_4_0= rulePackagedElement
            	    {

            	    					newCompositeNode(grammarAccess.getPackageAccess().getPackagedElementPackagedElementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_packagedElement_4_0=rulePackagedElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPackageRule());
            	    					}
            	    					add(
            	    						current,
            	    						"packagedElement",
            	    						lv_packagedElement_4_0,
            	    						"org.eclipse.papyrusrt.uml.umltext.UMLText.PackagedElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRulePackagedElement"
    // InternalUMLText.g:214:1: entryRulePackagedElement returns [EObject current=null] : iv_rulePackagedElement= rulePackagedElement EOF ;
    public final EObject entryRulePackagedElement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackagedElement = null;


        try {
            // InternalUMLText.g:214:56: (iv_rulePackagedElement= rulePackagedElement EOF )
            // InternalUMLText.g:215:2: iv_rulePackagedElement= rulePackagedElement EOF
            {
             newCompositeNode(grammarAccess.getPackagedElementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePackagedElement=rulePackagedElement();

            state._fsp--;

             current =iv_rulePackagedElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePackagedElement"


    // $ANTLR start "rulePackagedElement"
    // InternalUMLText.g:221:1: rulePackagedElement returns [EObject current=null] : (this_Package_0= rulePackage | this_Class_1= ruleClass ) ;
    public final EObject rulePackagedElement() throws RecognitionException {
        EObject current = null;

        EObject this_Package_0 = null;

        EObject this_Class_1 = null;



        	enterRule();

        try {
            // InternalUMLText.g:227:2: ( (this_Package_0= rulePackage | this_Class_1= ruleClass ) )
            // InternalUMLText.g:228:2: (this_Package_0= rulePackage | this_Class_1= ruleClass )
            {
            // InternalUMLText.g:228:2: (this_Package_0= rulePackage | this_Class_1= ruleClass )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            else if ( (LA3_0==15) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalUMLText.g:229:3: this_Package_0= rulePackage
                    {

                    			newCompositeNode(grammarAccess.getPackagedElementAccess().getPackageParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Package_0=rulePackage();

                    state._fsp--;


                    			current = this_Package_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUMLText.g:238:3: this_Class_1= ruleClass
                    {

                    			newCompositeNode(grammarAccess.getPackagedElementAccess().getClassParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Class_1=ruleClass();

                    state._fsp--;


                    			current = this_Class_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePackagedElement"


    // $ANTLR start "entryRuleClass"
    // InternalUMLText.g:250:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // InternalUMLText.g:250:46: (iv_ruleClass= ruleClass EOF )
            // InternalUMLText.g:251:2: iv_ruleClass= ruleClass EOF
            {
             newCompositeNode(grammarAccess.getClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClass=ruleClass();

            state._fsp--;

             current =iv_ruleClass; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // InternalUMLText.g:257:1: ruleClass returns [EObject current=null] : (otherlv_0= 'class' () ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'super' ( ( ruleQualifiedName ) ) )? otherlv_5= '{' ( (lv_ownedAttribute_6_0= ruleProperty ) )* otherlv_7= '}' ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_ownedAttribute_6_0 = null;



        	enterRule();

        try {
            // InternalUMLText.g:263:2: ( (otherlv_0= 'class' () ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'super' ( ( ruleQualifiedName ) ) )? otherlv_5= '{' ( (lv_ownedAttribute_6_0= ruleProperty ) )* otherlv_7= '}' ) )
            // InternalUMLText.g:264:2: (otherlv_0= 'class' () ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'super' ( ( ruleQualifiedName ) ) )? otherlv_5= '{' ( (lv_ownedAttribute_6_0= ruleProperty ) )* otherlv_7= '}' )
            {
            // InternalUMLText.g:264:2: (otherlv_0= 'class' () ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'super' ( ( ruleQualifiedName ) ) )? otherlv_5= '{' ( (lv_ownedAttribute_6_0= ruleProperty ) )* otherlv_7= '}' )
            // InternalUMLText.g:265:3: otherlv_0= 'class' () ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'super' ( ( ruleQualifiedName ) ) )? otherlv_5= '{' ( (lv_ownedAttribute_6_0= ruleProperty ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getClassAccess().getClassKeyword_0());
            		
            // InternalUMLText.g:269:3: ()
            // InternalUMLText.g:270:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getClassAccess().getClassAction_1(),
            					current);
            			

            }

            // InternalUMLText.g:276:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalUMLText.g:277:4: (lv_name_2_0= RULE_ID )
            {
            // InternalUMLText.g:277:4: (lv_name_2_0= RULE_ID )
            // InternalUMLText.g:278:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_2_0, grammarAccess.getClassAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClassRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUMLText.g:294:3: (otherlv_3= 'super' ( ( ruleQualifiedName ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalUMLText.g:295:4: otherlv_3= 'super' ( ( ruleQualifiedName ) )
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getClassAccess().getSuperKeyword_3_0());
                    			
                    // InternalUMLText.g:299:4: ( ( ruleQualifiedName ) )
                    // InternalUMLText.g:300:5: ( ruleQualifiedName )
                    {
                    // InternalUMLText.g:300:5: ( ruleQualifiedName )
                    // InternalUMLText.g:301:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getClassAccess().getSuperClassClassCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_4);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalUMLText.g:320:3: ( (lv_ownedAttribute_6_0= ruleProperty ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalUMLText.g:321:4: (lv_ownedAttribute_6_0= ruleProperty )
            	    {
            	    // InternalUMLText.g:321:4: (lv_ownedAttribute_6_0= ruleProperty )
            	    // InternalUMLText.g:322:5: lv_ownedAttribute_6_0= ruleProperty
            	    {

            	    					newCompositeNode(grammarAccess.getClassAccess().getOwnedAttributePropertyParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_ownedAttribute_6_0=ruleProperty();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getClassRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ownedAttribute",
            	    						lv_ownedAttribute_6_0,
            	    						"org.eclipse.papyrusrt.uml.umltext.UMLText.Property");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleProperty"
    // InternalUMLText.g:347:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // InternalUMLText.g:347:49: (iv_ruleProperty= ruleProperty EOF )
            // InternalUMLText.g:348:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // InternalUMLText.g:354:1: ruleProperty returns [EObject current=null] : (otherlv_0= 'property' () ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleQualifiedName ) ) otherlv_5= ';' ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalUMLText.g:360:2: ( (otherlv_0= 'property' () ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleQualifiedName ) ) otherlv_5= ';' ) )
            // InternalUMLText.g:361:2: (otherlv_0= 'property' () ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleQualifiedName ) ) otherlv_5= ';' )
            {
            // InternalUMLText.g:361:2: (otherlv_0= 'property' () ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleQualifiedName ) ) otherlv_5= ';' )
            // InternalUMLText.g:362:3: otherlv_0= 'property' () ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleQualifiedName ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPropertyAccess().getPropertyKeyword_0());
            		
            // InternalUMLText.g:366:3: ()
            // InternalUMLText.g:367:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPropertyAccess().getPropertyAction_1(),
            					current);
            			

            }

            // InternalUMLText.g:373:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalUMLText.g:374:4: (lv_name_2_0= RULE_ID )
            {
            // InternalUMLText.g:374:4: (lv_name_2_0= RULE_ID )
            // InternalUMLText.g:375:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_2_0, grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPropertyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getPropertyAccess().getColonKeyword_3());
            		
            // InternalUMLText.g:395:3: ( ( ruleQualifiedName ) )
            // InternalUMLText.g:396:4: ( ruleQualifiedName )
            {
            // InternalUMLText.g:396:4: ( ruleQualifiedName )
            // InternalUMLText.g:397:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPropertyRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPropertyAccess().getTypeTypeCrossReference_4_0());
            				
            pushFollow(FOLLOW_10);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPropertyAccess().getSemicolonKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalUMLText.g:419:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalUMLText.g:419:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalUMLText.g:420:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalUMLText.g:426:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;



        	enterRule();

        try {
            // InternalUMLText.g:432:2: ( (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* ) )
            // InternalUMLText.g:433:2: (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* )
            {
            // InternalUMLText.g:433:2: (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* )
            // InternalUMLText.g:434:3: this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )*
            {

            			newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0());
            		
            pushFollow(FOLLOW_11);
            this_ValidID_0=ruleValidID();

            state._fsp--;


            			current.merge(this_ValidID_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalUMLText.g:444:3: (kw= '.' this_ValidID_2= ruleValidID )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==20) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalUMLText.g:445:4: kw= '.' this_ValidID_2= ruleValidID
            	    {
            	    kw=(Token)match(input,20,FOLLOW_3); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			

            	    				newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_11);
            	    this_ValidID_2=ruleValidID();

            	    state._fsp--;


            	    				current.merge(this_ValidID_2);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleValidID"
    // InternalUMLText.g:465:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // InternalUMLText.g:465:47: (iv_ruleValidID= ruleValidID EOF )
            // InternalUMLText.g:466:2: iv_ruleValidID= ruleValidID EOF
            {
             newCompositeNode(grammarAccess.getValidIDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValidID=ruleValidID();

            state._fsp--;

             current =iv_ruleValidID.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValidID"


    // $ANTLR start "ruleValidID"
    // InternalUMLText.g:472:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalUMLText.g:478:2: (this_ID_0= RULE_ID )
            // InternalUMLText.g:479:2: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            		current.merge(this_ID_0);
            	

            		newLeafNode(this_ID_0, grammarAccess.getValidIDAccess().getIDTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValidID"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100002L});

}
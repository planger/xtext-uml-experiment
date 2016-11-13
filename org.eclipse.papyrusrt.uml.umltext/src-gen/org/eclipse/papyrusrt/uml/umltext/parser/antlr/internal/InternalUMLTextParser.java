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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'model'", "'{'", "'}'", "'package'", "'class'", "';'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

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
    // InternalUMLText.g:146:1: rulePackage returns [EObject current=null] : (otherlv_0= 'package' () ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_packagedElement_4_0= ruleClass ) )* otherlv_5= '}' ) ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_packagedElement_4_0 = null;



        	enterRule();

        try {
            // InternalUMLText.g:152:2: ( (otherlv_0= 'package' () ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_packagedElement_4_0= ruleClass ) )* otherlv_5= '}' ) )
            // InternalUMLText.g:153:2: (otherlv_0= 'package' () ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_packagedElement_4_0= ruleClass ) )* otherlv_5= '}' )
            {
            // InternalUMLText.g:153:2: (otherlv_0= 'package' () ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_packagedElement_4_0= ruleClass ) )* otherlv_5= '}' )
            // InternalUMLText.g:154:3: otherlv_0= 'package' () ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_packagedElement_4_0= ruleClass ) )* otherlv_5= '}'
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
            		
            // InternalUMLText.g:187:3: ( (lv_packagedElement_4_0= ruleClass ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalUMLText.g:188:4: (lv_packagedElement_4_0= ruleClass )
            	    {
            	    // InternalUMLText.g:188:4: (lv_packagedElement_4_0= ruleClass )
            	    // InternalUMLText.g:189:5: lv_packagedElement_4_0= ruleClass
            	    {

            	    					newCompositeNode(grammarAccess.getPackageAccess().getPackagedElementClassParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_packagedElement_4_0=ruleClass();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPackageRule());
            	    					}
            	    					add(
            	    						current,
            	    						"packagedElement",
            	    						lv_packagedElement_4_0,
            	    						"org.eclipse.papyrusrt.uml.umltext.UMLText.Class");
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


    // $ANTLR start "entryRuleClass"
    // InternalUMLText.g:214:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // InternalUMLText.g:214:46: (iv_ruleClass= ruleClass EOF )
            // InternalUMLText.g:215:2: iv_ruleClass= ruleClass EOF
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
    // InternalUMLText.g:221:1: ruleClass returns [EObject current=null] : (otherlv_0= 'class' () ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalUMLText.g:227:2: ( (otherlv_0= 'class' () ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) )
            // InternalUMLText.g:228:2: (otherlv_0= 'class' () ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            {
            // InternalUMLText.g:228:2: (otherlv_0= 'class' () ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            // InternalUMLText.g:229:3: otherlv_0= 'class' () ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getClassAccess().getClassKeyword_0());
            		
            // InternalUMLText.g:233:3: ()
            // InternalUMLText.g:234:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getClassAccess().getClassAction_1(),
            					current);
            			

            }

            // InternalUMLText.g:240:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalUMLText.g:241:4: (lv_name_2_0= RULE_ID )
            {
            // InternalUMLText.g:241:4: (lv_name_2_0= RULE_ID )
            // InternalUMLText.g:242:5: lv_name_2_0= RULE_ID
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

            otherlv_3=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getClassAccess().getSemicolonKeyword_3());
            		

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});

}
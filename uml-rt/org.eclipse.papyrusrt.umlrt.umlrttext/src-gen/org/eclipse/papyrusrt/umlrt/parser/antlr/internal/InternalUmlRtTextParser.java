package org.eclipse.papyrusrt.umlrt.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.papyrusrt.umlrt.services.UmlRtTextGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalUmlRtTextParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'model'", "'{'", "'}'", "'protocol'", "'interface'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalUmlRtTextParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalUmlRtTextParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalUmlRtTextParser.tokenNames; }
    public String getGrammarFileName() { return "InternalUmlRtText.g"; }



     	private UmlRtTextGrammarAccess grammarAccess;

        public InternalUmlRtTextParser(TokenStream input, UmlRtTextGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected UmlRtTextGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalUmlRtText.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalUmlRtText.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalUmlRtText.g:65:2: iv_ruleModel= ruleModel EOF
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
    // InternalUmlRtText.g:71:1: ruleModel returns [EObject current=null] : (otherlv_0= 'model' () ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_packagedElement_4_0= rulePackageableElement ) )* otherlv_5= '}' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_packagedElement_4_0 = null;



        	enterRule();

        try {
            // InternalUmlRtText.g:77:2: ( (otherlv_0= 'model' () ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_packagedElement_4_0= rulePackageableElement ) )* otherlv_5= '}' ) )
            // InternalUmlRtText.g:78:2: (otherlv_0= 'model' () ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_packagedElement_4_0= rulePackageableElement ) )* otherlv_5= '}' )
            {
            // InternalUmlRtText.g:78:2: (otherlv_0= 'model' () ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_packagedElement_4_0= rulePackageableElement ) )* otherlv_5= '}' )
            // InternalUmlRtText.g:79:3: otherlv_0= 'model' () ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_packagedElement_4_0= rulePackageableElement ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getModelKeyword_0());
            		
            // InternalUmlRtText.g:83:3: ()
            // InternalUmlRtText.g:84:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getModelAccess().getModelAction_1(),
            					current);
            			

            }

            // InternalUmlRtText.g:90:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalUmlRtText.g:91:4: (lv_name_2_0= RULE_ID )
            {
            // InternalUmlRtText.g:91:4: (lv_name_2_0= RULE_ID )
            // InternalUmlRtText.g:92:5: lv_name_2_0= RULE_ID
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
            		
            // InternalUmlRtText.g:112:3: ( (lv_packagedElement_4_0= rulePackageableElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||(LA1_0>=14 && LA1_0<=15)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalUmlRtText.g:113:4: (lv_packagedElement_4_0= rulePackageableElement )
            	    {
            	    // InternalUmlRtText.g:113:4: (lv_packagedElement_4_0= rulePackageableElement )
            	    // InternalUmlRtText.g:114:5: lv_packagedElement_4_0= rulePackageableElement
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getPackagedElementPackageableElementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_packagedElement_4_0=rulePackageableElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"packagedElement",
            	    						lv_packagedElement_4_0,
            	    						"org.eclipse.papyrusrt.umlrt.UmlRtText.PackageableElement");
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


    // $ANTLR start "entryRulePackageableElement"
    // InternalUmlRtText.g:139:1: entryRulePackageableElement returns [EObject current=null] : iv_rulePackageableElement= rulePackageableElement EOF ;
    public final EObject entryRulePackageableElement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageableElement = null;


        try {
            // InternalUmlRtText.g:139:59: (iv_rulePackageableElement= rulePackageableElement EOF )
            // InternalUmlRtText.g:140:2: iv_rulePackageableElement= rulePackageableElement EOF
            {
             newCompositeNode(grammarAccess.getPackageableElementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePackageableElement=rulePackageableElement();

            state._fsp--;

             current =iv_rulePackageableElement; 
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
    // $ANTLR end "entryRulePackageableElement"


    // $ANTLR start "rulePackageableElement"
    // InternalUmlRtText.g:146:1: rulePackageableElement returns [EObject current=null] : this_Package_0= rulePackage ;
    public final EObject rulePackageableElement() throws RecognitionException {
        EObject current = null;

        EObject this_Package_0 = null;



        	enterRule();

        try {
            // InternalUmlRtText.g:152:2: (this_Package_0= rulePackage )
            // InternalUmlRtText.g:153:2: this_Package_0= rulePackage
            {

            		newCompositeNode(grammarAccess.getPackageableElementAccess().getPackageParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Package_0=rulePackage();

            state._fsp--;


            		current = this_Package_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "rulePackageableElement"


    // $ANTLR start "entryRulePackage"
    // InternalUmlRtText.g:164:1: entryRulePackage returns [EObject current=null] : iv_rulePackage= rulePackage EOF ;
    public final EObject entryRulePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage = null;


        try {
            // InternalUmlRtText.g:164:48: (iv_rulePackage= rulePackage EOF )
            // InternalUmlRtText.g:165:2: iv_rulePackage= rulePackage EOF
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
    // InternalUmlRtText.g:171:1: rulePackage returns [EObject current=null] : (this_ProtocolContainer_0= ruleProtocolContainer | this_Model_1= ruleModel ) ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;

        EObject this_ProtocolContainer_0 = null;

        EObject this_Model_1 = null;



        	enterRule();

        try {
            // InternalUmlRtText.g:177:2: ( (this_ProtocolContainer_0= ruleProtocolContainer | this_Model_1= ruleModel ) )
            // InternalUmlRtText.g:178:2: (this_ProtocolContainer_0= ruleProtocolContainer | this_Model_1= ruleModel )
            {
            // InternalUmlRtText.g:178:2: (this_ProtocolContainer_0= ruleProtocolContainer | this_Model_1= ruleModel )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=14 && LA2_0<=15)) ) {
                alt2=1;
            }
            else if ( (LA2_0==11) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalUmlRtText.g:179:3: this_ProtocolContainer_0= ruleProtocolContainer
                    {

                    			newCompositeNode(grammarAccess.getPackageAccess().getProtocolContainerParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ProtocolContainer_0=ruleProtocolContainer();

                    state._fsp--;


                    			current = this_ProtocolContainer_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUmlRtText.g:188:3: this_Model_1= ruleModel
                    {

                    			newCompositeNode(grammarAccess.getPackageAccess().getModelParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Model_1=ruleModel();

                    state._fsp--;


                    			current = this_Model_1;
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
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRuleProtocolContainer"
    // InternalUmlRtText.g:200:1: entryRuleProtocolContainer returns [EObject current=null] : iv_ruleProtocolContainer= ruleProtocolContainer EOF ;
    public final EObject entryRuleProtocolContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtocolContainer = null;


        try {
            // InternalUmlRtText.g:200:58: (iv_ruleProtocolContainer= ruleProtocolContainer EOF )
            // InternalUmlRtText.g:201:2: iv_ruleProtocolContainer= ruleProtocolContainer EOF
            {
             newCompositeNode(grammarAccess.getProtocolContainerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProtocolContainer=ruleProtocolContainer();

            state._fsp--;

             current =iv_ruleProtocolContainer; 
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
    // $ANTLR end "entryRuleProtocolContainer"


    // $ANTLR start "ruleProtocolContainer"
    // InternalUmlRtText.g:207:1: ruleProtocolContainer returns [EObject current=null] : ( () ( ( ( ( ({...}? => ( ({...}? => ( (lv_packagedElement_2_0= ruleProtocol ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_packagedElement_3_0= ruleRTMessageSet ) ) )+ ) ) )+ {...}?) ) ) ) ;
    public final EObject ruleProtocolContainer() throws RecognitionException {
        EObject current = null;

        EObject lv_packagedElement_2_0 = null;

        EObject lv_packagedElement_3_0 = null;



        	enterRule();

        try {
            // InternalUmlRtText.g:213:2: ( ( () ( ( ( ( ({...}? => ( ({...}? => ( (lv_packagedElement_2_0= ruleProtocol ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_packagedElement_3_0= ruleRTMessageSet ) ) )+ ) ) )+ {...}?) ) ) ) )
            // InternalUmlRtText.g:214:2: ( () ( ( ( ( ({...}? => ( ({...}? => ( (lv_packagedElement_2_0= ruleProtocol ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_packagedElement_3_0= ruleRTMessageSet ) ) )+ ) ) )+ {...}?) ) ) )
            {
            // InternalUmlRtText.g:214:2: ( () ( ( ( ( ({...}? => ( ({...}? => ( (lv_packagedElement_2_0= ruleProtocol ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_packagedElement_3_0= ruleRTMessageSet ) ) )+ ) ) )+ {...}?) ) ) )
            // InternalUmlRtText.g:215:3: () ( ( ( ( ({...}? => ( ({...}? => ( (lv_packagedElement_2_0= ruleProtocol ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_packagedElement_3_0= ruleRTMessageSet ) ) )+ ) ) )+ {...}?) ) )
            {
            // InternalUmlRtText.g:215:3: ()
            // InternalUmlRtText.g:216:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProtocolContainerAccess().getProtocolContainerAction_0(),
            					current);
            			

            }

            // InternalUmlRtText.g:222:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_packagedElement_2_0= ruleProtocol ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_packagedElement_3_0= ruleRTMessageSet ) ) )+ ) ) )+ {...}?) ) )
            // InternalUmlRtText.g:223:4: ( ( ( ({...}? => ( ({...}? => ( (lv_packagedElement_2_0= ruleProtocol ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_packagedElement_3_0= ruleRTMessageSet ) ) )+ ) ) )+ {...}?) )
            {
            // InternalUmlRtText.g:223:4: ( ( ( ({...}? => ( ({...}? => ( (lv_packagedElement_2_0= ruleProtocol ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_packagedElement_3_0= ruleRTMessageSet ) ) )+ ) ) )+ {...}?) )
            // InternalUmlRtText.g:224:5: ( ( ({...}? => ( ({...}? => ( (lv_packagedElement_2_0= ruleProtocol ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_packagedElement_3_0= ruleRTMessageSet ) ) )+ ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getProtocolContainerAccess().getUnorderedGroup_1());
            				
            // InternalUmlRtText.g:227:5: ( ( ({...}? => ( ({...}? => ( (lv_packagedElement_2_0= ruleProtocol ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_packagedElement_3_0= ruleRTMessageSet ) ) )+ ) ) )+ {...}?)
            // InternalUmlRtText.g:228:6: ( ({...}? => ( ({...}? => ( (lv_packagedElement_2_0= ruleProtocol ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_packagedElement_3_0= ruleRTMessageSet ) ) )+ ) ) )+ {...}?
            {
            // InternalUmlRtText.g:228:6: ( ({...}? => ( ({...}? => ( (lv_packagedElement_2_0= ruleProtocol ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_packagedElement_3_0= ruleRTMessageSet ) ) )+ ) ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=3;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14) ) {
                    int LA4_2 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getProtocolContainerAccess().getUnorderedGroup_1(), 0) ) {
                        alt4=1;
                    }


                }
                else if ( (LA4_0==15) ) {
                    int LA4_3 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getProtocolContainerAccess().getUnorderedGroup_1(), 1) ) {
                        alt4=2;
                    }


                }


                switch (alt4) {
            	case 1 :
            	    // InternalUmlRtText.g:229:4: ({...}? => ( ({...}? => ( (lv_packagedElement_2_0= ruleProtocol ) ) ) ) )
            	    {
            	    // InternalUmlRtText.g:229:4: ({...}? => ( ({...}? => ( (lv_packagedElement_2_0= ruleProtocol ) ) ) ) )
            	    // InternalUmlRtText.g:230:5: {...}? => ( ({...}? => ( (lv_packagedElement_2_0= ruleProtocol ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getProtocolContainerAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleProtocolContainer", "getUnorderedGroupHelper().canSelect(grammarAccess.getProtocolContainerAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalUmlRtText.g:230:114: ( ({...}? => ( (lv_packagedElement_2_0= ruleProtocol ) ) ) )
            	    // InternalUmlRtText.g:231:6: ({...}? => ( (lv_packagedElement_2_0= ruleProtocol ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getProtocolContainerAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalUmlRtText.g:234:9: ({...}? => ( (lv_packagedElement_2_0= ruleProtocol ) ) )
            	    // InternalUmlRtText.g:234:10: {...}? => ( (lv_packagedElement_2_0= ruleProtocol ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleProtocolContainer", "true");
            	    }
            	    // InternalUmlRtText.g:234:19: ( (lv_packagedElement_2_0= ruleProtocol ) )
            	    // InternalUmlRtText.g:234:20: (lv_packagedElement_2_0= ruleProtocol )
            	    {
            	    // InternalUmlRtText.g:234:20: (lv_packagedElement_2_0= ruleProtocol )
            	    // InternalUmlRtText.g:235:10: lv_packagedElement_2_0= ruleProtocol
            	    {

            	    										newCompositeNode(grammarAccess.getProtocolContainerAccess().getPackagedElementProtocolParserRuleCall_1_0_0());
            	    									
            	    pushFollow(FOLLOW_6);
            	    lv_packagedElement_2_0=ruleProtocol();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getProtocolContainerRule());
            	    										}
            	    										add(
            	    											current,
            	    											"packagedElement",
            	    											lv_packagedElement_2_0,
            	    											"org.eclipse.papyrusrt.umlrt.UmlRtText.Protocol");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getProtocolContainerAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalUmlRtText.g:257:4: ({...}? => ( ({...}? => ( (lv_packagedElement_3_0= ruleRTMessageSet ) ) )+ ) )
            	    {
            	    // InternalUmlRtText.g:257:4: ({...}? => ( ({...}? => ( (lv_packagedElement_3_0= ruleRTMessageSet ) ) )+ ) )
            	    // InternalUmlRtText.g:258:5: {...}? => ( ({...}? => ( (lv_packagedElement_3_0= ruleRTMessageSet ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getProtocolContainerAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleProtocolContainer", "getUnorderedGroupHelper().canSelect(grammarAccess.getProtocolContainerAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalUmlRtText.g:258:114: ( ({...}? => ( (lv_packagedElement_3_0= ruleRTMessageSet ) ) )+ )
            	    // InternalUmlRtText.g:259:6: ({...}? => ( (lv_packagedElement_3_0= ruleRTMessageSet ) ) )+
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getProtocolContainerAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalUmlRtText.g:262:9: ({...}? => ( (lv_packagedElement_3_0= ruleRTMessageSet ) ) )+
            	    int cnt3=0;
            	    loop3:
            	    do {
            	        int alt3=2;
            	        int LA3_0 = input.LA(1);

            	        if ( (LA3_0==15) ) {
            	            int LA3_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt3=1;
            	            }


            	        }


            	        switch (alt3) {
            	    	case 1 :
            	    	    // InternalUmlRtText.g:262:10: {...}? => ( (lv_packagedElement_3_0= ruleRTMessageSet ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleProtocolContainer", "true");
            	    	    }
            	    	    // InternalUmlRtText.g:262:19: ( (lv_packagedElement_3_0= ruleRTMessageSet ) )
            	    	    // InternalUmlRtText.g:262:20: (lv_packagedElement_3_0= ruleRTMessageSet )
            	    	    {
            	    	    // InternalUmlRtText.g:262:20: (lv_packagedElement_3_0= ruleRTMessageSet )
            	    	    // InternalUmlRtText.g:263:10: lv_packagedElement_3_0= ruleRTMessageSet
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getProtocolContainerAccess().getPackagedElementRTMessageSetParserRuleCall_1_1_0());
            	    	    									
            	    	    pushFollow(FOLLOW_6);
            	    	    lv_packagedElement_3_0=ruleRTMessageSet();

            	    	    state._fsp--;


            	    	    										if (current==null) {
            	    	    											current = createModelElementForParent(grammarAccess.getProtocolContainerRule());
            	    	    										}
            	    	    										add(
            	    	    											current,
            	    	    											"packagedElement",
            	    	    											lv_packagedElement_3_0,
            	    	    											"org.eclipse.papyrusrt.umlrt.UmlRtText.RTMessageSet");
            	    	    										afterParserOrEnumRuleCall();
            	    	    									

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt3 >= 1 ) break loop3;
            	                EarlyExitException eee =
            	                    new EarlyExitException(3, input);
            	                throw eee;
            	        }
            	        cnt3++;
            	    } while (true);

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getProtocolContainerAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getProtocolContainerAccess().getUnorderedGroup_1()) ) {
                throw new FailedPredicateException(input, "ruleProtocolContainer", "getUnorderedGroupHelper().canLeave(grammarAccess.getProtocolContainerAccess().getUnorderedGroup_1())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getProtocolContainerAccess().getUnorderedGroup_1());
            				

            }


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
    // $ANTLR end "ruleProtocolContainer"


    // $ANTLR start "entryRuleProtocol"
    // InternalUmlRtText.g:297:1: entryRuleProtocol returns [EObject current=null] : iv_ruleProtocol= ruleProtocol EOF ;
    public final EObject entryRuleProtocol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtocol = null;


        try {
            // InternalUmlRtText.g:297:49: (iv_ruleProtocol= ruleProtocol EOF )
            // InternalUmlRtText.g:298:2: iv_ruleProtocol= ruleProtocol EOF
            {
             newCompositeNode(grammarAccess.getProtocolRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProtocol=ruleProtocol();

            state._fsp--;

             current =iv_ruleProtocol; 
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
    // $ANTLR end "entryRuleProtocol"


    // $ANTLR start "ruleProtocol"
    // InternalUmlRtText.g:304:1: ruleProtocol returns [EObject current=null] : (otherlv_0= 'protocol' () ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleProtocol() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalUmlRtText.g:310:2: ( (otherlv_0= 'protocol' () ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalUmlRtText.g:311:2: (otherlv_0= 'protocol' () ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalUmlRtText.g:311:2: (otherlv_0= 'protocol' () ( (lv_name_2_0= RULE_ID ) ) )
            // InternalUmlRtText.g:312:3: otherlv_0= 'protocol' () ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getProtocolAccess().getProtocolKeyword_0());
            		
            // InternalUmlRtText.g:316:3: ()
            // InternalUmlRtText.g:317:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProtocolAccess().getProtocolAction_1(),
            					current);
            			

            }

            // InternalUmlRtText.g:323:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalUmlRtText.g:324:4: (lv_name_2_0= RULE_ID )
            {
            // InternalUmlRtText.g:324:4: (lv_name_2_0= RULE_ID )
            // InternalUmlRtText.g:325:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getProtocolAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProtocolRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


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
    // $ANTLR end "ruleProtocol"


    // $ANTLR start "entryRuleRTMessageSet"
    // InternalUmlRtText.g:345:1: entryRuleRTMessageSet returns [EObject current=null] : iv_ruleRTMessageSet= ruleRTMessageSet EOF ;
    public final EObject entryRuleRTMessageSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRTMessageSet = null;


        try {
            // InternalUmlRtText.g:345:53: (iv_ruleRTMessageSet= ruleRTMessageSet EOF )
            // InternalUmlRtText.g:346:2: iv_ruleRTMessageSet= ruleRTMessageSet EOF
            {
             newCompositeNode(grammarAccess.getRTMessageSetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRTMessageSet=ruleRTMessageSet();

            state._fsp--;

             current =iv_ruleRTMessageSet; 
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
    // $ANTLR end "entryRuleRTMessageSet"


    // $ANTLR start "ruleRTMessageSet"
    // InternalUmlRtText.g:352:1: ruleRTMessageSet returns [EObject current=null] : (otherlv_0= 'interface' () ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleRTMessageSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalUmlRtText.g:358:2: ( (otherlv_0= 'interface' () ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalUmlRtText.g:359:2: (otherlv_0= 'interface' () ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalUmlRtText.g:359:2: (otherlv_0= 'interface' () ( (lv_name_2_0= RULE_ID ) ) )
            // InternalUmlRtText.g:360:3: otherlv_0= 'interface' () ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRTMessageSetAccess().getInterfaceKeyword_0());
            		
            // InternalUmlRtText.g:364:3: ()
            // InternalUmlRtText.g:365:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRTMessageSetAccess().getRTMessageSetAction_1(),
            					current);
            			

            }

            // InternalUmlRtText.g:371:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalUmlRtText.g:372:4: (lv_name_2_0= RULE_ID )
            {
            // InternalUmlRtText.g:372:4: (lv_name_2_0= RULE_ID )
            // InternalUmlRtText.g:373:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getRTMessageSetAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRTMessageSetRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


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
    // $ANTLR end "ruleRTMessageSet"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000E800L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C002L});

}

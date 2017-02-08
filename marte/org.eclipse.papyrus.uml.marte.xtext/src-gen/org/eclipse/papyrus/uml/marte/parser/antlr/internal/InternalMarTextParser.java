package org.eclipse.papyrus.uml.marte.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.papyrus.uml.marte.services.MarTextGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMarTextParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'model'", "'{'", "'};'", "';'", "'component'", "'processor'", "'cores:'", "'caches:'", "'cache'", "'level:'"
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


        public InternalMarTextParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMarTextParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMarTextParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMarText.g"; }



     	private MarTextGrammarAccess grammarAccess;

        public InternalMarTextParser(TokenStream input, MarTextGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected MarTextGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMarText.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMarText.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalMarText.g:65:2: iv_ruleModel= ruleModel EOF
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
    // InternalMarText.g:71:1: ruleModel returns [EObject current=null] : (otherlv_0= 'model' () ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= '{' ( (lv_packagedElement_4_0= ruleComponent ) )* otherlv_5= '};' ) | otherlv_6= ';' ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_packagedElement_4_0 = null;



        	enterRule();

        try {
            // InternalMarText.g:77:2: ( (otherlv_0= 'model' () ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= '{' ( (lv_packagedElement_4_0= ruleComponent ) )* otherlv_5= '};' ) | otherlv_6= ';' ) ) )
            // InternalMarText.g:78:2: (otherlv_0= 'model' () ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= '{' ( (lv_packagedElement_4_0= ruleComponent ) )* otherlv_5= '};' ) | otherlv_6= ';' ) )
            {
            // InternalMarText.g:78:2: (otherlv_0= 'model' () ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= '{' ( (lv_packagedElement_4_0= ruleComponent ) )* otherlv_5= '};' ) | otherlv_6= ';' ) )
            // InternalMarText.g:79:3: otherlv_0= 'model' () ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= '{' ( (lv_packagedElement_4_0= ruleComponent ) )* otherlv_5= '};' ) | otherlv_6= ';' )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getModelKeyword_0());
            		
            // InternalMarText.g:83:3: ()
            // InternalMarText.g:84:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getModelAccess().getModelAction_1(),
            					current);
            			

            }

            // InternalMarText.g:90:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMarText.g:91:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMarText.g:91:4: (lv_name_2_0= RULE_ID )
            // InternalMarText.g:92:5: lv_name_2_0= RULE_ID
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

            // InternalMarText.g:108:3: ( (otherlv_3= '{' ( (lv_packagedElement_4_0= ruleComponent ) )* otherlv_5= '};' ) | otherlv_6= ';' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            else if ( (LA2_0==14) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMarText.g:109:4: (otherlv_3= '{' ( (lv_packagedElement_4_0= ruleComponent ) )* otherlv_5= '};' )
                    {
                    // InternalMarText.g:109:4: (otherlv_3= '{' ( (lv_packagedElement_4_0= ruleComponent ) )* otherlv_5= '};' )
                    // InternalMarText.g:110:5: otherlv_3= '{' ( (lv_packagedElement_4_0= ruleComponent ) )* otherlv_5= '};'
                    {
                    otherlv_3=(Token)match(input,12,FOLLOW_5); 

                    					newLeafNode(otherlv_3, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_3_0_0());
                    				
                    // InternalMarText.g:114:5: ( (lv_packagedElement_4_0= ruleComponent ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>=15 && LA1_0<=16)||LA1_0==19) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalMarText.g:115:6: (lv_packagedElement_4_0= ruleComponent )
                    	    {
                    	    // InternalMarText.g:115:6: (lv_packagedElement_4_0= ruleComponent )
                    	    // InternalMarText.g:116:7: lv_packagedElement_4_0= ruleComponent
                    	    {

                    	    							newCompositeNode(grammarAccess.getModelAccess().getPackagedElementComponentParserRuleCall_3_0_1_0());
                    	    						
                    	    pushFollow(FOLLOW_5);
                    	    lv_packagedElement_4_0=ruleComponent();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getModelRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"packagedElement",
                    	    								lv_packagedElement_4_0,
                    	    								"org.eclipse.papyrus.uml.marte.MarText.Component");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,13,FOLLOW_2); 

                    					newLeafNode(otherlv_5, grammarAccess.getModelAccess().getRightCurlyBracketSemicolonKeyword_3_0_2());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalMarText.g:139:4: otherlv_6= ';'
                    {
                    otherlv_6=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getModelAccess().getSemicolonKeyword_3_1());
                    			

                    }
                    break;

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleComponent"
    // InternalMarText.g:148:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalMarText.g:148:50: (iv_ruleComponent= ruleComponent EOF )
            // InternalMarText.g:149:2: iv_ruleComponent= ruleComponent EOF
            {
             newCompositeNode(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponent=ruleComponent();

            state._fsp--;

             current =iv_ruleComponent; 
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
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalMarText.g:155:1: ruleComponent returns [EObject current=null] : (this_HwCache_0= ruleHwCache | this_HwProcessor_1= ruleHwProcessor | (otherlv_2= 'component' () ( (lv_name_4_0= RULE_ID ) ) ( (otherlv_5= '{' ( (lv_packagedElement_6_0= ruleComponent ) )* otherlv_7= '};' ) | otherlv_8= ';' ) ) ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject this_HwCache_0 = null;

        EObject this_HwProcessor_1 = null;

        EObject lv_packagedElement_6_0 = null;



        	enterRule();

        try {
            // InternalMarText.g:161:2: ( (this_HwCache_0= ruleHwCache | this_HwProcessor_1= ruleHwProcessor | (otherlv_2= 'component' () ( (lv_name_4_0= RULE_ID ) ) ( (otherlv_5= '{' ( (lv_packagedElement_6_0= ruleComponent ) )* otherlv_7= '};' ) | otherlv_8= ';' ) ) ) )
            // InternalMarText.g:162:2: (this_HwCache_0= ruleHwCache | this_HwProcessor_1= ruleHwProcessor | (otherlv_2= 'component' () ( (lv_name_4_0= RULE_ID ) ) ( (otherlv_5= '{' ( (lv_packagedElement_6_0= ruleComponent ) )* otherlv_7= '};' ) | otherlv_8= ';' ) ) )
            {
            // InternalMarText.g:162:2: (this_HwCache_0= ruleHwCache | this_HwProcessor_1= ruleHwProcessor | (otherlv_2= 'component' () ( (lv_name_4_0= RULE_ID ) ) ( (otherlv_5= '{' ( (lv_packagedElement_6_0= ruleComponent ) )* otherlv_7= '};' ) | otherlv_8= ';' ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt5=1;
                }
                break;
            case 16:
                {
                alt5=2;
                }
                break;
            case 15:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMarText.g:163:3: this_HwCache_0= ruleHwCache
                    {

                    			newCompositeNode(grammarAccess.getComponentAccess().getHwCacheParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_HwCache_0=ruleHwCache();

                    state._fsp--;


                    			current = this_HwCache_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMarText.g:172:3: this_HwProcessor_1= ruleHwProcessor
                    {

                    			newCompositeNode(grammarAccess.getComponentAccess().getHwProcessorParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_HwProcessor_1=ruleHwProcessor();

                    state._fsp--;


                    			current = this_HwProcessor_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMarText.g:181:3: (otherlv_2= 'component' () ( (lv_name_4_0= RULE_ID ) ) ( (otherlv_5= '{' ( (lv_packagedElement_6_0= ruleComponent ) )* otherlv_7= '};' ) | otherlv_8= ';' ) )
                    {
                    // InternalMarText.g:181:3: (otherlv_2= 'component' () ( (lv_name_4_0= RULE_ID ) ) ( (otherlv_5= '{' ( (lv_packagedElement_6_0= ruleComponent ) )* otherlv_7= '};' ) | otherlv_8= ';' ) )
                    // InternalMarText.g:182:4: otherlv_2= 'component' () ( (lv_name_4_0= RULE_ID ) ) ( (otherlv_5= '{' ( (lv_packagedElement_6_0= ruleComponent ) )* otherlv_7= '};' ) | otherlv_8= ';' )
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getComponentAccess().getComponentKeyword_2_0());
                    			
                    // InternalMarText.g:186:4: ()
                    // InternalMarText.g:187:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getComponentAccess().getComponentAction_2_1(),
                    						current);
                    				

                    }

                    // InternalMarText.g:193:4: ( (lv_name_4_0= RULE_ID ) )
                    // InternalMarText.g:194:5: (lv_name_4_0= RULE_ID )
                    {
                    // InternalMarText.g:194:5: (lv_name_4_0= RULE_ID )
                    // InternalMarText.g:195:6: lv_name_4_0= RULE_ID
                    {
                    lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_4); 

                    						newLeafNode(lv_name_4_0, grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_2_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getComponentRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_4_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    // InternalMarText.g:211:4: ( (otherlv_5= '{' ( (lv_packagedElement_6_0= ruleComponent ) )* otherlv_7= '};' ) | otherlv_8= ';' )
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==12) ) {
                        alt4=1;
                    }
                    else if ( (LA4_0==14) ) {
                        alt4=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 0, input);

                        throw nvae;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalMarText.g:212:5: (otherlv_5= '{' ( (lv_packagedElement_6_0= ruleComponent ) )* otherlv_7= '};' )
                            {
                            // InternalMarText.g:212:5: (otherlv_5= '{' ( (lv_packagedElement_6_0= ruleComponent ) )* otherlv_7= '};' )
                            // InternalMarText.g:213:6: otherlv_5= '{' ( (lv_packagedElement_6_0= ruleComponent ) )* otherlv_7= '};'
                            {
                            otherlv_5=(Token)match(input,12,FOLLOW_5); 

                            						newLeafNode(otherlv_5, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_2_3_0_0());
                            					
                            // InternalMarText.g:217:6: ( (lv_packagedElement_6_0= ruleComponent ) )*
                            loop3:
                            do {
                                int alt3=2;
                                int LA3_0 = input.LA(1);

                                if ( ((LA3_0>=15 && LA3_0<=16)||LA3_0==19) ) {
                                    alt3=1;
                                }


                                switch (alt3) {
                            	case 1 :
                            	    // InternalMarText.g:218:7: (lv_packagedElement_6_0= ruleComponent )
                            	    {
                            	    // InternalMarText.g:218:7: (lv_packagedElement_6_0= ruleComponent )
                            	    // InternalMarText.g:219:8: lv_packagedElement_6_0= ruleComponent
                            	    {

                            	    								newCompositeNode(grammarAccess.getComponentAccess().getPackagedElementComponentParserRuleCall_2_3_0_1_0());
                            	    							
                            	    pushFollow(FOLLOW_5);
                            	    lv_packagedElement_6_0=ruleComponent();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getComponentRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"packagedElement",
                            	    									lv_packagedElement_6_0,
                            	    									"org.eclipse.papyrus.uml.marte.MarText.Component");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop3;
                                }
                            } while (true);

                            otherlv_7=(Token)match(input,13,FOLLOW_2); 

                            						newLeafNode(otherlv_7, grammarAccess.getComponentAccess().getRightCurlyBracketSemicolonKeyword_2_3_0_2());
                            					

                            }


                            }
                            break;
                        case 2 :
                            // InternalMarText.g:242:5: otherlv_8= ';'
                            {
                            otherlv_8=(Token)match(input,14,FOLLOW_2); 

                            					newLeafNode(otherlv_8, grammarAccess.getComponentAccess().getSemicolonKeyword_2_3_1());
                            				

                            }
                            break;

                    }


                    }


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
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleHwProcessor"
    // InternalMarText.g:252:1: entryRuleHwProcessor returns [EObject current=null] : iv_ruleHwProcessor= ruleHwProcessor EOF ;
    public final EObject entryRuleHwProcessor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHwProcessor = null;


        try {
            // InternalMarText.g:252:52: (iv_ruleHwProcessor= ruleHwProcessor EOF )
            // InternalMarText.g:253:2: iv_ruleHwProcessor= ruleHwProcessor EOF
            {
             newCompositeNode(grammarAccess.getHwProcessorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHwProcessor=ruleHwProcessor();

            state._fsp--;

             current =iv_ruleHwProcessor; 
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
    // $ANTLR end "entryRuleHwProcessor"


    // $ANTLR start "ruleHwProcessor"
    // InternalMarText.g:259:1: ruleHwProcessor returns [EObject current=null] : (otherlv_0= 'processor' () ( (lv_name_2_0= RULE_ID ) ) ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= '{' (otherlv_5= 'cores:' ( (lv_nbCores_6_0= RULE_INT ) ) otherlv_7= ';' )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'caches:' otherlv_9= '{' ( (lv_packagedElement_10_0= ruleComponent ) )* otherlv_11= '};' )? otherlv_12= '};' ) ) ) ) )+ {...}?) ) ) | otherlv_13= ';' ) ) ;
    public final EObject ruleHwProcessor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_nbCores_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        EObject lv_packagedElement_10_0 = null;



        	enterRule();

        try {
            // InternalMarText.g:265:2: ( (otherlv_0= 'processor' () ( (lv_name_2_0= RULE_ID ) ) ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= '{' (otherlv_5= 'cores:' ( (lv_nbCores_6_0= RULE_INT ) ) otherlv_7= ';' )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'caches:' otherlv_9= '{' ( (lv_packagedElement_10_0= ruleComponent ) )* otherlv_11= '};' )? otherlv_12= '};' ) ) ) ) )+ {...}?) ) ) | otherlv_13= ';' ) ) )
            // InternalMarText.g:266:2: (otherlv_0= 'processor' () ( (lv_name_2_0= RULE_ID ) ) ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= '{' (otherlv_5= 'cores:' ( (lv_nbCores_6_0= RULE_INT ) ) otherlv_7= ';' )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'caches:' otherlv_9= '{' ( (lv_packagedElement_10_0= ruleComponent ) )* otherlv_11= '};' )? otherlv_12= '};' ) ) ) ) )+ {...}?) ) ) | otherlv_13= ';' ) )
            {
            // InternalMarText.g:266:2: (otherlv_0= 'processor' () ( (lv_name_2_0= RULE_ID ) ) ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= '{' (otherlv_5= 'cores:' ( (lv_nbCores_6_0= RULE_INT ) ) otherlv_7= ';' )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'caches:' otherlv_9= '{' ( (lv_packagedElement_10_0= ruleComponent ) )* otherlv_11= '};' )? otherlv_12= '};' ) ) ) ) )+ {...}?) ) ) | otherlv_13= ';' ) )
            // InternalMarText.g:267:3: otherlv_0= 'processor' () ( (lv_name_2_0= RULE_ID ) ) ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= '{' (otherlv_5= 'cores:' ( (lv_nbCores_6_0= RULE_INT ) ) otherlv_7= ';' )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'caches:' otherlv_9= '{' ( (lv_packagedElement_10_0= ruleComponent ) )* otherlv_11= '};' )? otherlv_12= '};' ) ) ) ) )+ {...}?) ) ) | otherlv_13= ';' )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getHwProcessorAccess().getProcessorKeyword_0());
            		
            // InternalMarText.g:271:3: ()
            // InternalMarText.g:272:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getHwProcessorAccess().getHwProcessorAction_1(),
            					current);
            			

            }

            // InternalMarText.g:278:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMarText.g:279:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMarText.g:279:4: (lv_name_2_0= RULE_ID )
            // InternalMarText.g:280:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getHwProcessorAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHwProcessorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMarText.g:296:3: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= '{' (otherlv_5= 'cores:' ( (lv_nbCores_6_0= RULE_INT ) ) otherlv_7= ';' )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'caches:' otherlv_9= '{' ( (lv_packagedElement_10_0= ruleComponent ) )* otherlv_11= '};' )? otherlv_12= '};' ) ) ) ) )+ {...}?) ) ) | otherlv_13= ';' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=12 && LA10_0<=13)||LA10_0==18) ) {
                alt10=1;
            }
            else if ( (LA10_0==14) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMarText.g:297:4: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= '{' (otherlv_5= 'cores:' ( (lv_nbCores_6_0= RULE_INT ) ) otherlv_7= ';' )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'caches:' otherlv_9= '{' ( (lv_packagedElement_10_0= ruleComponent ) )* otherlv_11= '};' )? otherlv_12= '};' ) ) ) ) )+ {...}?) ) )
                    {
                    // InternalMarText.g:297:4: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= '{' (otherlv_5= 'cores:' ( (lv_nbCores_6_0= RULE_INT ) ) otherlv_7= ';' )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'caches:' otherlv_9= '{' ( (lv_packagedElement_10_0= ruleComponent ) )* otherlv_11= '};' )? otherlv_12= '};' ) ) ) ) )+ {...}?) ) )
                    // InternalMarText.g:298:5: ( ( ( ({...}? => ( ({...}? => (otherlv_4= '{' (otherlv_5= 'cores:' ( (lv_nbCores_6_0= RULE_INT ) ) otherlv_7= ';' )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'caches:' otherlv_9= '{' ( (lv_packagedElement_10_0= ruleComponent ) )* otherlv_11= '};' )? otherlv_12= '};' ) ) ) ) )+ {...}?) )
                    {
                    // InternalMarText.g:298:5: ( ( ( ({...}? => ( ({...}? => (otherlv_4= '{' (otherlv_5= 'cores:' ( (lv_nbCores_6_0= RULE_INT ) ) otherlv_7= ';' )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'caches:' otherlv_9= '{' ( (lv_packagedElement_10_0= ruleComponent ) )* otherlv_11= '};' )? otherlv_12= '};' ) ) ) ) )+ {...}?) )
                    // InternalMarText.g:299:6: ( ( ({...}? => ( ({...}? => (otherlv_4= '{' (otherlv_5= 'cores:' ( (lv_nbCores_6_0= RULE_INT ) ) otherlv_7= ';' )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'caches:' otherlv_9= '{' ( (lv_packagedElement_10_0= ruleComponent ) )* otherlv_11= '};' )? otherlv_12= '};' ) ) ) ) )+ {...}?)
                    {
                     
                    					  getUnorderedGroupHelper().enter(grammarAccess.getHwProcessorAccess().getUnorderedGroup_3_0());
                    					
                    // InternalMarText.g:302:6: ( ( ({...}? => ( ({...}? => (otherlv_4= '{' (otherlv_5= 'cores:' ( (lv_nbCores_6_0= RULE_INT ) ) otherlv_7= ';' )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'caches:' otherlv_9= '{' ( (lv_packagedElement_10_0= ruleComponent ) )* otherlv_11= '};' )? otherlv_12= '};' ) ) ) ) )+ {...}?)
                    // InternalMarText.g:303:7: ( ({...}? => ( ({...}? => (otherlv_4= '{' (otherlv_5= 'cores:' ( (lv_nbCores_6_0= RULE_INT ) ) otherlv_7= ';' )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'caches:' otherlv_9= '{' ( (lv_packagedElement_10_0= ruleComponent ) )* otherlv_11= '};' )? otherlv_12= '};' ) ) ) ) )+ {...}?
                    {
                    // InternalMarText.g:303:7: ( ({...}? => ( ({...}? => (otherlv_4= '{' (otherlv_5= 'cores:' ( (lv_nbCores_6_0= RULE_INT ) ) otherlv_7= ';' )? ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'caches:' otherlv_9= '{' ( (lv_packagedElement_10_0= ruleComponent ) )* otherlv_11= '};' )? otherlv_12= '};' ) ) ) ) )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=3;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==13) ) {
                            int LA9_1 = input.LA(2);

                            if ( getUnorderedGroupHelper().canSelect(grammarAccess.getHwProcessorAccess().getUnorderedGroup_3_0(), 1) ) {
                                alt9=2;
                            }


                        }
                        else if ( LA9_0 == 12 && getUnorderedGroupHelper().canSelect(grammarAccess.getHwProcessorAccess().getUnorderedGroup_3_0(), 0) ) {
                            alt9=1;
                        }
                        else if ( LA9_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getHwProcessorAccess().getUnorderedGroup_3_0(), 1) ) {
                            alt9=2;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalMarText.g:304:5: ({...}? => ( ({...}? => (otherlv_4= '{' (otherlv_5= 'cores:' ( (lv_nbCores_6_0= RULE_INT ) ) otherlv_7= ';' )? ) ) ) )
                    	    {
                    	    // InternalMarText.g:304:5: ({...}? => ( ({...}? => (otherlv_4= '{' (otherlv_5= 'cores:' ( (lv_nbCores_6_0= RULE_INT ) ) otherlv_7= ';' )? ) ) ) )
                    	    // InternalMarText.g:305:6: {...}? => ( ({...}? => (otherlv_4= '{' (otherlv_5= 'cores:' ( (lv_nbCores_6_0= RULE_INT ) ) otherlv_7= ';' )? ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getHwProcessorAccess().getUnorderedGroup_3_0(), 0) ) {
                    	        throw new FailedPredicateException(input, "ruleHwProcessor", "getUnorderedGroupHelper().canSelect(grammarAccess.getHwProcessorAccess().getUnorderedGroup_3_0(), 0)");
                    	    }
                    	    // InternalMarText.g:305:111: ( ({...}? => (otherlv_4= '{' (otherlv_5= 'cores:' ( (lv_nbCores_6_0= RULE_INT ) ) otherlv_7= ';' )? ) ) )
                    	    // InternalMarText.g:306:7: ({...}? => (otherlv_4= '{' (otherlv_5= 'cores:' ( (lv_nbCores_6_0= RULE_INT ) ) otherlv_7= ';' )? ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getHwProcessorAccess().getUnorderedGroup_3_0(), 0);
                    	    						
                    	    // InternalMarText.g:309:10: ({...}? => (otherlv_4= '{' (otherlv_5= 'cores:' ( (lv_nbCores_6_0= RULE_INT ) ) otherlv_7= ';' )? ) )
                    	    // InternalMarText.g:309:11: {...}? => (otherlv_4= '{' (otherlv_5= 'cores:' ( (lv_nbCores_6_0= RULE_INT ) ) otherlv_7= ';' )? )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleHwProcessor", "true");
                    	    }
                    	    // InternalMarText.g:309:20: (otherlv_4= '{' (otherlv_5= 'cores:' ( (lv_nbCores_6_0= RULE_INT ) ) otherlv_7= ';' )? )
                    	    // InternalMarText.g:309:21: otherlv_4= '{' (otherlv_5= 'cores:' ( (lv_nbCores_6_0= RULE_INT ) ) otherlv_7= ';' )?
                    	    {
                    	    otherlv_4=(Token)match(input,12,FOLLOW_7); 

                    	    										newLeafNode(otherlv_4, grammarAccess.getHwProcessorAccess().getLeftCurlyBracketKeyword_3_0_0_0());
                    	    									
                    	    // InternalMarText.g:313:10: (otherlv_5= 'cores:' ( (lv_nbCores_6_0= RULE_INT ) ) otherlv_7= ';' )?
                    	    int alt6=2;
                    	    int LA6_0 = input.LA(1);

                    	    if ( (LA6_0==17) ) {
                    	        alt6=1;
                    	    }
                    	    switch (alt6) {
                    	        case 1 :
                    	            // InternalMarText.g:314:11: otherlv_5= 'cores:' ( (lv_nbCores_6_0= RULE_INT ) ) otherlv_7= ';'
                    	            {
                    	            otherlv_5=(Token)match(input,17,FOLLOW_8); 

                    	            											newLeafNode(otherlv_5, grammarAccess.getHwProcessorAccess().getCoresKeyword_3_0_0_1_0());
                    	            										
                    	            // InternalMarText.g:318:11: ( (lv_nbCores_6_0= RULE_INT ) )
                    	            // InternalMarText.g:319:12: (lv_nbCores_6_0= RULE_INT )
                    	            {
                    	            // InternalMarText.g:319:12: (lv_nbCores_6_0= RULE_INT )
                    	            // InternalMarText.g:320:13: lv_nbCores_6_0= RULE_INT
                    	            {
                    	            lv_nbCores_6_0=(Token)match(input,RULE_INT,FOLLOW_9); 

                    	            													newLeafNode(lv_nbCores_6_0, grammarAccess.getHwProcessorAccess().getNbCoresINTTerminalRuleCall_3_0_0_1_1_0());
                    	            												

                    	            													if (current==null) {
                    	            														current = createModelElement(grammarAccess.getHwProcessorRule());
                    	            													}
                    	            													setWithLastConsumed(
                    	            														current,
                    	            														"nbCores",
                    	            														lv_nbCores_6_0,
                    	            														"org.eclipse.xtext.common.Terminals.INT");
                    	            												

                    	            }


                    	            }

                    	            otherlv_7=(Token)match(input,14,FOLLOW_10); 

                    	            											newLeafNode(otherlv_7, grammarAccess.getHwProcessorAccess().getSemicolonKeyword_3_0_0_1_2());
                    	            										

                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }

                    	     
                    	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getHwProcessorAccess().getUnorderedGroup_3_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMarText.g:347:5: ({...}? => ( ({...}? => ( (otherlv_8= 'caches:' otherlv_9= '{' ( (lv_packagedElement_10_0= ruleComponent ) )* otherlv_11= '};' )? otherlv_12= '};' ) ) ) )
                    	    {
                    	    // InternalMarText.g:347:5: ({...}? => ( ({...}? => ( (otherlv_8= 'caches:' otherlv_9= '{' ( (lv_packagedElement_10_0= ruleComponent ) )* otherlv_11= '};' )? otherlv_12= '};' ) ) ) )
                    	    // InternalMarText.g:348:6: {...}? => ( ({...}? => ( (otherlv_8= 'caches:' otherlv_9= '{' ( (lv_packagedElement_10_0= ruleComponent ) )* otherlv_11= '};' )? otherlv_12= '};' ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getHwProcessorAccess().getUnorderedGroup_3_0(), 1) ) {
                    	        throw new FailedPredicateException(input, "ruleHwProcessor", "getUnorderedGroupHelper().canSelect(grammarAccess.getHwProcessorAccess().getUnorderedGroup_3_0(), 1)");
                    	    }
                    	    // InternalMarText.g:348:111: ( ({...}? => ( (otherlv_8= 'caches:' otherlv_9= '{' ( (lv_packagedElement_10_0= ruleComponent ) )* otherlv_11= '};' )? otherlv_12= '};' ) ) )
                    	    // InternalMarText.g:349:7: ({...}? => ( (otherlv_8= 'caches:' otherlv_9= '{' ( (lv_packagedElement_10_0= ruleComponent ) )* otherlv_11= '};' )? otherlv_12= '};' ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getHwProcessorAccess().getUnorderedGroup_3_0(), 1);
                    	    						
                    	    // InternalMarText.g:352:10: ({...}? => ( (otherlv_8= 'caches:' otherlv_9= '{' ( (lv_packagedElement_10_0= ruleComponent ) )* otherlv_11= '};' )? otherlv_12= '};' ) )
                    	    // InternalMarText.g:352:11: {...}? => ( (otherlv_8= 'caches:' otherlv_9= '{' ( (lv_packagedElement_10_0= ruleComponent ) )* otherlv_11= '};' )? otherlv_12= '};' )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleHwProcessor", "true");
                    	    }
                    	    // InternalMarText.g:352:20: ( (otherlv_8= 'caches:' otherlv_9= '{' ( (lv_packagedElement_10_0= ruleComponent ) )* otherlv_11= '};' )? otherlv_12= '};' )
                    	    // InternalMarText.g:352:21: (otherlv_8= 'caches:' otherlv_9= '{' ( (lv_packagedElement_10_0= ruleComponent ) )* otherlv_11= '};' )? otherlv_12= '};'
                    	    {
                    	    // InternalMarText.g:352:21: (otherlv_8= 'caches:' otherlv_9= '{' ( (lv_packagedElement_10_0= ruleComponent ) )* otherlv_11= '};' )?
                    	    int alt8=2;
                    	    int LA8_0 = input.LA(1);

                    	    if ( (LA8_0==18) ) {
                    	        alt8=1;
                    	    }
                    	    switch (alt8) {
                    	        case 1 :
                    	            // InternalMarText.g:353:11: otherlv_8= 'caches:' otherlv_9= '{' ( (lv_packagedElement_10_0= ruleComponent ) )* otherlv_11= '};'
                    	            {
                    	            otherlv_8=(Token)match(input,18,FOLLOW_11); 

                    	            											newLeafNode(otherlv_8, grammarAccess.getHwProcessorAccess().getCachesKeyword_3_0_1_0_0());
                    	            										
                    	            otherlv_9=(Token)match(input,12,FOLLOW_5); 

                    	            											newLeafNode(otherlv_9, grammarAccess.getHwProcessorAccess().getLeftCurlyBracketKeyword_3_0_1_0_1());
                    	            										
                    	            // InternalMarText.g:361:11: ( (lv_packagedElement_10_0= ruleComponent ) )*
                    	            loop7:
                    	            do {
                    	                int alt7=2;
                    	                int LA7_0 = input.LA(1);

                    	                if ( ((LA7_0>=15 && LA7_0<=16)||LA7_0==19) ) {
                    	                    alt7=1;
                    	                }


                    	                switch (alt7) {
                    	            	case 1 :
                    	            	    // InternalMarText.g:362:12: (lv_packagedElement_10_0= ruleComponent )
                    	            	    {
                    	            	    // InternalMarText.g:362:12: (lv_packagedElement_10_0= ruleComponent )
                    	            	    // InternalMarText.g:363:13: lv_packagedElement_10_0= ruleComponent
                    	            	    {

                    	            	    													newCompositeNode(grammarAccess.getHwProcessorAccess().getPackagedElementComponentParserRuleCall_3_0_1_0_2_0());
                    	            	    												
                    	            	    pushFollow(FOLLOW_5);
                    	            	    lv_packagedElement_10_0=ruleComponent();

                    	            	    state._fsp--;


                    	            	    													if (current==null) {
                    	            	    														current = createModelElementForParent(grammarAccess.getHwProcessorRule());
                    	            	    													}
                    	            	    													add(
                    	            	    														current,
                    	            	    														"packagedElement",
                    	            	    														lv_packagedElement_10_0,
                    	            	    														"org.eclipse.papyrus.uml.marte.MarText.Component");
                    	            	    													afterParserOrEnumRuleCall();
                    	            	    												

                    	            	    }


                    	            	    }
                    	            	    break;

                    	            	default :
                    	            	    break loop7;
                    	                }
                    	            } while (true);

                    	            otherlv_11=(Token)match(input,13,FOLLOW_12); 

                    	            											newLeafNode(otherlv_11, grammarAccess.getHwProcessorAccess().getRightCurlyBracketSemicolonKeyword_3_0_1_0_3());
                    	            										

                    	            }
                    	            break;

                    	    }

                    	    otherlv_12=(Token)match(input,13,FOLLOW_10); 

                    	    										newLeafNode(otherlv_12, grammarAccess.getHwProcessorAccess().getRightCurlyBracketSemicolonKeyword_3_0_1_1());
                    	    									

                    	    }


                    	    }

                    	     
                    	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getHwProcessorAccess().getUnorderedGroup_3_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt9 >= 1 ) break loop9;
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                throw eee;
                        }
                        cnt9++;
                    } while (true);

                    if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getHwProcessorAccess().getUnorderedGroup_3_0()) ) {
                        throw new FailedPredicateException(input, "ruleHwProcessor", "getUnorderedGroupHelper().canLeave(grammarAccess.getHwProcessorAccess().getUnorderedGroup_3_0())");
                    }

                    }


                    }

                     
                    					  getUnorderedGroupHelper().leave(grammarAccess.getHwProcessorAccess().getUnorderedGroup_3_0());
                    					

                    }


                    }
                    break;
                case 2 :
                    // InternalMarText.g:404:4: otherlv_13= ';'
                    {
                    otherlv_13=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_13, grammarAccess.getHwProcessorAccess().getSemicolonKeyword_3_1());
                    			

                    }
                    break;

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
    // $ANTLR end "ruleHwProcessor"


    // $ANTLR start "entryRuleHwCache"
    // InternalMarText.g:413:1: entryRuleHwCache returns [EObject current=null] : iv_ruleHwCache= ruleHwCache EOF ;
    public final EObject entryRuleHwCache() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHwCache = null;


        try {
            // InternalMarText.g:413:48: (iv_ruleHwCache= ruleHwCache EOF )
            // InternalMarText.g:414:2: iv_ruleHwCache= ruleHwCache EOF
            {
             newCompositeNode(grammarAccess.getHwCacheRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHwCache=ruleHwCache();

            state._fsp--;

             current =iv_ruleHwCache; 
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
    // $ANTLR end "entryRuleHwCache"


    // $ANTLR start "ruleHwCache"
    // InternalMarText.g:420:1: ruleHwCache returns [EObject current=null] : (otherlv_0= 'cache' () ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= '{' (otherlv_4= 'level:' ( (lv_level_5_0= RULE_INT ) ) otherlv_6= ';' )? otherlv_7= '};' ) | otherlv_8= ';' ) ) ;
    public final EObject ruleHwCache() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_level_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalMarText.g:426:2: ( (otherlv_0= 'cache' () ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= '{' (otherlv_4= 'level:' ( (lv_level_5_0= RULE_INT ) ) otherlv_6= ';' )? otherlv_7= '};' ) | otherlv_8= ';' ) ) )
            // InternalMarText.g:427:2: (otherlv_0= 'cache' () ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= '{' (otherlv_4= 'level:' ( (lv_level_5_0= RULE_INT ) ) otherlv_6= ';' )? otherlv_7= '};' ) | otherlv_8= ';' ) )
            {
            // InternalMarText.g:427:2: (otherlv_0= 'cache' () ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= '{' (otherlv_4= 'level:' ( (lv_level_5_0= RULE_INT ) ) otherlv_6= ';' )? otherlv_7= '};' ) | otherlv_8= ';' ) )
            // InternalMarText.g:428:3: otherlv_0= 'cache' () ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= '{' (otherlv_4= 'level:' ( (lv_level_5_0= RULE_INT ) ) otherlv_6= ';' )? otherlv_7= '};' ) | otherlv_8= ';' )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getHwCacheAccess().getCacheKeyword_0());
            		
            // InternalMarText.g:432:3: ()
            // InternalMarText.g:433:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getHwCacheAccess().getHwCacheAction_1(),
            					current);
            			

            }

            // InternalMarText.g:439:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMarText.g:440:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMarText.g:440:4: (lv_name_2_0= RULE_ID )
            // InternalMarText.g:441:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_2_0, grammarAccess.getHwCacheAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHwCacheRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMarText.g:457:3: ( (otherlv_3= '{' (otherlv_4= 'level:' ( (lv_level_5_0= RULE_INT ) ) otherlv_6= ';' )? otherlv_7= '};' ) | otherlv_8= ';' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==12) ) {
                alt12=1;
            }
            else if ( (LA12_0==14) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalMarText.g:458:4: (otherlv_3= '{' (otherlv_4= 'level:' ( (lv_level_5_0= RULE_INT ) ) otherlv_6= ';' )? otherlv_7= '};' )
                    {
                    // InternalMarText.g:458:4: (otherlv_3= '{' (otherlv_4= 'level:' ( (lv_level_5_0= RULE_INT ) ) otherlv_6= ';' )? otherlv_7= '};' )
                    // InternalMarText.g:459:5: otherlv_3= '{' (otherlv_4= 'level:' ( (lv_level_5_0= RULE_INT ) ) otherlv_6= ';' )? otherlv_7= '};'
                    {
                    otherlv_3=(Token)match(input,12,FOLLOW_13); 

                    					newLeafNode(otherlv_3, grammarAccess.getHwCacheAccess().getLeftCurlyBracketKeyword_3_0_0());
                    				
                    // InternalMarText.g:463:5: (otherlv_4= 'level:' ( (lv_level_5_0= RULE_INT ) ) otherlv_6= ';' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==20) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalMarText.g:464:6: otherlv_4= 'level:' ( (lv_level_5_0= RULE_INT ) ) otherlv_6= ';'
                            {
                            otherlv_4=(Token)match(input,20,FOLLOW_8); 

                            						newLeafNode(otherlv_4, grammarAccess.getHwCacheAccess().getLevelKeyword_3_0_1_0());
                            					
                            // InternalMarText.g:468:6: ( (lv_level_5_0= RULE_INT ) )
                            // InternalMarText.g:469:7: (lv_level_5_0= RULE_INT )
                            {
                            // InternalMarText.g:469:7: (lv_level_5_0= RULE_INT )
                            // InternalMarText.g:470:8: lv_level_5_0= RULE_INT
                            {
                            lv_level_5_0=(Token)match(input,RULE_INT,FOLLOW_9); 

                            								newLeafNode(lv_level_5_0, grammarAccess.getHwCacheAccess().getLevelINTTerminalRuleCall_3_0_1_1_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getHwCacheRule());
                            								}
                            								setWithLastConsumed(
                            									current,
                            									"level",
                            									lv_level_5_0,
                            									"org.eclipse.xtext.common.Terminals.INT");
                            							

                            }


                            }

                            otherlv_6=(Token)match(input,14,FOLLOW_12); 

                            						newLeafNode(otherlv_6, grammarAccess.getHwCacheAccess().getSemicolonKeyword_3_0_1_2());
                            					

                            }
                            break;

                    }

                    otherlv_7=(Token)match(input,13,FOLLOW_2); 

                    					newLeafNode(otherlv_7, grammarAccess.getHwCacheAccess().getRightCurlyBracketSemicolonKeyword_3_0_2());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalMarText.g:497:4: otherlv_8= ';'
                    {
                    otherlv_8=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getHwCacheAccess().getSemicolonKeyword_3_1());
                    			

                    }
                    break;

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
    // $ANTLR end "ruleHwCache"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000009A000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000047000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000063002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000043002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000102000L});

}

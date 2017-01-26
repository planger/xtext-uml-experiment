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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'protocol'", "'{'", "'}'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
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
        	return "Root";
       	}

       	@Override
       	protected UmlRtTextGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRoot"
    // InternalUmlRtText.g:64:1: entryRuleRoot returns [EObject current=null] : iv_ruleRoot= ruleRoot EOF ;
    public final EObject entryRuleRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoot = null;


        try {
            // InternalUmlRtText.g:64:45: (iv_ruleRoot= ruleRoot EOF )
            // InternalUmlRtText.g:65:2: iv_ruleRoot= ruleRoot EOF
            {
             newCompositeNode(grammarAccess.getRootRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRoot=ruleRoot();

            state._fsp--;

             current =iv_ruleRoot; 
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
    // $ANTLR end "entryRuleRoot"


    // $ANTLR start "ruleRoot"
    // InternalUmlRtText.g:71:1: ruleRoot returns [EObject current=null] : ( () ( (lv_packagedElement_1_0= ruleElement ) )* ) ;
    public final EObject ruleRoot() throws RecognitionException {
        EObject current = null;

        EObject lv_packagedElement_1_0 = null;



        	enterRule();

        try {
            // InternalUmlRtText.g:77:2: ( ( () ( (lv_packagedElement_1_0= ruleElement ) )* ) )
            // InternalUmlRtText.g:78:2: ( () ( (lv_packagedElement_1_0= ruleElement ) )* )
            {
            // InternalUmlRtText.g:78:2: ( () ( (lv_packagedElement_1_0= ruleElement ) )* )
            // InternalUmlRtText.g:79:3: () ( (lv_packagedElement_1_0= ruleElement ) )*
            {
            // InternalUmlRtText.g:79:3: ()
            // InternalUmlRtText.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRootAccess().getModelAction_0(),
            					current);
            			

            }

            // InternalUmlRtText.g:86:3: ( (lv_packagedElement_1_0= ruleElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalUmlRtText.g:87:4: (lv_packagedElement_1_0= ruleElement )
            	    {
            	    // InternalUmlRtText.g:87:4: (lv_packagedElement_1_0= ruleElement )
            	    // InternalUmlRtText.g:88:5: lv_packagedElement_1_0= ruleElement
            	    {

            	    					newCompositeNode(grammarAccess.getRootAccess().getPackagedElementElementParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_packagedElement_1_0=ruleElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRootRule());
            	    					}
            	    					add(
            	    						current,
            	    						"packagedElement",
            	    						lv_packagedElement_1_0,
            	    						"org.eclipse.papyrusrt.umlrt.UmlRtText.Element");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
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
    // $ANTLR end "ruleRoot"


    // $ANTLR start "entryRuleElement"
    // InternalUmlRtText.g:109:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalUmlRtText.g:109:48: (iv_ruleElement= ruleElement EOF )
            // InternalUmlRtText.g:110:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalUmlRtText.g:116:1: ruleElement returns [EObject current=null] : this_Protocol_0= ruleProtocol ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_Protocol_0 = null;



        	enterRule();

        try {
            // InternalUmlRtText.g:122:2: (this_Protocol_0= ruleProtocol )
            // InternalUmlRtText.g:123:2: this_Protocol_0= ruleProtocol
            {

            		newCompositeNode(grammarAccess.getElementAccess().getProtocolParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Protocol_0=ruleProtocol();

            state._fsp--;


            		current = this_Protocol_0;
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
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleProtocol"
    // InternalUmlRtText.g:134:1: entryRuleProtocol returns [EObject current=null] : iv_ruleProtocol= ruleProtocol EOF ;
    public final EObject entryRuleProtocol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtocol = null;


        try {
            // InternalUmlRtText.g:134:49: (iv_ruleProtocol= ruleProtocol EOF )
            // InternalUmlRtText.g:135:2: iv_ruleProtocol= ruleProtocol EOF
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
    // InternalUmlRtText.g:141:1: ruleProtocol returns [EObject current=null] : ( () otherlv_1= 'protocol' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= '}' ) ;
    public final EObject ruleProtocol() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalUmlRtText.g:147:2: ( ( () otherlv_1= 'protocol' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= '}' ) )
            // InternalUmlRtText.g:148:2: ( () otherlv_1= 'protocol' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= '}' )
            {
            // InternalUmlRtText.g:148:2: ( () otherlv_1= 'protocol' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= '}' )
            // InternalUmlRtText.g:149:3: () otherlv_1= 'protocol' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= '}'
            {
            // InternalUmlRtText.g:149:3: ()
            // InternalUmlRtText.g:150:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProtocolAccess().getPackageAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getProtocolAccess().getProtocolKeyword_1());
            		
            // InternalUmlRtText.g:160:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalUmlRtText.g:161:4: (lv_name_2_0= RULE_ID )
            {
            // InternalUmlRtText.g:161:4: (lv_name_2_0= RULE_ID )
            // InternalUmlRtText.g:162:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_5); 

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

            otherlv_3=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getProtocolAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getProtocolAccess().getRightCurlyBracketKeyword_4());
            		

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});

}
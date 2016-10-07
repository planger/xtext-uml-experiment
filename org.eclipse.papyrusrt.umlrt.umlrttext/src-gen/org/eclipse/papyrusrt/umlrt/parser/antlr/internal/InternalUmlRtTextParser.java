package org.eclipse.papyrusrt.umlrt.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_UML_BOOLEAN", "RULE_UML_STRING", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'model'", "'{'", "'}'", "'class'", "'redefinable_element'", "'package'", "'state_machine'", "'region'", "'capsule'", "'capsule_part'", "'is_notification'", "'is_publish'", "'is_wired'", "'registration'", "'registration_override'", "'protocol'", "'rt_port'", "'rt_connector'", "'protocol_container'", "'rt_redefined_element'", "'root_fragment'", "'rt_message_set'", "'rt_state_machine'", "'is_passive'", "'rt_region'", "'rt_state'", "'rt_pseudostate'", "'rt_trigger'", "'rt_guard'", "'automatic'", "'application'", "'automaticLocked'", "'in'", "'out'", "'inOut'", "'public'", "'private'", "'protected'", "'initial'", "'deepHistory'", "'shallowHistory'", "'join'", "'fork'", "'junction'", "'choice'", "'entryPoint'", "'exitPoint'", "'terminate'"
    };
    public static final int T__50=50;
    public static final int RULE_UML_BOOLEAN=5;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int RULE_ID=4;
    public static final int RULE_UML_STRING=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

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
    // InternalUmlRtText.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalUmlRtText.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalUmlRtText.g:66:2: iv_ruleModel= ruleModel EOF
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
    // InternalUmlRtText.g:72:1: ruleModel returns [EObject current=null] : (otherlv_0= 'model' () ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_packagedElement_4_0= rulePackageableElement ) )* otherlv_5= '}' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_packagedElement_4_0 = null;



        	enterRule();

        try {
            // InternalUmlRtText.g:78:2: ( (otherlv_0= 'model' () ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_packagedElement_4_0= rulePackageableElement ) )* otherlv_5= '}' ) )
            // InternalUmlRtText.g:79:2: (otherlv_0= 'model' () ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_packagedElement_4_0= rulePackageableElement ) )* otherlv_5= '}' )
            {
            // InternalUmlRtText.g:79:2: (otherlv_0= 'model' () ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_packagedElement_4_0= rulePackageableElement ) )* otherlv_5= '}' )
            // InternalUmlRtText.g:80:3: otherlv_0= 'model' () ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_packagedElement_4_0= rulePackageableElement ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getModelKeyword_0());
            		
            // InternalUmlRtText.g:84:3: ()
            // InternalUmlRtText.g:85:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getModelAccess().getModelAction_1(),
            					current);
            			

            }

            // InternalUmlRtText.g:91:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalUmlRtText.g:92:4: (lv_name_2_0= RULE_ID )
            {
            // InternalUmlRtText.g:92:4: (lv_name_2_0= RULE_ID )
            // InternalUmlRtText.g:93:5: lv_name_2_0= RULE_ID
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

            otherlv_3=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalUmlRtText.g:113:3: ( (lv_packagedElement_4_0= rulePackageableElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13||LA1_0==16||LA1_0==18||LA1_0==21||LA1_0==31) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalUmlRtText.g:114:4: (lv_packagedElement_4_0= rulePackageableElement )
            	    {
            	    // InternalUmlRtText.g:114:4: (lv_packagedElement_4_0= rulePackageableElement )
            	    // InternalUmlRtText.g:115:5: lv_packagedElement_4_0= rulePackageableElement
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

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

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
    // InternalUmlRtText.g:140:1: entryRulePackageableElement returns [EObject current=null] : iv_rulePackageableElement= rulePackageableElement EOF ;
    public final EObject entryRulePackageableElement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageableElement = null;


        try {
            // InternalUmlRtText.g:140:59: (iv_rulePackageableElement= rulePackageableElement EOF )
            // InternalUmlRtText.g:141:2: iv_rulePackageableElement= rulePackageableElement EOF
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
    // InternalUmlRtText.g:147:1: rulePackageableElement returns [EObject current=null] : (this_Package_0= rulePackage | this_Class_1= ruleClass ) ;
    public final EObject rulePackageableElement() throws RecognitionException {
        EObject current = null;

        EObject this_Package_0 = null;

        EObject this_Class_1 = null;



        	enterRule();

        try {
            // InternalUmlRtText.g:153:2: ( (this_Package_0= rulePackage | this_Class_1= ruleClass ) )
            // InternalUmlRtText.g:154:2: (this_Package_0= rulePackage | this_Class_1= ruleClass )
            {
            // InternalUmlRtText.g:154:2: (this_Package_0= rulePackage | this_Class_1= ruleClass )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13||LA2_0==18||LA2_0==31) ) {
                alt2=1;
            }
            else if ( (LA2_0==16||LA2_0==21) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalUmlRtText.g:155:3: this_Package_0= rulePackage
                    {

                    			newCompositeNode(grammarAccess.getPackageableElementAccess().getPackageParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Package_0=rulePackage();

                    state._fsp--;


                    			current = this_Package_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUmlRtText.g:164:3: this_Class_1= ruleClass
                    {

                    			newCompositeNode(grammarAccess.getPackageableElementAccess().getClassParserRuleCall_1());
                    		
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
    // $ANTLR end "rulePackageableElement"


    // $ANTLR start "entryRuleClass"
    // InternalUmlRtText.g:176:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // InternalUmlRtText.g:176:46: (iv_ruleClass= ruleClass EOF )
            // InternalUmlRtText.g:177:2: iv_ruleClass= ruleClass EOF
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
    // InternalUmlRtText.g:183:1: ruleClass returns [EObject current=null] : ( (this_Capsule_0= ruleCapsule | (otherlv_1= 'class' () ( (lv_name_3_0= RULE_ID ) ) ) ) (otherlv_4= '{' otherlv_5= '}' )? ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject this_Capsule_0 = null;



        	enterRule();

        try {
            // InternalUmlRtText.g:189:2: ( ( (this_Capsule_0= ruleCapsule | (otherlv_1= 'class' () ( (lv_name_3_0= RULE_ID ) ) ) ) (otherlv_4= '{' otherlv_5= '}' )? ) )
            // InternalUmlRtText.g:190:2: ( (this_Capsule_0= ruleCapsule | (otherlv_1= 'class' () ( (lv_name_3_0= RULE_ID ) ) ) ) (otherlv_4= '{' otherlv_5= '}' )? )
            {
            // InternalUmlRtText.g:190:2: ( (this_Capsule_0= ruleCapsule | (otherlv_1= 'class' () ( (lv_name_3_0= RULE_ID ) ) ) ) (otherlv_4= '{' otherlv_5= '}' )? )
            // InternalUmlRtText.g:191:3: (this_Capsule_0= ruleCapsule | (otherlv_1= 'class' () ( (lv_name_3_0= RULE_ID ) ) ) ) (otherlv_4= '{' otherlv_5= '}' )?
            {
            // InternalUmlRtText.g:191:3: (this_Capsule_0= ruleCapsule | (otherlv_1= 'class' () ( (lv_name_3_0= RULE_ID ) ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==21) ) {
                alt3=1;
            }
            else if ( (LA3_0==16) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalUmlRtText.g:192:4: this_Capsule_0= ruleCapsule
                    {

                    				newCompositeNode(grammarAccess.getClassAccess().getCapsuleParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_6);
                    this_Capsule_0=ruleCapsule();

                    state._fsp--;


                    				current = this_Capsule_0;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalUmlRtText.g:201:4: (otherlv_1= 'class' () ( (lv_name_3_0= RULE_ID ) ) )
                    {
                    // InternalUmlRtText.g:201:4: (otherlv_1= 'class' () ( (lv_name_3_0= RULE_ID ) ) )
                    // InternalUmlRtText.g:202:5: otherlv_1= 'class' () ( (lv_name_3_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,16,FOLLOW_3); 

                    					newLeafNode(otherlv_1, grammarAccess.getClassAccess().getClassKeyword_0_1_0());
                    				
                    // InternalUmlRtText.g:206:5: ()
                    // InternalUmlRtText.g:207:6: 
                    {

                    						current = forceCreateModelElement(
                    							grammarAccess.getClassAccess().getClassAction_0_1_1(),
                    							current);
                    					

                    }

                    // InternalUmlRtText.g:213:5: ( (lv_name_3_0= RULE_ID ) )
                    // InternalUmlRtText.g:214:6: (lv_name_3_0= RULE_ID )
                    {
                    // InternalUmlRtText.g:214:6: (lv_name_3_0= RULE_ID )
                    // InternalUmlRtText.g:215:7: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_6); 

                    							newLeafNode(lv_name_3_0, grammarAccess.getClassAccess().getNameIDTerminalRuleCall_0_1_2_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getClassRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"name",
                    								lv_name_3_0,
                    								"org.eclipse.xtext.common.Terminals.ID");
                    						

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalUmlRtText.g:233:3: (otherlv_4= '{' otherlv_5= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalUmlRtText.g:234:4: otherlv_4= '{' otherlv_5= '}'
                    {
                    otherlv_4=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_1_0());
                    			
                    otherlv_5=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_1_1());
                    			

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
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleRedefinableElement"
    // InternalUmlRtText.g:247:1: entryRuleRedefinableElement returns [EObject current=null] : iv_ruleRedefinableElement= ruleRedefinableElement EOF ;
    public final EObject entryRuleRedefinableElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRedefinableElement = null;


        try {
            // InternalUmlRtText.g:247:59: (iv_ruleRedefinableElement= ruleRedefinableElement EOF )
            // InternalUmlRtText.g:248:2: iv_ruleRedefinableElement= ruleRedefinableElement EOF
            {
             newCompositeNode(grammarAccess.getRedefinableElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRedefinableElement=ruleRedefinableElement();

            state._fsp--;

             current =iv_ruleRedefinableElement; 
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
    // $ANTLR end "entryRuleRedefinableElement"


    // $ANTLR start "ruleRedefinableElement"
    // InternalUmlRtText.g:254:1: ruleRedefinableElement returns [EObject current=null] : (this_RTRedefinedElement_0= ruleRTRedefinedElement | (otherlv_1= 'redefinable_element' () ( (lv_name_3_0= RULE_ID ) ) ) ) ;
    public final EObject ruleRedefinableElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_3_0=null;
        EObject this_RTRedefinedElement_0 = null;



        	enterRule();

        try {
            // InternalUmlRtText.g:260:2: ( (this_RTRedefinedElement_0= ruleRTRedefinedElement | (otherlv_1= 'redefinable_element' () ( (lv_name_3_0= RULE_ID ) ) ) ) )
            // InternalUmlRtText.g:261:2: (this_RTRedefinedElement_0= ruleRTRedefinedElement | (otherlv_1= 'redefinable_element' () ( (lv_name_3_0= RULE_ID ) ) ) )
            {
            // InternalUmlRtText.g:261:2: (this_RTRedefinedElement_0= ruleRTRedefinedElement | (otherlv_1= 'redefinable_element' () ( (lv_name_3_0= RULE_ID ) ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==32) ) {
                alt5=1;
            }
            else if ( (LA5_0==17) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalUmlRtText.g:262:3: this_RTRedefinedElement_0= ruleRTRedefinedElement
                    {

                    			newCompositeNode(grammarAccess.getRedefinableElementAccess().getRTRedefinedElementParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_RTRedefinedElement_0=ruleRTRedefinedElement();

                    state._fsp--;


                    			current = this_RTRedefinedElement_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUmlRtText.g:271:3: (otherlv_1= 'redefinable_element' () ( (lv_name_3_0= RULE_ID ) ) )
                    {
                    // InternalUmlRtText.g:271:3: (otherlv_1= 'redefinable_element' () ( (lv_name_3_0= RULE_ID ) ) )
                    // InternalUmlRtText.g:272:4: otherlv_1= 'redefinable_element' () ( (lv_name_3_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getRedefinableElementAccess().getRedefinable_elementKeyword_1_0());
                    			
                    // InternalUmlRtText.g:276:4: ()
                    // InternalUmlRtText.g:277:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getRedefinableElementAccess().getRedefinableElementAction_1_1(),
                    						current);
                    				

                    }

                    // InternalUmlRtText.g:283:4: ( (lv_name_3_0= RULE_ID ) )
                    // InternalUmlRtText.g:284:5: (lv_name_3_0= RULE_ID )
                    {
                    // InternalUmlRtText.g:284:5: (lv_name_3_0= RULE_ID )
                    // InternalUmlRtText.g:285:6: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_name_3_0, grammarAccess.getRedefinableElementAccess().getNameIDTerminalRuleCall_1_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRedefinableElementRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_3_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


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
    // $ANTLR end "ruleRedefinableElement"


    // $ANTLR start "entryRulePackage"
    // InternalUmlRtText.g:306:1: entryRulePackage returns [EObject current=null] : iv_rulePackage= rulePackage EOF ;
    public final EObject entryRulePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage = null;


        try {
            // InternalUmlRtText.g:306:48: (iv_rulePackage= rulePackage EOF )
            // InternalUmlRtText.g:307:2: iv_rulePackage= rulePackage EOF
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
    // InternalUmlRtText.g:313:1: rulePackage returns [EObject current=null] : (this_ProtocolContainer_0= ruleProtocolContainer | this_Model_1= ruleModel | (otherlv_2= 'package' () ( (lv_name_4_0= RULE_ID ) ) ) ) ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_name_4_0=null;
        EObject this_ProtocolContainer_0 = null;

        EObject this_Model_1 = null;



        	enterRule();

        try {
            // InternalUmlRtText.g:319:2: ( (this_ProtocolContainer_0= ruleProtocolContainer | this_Model_1= ruleModel | (otherlv_2= 'package' () ( (lv_name_4_0= RULE_ID ) ) ) ) )
            // InternalUmlRtText.g:320:2: (this_ProtocolContainer_0= ruleProtocolContainer | this_Model_1= ruleModel | (otherlv_2= 'package' () ( (lv_name_4_0= RULE_ID ) ) ) )
            {
            // InternalUmlRtText.g:320:2: (this_ProtocolContainer_0= ruleProtocolContainer | this_Model_1= ruleModel | (otherlv_2= 'package' () ( (lv_name_4_0= RULE_ID ) ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt6=1;
                }
                break;
            case 13:
                {
                alt6=2;
                }
                break;
            case 18:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalUmlRtText.g:321:3: this_ProtocolContainer_0= ruleProtocolContainer
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
                    // InternalUmlRtText.g:330:3: this_Model_1= ruleModel
                    {

                    			newCompositeNode(grammarAccess.getPackageAccess().getModelParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Model_1=ruleModel();

                    state._fsp--;


                    			current = this_Model_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalUmlRtText.g:339:3: (otherlv_2= 'package' () ( (lv_name_4_0= RULE_ID ) ) )
                    {
                    // InternalUmlRtText.g:339:3: (otherlv_2= 'package' () ( (lv_name_4_0= RULE_ID ) ) )
                    // InternalUmlRtText.g:340:4: otherlv_2= 'package' () ( (lv_name_4_0= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getPackageAccess().getPackageKeyword_2_0());
                    			
                    // InternalUmlRtText.g:344:4: ()
                    // InternalUmlRtText.g:345:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPackageAccess().getPackageAction_2_1(),
                    						current);
                    				

                    }

                    // InternalUmlRtText.g:351:4: ( (lv_name_4_0= RULE_ID ) )
                    // InternalUmlRtText.g:352:5: (lv_name_4_0= RULE_ID )
                    {
                    // InternalUmlRtText.g:352:5: (lv_name_4_0= RULE_ID )
                    // InternalUmlRtText.g:353:6: lv_name_4_0= RULE_ID
                    {
                    lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_name_4_0, grammarAccess.getPackageAccess().getNameIDTerminalRuleCall_2_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPackageRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_4_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


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
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRuleStateMachine"
    // InternalUmlRtText.g:374:1: entryRuleStateMachine returns [EObject current=null] : iv_ruleStateMachine= ruleStateMachine EOF ;
    public final EObject entryRuleStateMachine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateMachine = null;


        try {
            // InternalUmlRtText.g:374:53: (iv_ruleStateMachine= ruleStateMachine EOF )
            // InternalUmlRtText.g:375:2: iv_ruleStateMachine= ruleStateMachine EOF
            {
             newCompositeNode(grammarAccess.getStateMachineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStateMachine=ruleStateMachine();

            state._fsp--;

             current =iv_ruleStateMachine; 
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
    // $ANTLR end "entryRuleStateMachine"


    // $ANTLR start "ruleStateMachine"
    // InternalUmlRtText.g:381:1: ruleStateMachine returns [EObject current=null] : (this_RTStateMachine_0= ruleRTStateMachine | (otherlv_1= 'state_machine' () ( (lv_name_3_0= RULE_ID ) ) ) ) ;
    public final EObject ruleStateMachine() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_3_0=null;
        EObject this_RTStateMachine_0 = null;



        	enterRule();

        try {
            // InternalUmlRtText.g:387:2: ( (this_RTStateMachine_0= ruleRTStateMachine | (otherlv_1= 'state_machine' () ( (lv_name_3_0= RULE_ID ) ) ) ) )
            // InternalUmlRtText.g:388:2: (this_RTStateMachine_0= ruleRTStateMachine | (otherlv_1= 'state_machine' () ( (lv_name_3_0= RULE_ID ) ) ) )
            {
            // InternalUmlRtText.g:388:2: (this_RTStateMachine_0= ruleRTStateMachine | (otherlv_1= 'state_machine' () ( (lv_name_3_0= RULE_ID ) ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18||LA7_0==35||(LA7_0>=48 && LA7_0<=50)) ) {
                alt7=1;
            }
            else if ( (LA7_0==19) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalUmlRtText.g:389:3: this_RTStateMachine_0= ruleRTStateMachine
                    {

                    			newCompositeNode(grammarAccess.getStateMachineAccess().getRTStateMachineParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_RTStateMachine_0=ruleRTStateMachine();

                    state._fsp--;


                    			current = this_RTStateMachine_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUmlRtText.g:398:3: (otherlv_1= 'state_machine' () ( (lv_name_3_0= RULE_ID ) ) )
                    {
                    // InternalUmlRtText.g:398:3: (otherlv_1= 'state_machine' () ( (lv_name_3_0= RULE_ID ) ) )
                    // InternalUmlRtText.g:399:4: otherlv_1= 'state_machine' () ( (lv_name_3_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getStateMachineAccess().getState_machineKeyword_1_0());
                    			
                    // InternalUmlRtText.g:403:4: ()
                    // InternalUmlRtText.g:404:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getStateMachineAccess().getStateMachineAction_1_1(),
                    						current);
                    				

                    }

                    // InternalUmlRtText.g:410:4: ( (lv_name_3_0= RULE_ID ) )
                    // InternalUmlRtText.g:411:5: (lv_name_3_0= RULE_ID )
                    {
                    // InternalUmlRtText.g:411:5: (lv_name_3_0= RULE_ID )
                    // InternalUmlRtText.g:412:6: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_name_3_0, grammarAccess.getStateMachineAccess().getNameIDTerminalRuleCall_1_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStateMachineRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_3_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


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
    // $ANTLR end "ruleStateMachine"


    // $ANTLR start "entryRuleRegion"
    // InternalUmlRtText.g:433:1: entryRuleRegion returns [EObject current=null] : iv_ruleRegion= ruleRegion EOF ;
    public final EObject entryRuleRegion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegion = null;


        try {
            // InternalUmlRtText.g:433:47: (iv_ruleRegion= ruleRegion EOF )
            // InternalUmlRtText.g:434:2: iv_ruleRegion= ruleRegion EOF
            {
             newCompositeNode(grammarAccess.getRegionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRegion=ruleRegion();

            state._fsp--;

             current =iv_ruleRegion; 
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
    // $ANTLR end "entryRuleRegion"


    // $ANTLR start "ruleRegion"
    // InternalUmlRtText.g:440:1: ruleRegion returns [EObject current=null] : (this_RTRegion_0= ruleRTRegion | (otherlv_1= 'region' () ( (lv_name_3_0= RULE_ID ) ) ) ) ;
    public final EObject ruleRegion() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_3_0=null;
        EObject this_RTRegion_0 = null;



        	enterRule();

        try {
            // InternalUmlRtText.g:446:2: ( (this_RTRegion_0= ruleRTRegion | (otherlv_1= 'region' () ( (lv_name_3_0= RULE_ID ) ) ) ) )
            // InternalUmlRtText.g:447:2: (this_RTRegion_0= ruleRTRegion | (otherlv_1= 'region' () ( (lv_name_3_0= RULE_ID ) ) ) )
            {
            // InternalUmlRtText.g:447:2: (this_RTRegion_0= ruleRTRegion | (otherlv_1= 'region' () ( (lv_name_3_0= RULE_ID ) ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18||LA8_0==37||(LA8_0>=48 && LA8_0<=50)) ) {
                alt8=1;
            }
            else if ( (LA8_0==20) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalUmlRtText.g:448:3: this_RTRegion_0= ruleRTRegion
                    {

                    			newCompositeNode(grammarAccess.getRegionAccess().getRTRegionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_RTRegion_0=ruleRTRegion();

                    state._fsp--;


                    			current = this_RTRegion_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUmlRtText.g:457:3: (otherlv_1= 'region' () ( (lv_name_3_0= RULE_ID ) ) )
                    {
                    // InternalUmlRtText.g:457:3: (otherlv_1= 'region' () ( (lv_name_3_0= RULE_ID ) ) )
                    // InternalUmlRtText.g:458:4: otherlv_1= 'region' () ( (lv_name_3_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getRegionAccess().getRegionKeyword_1_0());
                    			
                    // InternalUmlRtText.g:462:4: ()
                    // InternalUmlRtText.g:463:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getRegionAccess().getRegionAction_1_1(),
                    						current);
                    				

                    }

                    // InternalUmlRtText.g:469:4: ( (lv_name_3_0= RULE_ID ) )
                    // InternalUmlRtText.g:470:5: (lv_name_3_0= RULE_ID )
                    {
                    // InternalUmlRtText.g:470:5: (lv_name_3_0= RULE_ID )
                    // InternalUmlRtText.g:471:6: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_name_3_0, grammarAccess.getRegionAccess().getNameIDTerminalRuleCall_1_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRegionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_3_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


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
    // $ANTLR end "ruleRegion"


    // $ANTLR start "entryRuleCapsule"
    // InternalUmlRtText.g:492:1: entryRuleCapsule returns [EObject current=null] : iv_ruleCapsule= ruleCapsule EOF ;
    public final EObject entryRuleCapsule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCapsule = null;


        try {
            // InternalUmlRtText.g:492:48: (iv_ruleCapsule= ruleCapsule EOF )
            // InternalUmlRtText.g:493:2: iv_ruleCapsule= ruleCapsule EOF
            {
             newCompositeNode(grammarAccess.getCapsuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCapsule=ruleCapsule();

            state._fsp--;

             current =iv_ruleCapsule; 
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
    // $ANTLR end "entryRuleCapsule"


    // $ANTLR start "ruleCapsule"
    // InternalUmlRtText.g:499:1: ruleCapsule returns [EObject current=null] : (otherlv_0= 'capsule' () ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' ( (lv_ownedBehavior_4_0= ruleStateMachine ) )* otherlv_5= '}' )? ) ;
    public final EObject ruleCapsule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_ownedBehavior_4_0 = null;



        	enterRule();

        try {
            // InternalUmlRtText.g:505:2: ( (otherlv_0= 'capsule' () ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' ( (lv_ownedBehavior_4_0= ruleStateMachine ) )* otherlv_5= '}' )? ) )
            // InternalUmlRtText.g:506:2: (otherlv_0= 'capsule' () ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' ( (lv_ownedBehavior_4_0= ruleStateMachine ) )* otherlv_5= '}' )? )
            {
            // InternalUmlRtText.g:506:2: (otherlv_0= 'capsule' () ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' ( (lv_ownedBehavior_4_0= ruleStateMachine ) )* otherlv_5= '}' )? )
            // InternalUmlRtText.g:507:3: otherlv_0= 'capsule' () ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '{' ( (lv_ownedBehavior_4_0= ruleStateMachine ) )* otherlv_5= '}' )?
            {
            otherlv_0=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCapsuleAccess().getCapsuleKeyword_0());
            		
            // InternalUmlRtText.g:511:3: ()
            // InternalUmlRtText.g:512:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCapsuleAccess().getCapsuleAction_1(),
            					current);
            			

            }

            // InternalUmlRtText.g:518:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalUmlRtText.g:519:4: (lv_name_2_0= RULE_ID )
            {
            // InternalUmlRtText.g:519:4: (lv_name_2_0= RULE_ID )
            // InternalUmlRtText.g:520:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getCapsuleAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCapsuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUmlRtText.g:536:3: (otherlv_3= '{' ( (lv_ownedBehavior_4_0= ruleStateMachine ) )* otherlv_5= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==14) ) {
                int LA10_1 = input.LA(2);

                if ( ((LA10_1>=18 && LA10_1<=19)||LA10_1==35||(LA10_1>=48 && LA10_1<=50)) ) {
                    alt10=1;
                }
                else if ( (LA10_1==15) ) {
                    alt10=1;
                }
            }
            switch (alt10) {
                case 1 :
                    // InternalUmlRtText.g:537:4: otherlv_3= '{' ( (lv_ownedBehavior_4_0= ruleStateMachine ) )* otherlv_5= '}'
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getCapsuleAccess().getLeftCurlyBracketKeyword_3_0());
                    			
                    // InternalUmlRtText.g:541:4: ( (lv_ownedBehavior_4_0= ruleStateMachine ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>=18 && LA9_0<=19)||LA9_0==35||(LA9_0>=48 && LA9_0<=50)) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalUmlRtText.g:542:5: (lv_ownedBehavior_4_0= ruleStateMachine )
                    	    {
                    	    // InternalUmlRtText.g:542:5: (lv_ownedBehavior_4_0= ruleStateMachine )
                    	    // InternalUmlRtText.g:543:6: lv_ownedBehavior_4_0= ruleStateMachine
                    	    {

                    	    						newCompositeNode(grammarAccess.getCapsuleAccess().getOwnedBehaviorStateMachineParserRuleCall_3_1_0());
                    	    					
                    	    pushFollow(FOLLOW_8);
                    	    lv_ownedBehavior_4_0=ruleStateMachine();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getCapsuleRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"ownedBehavior",
                    	    							lv_ownedBehavior_4_0,
                    	    							"org.eclipse.papyrusrt.umlrt.UmlRtText.StateMachine");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getCapsuleAccess().getRightCurlyBracketKeyword_3_2());
                    			

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
    // $ANTLR end "ruleCapsule"


    // $ANTLR start "entryRuleCapsulePart"
    // InternalUmlRtText.g:569:1: entryRuleCapsulePart returns [EObject current=null] : iv_ruleCapsulePart= ruleCapsulePart EOF ;
    public final EObject entryRuleCapsulePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCapsulePart = null;


        try {
            // InternalUmlRtText.g:569:52: (iv_ruleCapsulePart= ruleCapsulePart EOF )
            // InternalUmlRtText.g:570:2: iv_ruleCapsulePart= ruleCapsulePart EOF
            {
             newCompositeNode(grammarAccess.getCapsulePartRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCapsulePart=ruleCapsulePart();

            state._fsp--;

             current =iv_ruleCapsulePart; 
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
    // $ANTLR end "entryRuleCapsulePart"


    // $ANTLR start "ruleCapsulePart"
    // InternalUmlRtText.g:576:1: ruleCapsulePart returns [EObject current=null] : (otherlv_0= 'capsule_part' () ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'is_notification' ( (lv_isNotification_4_0= RULE_UML_BOOLEAN ) ) otherlv_5= 'is_publish' ( (lv_isPublish_6_0= RULE_UML_BOOLEAN ) ) otherlv_7= 'is_wired' ( (lv_isWired_8_0= RULE_UML_BOOLEAN ) ) otherlv_9= 'registration' ( (lv_registration_10_0= rulePortRegistrationType ) ) otherlv_11= 'registration_override' ( (lv_registrationOverride_12_0= RULE_UML_STRING ) ) ) ;
    public final EObject ruleCapsulePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_isNotification_4_0=null;
        Token otherlv_5=null;
        Token lv_isPublish_6_0=null;
        Token otherlv_7=null;
        Token lv_isWired_8_0=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token lv_registrationOverride_12_0=null;
        Enumerator lv_registration_10_0 = null;



        	enterRule();

        try {
            // InternalUmlRtText.g:582:2: ( (otherlv_0= 'capsule_part' () ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'is_notification' ( (lv_isNotification_4_0= RULE_UML_BOOLEAN ) ) otherlv_5= 'is_publish' ( (lv_isPublish_6_0= RULE_UML_BOOLEAN ) ) otherlv_7= 'is_wired' ( (lv_isWired_8_0= RULE_UML_BOOLEAN ) ) otherlv_9= 'registration' ( (lv_registration_10_0= rulePortRegistrationType ) ) otherlv_11= 'registration_override' ( (lv_registrationOverride_12_0= RULE_UML_STRING ) ) ) )
            // InternalUmlRtText.g:583:2: (otherlv_0= 'capsule_part' () ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'is_notification' ( (lv_isNotification_4_0= RULE_UML_BOOLEAN ) ) otherlv_5= 'is_publish' ( (lv_isPublish_6_0= RULE_UML_BOOLEAN ) ) otherlv_7= 'is_wired' ( (lv_isWired_8_0= RULE_UML_BOOLEAN ) ) otherlv_9= 'registration' ( (lv_registration_10_0= rulePortRegistrationType ) ) otherlv_11= 'registration_override' ( (lv_registrationOverride_12_0= RULE_UML_STRING ) ) )
            {
            // InternalUmlRtText.g:583:2: (otherlv_0= 'capsule_part' () ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'is_notification' ( (lv_isNotification_4_0= RULE_UML_BOOLEAN ) ) otherlv_5= 'is_publish' ( (lv_isPublish_6_0= RULE_UML_BOOLEAN ) ) otherlv_7= 'is_wired' ( (lv_isWired_8_0= RULE_UML_BOOLEAN ) ) otherlv_9= 'registration' ( (lv_registration_10_0= rulePortRegistrationType ) ) otherlv_11= 'registration_override' ( (lv_registrationOverride_12_0= RULE_UML_STRING ) ) )
            // InternalUmlRtText.g:584:3: otherlv_0= 'capsule_part' () ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'is_notification' ( (lv_isNotification_4_0= RULE_UML_BOOLEAN ) ) otherlv_5= 'is_publish' ( (lv_isPublish_6_0= RULE_UML_BOOLEAN ) ) otherlv_7= 'is_wired' ( (lv_isWired_8_0= RULE_UML_BOOLEAN ) ) otherlv_9= 'registration' ( (lv_registration_10_0= rulePortRegistrationType ) ) otherlv_11= 'registration_override' ( (lv_registrationOverride_12_0= RULE_UML_STRING ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCapsulePartAccess().getCapsule_partKeyword_0());
            		
            // InternalUmlRtText.g:588:3: ()
            // InternalUmlRtText.g:589:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCapsulePartAccess().getCapsulePartAction_1(),
            					current);
            			

            }

            // InternalUmlRtText.g:595:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalUmlRtText.g:596:4: (lv_name_2_0= RULE_ID )
            {
            // InternalUmlRtText.g:596:4: (lv_name_2_0= RULE_ID )
            // InternalUmlRtText.g:597:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_2_0, grammarAccess.getCapsulePartAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCapsulePartRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getCapsulePartAccess().getIs_notificationKeyword_3());
            		
            // InternalUmlRtText.g:617:3: ( (lv_isNotification_4_0= RULE_UML_BOOLEAN ) )
            // InternalUmlRtText.g:618:4: (lv_isNotification_4_0= RULE_UML_BOOLEAN )
            {
            // InternalUmlRtText.g:618:4: (lv_isNotification_4_0= RULE_UML_BOOLEAN )
            // InternalUmlRtText.g:619:5: lv_isNotification_4_0= RULE_UML_BOOLEAN
            {
            lv_isNotification_4_0=(Token)match(input,RULE_UML_BOOLEAN,FOLLOW_11); 

            					newLeafNode(lv_isNotification_4_0, grammarAccess.getCapsulePartAccess().getIsNotificationUML_BOOLEANTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCapsulePartRule());
            					}
            					setWithLastConsumed(
            						current,
            						"isNotification",
            						lv_isNotification_4_0,
            						"org.eclipse.papyrusrt.umlrt.UmlRtText.UML_BOOLEAN");
            				

            }


            }

            otherlv_5=(Token)match(input,24,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getCapsulePartAccess().getIs_publishKeyword_5());
            		
            // InternalUmlRtText.g:639:3: ( (lv_isPublish_6_0= RULE_UML_BOOLEAN ) )
            // InternalUmlRtText.g:640:4: (lv_isPublish_6_0= RULE_UML_BOOLEAN )
            {
            // InternalUmlRtText.g:640:4: (lv_isPublish_6_0= RULE_UML_BOOLEAN )
            // InternalUmlRtText.g:641:5: lv_isPublish_6_0= RULE_UML_BOOLEAN
            {
            lv_isPublish_6_0=(Token)match(input,RULE_UML_BOOLEAN,FOLLOW_12); 

            					newLeafNode(lv_isPublish_6_0, grammarAccess.getCapsulePartAccess().getIsPublishUML_BOOLEANTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCapsulePartRule());
            					}
            					setWithLastConsumed(
            						current,
            						"isPublish",
            						lv_isPublish_6_0,
            						"org.eclipse.papyrusrt.umlrt.UmlRtText.UML_BOOLEAN");
            				

            }


            }

            otherlv_7=(Token)match(input,25,FOLLOW_10); 

            			newLeafNode(otherlv_7, grammarAccess.getCapsulePartAccess().getIs_wiredKeyword_7());
            		
            // InternalUmlRtText.g:661:3: ( (lv_isWired_8_0= RULE_UML_BOOLEAN ) )
            // InternalUmlRtText.g:662:4: (lv_isWired_8_0= RULE_UML_BOOLEAN )
            {
            // InternalUmlRtText.g:662:4: (lv_isWired_8_0= RULE_UML_BOOLEAN )
            // InternalUmlRtText.g:663:5: lv_isWired_8_0= RULE_UML_BOOLEAN
            {
            lv_isWired_8_0=(Token)match(input,RULE_UML_BOOLEAN,FOLLOW_13); 

            					newLeafNode(lv_isWired_8_0, grammarAccess.getCapsulePartAccess().getIsWiredUML_BOOLEANTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCapsulePartRule());
            					}
            					setWithLastConsumed(
            						current,
            						"isWired",
            						lv_isWired_8_0,
            						"org.eclipse.papyrusrt.umlrt.UmlRtText.UML_BOOLEAN");
            				

            }


            }

            otherlv_9=(Token)match(input,26,FOLLOW_14); 

            			newLeafNode(otherlv_9, grammarAccess.getCapsulePartAccess().getRegistrationKeyword_9());
            		
            // InternalUmlRtText.g:683:3: ( (lv_registration_10_0= rulePortRegistrationType ) )
            // InternalUmlRtText.g:684:4: (lv_registration_10_0= rulePortRegistrationType )
            {
            // InternalUmlRtText.g:684:4: (lv_registration_10_0= rulePortRegistrationType )
            // InternalUmlRtText.g:685:5: lv_registration_10_0= rulePortRegistrationType
            {

            					newCompositeNode(grammarAccess.getCapsulePartAccess().getRegistrationPortRegistrationTypeEnumRuleCall_10_0());
            				
            pushFollow(FOLLOW_15);
            lv_registration_10_0=rulePortRegistrationType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCapsulePartRule());
            					}
            					set(
            						current,
            						"registration",
            						lv_registration_10_0,
            						"org.eclipse.papyrusrt.umlrt.UmlRtText.PortRegistrationType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,27,FOLLOW_16); 

            			newLeafNode(otherlv_11, grammarAccess.getCapsulePartAccess().getRegistration_overrideKeyword_11());
            		
            // InternalUmlRtText.g:706:3: ( (lv_registrationOverride_12_0= RULE_UML_STRING ) )
            // InternalUmlRtText.g:707:4: (lv_registrationOverride_12_0= RULE_UML_STRING )
            {
            // InternalUmlRtText.g:707:4: (lv_registrationOverride_12_0= RULE_UML_STRING )
            // InternalUmlRtText.g:708:5: lv_registrationOverride_12_0= RULE_UML_STRING
            {
            lv_registrationOverride_12_0=(Token)match(input,RULE_UML_STRING,FOLLOW_2); 

            					newLeafNode(lv_registrationOverride_12_0, grammarAccess.getCapsulePartAccess().getRegistrationOverrideUML_STRINGTerminalRuleCall_12_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCapsulePartRule());
            					}
            					setWithLastConsumed(
            						current,
            						"registrationOverride",
            						lv_registrationOverride_12_0,
            						"org.eclipse.papyrusrt.umlrt.UmlRtText.UML_STRING");
            				

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
    // $ANTLR end "ruleCapsulePart"


    // $ANTLR start "entryRuleProtocol"
    // InternalUmlRtText.g:728:1: entryRuleProtocol returns [EObject current=null] : iv_ruleProtocol= ruleProtocol EOF ;
    public final EObject entryRuleProtocol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtocol = null;


        try {
            // InternalUmlRtText.g:728:49: (iv_ruleProtocol= ruleProtocol EOF )
            // InternalUmlRtText.g:729:2: iv_ruleProtocol= ruleProtocol EOF
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
    // InternalUmlRtText.g:735:1: ruleProtocol returns [EObject current=null] : (otherlv_0= 'protocol' () ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleProtocol() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalUmlRtText.g:741:2: ( (otherlv_0= 'protocol' () ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalUmlRtText.g:742:2: (otherlv_0= 'protocol' () ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalUmlRtText.g:742:2: (otherlv_0= 'protocol' () ( (lv_name_2_0= RULE_ID ) ) )
            // InternalUmlRtText.g:743:3: otherlv_0= 'protocol' () ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getProtocolAccess().getProtocolKeyword_0());
            		
            // InternalUmlRtText.g:747:3: ()
            // InternalUmlRtText.g:748:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProtocolAccess().getProtocolAction_1(),
            					current);
            			

            }

            // InternalUmlRtText.g:754:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalUmlRtText.g:755:4: (lv_name_2_0= RULE_ID )
            {
            // InternalUmlRtText.g:755:4: (lv_name_2_0= RULE_ID )
            // InternalUmlRtText.g:756:5: lv_name_2_0= RULE_ID
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


    // $ANTLR start "entryRuleRTPort"
    // InternalUmlRtText.g:776:1: entryRuleRTPort returns [EObject current=null] : iv_ruleRTPort= ruleRTPort EOF ;
    public final EObject entryRuleRTPort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRTPort = null;


        try {
            // InternalUmlRtText.g:776:47: (iv_ruleRTPort= ruleRTPort EOF )
            // InternalUmlRtText.g:777:2: iv_ruleRTPort= ruleRTPort EOF
            {
             newCompositeNode(grammarAccess.getRTPortRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRTPort=ruleRTPort();

            state._fsp--;

             current =iv_ruleRTPort; 
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
    // $ANTLR end "entryRuleRTPort"


    // $ANTLR start "ruleRTPort"
    // InternalUmlRtText.g:783:1: ruleRTPort returns [EObject current=null] : (otherlv_0= 'rt_port' () ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleRTPort() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalUmlRtText.g:789:2: ( (otherlv_0= 'rt_port' () ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalUmlRtText.g:790:2: (otherlv_0= 'rt_port' () ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalUmlRtText.g:790:2: (otherlv_0= 'rt_port' () ( (lv_name_2_0= RULE_ID ) ) )
            // InternalUmlRtText.g:791:3: otherlv_0= 'rt_port' () ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRTPortAccess().getRt_portKeyword_0());
            		
            // InternalUmlRtText.g:795:3: ()
            // InternalUmlRtText.g:796:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRTPortAccess().getRTPortAction_1(),
            					current);
            			

            }

            // InternalUmlRtText.g:802:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalUmlRtText.g:803:4: (lv_name_2_0= RULE_ID )
            {
            // InternalUmlRtText.g:803:4: (lv_name_2_0= RULE_ID )
            // InternalUmlRtText.g:804:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getRTPortAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRTPortRule());
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
    // $ANTLR end "ruleRTPort"


    // $ANTLR start "entryRuleRTConnector"
    // InternalUmlRtText.g:824:1: entryRuleRTConnector returns [EObject current=null] : iv_ruleRTConnector= ruleRTConnector EOF ;
    public final EObject entryRuleRTConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRTConnector = null;


        try {
            // InternalUmlRtText.g:824:52: (iv_ruleRTConnector= ruleRTConnector EOF )
            // InternalUmlRtText.g:825:2: iv_ruleRTConnector= ruleRTConnector EOF
            {
             newCompositeNode(grammarAccess.getRTConnectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRTConnector=ruleRTConnector();

            state._fsp--;

             current =iv_ruleRTConnector; 
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
    // $ANTLR end "entryRuleRTConnector"


    // $ANTLR start "ruleRTConnector"
    // InternalUmlRtText.g:831:1: ruleRTConnector returns [EObject current=null] : (otherlv_0= 'rt_connector' () ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleRTConnector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalUmlRtText.g:837:2: ( (otherlv_0= 'rt_connector' () ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalUmlRtText.g:838:2: (otherlv_0= 'rt_connector' () ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalUmlRtText.g:838:2: (otherlv_0= 'rt_connector' () ( (lv_name_2_0= RULE_ID ) ) )
            // InternalUmlRtText.g:839:3: otherlv_0= 'rt_connector' () ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRTConnectorAccess().getRt_connectorKeyword_0());
            		
            // InternalUmlRtText.g:843:3: ()
            // InternalUmlRtText.g:844:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRTConnectorAccess().getRTConnectorAction_1(),
            					current);
            			

            }

            // InternalUmlRtText.g:850:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalUmlRtText.g:851:4: (lv_name_2_0= RULE_ID )
            {
            // InternalUmlRtText.g:851:4: (lv_name_2_0= RULE_ID )
            // InternalUmlRtText.g:852:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getRTConnectorAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRTConnectorRule());
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
    // $ANTLR end "ruleRTConnector"


    // $ANTLR start "entryRuleProtocolContainer"
    // InternalUmlRtText.g:872:1: entryRuleProtocolContainer returns [EObject current=null] : iv_ruleProtocolContainer= ruleProtocolContainer EOF ;
    public final EObject entryRuleProtocolContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtocolContainer = null;


        try {
            // InternalUmlRtText.g:872:58: (iv_ruleProtocolContainer= ruleProtocolContainer EOF )
            // InternalUmlRtText.g:873:2: iv_ruleProtocolContainer= ruleProtocolContainer EOF
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
    // InternalUmlRtText.g:879:1: ruleProtocolContainer returns [EObject current=null] : (otherlv_0= 'protocol_container' () ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_packagedElement_4_1= ruleProtocol | lv_packagedElement_4_2= ruleRTMessageSet ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleProtocolContainer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_packagedElement_4_1 = null;

        EObject lv_packagedElement_4_2 = null;



        	enterRule();

        try {
            // InternalUmlRtText.g:885:2: ( (otherlv_0= 'protocol_container' () ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_packagedElement_4_1= ruleProtocol | lv_packagedElement_4_2= ruleRTMessageSet ) ) )* otherlv_5= '}' ) )
            // InternalUmlRtText.g:886:2: (otherlv_0= 'protocol_container' () ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_packagedElement_4_1= ruleProtocol | lv_packagedElement_4_2= ruleRTMessageSet ) ) )* otherlv_5= '}' )
            {
            // InternalUmlRtText.g:886:2: (otherlv_0= 'protocol_container' () ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_packagedElement_4_1= ruleProtocol | lv_packagedElement_4_2= ruleRTMessageSet ) ) )* otherlv_5= '}' )
            // InternalUmlRtText.g:887:3: otherlv_0= 'protocol_container' () ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_packagedElement_4_1= ruleProtocol | lv_packagedElement_4_2= ruleRTMessageSet ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getProtocolContainerAccess().getProtocol_containerKeyword_0());
            		
            // InternalUmlRtText.g:891:3: ()
            // InternalUmlRtText.g:892:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProtocolContainerAccess().getProtocolContainerAction_1(),
            					current);
            			

            }

            // InternalUmlRtText.g:898:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalUmlRtText.g:899:4: (lv_name_2_0= RULE_ID )
            {
            // InternalUmlRtText.g:899:4: (lv_name_2_0= RULE_ID )
            // InternalUmlRtText.g:900:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_2_0, grammarAccess.getProtocolContainerAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProtocolContainerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getProtocolContainerAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalUmlRtText.g:920:3: ( ( (lv_packagedElement_4_1= ruleProtocol | lv_packagedElement_4_2= ruleRTMessageSet ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==28||(LA12_0>=45 && LA12_0<=47)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalUmlRtText.g:921:4: ( (lv_packagedElement_4_1= ruleProtocol | lv_packagedElement_4_2= ruleRTMessageSet ) )
            	    {
            	    // InternalUmlRtText.g:921:4: ( (lv_packagedElement_4_1= ruleProtocol | lv_packagedElement_4_2= ruleRTMessageSet ) )
            	    // InternalUmlRtText.g:922:5: (lv_packagedElement_4_1= ruleProtocol | lv_packagedElement_4_2= ruleRTMessageSet )
            	    {
            	    // InternalUmlRtText.g:922:5: (lv_packagedElement_4_1= ruleProtocol | lv_packagedElement_4_2= ruleRTMessageSet )
            	    int alt11=2;
            	    int LA11_0 = input.LA(1);

            	    if ( (LA11_0==28) ) {
            	        alt11=1;
            	    }
            	    else if ( ((LA11_0>=45 && LA11_0<=47)) ) {
            	        alt11=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 11, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt11) {
            	        case 1 :
            	            // InternalUmlRtText.g:923:6: lv_packagedElement_4_1= ruleProtocol
            	            {

            	            						newCompositeNode(grammarAccess.getProtocolContainerAccess().getPackagedElementProtocolParserRuleCall_4_0_0());
            	            					
            	            pushFollow(FOLLOW_17);
            	            lv_packagedElement_4_1=ruleProtocol();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getProtocolContainerRule());
            	            						}
            	            						add(
            	            							current,
            	            							"packagedElement",
            	            							lv_packagedElement_4_1,
            	            							"org.eclipse.papyrusrt.umlrt.UmlRtText.Protocol");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalUmlRtText.g:939:6: lv_packagedElement_4_2= ruleRTMessageSet
            	            {

            	            						newCompositeNode(grammarAccess.getProtocolContainerAccess().getPackagedElementRTMessageSetParserRuleCall_4_0_1());
            	            					
            	            pushFollow(FOLLOW_17);
            	            lv_packagedElement_4_2=ruleRTMessageSet();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getProtocolContainerRule());
            	            						}
            	            						add(
            	            							current,
            	            							"packagedElement",
            	            							lv_packagedElement_4_2,
            	            							"org.eclipse.papyrusrt.umlrt.UmlRtText.RTMessageSet");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getProtocolContainerAccess().getRightCurlyBracketKeyword_5());
            		

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


    // $ANTLR start "entryRuleRTRedefinedElement"
    // InternalUmlRtText.g:965:1: entryRuleRTRedefinedElement returns [EObject current=null] : iv_ruleRTRedefinedElement= ruleRTRedefinedElement EOF ;
    public final EObject entryRuleRTRedefinedElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRTRedefinedElement = null;


        try {
            // InternalUmlRtText.g:965:59: (iv_ruleRTRedefinedElement= ruleRTRedefinedElement EOF )
            // InternalUmlRtText.g:966:2: iv_ruleRTRedefinedElement= ruleRTRedefinedElement EOF
            {
             newCompositeNode(grammarAccess.getRTRedefinedElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRTRedefinedElement=ruleRTRedefinedElement();

            state._fsp--;

             current =iv_ruleRTRedefinedElement; 
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
    // $ANTLR end "entryRuleRTRedefinedElement"


    // $ANTLR start "ruleRTRedefinedElement"
    // InternalUmlRtText.g:972:1: ruleRTRedefinedElement returns [EObject current=null] : (otherlv_0= 'rt_redefined_element' () ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'root_fragment' ( (lv_rootFragment_4_0= ruleRedefinableElement ) ) )? ) ;
    public final EObject ruleRTRedefinedElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        EObject lv_rootFragment_4_0 = null;



        	enterRule();

        try {
            // InternalUmlRtText.g:978:2: ( (otherlv_0= 'rt_redefined_element' () ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'root_fragment' ( (lv_rootFragment_4_0= ruleRedefinableElement ) ) )? ) )
            // InternalUmlRtText.g:979:2: (otherlv_0= 'rt_redefined_element' () ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'root_fragment' ( (lv_rootFragment_4_0= ruleRedefinableElement ) ) )? )
            {
            // InternalUmlRtText.g:979:2: (otherlv_0= 'rt_redefined_element' () ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'root_fragment' ( (lv_rootFragment_4_0= ruleRedefinableElement ) ) )? )
            // InternalUmlRtText.g:980:3: otherlv_0= 'rt_redefined_element' () ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'root_fragment' ( (lv_rootFragment_4_0= ruleRedefinableElement ) ) )?
            {
            otherlv_0=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRTRedefinedElementAccess().getRt_redefined_elementKeyword_0());
            		
            // InternalUmlRtText.g:984:3: ()
            // InternalUmlRtText.g:985:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRTRedefinedElementAccess().getRTRedefinedElementAction_1(),
            					current);
            			

            }

            // InternalUmlRtText.g:991:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalUmlRtText.g:992:4: (lv_name_2_0= RULE_ID )
            {
            // InternalUmlRtText.g:992:4: (lv_name_2_0= RULE_ID )
            // InternalUmlRtText.g:993:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(lv_name_2_0, grammarAccess.getRTRedefinedElementAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRTRedefinedElementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUmlRtText.g:1009:3: (otherlv_3= 'root_fragment' ( (lv_rootFragment_4_0= ruleRedefinableElement ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==33) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalUmlRtText.g:1010:4: otherlv_3= 'root_fragment' ( (lv_rootFragment_4_0= ruleRedefinableElement ) )
                    {
                    otherlv_3=(Token)match(input,33,FOLLOW_19); 

                    				newLeafNode(otherlv_3, grammarAccess.getRTRedefinedElementAccess().getRoot_fragmentKeyword_3_0());
                    			
                    // InternalUmlRtText.g:1014:4: ( (lv_rootFragment_4_0= ruleRedefinableElement ) )
                    // InternalUmlRtText.g:1015:5: (lv_rootFragment_4_0= ruleRedefinableElement )
                    {
                    // InternalUmlRtText.g:1015:5: (lv_rootFragment_4_0= ruleRedefinableElement )
                    // InternalUmlRtText.g:1016:6: lv_rootFragment_4_0= ruleRedefinableElement
                    {

                    						newCompositeNode(grammarAccess.getRTRedefinedElementAccess().getRootFragmentRedefinableElementParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_rootFragment_4_0=ruleRedefinableElement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRTRedefinedElementRule());
                    						}
                    						set(
                    							current,
                    							"rootFragment",
                    							lv_rootFragment_4_0,
                    							"org.eclipse.papyrusrt.umlrt.UmlRtText.RedefinableElement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


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
    // $ANTLR end "ruleRTRedefinedElement"


    // $ANTLR start "entryRuleRTMessageSet"
    // InternalUmlRtText.g:1038:1: entryRuleRTMessageSet returns [EObject current=null] : iv_ruleRTMessageSet= ruleRTMessageSet EOF ;
    public final EObject entryRuleRTMessageSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRTMessageSet = null;


        try {
            // InternalUmlRtText.g:1038:53: (iv_ruleRTMessageSet= ruleRTMessageSet EOF )
            // InternalUmlRtText.g:1039:2: iv_ruleRTMessageSet= ruleRTMessageSet EOF
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
    // InternalUmlRtText.g:1045:1: ruleRTMessageSet returns [EObject current=null] : ( () ( (lv_rtMsgKind_1_0= ruleRTMessageKind ) ) otherlv_2= 'rt_message_set' ( (lv_name_3_0= RULE_ID ) ) ) ;
    public final EObject ruleRTMessageSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Enumerator lv_rtMsgKind_1_0 = null;



        	enterRule();

        try {
            // InternalUmlRtText.g:1051:2: ( ( () ( (lv_rtMsgKind_1_0= ruleRTMessageKind ) ) otherlv_2= 'rt_message_set' ( (lv_name_3_0= RULE_ID ) ) ) )
            // InternalUmlRtText.g:1052:2: ( () ( (lv_rtMsgKind_1_0= ruleRTMessageKind ) ) otherlv_2= 'rt_message_set' ( (lv_name_3_0= RULE_ID ) ) )
            {
            // InternalUmlRtText.g:1052:2: ( () ( (lv_rtMsgKind_1_0= ruleRTMessageKind ) ) otherlv_2= 'rt_message_set' ( (lv_name_3_0= RULE_ID ) ) )
            // InternalUmlRtText.g:1053:3: () ( (lv_rtMsgKind_1_0= ruleRTMessageKind ) ) otherlv_2= 'rt_message_set' ( (lv_name_3_0= RULE_ID ) )
            {
            // InternalUmlRtText.g:1053:3: ()
            // InternalUmlRtText.g:1054:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRTMessageSetAccess().getRTMessageSetAction_0(),
            					current);
            			

            }

            // InternalUmlRtText.g:1060:3: ( (lv_rtMsgKind_1_0= ruleRTMessageKind ) )
            // InternalUmlRtText.g:1061:4: (lv_rtMsgKind_1_0= ruleRTMessageKind )
            {
            // InternalUmlRtText.g:1061:4: (lv_rtMsgKind_1_0= ruleRTMessageKind )
            // InternalUmlRtText.g:1062:5: lv_rtMsgKind_1_0= ruleRTMessageKind
            {

            					newCompositeNode(grammarAccess.getRTMessageSetAccess().getRtMsgKindRTMessageKindEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_20);
            lv_rtMsgKind_1_0=ruleRTMessageKind();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRTMessageSetRule());
            					}
            					set(
            						current,
            						"rtMsgKind",
            						lv_rtMsgKind_1_0,
            						"org.eclipse.papyrusrt.umlrt.UmlRtText.RTMessageKind");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getRTMessageSetAccess().getRt_message_setKeyword_2());
            		
            // InternalUmlRtText.g:1083:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalUmlRtText.g:1084:4: (lv_name_3_0= RULE_ID )
            {
            // InternalUmlRtText.g:1084:4: (lv_name_3_0= RULE_ID )
            // InternalUmlRtText.g:1085:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_3_0, grammarAccess.getRTMessageSetAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRTMessageSetRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
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


    // $ANTLR start "entryRuleRTStateMachine"
    // InternalUmlRtText.g:1105:1: entryRuleRTStateMachine returns [EObject current=null] : iv_ruleRTStateMachine= ruleRTStateMachine EOF ;
    public final EObject entryRuleRTStateMachine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRTStateMachine = null;


        try {
            // InternalUmlRtText.g:1105:55: (iv_ruleRTStateMachine= ruleRTStateMachine EOF )
            // InternalUmlRtText.g:1106:2: iv_ruleRTStateMachine= ruleRTStateMachine EOF
            {
             newCompositeNode(grammarAccess.getRTStateMachineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRTStateMachine=ruleRTStateMachine();

            state._fsp--;

             current =iv_ruleRTStateMachine; 
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
    // $ANTLR end "entryRuleRTStateMachine"


    // $ANTLR start "ruleRTStateMachine"
    // InternalUmlRtText.g:1112:1: ruleRTStateMachine returns [EObject current=null] : ( () ( (lv_visibility_1_0= ruleVisibilityKind ) )? otherlv_2= 'rt_state_machine' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'is_passive' ( (lv_isPassive_5_0= RULE_UML_BOOLEAN ) ) )? ( (lv_region_6_0= ruleRegion ) )+ ) ;
    public final EObject ruleRTStateMachine() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token lv_isPassive_5_0=null;
        Enumerator lv_visibility_1_0 = null;

        EObject lv_region_6_0 = null;



        	enterRule();

        try {
            // InternalUmlRtText.g:1118:2: ( ( () ( (lv_visibility_1_0= ruleVisibilityKind ) )? otherlv_2= 'rt_state_machine' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'is_passive' ( (lv_isPassive_5_0= RULE_UML_BOOLEAN ) ) )? ( (lv_region_6_0= ruleRegion ) )+ ) )
            // InternalUmlRtText.g:1119:2: ( () ( (lv_visibility_1_0= ruleVisibilityKind ) )? otherlv_2= 'rt_state_machine' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'is_passive' ( (lv_isPassive_5_0= RULE_UML_BOOLEAN ) ) )? ( (lv_region_6_0= ruleRegion ) )+ )
            {
            // InternalUmlRtText.g:1119:2: ( () ( (lv_visibility_1_0= ruleVisibilityKind ) )? otherlv_2= 'rt_state_machine' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'is_passive' ( (lv_isPassive_5_0= RULE_UML_BOOLEAN ) ) )? ( (lv_region_6_0= ruleRegion ) )+ )
            // InternalUmlRtText.g:1120:3: () ( (lv_visibility_1_0= ruleVisibilityKind ) )? otherlv_2= 'rt_state_machine' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'is_passive' ( (lv_isPassive_5_0= RULE_UML_BOOLEAN ) ) )? ( (lv_region_6_0= ruleRegion ) )+
            {
            // InternalUmlRtText.g:1120:3: ()
            // InternalUmlRtText.g:1121:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRTStateMachineAccess().getRTStateMachineAction_0(),
            					current);
            			

            }

            // InternalUmlRtText.g:1127:3: ( (lv_visibility_1_0= ruleVisibilityKind ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==18||(LA14_0>=48 && LA14_0<=50)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalUmlRtText.g:1128:4: (lv_visibility_1_0= ruleVisibilityKind )
                    {
                    // InternalUmlRtText.g:1128:4: (lv_visibility_1_0= ruleVisibilityKind )
                    // InternalUmlRtText.g:1129:5: lv_visibility_1_0= ruleVisibilityKind
                    {

                    					newCompositeNode(grammarAccess.getRTStateMachineAccess().getVisibilityVisibilityKindEnumRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_21);
                    lv_visibility_1_0=ruleVisibilityKind();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRTStateMachineRule());
                    					}
                    					set(
                    						current,
                    						"visibility",
                    						lv_visibility_1_0,
                    						"org.eclipse.papyrusrt.umlrt.UmlRtText.VisibilityKind");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getRTStateMachineAccess().getRt_state_machineKeyword_2());
            		
            // InternalUmlRtText.g:1150:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalUmlRtText.g:1151:4: (lv_name_3_0= RULE_ID )
            {
            // InternalUmlRtText.g:1151:4: (lv_name_3_0= RULE_ID )
            // InternalUmlRtText.g:1152:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(lv_name_3_0, grammarAccess.getRTStateMachineAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRTStateMachineRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUmlRtText.g:1168:3: (otherlv_4= 'is_passive' ( (lv_isPassive_5_0= RULE_UML_BOOLEAN ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==36) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalUmlRtText.g:1169:4: otherlv_4= 'is_passive' ( (lv_isPassive_5_0= RULE_UML_BOOLEAN ) )
                    {
                    otherlv_4=(Token)match(input,36,FOLLOW_10); 

                    				newLeafNode(otherlv_4, grammarAccess.getRTStateMachineAccess().getIs_passiveKeyword_4_0());
                    			
                    // InternalUmlRtText.g:1173:4: ( (lv_isPassive_5_0= RULE_UML_BOOLEAN ) )
                    // InternalUmlRtText.g:1174:5: (lv_isPassive_5_0= RULE_UML_BOOLEAN )
                    {
                    // InternalUmlRtText.g:1174:5: (lv_isPassive_5_0= RULE_UML_BOOLEAN )
                    // InternalUmlRtText.g:1175:6: lv_isPassive_5_0= RULE_UML_BOOLEAN
                    {
                    lv_isPassive_5_0=(Token)match(input,RULE_UML_BOOLEAN,FOLLOW_22); 

                    						newLeafNode(lv_isPassive_5_0, grammarAccess.getRTStateMachineAccess().getIsPassiveUML_BOOLEANTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRTStateMachineRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"isPassive",
                    							lv_isPassive_5_0,
                    							"org.eclipse.papyrusrt.umlrt.UmlRtText.UML_BOOLEAN");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUmlRtText.g:1192:3: ( (lv_region_6_0= ruleRegion ) )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                switch ( input.LA(1) ) {
                case 48:
                    {
                    int LA16_2 = input.LA(2);

                    if ( (LA16_2==37) ) {
                        alt16=1;
                    }


                    }
                    break;
                case 49:
                    {
                    int LA16_3 = input.LA(2);

                    if ( (LA16_3==37) ) {
                        alt16=1;
                    }


                    }
                    break;
                case 50:
                    {
                    int LA16_4 = input.LA(2);

                    if ( (LA16_4==37) ) {
                        alt16=1;
                    }


                    }
                    break;
                case 18:
                    {
                    int LA16_5 = input.LA(2);

                    if ( (LA16_5==37) ) {
                        alt16=1;
                    }


                    }
                    break;
                case 20:
                case 37:
                    {
                    alt16=1;
                    }
                    break;

                }

                switch (alt16) {
            	case 1 :
            	    // InternalUmlRtText.g:1193:4: (lv_region_6_0= ruleRegion )
            	    {
            	    // InternalUmlRtText.g:1193:4: (lv_region_6_0= ruleRegion )
            	    // InternalUmlRtText.g:1194:5: lv_region_6_0= ruleRegion
            	    {

            	    					newCompositeNode(grammarAccess.getRTStateMachineAccess().getRegionRegionParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_23);
            	    lv_region_6_0=ruleRegion();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRTStateMachineRule());
            	    					}
            	    					add(
            	    						current,
            	    						"region",
            	    						lv_region_6_0,
            	    						"org.eclipse.papyrusrt.umlrt.UmlRtText.Region");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
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
    // $ANTLR end "ruleRTStateMachine"


    // $ANTLR start "entryRuleRTRegion"
    // InternalUmlRtText.g:1215:1: entryRuleRTRegion returns [EObject current=null] : iv_ruleRTRegion= ruleRTRegion EOF ;
    public final EObject entryRuleRTRegion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRTRegion = null;


        try {
            // InternalUmlRtText.g:1215:49: (iv_ruleRTRegion= ruleRTRegion EOF )
            // InternalUmlRtText.g:1216:2: iv_ruleRTRegion= ruleRTRegion EOF
            {
             newCompositeNode(grammarAccess.getRTRegionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRTRegion=ruleRTRegion();

            state._fsp--;

             current =iv_ruleRTRegion; 
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
    // $ANTLR end "entryRuleRTRegion"


    // $ANTLR start "ruleRTRegion"
    // InternalUmlRtText.g:1222:1: ruleRTRegion returns [EObject current=null] : ( () ( (lv_visibility_1_0= ruleVisibilityKind ) )? otherlv_2= 'rt_region' ( (lv_name_3_0= RULE_ID ) ) ( ( (lv_subvertex_4_1= ruleRTState | lv_subvertex_4_2= ruleRTPseudostate ) ) )* ) ;
    public final EObject ruleRTRegion() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Enumerator lv_visibility_1_0 = null;

        EObject lv_subvertex_4_1 = null;

        EObject lv_subvertex_4_2 = null;



        	enterRule();

        try {
            // InternalUmlRtText.g:1228:2: ( ( () ( (lv_visibility_1_0= ruleVisibilityKind ) )? otherlv_2= 'rt_region' ( (lv_name_3_0= RULE_ID ) ) ( ( (lv_subvertex_4_1= ruleRTState | lv_subvertex_4_2= ruleRTPseudostate ) ) )* ) )
            // InternalUmlRtText.g:1229:2: ( () ( (lv_visibility_1_0= ruleVisibilityKind ) )? otherlv_2= 'rt_region' ( (lv_name_3_0= RULE_ID ) ) ( ( (lv_subvertex_4_1= ruleRTState | lv_subvertex_4_2= ruleRTPseudostate ) ) )* )
            {
            // InternalUmlRtText.g:1229:2: ( () ( (lv_visibility_1_0= ruleVisibilityKind ) )? otherlv_2= 'rt_region' ( (lv_name_3_0= RULE_ID ) ) ( ( (lv_subvertex_4_1= ruleRTState | lv_subvertex_4_2= ruleRTPseudostate ) ) )* )
            // InternalUmlRtText.g:1230:3: () ( (lv_visibility_1_0= ruleVisibilityKind ) )? otherlv_2= 'rt_region' ( (lv_name_3_0= RULE_ID ) ) ( ( (lv_subvertex_4_1= ruleRTState | lv_subvertex_4_2= ruleRTPseudostate ) ) )*
            {
            // InternalUmlRtText.g:1230:3: ()
            // InternalUmlRtText.g:1231:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRTRegionAccess().getRTRegionAction_0(),
            					current);
            			

            }

            // InternalUmlRtText.g:1237:3: ( (lv_visibility_1_0= ruleVisibilityKind ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==18||(LA17_0>=48 && LA17_0<=50)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalUmlRtText.g:1238:4: (lv_visibility_1_0= ruleVisibilityKind )
                    {
                    // InternalUmlRtText.g:1238:4: (lv_visibility_1_0= ruleVisibilityKind )
                    // InternalUmlRtText.g:1239:5: lv_visibility_1_0= ruleVisibilityKind
                    {

                    					newCompositeNode(grammarAccess.getRTRegionAccess().getVisibilityVisibilityKindEnumRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_24);
                    lv_visibility_1_0=ruleVisibilityKind();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRTRegionRule());
                    					}
                    					set(
                    						current,
                    						"visibility",
                    						lv_visibility_1_0,
                    						"org.eclipse.papyrusrt.umlrt.UmlRtText.VisibilityKind");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getRTRegionAccess().getRt_regionKeyword_2());
            		
            // InternalUmlRtText.g:1260:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalUmlRtText.g:1261:4: (lv_name_3_0= RULE_ID )
            {
            // InternalUmlRtText.g:1261:4: (lv_name_3_0= RULE_ID )
            // InternalUmlRtText.g:1262:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(lv_name_3_0, grammarAccess.getRTRegionAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRTRegionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUmlRtText.g:1278:3: ( ( (lv_subvertex_4_1= ruleRTState | lv_subvertex_4_2= ruleRTPseudostate ) ) )*
            loop19:
            do {
                int alt19=2;
                switch ( input.LA(1) ) {
                case 48:
                    {
                    int LA19_2 = input.LA(2);

                    if ( (LA19_2==18||(LA19_2>=38 && LA19_2<=39)||(LA19_2>=48 && LA19_2<=60)) ) {
                        alt19=1;
                    }


                    }
                    break;
                case 49:
                    {
                    int LA19_3 = input.LA(2);

                    if ( (LA19_3==18||(LA19_3>=38 && LA19_3<=39)||(LA19_3>=48 && LA19_3<=60)) ) {
                        alt19=1;
                    }


                    }
                    break;
                case 50:
                    {
                    int LA19_4 = input.LA(2);

                    if ( (LA19_4==18||(LA19_4>=38 && LA19_4<=39)||(LA19_4>=48 && LA19_4<=60)) ) {
                        alt19=1;
                    }


                    }
                    break;
                case 18:
                    {
                    int LA19_5 = input.LA(2);

                    if ( (LA19_5==18||(LA19_5>=38 && LA19_5<=39)||(LA19_5>=48 && LA19_5<=60)) ) {
                        alt19=1;
                    }


                    }
                    break;
                case 38:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                    {
                    alt19=1;
                    }
                    break;

                }

                switch (alt19) {
            	case 1 :
            	    // InternalUmlRtText.g:1279:4: ( (lv_subvertex_4_1= ruleRTState | lv_subvertex_4_2= ruleRTPseudostate ) )
            	    {
            	    // InternalUmlRtText.g:1279:4: ( (lv_subvertex_4_1= ruleRTState | lv_subvertex_4_2= ruleRTPseudostate ) )
            	    // InternalUmlRtText.g:1280:5: (lv_subvertex_4_1= ruleRTState | lv_subvertex_4_2= ruleRTPseudostate )
            	    {
            	    // InternalUmlRtText.g:1280:5: (lv_subvertex_4_1= ruleRTState | lv_subvertex_4_2= ruleRTPseudostate )
            	    int alt18=2;
            	    switch ( input.LA(1) ) {
            	    case 48:
            	        {
            	        int LA18_1 = input.LA(2);

            	        if ( (LA18_1==38) ) {
            	            alt18=1;
            	        }
            	        else if ( (LA18_1==18||LA18_1==39||(LA18_1>=48 && LA18_1<=60)) ) {
            	            alt18=2;
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 18, 1, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case 49:
            	        {
            	        int LA18_2 = input.LA(2);

            	        if ( (LA18_2==18||LA18_2==39||(LA18_2>=48 && LA18_2<=60)) ) {
            	            alt18=2;
            	        }
            	        else if ( (LA18_2==38) ) {
            	            alt18=1;
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 18, 2, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case 50:
            	        {
            	        int LA18_3 = input.LA(2);

            	        if ( (LA18_3==18||LA18_3==39||(LA18_3>=48 && LA18_3<=60)) ) {
            	            alt18=2;
            	        }
            	        else if ( (LA18_3==38) ) {
            	            alt18=1;
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 18, 3, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case 18:
            	        {
            	        int LA18_4 = input.LA(2);

            	        if ( (LA18_4==38) ) {
            	            alt18=1;
            	        }
            	        else if ( (LA18_4==18||LA18_4==39||(LA18_4>=48 && LA18_4<=60)) ) {
            	            alt18=2;
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 18, 4, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case 38:
            	        {
            	        alt18=1;
            	        }
            	        break;
            	    case 51:
            	    case 52:
            	    case 53:
            	    case 54:
            	    case 55:
            	    case 56:
            	    case 57:
            	    case 58:
            	    case 59:
            	    case 60:
            	        {
            	        alt18=2;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 18, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt18) {
            	        case 1 :
            	            // InternalUmlRtText.g:1281:6: lv_subvertex_4_1= ruleRTState
            	            {

            	            						newCompositeNode(grammarAccess.getRTRegionAccess().getSubvertexRTStateParserRuleCall_4_0_0());
            	            					
            	            pushFollow(FOLLOW_25);
            	            lv_subvertex_4_1=ruleRTState();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getRTRegionRule());
            	            						}
            	            						add(
            	            							current,
            	            							"subvertex",
            	            							lv_subvertex_4_1,
            	            							"org.eclipse.papyrusrt.umlrt.UmlRtText.RTState");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalUmlRtText.g:1297:6: lv_subvertex_4_2= ruleRTPseudostate
            	            {

            	            						newCompositeNode(grammarAccess.getRTRegionAccess().getSubvertexRTPseudostateParserRuleCall_4_0_1());
            	            					
            	            pushFollow(FOLLOW_25);
            	            lv_subvertex_4_2=ruleRTPseudostate();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getRTRegionRule());
            	            						}
            	            						add(
            	            							current,
            	            							"subvertex",
            	            							lv_subvertex_4_2,
            	            							"org.eclipse.papyrusrt.umlrt.UmlRtText.RTPseudostate");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // $ANTLR end "ruleRTRegion"


    // $ANTLR start "entryRuleRTState"
    // InternalUmlRtText.g:1319:1: entryRuleRTState returns [EObject current=null] : iv_ruleRTState= ruleRTState EOF ;
    public final EObject entryRuleRTState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRTState = null;


        try {
            // InternalUmlRtText.g:1319:48: (iv_ruleRTState= ruleRTState EOF )
            // InternalUmlRtText.g:1320:2: iv_ruleRTState= ruleRTState EOF
            {
             newCompositeNode(grammarAccess.getRTStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRTState=ruleRTState();

            state._fsp--;

             current =iv_ruleRTState; 
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
    // $ANTLR end "entryRuleRTState"


    // $ANTLR start "ruleRTState"
    // InternalUmlRtText.g:1326:1: ruleRTState returns [EObject current=null] : ( () ( (lv_visibility_1_0= ruleVisibilityKind ) )? otherlv_2= 'rt_state' ( (lv_name_3_0= RULE_ID ) ) ) ;
    public final EObject ruleRTState() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Enumerator lv_visibility_1_0 = null;



        	enterRule();

        try {
            // InternalUmlRtText.g:1332:2: ( ( () ( (lv_visibility_1_0= ruleVisibilityKind ) )? otherlv_2= 'rt_state' ( (lv_name_3_0= RULE_ID ) ) ) )
            // InternalUmlRtText.g:1333:2: ( () ( (lv_visibility_1_0= ruleVisibilityKind ) )? otherlv_2= 'rt_state' ( (lv_name_3_0= RULE_ID ) ) )
            {
            // InternalUmlRtText.g:1333:2: ( () ( (lv_visibility_1_0= ruleVisibilityKind ) )? otherlv_2= 'rt_state' ( (lv_name_3_0= RULE_ID ) ) )
            // InternalUmlRtText.g:1334:3: () ( (lv_visibility_1_0= ruleVisibilityKind ) )? otherlv_2= 'rt_state' ( (lv_name_3_0= RULE_ID ) )
            {
            // InternalUmlRtText.g:1334:3: ()
            // InternalUmlRtText.g:1335:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRTStateAccess().getRTStateAction_0(),
            					current);
            			

            }

            // InternalUmlRtText.g:1341:3: ( (lv_visibility_1_0= ruleVisibilityKind ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==18||(LA20_0>=48 && LA20_0<=50)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalUmlRtText.g:1342:4: (lv_visibility_1_0= ruleVisibilityKind )
                    {
                    // InternalUmlRtText.g:1342:4: (lv_visibility_1_0= ruleVisibilityKind )
                    // InternalUmlRtText.g:1343:5: lv_visibility_1_0= ruleVisibilityKind
                    {

                    					newCompositeNode(grammarAccess.getRTStateAccess().getVisibilityVisibilityKindEnumRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_26);
                    lv_visibility_1_0=ruleVisibilityKind();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRTStateRule());
                    					}
                    					set(
                    						current,
                    						"visibility",
                    						lv_visibility_1_0,
                    						"org.eclipse.papyrusrt.umlrt.UmlRtText.VisibilityKind");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,38,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getRTStateAccess().getRt_stateKeyword_2());
            		
            // InternalUmlRtText.g:1364:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalUmlRtText.g:1365:4: (lv_name_3_0= RULE_ID )
            {
            // InternalUmlRtText.g:1365:4: (lv_name_3_0= RULE_ID )
            // InternalUmlRtText.g:1366:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_3_0, grammarAccess.getRTStateAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRTStateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
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
    // $ANTLR end "ruleRTState"


    // $ANTLR start "entryRuleRTPseudostate"
    // InternalUmlRtText.g:1386:1: entryRuleRTPseudostate returns [EObject current=null] : iv_ruleRTPseudostate= ruleRTPseudostate EOF ;
    public final EObject entryRuleRTPseudostate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRTPseudostate = null;


        try {
            // InternalUmlRtText.g:1386:54: (iv_ruleRTPseudostate= ruleRTPseudostate EOF )
            // InternalUmlRtText.g:1387:2: iv_ruleRTPseudostate= ruleRTPseudostate EOF
            {
             newCompositeNode(grammarAccess.getRTPseudostateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRTPseudostate=ruleRTPseudostate();

            state._fsp--;

             current =iv_ruleRTPseudostate; 
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
    // $ANTLR end "entryRuleRTPseudostate"


    // $ANTLR start "ruleRTPseudostate"
    // InternalUmlRtText.g:1393:1: ruleRTPseudostate returns [EObject current=null] : ( () ( ( ( ( ({...}? => ( ({...}? => ( (lv_kind_2_0= rulePseudostateKind ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_visibility_3_0= ruleVisibilityKind ) ) ) ) ) )+ {...}?) ) ) otherlv_4= 'rt_pseudostate' ( (lv_name_5_0= RULE_ID ) ) ) ;
    public final EObject ruleRTPseudostate() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Enumerator lv_kind_2_0 = null;

        Enumerator lv_visibility_3_0 = null;



        	enterRule();

        try {
            // InternalUmlRtText.g:1399:2: ( ( () ( ( ( ( ({...}? => ( ({...}? => ( (lv_kind_2_0= rulePseudostateKind ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_visibility_3_0= ruleVisibilityKind ) ) ) ) ) )+ {...}?) ) ) otherlv_4= 'rt_pseudostate' ( (lv_name_5_0= RULE_ID ) ) ) )
            // InternalUmlRtText.g:1400:2: ( () ( ( ( ( ({...}? => ( ({...}? => ( (lv_kind_2_0= rulePseudostateKind ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_visibility_3_0= ruleVisibilityKind ) ) ) ) ) )+ {...}?) ) ) otherlv_4= 'rt_pseudostate' ( (lv_name_5_0= RULE_ID ) ) )
            {
            // InternalUmlRtText.g:1400:2: ( () ( ( ( ( ({...}? => ( ({...}? => ( (lv_kind_2_0= rulePseudostateKind ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_visibility_3_0= ruleVisibilityKind ) ) ) ) ) )+ {...}?) ) ) otherlv_4= 'rt_pseudostate' ( (lv_name_5_0= RULE_ID ) ) )
            // InternalUmlRtText.g:1401:3: () ( ( ( ( ({...}? => ( ({...}? => ( (lv_kind_2_0= rulePseudostateKind ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_visibility_3_0= ruleVisibilityKind ) ) ) ) ) )+ {...}?) ) ) otherlv_4= 'rt_pseudostate' ( (lv_name_5_0= RULE_ID ) )
            {
            // InternalUmlRtText.g:1401:3: ()
            // InternalUmlRtText.g:1402:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRTPseudostateAccess().getRTPseudostateAction_0(),
            					current);
            			

            }

            // InternalUmlRtText.g:1408:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_kind_2_0= rulePseudostateKind ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_visibility_3_0= ruleVisibilityKind ) ) ) ) ) )+ {...}?) ) )
            // InternalUmlRtText.g:1409:4: ( ( ( ({...}? => ( ({...}? => ( (lv_kind_2_0= rulePseudostateKind ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_visibility_3_0= ruleVisibilityKind ) ) ) ) ) )+ {...}?) )
            {
            // InternalUmlRtText.g:1409:4: ( ( ( ({...}? => ( ({...}? => ( (lv_kind_2_0= rulePseudostateKind ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_visibility_3_0= ruleVisibilityKind ) ) ) ) ) )+ {...}?) )
            // InternalUmlRtText.g:1410:5: ( ( ({...}? => ( ({...}? => ( (lv_kind_2_0= rulePseudostateKind ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_visibility_3_0= ruleVisibilityKind ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getRTPseudostateAccess().getUnorderedGroup_1());
            				
            // InternalUmlRtText.g:1413:5: ( ( ({...}? => ( ({...}? => ( (lv_kind_2_0= rulePseudostateKind ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_visibility_3_0= ruleVisibilityKind ) ) ) ) ) )+ {...}?)
            // InternalUmlRtText.g:1414:6: ( ({...}? => ( ({...}? => ( (lv_kind_2_0= rulePseudostateKind ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_visibility_3_0= ruleVisibilityKind ) ) ) ) ) )+ {...}?
            {
            // InternalUmlRtText.g:1414:6: ( ({...}? => ( ({...}? => ( (lv_kind_2_0= rulePseudostateKind ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_visibility_3_0= ruleVisibilityKind ) ) ) ) ) )+
            int cnt21=0;
            loop21:
            do {
                int alt21=3;
                int LA21_0 = input.LA(1);

                if ( LA21_0 >= 51 && LA21_0 <= 60 && getUnorderedGroupHelper().canSelect(grammarAccess.getRTPseudostateAccess().getUnorderedGroup_1(), 0) ) {
                    alt21=1;
                }
                else if ( ( LA21_0 == 18 || LA21_0 >= 48 && LA21_0 <= 50 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getRTPseudostateAccess().getUnorderedGroup_1(), 1) ) {
                    alt21=2;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalUmlRtText.g:1415:4: ({...}? => ( ({...}? => ( (lv_kind_2_0= rulePseudostateKind ) ) ) ) )
            	    {
            	    // InternalUmlRtText.g:1415:4: ({...}? => ( ({...}? => ( (lv_kind_2_0= rulePseudostateKind ) ) ) ) )
            	    // InternalUmlRtText.g:1416:5: {...}? => ( ({...}? => ( (lv_kind_2_0= rulePseudostateKind ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRTPseudostateAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleRTPseudostate", "getUnorderedGroupHelper().canSelect(grammarAccess.getRTPseudostateAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalUmlRtText.g:1416:110: ( ({...}? => ( (lv_kind_2_0= rulePseudostateKind ) ) ) )
            	    // InternalUmlRtText.g:1417:6: ({...}? => ( (lv_kind_2_0= rulePseudostateKind ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getRTPseudostateAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalUmlRtText.g:1420:9: ({...}? => ( (lv_kind_2_0= rulePseudostateKind ) ) )
            	    // InternalUmlRtText.g:1420:10: {...}? => ( (lv_kind_2_0= rulePseudostateKind ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRTPseudostate", "true");
            	    }
            	    // InternalUmlRtText.g:1420:19: ( (lv_kind_2_0= rulePseudostateKind ) )
            	    // InternalUmlRtText.g:1420:20: (lv_kind_2_0= rulePseudostateKind )
            	    {
            	    // InternalUmlRtText.g:1420:20: (lv_kind_2_0= rulePseudostateKind )
            	    // InternalUmlRtText.g:1421:10: lv_kind_2_0= rulePseudostateKind
            	    {

            	    										newCompositeNode(grammarAccess.getRTPseudostateAccess().getKindPseudostateKindEnumRuleCall_1_0_0());
            	    									
            	    pushFollow(FOLLOW_27);
            	    lv_kind_2_0=rulePseudostateKind();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getRTPseudostateRule());
            	    										}
            	    										set(
            	    											current,
            	    											"kind",
            	    											lv_kind_2_0,
            	    											"org.eclipse.papyrusrt.umlrt.UmlRtText.PseudostateKind");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRTPseudostateAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalUmlRtText.g:1443:4: ({...}? => ( ({...}? => ( (lv_visibility_3_0= ruleVisibilityKind ) ) ) ) )
            	    {
            	    // InternalUmlRtText.g:1443:4: ({...}? => ( ({...}? => ( (lv_visibility_3_0= ruleVisibilityKind ) ) ) ) )
            	    // InternalUmlRtText.g:1444:5: {...}? => ( ({...}? => ( (lv_visibility_3_0= ruleVisibilityKind ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRTPseudostateAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleRTPseudostate", "getUnorderedGroupHelper().canSelect(grammarAccess.getRTPseudostateAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalUmlRtText.g:1444:110: ( ({...}? => ( (lv_visibility_3_0= ruleVisibilityKind ) ) ) )
            	    // InternalUmlRtText.g:1445:6: ({...}? => ( (lv_visibility_3_0= ruleVisibilityKind ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getRTPseudostateAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalUmlRtText.g:1448:9: ({...}? => ( (lv_visibility_3_0= ruleVisibilityKind ) ) )
            	    // InternalUmlRtText.g:1448:10: {...}? => ( (lv_visibility_3_0= ruleVisibilityKind ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRTPseudostate", "true");
            	    }
            	    // InternalUmlRtText.g:1448:19: ( (lv_visibility_3_0= ruleVisibilityKind ) )
            	    // InternalUmlRtText.g:1448:20: (lv_visibility_3_0= ruleVisibilityKind )
            	    {
            	    // InternalUmlRtText.g:1448:20: (lv_visibility_3_0= ruleVisibilityKind )
            	    // InternalUmlRtText.g:1449:10: lv_visibility_3_0= ruleVisibilityKind
            	    {

            	    										newCompositeNode(grammarAccess.getRTPseudostateAccess().getVisibilityVisibilityKindEnumRuleCall_1_1_0());
            	    									
            	    pushFollow(FOLLOW_27);
            	    lv_visibility_3_0=ruleVisibilityKind();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getRTPseudostateRule());
            	    										}
            	    										set(
            	    											current,
            	    											"visibility",
            	    											lv_visibility_3_0,
            	    											"org.eclipse.papyrusrt.umlrt.UmlRtText.VisibilityKind");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRTPseudostateAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getRTPseudostateAccess().getUnorderedGroup_1()) ) {
                throw new FailedPredicateException(input, "ruleRTPseudostate", "getUnorderedGroupHelper().canLeave(grammarAccess.getRTPseudostateAccess().getUnorderedGroup_1())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getRTPseudostateAccess().getUnorderedGroup_1());
            				

            }

            otherlv_4=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getRTPseudostateAccess().getRt_pseudostateKeyword_2());
            		
            // InternalUmlRtText.g:1483:3: ( (lv_name_5_0= RULE_ID ) )
            // InternalUmlRtText.g:1484:4: (lv_name_5_0= RULE_ID )
            {
            // InternalUmlRtText.g:1484:4: (lv_name_5_0= RULE_ID )
            // InternalUmlRtText.g:1485:5: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_5_0, grammarAccess.getRTPseudostateAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRTPseudostateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_5_0,
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
    // $ANTLR end "ruleRTPseudostate"


    // $ANTLR start "entryRuleRTTrigger"
    // InternalUmlRtText.g:1505:1: entryRuleRTTrigger returns [EObject current=null] : iv_ruleRTTrigger= ruleRTTrigger EOF ;
    public final EObject entryRuleRTTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRTTrigger = null;


        try {
            // InternalUmlRtText.g:1505:50: (iv_ruleRTTrigger= ruleRTTrigger EOF )
            // InternalUmlRtText.g:1506:2: iv_ruleRTTrigger= ruleRTTrigger EOF
            {
             newCompositeNode(grammarAccess.getRTTriggerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRTTrigger=ruleRTTrigger();

            state._fsp--;

             current =iv_ruleRTTrigger; 
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
    // $ANTLR end "entryRuleRTTrigger"


    // $ANTLR start "ruleRTTrigger"
    // InternalUmlRtText.g:1512:1: ruleRTTrigger returns [EObject current=null] : (otherlv_0= 'rt_trigger' () ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleRTTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalUmlRtText.g:1518:2: ( (otherlv_0= 'rt_trigger' () ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalUmlRtText.g:1519:2: (otherlv_0= 'rt_trigger' () ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalUmlRtText.g:1519:2: (otherlv_0= 'rt_trigger' () ( (lv_name_2_0= RULE_ID ) ) )
            // InternalUmlRtText.g:1520:3: otherlv_0= 'rt_trigger' () ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRTTriggerAccess().getRt_triggerKeyword_0());
            		
            // InternalUmlRtText.g:1524:3: ()
            // InternalUmlRtText.g:1525:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRTTriggerAccess().getRTTriggerAction_1(),
            					current);
            			

            }

            // InternalUmlRtText.g:1531:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalUmlRtText.g:1532:4: (lv_name_2_0= RULE_ID )
            {
            // InternalUmlRtText.g:1532:4: (lv_name_2_0= RULE_ID )
            // InternalUmlRtText.g:1533:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getRTTriggerAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRTTriggerRule());
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
    // $ANTLR end "ruleRTTrigger"


    // $ANTLR start "entryRuleRTGuard"
    // InternalUmlRtText.g:1553:1: entryRuleRTGuard returns [EObject current=null] : iv_ruleRTGuard= ruleRTGuard EOF ;
    public final EObject entryRuleRTGuard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRTGuard = null;


        try {
            // InternalUmlRtText.g:1553:48: (iv_ruleRTGuard= ruleRTGuard EOF )
            // InternalUmlRtText.g:1554:2: iv_ruleRTGuard= ruleRTGuard EOF
            {
             newCompositeNode(grammarAccess.getRTGuardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRTGuard=ruleRTGuard();

            state._fsp--;

             current =iv_ruleRTGuard; 
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
    // $ANTLR end "entryRuleRTGuard"


    // $ANTLR start "ruleRTGuard"
    // InternalUmlRtText.g:1560:1: ruleRTGuard returns [EObject current=null] : (otherlv_0= 'rt_guard' () ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleRTGuard() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalUmlRtText.g:1566:2: ( (otherlv_0= 'rt_guard' () ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalUmlRtText.g:1567:2: (otherlv_0= 'rt_guard' () ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalUmlRtText.g:1567:2: (otherlv_0= 'rt_guard' () ( (lv_name_2_0= RULE_ID ) ) )
            // InternalUmlRtText.g:1568:3: otherlv_0= 'rt_guard' () ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRTGuardAccess().getRt_guardKeyword_0());
            		
            // InternalUmlRtText.g:1572:3: ()
            // InternalUmlRtText.g:1573:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRTGuardAccess().getRTGuardAction_1(),
            					current);
            			

            }

            // InternalUmlRtText.g:1579:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalUmlRtText.g:1580:4: (lv_name_2_0= RULE_ID )
            {
            // InternalUmlRtText.g:1580:4: (lv_name_2_0= RULE_ID )
            // InternalUmlRtText.g:1581:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getRTGuardAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRTGuardRule());
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
    // $ANTLR end "ruleRTGuard"


    // $ANTLR start "rulePortRegistrationType"
    // InternalUmlRtText.g:1601:1: rulePortRegistrationType returns [Enumerator current=null] : ( (enumLiteral_0= 'automatic' ) | (enumLiteral_1= 'application' ) | (enumLiteral_2= 'automaticLocked' ) ) ;
    public final Enumerator rulePortRegistrationType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalUmlRtText.g:1607:2: ( ( (enumLiteral_0= 'automatic' ) | (enumLiteral_1= 'application' ) | (enumLiteral_2= 'automaticLocked' ) ) )
            // InternalUmlRtText.g:1608:2: ( (enumLiteral_0= 'automatic' ) | (enumLiteral_1= 'application' ) | (enumLiteral_2= 'automaticLocked' ) )
            {
            // InternalUmlRtText.g:1608:2: ( (enumLiteral_0= 'automatic' ) | (enumLiteral_1= 'application' ) | (enumLiteral_2= 'automaticLocked' ) )
            int alt22=3;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt22=1;
                }
                break;
            case 43:
                {
                alt22=2;
                }
                break;
            case 44:
                {
                alt22=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalUmlRtText.g:1609:3: (enumLiteral_0= 'automatic' )
                    {
                    // InternalUmlRtText.g:1609:3: (enumLiteral_0= 'automatic' )
                    // InternalUmlRtText.g:1610:4: enumLiteral_0= 'automatic'
                    {
                    enumLiteral_0=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getPortRegistrationTypeAccess().getAutomaticEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPortRegistrationTypeAccess().getAutomaticEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalUmlRtText.g:1617:3: (enumLiteral_1= 'application' )
                    {
                    // InternalUmlRtText.g:1617:3: (enumLiteral_1= 'application' )
                    // InternalUmlRtText.g:1618:4: enumLiteral_1= 'application'
                    {
                    enumLiteral_1=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getPortRegistrationTypeAccess().getApplicationEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPortRegistrationTypeAccess().getApplicationEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalUmlRtText.g:1625:3: (enumLiteral_2= 'automaticLocked' )
                    {
                    // InternalUmlRtText.g:1625:3: (enumLiteral_2= 'automaticLocked' )
                    // InternalUmlRtText.g:1626:4: enumLiteral_2= 'automaticLocked'
                    {
                    enumLiteral_2=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getPortRegistrationTypeAccess().getAutomaticLockedEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPortRegistrationTypeAccess().getAutomaticLockedEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "rulePortRegistrationType"


    // $ANTLR start "ruleRTMessageKind"
    // InternalUmlRtText.g:1636:1: ruleRTMessageKind returns [Enumerator current=null] : ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inOut' ) ) ;
    public final Enumerator ruleRTMessageKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalUmlRtText.g:1642:2: ( ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inOut' ) ) )
            // InternalUmlRtText.g:1643:2: ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inOut' ) )
            {
            // InternalUmlRtText.g:1643:2: ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inOut' ) )
            int alt23=3;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt23=1;
                }
                break;
            case 46:
                {
                alt23=2;
                }
                break;
            case 47:
                {
                alt23=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalUmlRtText.g:1644:3: (enumLiteral_0= 'in' )
                    {
                    // InternalUmlRtText.g:1644:3: (enumLiteral_0= 'in' )
                    // InternalUmlRtText.g:1645:4: enumLiteral_0= 'in'
                    {
                    enumLiteral_0=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getRTMessageKindAccess().getInEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRTMessageKindAccess().getInEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalUmlRtText.g:1652:3: (enumLiteral_1= 'out' )
                    {
                    // InternalUmlRtText.g:1652:3: (enumLiteral_1= 'out' )
                    // InternalUmlRtText.g:1653:4: enumLiteral_1= 'out'
                    {
                    enumLiteral_1=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getRTMessageKindAccess().getOutEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRTMessageKindAccess().getOutEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalUmlRtText.g:1660:3: (enumLiteral_2= 'inOut' )
                    {
                    // InternalUmlRtText.g:1660:3: (enumLiteral_2= 'inOut' )
                    // InternalUmlRtText.g:1661:4: enumLiteral_2= 'inOut'
                    {
                    enumLiteral_2=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getRTMessageKindAccess().getInOutEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getRTMessageKindAccess().getInOutEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleRTMessageKind"


    // $ANTLR start "ruleVisibilityKind"
    // InternalUmlRtText.g:1671:1: ruleVisibilityKind returns [Enumerator current=null] : ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'package' ) ) ;
    public final Enumerator ruleVisibilityKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalUmlRtText.g:1677:2: ( ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'package' ) ) )
            // InternalUmlRtText.g:1678:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'package' ) )
            {
            // InternalUmlRtText.g:1678:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'package' ) )
            int alt24=4;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt24=1;
                }
                break;
            case 49:
                {
                alt24=2;
                }
                break;
            case 50:
                {
                alt24=3;
                }
                break;
            case 18:
                {
                alt24=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalUmlRtText.g:1679:3: (enumLiteral_0= 'public' )
                    {
                    // InternalUmlRtText.g:1679:3: (enumLiteral_0= 'public' )
                    // InternalUmlRtText.g:1680:4: enumLiteral_0= 'public'
                    {
                    enumLiteral_0=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityKindAccess().getPublicEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getVisibilityKindAccess().getPublicEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalUmlRtText.g:1687:3: (enumLiteral_1= 'private' )
                    {
                    // InternalUmlRtText.g:1687:3: (enumLiteral_1= 'private' )
                    // InternalUmlRtText.g:1688:4: enumLiteral_1= 'private'
                    {
                    enumLiteral_1=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityKindAccess().getPrivateEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getVisibilityKindAccess().getPrivateEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalUmlRtText.g:1695:3: (enumLiteral_2= 'protected' )
                    {
                    // InternalUmlRtText.g:1695:3: (enumLiteral_2= 'protected' )
                    // InternalUmlRtText.g:1696:4: enumLiteral_2= 'protected'
                    {
                    enumLiteral_2=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityKindAccess().getProtectedEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getVisibilityKindAccess().getProtectedEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalUmlRtText.g:1703:3: (enumLiteral_3= 'package' )
                    {
                    // InternalUmlRtText.g:1703:3: (enumLiteral_3= 'package' )
                    // InternalUmlRtText.g:1704:4: enumLiteral_3= 'package'
                    {
                    enumLiteral_3=(Token)match(input,18,FOLLOW_2); 

                    				current = grammarAccess.getVisibilityKindAccess().getPackageEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getVisibilityKindAccess().getPackageEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleVisibilityKind"


    // $ANTLR start "rulePseudostateKind"
    // InternalUmlRtText.g:1714:1: rulePseudostateKind returns [Enumerator current=null] : ( (enumLiteral_0= 'initial' ) | (enumLiteral_1= 'deepHistory' ) | (enumLiteral_2= 'shallowHistory' ) | (enumLiteral_3= 'join' ) | (enumLiteral_4= 'fork' ) | (enumLiteral_5= 'junction' ) | (enumLiteral_6= 'choice' ) | (enumLiteral_7= 'entryPoint' ) | (enumLiteral_8= 'exitPoint' ) | (enumLiteral_9= 'terminate' ) ) ;
    public final Enumerator rulePseudostateKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;


        	enterRule();

        try {
            // InternalUmlRtText.g:1720:2: ( ( (enumLiteral_0= 'initial' ) | (enumLiteral_1= 'deepHistory' ) | (enumLiteral_2= 'shallowHistory' ) | (enumLiteral_3= 'join' ) | (enumLiteral_4= 'fork' ) | (enumLiteral_5= 'junction' ) | (enumLiteral_6= 'choice' ) | (enumLiteral_7= 'entryPoint' ) | (enumLiteral_8= 'exitPoint' ) | (enumLiteral_9= 'terminate' ) ) )
            // InternalUmlRtText.g:1721:2: ( (enumLiteral_0= 'initial' ) | (enumLiteral_1= 'deepHistory' ) | (enumLiteral_2= 'shallowHistory' ) | (enumLiteral_3= 'join' ) | (enumLiteral_4= 'fork' ) | (enumLiteral_5= 'junction' ) | (enumLiteral_6= 'choice' ) | (enumLiteral_7= 'entryPoint' ) | (enumLiteral_8= 'exitPoint' ) | (enumLiteral_9= 'terminate' ) )
            {
            // InternalUmlRtText.g:1721:2: ( (enumLiteral_0= 'initial' ) | (enumLiteral_1= 'deepHistory' ) | (enumLiteral_2= 'shallowHistory' ) | (enumLiteral_3= 'join' ) | (enumLiteral_4= 'fork' ) | (enumLiteral_5= 'junction' ) | (enumLiteral_6= 'choice' ) | (enumLiteral_7= 'entryPoint' ) | (enumLiteral_8= 'exitPoint' ) | (enumLiteral_9= 'terminate' ) )
            int alt25=10;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt25=1;
                }
                break;
            case 52:
                {
                alt25=2;
                }
                break;
            case 53:
                {
                alt25=3;
                }
                break;
            case 54:
                {
                alt25=4;
                }
                break;
            case 55:
                {
                alt25=5;
                }
                break;
            case 56:
                {
                alt25=6;
                }
                break;
            case 57:
                {
                alt25=7;
                }
                break;
            case 58:
                {
                alt25=8;
                }
                break;
            case 59:
                {
                alt25=9;
                }
                break;
            case 60:
                {
                alt25=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalUmlRtText.g:1722:3: (enumLiteral_0= 'initial' )
                    {
                    // InternalUmlRtText.g:1722:3: (enumLiteral_0= 'initial' )
                    // InternalUmlRtText.g:1723:4: enumLiteral_0= 'initial'
                    {
                    enumLiteral_0=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getPseudostateKindAccess().getInitialEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPseudostateKindAccess().getInitialEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalUmlRtText.g:1730:3: (enumLiteral_1= 'deepHistory' )
                    {
                    // InternalUmlRtText.g:1730:3: (enumLiteral_1= 'deepHistory' )
                    // InternalUmlRtText.g:1731:4: enumLiteral_1= 'deepHistory'
                    {
                    enumLiteral_1=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getPseudostateKindAccess().getDeepHistoryEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPseudostateKindAccess().getDeepHistoryEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalUmlRtText.g:1738:3: (enumLiteral_2= 'shallowHistory' )
                    {
                    // InternalUmlRtText.g:1738:3: (enumLiteral_2= 'shallowHistory' )
                    // InternalUmlRtText.g:1739:4: enumLiteral_2= 'shallowHistory'
                    {
                    enumLiteral_2=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getPseudostateKindAccess().getShallowHistoryEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPseudostateKindAccess().getShallowHistoryEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalUmlRtText.g:1746:3: (enumLiteral_3= 'join' )
                    {
                    // InternalUmlRtText.g:1746:3: (enumLiteral_3= 'join' )
                    // InternalUmlRtText.g:1747:4: enumLiteral_3= 'join'
                    {
                    enumLiteral_3=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getPseudostateKindAccess().getJoinEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getPseudostateKindAccess().getJoinEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalUmlRtText.g:1754:3: (enumLiteral_4= 'fork' )
                    {
                    // InternalUmlRtText.g:1754:3: (enumLiteral_4= 'fork' )
                    // InternalUmlRtText.g:1755:4: enumLiteral_4= 'fork'
                    {
                    enumLiteral_4=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getPseudostateKindAccess().getForkEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getPseudostateKindAccess().getForkEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalUmlRtText.g:1762:3: (enumLiteral_5= 'junction' )
                    {
                    // InternalUmlRtText.g:1762:3: (enumLiteral_5= 'junction' )
                    // InternalUmlRtText.g:1763:4: enumLiteral_5= 'junction'
                    {
                    enumLiteral_5=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getPseudostateKindAccess().getJunctionEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getPseudostateKindAccess().getJunctionEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalUmlRtText.g:1770:3: (enumLiteral_6= 'choice' )
                    {
                    // InternalUmlRtText.g:1770:3: (enumLiteral_6= 'choice' )
                    // InternalUmlRtText.g:1771:4: enumLiteral_6= 'choice'
                    {
                    enumLiteral_6=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getPseudostateKindAccess().getChoiceEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getPseudostateKindAccess().getChoiceEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalUmlRtText.g:1778:3: (enumLiteral_7= 'entryPoint' )
                    {
                    // InternalUmlRtText.g:1778:3: (enumLiteral_7= 'entryPoint' )
                    // InternalUmlRtText.g:1779:4: enumLiteral_7= 'entryPoint'
                    {
                    enumLiteral_7=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getPseudostateKindAccess().getEntryPointEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getPseudostateKindAccess().getEntryPointEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalUmlRtText.g:1786:3: (enumLiteral_8= 'exitPoint' )
                    {
                    // InternalUmlRtText.g:1786:3: (enumLiteral_8= 'exitPoint' )
                    // InternalUmlRtText.g:1787:4: enumLiteral_8= 'exitPoint'
                    {
                    enumLiteral_8=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getPseudostateKindAccess().getExitPointEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getPseudostateKindAccess().getExitPointEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalUmlRtText.g:1794:3: (enumLiteral_9= 'terminate' )
                    {
                    // InternalUmlRtText.g:1794:3: (enumLiteral_9= 'terminate' )
                    // InternalUmlRtText.g:1795:4: enumLiteral_9= 'terminate'
                    {
                    enumLiteral_9=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getPseudostateKindAccess().getTerminateEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getPseudostateKindAccess().getTerminateEnumLiteralDeclaration_9());
                    			

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
    // $ANTLR end "rulePseudostateKind"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000008025A000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00070008000C8000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00001C0000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000E00010008000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000100020000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0007003000140000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0007003000140002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x1FFF004000040002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x1FFF008000040000L});

}

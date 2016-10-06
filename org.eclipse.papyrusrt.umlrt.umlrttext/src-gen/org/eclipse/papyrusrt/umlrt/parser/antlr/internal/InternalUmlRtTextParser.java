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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_UML_BOOLEAN", "RULE_UML_STRING", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'model'", "'{'", "'}'", "'Class'", "'RedefinableElement'", "'Package'", "'Capsule'", "'CapsulePart'", "'IsNotification'", "'IsPublish'", "'IsWired'", "'Registration'", "'RegistrationOverride'", "'Protocol'", "'RTPort'", "'RTConnector'", "'ProtocolContainer'", "'RTRedefinedElement'", "'RootFragment'", "'RTMessageSet'", "'RTMsgKind'", "'Automatic'", "'Application'", "'AutomaticLocked'", "'in'", "'out'", "'inOut'"
    };
    public static final int RULE_STRING=8;
    public static final int RULE_UML_BOOLEAN=5;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_UML_STRING=6;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
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

                if ( (LA1_0==13||LA1_0==16||(LA1_0>=18 && LA1_0<=19)||LA1_0==29) ) {
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

            if ( (LA2_0==13||LA2_0==18||LA2_0==29) ) {
                alt2=1;
            }
            else if ( (LA2_0==16||LA2_0==19) ) {
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
    // InternalUmlRtText.g:183:1: ruleClass returns [EObject current=null] : (this_Capsule_0= ruleCapsule | (otherlv_1= 'Class' () ( (lv_name_3_0= RULE_ID ) ) ) ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_3_0=null;
        EObject this_Capsule_0 = null;



        	enterRule();

        try {
            // InternalUmlRtText.g:189:2: ( (this_Capsule_0= ruleCapsule | (otherlv_1= 'Class' () ( (lv_name_3_0= RULE_ID ) ) ) ) )
            // InternalUmlRtText.g:190:2: (this_Capsule_0= ruleCapsule | (otherlv_1= 'Class' () ( (lv_name_3_0= RULE_ID ) ) ) )
            {
            // InternalUmlRtText.g:190:2: (this_Capsule_0= ruleCapsule | (otherlv_1= 'Class' () ( (lv_name_3_0= RULE_ID ) ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==19) ) {
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
                    // InternalUmlRtText.g:191:3: this_Capsule_0= ruleCapsule
                    {

                    			newCompositeNode(grammarAccess.getClassAccess().getCapsuleParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Capsule_0=ruleCapsule();

                    state._fsp--;


                    			current = this_Capsule_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUmlRtText.g:200:3: (otherlv_1= 'Class' () ( (lv_name_3_0= RULE_ID ) ) )
                    {
                    // InternalUmlRtText.g:200:3: (otherlv_1= 'Class' () ( (lv_name_3_0= RULE_ID ) ) )
                    // InternalUmlRtText.g:201:4: otherlv_1= 'Class' () ( (lv_name_3_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getClassAccess().getClassKeyword_1_0());
                    			
                    // InternalUmlRtText.g:205:4: ()
                    // InternalUmlRtText.g:206:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getClassAccess().getClassAction_1_1(),
                    						current);
                    				

                    }

                    // InternalUmlRtText.g:212:4: ( (lv_name_3_0= RULE_ID ) )
                    // InternalUmlRtText.g:213:5: (lv_name_3_0= RULE_ID )
                    {
                    // InternalUmlRtText.g:213:5: (lv_name_3_0= RULE_ID )
                    // InternalUmlRtText.g:214:6: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_name_3_0, grammarAccess.getClassAccess().getNameIDTerminalRuleCall_1_2_0());
                    					

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
    // InternalUmlRtText.g:235:1: entryRuleRedefinableElement returns [EObject current=null] : iv_ruleRedefinableElement= ruleRedefinableElement EOF ;
    public final EObject entryRuleRedefinableElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRedefinableElement = null;


        try {
            // InternalUmlRtText.g:235:59: (iv_ruleRedefinableElement= ruleRedefinableElement EOF )
            // InternalUmlRtText.g:236:2: iv_ruleRedefinableElement= ruleRedefinableElement EOF
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
    // InternalUmlRtText.g:242:1: ruleRedefinableElement returns [EObject current=null] : (this_RTRedefinedElement_0= ruleRTRedefinedElement | (otherlv_1= 'RedefinableElement' () ( (lv_name_3_0= RULE_ID ) ) ) ) ;
    public final EObject ruleRedefinableElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_3_0=null;
        EObject this_RTRedefinedElement_0 = null;



        	enterRule();

        try {
            // InternalUmlRtText.g:248:2: ( (this_RTRedefinedElement_0= ruleRTRedefinedElement | (otherlv_1= 'RedefinableElement' () ( (lv_name_3_0= RULE_ID ) ) ) ) )
            // InternalUmlRtText.g:249:2: (this_RTRedefinedElement_0= ruleRTRedefinedElement | (otherlv_1= 'RedefinableElement' () ( (lv_name_3_0= RULE_ID ) ) ) )
            {
            // InternalUmlRtText.g:249:2: (this_RTRedefinedElement_0= ruleRTRedefinedElement | (otherlv_1= 'RedefinableElement' () ( (lv_name_3_0= RULE_ID ) ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==30) ) {
                alt4=1;
            }
            else if ( (LA4_0==17) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalUmlRtText.g:250:3: this_RTRedefinedElement_0= ruleRTRedefinedElement
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
                    // InternalUmlRtText.g:259:3: (otherlv_1= 'RedefinableElement' () ( (lv_name_3_0= RULE_ID ) ) )
                    {
                    // InternalUmlRtText.g:259:3: (otherlv_1= 'RedefinableElement' () ( (lv_name_3_0= RULE_ID ) ) )
                    // InternalUmlRtText.g:260:4: otherlv_1= 'RedefinableElement' () ( (lv_name_3_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getRedefinableElementAccess().getRedefinableElementKeyword_1_0());
                    			
                    // InternalUmlRtText.g:264:4: ()
                    // InternalUmlRtText.g:265:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getRedefinableElementAccess().getRedefinableElementAction_1_1(),
                    						current);
                    				

                    }

                    // InternalUmlRtText.g:271:4: ( (lv_name_3_0= RULE_ID ) )
                    // InternalUmlRtText.g:272:5: (lv_name_3_0= RULE_ID )
                    {
                    // InternalUmlRtText.g:272:5: (lv_name_3_0= RULE_ID )
                    // InternalUmlRtText.g:273:6: lv_name_3_0= RULE_ID
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
    // InternalUmlRtText.g:294:1: entryRulePackage returns [EObject current=null] : iv_rulePackage= rulePackage EOF ;
    public final EObject entryRulePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage = null;


        try {
            // InternalUmlRtText.g:294:48: (iv_rulePackage= rulePackage EOF )
            // InternalUmlRtText.g:295:2: iv_rulePackage= rulePackage EOF
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
    // InternalUmlRtText.g:301:1: rulePackage returns [EObject current=null] : (this_ProtocolContainer_0= ruleProtocolContainer | this_Model_1= ruleModel | (otherlv_2= 'Package' () ( (lv_name_4_0= RULE_ID ) ) ) ) ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_name_4_0=null;
        EObject this_ProtocolContainer_0 = null;

        EObject this_Model_1 = null;



        	enterRule();

        try {
            // InternalUmlRtText.g:307:2: ( (this_ProtocolContainer_0= ruleProtocolContainer | this_Model_1= ruleModel | (otherlv_2= 'Package' () ( (lv_name_4_0= RULE_ID ) ) ) ) )
            // InternalUmlRtText.g:308:2: (this_ProtocolContainer_0= ruleProtocolContainer | this_Model_1= ruleModel | (otherlv_2= 'Package' () ( (lv_name_4_0= RULE_ID ) ) ) )
            {
            // InternalUmlRtText.g:308:2: (this_ProtocolContainer_0= ruleProtocolContainer | this_Model_1= ruleModel | (otherlv_2= 'Package' () ( (lv_name_4_0= RULE_ID ) ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt5=1;
                }
                break;
            case 13:
                {
                alt5=2;
                }
                break;
            case 18:
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
                    // InternalUmlRtText.g:309:3: this_ProtocolContainer_0= ruleProtocolContainer
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
                    // InternalUmlRtText.g:318:3: this_Model_1= ruleModel
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
                    // InternalUmlRtText.g:327:3: (otherlv_2= 'Package' () ( (lv_name_4_0= RULE_ID ) ) )
                    {
                    // InternalUmlRtText.g:327:3: (otherlv_2= 'Package' () ( (lv_name_4_0= RULE_ID ) ) )
                    // InternalUmlRtText.g:328:4: otherlv_2= 'Package' () ( (lv_name_4_0= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getPackageAccess().getPackageKeyword_2_0());
                    			
                    // InternalUmlRtText.g:332:4: ()
                    // InternalUmlRtText.g:333:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPackageAccess().getPackageAction_2_1(),
                    						current);
                    				

                    }

                    // InternalUmlRtText.g:339:4: ( (lv_name_4_0= RULE_ID ) )
                    // InternalUmlRtText.g:340:5: (lv_name_4_0= RULE_ID )
                    {
                    // InternalUmlRtText.g:340:5: (lv_name_4_0= RULE_ID )
                    // InternalUmlRtText.g:341:6: lv_name_4_0= RULE_ID
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


    // $ANTLR start "entryRuleCapsule"
    // InternalUmlRtText.g:362:1: entryRuleCapsule returns [EObject current=null] : iv_ruleCapsule= ruleCapsule EOF ;
    public final EObject entryRuleCapsule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCapsule = null;


        try {
            // InternalUmlRtText.g:362:48: (iv_ruleCapsule= ruleCapsule EOF )
            // InternalUmlRtText.g:363:2: iv_ruleCapsule= ruleCapsule EOF
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
    // InternalUmlRtText.g:369:1: ruleCapsule returns [EObject current=null] : (otherlv_0= 'Capsule' () ( (lv_name_2_0= RULE_ID ) ) ( (lv_nestedClassifier_3_0= ruleClass ) ) ) ;
    public final EObject ruleCapsule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        EObject lv_nestedClassifier_3_0 = null;



        	enterRule();

        try {
            // InternalUmlRtText.g:375:2: ( (otherlv_0= 'Capsule' () ( (lv_name_2_0= RULE_ID ) ) ( (lv_nestedClassifier_3_0= ruleClass ) ) ) )
            // InternalUmlRtText.g:376:2: (otherlv_0= 'Capsule' () ( (lv_name_2_0= RULE_ID ) ) ( (lv_nestedClassifier_3_0= ruleClass ) ) )
            {
            // InternalUmlRtText.g:376:2: (otherlv_0= 'Capsule' () ( (lv_name_2_0= RULE_ID ) ) ( (lv_nestedClassifier_3_0= ruleClass ) ) )
            // InternalUmlRtText.g:377:3: otherlv_0= 'Capsule' () ( (lv_name_2_0= RULE_ID ) ) ( (lv_nestedClassifier_3_0= ruleClass ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCapsuleAccess().getCapsuleKeyword_0());
            		
            // InternalUmlRtText.g:381:3: ()
            // InternalUmlRtText.g:382:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCapsuleAccess().getCapsuleAction_1(),
            					current);
            			

            }

            // InternalUmlRtText.g:388:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalUmlRtText.g:389:4: (lv_name_2_0= RULE_ID )
            {
            // InternalUmlRtText.g:389:4: (lv_name_2_0= RULE_ID )
            // InternalUmlRtText.g:390:5: lv_name_2_0= RULE_ID
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

            // InternalUmlRtText.g:406:3: ( (lv_nestedClassifier_3_0= ruleClass ) )
            // InternalUmlRtText.g:407:4: (lv_nestedClassifier_3_0= ruleClass )
            {
            // InternalUmlRtText.g:407:4: (lv_nestedClassifier_3_0= ruleClass )
            // InternalUmlRtText.g:408:5: lv_nestedClassifier_3_0= ruleClass
            {

            					newCompositeNode(grammarAccess.getCapsuleAccess().getNestedClassifierClassParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_nestedClassifier_3_0=ruleClass();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCapsuleRule());
            					}
            					add(
            						current,
            						"nestedClassifier",
            						lv_nestedClassifier_3_0,
            						"org.eclipse.papyrusrt.umlrt.UmlRtText.Class");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleCapsule"


    // $ANTLR start "entryRuleCapsulePart"
    // InternalUmlRtText.g:429:1: entryRuleCapsulePart returns [EObject current=null] : iv_ruleCapsulePart= ruleCapsulePart EOF ;
    public final EObject entryRuleCapsulePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCapsulePart = null;


        try {
            // InternalUmlRtText.g:429:52: (iv_ruleCapsulePart= ruleCapsulePart EOF )
            // InternalUmlRtText.g:430:2: iv_ruleCapsulePart= ruleCapsulePart EOF
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
    // InternalUmlRtText.g:436:1: ruleCapsulePart returns [EObject current=null] : (otherlv_0= 'CapsulePart' () ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'IsNotification' ( (lv_isNotification_4_0= RULE_UML_BOOLEAN ) ) otherlv_5= 'IsPublish' ( (lv_isPublish_6_0= RULE_UML_BOOLEAN ) ) otherlv_7= 'IsWired' ( (lv_isWired_8_0= RULE_UML_BOOLEAN ) ) otherlv_9= 'Registration' ( (lv_registration_10_0= rulePortRegistrationType ) ) otherlv_11= 'RegistrationOverride' ( (lv_registrationOverride_12_0= RULE_UML_STRING ) ) ) ;
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
            // InternalUmlRtText.g:442:2: ( (otherlv_0= 'CapsulePart' () ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'IsNotification' ( (lv_isNotification_4_0= RULE_UML_BOOLEAN ) ) otherlv_5= 'IsPublish' ( (lv_isPublish_6_0= RULE_UML_BOOLEAN ) ) otherlv_7= 'IsWired' ( (lv_isWired_8_0= RULE_UML_BOOLEAN ) ) otherlv_9= 'Registration' ( (lv_registration_10_0= rulePortRegistrationType ) ) otherlv_11= 'RegistrationOverride' ( (lv_registrationOverride_12_0= RULE_UML_STRING ) ) ) )
            // InternalUmlRtText.g:443:2: (otherlv_0= 'CapsulePart' () ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'IsNotification' ( (lv_isNotification_4_0= RULE_UML_BOOLEAN ) ) otherlv_5= 'IsPublish' ( (lv_isPublish_6_0= RULE_UML_BOOLEAN ) ) otherlv_7= 'IsWired' ( (lv_isWired_8_0= RULE_UML_BOOLEAN ) ) otherlv_9= 'Registration' ( (lv_registration_10_0= rulePortRegistrationType ) ) otherlv_11= 'RegistrationOverride' ( (lv_registrationOverride_12_0= RULE_UML_STRING ) ) )
            {
            // InternalUmlRtText.g:443:2: (otherlv_0= 'CapsulePart' () ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'IsNotification' ( (lv_isNotification_4_0= RULE_UML_BOOLEAN ) ) otherlv_5= 'IsPublish' ( (lv_isPublish_6_0= RULE_UML_BOOLEAN ) ) otherlv_7= 'IsWired' ( (lv_isWired_8_0= RULE_UML_BOOLEAN ) ) otherlv_9= 'Registration' ( (lv_registration_10_0= rulePortRegistrationType ) ) otherlv_11= 'RegistrationOverride' ( (lv_registrationOverride_12_0= RULE_UML_STRING ) ) )
            // InternalUmlRtText.g:444:3: otherlv_0= 'CapsulePart' () ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'IsNotification' ( (lv_isNotification_4_0= RULE_UML_BOOLEAN ) ) otherlv_5= 'IsPublish' ( (lv_isPublish_6_0= RULE_UML_BOOLEAN ) ) otherlv_7= 'IsWired' ( (lv_isWired_8_0= RULE_UML_BOOLEAN ) ) otherlv_9= 'Registration' ( (lv_registration_10_0= rulePortRegistrationType ) ) otherlv_11= 'RegistrationOverride' ( (lv_registrationOverride_12_0= RULE_UML_STRING ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCapsulePartAccess().getCapsulePartKeyword_0());
            		
            // InternalUmlRtText.g:448:3: ()
            // InternalUmlRtText.g:449:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCapsulePartAccess().getCapsulePartAction_1(),
            					current);
            			

            }

            // InternalUmlRtText.g:455:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalUmlRtText.g:456:4: (lv_name_2_0= RULE_ID )
            {
            // InternalUmlRtText.g:456:4: (lv_name_2_0= RULE_ID )
            // InternalUmlRtText.g:457:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_7); 

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

            otherlv_3=(Token)match(input,21,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getCapsulePartAccess().getIsNotificationKeyword_3());
            		
            // InternalUmlRtText.g:477:3: ( (lv_isNotification_4_0= RULE_UML_BOOLEAN ) )
            // InternalUmlRtText.g:478:4: (lv_isNotification_4_0= RULE_UML_BOOLEAN )
            {
            // InternalUmlRtText.g:478:4: (lv_isNotification_4_0= RULE_UML_BOOLEAN )
            // InternalUmlRtText.g:479:5: lv_isNotification_4_0= RULE_UML_BOOLEAN
            {
            lv_isNotification_4_0=(Token)match(input,RULE_UML_BOOLEAN,FOLLOW_9); 

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

            otherlv_5=(Token)match(input,22,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getCapsulePartAccess().getIsPublishKeyword_5());
            		
            // InternalUmlRtText.g:499:3: ( (lv_isPublish_6_0= RULE_UML_BOOLEAN ) )
            // InternalUmlRtText.g:500:4: (lv_isPublish_6_0= RULE_UML_BOOLEAN )
            {
            // InternalUmlRtText.g:500:4: (lv_isPublish_6_0= RULE_UML_BOOLEAN )
            // InternalUmlRtText.g:501:5: lv_isPublish_6_0= RULE_UML_BOOLEAN
            {
            lv_isPublish_6_0=(Token)match(input,RULE_UML_BOOLEAN,FOLLOW_10); 

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

            otherlv_7=(Token)match(input,23,FOLLOW_8); 

            			newLeafNode(otherlv_7, grammarAccess.getCapsulePartAccess().getIsWiredKeyword_7());
            		
            // InternalUmlRtText.g:521:3: ( (lv_isWired_8_0= RULE_UML_BOOLEAN ) )
            // InternalUmlRtText.g:522:4: (lv_isWired_8_0= RULE_UML_BOOLEAN )
            {
            // InternalUmlRtText.g:522:4: (lv_isWired_8_0= RULE_UML_BOOLEAN )
            // InternalUmlRtText.g:523:5: lv_isWired_8_0= RULE_UML_BOOLEAN
            {
            lv_isWired_8_0=(Token)match(input,RULE_UML_BOOLEAN,FOLLOW_11); 

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

            otherlv_9=(Token)match(input,24,FOLLOW_12); 

            			newLeafNode(otherlv_9, grammarAccess.getCapsulePartAccess().getRegistrationKeyword_9());
            		
            // InternalUmlRtText.g:543:3: ( (lv_registration_10_0= rulePortRegistrationType ) )
            // InternalUmlRtText.g:544:4: (lv_registration_10_0= rulePortRegistrationType )
            {
            // InternalUmlRtText.g:544:4: (lv_registration_10_0= rulePortRegistrationType )
            // InternalUmlRtText.g:545:5: lv_registration_10_0= rulePortRegistrationType
            {

            					newCompositeNode(grammarAccess.getCapsulePartAccess().getRegistrationPortRegistrationTypeEnumRuleCall_10_0());
            				
            pushFollow(FOLLOW_13);
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

            otherlv_11=(Token)match(input,25,FOLLOW_14); 

            			newLeafNode(otherlv_11, grammarAccess.getCapsulePartAccess().getRegistrationOverrideKeyword_11());
            		
            // InternalUmlRtText.g:566:3: ( (lv_registrationOverride_12_0= RULE_UML_STRING ) )
            // InternalUmlRtText.g:567:4: (lv_registrationOverride_12_0= RULE_UML_STRING )
            {
            // InternalUmlRtText.g:567:4: (lv_registrationOverride_12_0= RULE_UML_STRING )
            // InternalUmlRtText.g:568:5: lv_registrationOverride_12_0= RULE_UML_STRING
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
    // InternalUmlRtText.g:588:1: entryRuleProtocol returns [EObject current=null] : iv_ruleProtocol= ruleProtocol EOF ;
    public final EObject entryRuleProtocol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtocol = null;


        try {
            // InternalUmlRtText.g:588:49: (iv_ruleProtocol= ruleProtocol EOF )
            // InternalUmlRtText.g:589:2: iv_ruleProtocol= ruleProtocol EOF
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
    // InternalUmlRtText.g:595:1: ruleProtocol returns [EObject current=null] : (otherlv_0= 'Protocol' () ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleProtocol() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalUmlRtText.g:601:2: ( (otherlv_0= 'Protocol' () ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalUmlRtText.g:602:2: (otherlv_0= 'Protocol' () ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalUmlRtText.g:602:2: (otherlv_0= 'Protocol' () ( (lv_name_2_0= RULE_ID ) ) )
            // InternalUmlRtText.g:603:3: otherlv_0= 'Protocol' () ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getProtocolAccess().getProtocolKeyword_0());
            		
            // InternalUmlRtText.g:607:3: ()
            // InternalUmlRtText.g:608:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProtocolAccess().getProtocolAction_1(),
            					current);
            			

            }

            // InternalUmlRtText.g:614:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalUmlRtText.g:615:4: (lv_name_2_0= RULE_ID )
            {
            // InternalUmlRtText.g:615:4: (lv_name_2_0= RULE_ID )
            // InternalUmlRtText.g:616:5: lv_name_2_0= RULE_ID
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
    // InternalUmlRtText.g:636:1: entryRuleRTPort returns [EObject current=null] : iv_ruleRTPort= ruleRTPort EOF ;
    public final EObject entryRuleRTPort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRTPort = null;


        try {
            // InternalUmlRtText.g:636:47: (iv_ruleRTPort= ruleRTPort EOF )
            // InternalUmlRtText.g:637:2: iv_ruleRTPort= ruleRTPort EOF
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
    // InternalUmlRtText.g:643:1: ruleRTPort returns [EObject current=null] : (otherlv_0= 'RTPort' () ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleRTPort() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalUmlRtText.g:649:2: ( (otherlv_0= 'RTPort' () ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalUmlRtText.g:650:2: (otherlv_0= 'RTPort' () ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalUmlRtText.g:650:2: (otherlv_0= 'RTPort' () ( (lv_name_2_0= RULE_ID ) ) )
            // InternalUmlRtText.g:651:3: otherlv_0= 'RTPort' () ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRTPortAccess().getRTPortKeyword_0());
            		
            // InternalUmlRtText.g:655:3: ()
            // InternalUmlRtText.g:656:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRTPortAccess().getRTPortAction_1(),
            					current);
            			

            }

            // InternalUmlRtText.g:662:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalUmlRtText.g:663:4: (lv_name_2_0= RULE_ID )
            {
            // InternalUmlRtText.g:663:4: (lv_name_2_0= RULE_ID )
            // InternalUmlRtText.g:664:5: lv_name_2_0= RULE_ID
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
    // InternalUmlRtText.g:684:1: entryRuleRTConnector returns [EObject current=null] : iv_ruleRTConnector= ruleRTConnector EOF ;
    public final EObject entryRuleRTConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRTConnector = null;


        try {
            // InternalUmlRtText.g:684:52: (iv_ruleRTConnector= ruleRTConnector EOF )
            // InternalUmlRtText.g:685:2: iv_ruleRTConnector= ruleRTConnector EOF
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
    // InternalUmlRtText.g:691:1: ruleRTConnector returns [EObject current=null] : (otherlv_0= 'RTConnector' () ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleRTConnector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalUmlRtText.g:697:2: ( (otherlv_0= 'RTConnector' () ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalUmlRtText.g:698:2: (otherlv_0= 'RTConnector' () ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalUmlRtText.g:698:2: (otherlv_0= 'RTConnector' () ( (lv_name_2_0= RULE_ID ) ) )
            // InternalUmlRtText.g:699:3: otherlv_0= 'RTConnector' () ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRTConnectorAccess().getRTConnectorKeyword_0());
            		
            // InternalUmlRtText.g:703:3: ()
            // InternalUmlRtText.g:704:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRTConnectorAccess().getRTConnectorAction_1(),
            					current);
            			

            }

            // InternalUmlRtText.g:710:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalUmlRtText.g:711:4: (lv_name_2_0= RULE_ID )
            {
            // InternalUmlRtText.g:711:4: (lv_name_2_0= RULE_ID )
            // InternalUmlRtText.g:712:5: lv_name_2_0= RULE_ID
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
    // InternalUmlRtText.g:732:1: entryRuleProtocolContainer returns [EObject current=null] : iv_ruleProtocolContainer= ruleProtocolContainer EOF ;
    public final EObject entryRuleProtocolContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProtocolContainer = null;


        try {
            // InternalUmlRtText.g:732:58: (iv_ruleProtocolContainer= ruleProtocolContainer EOF )
            // InternalUmlRtText.g:733:2: iv_ruleProtocolContainer= ruleProtocolContainer EOF
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
    // InternalUmlRtText.g:739:1: ruleProtocolContainer returns [EObject current=null] : (otherlv_0= 'ProtocolContainer' () ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_packagedElement_4_1= ruleProtocol | lv_packagedElement_4_2= ruleRTMessageSet ) ) )* otherlv_5= '}' ) ;
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
            // InternalUmlRtText.g:745:2: ( (otherlv_0= 'ProtocolContainer' () ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_packagedElement_4_1= ruleProtocol | lv_packagedElement_4_2= ruleRTMessageSet ) ) )* otherlv_5= '}' ) )
            // InternalUmlRtText.g:746:2: (otherlv_0= 'ProtocolContainer' () ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_packagedElement_4_1= ruleProtocol | lv_packagedElement_4_2= ruleRTMessageSet ) ) )* otherlv_5= '}' )
            {
            // InternalUmlRtText.g:746:2: (otherlv_0= 'ProtocolContainer' () ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_packagedElement_4_1= ruleProtocol | lv_packagedElement_4_2= ruleRTMessageSet ) ) )* otherlv_5= '}' )
            // InternalUmlRtText.g:747:3: otherlv_0= 'ProtocolContainer' () ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_packagedElement_4_1= ruleProtocol | lv_packagedElement_4_2= ruleRTMessageSet ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getProtocolContainerAccess().getProtocolContainerKeyword_0());
            		
            // InternalUmlRtText.g:751:3: ()
            // InternalUmlRtText.g:752:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProtocolContainerAccess().getProtocolContainerAction_1(),
            					current);
            			

            }

            // InternalUmlRtText.g:758:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalUmlRtText.g:759:4: (lv_name_2_0= RULE_ID )
            {
            // InternalUmlRtText.g:759:4: (lv_name_2_0= RULE_ID )
            // InternalUmlRtText.g:760:5: lv_name_2_0= RULE_ID
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

            otherlv_3=(Token)match(input,14,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getProtocolContainerAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalUmlRtText.g:780:3: ( ( (lv_packagedElement_4_1= ruleProtocol | lv_packagedElement_4_2= ruleRTMessageSet ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==26||LA7_0==32) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalUmlRtText.g:781:4: ( (lv_packagedElement_4_1= ruleProtocol | lv_packagedElement_4_2= ruleRTMessageSet ) )
            	    {
            	    // InternalUmlRtText.g:781:4: ( (lv_packagedElement_4_1= ruleProtocol | lv_packagedElement_4_2= ruleRTMessageSet ) )
            	    // InternalUmlRtText.g:782:5: (lv_packagedElement_4_1= ruleProtocol | lv_packagedElement_4_2= ruleRTMessageSet )
            	    {
            	    // InternalUmlRtText.g:782:5: (lv_packagedElement_4_1= ruleProtocol | lv_packagedElement_4_2= ruleRTMessageSet )
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0==26) ) {
            	        alt6=1;
            	    }
            	    else if ( (LA6_0==32) ) {
            	        alt6=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 6, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // InternalUmlRtText.g:783:6: lv_packagedElement_4_1= ruleProtocol
            	            {

            	            						newCompositeNode(grammarAccess.getProtocolContainerAccess().getPackagedElementProtocolParserRuleCall_4_0_0());
            	            					
            	            pushFollow(FOLLOW_15);
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
            	            // InternalUmlRtText.g:799:6: lv_packagedElement_4_2= ruleRTMessageSet
            	            {

            	            						newCompositeNode(grammarAccess.getProtocolContainerAccess().getPackagedElementRTMessageSetParserRuleCall_4_0_1());
            	            					
            	            pushFollow(FOLLOW_15);
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
            	    break loop7;
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
    // InternalUmlRtText.g:825:1: entryRuleRTRedefinedElement returns [EObject current=null] : iv_ruleRTRedefinedElement= ruleRTRedefinedElement EOF ;
    public final EObject entryRuleRTRedefinedElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRTRedefinedElement = null;


        try {
            // InternalUmlRtText.g:825:59: (iv_ruleRTRedefinedElement= ruleRTRedefinedElement EOF )
            // InternalUmlRtText.g:826:2: iv_ruleRTRedefinedElement= ruleRTRedefinedElement EOF
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
    // InternalUmlRtText.g:832:1: ruleRTRedefinedElement returns [EObject current=null] : (otherlv_0= 'RTRedefinedElement' () ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'RootFragment' ( (lv_rootFragment_4_0= ruleRedefinableElement ) ) )? ) ;
    public final EObject ruleRTRedefinedElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        EObject lv_rootFragment_4_0 = null;



        	enterRule();

        try {
            // InternalUmlRtText.g:838:2: ( (otherlv_0= 'RTRedefinedElement' () ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'RootFragment' ( (lv_rootFragment_4_0= ruleRedefinableElement ) ) )? ) )
            // InternalUmlRtText.g:839:2: (otherlv_0= 'RTRedefinedElement' () ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'RootFragment' ( (lv_rootFragment_4_0= ruleRedefinableElement ) ) )? )
            {
            // InternalUmlRtText.g:839:2: (otherlv_0= 'RTRedefinedElement' () ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'RootFragment' ( (lv_rootFragment_4_0= ruleRedefinableElement ) ) )? )
            // InternalUmlRtText.g:840:3: otherlv_0= 'RTRedefinedElement' () ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'RootFragment' ( (lv_rootFragment_4_0= ruleRedefinableElement ) ) )?
            {
            otherlv_0=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRTRedefinedElementAccess().getRTRedefinedElementKeyword_0());
            		
            // InternalUmlRtText.g:844:3: ()
            // InternalUmlRtText.g:845:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRTRedefinedElementAccess().getRTRedefinedElementAction_1(),
            					current);
            			

            }

            // InternalUmlRtText.g:851:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalUmlRtText.g:852:4: (lv_name_2_0= RULE_ID )
            {
            // InternalUmlRtText.g:852:4: (lv_name_2_0= RULE_ID )
            // InternalUmlRtText.g:853:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_16); 

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

            // InternalUmlRtText.g:869:3: (otherlv_3= 'RootFragment' ( (lv_rootFragment_4_0= ruleRedefinableElement ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==31) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalUmlRtText.g:870:4: otherlv_3= 'RootFragment' ( (lv_rootFragment_4_0= ruleRedefinableElement ) )
                    {
                    otherlv_3=(Token)match(input,31,FOLLOW_17); 

                    				newLeafNode(otherlv_3, grammarAccess.getRTRedefinedElementAccess().getRootFragmentKeyword_3_0());
                    			
                    // InternalUmlRtText.g:874:4: ( (lv_rootFragment_4_0= ruleRedefinableElement ) )
                    // InternalUmlRtText.g:875:5: (lv_rootFragment_4_0= ruleRedefinableElement )
                    {
                    // InternalUmlRtText.g:875:5: (lv_rootFragment_4_0= ruleRedefinableElement )
                    // InternalUmlRtText.g:876:6: lv_rootFragment_4_0= ruleRedefinableElement
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
    // InternalUmlRtText.g:898:1: entryRuleRTMessageSet returns [EObject current=null] : iv_ruleRTMessageSet= ruleRTMessageSet EOF ;
    public final EObject entryRuleRTMessageSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRTMessageSet = null;


        try {
            // InternalUmlRtText.g:898:53: (iv_ruleRTMessageSet= ruleRTMessageSet EOF )
            // InternalUmlRtText.g:899:2: iv_ruleRTMessageSet= ruleRTMessageSet EOF
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
    // InternalUmlRtText.g:905:1: ruleRTMessageSet returns [EObject current=null] : (otherlv_0= 'RTMessageSet' () ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'RTMsgKind' ( (lv_rtMsgKind_4_0= ruleRTMessageKind ) ) ) ;
    public final EObject ruleRTMessageSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Enumerator lv_rtMsgKind_4_0 = null;



        	enterRule();

        try {
            // InternalUmlRtText.g:911:2: ( (otherlv_0= 'RTMessageSet' () ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'RTMsgKind' ( (lv_rtMsgKind_4_0= ruleRTMessageKind ) ) ) )
            // InternalUmlRtText.g:912:2: (otherlv_0= 'RTMessageSet' () ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'RTMsgKind' ( (lv_rtMsgKind_4_0= ruleRTMessageKind ) ) )
            {
            // InternalUmlRtText.g:912:2: (otherlv_0= 'RTMessageSet' () ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'RTMsgKind' ( (lv_rtMsgKind_4_0= ruleRTMessageKind ) ) )
            // InternalUmlRtText.g:913:3: otherlv_0= 'RTMessageSet' () ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'RTMsgKind' ( (lv_rtMsgKind_4_0= ruleRTMessageKind ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRTMessageSetAccess().getRTMessageSetKeyword_0());
            		
            // InternalUmlRtText.g:917:3: ()
            // InternalUmlRtText.g:918:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRTMessageSetAccess().getRTMessageSetAction_1(),
            					current);
            			

            }

            // InternalUmlRtText.g:924:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalUmlRtText.g:925:4: (lv_name_2_0= RULE_ID )
            {
            // InternalUmlRtText.g:925:4: (lv_name_2_0= RULE_ID )
            // InternalUmlRtText.g:926:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_18); 

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

            otherlv_3=(Token)match(input,33,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getRTMessageSetAccess().getRTMsgKindKeyword_3());
            		
            // InternalUmlRtText.g:946:3: ( (lv_rtMsgKind_4_0= ruleRTMessageKind ) )
            // InternalUmlRtText.g:947:4: (lv_rtMsgKind_4_0= ruleRTMessageKind )
            {
            // InternalUmlRtText.g:947:4: (lv_rtMsgKind_4_0= ruleRTMessageKind )
            // InternalUmlRtText.g:948:5: lv_rtMsgKind_4_0= ruleRTMessageKind
            {

            					newCompositeNode(grammarAccess.getRTMessageSetAccess().getRtMsgKindRTMessageKindEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_rtMsgKind_4_0=ruleRTMessageKind();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRTMessageSetRule());
            					}
            					set(
            						current,
            						"rtMsgKind",
            						lv_rtMsgKind_4_0,
            						"org.eclipse.papyrusrt.umlrt.UmlRtText.RTMessageKind");
            					afterParserOrEnumRuleCall();
            				

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


    // $ANTLR start "rulePortRegistrationType"
    // InternalUmlRtText.g:969:1: rulePortRegistrationType returns [Enumerator current=null] : ( (enumLiteral_0= 'Automatic' ) | (enumLiteral_1= 'Application' ) | (enumLiteral_2= 'AutomaticLocked' ) ) ;
    public final Enumerator rulePortRegistrationType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalUmlRtText.g:975:2: ( ( (enumLiteral_0= 'Automatic' ) | (enumLiteral_1= 'Application' ) | (enumLiteral_2= 'AutomaticLocked' ) ) )
            // InternalUmlRtText.g:976:2: ( (enumLiteral_0= 'Automatic' ) | (enumLiteral_1= 'Application' ) | (enumLiteral_2= 'AutomaticLocked' ) )
            {
            // InternalUmlRtText.g:976:2: ( (enumLiteral_0= 'Automatic' ) | (enumLiteral_1= 'Application' ) | (enumLiteral_2= 'AutomaticLocked' ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt9=1;
                }
                break;
            case 35:
                {
                alt9=2;
                }
                break;
            case 36:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalUmlRtText.g:977:3: (enumLiteral_0= 'Automatic' )
                    {
                    // InternalUmlRtText.g:977:3: (enumLiteral_0= 'Automatic' )
                    // InternalUmlRtText.g:978:4: enumLiteral_0= 'Automatic'
                    {
                    enumLiteral_0=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getPortRegistrationTypeAccess().getAutomaticEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPortRegistrationTypeAccess().getAutomaticEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalUmlRtText.g:985:3: (enumLiteral_1= 'Application' )
                    {
                    // InternalUmlRtText.g:985:3: (enumLiteral_1= 'Application' )
                    // InternalUmlRtText.g:986:4: enumLiteral_1= 'Application'
                    {
                    enumLiteral_1=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getPortRegistrationTypeAccess().getApplicationEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPortRegistrationTypeAccess().getApplicationEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalUmlRtText.g:993:3: (enumLiteral_2= 'AutomaticLocked' )
                    {
                    // InternalUmlRtText.g:993:3: (enumLiteral_2= 'AutomaticLocked' )
                    // InternalUmlRtText.g:994:4: enumLiteral_2= 'AutomaticLocked'
                    {
                    enumLiteral_2=(Token)match(input,36,FOLLOW_2); 

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
    // InternalUmlRtText.g:1004:1: ruleRTMessageKind returns [Enumerator current=null] : ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inOut' ) ) ;
    public final Enumerator ruleRTMessageKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalUmlRtText.g:1010:2: ( ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inOut' ) ) )
            // InternalUmlRtText.g:1011:2: ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inOut' ) )
            {
            // InternalUmlRtText.g:1011:2: ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inOut' ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt10=1;
                }
                break;
            case 38:
                {
                alt10=2;
                }
                break;
            case 39:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalUmlRtText.g:1012:3: (enumLiteral_0= 'in' )
                    {
                    // InternalUmlRtText.g:1012:3: (enumLiteral_0= 'in' )
                    // InternalUmlRtText.g:1013:4: enumLiteral_0= 'in'
                    {
                    enumLiteral_0=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getRTMessageKindAccess().getInEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRTMessageKindAccess().getInEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalUmlRtText.g:1020:3: (enumLiteral_1= 'out' )
                    {
                    // InternalUmlRtText.g:1020:3: (enumLiteral_1= 'out' )
                    // InternalUmlRtText.g:1021:4: enumLiteral_1= 'out'
                    {
                    enumLiteral_1=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getRTMessageKindAccess().getOutEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRTMessageKindAccess().getOutEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalUmlRtText.g:1028:3: (enumLiteral_2= 'inOut' )
                    {
                    // InternalUmlRtText.g:1028:3: (enumLiteral_2= 'inOut' )
                    // InternalUmlRtText.g:1029:4: enumLiteral_2= 'inOut'
                    {
                    enumLiteral_2=(Token)match(input,39,FOLLOW_2); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000200DA000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000200D2000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000001C00000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000104008000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000040020000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000E000000000L});

}
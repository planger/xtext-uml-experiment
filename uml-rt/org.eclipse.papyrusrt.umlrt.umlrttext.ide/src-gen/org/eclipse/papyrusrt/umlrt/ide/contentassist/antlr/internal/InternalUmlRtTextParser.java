package org.eclipse.papyrusrt.umlrt.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.eclipse.papyrusrt.umlrt.services.UmlRtTextGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalUmlRtTextParser extends AbstractInternalContentAssistParser {
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

    	public void setGrammarAccess(UmlRtTextGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalUmlRtText.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalUmlRtText.g:54:1: ( ruleModel EOF )
            // InternalUmlRtText.g:55:1: ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalUmlRtText.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlRtText.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalUmlRtText.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalUmlRtText.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalUmlRtText.g:68:3: ( rule__Model__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getGroup()); 
            }
            // InternalUmlRtText.g:69:3: ( rule__Model__Group__0 )
            // InternalUmlRtText.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRulePackageableElement"
    // InternalUmlRtText.g:78:1: entryRulePackageableElement : rulePackageableElement EOF ;
    public final void entryRulePackageableElement() throws RecognitionException {
        try {
            // InternalUmlRtText.g:79:1: ( rulePackageableElement EOF )
            // InternalUmlRtText.g:80:1: rulePackageableElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageableElementRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePackageableElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageableElementRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePackageableElement"


    // $ANTLR start "rulePackageableElement"
    // InternalUmlRtText.g:87:1: rulePackageableElement : ( rulePackage ) ;
    public final void rulePackageableElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlRtText.g:91:2: ( ( rulePackage ) )
            // InternalUmlRtText.g:92:2: ( rulePackage )
            {
            // InternalUmlRtText.g:92:2: ( rulePackage )
            // InternalUmlRtText.g:93:3: rulePackage
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageableElementAccess().getPackageParserRuleCall()); 
            }
            pushFollow(FOLLOW_2);
            rulePackage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageableElementAccess().getPackageParserRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePackageableElement"


    // $ANTLR start "entryRulePackage"
    // InternalUmlRtText.g:103:1: entryRulePackage : rulePackage EOF ;
    public final void entryRulePackage() throws RecognitionException {
        try {
            // InternalUmlRtText.g:104:1: ( rulePackage EOF )
            // InternalUmlRtText.g:105:1: rulePackage EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePackage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePackage"


    // $ANTLR start "rulePackage"
    // InternalUmlRtText.g:112:1: rulePackage : ( ( rule__Package__Alternatives ) ) ;
    public final void rulePackage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlRtText.g:116:2: ( ( ( rule__Package__Alternatives ) ) )
            // InternalUmlRtText.g:117:2: ( ( rule__Package__Alternatives ) )
            {
            // InternalUmlRtText.g:117:2: ( ( rule__Package__Alternatives ) )
            // InternalUmlRtText.g:118:3: ( rule__Package__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getAlternatives()); 
            }
            // InternalUmlRtText.g:119:3: ( rule__Package__Alternatives )
            // InternalUmlRtText.g:119:4: rule__Package__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Package__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPackageAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRuleProtocolContainer"
    // InternalUmlRtText.g:128:1: entryRuleProtocolContainer : ruleProtocolContainer EOF ;
    public final void entryRuleProtocolContainer() throws RecognitionException {
        try {
            // InternalUmlRtText.g:129:1: ( ruleProtocolContainer EOF )
            // InternalUmlRtText.g:130:1: ruleProtocolContainer EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProtocolContainerRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleProtocolContainer();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProtocolContainerRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProtocolContainer"


    // $ANTLR start "ruleProtocolContainer"
    // InternalUmlRtText.g:137:1: ruleProtocolContainer : ( ( rule__ProtocolContainer__Group__0 ) ) ;
    public final void ruleProtocolContainer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlRtText.g:141:2: ( ( ( rule__ProtocolContainer__Group__0 ) ) )
            // InternalUmlRtText.g:142:2: ( ( rule__ProtocolContainer__Group__0 ) )
            {
            // InternalUmlRtText.g:142:2: ( ( rule__ProtocolContainer__Group__0 ) )
            // InternalUmlRtText.g:143:3: ( rule__ProtocolContainer__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProtocolContainerAccess().getGroup()); 
            }
            // InternalUmlRtText.g:144:3: ( rule__ProtocolContainer__Group__0 )
            // InternalUmlRtText.g:144:4: rule__ProtocolContainer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ProtocolContainer__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProtocolContainerAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProtocolContainer"


    // $ANTLR start "entryRuleProtocol"
    // InternalUmlRtText.g:153:1: entryRuleProtocol : ruleProtocol EOF ;
    public final void entryRuleProtocol() throws RecognitionException {
        try {
            // InternalUmlRtText.g:154:1: ( ruleProtocol EOF )
            // InternalUmlRtText.g:155:1: ruleProtocol EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProtocolRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleProtocol();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProtocolRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProtocol"


    // $ANTLR start "ruleProtocol"
    // InternalUmlRtText.g:162:1: ruleProtocol : ( ( rule__Protocol__Group__0 ) ) ;
    public final void ruleProtocol() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlRtText.g:166:2: ( ( ( rule__Protocol__Group__0 ) ) )
            // InternalUmlRtText.g:167:2: ( ( rule__Protocol__Group__0 ) )
            {
            // InternalUmlRtText.g:167:2: ( ( rule__Protocol__Group__0 ) )
            // InternalUmlRtText.g:168:3: ( rule__Protocol__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProtocolAccess().getGroup()); 
            }
            // InternalUmlRtText.g:169:3: ( rule__Protocol__Group__0 )
            // InternalUmlRtText.g:169:4: rule__Protocol__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Protocol__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProtocolAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProtocol"


    // $ANTLR start "entryRuleRTMessageSet"
    // InternalUmlRtText.g:178:1: entryRuleRTMessageSet : ruleRTMessageSet EOF ;
    public final void entryRuleRTMessageSet() throws RecognitionException {
        try {
            // InternalUmlRtText.g:179:1: ( ruleRTMessageSet EOF )
            // InternalUmlRtText.g:180:1: ruleRTMessageSet EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRTMessageSetRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleRTMessageSet();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRTMessageSetRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRTMessageSet"


    // $ANTLR start "ruleRTMessageSet"
    // InternalUmlRtText.g:187:1: ruleRTMessageSet : ( ( rule__RTMessageSet__Group__0 ) ) ;
    public final void ruleRTMessageSet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlRtText.g:191:2: ( ( ( rule__RTMessageSet__Group__0 ) ) )
            // InternalUmlRtText.g:192:2: ( ( rule__RTMessageSet__Group__0 ) )
            {
            // InternalUmlRtText.g:192:2: ( ( rule__RTMessageSet__Group__0 ) )
            // InternalUmlRtText.g:193:3: ( rule__RTMessageSet__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRTMessageSetAccess().getGroup()); 
            }
            // InternalUmlRtText.g:194:3: ( rule__RTMessageSet__Group__0 )
            // InternalUmlRtText.g:194:4: rule__RTMessageSet__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RTMessageSet__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRTMessageSetAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRTMessageSet"


    // $ANTLR start "rule__Package__Alternatives"
    // InternalUmlRtText.g:202:1: rule__Package__Alternatives : ( ( ruleProtocolContainer ) | ( ruleModel ) );
    public final void rule__Package__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlRtText.g:206:1: ( ( ruleProtocolContainer ) | ( ruleModel ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=14 && LA1_0<=15)) ) {
                alt1=1;
            }
            else if ( (LA1_0==11) ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalUmlRtText.g:207:2: ( ruleProtocolContainer )
                    {
                    // InternalUmlRtText.g:207:2: ( ruleProtocolContainer )
                    // InternalUmlRtText.g:208:3: ruleProtocolContainer
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPackageAccess().getProtocolContainerParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleProtocolContainer();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPackageAccess().getProtocolContainerParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalUmlRtText.g:213:2: ( ruleModel )
                    {
                    // InternalUmlRtText.g:213:2: ( ruleModel )
                    // InternalUmlRtText.g:214:3: ruleModel
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPackageAccess().getModelParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleModel();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPackageAccess().getModelParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalUmlRtText.g:223:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlRtText.g:227:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalUmlRtText.g:228:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalUmlRtText.g:235:1: rule__Model__Group__0__Impl : ( 'model' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlRtText.g:239:1: ( ( 'model' ) )
            // InternalUmlRtText.g:240:1: ( 'model' )
            {
            // InternalUmlRtText.g:240:1: ( 'model' )
            // InternalUmlRtText.g:241:2: 'model'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getModelKeyword_0()); 
            }
            match(input,11,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getModelKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalUmlRtText.g:250:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlRtText.g:254:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalUmlRtText.g:255:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalUmlRtText.g:262:1: rule__Model__Group__1__Impl : ( () ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlRtText.g:266:1: ( ( () ) )
            // InternalUmlRtText.g:267:1: ( () )
            {
            // InternalUmlRtText.g:267:1: ( () )
            // InternalUmlRtText.g:268:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getModelAction_1()); 
            }
            // InternalUmlRtText.g:269:2: ()
            // InternalUmlRtText.g:269:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getModelAction_1()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // InternalUmlRtText.g:277:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlRtText.g:281:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalUmlRtText.g:282:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Model__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // InternalUmlRtText.g:289:1: rule__Model__Group__2__Impl : ( ( rule__Model__NameAssignment_2 ) ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlRtText.g:293:1: ( ( ( rule__Model__NameAssignment_2 ) ) )
            // InternalUmlRtText.g:294:1: ( ( rule__Model__NameAssignment_2 ) )
            {
            // InternalUmlRtText.g:294:1: ( ( rule__Model__NameAssignment_2 ) )
            // InternalUmlRtText.g:295:2: ( rule__Model__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getNameAssignment_2()); 
            }
            // InternalUmlRtText.g:296:2: ( rule__Model__NameAssignment_2 )
            // InternalUmlRtText.g:296:3: rule__Model__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Model__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // InternalUmlRtText.g:304:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlRtText.g:308:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalUmlRtText.g:309:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Model__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // InternalUmlRtText.g:316:1: rule__Model__Group__3__Impl : ( '{' ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlRtText.g:320:1: ( ( '{' ) )
            // InternalUmlRtText.g:321:1: ( '{' )
            {
            // InternalUmlRtText.g:321:1: ( '{' )
            // InternalUmlRtText.g:322:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,12,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Model__Group__4"
    // InternalUmlRtText.g:331:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlRtText.g:335:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // InternalUmlRtText.g:336:2: rule__Model__Group__4__Impl rule__Model__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Model__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4"


    // $ANTLR start "rule__Model__Group__4__Impl"
    // InternalUmlRtText.g:343:1: rule__Model__Group__4__Impl : ( ( rule__Model__PackagedElementAssignment_4 )* ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlRtText.g:347:1: ( ( ( rule__Model__PackagedElementAssignment_4 )* ) )
            // InternalUmlRtText.g:348:1: ( ( rule__Model__PackagedElementAssignment_4 )* )
            {
            // InternalUmlRtText.g:348:1: ( ( rule__Model__PackagedElementAssignment_4 )* )
            // InternalUmlRtText.g:349:2: ( rule__Model__PackagedElementAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getPackagedElementAssignment_4()); 
            }
            // InternalUmlRtText.g:350:2: ( rule__Model__PackagedElementAssignment_4 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==11||(LA2_0>=14 && LA2_0<=15)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalUmlRtText.g:350:3: rule__Model__PackagedElementAssignment_4
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Model__PackagedElementAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getPackagedElementAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4__Impl"


    // $ANTLR start "rule__Model__Group__5"
    // InternalUmlRtText.g:358:1: rule__Model__Group__5 : rule__Model__Group__5__Impl ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlRtText.g:362:1: ( rule__Model__Group__5__Impl )
            // InternalUmlRtText.g:363:2: rule__Model__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__5"


    // $ANTLR start "rule__Model__Group__5__Impl"
    // InternalUmlRtText.g:369:1: rule__Model__Group__5__Impl : ( '}' ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlRtText.g:373:1: ( ( '}' ) )
            // InternalUmlRtText.g:374:1: ( '}' )
            {
            // InternalUmlRtText.g:374:1: ( '}' )
            // InternalUmlRtText.g:375:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,13,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__5__Impl"


    // $ANTLR start "rule__ProtocolContainer__Group__0"
    // InternalUmlRtText.g:385:1: rule__ProtocolContainer__Group__0 : rule__ProtocolContainer__Group__0__Impl rule__ProtocolContainer__Group__1 ;
    public final void rule__ProtocolContainer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlRtText.g:389:1: ( rule__ProtocolContainer__Group__0__Impl rule__ProtocolContainer__Group__1 )
            // InternalUmlRtText.g:390:2: rule__ProtocolContainer__Group__0__Impl rule__ProtocolContainer__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__ProtocolContainer__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ProtocolContainer__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtocolContainer__Group__0"


    // $ANTLR start "rule__ProtocolContainer__Group__0__Impl"
    // InternalUmlRtText.g:397:1: rule__ProtocolContainer__Group__0__Impl : ( () ) ;
    public final void rule__ProtocolContainer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlRtText.g:401:1: ( ( () ) )
            // InternalUmlRtText.g:402:1: ( () )
            {
            // InternalUmlRtText.g:402:1: ( () )
            // InternalUmlRtText.g:403:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProtocolContainerAccess().getProtocolContainerAction_0()); 
            }
            // InternalUmlRtText.g:404:2: ()
            // InternalUmlRtText.g:404:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProtocolContainerAccess().getProtocolContainerAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtocolContainer__Group__0__Impl"


    // $ANTLR start "rule__ProtocolContainer__Group__1"
    // InternalUmlRtText.g:412:1: rule__ProtocolContainer__Group__1 : rule__ProtocolContainer__Group__1__Impl ;
    public final void rule__ProtocolContainer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlRtText.g:416:1: ( rule__ProtocolContainer__Group__1__Impl )
            // InternalUmlRtText.g:417:2: rule__ProtocolContainer__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProtocolContainer__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtocolContainer__Group__1"


    // $ANTLR start "rule__ProtocolContainer__Group__1__Impl"
    // InternalUmlRtText.g:423:1: rule__ProtocolContainer__Group__1__Impl : ( ( rule__ProtocolContainer__UnorderedGroup_1 ) ) ;
    public final void rule__ProtocolContainer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlRtText.g:427:1: ( ( ( rule__ProtocolContainer__UnorderedGroup_1 ) ) )
            // InternalUmlRtText.g:428:1: ( ( rule__ProtocolContainer__UnorderedGroup_1 ) )
            {
            // InternalUmlRtText.g:428:1: ( ( rule__ProtocolContainer__UnorderedGroup_1 ) )
            // InternalUmlRtText.g:429:2: ( rule__ProtocolContainer__UnorderedGroup_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProtocolContainerAccess().getUnorderedGroup_1()); 
            }
            // InternalUmlRtText.g:430:2: ( rule__ProtocolContainer__UnorderedGroup_1 )
            // InternalUmlRtText.g:430:3: rule__ProtocolContainer__UnorderedGroup_1
            {
            pushFollow(FOLLOW_2);
            rule__ProtocolContainer__UnorderedGroup_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProtocolContainerAccess().getUnorderedGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtocolContainer__Group__1__Impl"


    // $ANTLR start "rule__Protocol__Group__0"
    // InternalUmlRtText.g:439:1: rule__Protocol__Group__0 : rule__Protocol__Group__0__Impl rule__Protocol__Group__1 ;
    public final void rule__Protocol__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlRtText.g:443:1: ( rule__Protocol__Group__0__Impl rule__Protocol__Group__1 )
            // InternalUmlRtText.g:444:2: rule__Protocol__Group__0__Impl rule__Protocol__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Protocol__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Protocol__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__0"


    // $ANTLR start "rule__Protocol__Group__0__Impl"
    // InternalUmlRtText.g:451:1: rule__Protocol__Group__0__Impl : ( 'protocol' ) ;
    public final void rule__Protocol__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlRtText.g:455:1: ( ( 'protocol' ) )
            // InternalUmlRtText.g:456:1: ( 'protocol' )
            {
            // InternalUmlRtText.g:456:1: ( 'protocol' )
            // InternalUmlRtText.g:457:2: 'protocol'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProtocolAccess().getProtocolKeyword_0()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProtocolAccess().getProtocolKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__0__Impl"


    // $ANTLR start "rule__Protocol__Group__1"
    // InternalUmlRtText.g:466:1: rule__Protocol__Group__1 : rule__Protocol__Group__1__Impl rule__Protocol__Group__2 ;
    public final void rule__Protocol__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlRtText.g:470:1: ( rule__Protocol__Group__1__Impl rule__Protocol__Group__2 )
            // InternalUmlRtText.g:471:2: rule__Protocol__Group__1__Impl rule__Protocol__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Protocol__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Protocol__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__1"


    // $ANTLR start "rule__Protocol__Group__1__Impl"
    // InternalUmlRtText.g:478:1: rule__Protocol__Group__1__Impl : ( () ) ;
    public final void rule__Protocol__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlRtText.g:482:1: ( ( () ) )
            // InternalUmlRtText.g:483:1: ( () )
            {
            // InternalUmlRtText.g:483:1: ( () )
            // InternalUmlRtText.g:484:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProtocolAccess().getProtocolAction_1()); 
            }
            // InternalUmlRtText.g:485:2: ()
            // InternalUmlRtText.g:485:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProtocolAccess().getProtocolAction_1()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__1__Impl"


    // $ANTLR start "rule__Protocol__Group__2"
    // InternalUmlRtText.g:493:1: rule__Protocol__Group__2 : rule__Protocol__Group__2__Impl ;
    public final void rule__Protocol__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlRtText.g:497:1: ( rule__Protocol__Group__2__Impl )
            // InternalUmlRtText.g:498:2: rule__Protocol__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Protocol__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__2"


    // $ANTLR start "rule__Protocol__Group__2__Impl"
    // InternalUmlRtText.g:504:1: rule__Protocol__Group__2__Impl : ( ( rule__Protocol__NameAssignment_2 ) ) ;
    public final void rule__Protocol__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlRtText.g:508:1: ( ( ( rule__Protocol__NameAssignment_2 ) ) )
            // InternalUmlRtText.g:509:1: ( ( rule__Protocol__NameAssignment_2 ) )
            {
            // InternalUmlRtText.g:509:1: ( ( rule__Protocol__NameAssignment_2 ) )
            // InternalUmlRtText.g:510:2: ( rule__Protocol__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProtocolAccess().getNameAssignment_2()); 
            }
            // InternalUmlRtText.g:511:2: ( rule__Protocol__NameAssignment_2 )
            // InternalUmlRtText.g:511:3: rule__Protocol__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Protocol__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getProtocolAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__2__Impl"


    // $ANTLR start "rule__RTMessageSet__Group__0"
    // InternalUmlRtText.g:520:1: rule__RTMessageSet__Group__0 : rule__RTMessageSet__Group__0__Impl rule__RTMessageSet__Group__1 ;
    public final void rule__RTMessageSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlRtText.g:524:1: ( rule__RTMessageSet__Group__0__Impl rule__RTMessageSet__Group__1 )
            // InternalUmlRtText.g:525:2: rule__RTMessageSet__Group__0__Impl rule__RTMessageSet__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__RTMessageSet__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RTMessageSet__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RTMessageSet__Group__0"


    // $ANTLR start "rule__RTMessageSet__Group__0__Impl"
    // InternalUmlRtText.g:532:1: rule__RTMessageSet__Group__0__Impl : ( 'interface' ) ;
    public final void rule__RTMessageSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlRtText.g:536:1: ( ( 'interface' ) )
            // InternalUmlRtText.g:537:1: ( 'interface' )
            {
            // InternalUmlRtText.g:537:1: ( 'interface' )
            // InternalUmlRtText.g:538:2: 'interface'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRTMessageSetAccess().getInterfaceKeyword_0()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRTMessageSetAccess().getInterfaceKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RTMessageSet__Group__0__Impl"


    // $ANTLR start "rule__RTMessageSet__Group__1"
    // InternalUmlRtText.g:547:1: rule__RTMessageSet__Group__1 : rule__RTMessageSet__Group__1__Impl rule__RTMessageSet__Group__2 ;
    public final void rule__RTMessageSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlRtText.g:551:1: ( rule__RTMessageSet__Group__1__Impl rule__RTMessageSet__Group__2 )
            // InternalUmlRtText.g:552:2: rule__RTMessageSet__Group__1__Impl rule__RTMessageSet__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__RTMessageSet__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RTMessageSet__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RTMessageSet__Group__1"


    // $ANTLR start "rule__RTMessageSet__Group__1__Impl"
    // InternalUmlRtText.g:559:1: rule__RTMessageSet__Group__1__Impl : ( () ) ;
    public final void rule__RTMessageSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlRtText.g:563:1: ( ( () ) )
            // InternalUmlRtText.g:564:1: ( () )
            {
            // InternalUmlRtText.g:564:1: ( () )
            // InternalUmlRtText.g:565:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRTMessageSetAccess().getRTMessageSetAction_1()); 
            }
            // InternalUmlRtText.g:566:2: ()
            // InternalUmlRtText.g:566:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRTMessageSetAccess().getRTMessageSetAction_1()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RTMessageSet__Group__1__Impl"


    // $ANTLR start "rule__RTMessageSet__Group__2"
    // InternalUmlRtText.g:574:1: rule__RTMessageSet__Group__2 : rule__RTMessageSet__Group__2__Impl ;
    public final void rule__RTMessageSet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlRtText.g:578:1: ( rule__RTMessageSet__Group__2__Impl )
            // InternalUmlRtText.g:579:2: rule__RTMessageSet__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RTMessageSet__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RTMessageSet__Group__2"


    // $ANTLR start "rule__RTMessageSet__Group__2__Impl"
    // InternalUmlRtText.g:585:1: rule__RTMessageSet__Group__2__Impl : ( ( rule__RTMessageSet__NameAssignment_2 ) ) ;
    public final void rule__RTMessageSet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlRtText.g:589:1: ( ( ( rule__RTMessageSet__NameAssignment_2 ) ) )
            // InternalUmlRtText.g:590:1: ( ( rule__RTMessageSet__NameAssignment_2 ) )
            {
            // InternalUmlRtText.g:590:1: ( ( rule__RTMessageSet__NameAssignment_2 ) )
            // InternalUmlRtText.g:591:2: ( rule__RTMessageSet__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRTMessageSetAccess().getNameAssignment_2()); 
            }
            // InternalUmlRtText.g:592:2: ( rule__RTMessageSet__NameAssignment_2 )
            // InternalUmlRtText.g:592:3: rule__RTMessageSet__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RTMessageSet__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRTMessageSetAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RTMessageSet__Group__2__Impl"


    // $ANTLR start "rule__ProtocolContainer__UnorderedGroup_1"
    // InternalUmlRtText.g:601:1: rule__ProtocolContainer__UnorderedGroup_1 : rule__ProtocolContainer__UnorderedGroup_1__0 {...}?;
    public final void rule__ProtocolContainer__UnorderedGroup_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getProtocolContainerAccess().getUnorderedGroup_1());
        	
        try {
            // InternalUmlRtText.g:606:1: ( rule__ProtocolContainer__UnorderedGroup_1__0 {...}?)
            // InternalUmlRtText.g:607:2: rule__ProtocolContainer__UnorderedGroup_1__0 {...}?
            {
            pushFollow(FOLLOW_2);
            rule__ProtocolContainer__UnorderedGroup_1__0();

            state._fsp--;
            if (state.failed) return ;
            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getProtocolContainerAccess().getUnorderedGroup_1()) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "rule__ProtocolContainer__UnorderedGroup_1", "getUnorderedGroupHelper().canLeave(grammarAccess.getProtocolContainerAccess().getUnorderedGroup_1())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getProtocolContainerAccess().getUnorderedGroup_1());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtocolContainer__UnorderedGroup_1"


    // $ANTLR start "rule__ProtocolContainer__UnorderedGroup_1__Impl"
    // InternalUmlRtText.g:615:1: rule__ProtocolContainer__UnorderedGroup_1__Impl : ( ({...}? => ( ( ( rule__ProtocolContainer__PackagedElementAssignment_1_0 ) ) ) ) | ({...}? => ( ( ( ( rule__ProtocolContainer__PackagedElementAssignment_1_1 ) ) ( ( ( rule__ProtocolContainer__PackagedElementAssignment_1_1 )=> rule__ProtocolContainer__PackagedElementAssignment_1_1 )* ) ) ) ) ) ;
    public final void rule__ProtocolContainer__UnorderedGroup_1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalUmlRtText.g:620:1: ( ( ({...}? => ( ( ( rule__ProtocolContainer__PackagedElementAssignment_1_0 ) ) ) ) | ({...}? => ( ( ( ( rule__ProtocolContainer__PackagedElementAssignment_1_1 ) ) ( ( ( rule__ProtocolContainer__PackagedElementAssignment_1_1 )=> rule__ProtocolContainer__PackagedElementAssignment_1_1 )* ) ) ) ) ) )
            // InternalUmlRtText.g:621:3: ( ({...}? => ( ( ( rule__ProtocolContainer__PackagedElementAssignment_1_0 ) ) ) ) | ({...}? => ( ( ( ( rule__ProtocolContainer__PackagedElementAssignment_1_1 ) ) ( ( ( rule__ProtocolContainer__PackagedElementAssignment_1_1 )=> rule__ProtocolContainer__PackagedElementAssignment_1_1 )* ) ) ) ) )
            {
            // InternalUmlRtText.g:621:3: ( ({...}? => ( ( ( rule__ProtocolContainer__PackagedElementAssignment_1_0 ) ) ) ) | ({...}? => ( ( ( ( rule__ProtocolContainer__PackagedElementAssignment_1_1 ) ) ( ( ( rule__ProtocolContainer__PackagedElementAssignment_1_1 )=> rule__ProtocolContainer__PackagedElementAssignment_1_1 )* ) ) ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( LA4_0 == 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getProtocolContainerAccess().getUnorderedGroup_1(), 0) ) {
                alt4=1;
            }
            else if ( LA4_0 == 15 && getUnorderedGroupHelper().canSelect(grammarAccess.getProtocolContainerAccess().getUnorderedGroup_1(), 1) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalUmlRtText.g:622:3: ({...}? => ( ( ( rule__ProtocolContainer__PackagedElementAssignment_1_0 ) ) ) )
                    {
                    // InternalUmlRtText.g:622:3: ({...}? => ( ( ( rule__ProtocolContainer__PackagedElementAssignment_1_0 ) ) ) )
                    // InternalUmlRtText.g:623:4: {...}? => ( ( ( rule__ProtocolContainer__PackagedElementAssignment_1_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getProtocolContainerAccess().getUnorderedGroup_1(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__ProtocolContainer__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getProtocolContainerAccess().getUnorderedGroup_1(), 0)");
                    }
                    // InternalUmlRtText.g:623:113: ( ( ( rule__ProtocolContainer__PackagedElementAssignment_1_0 ) ) )
                    // InternalUmlRtText.g:624:5: ( ( rule__ProtocolContainer__PackagedElementAssignment_1_0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getProtocolContainerAccess().getUnorderedGroup_1(), 0);
                    selected = true;
                    // InternalUmlRtText.g:630:5: ( ( rule__ProtocolContainer__PackagedElementAssignment_1_0 ) )
                    // InternalUmlRtText.g:631:6: ( rule__ProtocolContainer__PackagedElementAssignment_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getProtocolContainerAccess().getPackagedElementAssignment_1_0()); 
                    }
                    // InternalUmlRtText.g:632:6: ( rule__ProtocolContainer__PackagedElementAssignment_1_0 )
                    // InternalUmlRtText.g:632:7: rule__ProtocolContainer__PackagedElementAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ProtocolContainer__PackagedElementAssignment_1_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getProtocolContainerAccess().getPackagedElementAssignment_1_0()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalUmlRtText.g:637:3: ({...}? => ( ( ( ( rule__ProtocolContainer__PackagedElementAssignment_1_1 ) ) ( ( ( rule__ProtocolContainer__PackagedElementAssignment_1_1 )=> rule__ProtocolContainer__PackagedElementAssignment_1_1 )* ) ) ) )
                    {
                    // InternalUmlRtText.g:637:3: ({...}? => ( ( ( ( rule__ProtocolContainer__PackagedElementAssignment_1_1 ) ) ( ( ( rule__ProtocolContainer__PackagedElementAssignment_1_1 )=> rule__ProtocolContainer__PackagedElementAssignment_1_1 )* ) ) ) )
                    // InternalUmlRtText.g:638:4: {...}? => ( ( ( ( rule__ProtocolContainer__PackagedElementAssignment_1_1 ) ) ( ( ( rule__ProtocolContainer__PackagedElementAssignment_1_1 )=> rule__ProtocolContainer__PackagedElementAssignment_1_1 )* ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getProtocolContainerAccess().getUnorderedGroup_1(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__ProtocolContainer__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getProtocolContainerAccess().getUnorderedGroup_1(), 1)");
                    }
                    // InternalUmlRtText.g:638:113: ( ( ( ( rule__ProtocolContainer__PackagedElementAssignment_1_1 ) ) ( ( ( rule__ProtocolContainer__PackagedElementAssignment_1_1 )=> rule__ProtocolContainer__PackagedElementAssignment_1_1 )* ) ) )
                    // InternalUmlRtText.g:639:5: ( ( ( rule__ProtocolContainer__PackagedElementAssignment_1_1 ) ) ( ( ( rule__ProtocolContainer__PackagedElementAssignment_1_1 )=> rule__ProtocolContainer__PackagedElementAssignment_1_1 )* ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getProtocolContainerAccess().getUnorderedGroup_1(), 1);
                    selected = true;
                    // InternalUmlRtText.g:645:5: ( ( ( rule__ProtocolContainer__PackagedElementAssignment_1_1 ) ) ( ( ( rule__ProtocolContainer__PackagedElementAssignment_1_1 )=> rule__ProtocolContainer__PackagedElementAssignment_1_1 )* ) )
                    // InternalUmlRtText.g:646:6: ( ( rule__ProtocolContainer__PackagedElementAssignment_1_1 ) ) ( ( ( rule__ProtocolContainer__PackagedElementAssignment_1_1 )=> rule__ProtocolContainer__PackagedElementAssignment_1_1 )* )
                    {
                    // InternalUmlRtText.g:646:6: ( ( rule__ProtocolContainer__PackagedElementAssignment_1_1 ) )
                    // InternalUmlRtText.g:647:7: ( rule__ProtocolContainer__PackagedElementAssignment_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getProtocolContainerAccess().getPackagedElementAssignment_1_1()); 
                    }
                    // InternalUmlRtText.g:648:7: ( rule__ProtocolContainer__PackagedElementAssignment_1_1 )
                    // InternalUmlRtText.g:648:8: rule__ProtocolContainer__PackagedElementAssignment_1_1
                    {
                    pushFollow(FOLLOW_8);
                    rule__ProtocolContainer__PackagedElementAssignment_1_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getProtocolContainerAccess().getPackagedElementAssignment_1_1()); 
                    }

                    }

                    // InternalUmlRtText.g:651:6: ( ( ( rule__ProtocolContainer__PackagedElementAssignment_1_1 )=> rule__ProtocolContainer__PackagedElementAssignment_1_1 )* )
                    // InternalUmlRtText.g:652:7: ( ( rule__ProtocolContainer__PackagedElementAssignment_1_1 )=> rule__ProtocolContainer__PackagedElementAssignment_1_1 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getProtocolContainerAccess().getPackagedElementAssignment_1_1()); 
                    }
                    // InternalUmlRtText.g:653:7: ( ( rule__ProtocolContainer__PackagedElementAssignment_1_1 )=> rule__ProtocolContainer__PackagedElementAssignment_1_1 )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==15) ) {
                            int LA3_2 = input.LA(2);

                            if ( (LA3_2==RULE_ID) ) {
                                int LA3_3 = input.LA(3);

                                if ( (synpred1_InternalUmlRtText()) ) {
                                    alt3=1;
                                }


                            }


                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalUmlRtText.g:653:8: ( rule__ProtocolContainer__PackagedElementAssignment_1_1 )=> rule__ProtocolContainer__PackagedElementAssignment_1_1
                    	    {
                    	    pushFollow(FOLLOW_8);
                    	    rule__ProtocolContainer__PackagedElementAssignment_1_1();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getProtocolContainerAccess().getPackagedElementAssignment_1_1()); 
                    }

                    }


                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getProtocolContainerAccess().getUnorderedGroup_1());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtocolContainer__UnorderedGroup_1__Impl"


    // $ANTLR start "rule__ProtocolContainer__UnorderedGroup_1__0"
    // InternalUmlRtText.g:667:1: rule__ProtocolContainer__UnorderedGroup_1__0 : rule__ProtocolContainer__UnorderedGroup_1__Impl ( rule__ProtocolContainer__UnorderedGroup_1__1 )? ;
    public final void rule__ProtocolContainer__UnorderedGroup_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlRtText.g:671:1: ( rule__ProtocolContainer__UnorderedGroup_1__Impl ( rule__ProtocolContainer__UnorderedGroup_1__1 )? )
            // InternalUmlRtText.g:672:2: rule__ProtocolContainer__UnorderedGroup_1__Impl ( rule__ProtocolContainer__UnorderedGroup_1__1 )?
            {
            pushFollow(FOLLOW_8);
            rule__ProtocolContainer__UnorderedGroup_1__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalUmlRtText.g:673:2: ( rule__ProtocolContainer__UnorderedGroup_1__1 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==RULE_ID) ) {
                    int LA5_4 = input.LA(3);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getProtocolContainerAccess().getUnorderedGroup_1(), 0) ) {
                        alt5=1;
                    }
                }
            }
            else if ( (LA5_0==15) ) {
                int LA5_2 = input.LA(2);

                if ( (LA5_2==RULE_ID) ) {
                    int LA5_5 = input.LA(3);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getProtocolContainerAccess().getUnorderedGroup_1(), 1) ) {
                        alt5=1;
                    }
                }
            }
            switch (alt5) {
                case 1 :
                    // InternalUmlRtText.g:673:2: rule__ProtocolContainer__UnorderedGroup_1__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ProtocolContainer__UnorderedGroup_1__1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtocolContainer__UnorderedGroup_1__0"


    // $ANTLR start "rule__ProtocolContainer__UnorderedGroup_1__1"
    // InternalUmlRtText.g:679:1: rule__ProtocolContainer__UnorderedGroup_1__1 : rule__ProtocolContainer__UnorderedGroup_1__Impl ;
    public final void rule__ProtocolContainer__UnorderedGroup_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlRtText.g:683:1: ( rule__ProtocolContainer__UnorderedGroup_1__Impl )
            // InternalUmlRtText.g:684:2: rule__ProtocolContainer__UnorderedGroup_1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProtocolContainer__UnorderedGroup_1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtocolContainer__UnorderedGroup_1__1"


    // $ANTLR start "rule__Model__NameAssignment_2"
    // InternalUmlRtText.g:691:1: rule__Model__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Model__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlRtText.g:695:1: ( ( RULE_ID ) )
            // InternalUmlRtText.g:696:2: ( RULE_ID )
            {
            // InternalUmlRtText.g:696:2: ( RULE_ID )
            // InternalUmlRtText.g:697:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__NameAssignment_2"


    // $ANTLR start "rule__Model__PackagedElementAssignment_4"
    // InternalUmlRtText.g:706:1: rule__Model__PackagedElementAssignment_4 : ( rulePackageableElement ) ;
    public final void rule__Model__PackagedElementAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlRtText.g:710:1: ( ( rulePackageableElement ) )
            // InternalUmlRtText.g:711:2: ( rulePackageableElement )
            {
            // InternalUmlRtText.g:711:2: ( rulePackageableElement )
            // InternalUmlRtText.g:712:3: rulePackageableElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getPackagedElementPackageableElementParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePackageableElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getPackagedElementPackageableElementParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__PackagedElementAssignment_4"


    // $ANTLR start "rule__ProtocolContainer__PackagedElementAssignment_1_0"
    // InternalUmlRtText.g:721:1: rule__ProtocolContainer__PackagedElementAssignment_1_0 : ( ruleProtocol ) ;
    public final void rule__ProtocolContainer__PackagedElementAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlRtText.g:725:1: ( ( ruleProtocol ) )
            // InternalUmlRtText.g:726:2: ( ruleProtocol )
            {
            // InternalUmlRtText.g:726:2: ( ruleProtocol )
            // InternalUmlRtText.g:727:3: ruleProtocol
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProtocolContainerAccess().getPackagedElementProtocolParserRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleProtocol();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProtocolContainerAccess().getPackagedElementProtocolParserRuleCall_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtocolContainer__PackagedElementAssignment_1_0"


    // $ANTLR start "rule__ProtocolContainer__PackagedElementAssignment_1_1"
    // InternalUmlRtText.g:736:1: rule__ProtocolContainer__PackagedElementAssignment_1_1 : ( ruleRTMessageSet ) ;
    public final void rule__ProtocolContainer__PackagedElementAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlRtText.g:740:1: ( ( ruleRTMessageSet ) )
            // InternalUmlRtText.g:741:2: ( ruleRTMessageSet )
            {
            // InternalUmlRtText.g:741:2: ( ruleRTMessageSet )
            // InternalUmlRtText.g:742:3: ruleRTMessageSet
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProtocolContainerAccess().getPackagedElementRTMessageSetParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleRTMessageSet();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProtocolContainerAccess().getPackagedElementRTMessageSetParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProtocolContainer__PackagedElementAssignment_1_1"


    // $ANTLR start "rule__Protocol__NameAssignment_2"
    // InternalUmlRtText.g:751:1: rule__Protocol__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Protocol__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlRtText.g:755:1: ( ( RULE_ID ) )
            // InternalUmlRtText.g:756:2: ( RULE_ID )
            {
            // InternalUmlRtText.g:756:2: ( RULE_ID )
            // InternalUmlRtText.g:757:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getProtocolAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getProtocolAccess().getNameIDTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__NameAssignment_2"


    // $ANTLR start "rule__RTMessageSet__NameAssignment_2"
    // InternalUmlRtText.g:766:1: rule__RTMessageSet__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__RTMessageSet__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlRtText.g:770:1: ( ( RULE_ID ) )
            // InternalUmlRtText.g:771:2: ( RULE_ID )
            {
            // InternalUmlRtText.g:771:2: ( RULE_ID )
            // InternalUmlRtText.g:772:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRTMessageSetAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRTMessageSetAccess().getNameIDTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RTMessageSet__NameAssignment_2"

    // $ANTLR start synpred1_InternalUmlRtText
    public final void synpred1_InternalUmlRtText_fragment() throws RecognitionException {   
        // InternalUmlRtText.g:653:8: ( rule__ProtocolContainer__PackagedElementAssignment_1_1 )
        // InternalUmlRtText.g:653:9: rule__ProtocolContainer__PackagedElementAssignment_1_1
        {
        pushFollow(FOLLOW_2);
        rule__ProtocolContainer__PackagedElementAssignment_1_1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalUmlRtText

    // Delegated rules

    public final boolean synpred1_InternalUmlRtText() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalUmlRtText_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000E800L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C802L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000000C002L});

}

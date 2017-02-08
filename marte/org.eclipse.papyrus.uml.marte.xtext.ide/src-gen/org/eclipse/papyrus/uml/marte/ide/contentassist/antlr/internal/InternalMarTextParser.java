package org.eclipse.papyrus.uml.marte.ide.contentassist.antlr.internal;

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
import org.eclipse.papyrus.uml.marte.services.MarTextGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMarTextParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'model'", "'{'", "'};'", "'component'", "'processor'", "'cores:'", "'caches:'", "'cache'", "'level:'"
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

    	public void setGrammarAccess(MarTextGrammarAccess grammarAccess) {
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
    // InternalMarText.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalMarText.g:54:1: ( ruleModel EOF )
            // InternalMarText.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMarText.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarText.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalMarText.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalMarText.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalMarText.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalMarText.g:69:3: ( rule__Model__Group__0 )
            // InternalMarText.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

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


    // $ANTLR start "entryRuleComponent"
    // InternalMarText.g:78:1: entryRuleComponent : ruleComponent EOF ;
    public final void entryRuleComponent() throws RecognitionException {
        try {
            // InternalMarText.g:79:1: ( ruleComponent EOF )
            // InternalMarText.g:80:1: ruleComponent EOF
            {
             before(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_1);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getComponentRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalMarText.g:87:1: ruleComponent : ( ( rule__Component__Alternatives ) ) ;
    public final void ruleComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarText.g:91:2: ( ( ( rule__Component__Alternatives ) ) )
            // InternalMarText.g:92:2: ( ( rule__Component__Alternatives ) )
            {
            // InternalMarText.g:92:2: ( ( rule__Component__Alternatives ) )
            // InternalMarText.g:93:3: ( rule__Component__Alternatives )
            {
             before(grammarAccess.getComponentAccess().getAlternatives()); 
            // InternalMarText.g:94:3: ( rule__Component__Alternatives )
            // InternalMarText.g:94:4: rule__Component__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Component__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getAlternatives()); 

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
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleHwProcessor"
    // InternalMarText.g:103:1: entryRuleHwProcessor : ruleHwProcessor EOF ;
    public final void entryRuleHwProcessor() throws RecognitionException {
        try {
            // InternalMarText.g:104:1: ( ruleHwProcessor EOF )
            // InternalMarText.g:105:1: ruleHwProcessor EOF
            {
             before(grammarAccess.getHwProcessorRule()); 
            pushFollow(FOLLOW_1);
            ruleHwProcessor();

            state._fsp--;

             after(grammarAccess.getHwProcessorRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleHwProcessor"


    // $ANTLR start "ruleHwProcessor"
    // InternalMarText.g:112:1: ruleHwProcessor : ( ( rule__HwProcessor__Group__0 ) ) ;
    public final void ruleHwProcessor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarText.g:116:2: ( ( ( rule__HwProcessor__Group__0 ) ) )
            // InternalMarText.g:117:2: ( ( rule__HwProcessor__Group__0 ) )
            {
            // InternalMarText.g:117:2: ( ( rule__HwProcessor__Group__0 ) )
            // InternalMarText.g:118:3: ( rule__HwProcessor__Group__0 )
            {
             before(grammarAccess.getHwProcessorAccess().getGroup()); 
            // InternalMarText.g:119:3: ( rule__HwProcessor__Group__0 )
            // InternalMarText.g:119:4: rule__HwProcessor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__HwProcessor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHwProcessorAccess().getGroup()); 

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
    // $ANTLR end "ruleHwProcessor"


    // $ANTLR start "entryRuleHwCache"
    // InternalMarText.g:128:1: entryRuleHwCache : ruleHwCache EOF ;
    public final void entryRuleHwCache() throws RecognitionException {
        try {
            // InternalMarText.g:129:1: ( ruleHwCache EOF )
            // InternalMarText.g:130:1: ruleHwCache EOF
            {
             before(grammarAccess.getHwCacheRule()); 
            pushFollow(FOLLOW_1);
            ruleHwCache();

            state._fsp--;

             after(grammarAccess.getHwCacheRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleHwCache"


    // $ANTLR start "ruleHwCache"
    // InternalMarText.g:137:1: ruleHwCache : ( ( rule__HwCache__Group__0 ) ) ;
    public final void ruleHwCache() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarText.g:141:2: ( ( ( rule__HwCache__Group__0 ) ) )
            // InternalMarText.g:142:2: ( ( rule__HwCache__Group__0 ) )
            {
            // InternalMarText.g:142:2: ( ( rule__HwCache__Group__0 ) )
            // InternalMarText.g:143:3: ( rule__HwCache__Group__0 )
            {
             before(grammarAccess.getHwCacheAccess().getGroup()); 
            // InternalMarText.g:144:3: ( rule__HwCache__Group__0 )
            // InternalMarText.g:144:4: rule__HwCache__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__HwCache__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHwCacheAccess().getGroup()); 

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
    // $ANTLR end "ruleHwCache"


    // $ANTLR start "rule__Model__Alternatives_3"
    // InternalMarText.g:152:1: rule__Model__Alternatives_3 : ( ( ( rule__Model__Group_3_0__0 ) ) | ( ';' ) );
    public final void rule__Model__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarText.g:156:1: ( ( ( rule__Model__Group_3_0__0 ) ) | ( ';' ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            else if ( (LA1_0==11) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMarText.g:157:2: ( ( rule__Model__Group_3_0__0 ) )
                    {
                    // InternalMarText.g:157:2: ( ( rule__Model__Group_3_0__0 ) )
                    // InternalMarText.g:158:3: ( rule__Model__Group_3_0__0 )
                    {
                     before(grammarAccess.getModelAccess().getGroup_3_0()); 
                    // InternalMarText.g:159:3: ( rule__Model__Group_3_0__0 )
                    // InternalMarText.g:159:4: rule__Model__Group_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getGroup_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMarText.g:163:2: ( ';' )
                    {
                    // InternalMarText.g:163:2: ( ';' )
                    // InternalMarText.g:164:3: ';'
                    {
                     before(grammarAccess.getModelAccess().getSemicolonKeyword_3_1()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getModelAccess().getSemicolonKeyword_3_1()); 

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
    // $ANTLR end "rule__Model__Alternatives_3"


    // $ANTLR start "rule__Component__Alternatives"
    // InternalMarText.g:173:1: rule__Component__Alternatives : ( ( ruleHwCache ) | ( ruleHwProcessor ) | ( ( rule__Component__Group_2__0 ) ) );
    public final void rule__Component__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarText.g:177:1: ( ( ruleHwCache ) | ( ruleHwProcessor ) | ( ( rule__Component__Group_2__0 ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt2=1;
                }
                break;
            case 16:
                {
                alt2=2;
                }
                break;
            case 15:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMarText.g:178:2: ( ruleHwCache )
                    {
                    // InternalMarText.g:178:2: ( ruleHwCache )
                    // InternalMarText.g:179:3: ruleHwCache
                    {
                     before(grammarAccess.getComponentAccess().getHwCacheParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleHwCache();

                    state._fsp--;

                     after(grammarAccess.getComponentAccess().getHwCacheParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMarText.g:184:2: ( ruleHwProcessor )
                    {
                    // InternalMarText.g:184:2: ( ruleHwProcessor )
                    // InternalMarText.g:185:3: ruleHwProcessor
                    {
                     before(grammarAccess.getComponentAccess().getHwProcessorParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleHwProcessor();

                    state._fsp--;

                     after(grammarAccess.getComponentAccess().getHwProcessorParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMarText.g:190:2: ( ( rule__Component__Group_2__0 ) )
                    {
                    // InternalMarText.g:190:2: ( ( rule__Component__Group_2__0 ) )
                    // InternalMarText.g:191:3: ( rule__Component__Group_2__0 )
                    {
                     before(grammarAccess.getComponentAccess().getGroup_2()); 
                    // InternalMarText.g:192:3: ( rule__Component__Group_2__0 )
                    // InternalMarText.g:192:4: rule__Component__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Component__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComponentAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Component__Alternatives"


    // $ANTLR start "rule__Component__Alternatives_2_3"
    // InternalMarText.g:200:1: rule__Component__Alternatives_2_3 : ( ( ( rule__Component__Group_2_3_0__0 ) ) | ( ';' ) );
    public final void rule__Component__Alternatives_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarText.g:204:1: ( ( ( rule__Component__Group_2_3_0__0 ) ) | ( ';' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            else if ( (LA3_0==11) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMarText.g:205:2: ( ( rule__Component__Group_2_3_0__0 ) )
                    {
                    // InternalMarText.g:205:2: ( ( rule__Component__Group_2_3_0__0 ) )
                    // InternalMarText.g:206:3: ( rule__Component__Group_2_3_0__0 )
                    {
                     before(grammarAccess.getComponentAccess().getGroup_2_3_0()); 
                    // InternalMarText.g:207:3: ( rule__Component__Group_2_3_0__0 )
                    // InternalMarText.g:207:4: rule__Component__Group_2_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Component__Group_2_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComponentAccess().getGroup_2_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMarText.g:211:2: ( ';' )
                    {
                    // InternalMarText.g:211:2: ( ';' )
                    // InternalMarText.g:212:3: ';'
                    {
                     before(grammarAccess.getComponentAccess().getSemicolonKeyword_2_3_1()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getComponentAccess().getSemicolonKeyword_2_3_1()); 

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
    // $ANTLR end "rule__Component__Alternatives_2_3"


    // $ANTLR start "rule__HwProcessor__Alternatives_3"
    // InternalMarText.g:221:1: rule__HwProcessor__Alternatives_3 : ( ( ( rule__HwProcessor__UnorderedGroup_3_0 ) ) | ( ';' ) );
    public final void rule__HwProcessor__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarText.g:225:1: ( ( ( rule__HwProcessor__UnorderedGroup_3_0 ) ) | ( ';' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=13 && LA4_0<=14)||LA4_0==18) ) {
                alt4=1;
            }
            else if ( (LA4_0==11) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMarText.g:226:2: ( ( rule__HwProcessor__UnorderedGroup_3_0 ) )
                    {
                    // InternalMarText.g:226:2: ( ( rule__HwProcessor__UnorderedGroup_3_0 ) )
                    // InternalMarText.g:227:3: ( rule__HwProcessor__UnorderedGroup_3_0 )
                    {
                     before(grammarAccess.getHwProcessorAccess().getUnorderedGroup_3_0()); 
                    // InternalMarText.g:228:3: ( rule__HwProcessor__UnorderedGroup_3_0 )
                    // InternalMarText.g:228:4: rule__HwProcessor__UnorderedGroup_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__HwProcessor__UnorderedGroup_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getHwProcessorAccess().getUnorderedGroup_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMarText.g:232:2: ( ';' )
                    {
                    // InternalMarText.g:232:2: ( ';' )
                    // InternalMarText.g:233:3: ';'
                    {
                     before(grammarAccess.getHwProcessorAccess().getSemicolonKeyword_3_1()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getHwProcessorAccess().getSemicolonKeyword_3_1()); 

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
    // $ANTLR end "rule__HwProcessor__Alternatives_3"


    // $ANTLR start "rule__HwCache__Alternatives_3"
    // InternalMarText.g:242:1: rule__HwCache__Alternatives_3 : ( ( ( rule__HwCache__Group_3_0__0 ) ) | ( ';' ) );
    public final void rule__HwCache__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarText.g:246:1: ( ( ( rule__HwCache__Group_3_0__0 ) ) | ( ';' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            else if ( (LA5_0==11) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMarText.g:247:2: ( ( rule__HwCache__Group_3_0__0 ) )
                    {
                    // InternalMarText.g:247:2: ( ( rule__HwCache__Group_3_0__0 ) )
                    // InternalMarText.g:248:3: ( rule__HwCache__Group_3_0__0 )
                    {
                     before(grammarAccess.getHwCacheAccess().getGroup_3_0()); 
                    // InternalMarText.g:249:3: ( rule__HwCache__Group_3_0__0 )
                    // InternalMarText.g:249:4: rule__HwCache__Group_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__HwCache__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getHwCacheAccess().getGroup_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMarText.g:253:2: ( ';' )
                    {
                    // InternalMarText.g:253:2: ( ';' )
                    // InternalMarText.g:254:3: ';'
                    {
                     before(grammarAccess.getHwCacheAccess().getSemicolonKeyword_3_1()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getHwCacheAccess().getSemicolonKeyword_3_1()); 

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
    // $ANTLR end "rule__HwCache__Alternatives_3"


    // $ANTLR start "rule__Model__Group__0"
    // InternalMarText.g:263:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarText.g:267:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalMarText.g:268:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;


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
    // InternalMarText.g:275:1: rule__Model__Group__0__Impl : ( 'model' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarText.g:279:1: ( ( 'model' ) )
            // InternalMarText.g:280:1: ( 'model' )
            {
            // InternalMarText.g:280:1: ( 'model' )
            // InternalMarText.g:281:2: 'model'
            {
             before(grammarAccess.getModelAccess().getModelKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getModelKeyword_0()); 

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
    // InternalMarText.g:290:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarText.g:294:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalMarText.g:295:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

            state._fsp--;


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
    // InternalMarText.g:302:1: rule__Model__Group__1__Impl : ( () ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarText.g:306:1: ( ( () ) )
            // InternalMarText.g:307:1: ( () )
            {
            // InternalMarText.g:307:1: ( () )
            // InternalMarText.g:308:2: ()
            {
             before(grammarAccess.getModelAccess().getModelAction_1()); 
            // InternalMarText.g:309:2: ()
            // InternalMarText.g:309:3: 
            {
            }

             after(grammarAccess.getModelAccess().getModelAction_1()); 

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
    // InternalMarText.g:317:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarText.g:321:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalMarText.g:322:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__3();

            state._fsp--;


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
    // InternalMarText.g:329:1: rule__Model__Group__2__Impl : ( ( rule__Model__NameAssignment_2 ) ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarText.g:333:1: ( ( ( rule__Model__NameAssignment_2 ) ) )
            // InternalMarText.g:334:1: ( ( rule__Model__NameAssignment_2 ) )
            {
            // InternalMarText.g:334:1: ( ( rule__Model__NameAssignment_2 ) )
            // InternalMarText.g:335:2: ( rule__Model__NameAssignment_2 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_2()); 
            // InternalMarText.g:336:2: ( rule__Model__NameAssignment_2 )
            // InternalMarText.g:336:3: rule__Model__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Model__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getNameAssignment_2()); 

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
    // InternalMarText.g:344:1: rule__Model__Group__3 : rule__Model__Group__3__Impl ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarText.g:348:1: ( rule__Model__Group__3__Impl )
            // InternalMarText.g:349:2: rule__Model__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__3__Impl();

            state._fsp--;


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
    // InternalMarText.g:355:1: rule__Model__Group__3__Impl : ( ( rule__Model__Alternatives_3 ) ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarText.g:359:1: ( ( ( rule__Model__Alternatives_3 ) ) )
            // InternalMarText.g:360:1: ( ( rule__Model__Alternatives_3 ) )
            {
            // InternalMarText.g:360:1: ( ( rule__Model__Alternatives_3 ) )
            // InternalMarText.g:361:2: ( rule__Model__Alternatives_3 )
            {
             before(grammarAccess.getModelAccess().getAlternatives_3()); 
            // InternalMarText.g:362:2: ( rule__Model__Alternatives_3 )
            // InternalMarText.g:362:3: rule__Model__Alternatives_3
            {
            pushFollow(FOLLOW_2);
            rule__Model__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getAlternatives_3()); 

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


    // $ANTLR start "rule__Model__Group_3_0__0"
    // InternalMarText.g:371:1: rule__Model__Group_3_0__0 : rule__Model__Group_3_0__0__Impl rule__Model__Group_3_0__1 ;
    public final void rule__Model__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarText.g:375:1: ( rule__Model__Group_3_0__0__Impl rule__Model__Group_3_0__1 )
            // InternalMarText.g:376:2: rule__Model__Group_3_0__0__Impl rule__Model__Group_3_0__1
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_3_0__1();

            state._fsp--;


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
    // $ANTLR end "rule__Model__Group_3_0__0"


    // $ANTLR start "rule__Model__Group_3_0__0__Impl"
    // InternalMarText.g:383:1: rule__Model__Group_3_0__0__Impl : ( '{' ) ;
    public final void rule__Model__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarText.g:387:1: ( ( '{' ) )
            // InternalMarText.g:388:1: ( '{' )
            {
            // InternalMarText.g:388:1: ( '{' )
            // InternalMarText.g:389:2: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_3_0_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_3_0_0()); 

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
    // $ANTLR end "rule__Model__Group_3_0__0__Impl"


    // $ANTLR start "rule__Model__Group_3_0__1"
    // InternalMarText.g:398:1: rule__Model__Group_3_0__1 : rule__Model__Group_3_0__1__Impl rule__Model__Group_3_0__2 ;
    public final void rule__Model__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarText.g:402:1: ( rule__Model__Group_3_0__1__Impl rule__Model__Group_3_0__2 )
            // InternalMarText.g:403:2: rule__Model__Group_3_0__1__Impl rule__Model__Group_3_0__2
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group_3_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_3_0__2();

            state._fsp--;


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
    // $ANTLR end "rule__Model__Group_3_0__1"


    // $ANTLR start "rule__Model__Group_3_0__1__Impl"
    // InternalMarText.g:410:1: rule__Model__Group_3_0__1__Impl : ( ( rule__Model__PackagedElementAssignment_3_0_1 )* ) ;
    public final void rule__Model__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarText.g:414:1: ( ( ( rule__Model__PackagedElementAssignment_3_0_1 )* ) )
            // InternalMarText.g:415:1: ( ( rule__Model__PackagedElementAssignment_3_0_1 )* )
            {
            // InternalMarText.g:415:1: ( ( rule__Model__PackagedElementAssignment_3_0_1 )* )
            // InternalMarText.g:416:2: ( rule__Model__PackagedElementAssignment_3_0_1 )*
            {
             before(grammarAccess.getModelAccess().getPackagedElementAssignment_3_0_1()); 
            // InternalMarText.g:417:2: ( rule__Model__PackagedElementAssignment_3_0_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=15 && LA6_0<=16)||LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMarText.g:417:3: rule__Model__PackagedElementAssignment_3_0_1
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Model__PackagedElementAssignment_3_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getPackagedElementAssignment_3_0_1()); 

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
    // $ANTLR end "rule__Model__Group_3_0__1__Impl"


    // $ANTLR start "rule__Model__Group_3_0__2"
    // InternalMarText.g:425:1: rule__Model__Group_3_0__2 : rule__Model__Group_3_0__2__Impl ;
    public final void rule__Model__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarText.g:429:1: ( rule__Model__Group_3_0__2__Impl )
            // InternalMarText.g:430:2: rule__Model__Group_3_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group_3_0__2__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Model__Group_3_0__2"


    // $ANTLR start "rule__Model__Group_3_0__2__Impl"
    // InternalMarText.g:436:1: rule__Model__Group_3_0__2__Impl : ( '};' ) ;
    public final void rule__Model__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarText.g:440:1: ( ( '};' ) )
            // InternalMarText.g:441:1: ( '};' )
            {
            // InternalMarText.g:441:1: ( '};' )
            // InternalMarText.g:442:2: '};'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketSemicolonKeyword_3_0_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getRightCurlyBracketSemicolonKeyword_3_0_2()); 

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
    // $ANTLR end "rule__Model__Group_3_0__2__Impl"


    // $ANTLR start "rule__Component__Group_2__0"
    // InternalMarText.g:452:1: rule__Component__Group_2__0 : rule__Component__Group_2__0__Impl rule__Component__Group_2__1 ;
    public final void rule__Component__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarText.g:456:1: ( rule__Component__Group_2__0__Impl rule__Component__Group_2__1 )
            // InternalMarText.g:457:2: rule__Component__Group_2__0__Impl rule__Component__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Component__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_2__1();

            state._fsp--;


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
    // $ANTLR end "rule__Component__Group_2__0"


    // $ANTLR start "rule__Component__Group_2__0__Impl"
    // InternalMarText.g:464:1: rule__Component__Group_2__0__Impl : ( 'component' ) ;
    public final void rule__Component__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarText.g:468:1: ( ( 'component' ) )
            // InternalMarText.g:469:1: ( 'component' )
            {
            // InternalMarText.g:469:1: ( 'component' )
            // InternalMarText.g:470:2: 'component'
            {
             before(grammarAccess.getComponentAccess().getComponentKeyword_2_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getComponentKeyword_2_0()); 

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
    // $ANTLR end "rule__Component__Group_2__0__Impl"


    // $ANTLR start "rule__Component__Group_2__1"
    // InternalMarText.g:479:1: rule__Component__Group_2__1 : rule__Component__Group_2__1__Impl rule__Component__Group_2__2 ;
    public final void rule__Component__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarText.g:483:1: ( rule__Component__Group_2__1__Impl rule__Component__Group_2__2 )
            // InternalMarText.g:484:2: rule__Component__Group_2__1__Impl rule__Component__Group_2__2
            {
            pushFollow(FOLLOW_3);
            rule__Component__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_2__2();

            state._fsp--;


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
    // $ANTLR end "rule__Component__Group_2__1"


    // $ANTLR start "rule__Component__Group_2__1__Impl"
    // InternalMarText.g:491:1: rule__Component__Group_2__1__Impl : ( () ) ;
    public final void rule__Component__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarText.g:495:1: ( ( () ) )
            // InternalMarText.g:496:1: ( () )
            {
            // InternalMarText.g:496:1: ( () )
            // InternalMarText.g:497:2: ()
            {
             before(grammarAccess.getComponentAccess().getComponentAction_2_1()); 
            // InternalMarText.g:498:2: ()
            // InternalMarText.g:498:3: 
            {
            }

             after(grammarAccess.getComponentAccess().getComponentAction_2_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_2__1__Impl"


    // $ANTLR start "rule__Component__Group_2__2"
    // InternalMarText.g:506:1: rule__Component__Group_2__2 : rule__Component__Group_2__2__Impl rule__Component__Group_2__3 ;
    public final void rule__Component__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarText.g:510:1: ( rule__Component__Group_2__2__Impl rule__Component__Group_2__3 )
            // InternalMarText.g:511:2: rule__Component__Group_2__2__Impl rule__Component__Group_2__3
            {
            pushFollow(FOLLOW_4);
            rule__Component__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_2__3();

            state._fsp--;


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
    // $ANTLR end "rule__Component__Group_2__2"


    // $ANTLR start "rule__Component__Group_2__2__Impl"
    // InternalMarText.g:518:1: rule__Component__Group_2__2__Impl : ( ( rule__Component__NameAssignment_2_2 ) ) ;
    public final void rule__Component__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarText.g:522:1: ( ( ( rule__Component__NameAssignment_2_2 ) ) )
            // InternalMarText.g:523:1: ( ( rule__Component__NameAssignment_2_2 ) )
            {
            // InternalMarText.g:523:1: ( ( rule__Component__NameAssignment_2_2 ) )
            // InternalMarText.g:524:2: ( rule__Component__NameAssignment_2_2 )
            {
             before(grammarAccess.getComponentAccess().getNameAssignment_2_2()); 
            // InternalMarText.g:525:2: ( rule__Component__NameAssignment_2_2 )
            // InternalMarText.g:525:3: rule__Component__NameAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Component__NameAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getNameAssignment_2_2()); 

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
    // $ANTLR end "rule__Component__Group_2__2__Impl"


    // $ANTLR start "rule__Component__Group_2__3"
    // InternalMarText.g:533:1: rule__Component__Group_2__3 : rule__Component__Group_2__3__Impl ;
    public final void rule__Component__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarText.g:537:1: ( rule__Component__Group_2__3__Impl )
            // InternalMarText.g:538:2: rule__Component__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group_2__3__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Component__Group_2__3"


    // $ANTLR start "rule__Component__Group_2__3__Impl"
    // InternalMarText.g:544:1: rule__Component__Group_2__3__Impl : ( ( rule__Component__Alternatives_2_3 ) ) ;
    public final void rule__Component__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarText.g:548:1: ( ( ( rule__Component__Alternatives_2_3 ) ) )
            // InternalMarText.g:549:1: ( ( rule__Component__Alternatives_2_3 ) )
            {
            // InternalMarText.g:549:1: ( ( rule__Component__Alternatives_2_3 ) )
            // InternalMarText.g:550:2: ( rule__Component__Alternatives_2_3 )
            {
             before(grammarAccess.getComponentAccess().getAlternatives_2_3()); 
            // InternalMarText.g:551:2: ( rule__Component__Alternatives_2_3 )
            // InternalMarText.g:551:3: rule__Component__Alternatives_2_3
            {
            pushFollow(FOLLOW_2);
            rule__Component__Alternatives_2_3();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getAlternatives_2_3()); 

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
    // $ANTLR end "rule__Component__Group_2__3__Impl"


    // $ANTLR start "rule__Component__Group_2_3_0__0"
    // InternalMarText.g:560:1: rule__Component__Group_2_3_0__0 : rule__Component__Group_2_3_0__0__Impl rule__Component__Group_2_3_0__1 ;
    public final void rule__Component__Group_2_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarText.g:564:1: ( rule__Component__Group_2_3_0__0__Impl rule__Component__Group_2_3_0__1 )
            // InternalMarText.g:565:2: rule__Component__Group_2_3_0__0__Impl rule__Component__Group_2_3_0__1
            {
            pushFollow(FOLLOW_5);
            rule__Component__Group_2_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_2_3_0__1();

            state._fsp--;


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
    // $ANTLR end "rule__Component__Group_2_3_0__0"


    // $ANTLR start "rule__Component__Group_2_3_0__0__Impl"
    // InternalMarText.g:572:1: rule__Component__Group_2_3_0__0__Impl : ( '{' ) ;
    public final void rule__Component__Group_2_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarText.g:576:1: ( ( '{' ) )
            // InternalMarText.g:577:1: ( '{' )
            {
            // InternalMarText.g:577:1: ( '{' )
            // InternalMarText.g:578:2: '{'
            {
             before(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_2_3_0_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_2_3_0_0()); 

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
    // $ANTLR end "rule__Component__Group_2_3_0__0__Impl"


    // $ANTLR start "rule__Component__Group_2_3_0__1"
    // InternalMarText.g:587:1: rule__Component__Group_2_3_0__1 : rule__Component__Group_2_3_0__1__Impl rule__Component__Group_2_3_0__2 ;
    public final void rule__Component__Group_2_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarText.g:591:1: ( rule__Component__Group_2_3_0__1__Impl rule__Component__Group_2_3_0__2 )
            // InternalMarText.g:592:2: rule__Component__Group_2_3_0__1__Impl rule__Component__Group_2_3_0__2
            {
            pushFollow(FOLLOW_5);
            rule__Component__Group_2_3_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_2_3_0__2();

            state._fsp--;


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
    // $ANTLR end "rule__Component__Group_2_3_0__1"


    // $ANTLR start "rule__Component__Group_2_3_0__1__Impl"
    // InternalMarText.g:599:1: rule__Component__Group_2_3_0__1__Impl : ( ( rule__Component__PackagedElementAssignment_2_3_0_1 )* ) ;
    public final void rule__Component__Group_2_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarText.g:603:1: ( ( ( rule__Component__PackagedElementAssignment_2_3_0_1 )* ) )
            // InternalMarText.g:604:1: ( ( rule__Component__PackagedElementAssignment_2_3_0_1 )* )
            {
            // InternalMarText.g:604:1: ( ( rule__Component__PackagedElementAssignment_2_3_0_1 )* )
            // InternalMarText.g:605:2: ( rule__Component__PackagedElementAssignment_2_3_0_1 )*
            {
             before(grammarAccess.getComponentAccess().getPackagedElementAssignment_2_3_0_1()); 
            // InternalMarText.g:606:2: ( rule__Component__PackagedElementAssignment_2_3_0_1 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=15 && LA7_0<=16)||LA7_0==19) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMarText.g:606:3: rule__Component__PackagedElementAssignment_2_3_0_1
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Component__PackagedElementAssignment_2_3_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getComponentAccess().getPackagedElementAssignment_2_3_0_1()); 

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
    // $ANTLR end "rule__Component__Group_2_3_0__1__Impl"


    // $ANTLR start "rule__Component__Group_2_3_0__2"
    // InternalMarText.g:614:1: rule__Component__Group_2_3_0__2 : rule__Component__Group_2_3_0__2__Impl ;
    public final void rule__Component__Group_2_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarText.g:618:1: ( rule__Component__Group_2_3_0__2__Impl )
            // InternalMarText.g:619:2: rule__Component__Group_2_3_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group_2_3_0__2__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Component__Group_2_3_0__2"


    // $ANTLR start "rule__Component__Group_2_3_0__2__Impl"
    // InternalMarText.g:625:1: rule__Component__Group_2_3_0__2__Impl : ( '};' ) ;
    public final void rule__Component__Group_2_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarText.g:629:1: ( ( '};' ) )
            // InternalMarText.g:630:1: ( '};' )
            {
            // InternalMarText.g:630:1: ( '};' )
            // InternalMarText.g:631:2: '};'
            {
             before(grammarAccess.getComponentAccess().getRightCurlyBracketSemicolonKeyword_2_3_0_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getRightCurlyBracketSemicolonKeyword_2_3_0_2()); 

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
    // $ANTLR end "rule__Component__Group_2_3_0__2__Impl"


    // $ANTLR start "rule__HwProcessor__Group__0"
    // InternalMarText.g:641:1: rule__HwProcessor__Group__0 : rule__HwProcessor__Group__0__Impl rule__HwProcessor__Group__1 ;
    public final void rule__HwProcessor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarText.g:645:1: ( rule__HwProcessor__Group__0__Impl rule__HwProcessor__Group__1 )
            // InternalMarText.g:646:2: rule__HwProcessor__Group__0__Impl rule__HwProcessor__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__HwProcessor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HwProcessor__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__HwProcessor__Group__0"


    // $ANTLR start "rule__HwProcessor__Group__0__Impl"
    // InternalMarText.g:653:1: rule__HwProcessor__Group__0__Impl : ( 'processor' ) ;
    public final void rule__HwProcessor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarText.g:657:1: ( ( 'processor' ) )
            // InternalMarText.g:658:1: ( 'processor' )
            {
            // InternalMarText.g:658:1: ( 'processor' )
            // InternalMarText.g:659:2: 'processor'
            {
             before(grammarAccess.getHwProcessorAccess().getProcessorKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getHwProcessorAccess().getProcessorKeyword_0()); 

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
    // $ANTLR end "rule__HwProcessor__Group__0__Impl"


    // $ANTLR start "rule__HwProcessor__Group__1"
    // InternalMarText.g:668:1: rule__HwProcessor__Group__1 : rule__HwProcessor__Group__1__Impl rule__HwProcessor__Group__2 ;
    public final void rule__HwProcessor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarText.g:672:1: ( rule__HwProcessor__Group__1__Impl rule__HwProcessor__Group__2 )
            // InternalMarText.g:673:2: rule__HwProcessor__Group__1__Impl rule__HwProcessor__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__HwProcessor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HwProcessor__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__HwProcessor__Group__1"


    // $ANTLR start "rule__HwProcessor__Group__1__Impl"
    // InternalMarText.g:680:1: rule__HwProcessor__Group__1__Impl : ( () ) ;
    public final void rule__HwProcessor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarText.g:684:1: ( ( () ) )
            // InternalMarText.g:685:1: ( () )
            {
            // InternalMarText.g:685:1: ( () )
            // InternalMarText.g:686:2: ()
            {
             before(grammarAccess.getHwProcessorAccess().getHwProcessorAction_1()); 
            // InternalMarText.g:687:2: ()
            // InternalMarText.g:687:3: 
            {
            }

             after(grammarAccess.getHwProcessorAccess().getHwProcessorAction_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HwProcessor__Group__1__Impl"


    // $ANTLR start "rule__HwProcessor__Group__2"
    // InternalMarText.g:695:1: rule__HwProcessor__Group__2 : rule__HwProcessor__Group__2__Impl rule__HwProcessor__Group__3 ;
    public final void rule__HwProcessor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarText.g:699:1: ( rule__HwProcessor__Group__2__Impl rule__HwProcessor__Group__3 )
            // InternalMarText.g:700:2: rule__HwProcessor__Group__2__Impl rule__HwProcessor__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__HwProcessor__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HwProcessor__Group__3();

            state._fsp--;


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
    // $ANTLR end "rule__HwProcessor__Group__2"


    // $ANTLR start "rule__HwProcessor__Group__2__Impl"
    // InternalMarText.g:707:1: rule__HwProcessor__Group__2__Impl : ( ( rule__HwProcessor__NameAssignment_2 ) ) ;
    public final void rule__HwProcessor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarText.g:711:1: ( ( ( rule__HwProcessor__NameAssignment_2 ) ) )
            // InternalMarText.g:712:1: ( ( rule__HwProcessor__NameAssignment_2 ) )
            {
            // InternalMarText.g:712:1: ( ( rule__HwProcessor__NameAssignment_2 ) )
            // InternalMarText.g:713:2: ( rule__HwProcessor__NameAssignment_2 )
            {
             before(grammarAccess.getHwProcessorAccess().getNameAssignment_2()); 
            // InternalMarText.g:714:2: ( rule__HwProcessor__NameAssignment_2 )
            // InternalMarText.g:714:3: rule__HwProcessor__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__HwProcessor__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getHwProcessorAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__HwProcessor__Group__2__Impl"


    // $ANTLR start "rule__HwProcessor__Group__3"
    // InternalMarText.g:722:1: rule__HwProcessor__Group__3 : rule__HwProcessor__Group__3__Impl ;
    public final void rule__HwProcessor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarText.g:726:1: ( rule__HwProcessor__Group__3__Impl )
            // InternalMarText.g:727:2: rule__HwProcessor__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HwProcessor__Group__3__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__HwProcessor__Group__3"


    // $ANTLR start "rule__HwProcessor__Group__3__Impl"
    // InternalMarText.g:733:1: rule__HwProcessor__Group__3__Impl : ( ( rule__HwProcessor__Alternatives_3 ) ) ;
    public final void rule__HwProcessor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarText.g:737:1: ( ( ( rule__HwProcessor__Alternatives_3 ) ) )
            // InternalMarText.g:738:1: ( ( rule__HwProcessor__Alternatives_3 ) )
            {
            // InternalMarText.g:738:1: ( ( rule__HwProcessor__Alternatives_3 ) )
            // InternalMarText.g:739:2: ( rule__HwProcessor__Alternatives_3 )
            {
             before(grammarAccess.getHwProcessorAccess().getAlternatives_3()); 
            // InternalMarText.g:740:2: ( rule__HwProcessor__Alternatives_3 )
            // InternalMarText.g:740:3: rule__HwProcessor__Alternatives_3
            {
            pushFollow(FOLLOW_2);
            rule__HwProcessor__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getHwProcessorAccess().getAlternatives_3()); 

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
    // $ANTLR end "rule__HwProcessor__Group__3__Impl"


    // $ANTLR start "rule__HwProcessor__Group_3_0_0__0"
    // InternalMarText.g:749:1: rule__HwProcessor__Group_3_0_0__0 : rule__HwProcessor__Group_3_0_0__0__Impl rule__HwProcessor__Group_3_0_0__1 ;
    public final void rule__HwProcessor__Group_3_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarText.g:753:1: ( rule__HwProcessor__Group_3_0_0__0__Impl rule__HwProcessor__Group_3_0_0__1 )
            // InternalMarText.g:754:2: rule__HwProcessor__Group_3_0_0__0__Impl rule__HwProcessor__Group_3_0_0__1
            {
            pushFollow(FOLLOW_8);
            rule__HwProcessor__Group_3_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HwProcessor__Group_3_0_0__1();

            state._fsp--;


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
    // $ANTLR end "rule__HwProcessor__Group_3_0_0__0"


    // $ANTLR start "rule__HwProcessor__Group_3_0_0__0__Impl"
    // InternalMarText.g:761:1: rule__HwProcessor__Group_3_0_0__0__Impl : ( '{' ) ;
    public final void rule__HwProcessor__Group_3_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarText.g:765:1: ( ( '{' ) )
            // InternalMarText.g:766:1: ( '{' )
            {
            // InternalMarText.g:766:1: ( '{' )
            // InternalMarText.g:767:2: '{'
            {
             before(grammarAccess.getHwProcessorAccess().getLeftCurlyBracketKeyword_3_0_0_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getHwProcessorAccess().getLeftCurlyBracketKeyword_3_0_0_0()); 

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
    // $ANTLR end "rule__HwProcessor__Group_3_0_0__0__Impl"


    // $ANTLR start "rule__HwProcessor__Group_3_0_0__1"
    // InternalMarText.g:776:1: rule__HwProcessor__Group_3_0_0__1 : rule__HwProcessor__Group_3_0_0__1__Impl ;
    public final void rule__HwProcessor__Group_3_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarText.g:780:1: ( rule__HwProcessor__Group_3_0_0__1__Impl )
            // InternalMarText.g:781:2: rule__HwProcessor__Group_3_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HwProcessor__Group_3_0_0__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__HwProcessor__Group_3_0_0__1"


    // $ANTLR start "rule__HwProcessor__Group_3_0_0__1__Impl"
    // InternalMarText.g:787:1: rule__HwProcessor__Group_3_0_0__1__Impl : ( ( rule__HwProcessor__Group_3_0_0_1__0 )? ) ;
    public final void rule__HwProcessor__Group_3_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarText.g:791:1: ( ( ( rule__HwProcessor__Group_3_0_0_1__0 )? ) )
            // InternalMarText.g:792:1: ( ( rule__HwProcessor__Group_3_0_0_1__0 )? )
            {
            // InternalMarText.g:792:1: ( ( rule__HwProcessor__Group_3_0_0_1__0 )? )
            // InternalMarText.g:793:2: ( rule__HwProcessor__Group_3_0_0_1__0 )?
            {
             before(grammarAccess.getHwProcessorAccess().getGroup_3_0_0_1()); 
            // InternalMarText.g:794:2: ( rule__HwProcessor__Group_3_0_0_1__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMarText.g:794:3: rule__HwProcessor__Group_3_0_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__HwProcessor__Group_3_0_0_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHwProcessorAccess().getGroup_3_0_0_1()); 

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
    // $ANTLR end "rule__HwProcessor__Group_3_0_0__1__Impl"


    // $ANTLR start "rule__HwProcessor__Group_3_0_0_1__0"
    // InternalMarText.g:803:1: rule__HwProcessor__Group_3_0_0_1__0 : rule__HwProcessor__Group_3_0_0_1__0__Impl rule__HwProcessor__Group_3_0_0_1__1 ;
    public final void rule__HwProcessor__Group_3_0_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarText.g:807:1: ( rule__HwProcessor__Group_3_0_0_1__0__Impl rule__HwProcessor__Group_3_0_0_1__1 )
            // InternalMarText.g:808:2: rule__HwProcessor__Group_3_0_0_1__0__Impl rule__HwProcessor__Group_3_0_0_1__1
            {
            pushFollow(FOLLOW_9);
            rule__HwProcessor__Group_3_0_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HwProcessor__Group_3_0_0_1__1();

            state._fsp--;


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
    // $ANTLR end "rule__HwProcessor__Group_3_0_0_1__0"


    // $ANTLR start "rule__HwProcessor__Group_3_0_0_1__0__Impl"
    // InternalMarText.g:815:1: rule__HwProcessor__Group_3_0_0_1__0__Impl : ( 'cores:' ) ;
    public final void rule__HwProcessor__Group_3_0_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarText.g:819:1: ( ( 'cores:' ) )
            // InternalMarText.g:820:1: ( 'cores:' )
            {
            // InternalMarText.g:820:1: ( 'cores:' )
            // InternalMarText.g:821:2: 'cores:'
            {
             before(grammarAccess.getHwProcessorAccess().getCoresKeyword_3_0_0_1_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getHwProcessorAccess().getCoresKeyword_3_0_0_1_0()); 

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
    // $ANTLR end "rule__HwProcessor__Group_3_0_0_1__0__Impl"


    // $ANTLR start "rule__HwProcessor__Group_3_0_0_1__1"
    // InternalMarText.g:830:1: rule__HwProcessor__Group_3_0_0_1__1 : rule__HwProcessor__Group_3_0_0_1__1__Impl rule__HwProcessor__Group_3_0_0_1__2 ;
    public final void rule__HwProcessor__Group_3_0_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarText.g:834:1: ( rule__HwProcessor__Group_3_0_0_1__1__Impl rule__HwProcessor__Group_3_0_0_1__2 )
            // InternalMarText.g:835:2: rule__HwProcessor__Group_3_0_0_1__1__Impl rule__HwProcessor__Group_3_0_0_1__2
            {
            pushFollow(FOLLOW_10);
            rule__HwProcessor__Group_3_0_0_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HwProcessor__Group_3_0_0_1__2();

            state._fsp--;


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
    // $ANTLR end "rule__HwProcessor__Group_3_0_0_1__1"


    // $ANTLR start "rule__HwProcessor__Group_3_0_0_1__1__Impl"
    // InternalMarText.g:842:1: rule__HwProcessor__Group_3_0_0_1__1__Impl : ( ( rule__HwProcessor__NbCoresAssignment_3_0_0_1_1 ) ) ;
    public final void rule__HwProcessor__Group_3_0_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarText.g:846:1: ( ( ( rule__HwProcessor__NbCoresAssignment_3_0_0_1_1 ) ) )
            // InternalMarText.g:847:1: ( ( rule__HwProcessor__NbCoresAssignment_3_0_0_1_1 ) )
            {
            // InternalMarText.g:847:1: ( ( rule__HwProcessor__NbCoresAssignment_3_0_0_1_1 ) )
            // InternalMarText.g:848:2: ( rule__HwProcessor__NbCoresAssignment_3_0_0_1_1 )
            {
             before(grammarAccess.getHwProcessorAccess().getNbCoresAssignment_3_0_0_1_1()); 
            // InternalMarText.g:849:2: ( rule__HwProcessor__NbCoresAssignment_3_0_0_1_1 )
            // InternalMarText.g:849:3: rule__HwProcessor__NbCoresAssignment_3_0_0_1_1
            {
            pushFollow(FOLLOW_2);
            rule__HwProcessor__NbCoresAssignment_3_0_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getHwProcessorAccess().getNbCoresAssignment_3_0_0_1_1()); 

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
    // $ANTLR end "rule__HwProcessor__Group_3_0_0_1__1__Impl"


    // $ANTLR start "rule__HwProcessor__Group_3_0_0_1__2"
    // InternalMarText.g:857:1: rule__HwProcessor__Group_3_0_0_1__2 : rule__HwProcessor__Group_3_0_0_1__2__Impl ;
    public final void rule__HwProcessor__Group_3_0_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarText.g:861:1: ( rule__HwProcessor__Group_3_0_0_1__2__Impl )
            // InternalMarText.g:862:2: rule__HwProcessor__Group_3_0_0_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HwProcessor__Group_3_0_0_1__2__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__HwProcessor__Group_3_0_0_1__2"


    // $ANTLR start "rule__HwProcessor__Group_3_0_0_1__2__Impl"
    // InternalMarText.g:868:1: rule__HwProcessor__Group_3_0_0_1__2__Impl : ( ';' ) ;
    public final void rule__HwProcessor__Group_3_0_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarText.g:872:1: ( ( ';' ) )
            // InternalMarText.g:873:1: ( ';' )
            {
            // InternalMarText.g:873:1: ( ';' )
            // InternalMarText.g:874:2: ';'
            {
             before(grammarAccess.getHwProcessorAccess().getSemicolonKeyword_3_0_0_1_2()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getHwProcessorAccess().getSemicolonKeyword_3_0_0_1_2()); 

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
    // $ANTLR end "rule__HwProcessor__Group_3_0_0_1__2__Impl"


    // $ANTLR start "rule__HwProcessor__Group_3_0_1__0"
    // InternalMarText.g:884:1: rule__HwProcessor__Group_3_0_1__0 : rule__HwProcessor__Group_3_0_1__0__Impl rule__HwProcessor__Group_3_0_1__1 ;
    public final void rule__HwProcessor__Group_3_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarText.g:888:1: ( rule__HwProcessor__Group_3_0_1__0__Impl rule__HwProcessor__Group_3_0_1__1 )
            // InternalMarText.g:889:2: rule__HwProcessor__Group_3_0_1__0__Impl rule__HwProcessor__Group_3_0_1__1
            {
            pushFollow(FOLLOW_11);
            rule__HwProcessor__Group_3_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HwProcessor__Group_3_0_1__1();

            state._fsp--;


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
    // $ANTLR end "rule__HwProcessor__Group_3_0_1__0"


    // $ANTLR start "rule__HwProcessor__Group_3_0_1__0__Impl"
    // InternalMarText.g:896:1: rule__HwProcessor__Group_3_0_1__0__Impl : ( ( rule__HwProcessor__Group_3_0_1_0__0 )? ) ;
    public final void rule__HwProcessor__Group_3_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarText.g:900:1: ( ( ( rule__HwProcessor__Group_3_0_1_0__0 )? ) )
            // InternalMarText.g:901:1: ( ( rule__HwProcessor__Group_3_0_1_0__0 )? )
            {
            // InternalMarText.g:901:1: ( ( rule__HwProcessor__Group_3_0_1_0__0 )? )
            // InternalMarText.g:902:2: ( rule__HwProcessor__Group_3_0_1_0__0 )?
            {
             before(grammarAccess.getHwProcessorAccess().getGroup_3_0_1_0()); 
            // InternalMarText.g:903:2: ( rule__HwProcessor__Group_3_0_1_0__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMarText.g:903:3: rule__HwProcessor__Group_3_0_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__HwProcessor__Group_3_0_1_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHwProcessorAccess().getGroup_3_0_1_0()); 

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
    // $ANTLR end "rule__HwProcessor__Group_3_0_1__0__Impl"


    // $ANTLR start "rule__HwProcessor__Group_3_0_1__1"
    // InternalMarText.g:911:1: rule__HwProcessor__Group_3_0_1__1 : rule__HwProcessor__Group_3_0_1__1__Impl ;
    public final void rule__HwProcessor__Group_3_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarText.g:915:1: ( rule__HwProcessor__Group_3_0_1__1__Impl )
            // InternalMarText.g:916:2: rule__HwProcessor__Group_3_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HwProcessor__Group_3_0_1__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__HwProcessor__Group_3_0_1__1"


    // $ANTLR start "rule__HwProcessor__Group_3_0_1__1__Impl"
    // InternalMarText.g:922:1: rule__HwProcessor__Group_3_0_1__1__Impl : ( '};' ) ;
    public final void rule__HwProcessor__Group_3_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarText.g:926:1: ( ( '};' ) )
            // InternalMarText.g:927:1: ( '};' )
            {
            // InternalMarText.g:927:1: ( '};' )
            // InternalMarText.g:928:2: '};'
            {
             before(grammarAccess.getHwProcessorAccess().getRightCurlyBracketSemicolonKeyword_3_0_1_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getHwProcessorAccess().getRightCurlyBracketSemicolonKeyword_3_0_1_1()); 

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
    // $ANTLR end "rule__HwProcessor__Group_3_0_1__1__Impl"


    // $ANTLR start "rule__HwProcessor__Group_3_0_1_0__0"
    // InternalMarText.g:938:1: rule__HwProcessor__Group_3_0_1_0__0 : rule__HwProcessor__Group_3_0_1_0__0__Impl rule__HwProcessor__Group_3_0_1_0__1 ;
    public final void rule__HwProcessor__Group_3_0_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarText.g:942:1: ( rule__HwProcessor__Group_3_0_1_0__0__Impl rule__HwProcessor__Group_3_0_1_0__1 )
            // InternalMarText.g:943:2: rule__HwProcessor__Group_3_0_1_0__0__Impl rule__HwProcessor__Group_3_0_1_0__1
            {
            pushFollow(FOLLOW_12);
            rule__HwProcessor__Group_3_0_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HwProcessor__Group_3_0_1_0__1();

            state._fsp--;


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
    // $ANTLR end "rule__HwProcessor__Group_3_0_1_0__0"


    // $ANTLR start "rule__HwProcessor__Group_3_0_1_0__0__Impl"
    // InternalMarText.g:950:1: rule__HwProcessor__Group_3_0_1_0__0__Impl : ( 'caches:' ) ;
    public final void rule__HwProcessor__Group_3_0_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarText.g:954:1: ( ( 'caches:' ) )
            // InternalMarText.g:955:1: ( 'caches:' )
            {
            // InternalMarText.g:955:1: ( 'caches:' )
            // InternalMarText.g:956:2: 'caches:'
            {
             before(grammarAccess.getHwProcessorAccess().getCachesKeyword_3_0_1_0_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getHwProcessorAccess().getCachesKeyword_3_0_1_0_0()); 

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
    // $ANTLR end "rule__HwProcessor__Group_3_0_1_0__0__Impl"


    // $ANTLR start "rule__HwProcessor__Group_3_0_1_0__1"
    // InternalMarText.g:965:1: rule__HwProcessor__Group_3_0_1_0__1 : rule__HwProcessor__Group_3_0_1_0__1__Impl rule__HwProcessor__Group_3_0_1_0__2 ;
    public final void rule__HwProcessor__Group_3_0_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarText.g:969:1: ( rule__HwProcessor__Group_3_0_1_0__1__Impl rule__HwProcessor__Group_3_0_1_0__2 )
            // InternalMarText.g:970:2: rule__HwProcessor__Group_3_0_1_0__1__Impl rule__HwProcessor__Group_3_0_1_0__2
            {
            pushFollow(FOLLOW_5);
            rule__HwProcessor__Group_3_0_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HwProcessor__Group_3_0_1_0__2();

            state._fsp--;


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
    // $ANTLR end "rule__HwProcessor__Group_3_0_1_0__1"


    // $ANTLR start "rule__HwProcessor__Group_3_0_1_0__1__Impl"
    // InternalMarText.g:977:1: rule__HwProcessor__Group_3_0_1_0__1__Impl : ( '{' ) ;
    public final void rule__HwProcessor__Group_3_0_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarText.g:981:1: ( ( '{' ) )
            // InternalMarText.g:982:1: ( '{' )
            {
            // InternalMarText.g:982:1: ( '{' )
            // InternalMarText.g:983:2: '{'
            {
             before(grammarAccess.getHwProcessorAccess().getLeftCurlyBracketKeyword_3_0_1_0_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getHwProcessorAccess().getLeftCurlyBracketKeyword_3_0_1_0_1()); 

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
    // $ANTLR end "rule__HwProcessor__Group_3_0_1_0__1__Impl"


    // $ANTLR start "rule__HwProcessor__Group_3_0_1_0__2"
    // InternalMarText.g:992:1: rule__HwProcessor__Group_3_0_1_0__2 : rule__HwProcessor__Group_3_0_1_0__2__Impl rule__HwProcessor__Group_3_0_1_0__3 ;
    public final void rule__HwProcessor__Group_3_0_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarText.g:996:1: ( rule__HwProcessor__Group_3_0_1_0__2__Impl rule__HwProcessor__Group_3_0_1_0__3 )
            // InternalMarText.g:997:2: rule__HwProcessor__Group_3_0_1_0__2__Impl rule__HwProcessor__Group_3_0_1_0__3
            {
            pushFollow(FOLLOW_5);
            rule__HwProcessor__Group_3_0_1_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HwProcessor__Group_3_0_1_0__3();

            state._fsp--;


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
    // $ANTLR end "rule__HwProcessor__Group_3_0_1_0__2"


    // $ANTLR start "rule__HwProcessor__Group_3_0_1_0__2__Impl"
    // InternalMarText.g:1004:1: rule__HwProcessor__Group_3_0_1_0__2__Impl : ( ( rule__HwProcessor__PackagedElementAssignment_3_0_1_0_2 )* ) ;
    public final void rule__HwProcessor__Group_3_0_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarText.g:1008:1: ( ( ( rule__HwProcessor__PackagedElementAssignment_3_0_1_0_2 )* ) )
            // InternalMarText.g:1009:1: ( ( rule__HwProcessor__PackagedElementAssignment_3_0_1_0_2 )* )
            {
            // InternalMarText.g:1009:1: ( ( rule__HwProcessor__PackagedElementAssignment_3_0_1_0_2 )* )
            // InternalMarText.g:1010:2: ( rule__HwProcessor__PackagedElementAssignment_3_0_1_0_2 )*
            {
             before(grammarAccess.getHwProcessorAccess().getPackagedElementAssignment_3_0_1_0_2()); 
            // InternalMarText.g:1011:2: ( rule__HwProcessor__PackagedElementAssignment_3_0_1_0_2 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=15 && LA10_0<=16)||LA10_0==19) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMarText.g:1011:3: rule__HwProcessor__PackagedElementAssignment_3_0_1_0_2
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__HwProcessor__PackagedElementAssignment_3_0_1_0_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getHwProcessorAccess().getPackagedElementAssignment_3_0_1_0_2()); 

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
    // $ANTLR end "rule__HwProcessor__Group_3_0_1_0__2__Impl"


    // $ANTLR start "rule__HwProcessor__Group_3_0_1_0__3"
    // InternalMarText.g:1019:1: rule__HwProcessor__Group_3_0_1_0__3 : rule__HwProcessor__Group_3_0_1_0__3__Impl ;
    public final void rule__HwProcessor__Group_3_0_1_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarText.g:1023:1: ( rule__HwProcessor__Group_3_0_1_0__3__Impl )
            // InternalMarText.g:1024:2: rule__HwProcessor__Group_3_0_1_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HwProcessor__Group_3_0_1_0__3__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__HwProcessor__Group_3_0_1_0__3"


    // $ANTLR start "rule__HwProcessor__Group_3_0_1_0__3__Impl"
    // InternalMarText.g:1030:1: rule__HwProcessor__Group_3_0_1_0__3__Impl : ( '};' ) ;
    public final void rule__HwProcessor__Group_3_0_1_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarText.g:1034:1: ( ( '};' ) )
            // InternalMarText.g:1035:1: ( '};' )
            {
            // InternalMarText.g:1035:1: ( '};' )
            // InternalMarText.g:1036:2: '};'
            {
             before(grammarAccess.getHwProcessorAccess().getRightCurlyBracketSemicolonKeyword_3_0_1_0_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getHwProcessorAccess().getRightCurlyBracketSemicolonKeyword_3_0_1_0_3()); 

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
    // $ANTLR end "rule__HwProcessor__Group_3_0_1_0__3__Impl"


    // $ANTLR start "rule__HwCache__Group__0"
    // InternalMarText.g:1046:1: rule__HwCache__Group__0 : rule__HwCache__Group__0__Impl rule__HwCache__Group__1 ;
    public final void rule__HwCache__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarText.g:1050:1: ( rule__HwCache__Group__0__Impl rule__HwCache__Group__1 )
            // InternalMarText.g:1051:2: rule__HwCache__Group__0__Impl rule__HwCache__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__HwCache__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HwCache__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__HwCache__Group__0"


    // $ANTLR start "rule__HwCache__Group__0__Impl"
    // InternalMarText.g:1058:1: rule__HwCache__Group__0__Impl : ( 'cache' ) ;
    public final void rule__HwCache__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarText.g:1062:1: ( ( 'cache' ) )
            // InternalMarText.g:1063:1: ( 'cache' )
            {
            // InternalMarText.g:1063:1: ( 'cache' )
            // InternalMarText.g:1064:2: 'cache'
            {
             before(grammarAccess.getHwCacheAccess().getCacheKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getHwCacheAccess().getCacheKeyword_0()); 

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
    // $ANTLR end "rule__HwCache__Group__0__Impl"


    // $ANTLR start "rule__HwCache__Group__1"
    // InternalMarText.g:1073:1: rule__HwCache__Group__1 : rule__HwCache__Group__1__Impl rule__HwCache__Group__2 ;
    public final void rule__HwCache__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarText.g:1077:1: ( rule__HwCache__Group__1__Impl rule__HwCache__Group__2 )
            // InternalMarText.g:1078:2: rule__HwCache__Group__1__Impl rule__HwCache__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__HwCache__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HwCache__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__HwCache__Group__1"


    // $ANTLR start "rule__HwCache__Group__1__Impl"
    // InternalMarText.g:1085:1: rule__HwCache__Group__1__Impl : ( () ) ;
    public final void rule__HwCache__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarText.g:1089:1: ( ( () ) )
            // InternalMarText.g:1090:1: ( () )
            {
            // InternalMarText.g:1090:1: ( () )
            // InternalMarText.g:1091:2: ()
            {
             before(grammarAccess.getHwCacheAccess().getHwCacheAction_1()); 
            // InternalMarText.g:1092:2: ()
            // InternalMarText.g:1092:3: 
            {
            }

             after(grammarAccess.getHwCacheAccess().getHwCacheAction_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HwCache__Group__1__Impl"


    // $ANTLR start "rule__HwCache__Group__2"
    // InternalMarText.g:1100:1: rule__HwCache__Group__2 : rule__HwCache__Group__2__Impl rule__HwCache__Group__3 ;
    public final void rule__HwCache__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarText.g:1104:1: ( rule__HwCache__Group__2__Impl rule__HwCache__Group__3 )
            // InternalMarText.g:1105:2: rule__HwCache__Group__2__Impl rule__HwCache__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__HwCache__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HwCache__Group__3();

            state._fsp--;


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
    // $ANTLR end "rule__HwCache__Group__2"


    // $ANTLR start "rule__HwCache__Group__2__Impl"
    // InternalMarText.g:1112:1: rule__HwCache__Group__2__Impl : ( ( rule__HwCache__NameAssignment_2 ) ) ;
    public final void rule__HwCache__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarText.g:1116:1: ( ( ( rule__HwCache__NameAssignment_2 ) ) )
            // InternalMarText.g:1117:1: ( ( rule__HwCache__NameAssignment_2 ) )
            {
            // InternalMarText.g:1117:1: ( ( rule__HwCache__NameAssignment_2 ) )
            // InternalMarText.g:1118:2: ( rule__HwCache__NameAssignment_2 )
            {
             before(grammarAccess.getHwCacheAccess().getNameAssignment_2()); 
            // InternalMarText.g:1119:2: ( rule__HwCache__NameAssignment_2 )
            // InternalMarText.g:1119:3: rule__HwCache__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__HwCache__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getHwCacheAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__HwCache__Group__2__Impl"


    // $ANTLR start "rule__HwCache__Group__3"
    // InternalMarText.g:1127:1: rule__HwCache__Group__3 : rule__HwCache__Group__3__Impl ;
    public final void rule__HwCache__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarText.g:1131:1: ( rule__HwCache__Group__3__Impl )
            // InternalMarText.g:1132:2: rule__HwCache__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HwCache__Group__3__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__HwCache__Group__3"


    // $ANTLR start "rule__HwCache__Group__3__Impl"
    // InternalMarText.g:1138:1: rule__HwCache__Group__3__Impl : ( ( rule__HwCache__Alternatives_3 ) ) ;
    public final void rule__HwCache__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarText.g:1142:1: ( ( ( rule__HwCache__Alternatives_3 ) ) )
            // InternalMarText.g:1143:1: ( ( rule__HwCache__Alternatives_3 ) )
            {
            // InternalMarText.g:1143:1: ( ( rule__HwCache__Alternatives_3 ) )
            // InternalMarText.g:1144:2: ( rule__HwCache__Alternatives_3 )
            {
             before(grammarAccess.getHwCacheAccess().getAlternatives_3()); 
            // InternalMarText.g:1145:2: ( rule__HwCache__Alternatives_3 )
            // InternalMarText.g:1145:3: rule__HwCache__Alternatives_3
            {
            pushFollow(FOLLOW_2);
            rule__HwCache__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getHwCacheAccess().getAlternatives_3()); 

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
    // $ANTLR end "rule__HwCache__Group__3__Impl"


    // $ANTLR start "rule__HwCache__Group_3_0__0"
    // InternalMarText.g:1154:1: rule__HwCache__Group_3_0__0 : rule__HwCache__Group_3_0__0__Impl rule__HwCache__Group_3_0__1 ;
    public final void rule__HwCache__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarText.g:1158:1: ( rule__HwCache__Group_3_0__0__Impl rule__HwCache__Group_3_0__1 )
            // InternalMarText.g:1159:2: rule__HwCache__Group_3_0__0__Impl rule__HwCache__Group_3_0__1
            {
            pushFollow(FOLLOW_13);
            rule__HwCache__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HwCache__Group_3_0__1();

            state._fsp--;


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
    // $ANTLR end "rule__HwCache__Group_3_0__0"


    // $ANTLR start "rule__HwCache__Group_3_0__0__Impl"
    // InternalMarText.g:1166:1: rule__HwCache__Group_3_0__0__Impl : ( '{' ) ;
    public final void rule__HwCache__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarText.g:1170:1: ( ( '{' ) )
            // InternalMarText.g:1171:1: ( '{' )
            {
            // InternalMarText.g:1171:1: ( '{' )
            // InternalMarText.g:1172:2: '{'
            {
             before(grammarAccess.getHwCacheAccess().getLeftCurlyBracketKeyword_3_0_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getHwCacheAccess().getLeftCurlyBracketKeyword_3_0_0()); 

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
    // $ANTLR end "rule__HwCache__Group_3_0__0__Impl"


    // $ANTLR start "rule__HwCache__Group_3_0__1"
    // InternalMarText.g:1181:1: rule__HwCache__Group_3_0__1 : rule__HwCache__Group_3_0__1__Impl rule__HwCache__Group_3_0__2 ;
    public final void rule__HwCache__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarText.g:1185:1: ( rule__HwCache__Group_3_0__1__Impl rule__HwCache__Group_3_0__2 )
            // InternalMarText.g:1186:2: rule__HwCache__Group_3_0__1__Impl rule__HwCache__Group_3_0__2
            {
            pushFollow(FOLLOW_13);
            rule__HwCache__Group_3_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HwCache__Group_3_0__2();

            state._fsp--;


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
    // $ANTLR end "rule__HwCache__Group_3_0__1"


    // $ANTLR start "rule__HwCache__Group_3_0__1__Impl"
    // InternalMarText.g:1193:1: rule__HwCache__Group_3_0__1__Impl : ( ( rule__HwCache__Group_3_0_1__0 )? ) ;
    public final void rule__HwCache__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarText.g:1197:1: ( ( ( rule__HwCache__Group_3_0_1__0 )? ) )
            // InternalMarText.g:1198:1: ( ( rule__HwCache__Group_3_0_1__0 )? )
            {
            // InternalMarText.g:1198:1: ( ( rule__HwCache__Group_3_0_1__0 )? )
            // InternalMarText.g:1199:2: ( rule__HwCache__Group_3_0_1__0 )?
            {
             before(grammarAccess.getHwCacheAccess().getGroup_3_0_1()); 
            // InternalMarText.g:1200:2: ( rule__HwCache__Group_3_0_1__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==20) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMarText.g:1200:3: rule__HwCache__Group_3_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__HwCache__Group_3_0_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHwCacheAccess().getGroup_3_0_1()); 

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
    // $ANTLR end "rule__HwCache__Group_3_0__1__Impl"


    // $ANTLR start "rule__HwCache__Group_3_0__2"
    // InternalMarText.g:1208:1: rule__HwCache__Group_3_0__2 : rule__HwCache__Group_3_0__2__Impl ;
    public final void rule__HwCache__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarText.g:1212:1: ( rule__HwCache__Group_3_0__2__Impl )
            // InternalMarText.g:1213:2: rule__HwCache__Group_3_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HwCache__Group_3_0__2__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__HwCache__Group_3_0__2"


    // $ANTLR start "rule__HwCache__Group_3_0__2__Impl"
    // InternalMarText.g:1219:1: rule__HwCache__Group_3_0__2__Impl : ( '};' ) ;
    public final void rule__HwCache__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarText.g:1223:1: ( ( '};' ) )
            // InternalMarText.g:1224:1: ( '};' )
            {
            // InternalMarText.g:1224:1: ( '};' )
            // InternalMarText.g:1225:2: '};'
            {
             before(grammarAccess.getHwCacheAccess().getRightCurlyBracketSemicolonKeyword_3_0_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getHwCacheAccess().getRightCurlyBracketSemicolonKeyword_3_0_2()); 

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
    // $ANTLR end "rule__HwCache__Group_3_0__2__Impl"


    // $ANTLR start "rule__HwCache__Group_3_0_1__0"
    // InternalMarText.g:1235:1: rule__HwCache__Group_3_0_1__0 : rule__HwCache__Group_3_0_1__0__Impl rule__HwCache__Group_3_0_1__1 ;
    public final void rule__HwCache__Group_3_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarText.g:1239:1: ( rule__HwCache__Group_3_0_1__0__Impl rule__HwCache__Group_3_0_1__1 )
            // InternalMarText.g:1240:2: rule__HwCache__Group_3_0_1__0__Impl rule__HwCache__Group_3_0_1__1
            {
            pushFollow(FOLLOW_9);
            rule__HwCache__Group_3_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HwCache__Group_3_0_1__1();

            state._fsp--;


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
    // $ANTLR end "rule__HwCache__Group_3_0_1__0"


    // $ANTLR start "rule__HwCache__Group_3_0_1__0__Impl"
    // InternalMarText.g:1247:1: rule__HwCache__Group_3_0_1__0__Impl : ( 'level:' ) ;
    public final void rule__HwCache__Group_3_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarText.g:1251:1: ( ( 'level:' ) )
            // InternalMarText.g:1252:1: ( 'level:' )
            {
            // InternalMarText.g:1252:1: ( 'level:' )
            // InternalMarText.g:1253:2: 'level:'
            {
             before(grammarAccess.getHwCacheAccess().getLevelKeyword_3_0_1_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getHwCacheAccess().getLevelKeyword_3_0_1_0()); 

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
    // $ANTLR end "rule__HwCache__Group_3_0_1__0__Impl"


    // $ANTLR start "rule__HwCache__Group_3_0_1__1"
    // InternalMarText.g:1262:1: rule__HwCache__Group_3_0_1__1 : rule__HwCache__Group_3_0_1__1__Impl rule__HwCache__Group_3_0_1__2 ;
    public final void rule__HwCache__Group_3_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarText.g:1266:1: ( rule__HwCache__Group_3_0_1__1__Impl rule__HwCache__Group_3_0_1__2 )
            // InternalMarText.g:1267:2: rule__HwCache__Group_3_0_1__1__Impl rule__HwCache__Group_3_0_1__2
            {
            pushFollow(FOLLOW_10);
            rule__HwCache__Group_3_0_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HwCache__Group_3_0_1__2();

            state._fsp--;


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
    // $ANTLR end "rule__HwCache__Group_3_0_1__1"


    // $ANTLR start "rule__HwCache__Group_3_0_1__1__Impl"
    // InternalMarText.g:1274:1: rule__HwCache__Group_3_0_1__1__Impl : ( ( rule__HwCache__LevelAssignment_3_0_1_1 ) ) ;
    public final void rule__HwCache__Group_3_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarText.g:1278:1: ( ( ( rule__HwCache__LevelAssignment_3_0_1_1 ) ) )
            // InternalMarText.g:1279:1: ( ( rule__HwCache__LevelAssignment_3_0_1_1 ) )
            {
            // InternalMarText.g:1279:1: ( ( rule__HwCache__LevelAssignment_3_0_1_1 ) )
            // InternalMarText.g:1280:2: ( rule__HwCache__LevelAssignment_3_0_1_1 )
            {
             before(grammarAccess.getHwCacheAccess().getLevelAssignment_3_0_1_1()); 
            // InternalMarText.g:1281:2: ( rule__HwCache__LevelAssignment_3_0_1_1 )
            // InternalMarText.g:1281:3: rule__HwCache__LevelAssignment_3_0_1_1
            {
            pushFollow(FOLLOW_2);
            rule__HwCache__LevelAssignment_3_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getHwCacheAccess().getLevelAssignment_3_0_1_1()); 

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
    // $ANTLR end "rule__HwCache__Group_3_0_1__1__Impl"


    // $ANTLR start "rule__HwCache__Group_3_0_1__2"
    // InternalMarText.g:1289:1: rule__HwCache__Group_3_0_1__2 : rule__HwCache__Group_3_0_1__2__Impl ;
    public final void rule__HwCache__Group_3_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarText.g:1293:1: ( rule__HwCache__Group_3_0_1__2__Impl )
            // InternalMarText.g:1294:2: rule__HwCache__Group_3_0_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HwCache__Group_3_0_1__2__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__HwCache__Group_3_0_1__2"


    // $ANTLR start "rule__HwCache__Group_3_0_1__2__Impl"
    // InternalMarText.g:1300:1: rule__HwCache__Group_3_0_1__2__Impl : ( ';' ) ;
    public final void rule__HwCache__Group_3_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarText.g:1304:1: ( ( ';' ) )
            // InternalMarText.g:1305:1: ( ';' )
            {
            // InternalMarText.g:1305:1: ( ';' )
            // InternalMarText.g:1306:2: ';'
            {
             before(grammarAccess.getHwCacheAccess().getSemicolonKeyword_3_0_1_2()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getHwCacheAccess().getSemicolonKeyword_3_0_1_2()); 

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
    // $ANTLR end "rule__HwCache__Group_3_0_1__2__Impl"


    // $ANTLR start "rule__HwProcessor__UnorderedGroup_3_0"
    // InternalMarText.g:1316:1: rule__HwProcessor__UnorderedGroup_3_0 : rule__HwProcessor__UnorderedGroup_3_0__0 {...}?;
    public final void rule__HwProcessor__UnorderedGroup_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getHwProcessorAccess().getUnorderedGroup_3_0());
        	
        try {
            // InternalMarText.g:1321:1: ( rule__HwProcessor__UnorderedGroup_3_0__0 {...}?)
            // InternalMarText.g:1322:2: rule__HwProcessor__UnorderedGroup_3_0__0 {...}?
            {
            pushFollow(FOLLOW_2);
            rule__HwProcessor__UnorderedGroup_3_0__0();

            state._fsp--;

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getHwProcessorAccess().getUnorderedGroup_3_0()) ) {
                throw new FailedPredicateException(input, "rule__HwProcessor__UnorderedGroup_3_0", "getUnorderedGroupHelper().canLeave(grammarAccess.getHwProcessorAccess().getUnorderedGroup_3_0())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getHwProcessorAccess().getUnorderedGroup_3_0());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HwProcessor__UnorderedGroup_3_0"


    // $ANTLR start "rule__HwProcessor__UnorderedGroup_3_0__Impl"
    // InternalMarText.g:1330:1: rule__HwProcessor__UnorderedGroup_3_0__Impl : ( ({...}? => ( ( ( rule__HwProcessor__Group_3_0_0__0 ) ) ) ) | ({...}? => ( ( ( rule__HwProcessor__Group_3_0_1__0 ) ) ) ) ) ;
    public final void rule__HwProcessor__UnorderedGroup_3_0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalMarText.g:1335:1: ( ( ({...}? => ( ( ( rule__HwProcessor__Group_3_0_0__0 ) ) ) ) | ({...}? => ( ( ( rule__HwProcessor__Group_3_0_1__0 ) ) ) ) ) )
            // InternalMarText.g:1336:3: ( ({...}? => ( ( ( rule__HwProcessor__Group_3_0_0__0 ) ) ) ) | ({...}? => ( ( ( rule__HwProcessor__Group_3_0_1__0 ) ) ) ) )
            {
            // InternalMarText.g:1336:3: ( ({...}? => ( ( ( rule__HwProcessor__Group_3_0_0__0 ) ) ) ) | ({...}? => ( ( ( rule__HwProcessor__Group_3_0_1__0 ) ) ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( LA12_0 == 13 && getUnorderedGroupHelper().canSelect(grammarAccess.getHwProcessorAccess().getUnorderedGroup_3_0(), 0) ) {
                alt12=1;
            }
            else if ( ( LA12_0 == 14 || LA12_0 == 18 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getHwProcessorAccess().getUnorderedGroup_3_0(), 1) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalMarText.g:1337:3: ({...}? => ( ( ( rule__HwProcessor__Group_3_0_0__0 ) ) ) )
                    {
                    // InternalMarText.g:1337:3: ({...}? => ( ( ( rule__HwProcessor__Group_3_0_0__0 ) ) ) )
                    // InternalMarText.g:1338:4: {...}? => ( ( ( rule__HwProcessor__Group_3_0_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getHwProcessorAccess().getUnorderedGroup_3_0(), 0) ) {
                        throw new FailedPredicateException(input, "rule__HwProcessor__UnorderedGroup_3_0__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getHwProcessorAccess().getUnorderedGroup_3_0(), 0)");
                    }
                    // InternalMarText.g:1338:109: ( ( ( rule__HwProcessor__Group_3_0_0__0 ) ) )
                    // InternalMarText.g:1339:5: ( ( rule__HwProcessor__Group_3_0_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getHwProcessorAccess().getUnorderedGroup_3_0(), 0);
                    				

                    					selected = true;
                    				
                    // InternalMarText.g:1345:5: ( ( rule__HwProcessor__Group_3_0_0__0 ) )
                    // InternalMarText.g:1346:6: ( rule__HwProcessor__Group_3_0_0__0 )
                    {
                     before(grammarAccess.getHwProcessorAccess().getGroup_3_0_0()); 
                    // InternalMarText.g:1347:6: ( rule__HwProcessor__Group_3_0_0__0 )
                    // InternalMarText.g:1347:7: rule__HwProcessor__Group_3_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__HwProcessor__Group_3_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getHwProcessorAccess().getGroup_3_0_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMarText.g:1352:3: ({...}? => ( ( ( rule__HwProcessor__Group_3_0_1__0 ) ) ) )
                    {
                    // InternalMarText.g:1352:3: ({...}? => ( ( ( rule__HwProcessor__Group_3_0_1__0 ) ) ) )
                    // InternalMarText.g:1353:4: {...}? => ( ( ( rule__HwProcessor__Group_3_0_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getHwProcessorAccess().getUnorderedGroup_3_0(), 1) ) {
                        throw new FailedPredicateException(input, "rule__HwProcessor__UnorderedGroup_3_0__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getHwProcessorAccess().getUnorderedGroup_3_0(), 1)");
                    }
                    // InternalMarText.g:1353:109: ( ( ( rule__HwProcessor__Group_3_0_1__0 ) ) )
                    // InternalMarText.g:1354:5: ( ( rule__HwProcessor__Group_3_0_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getHwProcessorAccess().getUnorderedGroup_3_0(), 1);
                    				

                    					selected = true;
                    				
                    // InternalMarText.g:1360:5: ( ( rule__HwProcessor__Group_3_0_1__0 ) )
                    // InternalMarText.g:1361:6: ( rule__HwProcessor__Group_3_0_1__0 )
                    {
                     before(grammarAccess.getHwProcessorAccess().getGroup_3_0_1()); 
                    // InternalMarText.g:1362:6: ( rule__HwProcessor__Group_3_0_1__0 )
                    // InternalMarText.g:1362:7: rule__HwProcessor__Group_3_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__HwProcessor__Group_3_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getHwProcessorAccess().getGroup_3_0_1()); 

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
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getHwProcessorAccess().getUnorderedGroup_3_0());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HwProcessor__UnorderedGroup_3_0__Impl"


    // $ANTLR start "rule__HwProcessor__UnorderedGroup_3_0__0"
    // InternalMarText.g:1375:1: rule__HwProcessor__UnorderedGroup_3_0__0 : rule__HwProcessor__UnorderedGroup_3_0__Impl ( rule__HwProcessor__UnorderedGroup_3_0__1 )? ;
    public final void rule__HwProcessor__UnorderedGroup_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarText.g:1379:1: ( rule__HwProcessor__UnorderedGroup_3_0__Impl ( rule__HwProcessor__UnorderedGroup_3_0__1 )? )
            // InternalMarText.g:1380:2: rule__HwProcessor__UnorderedGroup_3_0__Impl ( rule__HwProcessor__UnorderedGroup_3_0__1 )?
            {
            pushFollow(FOLLOW_14);
            rule__HwProcessor__UnorderedGroup_3_0__Impl();

            state._fsp--;

            // InternalMarText.g:1381:2: ( rule__HwProcessor__UnorderedGroup_3_0__1 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( LA13_0 == 13 && getUnorderedGroupHelper().canSelect(grammarAccess.getHwProcessorAccess().getUnorderedGroup_3_0(), 0) ) {
                alt13=1;
            }
            else if ( LA13_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getHwProcessorAccess().getUnorderedGroup_3_0(), 1) ) {
                alt13=1;
            }
            else if ( (LA13_0==14) ) {
                int LA13_3 = input.LA(2);

                if ( getUnorderedGroupHelper().canSelect(grammarAccess.getHwProcessorAccess().getUnorderedGroup_3_0(), 1) ) {
                    alt13=1;
                }
            }
            switch (alt13) {
                case 1 :
                    // InternalMarText.g:1381:2: rule__HwProcessor__UnorderedGroup_3_0__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__HwProcessor__UnorderedGroup_3_0__1();

                    state._fsp--;


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
    // $ANTLR end "rule__HwProcessor__UnorderedGroup_3_0__0"


    // $ANTLR start "rule__HwProcessor__UnorderedGroup_3_0__1"
    // InternalMarText.g:1387:1: rule__HwProcessor__UnorderedGroup_3_0__1 : rule__HwProcessor__UnorderedGroup_3_0__Impl ;
    public final void rule__HwProcessor__UnorderedGroup_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarText.g:1391:1: ( rule__HwProcessor__UnorderedGroup_3_0__Impl )
            // InternalMarText.g:1392:2: rule__HwProcessor__UnorderedGroup_3_0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HwProcessor__UnorderedGroup_3_0__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__HwProcessor__UnorderedGroup_3_0__1"


    // $ANTLR start "rule__Model__NameAssignment_2"
    // InternalMarText.g:1399:1: rule__Model__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Model__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarText.g:1403:1: ( ( RULE_ID ) )
            // InternalMarText.g:1404:2: ( RULE_ID )
            {
            // InternalMarText.g:1404:2: ( RULE_ID )
            // InternalMarText.g:1405:3: RULE_ID
            {
             before(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_2_0()); 

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


    // $ANTLR start "rule__Model__PackagedElementAssignment_3_0_1"
    // InternalMarText.g:1414:1: rule__Model__PackagedElementAssignment_3_0_1 : ( ruleComponent ) ;
    public final void rule__Model__PackagedElementAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarText.g:1418:1: ( ( ruleComponent ) )
            // InternalMarText.g:1419:2: ( ruleComponent )
            {
            // InternalMarText.g:1419:2: ( ruleComponent )
            // InternalMarText.g:1420:3: ruleComponent
            {
             before(grammarAccess.getModelAccess().getPackagedElementComponentParserRuleCall_3_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getModelAccess().getPackagedElementComponentParserRuleCall_3_0_1_0()); 

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
    // $ANTLR end "rule__Model__PackagedElementAssignment_3_0_1"


    // $ANTLR start "rule__Component__NameAssignment_2_2"
    // InternalMarText.g:1429:1: rule__Component__NameAssignment_2_2 : ( RULE_ID ) ;
    public final void rule__Component__NameAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarText.g:1433:1: ( ( RULE_ID ) )
            // InternalMarText.g:1434:2: ( RULE_ID )
            {
            // InternalMarText.g:1434:2: ( RULE_ID )
            // InternalMarText.g:1435:3: RULE_ID
            {
             before(grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_2_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_2_2_0()); 

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
    // $ANTLR end "rule__Component__NameAssignment_2_2"


    // $ANTLR start "rule__Component__PackagedElementAssignment_2_3_0_1"
    // InternalMarText.g:1444:1: rule__Component__PackagedElementAssignment_2_3_0_1 : ( ruleComponent ) ;
    public final void rule__Component__PackagedElementAssignment_2_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarText.g:1448:1: ( ( ruleComponent ) )
            // InternalMarText.g:1449:2: ( ruleComponent )
            {
            // InternalMarText.g:1449:2: ( ruleComponent )
            // InternalMarText.g:1450:3: ruleComponent
            {
             before(grammarAccess.getComponentAccess().getPackagedElementComponentParserRuleCall_2_3_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getPackagedElementComponentParserRuleCall_2_3_0_1_0()); 

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
    // $ANTLR end "rule__Component__PackagedElementAssignment_2_3_0_1"


    // $ANTLR start "rule__HwProcessor__NameAssignment_2"
    // InternalMarText.g:1459:1: rule__HwProcessor__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__HwProcessor__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarText.g:1463:1: ( ( RULE_ID ) )
            // InternalMarText.g:1464:2: ( RULE_ID )
            {
            // InternalMarText.g:1464:2: ( RULE_ID )
            // InternalMarText.g:1465:3: RULE_ID
            {
             before(grammarAccess.getHwProcessorAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getHwProcessorAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__HwProcessor__NameAssignment_2"


    // $ANTLR start "rule__HwProcessor__NbCoresAssignment_3_0_0_1_1"
    // InternalMarText.g:1474:1: rule__HwProcessor__NbCoresAssignment_3_0_0_1_1 : ( RULE_INT ) ;
    public final void rule__HwProcessor__NbCoresAssignment_3_0_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarText.g:1478:1: ( ( RULE_INT ) )
            // InternalMarText.g:1479:2: ( RULE_INT )
            {
            // InternalMarText.g:1479:2: ( RULE_INT )
            // InternalMarText.g:1480:3: RULE_INT
            {
             before(grammarAccess.getHwProcessorAccess().getNbCoresINTTerminalRuleCall_3_0_0_1_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getHwProcessorAccess().getNbCoresINTTerminalRuleCall_3_0_0_1_1_0()); 

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
    // $ANTLR end "rule__HwProcessor__NbCoresAssignment_3_0_0_1_1"


    // $ANTLR start "rule__HwProcessor__PackagedElementAssignment_3_0_1_0_2"
    // InternalMarText.g:1489:1: rule__HwProcessor__PackagedElementAssignment_3_0_1_0_2 : ( ruleComponent ) ;
    public final void rule__HwProcessor__PackagedElementAssignment_3_0_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarText.g:1493:1: ( ( ruleComponent ) )
            // InternalMarText.g:1494:2: ( ruleComponent )
            {
            // InternalMarText.g:1494:2: ( ruleComponent )
            // InternalMarText.g:1495:3: ruleComponent
            {
             before(grammarAccess.getHwProcessorAccess().getPackagedElementComponentParserRuleCall_3_0_1_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getHwProcessorAccess().getPackagedElementComponentParserRuleCall_3_0_1_0_2_0()); 

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
    // $ANTLR end "rule__HwProcessor__PackagedElementAssignment_3_0_1_0_2"


    // $ANTLR start "rule__HwCache__NameAssignment_2"
    // InternalMarText.g:1504:1: rule__HwCache__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__HwCache__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarText.g:1508:1: ( ( RULE_ID ) )
            // InternalMarText.g:1509:2: ( RULE_ID )
            {
            // InternalMarText.g:1509:2: ( RULE_ID )
            // InternalMarText.g:1510:3: RULE_ID
            {
             before(grammarAccess.getHwCacheAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getHwCacheAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__HwCache__NameAssignment_2"


    // $ANTLR start "rule__HwCache__LevelAssignment_3_0_1_1"
    // InternalMarText.g:1519:1: rule__HwCache__LevelAssignment_3_0_1_1 : ( RULE_INT ) ;
    public final void rule__HwCache__LevelAssignment_3_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMarText.g:1523:1: ( ( RULE_INT ) )
            // InternalMarText.g:1524:2: ( RULE_INT )
            {
            // InternalMarText.g:1524:2: ( RULE_INT )
            // InternalMarText.g:1525:3: RULE_INT
            {
             before(grammarAccess.getHwCacheAccess().getLevelINTTerminalRuleCall_3_0_1_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getHwCacheAccess().getLevelINTTerminalRuleCall_3_0_1_1_0()); 

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
    // $ANTLR end "rule__HwCache__LevelAssignment_3_0_1_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000009C000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000098002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000046800L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000046000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000046002L});

}

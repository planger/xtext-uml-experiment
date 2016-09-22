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

@SuppressWarnings("all")
public class InternalUmlRtTextParser extends AbstractInternalContentAssistParser {
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



    // $ANTLR start "entryRuleRoot"
    // InternalUmlRtText.g:53:1: entryRuleRoot : ruleRoot EOF ;
    public final void entryRuleRoot() throws RecognitionException {
        try {
            // InternalUmlRtText.g:54:1: ( ruleRoot EOF )
            // InternalUmlRtText.g:55:1: ruleRoot EOF
            {
             before(grammarAccess.getRootRule()); 
            pushFollow(FOLLOW_1);
            ruleRoot();

            state._fsp--;

             after(grammarAccess.getRootRule()); 
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
    // $ANTLR end "entryRuleRoot"


    // $ANTLR start "ruleRoot"
    // InternalUmlRtText.g:62:1: ruleRoot : ( ( rule__Root__Group__0 ) ) ;
    public final void ruleRoot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlRtText.g:66:2: ( ( ( rule__Root__Group__0 ) ) )
            // InternalUmlRtText.g:67:2: ( ( rule__Root__Group__0 ) )
            {
            // InternalUmlRtText.g:67:2: ( ( rule__Root__Group__0 ) )
            // InternalUmlRtText.g:68:3: ( rule__Root__Group__0 )
            {
             before(grammarAccess.getRootAccess().getGroup()); 
            // InternalUmlRtText.g:69:3: ( rule__Root__Group__0 )
            // InternalUmlRtText.g:69:4: rule__Root__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Root__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRootAccess().getGroup()); 

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
    // $ANTLR end "ruleRoot"


    // $ANTLR start "entryRuleElement"
    // InternalUmlRtText.g:78:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // InternalUmlRtText.g:79:1: ( ruleElement EOF )
            // InternalUmlRtText.g:80:1: ruleElement EOF
            {
             before(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getElementRule()); 
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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalUmlRtText.g:87:1: ruleElement : ( ruleProtocol ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlRtText.g:91:2: ( ( ruleProtocol ) )
            // InternalUmlRtText.g:92:2: ( ruleProtocol )
            {
            // InternalUmlRtText.g:92:2: ( ruleProtocol )
            // InternalUmlRtText.g:93:3: ruleProtocol
            {
             before(grammarAccess.getElementAccess().getProtocolParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleProtocol();

            state._fsp--;

             after(grammarAccess.getElementAccess().getProtocolParserRuleCall()); 

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
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleProtocol"
    // InternalUmlRtText.g:103:1: entryRuleProtocol : ruleProtocol EOF ;
    public final void entryRuleProtocol() throws RecognitionException {
        try {
            // InternalUmlRtText.g:104:1: ( ruleProtocol EOF )
            // InternalUmlRtText.g:105:1: ruleProtocol EOF
            {
             before(grammarAccess.getProtocolRule()); 
            pushFollow(FOLLOW_1);
            ruleProtocol();

            state._fsp--;

             after(grammarAccess.getProtocolRule()); 
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
    // $ANTLR end "entryRuleProtocol"


    // $ANTLR start "ruleProtocol"
    // InternalUmlRtText.g:112:1: ruleProtocol : ( ( rule__Protocol__Group__0 ) ) ;
    public final void ruleProtocol() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlRtText.g:116:2: ( ( ( rule__Protocol__Group__0 ) ) )
            // InternalUmlRtText.g:117:2: ( ( rule__Protocol__Group__0 ) )
            {
            // InternalUmlRtText.g:117:2: ( ( rule__Protocol__Group__0 ) )
            // InternalUmlRtText.g:118:3: ( rule__Protocol__Group__0 )
            {
             before(grammarAccess.getProtocolAccess().getGroup()); 
            // InternalUmlRtText.g:119:3: ( rule__Protocol__Group__0 )
            // InternalUmlRtText.g:119:4: rule__Protocol__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Protocol__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProtocolAccess().getGroup()); 

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


    // $ANTLR start "rule__Root__Group__0"
    // InternalUmlRtText.g:127:1: rule__Root__Group__0 : rule__Root__Group__0__Impl rule__Root__Group__1 ;
    public final void rule__Root__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlRtText.g:131:1: ( rule__Root__Group__0__Impl rule__Root__Group__1 )
            // InternalUmlRtText.g:132:2: rule__Root__Group__0__Impl rule__Root__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Root__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Root__Group__1();

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
    // $ANTLR end "rule__Root__Group__0"


    // $ANTLR start "rule__Root__Group__0__Impl"
    // InternalUmlRtText.g:139:1: rule__Root__Group__0__Impl : ( () ) ;
    public final void rule__Root__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlRtText.g:143:1: ( ( () ) )
            // InternalUmlRtText.g:144:1: ( () )
            {
            // InternalUmlRtText.g:144:1: ( () )
            // InternalUmlRtText.g:145:2: ()
            {
             before(grammarAccess.getRootAccess().getModelAction_0()); 
            // InternalUmlRtText.g:146:2: ()
            // InternalUmlRtText.g:146:3: 
            {
            }

             after(grammarAccess.getRootAccess().getModelAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__Group__0__Impl"


    // $ANTLR start "rule__Root__Group__1"
    // InternalUmlRtText.g:154:1: rule__Root__Group__1 : rule__Root__Group__1__Impl ;
    public final void rule__Root__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlRtText.g:158:1: ( rule__Root__Group__1__Impl )
            // InternalUmlRtText.g:159:2: rule__Root__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Root__Group__1__Impl();

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
    // $ANTLR end "rule__Root__Group__1"


    // $ANTLR start "rule__Root__Group__1__Impl"
    // InternalUmlRtText.g:165:1: rule__Root__Group__1__Impl : ( ( rule__Root__PackagedElementAssignment_1 )* ) ;
    public final void rule__Root__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlRtText.g:169:1: ( ( ( rule__Root__PackagedElementAssignment_1 )* ) )
            // InternalUmlRtText.g:170:1: ( ( rule__Root__PackagedElementAssignment_1 )* )
            {
            // InternalUmlRtText.g:170:1: ( ( rule__Root__PackagedElementAssignment_1 )* )
            // InternalUmlRtText.g:171:2: ( rule__Root__PackagedElementAssignment_1 )*
            {
             before(grammarAccess.getRootAccess().getPackagedElementAssignment_1()); 
            // InternalUmlRtText.g:172:2: ( rule__Root__PackagedElementAssignment_1 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalUmlRtText.g:172:3: rule__Root__PackagedElementAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Root__PackagedElementAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getRootAccess().getPackagedElementAssignment_1()); 

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
    // $ANTLR end "rule__Root__Group__1__Impl"


    // $ANTLR start "rule__Protocol__Group__0"
    // InternalUmlRtText.g:181:1: rule__Protocol__Group__0 : rule__Protocol__Group__0__Impl rule__Protocol__Group__1 ;
    public final void rule__Protocol__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlRtText.g:185:1: ( rule__Protocol__Group__0__Impl rule__Protocol__Group__1 )
            // InternalUmlRtText.g:186:2: rule__Protocol__Group__0__Impl rule__Protocol__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Protocol__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Protocol__Group__1();

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
    // $ANTLR end "rule__Protocol__Group__0"


    // $ANTLR start "rule__Protocol__Group__0__Impl"
    // InternalUmlRtText.g:193:1: rule__Protocol__Group__0__Impl : ( () ) ;
    public final void rule__Protocol__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlRtText.g:197:1: ( ( () ) )
            // InternalUmlRtText.g:198:1: ( () )
            {
            // InternalUmlRtText.g:198:1: ( () )
            // InternalUmlRtText.g:199:2: ()
            {
             before(grammarAccess.getProtocolAccess().getPackageAction_0()); 
            // InternalUmlRtText.g:200:2: ()
            // InternalUmlRtText.g:200:3: 
            {
            }

             after(grammarAccess.getProtocolAccess().getPackageAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Group__0__Impl"


    // $ANTLR start "rule__Protocol__Group__1"
    // InternalUmlRtText.g:208:1: rule__Protocol__Group__1 : rule__Protocol__Group__1__Impl rule__Protocol__Group__2 ;
    public final void rule__Protocol__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlRtText.g:212:1: ( rule__Protocol__Group__1__Impl rule__Protocol__Group__2 )
            // InternalUmlRtText.g:213:2: rule__Protocol__Group__1__Impl rule__Protocol__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Protocol__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Protocol__Group__2();

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
    // $ANTLR end "rule__Protocol__Group__1"


    // $ANTLR start "rule__Protocol__Group__1__Impl"
    // InternalUmlRtText.g:220:1: rule__Protocol__Group__1__Impl : ( 'protocol' ) ;
    public final void rule__Protocol__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlRtText.g:224:1: ( ( 'protocol' ) )
            // InternalUmlRtText.g:225:1: ( 'protocol' )
            {
            // InternalUmlRtText.g:225:1: ( 'protocol' )
            // InternalUmlRtText.g:226:2: 'protocol'
            {
             before(grammarAccess.getProtocolAccess().getProtocolKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getProtocolAccess().getProtocolKeyword_1()); 

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
    // $ANTLR end "rule__Protocol__Group__1__Impl"


    // $ANTLR start "rule__Protocol__Group__2"
    // InternalUmlRtText.g:235:1: rule__Protocol__Group__2 : rule__Protocol__Group__2__Impl rule__Protocol__Group__3 ;
    public final void rule__Protocol__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlRtText.g:239:1: ( rule__Protocol__Group__2__Impl rule__Protocol__Group__3 )
            // InternalUmlRtText.g:240:2: rule__Protocol__Group__2__Impl rule__Protocol__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Protocol__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Protocol__Group__3();

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
    // $ANTLR end "rule__Protocol__Group__2"


    // $ANTLR start "rule__Protocol__Group__2__Impl"
    // InternalUmlRtText.g:247:1: rule__Protocol__Group__2__Impl : ( ( rule__Protocol__NameAssignment_2 ) ) ;
    public final void rule__Protocol__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlRtText.g:251:1: ( ( ( rule__Protocol__NameAssignment_2 ) ) )
            // InternalUmlRtText.g:252:1: ( ( rule__Protocol__NameAssignment_2 ) )
            {
            // InternalUmlRtText.g:252:1: ( ( rule__Protocol__NameAssignment_2 ) )
            // InternalUmlRtText.g:253:2: ( rule__Protocol__NameAssignment_2 )
            {
             before(grammarAccess.getProtocolAccess().getNameAssignment_2()); 
            // InternalUmlRtText.g:254:2: ( rule__Protocol__NameAssignment_2 )
            // InternalUmlRtText.g:254:3: rule__Protocol__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Protocol__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getProtocolAccess().getNameAssignment_2()); 

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


    // $ANTLR start "rule__Protocol__Group__3"
    // InternalUmlRtText.g:262:1: rule__Protocol__Group__3 : rule__Protocol__Group__3__Impl rule__Protocol__Group__4 ;
    public final void rule__Protocol__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlRtText.g:266:1: ( rule__Protocol__Group__3__Impl rule__Protocol__Group__4 )
            // InternalUmlRtText.g:267:2: rule__Protocol__Group__3__Impl rule__Protocol__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Protocol__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Protocol__Group__4();

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
    // $ANTLR end "rule__Protocol__Group__3"


    // $ANTLR start "rule__Protocol__Group__3__Impl"
    // InternalUmlRtText.g:274:1: rule__Protocol__Group__3__Impl : ( '{' ) ;
    public final void rule__Protocol__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlRtText.g:278:1: ( ( '{' ) )
            // InternalUmlRtText.g:279:1: ( '{' )
            {
            // InternalUmlRtText.g:279:1: ( '{' )
            // InternalUmlRtText.g:280:2: '{'
            {
             before(grammarAccess.getProtocolAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getProtocolAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Protocol__Group__3__Impl"


    // $ANTLR start "rule__Protocol__Group__4"
    // InternalUmlRtText.g:289:1: rule__Protocol__Group__4 : rule__Protocol__Group__4__Impl ;
    public final void rule__Protocol__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlRtText.g:293:1: ( rule__Protocol__Group__4__Impl )
            // InternalUmlRtText.g:294:2: rule__Protocol__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Protocol__Group__4__Impl();

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
    // $ANTLR end "rule__Protocol__Group__4"


    // $ANTLR start "rule__Protocol__Group__4__Impl"
    // InternalUmlRtText.g:300:1: rule__Protocol__Group__4__Impl : ( '}' ) ;
    public final void rule__Protocol__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlRtText.g:304:1: ( ( '}' ) )
            // InternalUmlRtText.g:305:1: ( '}' )
            {
            // InternalUmlRtText.g:305:1: ( '}' )
            // InternalUmlRtText.g:306:2: '}'
            {
             before(grammarAccess.getProtocolAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getProtocolAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Protocol__Group__4__Impl"


    // $ANTLR start "rule__Root__PackagedElementAssignment_1"
    // InternalUmlRtText.g:316:1: rule__Root__PackagedElementAssignment_1 : ( ruleElement ) ;
    public final void rule__Root__PackagedElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlRtText.g:320:1: ( ( ruleElement ) )
            // InternalUmlRtText.g:321:2: ( ruleElement )
            {
            // InternalUmlRtText.g:321:2: ( ruleElement )
            // InternalUmlRtText.g:322:3: ruleElement
            {
             before(grammarAccess.getRootAccess().getPackagedElementElementParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getRootAccess().getPackagedElementElementParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Root__PackagedElementAssignment_1"


    // $ANTLR start "rule__Protocol__NameAssignment_2"
    // InternalUmlRtText.g:331:1: rule__Protocol__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Protocol__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlRtText.g:335:1: ( ( RULE_ID ) )
            // InternalUmlRtText.g:336:2: ( RULE_ID )
            {
            // InternalUmlRtText.g:336:2: ( RULE_ID )
            // InternalUmlRtText.g:337:3: RULE_ID
            {
             before(grammarAccess.getProtocolAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getProtocolAccess().getNameIDTerminalRuleCall_2_0()); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});

}
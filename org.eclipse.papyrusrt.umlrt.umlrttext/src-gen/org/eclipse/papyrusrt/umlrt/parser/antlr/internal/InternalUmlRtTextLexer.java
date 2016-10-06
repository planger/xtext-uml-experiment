package org.eclipse.papyrusrt.umlrt.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalUmlRtTextLexer extends Lexer {
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

    public InternalUmlRtTextLexer() {;} 
    public InternalUmlRtTextLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalUmlRtTextLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalUmlRtText.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUmlRtText.g:11:7: ( 'model' )
            // InternalUmlRtText.g:11:9: 'model'
            {
            match("model"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUmlRtText.g:12:7: ( '{' )
            // InternalUmlRtText.g:12:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUmlRtText.g:13:7: ( '}' )
            // InternalUmlRtText.g:13:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUmlRtText.g:14:7: ( 'Class' )
            // InternalUmlRtText.g:14:9: 'Class'
            {
            match("Class"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUmlRtText.g:15:7: ( 'RedefinableElement' )
            // InternalUmlRtText.g:15:9: 'RedefinableElement'
            {
            match("RedefinableElement"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUmlRtText.g:16:7: ( 'Package' )
            // InternalUmlRtText.g:16:9: 'Package'
            {
            match("Package"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUmlRtText.g:17:7: ( 'Capsule' )
            // InternalUmlRtText.g:17:9: 'Capsule'
            {
            match("Capsule"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUmlRtText.g:18:7: ( 'CapsulePart' )
            // InternalUmlRtText.g:18:9: 'CapsulePart'
            {
            match("CapsulePart"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUmlRtText.g:19:7: ( 'IsNotification' )
            // InternalUmlRtText.g:19:9: 'IsNotification'
            {
            match("IsNotification"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUmlRtText.g:20:7: ( 'IsPublish' )
            // InternalUmlRtText.g:20:9: 'IsPublish'
            {
            match("IsPublish"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUmlRtText.g:21:7: ( 'IsWired' )
            // InternalUmlRtText.g:21:9: 'IsWired'
            {
            match("IsWired"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUmlRtText.g:22:7: ( 'Registration' )
            // InternalUmlRtText.g:22:9: 'Registration'
            {
            match("Registration"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUmlRtText.g:23:7: ( 'RegistrationOverride' )
            // InternalUmlRtText.g:23:9: 'RegistrationOverride'
            {
            match("RegistrationOverride"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUmlRtText.g:24:7: ( 'Protocol' )
            // InternalUmlRtText.g:24:9: 'Protocol'
            {
            match("Protocol"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUmlRtText.g:25:7: ( 'RTPort' )
            // InternalUmlRtText.g:25:9: 'RTPort'
            {
            match("RTPort"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUmlRtText.g:26:7: ( 'RTConnector' )
            // InternalUmlRtText.g:26:9: 'RTConnector'
            {
            match("RTConnector"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUmlRtText.g:27:7: ( 'ProtocolContainer' )
            // InternalUmlRtText.g:27:9: 'ProtocolContainer'
            {
            match("ProtocolContainer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUmlRtText.g:28:7: ( 'RTRedefinedElement' )
            // InternalUmlRtText.g:28:9: 'RTRedefinedElement'
            {
            match("RTRedefinedElement"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUmlRtText.g:29:7: ( 'RootFragment' )
            // InternalUmlRtText.g:29:9: 'RootFragment'
            {
            match("RootFragment"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUmlRtText.g:30:7: ( 'RTMessageSet' )
            // InternalUmlRtText.g:30:9: 'RTMessageSet'
            {
            match("RTMessageSet"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUmlRtText.g:31:7: ( 'RTMsgKind' )
            // InternalUmlRtText.g:31:9: 'RTMsgKind'
            {
            match("RTMsgKind"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUmlRtText.g:32:7: ( 'Automatic' )
            // InternalUmlRtText.g:32:9: 'Automatic'
            {
            match("Automatic"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUmlRtText.g:33:7: ( 'Application' )
            // InternalUmlRtText.g:33:9: 'Application'
            {
            match("Application"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUmlRtText.g:34:7: ( 'AutomaticLocked' )
            // InternalUmlRtText.g:34:9: 'AutomaticLocked'
            {
            match("AutomaticLocked"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUmlRtText.g:35:7: ( 'in' )
            // InternalUmlRtText.g:35:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUmlRtText.g:36:7: ( 'out' )
            // InternalUmlRtText.g:36:9: 'out'
            {
            match("out"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUmlRtText.g:37:7: ( 'inOut' )
            // InternalUmlRtText.g:37:9: 'inOut'
            {
            match("inOut"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "RULE_UML_BOOLEAN"
    public final void mRULE_UML_BOOLEAN() throws RecognitionException {
        try {
            int _type = RULE_UML_BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUmlRtText.g:1038:18: ( ( 'true' | 'false' ) )
            // InternalUmlRtText.g:1038:20: ( 'true' | 'false' )
            {
            // InternalUmlRtText.g:1038:20: ( 'true' | 'false' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='t') ) {
                alt1=1;
            }
            else if ( (LA1_0=='f') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalUmlRtText.g:1038:21: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalUmlRtText.g:1038:28: 'false'
                    {
                    match("false"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_UML_BOOLEAN"

    // $ANTLR start "RULE_UML_STRING"
    public final void mRULE_UML_STRING() throws RecognitionException {
        try {
            int _type = RULE_UML_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUmlRtText.g:1040:17: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalUmlRtText.g:1040:19: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalUmlRtText.g:1040:19: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\"') ) {
                alt4=1;
            }
            else if ( (LA4_0=='\'') ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalUmlRtText.g:1040:20: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalUmlRtText.g:1040:24: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop2:
                    do {
                        int alt2=3;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0=='\\') ) {
                            alt2=1;
                        }
                        else if ( ((LA2_0>='\u0000' && LA2_0<='!')||(LA2_0>='#' && LA2_0<='[')||(LA2_0>=']' && LA2_0<='\uFFFF')) ) {
                            alt2=2;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalUmlRtText.g:1040:25: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalUmlRtText.g:1040:32: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalUmlRtText.g:1040:52: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalUmlRtText.g:1040:57: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop3:
                    do {
                        int alt3=3;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0=='\\') ) {
                            alt3=1;
                        }
                        else if ( ((LA3_0>='\u0000' && LA3_0<='&')||(LA3_0>='(' && LA3_0<='[')||(LA3_0>=']' && LA3_0<='\uFFFF')) ) {
                            alt3=2;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalUmlRtText.g:1040:58: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalUmlRtText.g:1040:65: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_UML_STRING"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUmlRtText.g:1042:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalUmlRtText.g:1042:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalUmlRtText.g:1042:11: ( '^' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='^') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalUmlRtText.g:1042:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalUmlRtText.g:1042:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalUmlRtText.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUmlRtText.g:1044:10: ( ( '0' .. '9' )+ )
            // InternalUmlRtText.g:1044:12: ( '0' .. '9' )+
            {
            // InternalUmlRtText.g:1044:12: ( '0' .. '9' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalUmlRtText.g:1044:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUmlRtText.g:1046:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalUmlRtText.g:1046:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalUmlRtText.g:1046:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\"') ) {
                alt10=1;
            }
            else if ( (LA10_0=='\'') ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalUmlRtText.g:1046:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalUmlRtText.g:1046:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='!')||(LA8_0>='#' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalUmlRtText.g:1046:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalUmlRtText.g:1046:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalUmlRtText.g:1046:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalUmlRtText.g:1046:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop9:
                    do {
                        int alt9=3;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='\\') ) {
                            alt9=1;
                        }
                        else if ( ((LA9_0>='\u0000' && LA9_0<='&')||(LA9_0>='(' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFF')) ) {
                            alt9=2;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalUmlRtText.g:1046:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalUmlRtText.g:1046:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUmlRtText.g:1048:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalUmlRtText.g:1048:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalUmlRtText.g:1048:24: ( options {greedy=false; } : . )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='*') ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1=='/') ) {
                        alt11=2;
                    }
                    else if ( ((LA11_1>='\u0000' && LA11_1<='.')||(LA11_1>='0' && LA11_1<='\uFFFF')) ) {
                        alt11=1;
                    }


                }
                else if ( ((LA11_0>='\u0000' && LA11_0<=')')||(LA11_0>='+' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalUmlRtText.g:1048:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUmlRtText.g:1050:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalUmlRtText.g:1050:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalUmlRtText.g:1050:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\u0000' && LA12_0<='\t')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalUmlRtText.g:1050:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // InternalUmlRtText.g:1050:40: ( ( '\\r' )? '\\n' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\n'||LA14_0=='\r') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalUmlRtText.g:1050:41: ( '\\r' )? '\\n'
                    {
                    // InternalUmlRtText.g:1050:41: ( '\\r' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='\r') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalUmlRtText.g:1050:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUmlRtText.g:1052:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalUmlRtText.g:1052:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalUmlRtText.g:1052:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalUmlRtText.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUmlRtText.g:1054:16: ( . )
            // InternalUmlRtText.g:1054:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalUmlRtText.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | RULE_UML_BOOLEAN | RULE_UML_STRING | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt16=36;
        alt16 = dfa16.predict(input);
        switch (alt16) {
            case 1 :
                // InternalUmlRtText.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // InternalUmlRtText.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // InternalUmlRtText.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // InternalUmlRtText.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // InternalUmlRtText.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // InternalUmlRtText.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // InternalUmlRtText.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // InternalUmlRtText.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // InternalUmlRtText.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // InternalUmlRtText.g:1:64: T__22
                {
                mT__22(); 

                }
                break;
            case 11 :
                // InternalUmlRtText.g:1:70: T__23
                {
                mT__23(); 

                }
                break;
            case 12 :
                // InternalUmlRtText.g:1:76: T__24
                {
                mT__24(); 

                }
                break;
            case 13 :
                // InternalUmlRtText.g:1:82: T__25
                {
                mT__25(); 

                }
                break;
            case 14 :
                // InternalUmlRtText.g:1:88: T__26
                {
                mT__26(); 

                }
                break;
            case 15 :
                // InternalUmlRtText.g:1:94: T__27
                {
                mT__27(); 

                }
                break;
            case 16 :
                // InternalUmlRtText.g:1:100: T__28
                {
                mT__28(); 

                }
                break;
            case 17 :
                // InternalUmlRtText.g:1:106: T__29
                {
                mT__29(); 

                }
                break;
            case 18 :
                // InternalUmlRtText.g:1:112: T__30
                {
                mT__30(); 

                }
                break;
            case 19 :
                // InternalUmlRtText.g:1:118: T__31
                {
                mT__31(); 

                }
                break;
            case 20 :
                // InternalUmlRtText.g:1:124: T__32
                {
                mT__32(); 

                }
                break;
            case 21 :
                // InternalUmlRtText.g:1:130: T__33
                {
                mT__33(); 

                }
                break;
            case 22 :
                // InternalUmlRtText.g:1:136: T__34
                {
                mT__34(); 

                }
                break;
            case 23 :
                // InternalUmlRtText.g:1:142: T__35
                {
                mT__35(); 

                }
                break;
            case 24 :
                // InternalUmlRtText.g:1:148: T__36
                {
                mT__36(); 

                }
                break;
            case 25 :
                // InternalUmlRtText.g:1:154: T__37
                {
                mT__37(); 

                }
                break;
            case 26 :
                // InternalUmlRtText.g:1:160: T__38
                {
                mT__38(); 

                }
                break;
            case 27 :
                // InternalUmlRtText.g:1:166: T__39
                {
                mT__39(); 

                }
                break;
            case 28 :
                // InternalUmlRtText.g:1:172: RULE_UML_BOOLEAN
                {
                mRULE_UML_BOOLEAN(); 

                }
                break;
            case 29 :
                // InternalUmlRtText.g:1:189: RULE_UML_STRING
                {
                mRULE_UML_STRING(); 

                }
                break;
            case 30 :
                // InternalUmlRtText.g:1:205: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 31 :
                // InternalUmlRtText.g:1:213: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 32 :
                // InternalUmlRtText.g:1:222: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 33 :
                // InternalUmlRtText.g:1:234: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 34 :
                // InternalUmlRtText.g:1:250: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 35 :
                // InternalUmlRtText.g:1:266: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 36 :
                // InternalUmlRtText.g:1:274: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA16_eotS =
        "\1\uffff\1\26\2\uffff\11\26\3\24\2\uffff\1\24\2\uffff\1\26\3\uffff\12\26\1\103\3\26\12\uffff\22\26\1\uffff\1\135\2\26\3\uffff\23\26\1\uffff\1\163\1\26\1\165\1\166\20\26\1\u0087\1\uffff\1\163\2\uffff\3\26\1\u008b\14\26\1\uffff\1\u0099\2\26\1\uffff\5\26\1\u00a1\3\26\1\u00a5\3\26\1\uffff\7\26\1\uffff\1\u00b1\2\26\1\uffff\10\26\1\u00bc\2\26\1\uffff\1\26\1\u00c0\1\u00c2\7\26\1\uffff\3\26\1\uffff\1\26\1\uffff\1\26\1\u00cf\2\26\1\u00d2\6\26\1\u00d9\1\uffff\1\26\1\u00dc\1\uffff\1\26\1\u00de\1\u00df\3\26\1\uffff\2\26\1\uffff\1\26\2\uffff\7\26\1\u00ed\5\26\1\uffff\1\u00f3\4\26\1\uffff\3\26\1\u00fb\1\u00fc\1\26\1\u00fe\2\uffff\1\26\1\uffff\1\u0100\1\uffff";
    static final String DFA16_eofS =
        "\u0101\uffff";
    static final String DFA16_minS =
        "\1\0\1\157\2\uffff\1\141\1\124\1\141\1\163\1\160\1\156\1\165\1\162\1\141\2\0\1\101\2\uffff\1\52\2\uffff\1\144\3\uffff\1\141\1\160\1\144\1\103\1\157\1\143\1\157\1\116\1\164\1\160\1\60\1\164\1\165\1\154\2\0\1\uffff\2\0\5\uffff\1\145\2\163\1\145\1\151\2\157\2\145\1\164\1\153\1\164\1\157\1\165\1\151\1\157\1\154\1\165\1\uffff\1\60\1\145\1\163\1\0\1\uffff\1\0\1\154\1\163\1\165\1\146\1\163\1\162\1\156\1\144\1\163\1\147\1\106\1\141\1\157\1\164\1\142\1\162\1\155\1\151\1\164\1\uffff\1\60\1\145\2\60\1\154\1\151\2\164\1\156\1\145\1\163\1\113\1\162\1\147\1\143\1\151\1\154\1\145\1\141\1\143\1\60\1\uffff\1\60\2\uffff\1\145\1\156\1\162\1\60\1\145\1\146\1\141\1\151\1\141\1\145\1\157\1\146\1\151\1\144\1\164\1\141\1\uffff\1\60\2\141\1\uffff\1\143\1\151\1\147\1\156\1\147\1\60\1\154\1\151\1\163\1\60\1\151\1\164\1\141\1\uffff\1\142\2\164\1\156\1\145\1\144\1\155\1\uffff\1\60\1\143\1\150\1\uffff\1\143\1\151\1\162\1\154\1\151\1\157\1\145\1\123\1\60\1\145\1\157\1\uffff\1\141\2\60\1\157\1\164\1\145\1\157\1\162\1\144\1\145\1\uffff\2\156\1\164\1\uffff\1\157\1\uffff\1\156\1\60\1\105\1\156\1\60\1\105\3\164\1\151\1\143\1\60\1\uffff\1\154\1\60\1\uffff\1\154\2\60\1\141\1\157\1\153\1\uffff\1\145\1\166\1\uffff\1\145\2\uffff\1\151\1\156\1\145\1\155\1\145\1\155\1\156\1\60\1\144\1\145\1\162\2\145\1\uffff\1\60\1\156\1\162\1\156\1\162\1\uffff\1\164\1\151\1\164\2\60\1\144\1\60\2\uffff\1\145\1\uffff\1\60\1\uffff";
    static final String DFA16_maxS =
        "\1\uffff\1\157\2\uffff\1\154\1\157\1\162\1\163\1\165\1\156\1\165\1\162\1\141\2\uffff\1\172\2\uffff\1\57\2\uffff\1\144\3\uffff\1\141\1\160\1\147\1\122\1\157\1\143\1\157\1\127\1\164\1\160\1\172\1\164\1\165\1\154\2\uffff\1\uffff\2\uffff\5\uffff\1\145\2\163\1\145\1\151\2\157\1\145\1\163\1\164\1\153\1\164\1\157\1\165\1\151\1\157\1\154\1\165\1\uffff\1\172\1\145\1\163\1\uffff\1\uffff\1\uffff\1\154\1\163\1\165\1\146\1\163\1\162\1\156\1\144\1\163\1\147\1\106\1\141\1\157\1\164\1\142\1\162\1\155\1\151\1\164\1\uffff\1\172\1\145\2\172\1\154\1\151\2\164\1\156\1\145\1\163\1\113\1\162\1\147\1\143\1\151\1\154\1\145\1\141\1\143\1\172\1\uffff\1\172\2\uffff\1\145\1\156\1\162\1\172\1\145\1\146\1\141\1\151\1\141\1\145\1\157\1\146\1\151\1\144\1\164\1\141\1\uffff\1\172\2\141\1\uffff\1\143\1\151\1\147\1\156\1\147\1\172\1\154\1\151\1\163\1\172\1\151\1\164\1\141\1\uffff\1\142\2\164\1\156\1\145\1\144\1\155\1\uffff\1\172\1\143\1\150\1\uffff\1\143\1\151\1\162\1\154\1\151\1\157\1\145\1\123\1\172\1\145\1\157\1\uffff\1\141\2\172\1\157\1\164\1\145\1\157\1\162\1\144\1\145\1\uffff\2\156\1\164\1\uffff\1\157\1\uffff\1\156\1\172\1\105\1\156\1\172\1\105\3\164\1\151\1\143\1\172\1\uffff\1\154\1\172\1\uffff\1\154\2\172\1\141\1\157\1\153\1\uffff\1\145\1\166\1\uffff\1\145\2\uffff\1\151\1\156\1\145\1\155\1\145\1\155\1\156\1\172\1\144\1\145\1\162\2\145\1\uffff\1\172\1\156\1\162\1\156\1\162\1\uffff\1\164\1\151\1\164\2\172\1\144\1\172\2\uffff\1\145\1\uffff\1\172\1\uffff";
    static final String DFA16_acceptS =
        "\2\uffff\1\2\1\3\14\uffff\1\36\1\37\1\uffff\1\43\1\44\1\uffff\1\36\1\2\1\3\20\uffff\1\35\2\uffff\1\35\1\37\1\41\1\42\1\43\22\uffff\1\31\4\uffff\1\35\24\uffff\1\32\25\uffff\1\34\1\uffff\1\1\1\4\20\uffff\1\33\3\uffff\1\17\15\uffff\1\7\7\uffff\1\6\3\uffff\1\13\13\uffff\1\16\12\uffff\1\25\3\uffff\1\12\1\uffff\1\26\14\uffff\1\10\2\uffff\1\20\6\uffff\1\27\2\uffff\1\14\1\uffff\1\24\1\23\15\uffff\1\11\5\uffff\1\30\7\uffff\1\21\1\5\1\uffff\1\22\1\uffff\1\15";
    static final String DFA16_specialS =
        "\1\3\14\uffff\1\5\1\2\30\uffff\1\4\1\10\1\uffff\1\7\1\1\33\uffff\1\6\1\uffff\1\0\u00b7\uffff}>";
    static final String[] DFA16_transitionS = {
            "\11\24\2\23\2\24\1\23\22\24\1\23\1\24\1\15\4\24\1\16\7\24\1\22\12\21\7\24\1\10\1\20\1\4\5\20\1\7\6\20\1\6\1\20\1\5\10\20\3\24\1\17\1\20\1\24\5\20\1\14\2\20\1\11\3\20\1\1\1\20\1\12\4\20\1\13\6\20\1\2\1\24\1\3\uff82\24",
            "\1\25",
            "",
            "",
            "\1\32\12\uffff\1\31",
            "\1\34\20\uffff\1\33\11\uffff\1\35",
            "\1\36\20\uffff\1\37",
            "\1\40",
            "\1\42\4\uffff\1\41",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "\42\50\1\51\71\50\1\47\uffa3\50",
            "\47\53\1\54\64\53\1\52\uffa3\53",
            "\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "",
            "\1\56\4\uffff\1\57",
            "",
            "",
            "\1\61",
            "",
            "",
            "",
            "\1\62",
            "\1\63",
            "\1\64\2\uffff\1\65",
            "\1\67\11\uffff\1\71\2\uffff\1\66\1\uffff\1\70",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75\1\uffff\1\76\6\uffff\1\77",
            "\1\100",
            "\1\101",
            "\12\26\7\uffff\16\26\1\102\13\26\4\uffff\1\26\1\uffff\32\26",
            "\1\104",
            "\1\105",
            "\1\106",
            "\0\107",
            "\42\50\1\51\71\50\1\47\uffa3\50",
            "",
            "\0\111",
            "\47\53\1\54\64\53\1\52\uffa3\53",
            "",
            "",
            "",
            "",
            "",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122\15\uffff\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\136",
            "\1\137",
            "\42\50\1\51\71\50\1\47\uffa3\50",
            "",
            "\47\53\1\54\64\53\1\52\uffa3\53",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\164",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "",
            "\12\26\7\uffff\17\26\1\u0098\12\26\4\uffff\1\26\1\uffff\32\26",
            "\1\u009a",
            "\1\u009b",
            "",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "",
            "\12\26\7\uffff\2\26\1\u00b0\27\26\4\uffff\1\26\1\uffff\32\26",
            "\1\u00b2",
            "\1\u00b3",
            "",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\u00bd",
            "\1\u00be",
            "",
            "\1\u00bf",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\26\7\uffff\13\26\1\u00c1\16\26\4\uffff\1\26\1\uffff\32\26",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "",
            "\1\u00cd",
            "",
            "\1\u00ce",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\u00d0",
            "\1\u00d1",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "\1\u00da",
            "\12\26\7\uffff\16\26\1\u00db\13\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "\1\u00dd",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "",
            "\1\u00e3",
            "\1\u00e4",
            "",
            "\1\u00e5",
            "",
            "",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\u00fd",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "",
            "\1\u00ff",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | RULE_UML_BOOLEAN | RULE_UML_STRING | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_73 = input.LA(1);

                        s = -1;
                        if ( (LA16_73=='\'') ) {s = 44;}

                        else if ( (LA16_73=='\\') ) {s = 42;}

                        else if ( ((LA16_73>='\u0000' && LA16_73<='&')||(LA16_73>='(' && LA16_73<='[')||(LA16_73>=']' && LA16_73<='\uFFFF')) ) {s = 43;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA16_43 = input.LA(1);

                        s = -1;
                        if ( (LA16_43=='\'') ) {s = 44;}

                        else if ( (LA16_43=='\\') ) {s = 42;}

                        else if ( ((LA16_43>='\u0000' && LA16_43<='&')||(LA16_43>='(' && LA16_43<='[')||(LA16_43>=']' && LA16_43<='\uFFFF')) ) {s = 43;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA16_14 = input.LA(1);

                        s = -1;
                        if ( (LA16_14=='\\') ) {s = 42;}

                        else if ( ((LA16_14>='\u0000' && LA16_14<='&')||(LA16_14>='(' && LA16_14<='[')||(LA16_14>=']' && LA16_14<='\uFFFF')) ) {s = 43;}

                        else if ( (LA16_14=='\'') ) {s = 44;}

                        else s = 20;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA16_0 = input.LA(1);

                        s = -1;
                        if ( (LA16_0=='m') ) {s = 1;}

                        else if ( (LA16_0=='{') ) {s = 2;}

                        else if ( (LA16_0=='}') ) {s = 3;}

                        else if ( (LA16_0=='C') ) {s = 4;}

                        else if ( (LA16_0=='R') ) {s = 5;}

                        else if ( (LA16_0=='P') ) {s = 6;}

                        else if ( (LA16_0=='I') ) {s = 7;}

                        else if ( (LA16_0=='A') ) {s = 8;}

                        else if ( (LA16_0=='i') ) {s = 9;}

                        else if ( (LA16_0=='o') ) {s = 10;}

                        else if ( (LA16_0=='t') ) {s = 11;}

                        else if ( (LA16_0=='f') ) {s = 12;}

                        else if ( (LA16_0=='\"') ) {s = 13;}

                        else if ( (LA16_0=='\'') ) {s = 14;}

                        else if ( (LA16_0=='^') ) {s = 15;}

                        else if ( (LA16_0=='B'||(LA16_0>='D' && LA16_0<='H')||(LA16_0>='J' && LA16_0<='O')||LA16_0=='Q'||(LA16_0>='S' && LA16_0<='Z')||LA16_0=='_'||(LA16_0>='a' && LA16_0<='e')||(LA16_0>='g' && LA16_0<='h')||(LA16_0>='j' && LA16_0<='l')||LA16_0=='n'||(LA16_0>='p' && LA16_0<='s')||(LA16_0>='u' && LA16_0<='z')) ) {s = 16;}

                        else if ( ((LA16_0>='0' && LA16_0<='9')) ) {s = 17;}

                        else if ( (LA16_0=='/') ) {s = 18;}

                        else if ( ((LA16_0>='\t' && LA16_0<='\n')||LA16_0=='\r'||LA16_0==' ') ) {s = 19;}

                        else if ( ((LA16_0>='\u0000' && LA16_0<='\b')||(LA16_0>='\u000B' && LA16_0<='\f')||(LA16_0>='\u000E' && LA16_0<='\u001F')||LA16_0=='!'||(LA16_0>='#' && LA16_0<='&')||(LA16_0>='(' && LA16_0<='.')||(LA16_0>=':' && LA16_0<='@')||(LA16_0>='[' && LA16_0<=']')||LA16_0=='`'||LA16_0=='|'||(LA16_0>='~' && LA16_0<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA16_39 = input.LA(1);

                        s = -1;
                        if ( ((LA16_39>='\u0000' && LA16_39<='\uFFFF')) ) {s = 71;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA16_13 = input.LA(1);

                        s = -1;
                        if ( (LA16_13=='\\') ) {s = 39;}

                        else if ( ((LA16_13>='\u0000' && LA16_13<='!')||(LA16_13>='#' && LA16_13<='[')||(LA16_13>=']' && LA16_13<='\uFFFF')) ) {s = 40;}

                        else if ( (LA16_13=='\"') ) {s = 41;}

                        else s = 20;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA16_71 = input.LA(1);

                        s = -1;
                        if ( (LA16_71=='\"') ) {s = 41;}

                        else if ( (LA16_71=='\\') ) {s = 39;}

                        else if ( ((LA16_71>='\u0000' && LA16_71<='!')||(LA16_71>='#' && LA16_71<='[')||(LA16_71>=']' && LA16_71<='\uFFFF')) ) {s = 40;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA16_42 = input.LA(1);

                        s = -1;
                        if ( ((LA16_42>='\u0000' && LA16_42<='\uFFFF')) ) {s = 73;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA16_40 = input.LA(1);

                        s = -1;
                        if ( (LA16_40=='\"') ) {s = 41;}

                        else if ( (LA16_40=='\\') ) {s = 39;}

                        else if ( ((LA16_40>='\u0000' && LA16_40<='!')||(LA16_40>='#' && LA16_40<='[')||(LA16_40>=']' && LA16_40<='\uFFFF')) ) {s = 40;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}
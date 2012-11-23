/*
 * xtc - The eXTensible Compiler
 * Copyright (C) 2004-2006 Robert Grimm
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * version 2 as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301,
 * USA.
 */

// $ANTLR 3.3-SNAPSHOT Oct 20, 2010 11:18:12 RatsJava.g 2010-10-22 15:14:56

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
/**
 * Java grammar with AST support.
 * 
 * @author Robert Grimm
 * @author Stacey Kuznetsov
 * @version $Revision: 1.13 $
 */
public class RatsJavaParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CTRLZ", "Identifier", "FloatingPointLiteral", "CharacterLiteral", "StringLiteral", "HexLiteral", "OctalLiteral", "DecimalLiteral", "HexDigit", "IntegerTypeSuffix", "Exponent", "FloatTypeSuffix", "EscapeSequence", "UnicodeEscape", "OctalEscape", "Letter", "JavaIDDigit", "WS", "COMMENT", "LINE_COMMENT", "'package'", "';'", "'import'", "'.'", "'*'", "'public'", "'protected'", "'private'", "'static'", "'abstract'", "'final'", "'native'", "'synchronized'", "'transient'", "'volatile'", "'strictfp'", "'('", "','", "')'", "'='", "'{'", "'}'", "'class'", "'interface'", "'throws'", "'extends'", "'implements'", "'if'", "'else'", "'for'", "'while'", "'do'", "'try'", "'finally'", "'catch'", "'switch'", "'case'", "':'", "'default'", "'return'", "'throw'", "'break'", "'continue'", "'assert'", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'^='", "'%='", "'<<='", "'>>='", "'>>>='", "'?'", "'||'", "'&&'", "'|'", "'^'", "'&'", "'=='", "'!='", "'instanceof'", "'<'", "'>'", "'<='", "'>='", "'<<'", "'>>'", "'>>>'", "'+'", "'-'", "'/'", "'%'", "'++'", "'--'", "'~'", "'!'", "'super'", "'['", "']'", "'new'", "'this'", "'void'", "'byte'", "'short'", "'char'", "'int'", "'long'", "'float'", "'double'", "'boolean'", "'true'", "'false'", "'null'"
    };
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int FloatTypeSuffix=15;
    public static final int T__25=25;
    public static final int OctalLiteral=10;
    public static final int T__24=24;
    public static final int EOF=-1;
    public static final int Identifier=5;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__90=90;
    public static final int COMMENT=22;
    public static final int T__99=99;
    public static final int T__98=98;
    public static final int T__97=97;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int LINE_COMMENT=23;
    public static final int IntegerTypeSuffix=13;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int WS=21;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int FloatingPointLiteral=6;
    public static final int JavaIDDigit=20;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int Letter=19;
    public static final int EscapeSequence=16;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__118=118;
    public static final int CharacterLiteral=7;
    public static final int T__119=119;
    public static final int T__116=116;
    public static final int T__117=117;
    public static final int T__114=114;
    public static final int T__115=115;
    public static final int Exponent=14;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int HexDigit=12;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int T__59=59;
    public static final int T__103=103;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__111=111;
    public static final int T__110=110;
    public static final int T__113=113;
    public static final int T__112=112;
    public static final int CTRLZ=4;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int HexLiteral=9;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__102=102;
    public static final int T__101=101;
    public static final int T__100=100;
    public static final int DecimalLiteral=11;
    public static final int StringLiteral=8;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int UnicodeEscape=17;
    public static final int OctalEscape=18;

    // delegates
    // delegators


        public RatsJavaParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public RatsJavaParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[280+1];
             
             
        }
        

    public String[] getTokenNames() { return RatsJavaParser.tokenNames; }
    public String getGrammarFileName() { return "RatsJava.g"; }



    // $ANTLR start "compilationUnit"
    // RatsJava.g:49:1: compilationUnit : ( packageDeclaration )? ( importDeclaration )* ( declaration )* ( CTRLZ )? EOF ;
    public final void compilationUnit() throws RecognitionException {
        int compilationUnit_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return ; }
            // RatsJava.g:49:17: ( ( packageDeclaration )? ( importDeclaration )* ( declaration )* ( CTRLZ )? EOF )
            // RatsJava.g:50:3: ( packageDeclaration )? ( importDeclaration )* ( declaration )* ( CTRLZ )? EOF
            {
            // RatsJava.g:50:3: ( packageDeclaration )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==24) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // RatsJava.g:0:0: packageDeclaration
                    {
                    pushFollow(FOLLOW_packageDeclaration_in_compilationUnit42);
                    packageDeclaration();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            // RatsJava.g:50:23: ( importDeclaration )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==26) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // RatsJava.g:0:0: importDeclaration
            	    {
            	    pushFollow(FOLLOW_importDeclaration_in_compilationUnit45);
            	    importDeclaration();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // RatsJava.g:50:42: ( declaration )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==Identifier||LA3_0==25||(LA3_0>=29 && LA3_0<=39)||LA3_0==44||(LA3_0>=46 && LA3_0<=47)||(LA3_0>=108 && LA3_0<=116)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // RatsJava.g:0:0: declaration
            	    {
            	    pushFollow(FOLLOW_declaration_in_compilationUnit48);
            	    declaration();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // RatsJava.g:50:55: ( CTRLZ )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==CTRLZ) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // RatsJava.g:0:0: CTRLZ
                    {
                    match(input,CTRLZ,FOLLOW_CTRLZ_in_compilationUnit51); if (state.failed) return ;

                    }
                    break;

            }

            match(input,EOF,FOLLOW_EOF_in_compilationUnit54); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 1, compilationUnit_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "compilationUnit"


    // $ANTLR start "packageDeclaration"
    // RatsJava.g:53:1: packageDeclaration : 'package' qualifiedIdentifier ';' ;
    public final void packageDeclaration() throws RecognitionException {
        int packageDeclaration_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return ; }
            // RatsJava.g:53:20: ( 'package' qualifiedIdentifier ';' )
            // RatsJava.g:54:3: 'package' qualifiedIdentifier ';'
            {
            match(input,24,FOLLOW_24_in_packageDeclaration68); if (state.failed) return ;
            pushFollow(FOLLOW_qualifiedIdentifier_in_packageDeclaration70);
            qualifiedIdentifier();

            state._fsp--;
            if (state.failed) return ;
            match(input,25,FOLLOW_25_in_packageDeclaration72); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 2, packageDeclaration_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "packageDeclaration"


    // $ANTLR start "importDeclaration"
    // RatsJava.g:57:1: importDeclaration : 'import' qualifiedIdentifier ( dotStarTail )? ';' ;
    public final void importDeclaration() throws RecognitionException {
        int importDeclaration_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return ; }
            // RatsJava.g:57:19: ( 'import' qualifiedIdentifier ( dotStarTail )? ';' )
            // RatsJava.g:58:3: 'import' qualifiedIdentifier ( dotStarTail )? ';'
            {
            match(input,26,FOLLOW_26_in_importDeclaration86); if (state.failed) return ;
            pushFollow(FOLLOW_qualifiedIdentifier_in_importDeclaration88);
            qualifiedIdentifier();

            state._fsp--;
            if (state.failed) return ;
            // RatsJava.g:58:32: ( dotStarTail )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==27) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // RatsJava.g:0:0: dotStarTail
                    {
                    pushFollow(FOLLOW_dotStarTail_in_importDeclaration90);
                    dotStarTail();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            match(input,25,FOLLOW_25_in_importDeclaration96); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 3, importDeclaration_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "importDeclaration"


    // $ANTLR start "dotStarTail"
    // RatsJava.g:62:1: dotStarTail : '.' '*' ;
    public final void dotStarTail() throws RecognitionException {
        int dotStarTail_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return ; }
            // RatsJava.g:62:13: ( '.' '*' )
            // RatsJava.g:63:3: '.' '*'
            {
            match(input,27,FOLLOW_27_in_dotStarTail110); if (state.failed) return ;
            match(input,28,FOLLOW_28_in_dotStarTail112); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 4, dotStarTail_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "dotStarTail"


    // $ANTLR start "name"
    // RatsJava.g:66:1: name : Identifier ;
    public final void name() throws RecognitionException {
        int name_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return ; }
            // RatsJava.g:66:6: ( Identifier )
            // RatsJava.g:67:3: Identifier
            {
            match(input,Identifier,FOLLOW_Identifier_in_name126); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 5, name_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "name"


    // $ANTLR start "modifiers"
    // RatsJava.g:70:1: modifiers : modifierList ;
    public final void modifiers() throws RecognitionException {
        int modifiers_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return ; }
            // RatsJava.g:70:11: ( modifierList )
            // RatsJava.g:71:3: modifierList
            {
            pushFollow(FOLLOW_modifierList_in_modifiers140);
            modifierList();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 6, modifiers_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "modifiers"


    // $ANTLR start "modifierList"
    // RatsJava.g:74:1: modifierList : ( modifier )* ;
    public final void modifierList() throws RecognitionException {
        int modifierList_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return ; }
            // RatsJava.g:74:14: ( ( modifier )* )
            // RatsJava.g:75:3: ( modifier )*
            {
            // RatsJava.g:75:3: ( modifier )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=29 && LA6_0<=39)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // RatsJava.g:0:0: modifier
            	    {
            	    pushFollow(FOLLOW_modifier_in_modifierList154);
            	    modifier();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 7, modifierList_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "modifierList"


    // $ANTLR start "modifier"
    // RatsJava.g:78:1: modifier : ( 'public' | 'protected' | 'private' | 'static' | 'abstract' | 'final' | 'native' | 'synchronized' | 'transient' | 'volatile' | 'strictfp' );
    public final void modifier() throws RecognitionException {
        int modifier_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return ; }
            // RatsJava.g:78:10: ( 'public' | 'protected' | 'private' | 'static' | 'abstract' | 'final' | 'native' | 'synchronized' | 'transient' | 'volatile' | 'strictfp' )
            // RatsJava.g:
            {
            if ( (input.LA(1)>=29 && input.LA(1)<=39) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 8, modifier_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "modifier"


    // $ANTLR start "formalParameter"
    // RatsJava.g:92:1: formalParameter : variableModifiers type Identifier ( dimensions )? ;
    public final void formalParameter() throws RecognitionException {
        int formalParameter_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return ; }
            // RatsJava.g:92:17: ( variableModifiers type Identifier ( dimensions )? )
            // RatsJava.g:93:3: variableModifiers type Identifier ( dimensions )?
            {
            pushFollow(FOLLOW_variableModifiers_in_formalParameter243);
            variableModifiers();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_type_in_formalParameter245);
            type();

            state._fsp--;
            if (state.failed) return ;
            match(input,Identifier,FOLLOW_Identifier_in_formalParameter247); if (state.failed) return ;
            // RatsJava.g:93:37: ( dimensions )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==104) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // RatsJava.g:0:0: dimensions
                    {
                    pushFollow(FOLLOW_dimensions_in_formalParameter249);
                    dimensions();

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
            if ( state.backtracking>0 ) { memoize(input, 9, formalParameter_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "formalParameter"


    // $ANTLR start "variableModifiers"
    // RatsJava.g:96:1: variableModifiers : ( finalModifier modifiers | modifiers );
    public final void variableModifiers() throws RecognitionException {
        int variableModifiers_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return ; }
            // RatsJava.g:96:19: ( finalModifier modifiers | modifiers )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==34) ) {
                int LA8_1 = input.LA(2);

                if ( (synpred18_RatsJava()) ) {
                    alt8=1;
                }
                else if ( (true) ) {
                    alt8=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA8_0==Identifier||(LA8_0>=29 && LA8_0<=33)||(LA8_0>=35 && LA8_0<=39)||(LA8_0>=109 && LA8_0<=116)) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // RatsJava.g:97:3: finalModifier modifiers
                    {
                    pushFollow(FOLLOW_finalModifier_in_variableModifiers264);
                    finalModifier();

                    state._fsp--;
                    if (state.failed) return ;
                    pushFollow(FOLLOW_modifiers_in_variableModifiers266);
                    modifiers();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // RatsJava.g:98:5: modifiers
                    {
                    pushFollow(FOLLOW_modifiers_in_variableModifiers272);
                    modifiers();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 10, variableModifiers_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "variableModifiers"


    // $ANTLR start "finalModifier"
    // RatsJava.g:101:1: finalModifier : 'final' ;
    public final void finalModifier() throws RecognitionException {
        int finalModifier_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return ; }
            // RatsJava.g:101:15: ( 'final' )
            // RatsJava.g:102:3: 'final'
            {
            match(input,34,FOLLOW_34_in_finalModifier286); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 11, finalModifier_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "finalModifier"


    // $ANTLR start "formalParameters"
    // RatsJava.g:105:1: formalParameters : ( '(' formalParameter ( ',' formalParameter )* ')' | '(' ')' );
    public final void formalParameters() throws RecognitionException {
        int formalParameters_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return ; }
            // RatsJava.g:105:18: ( '(' formalParameter ( ',' formalParameter )* ')' | '(' ')' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==40) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==42) ) {
                    alt10=2;
                }
                else if ( (LA10_1==Identifier||(LA10_1>=29 && LA10_1<=39)||(LA10_1>=109 && LA10_1<=116)) ) {
                    alt10=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // RatsJava.g:106:3: '(' formalParameter ( ',' formalParameter )* ')'
                    {
                    match(input,40,FOLLOW_40_in_formalParameters300); if (state.failed) return ;
                    pushFollow(FOLLOW_formalParameter_in_formalParameters302);
                    formalParameter();

                    state._fsp--;
                    if (state.failed) return ;
                    // RatsJava.g:106:23: ( ',' formalParameter )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==41) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // RatsJava.g:107:5: ',' formalParameter
                    	    {
                    	    match(input,41,FOLLOW_41_in_formalParameters311); if (state.failed) return ;
                    	    pushFollow(FOLLOW_formalParameter_in_formalParameters313);
                    	    formalParameter();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    match(input,42,FOLLOW_42_in_formalParameters320); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // RatsJava.g:109:5: '(' ')'
                    {
                    match(input,40,FOLLOW_40_in_formalParameters326); if (state.failed) return ;
                    match(input,42,FOLLOW_42_in_formalParameters328); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 12, formalParameters_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "formalParameters"


    // $ANTLR start "declarator"
    // RatsJava.g:112:1: declarator : name ( dimensions )? ( '=' variableInitializer )? ;
    public final void declarator() throws RecognitionException {
        int declarator_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return ; }
            // RatsJava.g:112:12: ( name ( dimensions )? ( '=' variableInitializer )? )
            // RatsJava.g:113:3: name ( dimensions )? ( '=' variableInitializer )?
            {
            pushFollow(FOLLOW_name_in_declarator342);
            name();

            state._fsp--;
            if (state.failed) return ;
            // RatsJava.g:113:8: ( dimensions )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==104) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // RatsJava.g:0:0: dimensions
                    {
                    pushFollow(FOLLOW_dimensions_in_declarator344);
                    dimensions();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            // RatsJava.g:113:20: ( '=' variableInitializer )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==43) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // RatsJava.g:114:5: '=' variableInitializer
                    {
                    match(input,43,FOLLOW_43_in_declarator354); if (state.failed) return ;
                    pushFollow(FOLLOW_variableInitializer_in_declarator356);
                    variableInitializer();

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
            if ( state.backtracking>0 ) { memoize(input, 13, declarator_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "declarator"


    // $ANTLR start "declarators"
    // RatsJava.g:118:1: declarators : declarator ( ',' declarator )* ;
    public final void declarators() throws RecognitionException {
        int declarators_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return ; }
            // RatsJava.g:118:13: ( declarator ( ',' declarator )* )
            // RatsJava.g:119:3: declarator ( ',' declarator )*
            {
            pushFollow(FOLLOW_declarator_in_declarators375);
            declarator();

            state._fsp--;
            if (state.failed) return ;
            // RatsJava.g:119:14: ( ',' declarator )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==41) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // RatsJava.g:120:5: ',' declarator
            	    {
            	    match(input,41,FOLLOW_41_in_declarators384); if (state.failed) return ;
            	    pushFollow(FOLLOW_declarator_in_declarators386);
            	    declarator();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 14, declarators_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "declarators"


    // $ANTLR start "classBody"
    // RatsJava.g:124:1: classBody : '{' ( declaration )* '}' ;
    public final void classBody() throws RecognitionException {
        int classBody_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return ; }
            // RatsJava.g:124:11: ( '{' ( declaration )* '}' )
            // RatsJava.g:125:3: '{' ( declaration )* '}'
            {
            match(input,44,FOLLOW_44_in_classBody405); if (state.failed) return ;
            // RatsJava.g:125:7: ( declaration )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==EOF||LA14_0==Identifier||LA14_0==25||(LA14_0>=29 && LA14_0<=39)||LA14_0==44||(LA14_0>=46 && LA14_0<=47)||(LA14_0>=108 && LA14_0<=116)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // RatsJava.g:0:0: declaration
            	    {
            	    pushFollow(FOLLOW_declaration_in_classBody407);
            	    declaration();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            match(input,45,FOLLOW_45_in_classBody410); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 15, classBody_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "classBody"


    // $ANTLR start "declaration"
    // RatsJava.g:128:1: declaration : ( fieldDeclaration | methodDeclaration | constructorDeclaration | classDeclaration | interfaceDeclaration | blockDeclaration | emptyDeclaration );
    public final void declaration() throws RecognitionException {
        int declaration_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return ; }
            // RatsJava.g:128:13: ( fieldDeclaration | methodDeclaration | constructorDeclaration | classDeclaration | interfaceDeclaration | blockDeclaration | emptyDeclaration )
            int alt15=7;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // RatsJava.g:129:3: fieldDeclaration
                    {
                    pushFollow(FOLLOW_fieldDeclaration_in_declaration424);
                    fieldDeclaration();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // RatsJava.g:130:5: methodDeclaration
                    {
                    pushFollow(FOLLOW_methodDeclaration_in_declaration430);
                    methodDeclaration();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // RatsJava.g:131:5: constructorDeclaration
                    {
                    pushFollow(FOLLOW_constructorDeclaration_in_declaration436);
                    constructorDeclaration();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // RatsJava.g:132:5: classDeclaration
                    {
                    pushFollow(FOLLOW_classDeclaration_in_declaration442);
                    classDeclaration();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // RatsJava.g:133:5: interfaceDeclaration
                    {
                    pushFollow(FOLLOW_interfaceDeclaration_in_declaration448);
                    interfaceDeclaration();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // RatsJava.g:134:5: blockDeclaration
                    {
                    pushFollow(FOLLOW_blockDeclaration_in_declaration454);
                    blockDeclaration();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // RatsJava.g:135:5: emptyDeclaration
                    {
                    pushFollow(FOLLOW_emptyDeclaration_in_declaration460);
                    emptyDeclaration();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 16, declaration_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "declaration"


    // $ANTLR start "fieldDeclaration"
    // RatsJava.g:138:1: fieldDeclaration : modifiers type declarators ';' ;
    public final void fieldDeclaration() throws RecognitionException {
        int fieldDeclaration_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return ; }
            // RatsJava.g:138:18: ( modifiers type declarators ';' )
            // RatsJava.g:139:3: modifiers type declarators ';'
            {
            pushFollow(FOLLOW_modifiers_in_fieldDeclaration474);
            modifiers();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_type_in_fieldDeclaration476);
            type();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_declarators_in_fieldDeclaration478);
            declarators();

            state._fsp--;
            if (state.failed) return ;
            match(input,25,FOLLOW_25_in_fieldDeclaration480); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 17, fieldDeclaration_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "fieldDeclaration"


    // $ANTLR start "methodDeclaration"
    // RatsJava.g:142:1: methodDeclaration : modifiers resultType name formalParameters ( dimensions )? ( throwsClause )? ( block | ';' ) ;
    public final void methodDeclaration() throws RecognitionException {
        int methodDeclaration_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return ; }
            // RatsJava.g:142:19: ( modifiers resultType name formalParameters ( dimensions )? ( throwsClause )? ( block | ';' ) )
            // RatsJava.g:143:3: modifiers resultType name formalParameters ( dimensions )? ( throwsClause )? ( block | ';' )
            {
            pushFollow(FOLLOW_modifiers_in_methodDeclaration494);
            modifiers();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_resultType_in_methodDeclaration496);
            resultType();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_name_in_methodDeclaration498);
            name();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_formalParameters_in_methodDeclaration500);
            formalParameters();

            state._fsp--;
            if (state.failed) return ;
            // RatsJava.g:143:46: ( dimensions )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==104) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // RatsJava.g:0:0: dimensions
                    {
                    pushFollow(FOLLOW_dimensions_in_methodDeclaration502);
                    dimensions();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            // RatsJava.g:144:3: ( throwsClause )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==48) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // RatsJava.g:0:0: throwsClause
                    {
                    pushFollow(FOLLOW_throwsClause_in_methodDeclaration508);
                    throwsClause();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            // RatsJava.g:144:17: ( block | ';' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==44) ) {
                alt18=1;
            }
            else if ( (LA18_0==25) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // RatsJava.g:145:5: block
                    {
                    pushFollow(FOLLOW_block_in_methodDeclaration518);
                    block();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // RatsJava.g:146:7: ';'
                    {
                    match(input,25,FOLLOW_25_in_methodDeclaration526); if (state.failed) return ;

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
            if ( state.backtracking>0 ) { memoize(input, 18, methodDeclaration_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "methodDeclaration"


    // $ANTLR start "constructorDeclaration"
    // RatsJava.g:150:1: constructorDeclaration : modifiers name formalParameters ( throwsClause )? block ;
    public final void constructorDeclaration() throws RecognitionException {
        int constructorDeclaration_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return ; }
            // RatsJava.g:150:24: ( modifiers name formalParameters ( throwsClause )? block )
            // RatsJava.g:151:3: modifiers name formalParameters ( throwsClause )? block
            {
            pushFollow(FOLLOW_modifiers_in_constructorDeclaration544);
            modifiers();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_name_in_constructorDeclaration546);
            name();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_formalParameters_in_constructorDeclaration548);
            formalParameters();

            state._fsp--;
            if (state.failed) return ;
            // RatsJava.g:151:35: ( throwsClause )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==48) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // RatsJava.g:0:0: throwsClause
                    {
                    pushFollow(FOLLOW_throwsClause_in_constructorDeclaration550);
                    throwsClause();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_block_in_constructorDeclaration553);
            block();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 19, constructorDeclaration_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "constructorDeclaration"


    // $ANTLR start "classDeclaration"
    // RatsJava.g:154:1: classDeclaration : modifiers 'class' name ( extension )? ( implementation )? classBody ;
    public final void classDeclaration() throws RecognitionException {
        int classDeclaration_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return ; }
            // RatsJava.g:154:18: ( modifiers 'class' name ( extension )? ( implementation )? classBody )
            // RatsJava.g:155:3: modifiers 'class' name ( extension )? ( implementation )? classBody
            {
            pushFollow(FOLLOW_modifiers_in_classDeclaration567);
            modifiers();

            state._fsp--;
            if (state.failed) return ;
            match(input,46,FOLLOW_46_in_classDeclaration569); if (state.failed) return ;
            pushFollow(FOLLOW_name_in_classDeclaration571);
            name();

            state._fsp--;
            if (state.failed) return ;
            // RatsJava.g:155:26: ( extension )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==49) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // RatsJava.g:0:0: extension
                    {
                    pushFollow(FOLLOW_extension_in_classDeclaration573);
                    extension();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            // RatsJava.g:156:3: ( implementation )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==50) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // RatsJava.g:0:0: implementation
                    {
                    pushFollow(FOLLOW_implementation_in_classDeclaration579);
                    implementation();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_classBody_in_classDeclaration582);
            classBody();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 20, classDeclaration_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "classDeclaration"


    // $ANTLR start "interfaceDeclaration"
    // RatsJava.g:159:1: interfaceDeclaration : modifiers 'interface' name ( extension )? classBody ;
    public final void interfaceDeclaration() throws RecognitionException {
        int interfaceDeclaration_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return ; }
            // RatsJava.g:159:22: ( modifiers 'interface' name ( extension )? classBody )
            // RatsJava.g:160:3: modifiers 'interface' name ( extension )? classBody
            {
            pushFollow(FOLLOW_modifiers_in_interfaceDeclaration596);
            modifiers();

            state._fsp--;
            if (state.failed) return ;
            match(input,47,FOLLOW_47_in_interfaceDeclaration598); if (state.failed) return ;
            pushFollow(FOLLOW_name_in_interfaceDeclaration600);
            name();

            state._fsp--;
            if (state.failed) return ;
            // RatsJava.g:160:30: ( extension )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==49) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // RatsJava.g:0:0: extension
                    {
                    pushFollow(FOLLOW_extension_in_interfaceDeclaration602);
                    extension();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_classBody_in_interfaceDeclaration605);
            classBody();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 21, interfaceDeclaration_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "interfaceDeclaration"


    // $ANTLR start "blockDeclaration"
    // RatsJava.g:163:1: blockDeclaration : ( 'static' )? block ;
    public final void blockDeclaration() throws RecognitionException {
        int blockDeclaration_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return ; }
            // RatsJava.g:163:18: ( ( 'static' )? block )
            // RatsJava.g:164:3: ( 'static' )? block
            {
            // RatsJava.g:164:3: ( 'static' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==32) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // RatsJava.g:165:5: 'static'
                    {
                    match(input,32,FOLLOW_32_in_blockDeclaration626); if (state.failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_block_in_blockDeclaration633);
            block();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 22, blockDeclaration_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "blockDeclaration"


    // $ANTLR start "emptyDeclaration"
    // RatsJava.g:169:1: emptyDeclaration : ';' ;
    public final void emptyDeclaration() throws RecognitionException {
        int emptyDeclaration_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return ; }
            // RatsJava.g:169:18: ( ';' )
            // RatsJava.g:170:3: ';'
            {
            match(input,25,FOLLOW_25_in_emptyDeclaration647); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 23, emptyDeclaration_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "emptyDeclaration"


    // $ANTLR start "throwsClause"
    // RatsJava.g:173:1: throwsClause : 'throws' qualifiedIdentifier ( ',' qualifiedIdentifier )* ;
    public final void throwsClause() throws RecognitionException {
        int throwsClause_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return ; }
            // RatsJava.g:173:14: ( 'throws' qualifiedIdentifier ( ',' qualifiedIdentifier )* )
            // RatsJava.g:174:3: 'throws' qualifiedIdentifier ( ',' qualifiedIdentifier )*
            {
            match(input,48,FOLLOW_48_in_throwsClause661); if (state.failed) return ;
            pushFollow(FOLLOW_qualifiedIdentifier_in_throwsClause663);
            qualifiedIdentifier();

            state._fsp--;
            if (state.failed) return ;
            // RatsJava.g:174:32: ( ',' qualifiedIdentifier )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==41) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // RatsJava.g:175:5: ',' qualifiedIdentifier
            	    {
            	    match(input,41,FOLLOW_41_in_throwsClause672); if (state.failed) return ;
            	    pushFollow(FOLLOW_qualifiedIdentifier_in_throwsClause674);
            	    qualifiedIdentifier();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 24, throwsClause_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "throwsClause"


    // $ANTLR start "extension"
    // RatsJava.g:179:1: extension : 'extends' type ( ',' type )* ;
    public final void extension() throws RecognitionException {
        int extension_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return ; }
            // RatsJava.g:179:11: ( 'extends' type ( ',' type )* )
            // RatsJava.g:180:3: 'extends' type ( ',' type )*
            {
            match(input,49,FOLLOW_49_in_extension693); if (state.failed) return ;
            pushFollow(FOLLOW_type_in_extension695);
            type();

            state._fsp--;
            if (state.failed) return ;
            // RatsJava.g:180:18: ( ',' type )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==41) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // RatsJava.g:181:5: ',' type
            	    {
            	    match(input,41,FOLLOW_41_in_extension704); if (state.failed) return ;
            	    pushFollow(FOLLOW_type_in_extension706);
            	    type();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 25, extension_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "extension"


    // $ANTLR start "implementation"
    // RatsJava.g:185:1: implementation : 'implements' type ( ',' type )* ;
    public final void implementation() throws RecognitionException {
        int implementation_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return ; }
            // RatsJava.g:185:16: ( 'implements' type ( ',' type )* )
            // RatsJava.g:186:3: 'implements' type ( ',' type )*
            {
            match(input,50,FOLLOW_50_in_implementation725); if (state.failed) return ;
            pushFollow(FOLLOW_type_in_implementation727);
            type();

            state._fsp--;
            if (state.failed) return ;
            // RatsJava.g:186:21: ( ',' type )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==41) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // RatsJava.g:187:5: ',' type
            	    {
            	    match(input,41,FOLLOW_41_in_implementation736); if (state.failed) return ;
            	    pushFollow(FOLLOW_type_in_implementation738);
            	    type();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 26, implementation_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "implementation"


    // $ANTLR start "block"
    // RatsJava.g:191:1: block : '{' ( declarationOrStatement )* '}' ;
    public final void block() throws RecognitionException {
        int block_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return ; }
            // RatsJava.g:191:7: ( '{' ( declarationOrStatement )* '}' )
            // RatsJava.g:192:3: '{' ( declarationOrStatement )* '}'
            {
            match(input,44,FOLLOW_44_in_block757); if (state.failed) return ;
            // RatsJava.g:192:7: ( declarationOrStatement )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==EOF||(LA27_0>=Identifier && LA27_0<=DecimalLiteral)||LA27_0==25||(LA27_0>=29 && LA27_0<=40)||LA27_0==44||(LA27_0>=46 && LA27_0<=47)||LA27_0==51||(LA27_0>=53 && LA27_0<=56)||LA27_0==59||(LA27_0>=63 && LA27_0<=67)||(LA27_0>=95 && LA27_0<=96)||(LA27_0>=99 && LA27_0<=103)||(LA27_0>=106 && LA27_0<=119)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // RatsJava.g:0:0: declarationOrStatement
            	    {
            	    pushFollow(FOLLOW_declarationOrStatement_in_block759);
            	    declarationOrStatement();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            match(input,45,FOLLOW_45_in_block762); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 27, block_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "block"


    // $ANTLR start "declarationOrStatement"
    // RatsJava.g:195:1: declarationOrStatement : ( inBlockDeclaration | statement );
    public final void declarationOrStatement() throws RecognitionException {
        int declarationOrStatement_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return ; }
            // RatsJava.g:195:24: ( inBlockDeclaration | statement )
            int alt28=2;
            alt28 = dfa28.predict(input);
            switch (alt28) {
                case 1 :
                    // RatsJava.g:196:3: inBlockDeclaration
                    {
                    pushFollow(FOLLOW_inBlockDeclaration_in_declarationOrStatement776);
                    inBlockDeclaration();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // RatsJava.g:197:5: statement
                    {
                    pushFollow(FOLLOW_statement_in_declarationOrStatement782);
                    statement();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 28, declarationOrStatement_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "declarationOrStatement"


    // $ANTLR start "inBlockDeclaration"
    // RatsJava.g:200:1: inBlockDeclaration : ( variableDeclaration | classDeclaration | interfaceDeclaration );
    public final void inBlockDeclaration() throws RecognitionException {
        int inBlockDeclaration_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return ; }
            // RatsJava.g:200:20: ( variableDeclaration | classDeclaration | interfaceDeclaration )
            int alt29=3;
            alt29 = dfa29.predict(input);
            switch (alt29) {
                case 1 :
                    // RatsJava.g:201:3: variableDeclaration
                    {
                    pushFollow(FOLLOW_variableDeclaration_in_inBlockDeclaration796);
                    variableDeclaration();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // RatsJava.g:202:5: classDeclaration
                    {
                    pushFollow(FOLLOW_classDeclaration_in_inBlockDeclaration802);
                    classDeclaration();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // RatsJava.g:203:5: interfaceDeclaration
                    {
                    pushFollow(FOLLOW_interfaceDeclaration_in_inBlockDeclaration808);
                    interfaceDeclaration();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 29, inBlockDeclaration_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "inBlockDeclaration"


    // $ANTLR start "variableDeclaration"
    // RatsJava.g:206:1: variableDeclaration : variableModifiers type declarators ';' ;
    public final void variableDeclaration() throws RecognitionException {
        int variableDeclaration_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return ; }
            // RatsJava.g:206:21: ( variableModifiers type declarators ';' )
            // RatsJava.g:207:3: variableModifiers type declarators ';'
            {
            pushFollow(FOLLOW_variableModifiers_in_variableDeclaration822);
            variableModifiers();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_type_in_variableDeclaration824);
            type();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_declarators_in_variableDeclaration826);
            declarators();

            state._fsp--;
            if (state.failed) return ;
            match(input,25,FOLLOW_25_in_variableDeclaration828); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 30, variableDeclaration_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "variableDeclaration"


    // $ANTLR start "statement"
    // RatsJava.g:211:1: statement : ( block | conditionalStatement | forStatement | whileStatement | doWhileStatement | tryCatchFinallyStatement | switchStatement | synchronizedStatement | returnStatement | throwStatement | breakStatement | continueStatement | labeledStatement | expressionStatement | assertStatement | emptyStatement );
    public final void statement() throws RecognitionException {
        int statement_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return ; }
            // RatsJava.g:211:11: ( block | conditionalStatement | forStatement | whileStatement | doWhileStatement | tryCatchFinallyStatement | switchStatement | synchronizedStatement | returnStatement | throwStatement | breakStatement | continueStatement | labeledStatement | expressionStatement | assertStatement | emptyStatement )
            int alt30=16;
            alt30 = dfa30.predict(input);
            switch (alt30) {
                case 1 :
                    // RatsJava.g:212:3: block
                    {
                    pushFollow(FOLLOW_block_in_statement844);
                    block();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // RatsJava.g:213:5: conditionalStatement
                    {
                    pushFollow(FOLLOW_conditionalStatement_in_statement850);
                    conditionalStatement();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // RatsJava.g:214:5: forStatement
                    {
                    pushFollow(FOLLOW_forStatement_in_statement856);
                    forStatement();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // RatsJava.g:215:5: whileStatement
                    {
                    pushFollow(FOLLOW_whileStatement_in_statement862);
                    whileStatement();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // RatsJava.g:216:5: doWhileStatement
                    {
                    pushFollow(FOLLOW_doWhileStatement_in_statement868);
                    doWhileStatement();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // RatsJava.g:217:5: tryCatchFinallyStatement
                    {
                    pushFollow(FOLLOW_tryCatchFinallyStatement_in_statement874);
                    tryCatchFinallyStatement();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // RatsJava.g:218:5: switchStatement
                    {
                    pushFollow(FOLLOW_switchStatement_in_statement880);
                    switchStatement();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 8 :
                    // RatsJava.g:219:5: synchronizedStatement
                    {
                    pushFollow(FOLLOW_synchronizedStatement_in_statement886);
                    synchronizedStatement();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 9 :
                    // RatsJava.g:220:5: returnStatement
                    {
                    pushFollow(FOLLOW_returnStatement_in_statement892);
                    returnStatement();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 10 :
                    // RatsJava.g:221:5: throwStatement
                    {
                    pushFollow(FOLLOW_throwStatement_in_statement898);
                    throwStatement();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 11 :
                    // RatsJava.g:222:5: breakStatement
                    {
                    pushFollow(FOLLOW_breakStatement_in_statement904);
                    breakStatement();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 12 :
                    // RatsJava.g:223:5: continueStatement
                    {
                    pushFollow(FOLLOW_continueStatement_in_statement910);
                    continueStatement();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 13 :
                    // RatsJava.g:224:5: labeledStatement
                    {
                    pushFollow(FOLLOW_labeledStatement_in_statement916);
                    labeledStatement();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 14 :
                    // RatsJava.g:225:5: expressionStatement
                    {
                    pushFollow(FOLLOW_expressionStatement_in_statement922);
                    expressionStatement();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 15 :
                    // RatsJava.g:226:5: assertStatement
                    {
                    pushFollow(FOLLOW_assertStatement_in_statement928);
                    assertStatement();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 16 :
                    // RatsJava.g:227:5: emptyStatement
                    {
                    pushFollow(FOLLOW_emptyStatement_in_statement934);
                    emptyStatement();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 31, statement_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "statement"


    // $ANTLR start "conditionalStatement"
    // RatsJava.g:230:1: conditionalStatement : ( 'if' parExpression statement 'else' statement | 'if' parExpression statement );
    public final void conditionalStatement() throws RecognitionException {
        int conditionalStatement_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return ; }
            // RatsJava.g:230:22: ( 'if' parExpression statement 'else' statement | 'if' parExpression statement )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==51) ) {
                int LA31_1 = input.LA(2);

                if ( (synpred61_RatsJava()) ) {
                    alt31=1;
                }
                else if ( (true) ) {
                    alt31=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // RatsJava.g:231:3: 'if' parExpression statement 'else' statement
                    {
                    match(input,51,FOLLOW_51_in_conditionalStatement948); if (state.failed) return ;
                    pushFollow(FOLLOW_parExpression_in_conditionalStatement950);
                    parExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    pushFollow(FOLLOW_statement_in_conditionalStatement952);
                    statement();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,52,FOLLOW_52_in_conditionalStatement954); if (state.failed) return ;
                    pushFollow(FOLLOW_statement_in_conditionalStatement956);
                    statement();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // RatsJava.g:232:5: 'if' parExpression statement
                    {
                    match(input,51,FOLLOW_51_in_conditionalStatement962); if (state.failed) return ;
                    pushFollow(FOLLOW_parExpression_in_conditionalStatement964);
                    parExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    pushFollow(FOLLOW_statement_in_conditionalStatement966);
                    statement();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 32, conditionalStatement_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "conditionalStatement"


    // $ANTLR start "forStatement"
    // RatsJava.g:235:1: forStatement : 'for' '(' forControl ')' statement ;
    public final void forStatement() throws RecognitionException {
        int forStatement_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return ; }
            // RatsJava.g:235:14: ( 'for' '(' forControl ')' statement )
            // RatsJava.g:236:3: 'for' '(' forControl ')' statement
            {
            match(input,53,FOLLOW_53_in_forStatement980); if (state.failed) return ;
            match(input,40,FOLLOW_40_in_forStatement982); if (state.failed) return ;
            pushFollow(FOLLOW_forControl_in_forStatement984);
            forControl();

            state._fsp--;
            if (state.failed) return ;
            match(input,42,FOLLOW_42_in_forStatement986); if (state.failed) return ;
            pushFollow(FOLLOW_statement_in_forStatement988);
            statement();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 33, forStatement_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "forStatement"


    // $ANTLR start "forControl"
    // RatsJava.g:239:1: forControl : basicForControl ;
    public final void forControl() throws RecognitionException {
        int forControl_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return ; }
            // RatsJava.g:239:12: ( basicForControl )
            // RatsJava.g:240:3: basicForControl
            {
            pushFollow(FOLLOW_basicForControl_in_forControl1002);
            basicForControl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 34, forControl_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "forControl"


    // $ANTLR start "basicForControl"
    // RatsJava.g:243:1: basicForControl : ( variableModifiers type declarators ';' ( expression )? ';' ( expressionList )? | ( expressionList )? ';' ( expression )? ';' ( expressionList )? );
    public final void basicForControl() throws RecognitionException {
        int basicForControl_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return ; }
            // RatsJava.g:243:17: ( variableModifiers type declarators ';' ( expression )? ';' ( expressionList )? | ( expressionList )? ';' ( expression )? ';' ( expressionList )? )
            int alt37=2;
            alt37 = dfa37.predict(input);
            switch (alt37) {
                case 1 :
                    // RatsJava.g:244:3: variableModifiers type declarators ';' ( expression )? ';' ( expressionList )?
                    {
                    pushFollow(FOLLOW_variableModifiers_in_basicForControl1016);
                    variableModifiers();

                    state._fsp--;
                    if (state.failed) return ;
                    pushFollow(FOLLOW_type_in_basicForControl1018);
                    type();

                    state._fsp--;
                    if (state.failed) return ;
                    pushFollow(FOLLOW_declarators_in_basicForControl1020);
                    declarators();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,25,FOLLOW_25_in_basicForControl1022); if (state.failed) return ;
                    // RatsJava.g:244:42: ( expression )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( ((LA32_0>=Identifier && LA32_0<=DecimalLiteral)||LA32_0==40||(LA32_0>=95 && LA32_0<=96)||(LA32_0>=99 && LA32_0<=103)||(LA32_0>=106 && LA32_0<=119)) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // RatsJava.g:0:0: expression
                            {
                            pushFollow(FOLLOW_expression_in_basicForControl1024);
                            expression();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }

                    match(input,25,FOLLOW_25_in_basicForControl1030); if (state.failed) return ;
                    // RatsJava.g:245:7: ( expressionList )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( ((LA33_0>=Identifier && LA33_0<=DecimalLiteral)||LA33_0==40||(LA33_0>=95 && LA33_0<=96)||(LA33_0>=99 && LA33_0<=103)||(LA33_0>=106 && LA33_0<=119)) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // RatsJava.g:0:0: expressionList
                            {
                            pushFollow(FOLLOW_expressionList_in_basicForControl1032);
                            expressionList();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // RatsJava.g:246:5: ( expressionList )? ';' ( expression )? ';' ( expressionList )?
                    {
                    // RatsJava.g:246:5: ( expressionList )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( ((LA34_0>=Identifier && LA34_0<=DecimalLiteral)||LA34_0==40||(LA34_0>=95 && LA34_0<=96)||(LA34_0>=99 && LA34_0<=103)||(LA34_0>=106 && LA34_0<=119)) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // RatsJava.g:0:0: expressionList
                            {
                            pushFollow(FOLLOW_expressionList_in_basicForControl1039);
                            expressionList();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }

                    match(input,25,FOLLOW_25_in_basicForControl1042); if (state.failed) return ;
                    // RatsJava.g:246:25: ( expression )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( ((LA35_0>=Identifier && LA35_0<=DecimalLiteral)||LA35_0==40||(LA35_0>=95 && LA35_0<=96)||(LA35_0>=99 && LA35_0<=103)||(LA35_0>=106 && LA35_0<=119)) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // RatsJava.g:0:0: expression
                            {
                            pushFollow(FOLLOW_expression_in_basicForControl1044);
                            expression();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }

                    match(input,25,FOLLOW_25_in_basicForControl1050); if (state.failed) return ;
                    // RatsJava.g:247:7: ( expressionList )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( ((LA36_0>=Identifier && LA36_0<=DecimalLiteral)||LA36_0==40||(LA36_0>=95 && LA36_0<=96)||(LA36_0>=99 && LA36_0<=103)||(LA36_0>=106 && LA36_0<=119)) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // RatsJava.g:0:0: expressionList
                            {
                            pushFollow(FOLLOW_expressionList_in_basicForControl1052);
                            expressionList();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

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
            if ( state.backtracking>0 ) { memoize(input, 35, basicForControl_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "basicForControl"


    // $ANTLR start "whileStatement"
    // RatsJava.g:250:1: whileStatement : 'while' parExpression statement ;
    public final void whileStatement() throws RecognitionException {
        int whileStatement_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return ; }
            // RatsJava.g:250:16: ( 'while' parExpression statement )
            // RatsJava.g:251:3: 'while' parExpression statement
            {
            match(input,54,FOLLOW_54_in_whileStatement1067); if (state.failed) return ;
            pushFollow(FOLLOW_parExpression_in_whileStatement1069);
            parExpression();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_statement_in_whileStatement1071);
            statement();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 36, whileStatement_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "whileStatement"


    // $ANTLR start "doWhileStatement"
    // RatsJava.g:254:1: doWhileStatement : 'do' statement 'while' parExpression ';' ;
    public final void doWhileStatement() throws RecognitionException {
        int doWhileStatement_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return ; }
            // RatsJava.g:254:18: ( 'do' statement 'while' parExpression ';' )
            // RatsJava.g:255:3: 'do' statement 'while' parExpression ';'
            {
            match(input,55,FOLLOW_55_in_doWhileStatement1085); if (state.failed) return ;
            pushFollow(FOLLOW_statement_in_doWhileStatement1087);
            statement();

            state._fsp--;
            if (state.failed) return ;
            match(input,54,FOLLOW_54_in_doWhileStatement1089); if (state.failed) return ;
            pushFollow(FOLLOW_parExpression_in_doWhileStatement1091);
            parExpression();

            state._fsp--;
            if (state.failed) return ;
            match(input,25,FOLLOW_25_in_doWhileStatement1093); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 37, doWhileStatement_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "doWhileStatement"


    // $ANTLR start "parExpression"
    // RatsJava.g:258:1: parExpression : '(' expression ')' ;
    public final void parExpression() throws RecognitionException {
        int parExpression_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return ; }
            // RatsJava.g:258:15: ( '(' expression ')' )
            // RatsJava.g:259:3: '(' expression ')'
            {
            match(input,40,FOLLOW_40_in_parExpression1107); if (state.failed) return ;
            pushFollow(FOLLOW_expression_in_parExpression1109);
            expression();

            state._fsp--;
            if (state.failed) return ;
            match(input,42,FOLLOW_42_in_parExpression1111); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 38, parExpression_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "parExpression"


    // $ANTLR start "tryCatchFinallyStatement"
    // RatsJava.g:262:1: tryCatchFinallyStatement : ( 'try' block ( catchClause )* 'finally' block | 'try' block ( catchClause )+ );
    public final void tryCatchFinallyStatement() throws RecognitionException {
        int tryCatchFinallyStatement_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return ; }
            // RatsJava.g:262:26: ( 'try' block ( catchClause )* 'finally' block | 'try' block ( catchClause )+ )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==56) ) {
                int LA40_1 = input.LA(2);

                if ( (synpred69_RatsJava()) ) {
                    alt40=1;
                }
                else if ( (true) ) {
                    alt40=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 40, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // RatsJava.g:263:3: 'try' block ( catchClause )* 'finally' block
                    {
                    match(input,56,FOLLOW_56_in_tryCatchFinallyStatement1125); if (state.failed) return ;
                    pushFollow(FOLLOW_block_in_tryCatchFinallyStatement1127);
                    block();

                    state._fsp--;
                    if (state.failed) return ;
                    // RatsJava.g:263:15: ( catchClause )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==58) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // RatsJava.g:0:0: catchClause
                    	    {
                    	    pushFollow(FOLLOW_catchClause_in_tryCatchFinallyStatement1129);
                    	    catchClause();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);

                    match(input,57,FOLLOW_57_in_tryCatchFinallyStatement1132); if (state.failed) return ;
                    pushFollow(FOLLOW_block_in_tryCatchFinallyStatement1134);
                    block();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // RatsJava.g:264:5: 'try' block ( catchClause )+
                    {
                    match(input,56,FOLLOW_56_in_tryCatchFinallyStatement1140); if (state.failed) return ;
                    pushFollow(FOLLOW_block_in_tryCatchFinallyStatement1142);
                    block();

                    state._fsp--;
                    if (state.failed) return ;
                    // RatsJava.g:264:17: ( catchClause )+
                    int cnt39=0;
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==58) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // RatsJava.g:0:0: catchClause
                    	    {
                    	    pushFollow(FOLLOW_catchClause_in_tryCatchFinallyStatement1144);
                    	    catchClause();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt39 >= 1 ) break loop39;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(39, input);
                                throw eee;
                        }
                        cnt39++;
                    } while (true);


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 39, tryCatchFinallyStatement_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "tryCatchFinallyStatement"


    // $ANTLR start "catchClause"
    // RatsJava.g:267:1: catchClause : 'catch' '(' formalParameter ')' block ;
    public final void catchClause() throws RecognitionException {
        int catchClause_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return ; }
            // RatsJava.g:267:13: ( 'catch' '(' formalParameter ')' block )
            // RatsJava.g:268:3: 'catch' '(' formalParameter ')' block
            {
            match(input,58,FOLLOW_58_in_catchClause1159); if (state.failed) return ;
            match(input,40,FOLLOW_40_in_catchClause1161); if (state.failed) return ;
            pushFollow(FOLLOW_formalParameter_in_catchClause1163);
            formalParameter();

            state._fsp--;
            if (state.failed) return ;
            match(input,42,FOLLOW_42_in_catchClause1165); if (state.failed) return ;
            pushFollow(FOLLOW_block_in_catchClause1167);
            block();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 40, catchClause_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "catchClause"


    // $ANTLR start "switchStatement"
    // RatsJava.g:271:1: switchStatement : 'switch' parExpression '{' ( switchClause )* '}' ;
    public final void switchStatement() throws RecognitionException {
        int switchStatement_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return ; }
            // RatsJava.g:271:17: ( 'switch' parExpression '{' ( switchClause )* '}' )
            // RatsJava.g:272:3: 'switch' parExpression '{' ( switchClause )* '}'
            {
            match(input,59,FOLLOW_59_in_switchStatement1181); if (state.failed) return ;
            pushFollow(FOLLOW_parExpression_in_switchStatement1183);
            parExpression();

            state._fsp--;
            if (state.failed) return ;
            match(input,44,FOLLOW_44_in_switchStatement1185); if (state.failed) return ;
            // RatsJava.g:272:30: ( switchClause )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==60||LA41_0==62) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // RatsJava.g:0:0: switchClause
            	    {
            	    pushFollow(FOLLOW_switchClause_in_switchStatement1187);
            	    switchClause();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            match(input,45,FOLLOW_45_in_switchStatement1193); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 41, switchStatement_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "switchStatement"


    // $ANTLR start "switchClause"
    // RatsJava.g:276:1: switchClause : ( caseClause | defaultClause );
    public final void switchClause() throws RecognitionException {
        int switchClause_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return ; }
            // RatsJava.g:276:14: ( caseClause | defaultClause )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==60) ) {
                alt42=1;
            }
            else if ( (LA42_0==62) ) {
                alt42=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // RatsJava.g:277:3: caseClause
                    {
                    pushFollow(FOLLOW_caseClause_in_switchClause1207);
                    caseClause();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // RatsJava.g:278:5: defaultClause
                    {
                    pushFollow(FOLLOW_defaultClause_in_switchClause1213);
                    defaultClause();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 42, switchClause_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "switchClause"


    // $ANTLR start "caseClause"
    // RatsJava.g:281:1: caseClause : 'case' expression ':' ( declarationOrStatement )* ;
    public final void caseClause() throws RecognitionException {
        int caseClause_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return ; }
            // RatsJava.g:281:12: ( 'case' expression ':' ( declarationOrStatement )* )
            // RatsJava.g:282:3: 'case' expression ':' ( declarationOrStatement )*
            {
            match(input,60,FOLLOW_60_in_caseClause1227); if (state.failed) return ;
            pushFollow(FOLLOW_expression_in_caseClause1229);
            expression();

            state._fsp--;
            if (state.failed) return ;
            match(input,61,FOLLOW_61_in_caseClause1231); if (state.failed) return ;
            // RatsJava.g:282:25: ( declarationOrStatement )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( ((LA43_0>=Identifier && LA43_0<=DecimalLiteral)||LA43_0==25||(LA43_0>=29 && LA43_0<=40)||LA43_0==44||(LA43_0>=46 && LA43_0<=47)||LA43_0==51||(LA43_0>=53 && LA43_0<=56)||LA43_0==59||(LA43_0>=63 && LA43_0<=67)||(LA43_0>=95 && LA43_0<=96)||(LA43_0>=99 && LA43_0<=103)||(LA43_0>=106 && LA43_0<=119)) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // RatsJava.g:0:0: declarationOrStatement
            	    {
            	    pushFollow(FOLLOW_declarationOrStatement_in_caseClause1233);
            	    declarationOrStatement();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 43, caseClause_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "caseClause"


    // $ANTLR start "defaultClause"
    // RatsJava.g:285:1: defaultClause : 'default' ':' ( declarationOrStatement )* ;
    public final void defaultClause() throws RecognitionException {
        int defaultClause_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return ; }
            // RatsJava.g:285:15: ( 'default' ':' ( declarationOrStatement )* )
            // RatsJava.g:286:3: 'default' ':' ( declarationOrStatement )*
            {
            match(input,62,FOLLOW_62_in_defaultClause1248); if (state.failed) return ;
            match(input,61,FOLLOW_61_in_defaultClause1250); if (state.failed) return ;
            // RatsJava.g:286:17: ( declarationOrStatement )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( ((LA44_0>=Identifier && LA44_0<=DecimalLiteral)||LA44_0==25||(LA44_0>=29 && LA44_0<=40)||LA44_0==44||(LA44_0>=46 && LA44_0<=47)||LA44_0==51||(LA44_0>=53 && LA44_0<=56)||LA44_0==59||(LA44_0>=63 && LA44_0<=67)||(LA44_0>=95 && LA44_0<=96)||(LA44_0>=99 && LA44_0<=103)||(LA44_0>=106 && LA44_0<=119)) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // RatsJava.g:0:0: declarationOrStatement
            	    {
            	    pushFollow(FOLLOW_declarationOrStatement_in_defaultClause1252);
            	    declarationOrStatement();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 44, defaultClause_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "defaultClause"


    // $ANTLR start "synchronizedStatement"
    // RatsJava.g:289:1: synchronizedStatement : 'synchronized' parExpression block ;
    public final void synchronizedStatement() throws RecognitionException {
        int synchronizedStatement_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return ; }
            // RatsJava.g:289:23: ( 'synchronized' parExpression block )
            // RatsJava.g:290:3: 'synchronized' parExpression block
            {
            match(input,36,FOLLOW_36_in_synchronizedStatement1267); if (state.failed) return ;
            pushFollow(FOLLOW_parExpression_in_synchronizedStatement1269);
            parExpression();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_block_in_synchronizedStatement1271);
            block();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 45, synchronizedStatement_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "synchronizedStatement"


    // $ANTLR start "returnStatement"
    // RatsJava.g:293:1: returnStatement : 'return' ( expression )? ';' ;
    public final void returnStatement() throws RecognitionException {
        int returnStatement_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return ; }
            // RatsJava.g:293:17: ( 'return' ( expression )? ';' )
            // RatsJava.g:294:3: 'return' ( expression )? ';'
            {
            match(input,63,FOLLOW_63_in_returnStatement1285); if (state.failed) return ;
            // RatsJava.g:294:12: ( expression )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=Identifier && LA45_0<=DecimalLiteral)||LA45_0==40||(LA45_0>=95 && LA45_0<=96)||(LA45_0>=99 && LA45_0<=103)||(LA45_0>=106 && LA45_0<=119)) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // RatsJava.g:0:0: expression
                    {
                    pushFollow(FOLLOW_expression_in_returnStatement1287);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            match(input,25,FOLLOW_25_in_returnStatement1290); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 46, returnStatement_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "returnStatement"


    // $ANTLR start "throwStatement"
    // RatsJava.g:297:1: throwStatement : 'throw' expression ';' ;
    public final void throwStatement() throws RecognitionException {
        int throwStatement_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return ; }
            // RatsJava.g:297:16: ( 'throw' expression ';' )
            // RatsJava.g:298:3: 'throw' expression ';'
            {
            match(input,64,FOLLOW_64_in_throwStatement1304); if (state.failed) return ;
            pushFollow(FOLLOW_expression_in_throwStatement1306);
            expression();

            state._fsp--;
            if (state.failed) return ;
            match(input,25,FOLLOW_25_in_throwStatement1308); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 47, throwStatement_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "throwStatement"


    // $ANTLR start "breakStatement"
    // RatsJava.g:301:1: breakStatement : 'break' ( Identifier )? ';' ;
    public final void breakStatement() throws RecognitionException {
        int breakStatement_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return ; }
            // RatsJava.g:301:16: ( 'break' ( Identifier )? ';' )
            // RatsJava.g:302:3: 'break' ( Identifier )? ';'
            {
            match(input,65,FOLLOW_65_in_breakStatement1322); if (state.failed) return ;
            // RatsJava.g:302:11: ( Identifier )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==Identifier) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // RatsJava.g:0:0: Identifier
                    {
                    match(input,Identifier,FOLLOW_Identifier_in_breakStatement1324); if (state.failed) return ;

                    }
                    break;

            }

            match(input,25,FOLLOW_25_in_breakStatement1327); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 48, breakStatement_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "breakStatement"


    // $ANTLR start "continueStatement"
    // RatsJava.g:305:1: continueStatement : 'continue' ( Identifier )? ';' ;
    public final void continueStatement() throws RecognitionException {
        int continueStatement_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return ; }
            // RatsJava.g:305:19: ( 'continue' ( Identifier )? ';' )
            // RatsJava.g:306:3: 'continue' ( Identifier )? ';'
            {
            match(input,66,FOLLOW_66_in_continueStatement1341); if (state.failed) return ;
            // RatsJava.g:306:14: ( Identifier )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==Identifier) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // RatsJava.g:0:0: Identifier
                    {
                    match(input,Identifier,FOLLOW_Identifier_in_continueStatement1343); if (state.failed) return ;

                    }
                    break;

            }

            match(input,25,FOLLOW_25_in_continueStatement1346); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 49, continueStatement_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "continueStatement"


    // $ANTLR start "labeledStatement"
    // RatsJava.g:309:1: labeledStatement : Identifier ':' statement ;
    public final void labeledStatement() throws RecognitionException {
        int labeledStatement_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return ; }
            // RatsJava.g:309:18: ( Identifier ':' statement )
            // RatsJava.g:310:3: Identifier ':' statement
            {
            match(input,Identifier,FOLLOW_Identifier_in_labeledStatement1360); if (state.failed) return ;
            match(input,61,FOLLOW_61_in_labeledStatement1362); if (state.failed) return ;
            pushFollow(FOLLOW_statement_in_labeledStatement1364);
            statement();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 50, labeledStatement_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "labeledStatement"


    // $ANTLR start "expressionStatement"
    // RatsJava.g:313:1: expressionStatement : expression ';' ;
    public final void expressionStatement() throws RecognitionException {
        int expressionStatement_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return ; }
            // RatsJava.g:313:21: ( expression ';' )
            // RatsJava.g:314:3: expression ';'
            {
            pushFollow(FOLLOW_expression_in_expressionStatement1378);
            expression();

            state._fsp--;
            if (state.failed) return ;
            match(input,25,FOLLOW_25_in_expressionStatement1380); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 51, expressionStatement_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "expressionStatement"


    // $ANTLR start "assertStatement"
    // RatsJava.g:317:1: assertStatement : 'assert' expression ( ':' expression )? ';' ;
    public final void assertStatement() throws RecognitionException {
        int assertStatement_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return ; }
            // RatsJava.g:317:17: ( 'assert' expression ( ':' expression )? ';' )
            // RatsJava.g:318:3: 'assert' expression ( ':' expression )? ';'
            {
            match(input,67,FOLLOW_67_in_assertStatement1394); if (state.failed) return ;
            pushFollow(FOLLOW_expression_in_assertStatement1396);
            expression();

            state._fsp--;
            if (state.failed) return ;
            // RatsJava.g:318:23: ( ':' expression )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==61) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // RatsJava.g:319:5: ':' expression
                    {
                    match(input,61,FOLLOW_61_in_assertStatement1405); if (state.failed) return ;
                    pushFollow(FOLLOW_expression_in_assertStatement1407);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            match(input,25,FOLLOW_25_in_assertStatement1414); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 52, assertStatement_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "assertStatement"


    // $ANTLR start "emptyStatement"
    // RatsJava.g:323:1: emptyStatement : ';' ;
    public final void emptyStatement() throws RecognitionException {
        int emptyStatement_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return ; }
            // RatsJava.g:323:16: ( ';' )
            // RatsJava.g:324:3: ';'
            {
            match(input,25,FOLLOW_25_in_emptyStatement1428); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 53, emptyStatement_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "emptyStatement"


    // $ANTLR start "expressionList"
    // RatsJava.g:327:1: expressionList : expression ( ',' expression )* ;
    public final void expressionList() throws RecognitionException {
        int expressionList_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return ; }
            // RatsJava.g:327:16: ( expression ( ',' expression )* )
            // RatsJava.g:328:3: expression ( ',' expression )*
            {
            pushFollow(FOLLOW_expression_in_expressionList1442);
            expression();

            state._fsp--;
            if (state.failed) return ;
            // RatsJava.g:328:14: ( ',' expression )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==41) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // RatsJava.g:329:5: ',' expression
            	    {
            	    match(input,41,FOLLOW_41_in_expressionList1451); if (state.failed) return ;
            	    pushFollow(FOLLOW_expression_in_expressionList1453);
            	    expression();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 54, expressionList_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "expressionList"


    // $ANTLR start "expression"
    // RatsJava.g:333:1: expression : ( conditionalExpression assignmentOperator expression | conditionalExpression );
    public final void expression() throws RecognitionException {
        int expression_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return ; }
            // RatsJava.g:333:12: ( conditionalExpression assignmentOperator expression | conditionalExpression )
            int alt50=2;
            alt50 = dfa50.predict(input);
            switch (alt50) {
                case 1 :
                    // RatsJava.g:334:3: conditionalExpression assignmentOperator expression
                    {
                    pushFollow(FOLLOW_conditionalExpression_in_expression1472);
                    conditionalExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    pushFollow(FOLLOW_assignmentOperator_in_expression1474);
                    assignmentOperator();

                    state._fsp--;
                    if (state.failed) return ;
                    pushFollow(FOLLOW_expression_in_expression1476);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // RatsJava.g:335:5: conditionalExpression
                    {
                    pushFollow(FOLLOW_conditionalExpression_in_expression1482);
                    conditionalExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 55, expression_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "expression"


    // $ANTLR start "assignmentOperator"
    // RatsJava.g:338:1: assignmentOperator : ( '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '%=' | '<<=' | '>>=' | '>>>=' );
    public final void assignmentOperator() throws RecognitionException {
        int assignmentOperator_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return ; }
            // RatsJava.g:338:20: ( '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '%=' | '<<=' | '>>=' | '>>>=' )
            // RatsJava.g:
            {
            if ( input.LA(1)==43||(input.LA(1)>=68 && input.LA(1)<=78) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 56, assignmentOperator_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "assignmentOperator"


    // $ANTLR start "conditionalExpression"
    // RatsJava.g:353:1: conditionalExpression : ( logicalOrExpression '?' expression ':' conditionalExpression | logicalOrExpression );
    public final void conditionalExpression() throws RecognitionException {
        int conditionalExpression_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return ; }
            // RatsJava.g:353:23: ( logicalOrExpression '?' expression ':' conditionalExpression | logicalOrExpression )
            int alt51=2;
            alt51 = dfa51.predict(input);
            switch (alt51) {
                case 1 :
                    // RatsJava.g:354:3: logicalOrExpression '?' expression ':' conditionalExpression
                    {
                    pushFollow(FOLLOW_logicalOrExpression_in_conditionalExpression1576);
                    logicalOrExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,79,FOLLOW_79_in_conditionalExpression1578); if (state.failed) return ;
                    pushFollow(FOLLOW_expression_in_conditionalExpression1580);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,61,FOLLOW_61_in_conditionalExpression1582); if (state.failed) return ;
                    pushFollow(FOLLOW_conditionalExpression_in_conditionalExpression1587);
                    conditionalExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // RatsJava.g:356:5: logicalOrExpression
                    {
                    pushFollow(FOLLOW_logicalOrExpression_in_conditionalExpression1593);
                    logicalOrExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 57, conditionalExpression_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "conditionalExpression"


    // $ANTLR start "logicalOrExpression"
    // RatsJava.g:359:1: logicalOrExpression : logicalAndExpression ( '||' logicalAndExpression )* ;
    public final void logicalOrExpression() throws RecognitionException {
        int logicalOrExpression_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return ; }
            // RatsJava.g:359:21: ( logicalAndExpression ( '||' logicalAndExpression )* )
            // RatsJava.g:360:3: logicalAndExpression ( '||' logicalAndExpression )*
            {
            pushFollow(FOLLOW_logicalAndExpression_in_logicalOrExpression1607);
            logicalAndExpression();

            state._fsp--;
            if (state.failed) return ;
            // RatsJava.g:360:24: ( '||' logicalAndExpression )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==80) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // RatsJava.g:360:25: '||' logicalAndExpression
            	    {
            	    match(input,80,FOLLOW_80_in_logicalOrExpression1610); if (state.failed) return ;
            	    pushFollow(FOLLOW_logicalAndExpression_in_logicalOrExpression1612);
            	    logicalAndExpression();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 58, logicalOrExpression_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "logicalOrExpression"


    // $ANTLR start "logicalAndExpression"
    // RatsJava.g:363:1: logicalAndExpression : bitwiseOrExpression ( '&&' bitwiseOrExpression )* ;
    public final void logicalAndExpression() throws RecognitionException {
        int logicalAndExpression_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return ; }
            // RatsJava.g:363:22: ( bitwiseOrExpression ( '&&' bitwiseOrExpression )* )
            // RatsJava.g:364:3: bitwiseOrExpression ( '&&' bitwiseOrExpression )*
            {
            pushFollow(FOLLOW_bitwiseOrExpression_in_logicalAndExpression1628);
            bitwiseOrExpression();

            state._fsp--;
            if (state.failed) return ;
            // RatsJava.g:364:23: ( '&&' bitwiseOrExpression )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==81) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // RatsJava.g:364:24: '&&' bitwiseOrExpression
            	    {
            	    match(input,81,FOLLOW_81_in_logicalAndExpression1631); if (state.failed) return ;
            	    pushFollow(FOLLOW_bitwiseOrExpression_in_logicalAndExpression1633);
            	    bitwiseOrExpression();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 59, logicalAndExpression_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "logicalAndExpression"


    // $ANTLR start "bitwiseOrExpression"
    // RatsJava.g:367:1: bitwiseOrExpression : bitwiseXorExpression ( '|' bitwiseXorExpression )* ;
    public final void bitwiseOrExpression() throws RecognitionException {
        int bitwiseOrExpression_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return ; }
            // RatsJava.g:367:21: ( bitwiseXorExpression ( '|' bitwiseXorExpression )* )
            // RatsJava.g:368:3: bitwiseXorExpression ( '|' bitwiseXorExpression )*
            {
            pushFollow(FOLLOW_bitwiseXorExpression_in_bitwiseOrExpression1649);
            bitwiseXorExpression();

            state._fsp--;
            if (state.failed) return ;
            // RatsJava.g:368:24: ( '|' bitwiseXorExpression )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==82) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // RatsJava.g:368:25: '|' bitwiseXorExpression
            	    {
            	    match(input,82,FOLLOW_82_in_bitwiseOrExpression1652); if (state.failed) return ;
            	    pushFollow(FOLLOW_bitwiseXorExpression_in_bitwiseOrExpression1654);
            	    bitwiseXorExpression();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 60, bitwiseOrExpression_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "bitwiseOrExpression"


    // $ANTLR start "bitwiseXorExpression"
    // RatsJava.g:371:1: bitwiseXorExpression : bitwiseAndExpression ( '^' bitwiseAndExpression )* ;
    public final void bitwiseXorExpression() throws RecognitionException {
        int bitwiseXorExpression_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return ; }
            // RatsJava.g:371:22: ( bitwiseAndExpression ( '^' bitwiseAndExpression )* )
            // RatsJava.g:372:3: bitwiseAndExpression ( '^' bitwiseAndExpression )*
            {
            pushFollow(FOLLOW_bitwiseAndExpression_in_bitwiseXorExpression1670);
            bitwiseAndExpression();

            state._fsp--;
            if (state.failed) return ;
            // RatsJava.g:372:24: ( '^' bitwiseAndExpression )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==83) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // RatsJava.g:372:25: '^' bitwiseAndExpression
            	    {
            	    match(input,83,FOLLOW_83_in_bitwiseXorExpression1673); if (state.failed) return ;
            	    pushFollow(FOLLOW_bitwiseAndExpression_in_bitwiseXorExpression1675);
            	    bitwiseAndExpression();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 61, bitwiseXorExpression_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "bitwiseXorExpression"


    // $ANTLR start "bitwiseAndExpression"
    // RatsJava.g:375:1: bitwiseAndExpression : equalityExpression ( '&' equalityExpression )* ;
    public final void bitwiseAndExpression() throws RecognitionException {
        int bitwiseAndExpression_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return ; }
            // RatsJava.g:375:22: ( equalityExpression ( '&' equalityExpression )* )
            // RatsJava.g:376:3: equalityExpression ( '&' equalityExpression )*
            {
            pushFollow(FOLLOW_equalityExpression_in_bitwiseAndExpression1691);
            equalityExpression();

            state._fsp--;
            if (state.failed) return ;
            // RatsJava.g:376:22: ( '&' equalityExpression )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==84) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // RatsJava.g:376:23: '&' equalityExpression
            	    {
            	    match(input,84,FOLLOW_84_in_bitwiseAndExpression1694); if (state.failed) return ;
            	    pushFollow(FOLLOW_equalityExpression_in_bitwiseAndExpression1696);
            	    equalityExpression();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 62, bitwiseAndExpression_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "bitwiseAndExpression"


    // $ANTLR start "equalityExpression"
    // RatsJava.g:379:1: equalityExpression : instanceOfExpression ( equalityOperator instanceOfExpression )* ;
    public final void equalityExpression() throws RecognitionException {
        int equalityExpression_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return ; }
            // RatsJava.g:379:20: ( instanceOfExpression ( equalityOperator instanceOfExpression )* )
            // RatsJava.g:380:3: instanceOfExpression ( equalityOperator instanceOfExpression )*
            {
            pushFollow(FOLLOW_instanceOfExpression_in_equalityExpression1712);
            instanceOfExpression();

            state._fsp--;
            if (state.failed) return ;
            // RatsJava.g:380:24: ( equalityOperator instanceOfExpression )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( ((LA57_0>=85 && LA57_0<=86)) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // RatsJava.g:380:25: equalityOperator instanceOfExpression
            	    {
            	    pushFollow(FOLLOW_equalityOperator_in_equalityExpression1715);
            	    equalityOperator();

            	    state._fsp--;
            	    if (state.failed) return ;
            	    pushFollow(FOLLOW_instanceOfExpression_in_equalityExpression1717);
            	    instanceOfExpression();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 63, equalityExpression_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "equalityExpression"


    // $ANTLR start "equalityOperator"
    // RatsJava.g:383:1: equalityOperator : ( '==' | '!=' );
    public final void equalityOperator() throws RecognitionException {
        int equalityOperator_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return ; }
            // RatsJava.g:383:18: ( '==' | '!=' )
            // RatsJava.g:
            {
            if ( (input.LA(1)>=85 && input.LA(1)<=86) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 64, equalityOperator_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "equalityOperator"


    // $ANTLR start "instanceOfExpression"
    // RatsJava.g:388:1: instanceOfExpression : ( relationalExpression 'instanceof' type | relationalExpression );
    public final void instanceOfExpression() throws RecognitionException {
        int instanceOfExpression_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return ; }
            // RatsJava.g:388:22: ( relationalExpression 'instanceof' type | relationalExpression )
            int alt58=2;
            alt58 = dfa58.predict(input);
            switch (alt58) {
                case 1 :
                    // RatsJava.g:389:3: relationalExpression 'instanceof' type
                    {
                    pushFollow(FOLLOW_relationalExpression_in_instanceOfExpression1753);
                    relationalExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,87,FOLLOW_87_in_instanceOfExpression1755); if (state.failed) return ;
                    pushFollow(FOLLOW_type_in_instanceOfExpression1757);
                    type();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // RatsJava.g:390:5: relationalExpression
                    {
                    pushFollow(FOLLOW_relationalExpression_in_instanceOfExpression1763);
                    relationalExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 65, instanceOfExpression_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "instanceOfExpression"


    // $ANTLR start "relationalExpression"
    // RatsJava.g:393:1: relationalExpression : shiftExpression ( relationalOperator shiftExpression )* ;
    public final void relationalExpression() throws RecognitionException {
        int relationalExpression_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return ; }
            // RatsJava.g:393:22: ( shiftExpression ( relationalOperator shiftExpression )* )
            // RatsJava.g:394:3: shiftExpression ( relationalOperator shiftExpression )*
            {
            pushFollow(FOLLOW_shiftExpression_in_relationalExpression1777);
            shiftExpression();

            state._fsp--;
            if (state.failed) return ;
            // RatsJava.g:394:19: ( relationalOperator shiftExpression )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( ((LA59_0>=88 && LA59_0<=91)) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // RatsJava.g:394:20: relationalOperator shiftExpression
            	    {
            	    pushFollow(FOLLOW_relationalOperator_in_relationalExpression1780);
            	    relationalOperator();

            	    state._fsp--;
            	    if (state.failed) return ;
            	    pushFollow(FOLLOW_shiftExpression_in_relationalExpression1782);
            	    shiftExpression();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 66, relationalExpression_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "relationalExpression"


    // $ANTLR start "relationalOperator"
    // RatsJava.g:397:1: relationalOperator : ( '<' | '>' | '<=' | '>=' );
    public final void relationalOperator() throws RecognitionException {
        int relationalOperator_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return ; }
            // RatsJava.g:397:20: ( '<' | '>' | '<=' | '>=' )
            // RatsJava.g:
            {
            if ( (input.LA(1)>=88 && input.LA(1)<=91) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 67, relationalOperator_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "relationalOperator"


    // $ANTLR start "shiftExpression"
    // RatsJava.g:404:1: shiftExpression : additiveExpression ( shiftOperator additiveExpression )* ;
    public final void shiftExpression() throws RecognitionException {
        int shiftExpression_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return ; }
            // RatsJava.g:404:17: ( additiveExpression ( shiftOperator additiveExpression )* )
            // RatsJava.g:405:3: additiveExpression ( shiftOperator additiveExpression )*
            {
            pushFollow(FOLLOW_additiveExpression_in_shiftExpression1830);
            additiveExpression();

            state._fsp--;
            if (state.failed) return ;
            // RatsJava.g:405:22: ( shiftOperator additiveExpression )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( ((LA60_0>=92 && LA60_0<=94)) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // RatsJava.g:405:23: shiftOperator additiveExpression
            	    {
            	    pushFollow(FOLLOW_shiftOperator_in_shiftExpression1833);
            	    shiftOperator();

            	    state._fsp--;
            	    if (state.failed) return ;
            	    pushFollow(FOLLOW_additiveExpression_in_shiftExpression1835);
            	    additiveExpression();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 68, shiftExpression_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "shiftExpression"


    // $ANTLR start "shiftOperator"
    // RatsJava.g:408:1: shiftOperator : ( '<<' | '>>' | '>>>' );
    public final void shiftOperator() throws RecognitionException {
        int shiftOperator_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return ; }
            // RatsJava.g:408:15: ( '<<' | '>>' | '>>>' )
            // RatsJava.g:
            {
            if ( (input.LA(1)>=92 && input.LA(1)<=94) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 69, shiftOperator_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "shiftOperator"


    // $ANTLR start "additiveExpression"
    // RatsJava.g:414:1: additiveExpression : multiplicativeExpression ( additiveOperator multiplicativeExpression )* ;
    public final void additiveExpression() throws RecognitionException {
        int additiveExpression_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return ; }
            // RatsJava.g:414:20: ( multiplicativeExpression ( additiveOperator multiplicativeExpression )* )
            // RatsJava.g:415:3: multiplicativeExpression ( additiveOperator multiplicativeExpression )*
            {
            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1877);
            multiplicativeExpression();

            state._fsp--;
            if (state.failed) return ;
            // RatsJava.g:415:28: ( additiveOperator multiplicativeExpression )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( ((LA61_0>=95 && LA61_0<=96)) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // RatsJava.g:415:29: additiveOperator multiplicativeExpression
            	    {
            	    pushFollow(FOLLOW_additiveOperator_in_additiveExpression1880);
            	    additiveOperator();

            	    state._fsp--;
            	    if (state.failed) return ;
            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1882);
            	    multiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop61;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 70, additiveExpression_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "additiveExpression"


    // $ANTLR start "additiveOperator"
    // RatsJava.g:418:1: additiveOperator : ( '+' | '-' );
    public final void additiveOperator() throws RecognitionException {
        int additiveOperator_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return ; }
            // RatsJava.g:418:18: ( '+' | '-' )
            // RatsJava.g:
            {
            if ( (input.LA(1)>=95 && input.LA(1)<=96) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 71, additiveOperator_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "additiveOperator"


    // $ANTLR start "multiplicativeExpression"
    // RatsJava.g:423:1: multiplicativeExpression : unaryExpression ( multiplicativeOperator unaryExpression )* ;
    public final void multiplicativeExpression() throws RecognitionException {
        int multiplicativeExpression_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return ; }
            // RatsJava.g:423:26: ( unaryExpression ( multiplicativeOperator unaryExpression )* )
            // RatsJava.g:424:3: unaryExpression ( multiplicativeOperator unaryExpression )*
            {
            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1918);
            unaryExpression();

            state._fsp--;
            if (state.failed) return ;
            // RatsJava.g:424:19: ( multiplicativeOperator unaryExpression )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==28||(LA62_0>=97 && LA62_0<=98)) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // RatsJava.g:424:20: multiplicativeOperator unaryExpression
            	    {
            	    pushFollow(FOLLOW_multiplicativeOperator_in_multiplicativeExpression1921);
            	    multiplicativeOperator();

            	    state._fsp--;
            	    if (state.failed) return ;
            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1923);
            	    unaryExpression();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 72, multiplicativeExpression_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "multiplicativeExpression"


    // $ANTLR start "multiplicativeOperator"
    // RatsJava.g:427:1: multiplicativeOperator : ( '*' | '/' | '%' );
    public final void multiplicativeOperator() throws RecognitionException {
        int multiplicativeOperator_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return ; }
            // RatsJava.g:427:24: ( '*' | '/' | '%' )
            // RatsJava.g:
            {
            if ( input.LA(1)==28||(input.LA(1)>=97 && input.LA(1)<=98) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 73, multiplicativeOperator_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "multiplicativeOperator"


    // $ANTLR start "unaryExpression"
    // RatsJava.g:433:1: unaryExpression : ( '+' unaryExpression | '-' unaryExpression | '++' unaryExpression | '--' unaryExpression | unaryExpressionNotPlusMinus );
    public final void unaryExpression() throws RecognitionException {
        int unaryExpression_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return ; }
            // RatsJava.g:433:17: ( '+' unaryExpression | '-' unaryExpression | '++' unaryExpression | '--' unaryExpression | unaryExpressionNotPlusMinus )
            int alt63=5;
            switch ( input.LA(1) ) {
            case 95:
                {
                alt63=1;
                }
                break;
            case 96:
                {
                alt63=2;
                }
                break;
            case 99:
                {
                alt63=3;
                }
                break;
            case 100:
                {
                alt63=4;
                }
                break;
            case Identifier:
            case FloatingPointLiteral:
            case CharacterLiteral:
            case StringLiteral:
            case HexLiteral:
            case OctalLiteral:
            case DecimalLiteral:
            case 40:
            case 101:
            case 102:
            case 103:
            case 106:
            case 107:
            case 108:
            case 109:
            case 110:
            case 111:
            case 112:
            case 113:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
                {
                alt63=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }

            switch (alt63) {
                case 1 :
                    // RatsJava.g:434:3: '+' unaryExpression
                    {
                    match(input,95,FOLLOW_95_in_unaryExpression1965); if (state.failed) return ;
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression1967);
                    unaryExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // RatsJava.g:435:5: '-' unaryExpression
                    {
                    match(input,96,FOLLOW_96_in_unaryExpression1973); if (state.failed) return ;
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression1975);
                    unaryExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // RatsJava.g:436:5: '++' unaryExpression
                    {
                    match(input,99,FOLLOW_99_in_unaryExpression1981); if (state.failed) return ;
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression1983);
                    unaryExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // RatsJava.g:437:5: '--' unaryExpression
                    {
                    match(input,100,FOLLOW_100_in_unaryExpression1989); if (state.failed) return ;
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression1991);
                    unaryExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // RatsJava.g:438:5: unaryExpressionNotPlusMinus
                    {
                    pushFollow(FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpression1997);
                    unaryExpressionNotPlusMinus();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 74, unaryExpression_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "unaryExpression"


    // $ANTLR start "unaryExpressionNotPlusMinus"
    // RatsJava.g:441:1: unaryExpressionNotPlusMinus : ( bitwiseNegationExpression | logicalNegationExpression | basicCastExpression | castExpression | postfixExpression );
    public final void unaryExpressionNotPlusMinus() throws RecognitionException {
        int unaryExpressionNotPlusMinus_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return ; }
            // RatsJava.g:441:29: ( bitwiseNegationExpression | logicalNegationExpression | basicCastExpression | castExpression | postfixExpression )
            int alt64=5;
            alt64 = dfa64.predict(input);
            switch (alt64) {
                case 1 :
                    // RatsJava.g:442:3: bitwiseNegationExpression
                    {
                    pushFollow(FOLLOW_bitwiseNegationExpression_in_unaryExpressionNotPlusMinus2011);
                    bitwiseNegationExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // RatsJava.g:443:5: logicalNegationExpression
                    {
                    pushFollow(FOLLOW_logicalNegationExpression_in_unaryExpressionNotPlusMinus2017);
                    logicalNegationExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // RatsJava.g:444:5: basicCastExpression
                    {
                    pushFollow(FOLLOW_basicCastExpression_in_unaryExpressionNotPlusMinus2023);
                    basicCastExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // RatsJava.g:445:5: castExpression
                    {
                    pushFollow(FOLLOW_castExpression_in_unaryExpressionNotPlusMinus2029);
                    castExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // RatsJava.g:446:5: postfixExpression
                    {
                    pushFollow(FOLLOW_postfixExpression_in_unaryExpressionNotPlusMinus2035);
                    postfixExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 75, unaryExpressionNotPlusMinus_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "unaryExpressionNotPlusMinus"


    // $ANTLR start "bitwiseNegationExpression"
    // RatsJava.g:449:1: bitwiseNegationExpression : '~' unaryExpression ;
    public final void bitwiseNegationExpression() throws RecognitionException {
        int bitwiseNegationExpression_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return ; }
            // RatsJava.g:449:27: ( '~' unaryExpression )
            // RatsJava.g:450:3: '~' unaryExpression
            {
            match(input,101,FOLLOW_101_in_bitwiseNegationExpression2049); if (state.failed) return ;
            pushFollow(FOLLOW_unaryExpression_in_bitwiseNegationExpression2051);
            unaryExpression();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 76, bitwiseNegationExpression_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "bitwiseNegationExpression"


    // $ANTLR start "logicalNegationExpression"
    // RatsJava.g:453:1: logicalNegationExpression : '!' unaryExpression ;
    public final void logicalNegationExpression() throws RecognitionException {
        int logicalNegationExpression_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return ; }
            // RatsJava.g:453:27: ( '!' unaryExpression )
            // RatsJava.g:454:3: '!' unaryExpression
            {
            match(input,102,FOLLOW_102_in_logicalNegationExpression2065); if (state.failed) return ;
            pushFollow(FOLLOW_unaryExpression_in_logicalNegationExpression2067);
            unaryExpression();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 77, logicalNegationExpression_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "logicalNegationExpression"


    // $ANTLR start "basicCastExpression"
    // RatsJava.g:457:1: basicCastExpression : '(' primitiveType ( dimensions )? ')' unaryExpression ;
    public final void basicCastExpression() throws RecognitionException {
        int basicCastExpression_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return ; }
            // RatsJava.g:457:21: ( '(' primitiveType ( dimensions )? ')' unaryExpression )
            // RatsJava.g:458:3: '(' primitiveType ( dimensions )? ')' unaryExpression
            {
            match(input,40,FOLLOW_40_in_basicCastExpression2081); if (state.failed) return ;
            pushFollow(FOLLOW_primitiveType_in_basicCastExpression2083);
            primitiveType();

            state._fsp--;
            if (state.failed) return ;
            // RatsJava.g:458:21: ( dimensions )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==104) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // RatsJava.g:0:0: dimensions
                    {
                    pushFollow(FOLLOW_dimensions_in_basicCastExpression2085);
                    dimensions();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            match(input,42,FOLLOW_42_in_basicCastExpression2088); if (state.failed) return ;
            pushFollow(FOLLOW_unaryExpression_in_basicCastExpression2090);
            unaryExpression();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 78, basicCastExpression_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "basicCastExpression"


    // $ANTLR start "castExpression"
    // RatsJava.g:461:1: castExpression : '(' type ')' unaryExpressionNotPlusMinus ;
    public final void castExpression() throws RecognitionException {
        int castExpression_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return ; }
            // RatsJava.g:461:16: ( '(' type ')' unaryExpressionNotPlusMinus )
            // RatsJava.g:462:3: '(' type ')' unaryExpressionNotPlusMinus
            {
            match(input,40,FOLLOW_40_in_castExpression2104); if (state.failed) return ;
            pushFollow(FOLLOW_type_in_castExpression2106);
            type();

            state._fsp--;
            if (state.failed) return ;
            match(input,42,FOLLOW_42_in_castExpression2108); if (state.failed) return ;
            pushFollow(FOLLOW_unaryExpressionNotPlusMinus_in_castExpression2110);
            unaryExpressionNotPlusMinus();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 79, castExpression_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "castExpression"


    // $ANTLR start "postfixExpression"
    // RatsJava.g:465:1: postfixExpression : primaryExpression ( '.' name arguments | '.' 'super' arguments | '.' 'super' | '.' name | '[' expression ']' | '++' | '--' | '.' 'new' typeName arguments ( classBody )? )* ;
    public final void postfixExpression() throws RecognitionException {
        int postfixExpression_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return ; }
            // RatsJava.g:465:19: ( primaryExpression ( '.' name arguments | '.' 'super' arguments | '.' 'super' | '.' name | '[' expression ']' | '++' | '--' | '.' 'new' typeName arguments ( classBody )? )* )
            // RatsJava.g:466:2: primaryExpression ( '.' name arguments | '.' 'super' arguments | '.' 'super' | '.' name | '[' expression ']' | '++' | '--' | '.' 'new' typeName arguments ( classBody )? )*
            {
            pushFollow(FOLLOW_primaryExpression_in_postfixExpression2122);
            primaryExpression();

            state._fsp--;
            if (state.failed) return ;
            // RatsJava.g:467:3: ( '.' name arguments | '.' 'super' arguments | '.' 'super' | '.' name | '[' expression ']' | '++' | '--' | '.' 'new' typeName arguments ( classBody )? )*
            loop67:
            do {
                int alt67=9;
                alt67 = dfa67.predict(input);
                switch (alt67) {
            	case 1 :
            	    // RatsJava.g:467:5: '.' name arguments
            	    {
            	    match(input,27,FOLLOW_27_in_postfixExpression2128); if (state.failed) return ;
            	    pushFollow(FOLLOW_name_in_postfixExpression2130);
            	    name();

            	    state._fsp--;
            	    if (state.failed) return ;
            	    pushFollow(FOLLOW_arguments_in_postfixExpression2132);
            	    arguments();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // RatsJava.g:468:5: '.' 'super' arguments
            	    {
            	    match(input,27,FOLLOW_27_in_postfixExpression2138); if (state.failed) return ;
            	    match(input,103,FOLLOW_103_in_postfixExpression2140); if (state.failed) return ;
            	    pushFollow(FOLLOW_arguments_in_postfixExpression2142);
            	    arguments();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;
            	case 3 :
            	    // RatsJava.g:469:5: '.' 'super'
            	    {
            	    match(input,27,FOLLOW_27_in_postfixExpression2148); if (state.failed) return ;
            	    match(input,103,FOLLOW_103_in_postfixExpression2150); if (state.failed) return ;

            	    }
            	    break;
            	case 4 :
            	    // RatsJava.g:470:6: '.' name
            	    {
            	    match(input,27,FOLLOW_27_in_postfixExpression2157); if (state.failed) return ;
            	    pushFollow(FOLLOW_name_in_postfixExpression2159);
            	    name();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;
            	case 5 :
            	    // RatsJava.g:471:6: '[' expression ']'
            	    {
            	    match(input,104,FOLLOW_104_in_postfixExpression2166); if (state.failed) return ;
            	    pushFollow(FOLLOW_expression_in_postfixExpression2168);
            	    expression();

            	    state._fsp--;
            	    if (state.failed) return ;
            	    match(input,105,FOLLOW_105_in_postfixExpression2170); if (state.failed) return ;

            	    }
            	    break;
            	case 6 :
            	    // RatsJava.g:472:6: '++'
            	    {
            	    match(input,99,FOLLOW_99_in_postfixExpression2178); if (state.failed) return ;

            	    }
            	    break;
            	case 7 :
            	    // RatsJava.g:473:6: '--'
            	    {
            	    match(input,100,FOLLOW_100_in_postfixExpression2186); if (state.failed) return ;

            	    }
            	    break;
            	case 8 :
            	    // RatsJava.g:474:6: '.' 'new' typeName arguments ( classBody )?
            	    {
            	    match(input,27,FOLLOW_27_in_postfixExpression2194); if (state.failed) return ;
            	    match(input,106,FOLLOW_106_in_postfixExpression2196); if (state.failed) return ;
            	    pushFollow(FOLLOW_typeName_in_postfixExpression2198);
            	    typeName();

            	    state._fsp--;
            	    if (state.failed) return ;
            	    pushFollow(FOLLOW_arguments_in_postfixExpression2200);
            	    arguments();

            	    state._fsp--;
            	    if (state.failed) return ;
            	    // RatsJava.g:474:35: ( classBody )?
            	    int alt66=2;
            	    int LA66_0 = input.LA(1);

            	    if ( (LA66_0==44) ) {
            	        alt66=1;
            	    }
            	    switch (alt66) {
            	        case 1 :
            	            // RatsJava.g:0:0: classBody
            	            {
            	            pushFollow(FOLLOW_classBody_in_postfixExpression2202);
            	            classBody();

            	            state._fsp--;
            	            if (state.failed) return ;

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop67;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 80, postfixExpression_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "postfixExpression"


    // $ANTLR start "primaryExpression"
    // RatsJava.g:478:1: primaryExpression : ( literal | callExpression | classLiteralExpression | thisCallExpression | thisExpression | superCallExpression | superExpression | primaryIdentifier | newClassExpression | newArrayExpression | '(' expression ')' );
    public final void primaryExpression() throws RecognitionException {
        int primaryExpression_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return ; }
            // RatsJava.g:478:19: ( literal | callExpression | classLiteralExpression | thisCallExpression | thisExpression | superCallExpression | superExpression | primaryIdentifier | newClassExpression | newArrayExpression | '(' expression ')' )
            int alt68=11;
            alt68 = dfa68.predict(input);
            switch (alt68) {
                case 1 :
                    // RatsJava.g:479:3: literal
                    {
                    pushFollow(FOLLOW_literal_in_primaryExpression2222);
                    literal();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // RatsJava.g:480:5: callExpression
                    {
                    pushFollow(FOLLOW_callExpression_in_primaryExpression2228);
                    callExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // RatsJava.g:481:5: classLiteralExpression
                    {
                    pushFollow(FOLLOW_classLiteralExpression_in_primaryExpression2234);
                    classLiteralExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // RatsJava.g:482:5: thisCallExpression
                    {
                    pushFollow(FOLLOW_thisCallExpression_in_primaryExpression2240);
                    thisCallExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // RatsJava.g:483:5: thisExpression
                    {
                    pushFollow(FOLLOW_thisExpression_in_primaryExpression2246);
                    thisExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // RatsJava.g:484:5: superCallExpression
                    {
                    pushFollow(FOLLOW_superCallExpression_in_primaryExpression2252);
                    superCallExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // RatsJava.g:485:5: superExpression
                    {
                    pushFollow(FOLLOW_superExpression_in_primaryExpression2258);
                    superExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 8 :
                    // RatsJava.g:486:5: primaryIdentifier
                    {
                    pushFollow(FOLLOW_primaryIdentifier_in_primaryExpression2264);
                    primaryIdentifier();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 9 :
                    // RatsJava.g:487:5: newClassExpression
                    {
                    pushFollow(FOLLOW_newClassExpression_in_primaryExpression2270);
                    newClassExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 10 :
                    // RatsJava.g:488:5: newArrayExpression
                    {
                    pushFollow(FOLLOW_newArrayExpression_in_primaryExpression2276);
                    newArrayExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 11 :
                    // RatsJava.g:489:5: '(' expression ')'
                    {
                    match(input,40,FOLLOW_40_in_primaryExpression2282); if (state.failed) return ;
                    pushFollow(FOLLOW_expression_in_primaryExpression2284);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,42,FOLLOW_42_in_primaryExpression2286); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 81, primaryExpression_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "primaryExpression"


    // $ANTLR start "callExpression"
    // RatsJava.g:492:1: callExpression : name arguments ;
    public final void callExpression() throws RecognitionException {
        int callExpression_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 82) ) { return ; }
            // RatsJava.g:492:16: ( name arguments )
            // RatsJava.g:493:3: name arguments
            {
            pushFollow(FOLLOW_name_in_callExpression2300);
            name();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_arguments_in_callExpression2302);
            arguments();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 82, callExpression_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "callExpression"


    // $ANTLR start "classLiteralExpression"
    // RatsJava.g:496:1: classLiteralExpression : resultType '.' 'class' ;
    public final void classLiteralExpression() throws RecognitionException {
        int classLiteralExpression_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 83) ) { return ; }
            // RatsJava.g:496:24: ( resultType '.' 'class' )
            // RatsJava.g:497:3: resultType '.' 'class'
            {
            pushFollow(FOLLOW_resultType_in_classLiteralExpression2316);
            resultType();

            state._fsp--;
            if (state.failed) return ;
            match(input,27,FOLLOW_27_in_classLiteralExpression2318); if (state.failed) return ;
            match(input,46,FOLLOW_46_in_classLiteralExpression2320); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 83, classLiteralExpression_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "classLiteralExpression"


    // $ANTLR start "thisCallExpression"
    // RatsJava.g:500:1: thisCallExpression : 'this' arguments ;
    public final void thisCallExpression() throws RecognitionException {
        int thisCallExpression_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 84) ) { return ; }
            // RatsJava.g:500:20: ( 'this' arguments )
            // RatsJava.g:501:3: 'this' arguments
            {
            match(input,107,FOLLOW_107_in_thisCallExpression2334); if (state.failed) return ;
            pushFollow(FOLLOW_arguments_in_thisCallExpression2336);
            arguments();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 84, thisCallExpression_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "thisCallExpression"


    // $ANTLR start "thisExpression"
    // RatsJava.g:504:1: thisExpression : ( qualifiedIdentifier '.' )? 'this' ;
    public final void thisExpression() throws RecognitionException {
        int thisExpression_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 85) ) { return ; }
            // RatsJava.g:504:16: ( ( qualifiedIdentifier '.' )? 'this' )
            // RatsJava.g:505:3: ( qualifiedIdentifier '.' )? 'this'
            {
            // RatsJava.g:505:3: ( qualifiedIdentifier '.' )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==Identifier) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // RatsJava.g:506:5: qualifiedIdentifier '.'
                    {
                    pushFollow(FOLLOW_qualifiedIdentifier_in_thisExpression2358);
                    qualifiedIdentifier();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,27,FOLLOW_27_in_thisExpression2360); if (state.failed) return ;

                    }
                    break;

            }

            match(input,107,FOLLOW_107_in_thisExpression2367); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 85, thisExpression_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "thisExpression"


    // $ANTLR start "superCallExpression"
    // RatsJava.g:510:1: superCallExpression : 'super' arguments ;
    public final void superCallExpression() throws RecognitionException {
        int superCallExpression_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 86) ) { return ; }
            // RatsJava.g:510:21: ( 'super' arguments )
            // RatsJava.g:511:3: 'super' arguments
            {
            match(input,103,FOLLOW_103_in_superCallExpression2381); if (state.failed) return ;
            pushFollow(FOLLOW_arguments_in_superCallExpression2383);
            arguments();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 86, superCallExpression_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "superCallExpression"


    // $ANTLR start "superExpression"
    // RatsJava.g:514:1: superExpression : 'super' ;
    public final void superExpression() throws RecognitionException {
        int superExpression_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 87) ) { return ; }
            // RatsJava.g:514:17: ( 'super' )
            // RatsJava.g:515:3: 'super'
            {
            match(input,103,FOLLOW_103_in_superExpression2398); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 87, superExpression_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "superExpression"


    // $ANTLR start "primaryIdentifier"
    // RatsJava.g:518:1: primaryIdentifier : Identifier ;
    public final void primaryIdentifier() throws RecognitionException {
        int primaryIdentifier_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 88) ) { return ; }
            // RatsJava.g:518:19: ( Identifier )
            // RatsJava.g:519:3: Identifier
            {
            match(input,Identifier,FOLLOW_Identifier_in_primaryIdentifier2412); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 88, primaryIdentifier_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "primaryIdentifier"


    // $ANTLR start "newClassExpression"
    // RatsJava.g:522:1: newClassExpression : 'new' typeName arguments ( classBody )? ;
    public final void newClassExpression() throws RecognitionException {
        int newClassExpression_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 89) ) { return ; }
            // RatsJava.g:522:20: ( 'new' typeName arguments ( classBody )? )
            // RatsJava.g:523:3: 'new' typeName arguments ( classBody )?
            {
            match(input,106,FOLLOW_106_in_newClassExpression2426); if (state.failed) return ;
            pushFollow(FOLLOW_typeName_in_newClassExpression2428);
            typeName();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_arguments_in_newClassExpression2430);
            arguments();

            state._fsp--;
            if (state.failed) return ;
            // RatsJava.g:523:28: ( classBody )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==44) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // RatsJava.g:0:0: classBody
                    {
                    pushFollow(FOLLOW_classBody_in_newClassExpression2432);
                    classBody();

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
            if ( state.backtracking>0 ) { memoize(input, 89, newClassExpression_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "newClassExpression"


    // $ANTLR start "newArrayExpression"
    // RatsJava.g:526:1: newArrayExpression : ( 'new' typeName concreteDimensions ( dimensions )? | 'new' typeName ( dimensions )? arrayInitializer );
    public final void newArrayExpression() throws RecognitionException {
        int newArrayExpression_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 90) ) { return ; }
            // RatsJava.g:526:20: ( 'new' typeName concreteDimensions ( dimensions )? | 'new' typeName ( dimensions )? arrayInitializer )
            int alt73=2;
            alt73 = dfa73.predict(input);
            switch (alt73) {
                case 1 :
                    // RatsJava.g:527:3: 'new' typeName concreteDimensions ( dimensions )?
                    {
                    match(input,106,FOLLOW_106_in_newArrayExpression2447); if (state.failed) return ;
                    pushFollow(FOLLOW_typeName_in_newArrayExpression2449);
                    typeName();

                    state._fsp--;
                    if (state.failed) return ;
                    pushFollow(FOLLOW_concreteDimensions_in_newArrayExpression2451);
                    concreteDimensions();

                    state._fsp--;
                    if (state.failed) return ;
                    // RatsJava.g:527:37: ( dimensions )?
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==104) ) {
                        int LA71_1 = input.LA(2);

                        if ( (LA71_1==105) ) {
                            alt71=1;
                        }
                    }
                    switch (alt71) {
                        case 1 :
                            // RatsJava.g:0:0: dimensions
                            {
                            pushFollow(FOLLOW_dimensions_in_newArrayExpression2453);
                            dimensions();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // RatsJava.g:528:5: 'new' typeName ( dimensions )? arrayInitializer
                    {
                    match(input,106,FOLLOW_106_in_newArrayExpression2460); if (state.failed) return ;
                    pushFollow(FOLLOW_typeName_in_newArrayExpression2462);
                    typeName();

                    state._fsp--;
                    if (state.failed) return ;
                    // RatsJava.g:528:20: ( dimensions )?
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==104) ) {
                        alt72=1;
                    }
                    switch (alt72) {
                        case 1 :
                            // RatsJava.g:0:0: dimensions
                            {
                            pushFollow(FOLLOW_dimensions_in_newArrayExpression2464);
                            dimensions();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_arrayInitializer_in_newArrayExpression2467);
                    arrayInitializer();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 90, newArrayExpression_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "newArrayExpression"


    // $ANTLR start "concreteDimensions"
    // RatsJava.g:531:1: concreteDimensions : ( concreteDimension )+ ;
    public final void concreteDimensions() throws RecognitionException {
        int concreteDimensions_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 91) ) { return ; }
            // RatsJava.g:532:2: ( ( concreteDimension )+ )
            // RatsJava.g:532:5: ( concreteDimension )+
            {
            // RatsJava.g:532:5: ( concreteDimension )+
            int cnt74=0;
            loop74:
            do {
                int alt74=2;
                alt74 = dfa74.predict(input);
                switch (alt74) {
            	case 1 :
            	    // RatsJava.g:0:0: concreteDimension
            	    {
            	    pushFollow(FOLLOW_concreteDimension_in_concreteDimensions2480);
            	    concreteDimension();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt74 >= 1 ) break loop74;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(74, input);
                        throw eee;
                }
                cnt74++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 91, concreteDimensions_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "concreteDimensions"


    // $ANTLR start "concreteDimension"
    // RatsJava.g:535:1: concreteDimension : '[' expression ']' ;
    public final void concreteDimension() throws RecognitionException {
        int concreteDimension_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 92) ) { return ; }
            // RatsJava.g:535:19: ( '[' expression ']' )
            // RatsJava.g:536:3: '[' expression ']'
            {
            match(input,104,FOLLOW_104_in_concreteDimension2494); if (state.failed) return ;
            pushFollow(FOLLOW_expression_in_concreteDimension2496);
            expression();

            state._fsp--;
            if (state.failed) return ;
            match(input,105,FOLLOW_105_in_concreteDimension2498); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 92, concreteDimension_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "concreteDimension"


    // $ANTLR start "arrayInitializer"
    // RatsJava.g:539:1: arrayInitializer : ( '{' variableInitializer ( ',' variableInitializer )* ( ',' )? '}' | '{' ( ',' )? '}' );
    public final void arrayInitializer() throws RecognitionException {
        int arrayInitializer_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 93) ) { return ; }
            // RatsJava.g:539:18: ( '{' variableInitializer ( ',' variableInitializer )* ( ',' )? '}' | '{' ( ',' )? '}' )
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==44) ) {
                int LA78_1 = input.LA(2);

                if ( ((LA78_1>=Identifier && LA78_1<=DecimalLiteral)||LA78_1==40||LA78_1==44||(LA78_1>=95 && LA78_1<=96)||(LA78_1>=99 && LA78_1<=103)||(LA78_1>=106 && LA78_1<=119)) ) {
                    alt78=1;
                }
                else if ( (LA78_1==41||LA78_1==45) ) {
                    alt78=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 78, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }
            switch (alt78) {
                case 1 :
                    // RatsJava.g:540:3: '{' variableInitializer ( ',' variableInitializer )* ( ',' )? '}'
                    {
                    match(input,44,FOLLOW_44_in_arrayInitializer2512); if (state.failed) return ;
                    pushFollow(FOLLOW_variableInitializer_in_arrayInitializer2514);
                    variableInitializer();

                    state._fsp--;
                    if (state.failed) return ;
                    // RatsJava.g:540:27: ( ',' variableInitializer )*
                    loop75:
                    do {
                        int alt75=2;
                        int LA75_0 = input.LA(1);

                        if ( (LA75_0==41) ) {
                            int LA75_1 = input.LA(2);

                            if ( ((LA75_1>=Identifier && LA75_1<=DecimalLiteral)||LA75_1==40||LA75_1==44||(LA75_1>=95 && LA75_1<=96)||(LA75_1>=99 && LA75_1<=103)||(LA75_1>=106 && LA75_1<=119)) ) {
                                alt75=1;
                            }


                        }


                        switch (alt75) {
                    	case 1 :
                    	    // RatsJava.g:541:5: ',' variableInitializer
                    	    {
                    	    match(input,41,FOLLOW_41_in_arrayInitializer2523); if (state.failed) return ;
                    	    pushFollow(FOLLOW_variableInitializer_in_arrayInitializer2525);
                    	    variableInitializer();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop75;
                        }
                    } while (true);

                    // RatsJava.g:542:6: ( ',' )?
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==41) ) {
                        alt76=1;
                    }
                    switch (alt76) {
                        case 1 :
                            // RatsJava.g:543:5: ','
                            {
                            match(input,41,FOLLOW_41_in_arrayInitializer2539); if (state.failed) return ;

                            }
                            break;

                    }

                    match(input,45,FOLLOW_45_in_arrayInitializer2546); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // RatsJava.g:545:5: '{' ( ',' )? '}'
                    {
                    match(input,44,FOLLOW_44_in_arrayInitializer2552); if (state.failed) return ;
                    // RatsJava.g:545:9: ( ',' )?
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==41) ) {
                        alt77=1;
                    }
                    switch (alt77) {
                        case 1 :
                            // RatsJava.g:546:5: ','
                            {
                            match(input,41,FOLLOW_41_in_arrayInitializer2561); if (state.failed) return ;

                            }
                            break;

                    }

                    match(input,45,FOLLOW_45_in_arrayInitializer2568); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 93, arrayInitializer_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "arrayInitializer"


    // $ANTLR start "variableInitializer"
    // RatsJava.g:550:1: variableInitializer : ( arrayInitializer | expression );
    public final void variableInitializer() throws RecognitionException {
        int variableInitializer_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 94) ) { return ; }
            // RatsJava.g:550:21: ( arrayInitializer | expression )
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==44) ) {
                alt79=1;
            }
            else if ( ((LA79_0>=Identifier && LA79_0<=DecimalLiteral)||LA79_0==40||(LA79_0>=95 && LA79_0<=96)||(LA79_0>=99 && LA79_0<=103)||(LA79_0>=106 && LA79_0<=119)) ) {
                alt79=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }
            switch (alt79) {
                case 1 :
                    // RatsJava.g:551:3: arrayInitializer
                    {
                    pushFollow(FOLLOW_arrayInitializer_in_variableInitializer2582);
                    arrayInitializer();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // RatsJava.g:552:5: expression
                    {
                    pushFollow(FOLLOW_expression_in_variableInitializer2588);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 94, variableInitializer_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "variableInitializer"


    // $ANTLR start "arguments"
    // RatsJava.g:555:1: arguments : ( '(' expression ( ',' expression )* ')' | '(' ')' );
    public final void arguments() throws RecognitionException {
        int arguments_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 95) ) { return ; }
            // RatsJava.g:555:11: ( '(' expression ( ',' expression )* ')' | '(' ')' )
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==40) ) {
                int LA81_1 = input.LA(2);

                if ( (LA81_1==42) ) {
                    alt81=2;
                }
                else if ( ((LA81_1>=Identifier && LA81_1<=DecimalLiteral)||LA81_1==40||(LA81_1>=95 && LA81_1<=96)||(LA81_1>=99 && LA81_1<=103)||(LA81_1>=106 && LA81_1<=119)) ) {
                    alt81=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 81, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }
            switch (alt81) {
                case 1 :
                    // RatsJava.g:556:3: '(' expression ( ',' expression )* ')'
                    {
                    match(input,40,FOLLOW_40_in_arguments2602); if (state.failed) return ;
                    pushFollow(FOLLOW_expression_in_arguments2604);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;
                    // RatsJava.g:556:18: ( ',' expression )*
                    loop80:
                    do {
                        int alt80=2;
                        int LA80_0 = input.LA(1);

                        if ( (LA80_0==41) ) {
                            alt80=1;
                        }


                        switch (alt80) {
                    	case 1 :
                    	    // RatsJava.g:557:5: ',' expression
                    	    {
                    	    match(input,41,FOLLOW_41_in_arguments2613); if (state.failed) return ;
                    	    pushFollow(FOLLOW_expression_in_arguments2615);
                    	    expression();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop80;
                        }
                    } while (true);

                    match(input,42,FOLLOW_42_in_arguments2622); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // RatsJava.g:559:5: '(' ')'
                    {
                    match(input,40,FOLLOW_40_in_arguments2628); if (state.failed) return ;
                    match(input,42,FOLLOW_42_in_arguments2630); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 95, arguments_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "arguments"


    // $ANTLR start "resultType"
    // RatsJava.g:562:1: resultType : ( voidType | type );
    public final void resultType() throws RecognitionException {
        int resultType_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 96) ) { return ; }
            // RatsJava.g:562:12: ( voidType | type )
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==108) ) {
                alt82=1;
            }
            else if ( (LA82_0==Identifier||(LA82_0>=109 && LA82_0<=116)) ) {
                alt82=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }
            switch (alt82) {
                case 1 :
                    // RatsJava.g:563:3: voidType
                    {
                    pushFollow(FOLLOW_voidType_in_resultType2644);
                    voidType();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // RatsJava.g:564:5: type
                    {
                    pushFollow(FOLLOW_type_in_resultType2650);
                    type();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 96, resultType_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "resultType"


    // $ANTLR start "voidType"
    // RatsJava.g:567:1: voidType : 'void' ;
    public final void voidType() throws RecognitionException {
        int voidType_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 97) ) { return ; }
            // RatsJava.g:567:10: ( 'void' )
            // RatsJava.g:568:3: 'void'
            {
            match(input,108,FOLLOW_108_in_voidType2664); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 97, voidType_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "voidType"


    // $ANTLR start "type"
    // RatsJava.g:571:1: type : typeName ( dimensions )? ;
    public final void type() throws RecognitionException {
        int type_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 98) ) { return ; }
            // RatsJava.g:571:6: ( typeName ( dimensions )? )
            // RatsJava.g:572:3: typeName ( dimensions )?
            {
            pushFollow(FOLLOW_typeName_in_type2678);
            typeName();

            state._fsp--;
            if (state.failed) return ;
            // RatsJava.g:572:12: ( dimensions )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==104) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // RatsJava.g:0:0: dimensions
                    {
                    pushFollow(FOLLOW_dimensions_in_type2680);
                    dimensions();

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
            if ( state.backtracking>0 ) { memoize(input, 98, type_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "type"


    // $ANTLR start "typeName"
    // RatsJava.g:575:1: typeName : ( primitiveType | classType );
    public final void typeName() throws RecognitionException {
        int typeName_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 99) ) { return ; }
            // RatsJava.g:575:10: ( primitiveType | classType )
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( ((LA84_0>=109 && LA84_0<=116)) ) {
                alt84=1;
            }
            else if ( (LA84_0==Identifier) ) {
                alt84=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;
            }
            switch (alt84) {
                case 1 :
                    // RatsJava.g:576:3: primitiveType
                    {
                    pushFollow(FOLLOW_primitiveType_in_typeName2695);
                    primitiveType();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // RatsJava.g:577:5: classType
                    {
                    pushFollow(FOLLOW_classType_in_typeName2701);
                    classType();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 99, typeName_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "typeName"


    // $ANTLR start "primitiveType"
    // RatsJava.g:580:1: primitiveType : ( 'byte' | 'short' | 'char' | 'int' | 'long' | 'float' | 'double' | 'boolean' );
    public final void primitiveType() throws RecognitionException {
        int primitiveType_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 100) ) { return ; }
            // RatsJava.g:580:15: ( 'byte' | 'short' | 'char' | 'int' | 'long' | 'float' | 'double' | 'boolean' )
            // RatsJava.g:
            {
            if ( (input.LA(1)>=109 && input.LA(1)<=116) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 100, primitiveType_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "primitiveType"


    // $ANTLR start "classType"
    // RatsJava.g:591:1: classType : qualifiedIdentifier ;
    public final void classType() throws RecognitionException {
        int classType_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 101) ) { return ; }
            // RatsJava.g:591:11: ( qualifiedIdentifier )
            // RatsJava.g:592:3: qualifiedIdentifier
            {
            pushFollow(FOLLOW_qualifiedIdentifier_in_classType2771);
            qualifiedIdentifier();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 101, classType_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "classType"


    // $ANTLR start "dimensions"
    // RatsJava.g:595:1: dimensions : ( '[' ']' )+ ;
    public final void dimensions() throws RecognitionException {
        int dimensions_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 102) ) { return ; }
            // RatsJava.g:595:12: ( ( '[' ']' )+ )
            // RatsJava.g:596:3: ( '[' ']' )+
            {
            // RatsJava.g:596:3: ( '[' ']' )+
            int cnt85=0;
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==104) ) {
                    int LA85_2 = input.LA(2);

                    if ( (LA85_2==105) ) {
                        alt85=1;
                    }


                }


                switch (alt85) {
            	case 1 :
            	    // RatsJava.g:597:5: '[' ']'
            	    {
            	    match(input,104,FOLLOW_104_in_dimensions2792); if (state.failed) return ;
            	    match(input,105,FOLLOW_105_in_dimensions2794); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt85 >= 1 ) break loop85;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(85, input);
                        throw eee;
                }
                cnt85++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 102, dimensions_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "dimensions"


    // $ANTLR start "literal"
    // RatsJava.g:601:1: literal : ( FloatingPointLiteral | integerLiteral | CharacterLiteral | StringLiteral | booleanLiteral | nullLiteral );
    public final void literal() throws RecognitionException {
        int literal_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 103) ) { return ; }
            // RatsJava.g:601:9: ( FloatingPointLiteral | integerLiteral | CharacterLiteral | StringLiteral | booleanLiteral | nullLiteral )
            int alt86=6;
            switch ( input.LA(1) ) {
            case FloatingPointLiteral:
                {
                alt86=1;
                }
                break;
            case HexLiteral:
            case OctalLiteral:
            case DecimalLiteral:
                {
                alt86=2;
                }
                break;
            case CharacterLiteral:
                {
                alt86=3;
                }
                break;
            case StringLiteral:
                {
                alt86=4;
                }
                break;
            case 117:
            case 118:
                {
                alt86=5;
                }
                break;
            case 119:
                {
                alt86=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;
            }

            switch (alt86) {
                case 1 :
                    // RatsJava.g:602:3: FloatingPointLiteral
                    {
                    match(input,FloatingPointLiteral,FOLLOW_FloatingPointLiteral_in_literal2813); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // RatsJava.g:603:5: integerLiteral
                    {
                    pushFollow(FOLLOW_integerLiteral_in_literal2819);
                    integerLiteral();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // RatsJava.g:604:5: CharacterLiteral
                    {
                    match(input,CharacterLiteral,FOLLOW_CharacterLiteral_in_literal2825); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // RatsJava.g:605:5: StringLiteral
                    {
                    match(input,StringLiteral,FOLLOW_StringLiteral_in_literal2831); if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // RatsJava.g:606:5: booleanLiteral
                    {
                    pushFollow(FOLLOW_booleanLiteral_in_literal2837);
                    booleanLiteral();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // RatsJava.g:607:5: nullLiteral
                    {
                    pushFollow(FOLLOW_nullLiteral_in_literal2843);
                    nullLiteral();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 103, literal_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "literal"


    // $ANTLR start "integerLiteral"
    // RatsJava.g:610:1: integerLiteral : ( HexLiteral | OctalLiteral | DecimalLiteral );
    public final void integerLiteral() throws RecognitionException {
        int integerLiteral_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 104) ) { return ; }
            // RatsJava.g:610:16: ( HexLiteral | OctalLiteral | DecimalLiteral )
            // RatsJava.g:
            {
            if ( (input.LA(1)>=HexLiteral && input.LA(1)<=DecimalLiteral) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 104, integerLiteral_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "integerLiteral"


    // $ANTLR start "booleanLiteral"
    // RatsJava.g:616:1: booleanLiteral : ( 'true' | 'false' );
    public final void booleanLiteral() throws RecognitionException {
        int booleanLiteral_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 105) ) { return ; }
            // RatsJava.g:616:16: ( 'true' | 'false' )
            // RatsJava.g:
            {
            if ( (input.LA(1)>=117 && input.LA(1)<=118) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 105, booleanLiteral_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "booleanLiteral"


    // $ANTLR start "nullLiteral"
    // RatsJava.g:621:1: nullLiteral : 'null' ;
    public final void nullLiteral() throws RecognitionException {
        int nullLiteral_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 106) ) { return ; }
            // RatsJava.g:621:13: ( 'null' )
            // RatsJava.g:622:3: 'null'
            {
            match(input,119,FOLLOW_119_in_nullLiteral2905); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 106, nullLiteral_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "nullLiteral"


    // $ANTLR start "qualifiedIdentifier"
    // RatsJava.g:625:1: qualifiedIdentifier : Identifier ( '.' Identifier )* ;
    public final void qualifiedIdentifier() throws RecognitionException {
        int qualifiedIdentifier_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 107) ) { return ; }
            // RatsJava.g:625:21: ( Identifier ( '.' Identifier )* )
            // RatsJava.g:626:3: Identifier ( '.' Identifier )*
            {
            match(input,Identifier,FOLLOW_Identifier_in_qualifiedIdentifier2919); if (state.failed) return ;
            // RatsJava.g:626:14: ( '.' Identifier )*
            loop87:
            do {
                int alt87=2;
                int LA87_0 = input.LA(1);

                if ( (LA87_0==27) ) {
                    int LA87_2 = input.LA(2);

                    if ( (LA87_2==Identifier) ) {
                        alt87=1;
                    }


                }


                switch (alt87) {
            	case 1 :
            	    // RatsJava.g:627:5: '.' Identifier
            	    {
            	    match(input,27,FOLLOW_27_in_qualifiedIdentifier2928); if (state.failed) return ;
            	    match(input,Identifier,FOLLOW_Identifier_in_qualifiedIdentifier2930); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop87;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 107, qualifiedIdentifier_StartIndex); }
        }
        return ;
    }
    // $ANTLR end "qualifiedIdentifier"

    // $ANTLR start synpred18_RatsJava
    public final void synpred18_RatsJava_fragment() throws RecognitionException {   
        // RatsJava.g:97:3: ( finalModifier modifiers )
        // RatsJava.g:97:3: finalModifier modifiers
        {
        pushFollow(FOLLOW_finalModifier_in_synpred18_RatsJava264);
        finalModifier();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_modifiers_in_synpred18_RatsJava266);
        modifiers();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred18_RatsJava

    // $ANTLR start synpred61_RatsJava
    public final void synpred61_RatsJava_fragment() throws RecognitionException {   
        // RatsJava.g:231:3: ( 'if' parExpression statement 'else' statement )
        // RatsJava.g:231:3: 'if' parExpression statement 'else' statement
        {
        match(input,51,FOLLOW_51_in_synpred61_RatsJava948); if (state.failed) return ;
        pushFollow(FOLLOW_parExpression_in_synpred61_RatsJava950);
        parExpression();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_statement_in_synpred61_RatsJava952);
        statement();

        state._fsp--;
        if (state.failed) return ;
        match(input,52,FOLLOW_52_in_synpred61_RatsJava954); if (state.failed) return ;
        pushFollow(FOLLOW_statement_in_synpred61_RatsJava956);
        statement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred61_RatsJava

    // $ANTLR start synpred69_RatsJava
    public final void synpred69_RatsJava_fragment() throws RecognitionException {   
        // RatsJava.g:263:3: ( 'try' block ( catchClause )* 'finally' block )
        // RatsJava.g:263:3: 'try' block ( catchClause )* 'finally' block
        {
        match(input,56,FOLLOW_56_in_synpred69_RatsJava1125); if (state.failed) return ;
        pushFollow(FOLLOW_block_in_synpred69_RatsJava1127);
        block();

        state._fsp--;
        if (state.failed) return ;
        // RatsJava.g:263:15: ( catchClause )*
        loop91:
        do {
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==58) ) {
                alt91=1;
            }


            switch (alt91) {
        	case 1 :
        	    // RatsJava.g:0:0: catchClause
        	    {
        	    pushFollow(FOLLOW_catchClause_in_synpred69_RatsJava1129);
        	    catchClause();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop91;
            }
        } while (true);

        match(input,57,FOLLOW_57_in_synpred69_RatsJava1132); if (state.failed) return ;
        pushFollow(FOLLOW_block_in_synpred69_RatsJava1134);
        block();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred69_RatsJava

    // $ANTLR start synpred80_RatsJava
    public final void synpred80_RatsJava_fragment() throws RecognitionException {   
        // RatsJava.g:334:3: ( conditionalExpression assignmentOperator expression )
        // RatsJava.g:334:3: conditionalExpression assignmentOperator expression
        {
        pushFollow(FOLLOW_conditionalExpression_in_synpred80_RatsJava1472);
        conditionalExpression();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_assignmentOperator_in_synpred80_RatsJava1474);
        assignmentOperator();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_expression_in_synpred80_RatsJava1476);
        expression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred80_RatsJava

    // $ANTLR start synpred92_RatsJava
    public final void synpred92_RatsJava_fragment() throws RecognitionException {   
        // RatsJava.g:354:3: ( logicalOrExpression '?' expression ':' conditionalExpression )
        // RatsJava.g:354:3: logicalOrExpression '?' expression ':' conditionalExpression
        {
        pushFollow(FOLLOW_logicalOrExpression_in_synpred92_RatsJava1576);
        logicalOrExpression();

        state._fsp--;
        if (state.failed) return ;
        match(input,79,FOLLOW_79_in_synpred92_RatsJava1578); if (state.failed) return ;
        pushFollow(FOLLOW_expression_in_synpred92_RatsJava1580);
        expression();

        state._fsp--;
        if (state.failed) return ;
        match(input,61,FOLLOW_61_in_synpred92_RatsJava1582); if (state.failed) return ;
        pushFollow(FOLLOW_conditionalExpression_in_synpred92_RatsJava1587);
        conditionalExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred92_RatsJava

    // $ANTLR start synpred100_RatsJava
    public final void synpred100_RatsJava_fragment() throws RecognitionException {   
        // RatsJava.g:389:3: ( relationalExpression 'instanceof' type )
        // RatsJava.g:389:3: relationalExpression 'instanceof' type
        {
        pushFollow(FOLLOW_relationalExpression_in_synpred100_RatsJava1753);
        relationalExpression();

        state._fsp--;
        if (state.failed) return ;
        match(input,87,FOLLOW_87_in_synpred100_RatsJava1755); if (state.failed) return ;
        pushFollow(FOLLOW_type_in_synpred100_RatsJava1757);
        type();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred100_RatsJava

    // $ANTLR start synpred119_RatsJava
    public final void synpred119_RatsJava_fragment() throws RecognitionException {   
        // RatsJava.g:444:5: ( basicCastExpression )
        // RatsJava.g:444:5: basicCastExpression
        {
        pushFollow(FOLLOW_basicCastExpression_in_synpred119_RatsJava2023);
        basicCastExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred119_RatsJava

    // $ANTLR start synpred120_RatsJava
    public final void synpred120_RatsJava_fragment() throws RecognitionException {   
        // RatsJava.g:445:5: ( castExpression )
        // RatsJava.g:445:5: castExpression
        {
        pushFollow(FOLLOW_castExpression_in_synpred120_RatsJava2029);
        castExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred120_RatsJava

    // $ANTLR start synpred146_RatsJava
    public final void synpred146_RatsJava_fragment() throws RecognitionException {   
        // RatsJava.g:532:5: ( concreteDimension )
        // RatsJava.g:532:5: concreteDimension
        {
        pushFollow(FOLLOW_concreteDimension_in_synpred146_RatsJava2480);
        concreteDimension();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred146_RatsJava

    // Delegated rules

    public final boolean synpred80_RatsJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred80_RatsJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred69_RatsJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred69_RatsJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred146_RatsJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred146_RatsJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred119_RatsJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred119_RatsJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_RatsJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_RatsJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred120_RatsJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred120_RatsJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred61_RatsJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred61_RatsJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred100_RatsJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred100_RatsJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred92_RatsJava() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred92_RatsJava_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA15 dfa15 = new DFA15(this);
    protected DFA28 dfa28 = new DFA28(this);
    protected DFA29 dfa29 = new DFA29(this);
    protected DFA30 dfa30 = new DFA30(this);
    protected DFA37 dfa37 = new DFA37(this);
    protected DFA50 dfa50 = new DFA50(this);
    protected DFA51 dfa51 = new DFA51(this);
    protected DFA58 dfa58 = new DFA58(this);
    protected DFA64 dfa64 = new DFA64(this);
    protected DFA67 dfa67 = new DFA67(this);
    protected DFA68 dfa68 = new DFA68(this);
    protected DFA73 dfa73 = new DFA73(this);
    protected DFA74 dfa74 = new DFA74(this);
    static final String DFA15_eotS =
        "\21\uffff";
    static final String DFA15_eofS =
        "\21\uffff";
    static final String DFA15_minS =
        "\4\5\3\uffff\1\5\2\uffff\1\151\1\31\1\5\1\uffff\1\5\1\uffff\1\5";
    static final String DFA15_maxS =
        "\2\164\2\150\3\uffff\1\164\2\uffff\1\151\1\150\1\5\1\uffff\1\150"+
        "\1\uffff\1\150";
    static final String DFA15_acceptS =
        "\4\uffff\1\2\1\4\1\5\1\uffff\1\6\1\7\3\uffff\1\3\1\uffff\1\1\1\uffff";
    static final String DFA15_specialS =
        "\21\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\3\23\uffff\1\11\3\uffff\3\7\1\1\7\7\4\uffff\1\10\1\uffff"+
            "\1\5\1\6\74\uffff\1\4\10\2",
            "\1\3\27\uffff\13\7\4\uffff\1\10\1\uffff\1\5\1\6\74\uffff\1"+
            "\4\10\2",
            "\1\13\142\uffff\1\12",
            "\1\13\25\uffff\1\14\14\uffff\1\15\77\uffff\1\12",
            "",
            "",
            "",
            "\1\3\27\uffff\13\7\6\uffff\1\5\1\6\74\uffff\1\4\10\2",
            "",
            "",
            "\1\16",
            "\1\17\16\uffff\1\4\1\17\1\uffff\1\17\74\uffff\1\17",
            "\1\20",
            "",
            "\1\13\142\uffff\1\12",
            "",
            "\1\13\25\uffff\1\14\114\uffff\1\12"
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "128:1: declaration : ( fieldDeclaration | methodDeclaration | constructorDeclaration | classDeclaration | interfaceDeclaration | blockDeclaration | emptyDeclaration );";
        }
    }
    static final String DFA28_eotS =
        "\13\uffff";
    static final String DFA28_eofS =
        "\13\uffff";
    static final String DFA28_minS =
        "\1\5\1\uffff\3\5\1\uffff\1\151\4\5";
    static final String DFA28_maxS =
        "\1\167\1\uffff\1\164\2\150\1\uffff\1\151\1\153\1\167\2\150";
    static final String DFA28_acceptS =
        "\1\uffff\1\1\3\uffff\1\2\5\uffff";
    static final String DFA28_specialS =
        "\13\uffff}>";
    static final String[] DFA28_transitionS = {
            "\1\4\6\5\15\uffff\1\5\3\uffff\7\1\1\2\3\1\1\5\3\uffff\1\5\1"+
            "\uffff\2\1\3\uffff\1\5\1\uffff\4\5\2\uffff\1\5\3\uffff\5\5\33"+
            "\uffff\2\5\2\uffff\5\5\2\uffff\3\5\10\3\3\5",
            "",
            "\1\1\27\uffff\13\1\1\5\5\uffff\2\1\75\uffff\10\1",
            "\1\1\25\uffff\1\5\114\uffff\1\6",
            "\1\1\23\uffff\1\5\1\uffff\1\7\1\5\13\uffff\1\5\2\uffff\1\5"+
            "\21\uffff\1\5\6\uffff\41\5\3\uffff\1\10",
            "",
            "\1\11",
            "\1\12\50\uffff\1\5\70\uffff\1\5\2\uffff\2\5",
            "\7\5\34\uffff\1\5\66\uffff\2\5\2\uffff\5\5\1\uffff\1\11\16"+
            "\5",
            "\1\1\25\uffff\1\5\114\uffff\1\6",
            "\1\1\23\uffff\1\5\1\uffff\1\7\1\5\13\uffff\1\5\2\uffff\1\5"+
            "\30\uffff\41\5\3\uffff\1\10"
    };

    static final short[] DFA28_eot = DFA.unpackEncodedString(DFA28_eotS);
    static final short[] DFA28_eof = DFA.unpackEncodedString(DFA28_eofS);
    static final char[] DFA28_min = DFA.unpackEncodedStringToUnsignedChars(DFA28_minS);
    static final char[] DFA28_max = DFA.unpackEncodedStringToUnsignedChars(DFA28_maxS);
    static final short[] DFA28_accept = DFA.unpackEncodedString(DFA28_acceptS);
    static final short[] DFA28_special = DFA.unpackEncodedString(DFA28_specialS);
    static final short[][] DFA28_transition;

    static {
        int numStates = DFA28_transitionS.length;
        DFA28_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA28_transition[i] = DFA.unpackEncodedString(DFA28_transitionS[i]);
        }
    }

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = DFA28_eot;
            this.eof = DFA28_eof;
            this.min = DFA28_min;
            this.max = DFA28_max;
            this.accept = DFA28_accept;
            this.special = DFA28_special;
            this.transition = DFA28_transition;
        }
        public String getDescription() {
            return "195:1: declarationOrStatement : ( inBlockDeclaration | statement );";
        }
    }
    static final String DFA29_eotS =
        "\7\uffff";
    static final String DFA29_eofS =
        "\7\uffff";
    static final String DFA29_minS =
        "\3\5\3\uffff\1\5";
    static final String DFA29_maxS =
        "\3\164\3\uffff\1\164";
    static final String DFA29_acceptS =
        "\3\uffff\1\1\1\2\1\3\1\uffff";
    static final String DFA29_specialS =
        "\7\uffff}>";
    static final String[] DFA29_transitionS = {
            "\1\3\27\uffff\5\2\1\1\5\2\6\uffff\1\4\1\5\75\uffff\10\3",
            "\1\3\27\uffff\13\6\6\uffff\1\4\1\5\75\uffff\10\3",
            "\1\3\27\uffff\13\2\6\uffff\1\4\1\5\75\uffff\10\3",
            "",
            "",
            "",
            "\1\3\27\uffff\13\6\6\uffff\1\4\1\5\75\uffff\10\3"
    };

    static final short[] DFA29_eot = DFA.unpackEncodedString(DFA29_eotS);
    static final short[] DFA29_eof = DFA.unpackEncodedString(DFA29_eofS);
    static final char[] DFA29_min = DFA.unpackEncodedStringToUnsignedChars(DFA29_minS);
    static final char[] DFA29_max = DFA.unpackEncodedStringToUnsignedChars(DFA29_maxS);
    static final short[] DFA29_accept = DFA.unpackEncodedString(DFA29_acceptS);
    static final short[] DFA29_special = DFA.unpackEncodedString(DFA29_specialS);
    static final short[][] DFA29_transition;

    static {
        int numStates = DFA29_transitionS.length;
        DFA29_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA29_transition[i] = DFA.unpackEncodedString(DFA29_transitionS[i]);
        }
    }

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = DFA29_eot;
            this.eof = DFA29_eof;
            this.min = DFA29_min;
            this.max = DFA29_max;
            this.accept = DFA29_accept;
            this.special = DFA29_special;
            this.transition = DFA29_transition;
        }
        public String getDescription() {
            return "200:1: inBlockDeclaration : ( variableDeclaration | classDeclaration | interfaceDeclaration );";
        }
    }
    static final String DFA30_eotS =
        "\22\uffff";
    static final String DFA30_eofS =
        "\22\uffff";
    static final String DFA30_minS =
        "\1\5\14\uffff\1\31\4\uffff";
    static final String DFA30_maxS =
        "\1\167\14\uffff\1\150\4\uffff";
    static final String DFA30_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\uffff\1\16\1\17\1\20\1\15";
    static final String DFA30_specialS =
        "\22\uffff}>";
    static final String[] DFA30_transitionS = {
            "\1\15\6\16\15\uffff\1\20\12\uffff\1\10\3\uffff\1\16\3\uffff"+
            "\1\1\6\uffff\1\2\1\uffff\1\3\1\4\1\5\1\6\2\uffff\1\7\3\uffff"+
            "\1\11\1\12\1\13\1\14\1\17\33\uffff\2\16\2\uffff\5\16\2\uffff"+
            "\16\16",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\16\1\uffff\2\16\13\uffff\1\16\2\uffff\1\16\21\uffff\1\21"+
            "\6\uffff\41\16\3\uffff\1\16",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA30_eot = DFA.unpackEncodedString(DFA30_eotS);
    static final short[] DFA30_eof = DFA.unpackEncodedString(DFA30_eofS);
    static final char[] DFA30_min = DFA.unpackEncodedStringToUnsignedChars(DFA30_minS);
    static final char[] DFA30_max = DFA.unpackEncodedStringToUnsignedChars(DFA30_maxS);
    static final short[] DFA30_accept = DFA.unpackEncodedString(DFA30_acceptS);
    static final short[] DFA30_special = DFA.unpackEncodedString(DFA30_specialS);
    static final short[][] DFA30_transition;

    static {
        int numStates = DFA30_transitionS.length;
        DFA30_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA30_transition[i] = DFA.unpackEncodedString(DFA30_transitionS[i]);
        }
    }

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = DFA30_eot;
            this.eof = DFA30_eof;
            this.min = DFA30_min;
            this.max = DFA30_max;
            this.accept = DFA30_accept;
            this.special = DFA30_special;
            this.transition = DFA30_transition;
        }
        public String getDescription() {
            return "211:1: statement : ( block | conditionalStatement | forStatement | whileStatement | doWhileStatement | tryCatchFinallyStatement | switchStatement | synchronizedStatement | returnStatement | throwStatement | breakStatement | continueStatement | labeledStatement | expressionStatement | assertStatement | emptyStatement );";
        }
    }
    static final String DFA37_eotS =
        "\12\uffff";
    static final String DFA37_eofS =
        "\12\uffff";
    static final String DFA37_minS =
        "\1\5\1\uffff\2\5\1\uffff\1\151\4\5";
    static final String DFA37_maxS =
        "\1\167\1\uffff\2\150\1\uffff\1\151\1\153\1\167\2\150";
    static final String DFA37_acceptS =
        "\1\uffff\1\1\2\uffff\1\2\5\uffff";
    static final String DFA37_specialS =
        "\12\uffff}>";
    static final String[] DFA37_transitionS = {
            "\1\3\6\4\15\uffff\1\4\3\uffff\13\1\1\4\66\uffff\2\4\2\uffff"+
            "\5\4\2\uffff\3\4\10\2\3\4",
            "",
            "\1\1\25\uffff\1\4\114\uffff\1\5",
            "\1\1\23\uffff\1\4\1\uffff\1\6\1\4\13\uffff\2\4\1\uffff\1\4"+
            "\30\uffff\41\4\3\uffff\1\7",
            "",
            "\1\10",
            "\1\11\50\uffff\1\4\70\uffff\1\4\2\uffff\2\4",
            "\7\4\34\uffff\1\4\66\uffff\2\4\2\uffff\5\4\1\uffff\1\10\16"+
            "\4",
            "\1\1\25\uffff\1\4\114\uffff\1\5",
            "\1\1\23\uffff\1\4\1\uffff\1\6\1\4\13\uffff\2\4\1\uffff\1\4"+
            "\30\uffff\41\4\3\uffff\1\7"
    };

    static final short[] DFA37_eot = DFA.unpackEncodedString(DFA37_eotS);
    static final short[] DFA37_eof = DFA.unpackEncodedString(DFA37_eofS);
    static final char[] DFA37_min = DFA.unpackEncodedStringToUnsignedChars(DFA37_minS);
    static final char[] DFA37_max = DFA.unpackEncodedStringToUnsignedChars(DFA37_maxS);
    static final short[] DFA37_accept = DFA.unpackEncodedString(DFA37_acceptS);
    static final short[] DFA37_special = DFA.unpackEncodedString(DFA37_specialS);
    static final short[][] DFA37_transition;

    static {
        int numStates = DFA37_transitionS.length;
        DFA37_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA37_transition[i] = DFA.unpackEncodedString(DFA37_transitionS[i]);
        }
    }

    class DFA37 extends DFA {

        public DFA37(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 37;
            this.eot = DFA37_eot;
            this.eof = DFA37_eof;
            this.min = DFA37_min;
            this.max = DFA37_max;
            this.accept = DFA37_accept;
            this.special = DFA37_special;
            this.transition = DFA37_transition;
        }
        public String getDescription() {
            return "243:1: basicForControl : ( variableModifiers type declarators ';' ( expression )? ';' ( expressionList )? | ( expressionList )? ';' ( expression )? ';' ( expressionList )? );";
        }
    }
    static final String DFA50_eotS =
        "\26\uffff";
    static final String DFA50_eofS =
        "\26\uffff";
    static final String DFA50_minS =
        "\1\5\23\0\2\uffff";
    static final String DFA50_maxS =
        "\1\167\23\0\2\uffff";
    static final String DFA50_acceptS =
        "\24\uffff\1\1\1\2";
    static final String DFA50_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\1\20\1\21\1\22\2\uffff}>";
    static final String[] DFA50_transitionS = {
            "\1\16\1\10\1\12\1\13\3\11\34\uffff\1\7\66\uffff\1\1\1\2\2\uffff"+
            "\1\3\1\4\1\5\1\6\1\22\2\uffff\1\23\1\21\1\17\10\20\2\14\1\15",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    static final short[] DFA50_eot = DFA.unpackEncodedString(DFA50_eotS);
    static final short[] DFA50_eof = DFA.unpackEncodedString(DFA50_eofS);
    static final char[] DFA50_min = DFA.unpackEncodedStringToUnsignedChars(DFA50_minS);
    static final char[] DFA50_max = DFA.unpackEncodedStringToUnsignedChars(DFA50_maxS);
    static final short[] DFA50_accept = DFA.unpackEncodedString(DFA50_acceptS);
    static final short[] DFA50_special = DFA.unpackEncodedString(DFA50_specialS);
    static final short[][] DFA50_transition;

    static {
        int numStates = DFA50_transitionS.length;
        DFA50_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA50_transition[i] = DFA.unpackEncodedString(DFA50_transitionS[i]);
        }
    }

    class DFA50 extends DFA {

        public DFA50(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 50;
            this.eot = DFA50_eot;
            this.eof = DFA50_eof;
            this.min = DFA50_min;
            this.max = DFA50_max;
            this.accept = DFA50_accept;
            this.special = DFA50_special;
            this.transition = DFA50_transition;
        }
        public String getDescription() {
            return "333:1: expression : ( conditionalExpression assignmentOperator expression | conditionalExpression );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA50_1 = input.LA(1);

                         
                        int index50_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred80_RatsJava()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index50_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA50_2 = input.LA(1);

                         
                        int index50_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred80_RatsJava()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index50_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA50_3 = input.LA(1);

                         
                        int index50_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred80_RatsJava()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index50_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA50_4 = input.LA(1);

                         
                        int index50_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred80_RatsJava()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index50_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA50_5 = input.LA(1);

                         
                        int index50_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred80_RatsJava()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index50_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA50_6 = input.LA(1);

                         
                        int index50_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred80_RatsJava()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index50_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA50_7 = input.LA(1);

                         
                        int index50_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred80_RatsJava()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index50_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA50_8 = input.LA(1);

                         
                        int index50_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred80_RatsJava()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index50_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA50_9 = input.LA(1);

                         
                        int index50_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred80_RatsJava()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index50_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA50_10 = input.LA(1);

                         
                        int index50_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred80_RatsJava()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index50_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA50_11 = input.LA(1);

                         
                        int index50_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred80_RatsJava()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index50_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA50_12 = input.LA(1);

                         
                        int index50_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred80_RatsJava()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index50_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA50_13 = input.LA(1);

                         
                        int index50_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred80_RatsJava()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index50_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA50_14 = input.LA(1);

                         
                        int index50_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred80_RatsJava()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index50_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA50_15 = input.LA(1);

                         
                        int index50_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred80_RatsJava()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index50_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA50_16 = input.LA(1);

                         
                        int index50_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred80_RatsJava()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index50_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA50_17 = input.LA(1);

                         
                        int index50_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred80_RatsJava()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index50_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA50_18 = input.LA(1);

                         
                        int index50_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred80_RatsJava()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index50_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA50_19 = input.LA(1);

                         
                        int index50_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred80_RatsJava()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index50_19);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 50, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA51_eotS =
        "\26\uffff";
    static final String DFA51_eofS =
        "\26\uffff";
    static final String DFA51_minS =
        "\1\5\23\0\2\uffff";
    static final String DFA51_maxS =
        "\1\167\23\0\2\uffff";
    static final String DFA51_acceptS =
        "\24\uffff\1\1\1\2";
    static final String DFA51_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\1\20\1\21\1\22\2\uffff}>";
    static final String[] DFA51_transitionS = {
            "\1\16\1\10\1\12\1\13\3\11\34\uffff\1\7\66\uffff\1\1\1\2\2\uffff"+
            "\1\3\1\4\1\5\1\6\1\22\2\uffff\1\23\1\21\1\17\10\20\2\14\1\15",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    static final short[] DFA51_eot = DFA.unpackEncodedString(DFA51_eotS);
    static final short[] DFA51_eof = DFA.unpackEncodedString(DFA51_eofS);
    static final char[] DFA51_min = DFA.unpackEncodedStringToUnsignedChars(DFA51_minS);
    static final char[] DFA51_max = DFA.unpackEncodedStringToUnsignedChars(DFA51_maxS);
    static final short[] DFA51_accept = DFA.unpackEncodedString(DFA51_acceptS);
    static final short[] DFA51_special = DFA.unpackEncodedString(DFA51_specialS);
    static final short[][] DFA51_transition;

    static {
        int numStates = DFA51_transitionS.length;
        DFA51_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA51_transition[i] = DFA.unpackEncodedString(DFA51_transitionS[i]);
        }
    }

    class DFA51 extends DFA {

        public DFA51(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 51;
            this.eot = DFA51_eot;
            this.eof = DFA51_eof;
            this.min = DFA51_min;
            this.max = DFA51_max;
            this.accept = DFA51_accept;
            this.special = DFA51_special;
            this.transition = DFA51_transition;
        }
        public String getDescription() {
            return "353:1: conditionalExpression : ( logicalOrExpression '?' expression ':' conditionalExpression | logicalOrExpression );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA51_1 = input.LA(1);

                         
                        int index51_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred92_RatsJava()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index51_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA51_2 = input.LA(1);

                         
                        int index51_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred92_RatsJava()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index51_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA51_3 = input.LA(1);

                         
                        int index51_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred92_RatsJava()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index51_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA51_4 = input.LA(1);

                         
                        int index51_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred92_RatsJava()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index51_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA51_5 = input.LA(1);

                         
                        int index51_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred92_RatsJava()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index51_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA51_6 = input.LA(1);

                         
                        int index51_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred92_RatsJava()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index51_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA51_7 = input.LA(1);

                         
                        int index51_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred92_RatsJava()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index51_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA51_8 = input.LA(1);

                         
                        int index51_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred92_RatsJava()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index51_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA51_9 = input.LA(1);

                         
                        int index51_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred92_RatsJava()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index51_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA51_10 = input.LA(1);

                         
                        int index51_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred92_RatsJava()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index51_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA51_11 = input.LA(1);

                         
                        int index51_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred92_RatsJava()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index51_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA51_12 = input.LA(1);

                         
                        int index51_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred92_RatsJava()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index51_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA51_13 = input.LA(1);

                         
                        int index51_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred92_RatsJava()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index51_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA51_14 = input.LA(1);

                         
                        int index51_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred92_RatsJava()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index51_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA51_15 = input.LA(1);

                         
                        int index51_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred92_RatsJava()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index51_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA51_16 = input.LA(1);

                         
                        int index51_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred92_RatsJava()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index51_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA51_17 = input.LA(1);

                         
                        int index51_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred92_RatsJava()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index51_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA51_18 = input.LA(1);

                         
                        int index51_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred92_RatsJava()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index51_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA51_19 = input.LA(1);

                         
                        int index51_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred92_RatsJava()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index51_19);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 51, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA58_eotS =
        "\26\uffff";
    static final String DFA58_eofS =
        "\26\uffff";
    static final String DFA58_minS =
        "\1\5\23\0\2\uffff";
    static final String DFA58_maxS =
        "\1\167\23\0\2\uffff";
    static final String DFA58_acceptS =
        "\24\uffff\1\1\1\2";
    static final String DFA58_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\1\20\1\21\1\22\2\uffff}>";
    static final String[] DFA58_transitionS = {
            "\1\16\1\10\1\12\1\13\3\11\34\uffff\1\7\66\uffff\1\1\1\2\2\uffff"+
            "\1\3\1\4\1\5\1\6\1\22\2\uffff\1\23\1\21\1\17\10\20\2\14\1\15",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    static final short[] DFA58_eot = DFA.unpackEncodedString(DFA58_eotS);
    static final short[] DFA58_eof = DFA.unpackEncodedString(DFA58_eofS);
    static final char[] DFA58_min = DFA.unpackEncodedStringToUnsignedChars(DFA58_minS);
    static final char[] DFA58_max = DFA.unpackEncodedStringToUnsignedChars(DFA58_maxS);
    static final short[] DFA58_accept = DFA.unpackEncodedString(DFA58_acceptS);
    static final short[] DFA58_special = DFA.unpackEncodedString(DFA58_specialS);
    static final short[][] DFA58_transition;

    static {
        int numStates = DFA58_transitionS.length;
        DFA58_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA58_transition[i] = DFA.unpackEncodedString(DFA58_transitionS[i]);
        }
    }

    class DFA58 extends DFA {

        public DFA58(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 58;
            this.eot = DFA58_eot;
            this.eof = DFA58_eof;
            this.min = DFA58_min;
            this.max = DFA58_max;
            this.accept = DFA58_accept;
            this.special = DFA58_special;
            this.transition = DFA58_transition;
        }
        public String getDescription() {
            return "388:1: instanceOfExpression : ( relationalExpression 'instanceof' type | relationalExpression );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA58_1 = input.LA(1);

                         
                        int index58_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_RatsJava()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index58_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA58_2 = input.LA(1);

                         
                        int index58_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_RatsJava()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index58_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA58_3 = input.LA(1);

                         
                        int index58_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_RatsJava()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index58_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA58_4 = input.LA(1);

                         
                        int index58_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_RatsJava()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index58_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA58_5 = input.LA(1);

                         
                        int index58_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_RatsJava()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index58_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA58_6 = input.LA(1);

                         
                        int index58_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_RatsJava()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index58_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA58_7 = input.LA(1);

                         
                        int index58_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_RatsJava()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index58_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA58_8 = input.LA(1);

                         
                        int index58_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_RatsJava()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index58_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA58_9 = input.LA(1);

                         
                        int index58_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_RatsJava()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index58_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA58_10 = input.LA(1);

                         
                        int index58_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_RatsJava()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index58_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA58_11 = input.LA(1);

                         
                        int index58_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_RatsJava()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index58_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA58_12 = input.LA(1);

                         
                        int index58_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_RatsJava()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index58_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA58_13 = input.LA(1);

                         
                        int index58_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_RatsJava()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index58_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA58_14 = input.LA(1);

                         
                        int index58_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_RatsJava()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index58_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA58_15 = input.LA(1);

                         
                        int index58_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_RatsJava()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index58_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA58_16 = input.LA(1);

                         
                        int index58_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_RatsJava()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index58_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA58_17 = input.LA(1);

                         
                        int index58_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_RatsJava()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index58_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA58_18 = input.LA(1);

                         
                        int index58_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_RatsJava()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index58_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA58_19 = input.LA(1);

                         
                        int index58_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred100_RatsJava()) ) {s = 20;}

                        else if ( (true) ) {s = 21;}

                         
                        input.seek(index58_19);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 58, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA64_eotS =
        "\22\uffff";
    static final String DFA64_eofS =
        "\22\uffff";
    static final String DFA64_minS =
        "\1\5\2\uffff\1\0\16\uffff";
    static final String DFA64_maxS =
        "\1\167\2\uffff\1\0\16\uffff";
    static final String DFA64_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\5\13\uffff\1\3\1\4";
    static final String DFA64_specialS =
        "\3\uffff\1\0\16\uffff}>";
    static final String[] DFA64_transitionS = {
            "\7\4\34\uffff\1\3\74\uffff\1\1\1\2\1\4\2\uffff\16\4",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA64_eot = DFA.unpackEncodedString(DFA64_eotS);
    static final short[] DFA64_eof = DFA.unpackEncodedString(DFA64_eofS);
    static final char[] DFA64_min = DFA.unpackEncodedStringToUnsignedChars(DFA64_minS);
    static final char[] DFA64_max = DFA.unpackEncodedStringToUnsignedChars(DFA64_maxS);
    static final short[] DFA64_accept = DFA.unpackEncodedString(DFA64_acceptS);
    static final short[] DFA64_special = DFA.unpackEncodedString(DFA64_specialS);
    static final short[][] DFA64_transition;

    static {
        int numStates = DFA64_transitionS.length;
        DFA64_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA64_transition[i] = DFA.unpackEncodedString(DFA64_transitionS[i]);
        }
    }

    class DFA64 extends DFA {

        public DFA64(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 64;
            this.eot = DFA64_eot;
            this.eof = DFA64_eof;
            this.min = DFA64_min;
            this.max = DFA64_max;
            this.accept = DFA64_accept;
            this.special = DFA64_special;
            this.transition = DFA64_transition;
        }
        public String getDescription() {
            return "441:1: unaryExpressionNotPlusMinus : ( bitwiseNegationExpression | logicalNegationExpression | basicCastExpression | castExpression | postfixExpression );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA64_3 = input.LA(1);

                         
                        int index64_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred119_RatsJava()) ) {s = 16;}

                        else if ( (synpred120_RatsJava()) ) {s = 17;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index64_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 64, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA67_eotS =
        "\15\uffff";
    static final String DFA67_eofS =
        "\1\1\5\uffff\1\12\1\uffff\1\14\4\uffff";
    static final String DFA67_minS =
        "\1\31\1\uffff\1\5\3\uffff\1\31\1\uffff\1\31\4\uffff";
    static final String DFA67_maxS =
        "\1\151\1\uffff\1\152\3\uffff\1\151\1\uffff\1\151\4\uffff";
    static final String DFA67_acceptS =
        "\1\uffff\1\11\1\uffff\1\5\1\6\1\7\1\uffff\1\10\1\uffff\1\2\1\3\1"+
        "\1\1\4";
    static final String DFA67_specialS =
        "\15\uffff}>";
    static final String[] DFA67_transitionS = {
            "\1\1\1\uffff\1\2\1\1\14\uffff\3\1\1\uffff\1\1\17\uffff\1\1\6"+
            "\uffff\37\1\1\4\1\5\3\uffff\1\3\1\1",
            "",
            "\1\10\141\uffff\1\6\2\uffff\1\7",
            "",
            "",
            "",
            "\1\12\1\uffff\2\12\13\uffff\1\11\3\12\1\uffff\1\12\17\uffff"+
            "\1\12\6\uffff\41\12\3\uffff\2\12",
            "",
            "\1\14\1\uffff\2\14\13\uffff\1\13\3\14\1\uffff\1\14\17\uffff"+
            "\1\14\6\uffff\41\14\3\uffff\2\14",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA67_eot = DFA.unpackEncodedString(DFA67_eotS);
    static final short[] DFA67_eof = DFA.unpackEncodedString(DFA67_eofS);
    static final char[] DFA67_min = DFA.unpackEncodedStringToUnsignedChars(DFA67_minS);
    static final char[] DFA67_max = DFA.unpackEncodedStringToUnsignedChars(DFA67_maxS);
    static final short[] DFA67_accept = DFA.unpackEncodedString(DFA67_acceptS);
    static final short[] DFA67_special = DFA.unpackEncodedString(DFA67_specialS);
    static final short[][] DFA67_transition;

    static {
        int numStates = DFA67_transitionS.length;
        DFA67_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA67_transition[i] = DFA.unpackEncodedString(DFA67_transitionS[i]);
        }
    }

    class DFA67 extends DFA {

        public DFA67(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 67;
            this.eot = DFA67_eot;
            this.eof = DFA67_eof;
            this.min = DFA67_min;
            this.max = DFA67_max;
            this.accept = DFA67_accept;
            this.special = DFA67_special;
            this.transition = DFA67_transition;
        }
        public String getDescription() {
            return "()* loopback of 467:3: ( '.' name arguments | '.' 'super' arguments | '.' 'super' | '.' name | '[' expression ']' | '++' | '--' | '.' 'new' typeName arguments ( classBody )? )*";
        }
    }
    static final String DFA68_eotS =
        "\27\uffff";
    static final String DFA68_eofS =
        "\2\uffff\1\13\1\uffff\1\15\1\17\14\uffff\1\13\4\uffff";
    static final String DFA68_minS =
        "\1\5\1\uffff\1\31\1\uffff\2\31\1\5\2\uffff\2\5\5\uffff\1\50\1\33"+
        "\1\31\2\uffff\1\5\1\33";
    static final String DFA68_maxS =
        "\1\167\1\uffff\1\151\1\uffff\2\151\1\164\2\uffff\1\153\1\167\5\uffff"+
        "\2\150\1\151\2\uffff\1\5\1\150";
    static final String DFA68_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\3\uffff\1\13\1\2\2\uffff\1\10\1\4\1\5\1"+
        "\6\1\7\3\uffff\1\11\1\12\2\uffff";
    static final String DFA68_specialS =
        "\27\uffff}>";
    static final String[] DFA68_transitionS = {
            "\1\2\6\1\34\uffff\1\7\76\uffff\1\5\2\uffff\1\6\1\4\11\3\3\1",
            "",
            "\1\13\1\uffff\1\11\1\13\13\uffff\1\10\3\13\1\uffff\1\13\17"+
            "\uffff\1\13\6\uffff\41\13\3\uffff\1\12\1\13",
            "",
            "\1\15\1\uffff\2\15\13\uffff\1\14\3\15\1\uffff\1\15\17\uffff"+
            "\1\15\6\uffff\41\15\3\uffff\2\15",
            "\1\17\1\uffff\2\17\13\uffff\1\16\3\17\1\uffff\1\17\17\uffff"+
            "\1\17\6\uffff\41\17\3\uffff\2\17",
            "\1\21\147\uffff\10\20",
            "",
            "",
            "\1\22\50\uffff\1\3\70\uffff\1\13\2\uffff\1\13\1\15",
            "\7\13\34\uffff\1\13\66\uffff\2\13\2\uffff\5\13\1\uffff\1\3"+
            "\16\13",
            "",
            "",
            "",
            "",
            "",
            "\1\23\3\uffff\1\24\73\uffff\1\24",
            "\1\25\14\uffff\1\23\3\uffff\1\24\73\uffff\1\24",
            "\1\13\1\uffff\1\11\1\13\13\uffff\4\13\1\uffff\1\13\17\uffff"+
            "\1\13\6\uffff\41\13\3\uffff\1\12\1\13",
            "",
            "",
            "\1\26",
            "\1\25\14\uffff\1\23\3\uffff\1\24\73\uffff\1\24"
    };

    static final short[] DFA68_eot = DFA.unpackEncodedString(DFA68_eotS);
    static final short[] DFA68_eof = DFA.unpackEncodedString(DFA68_eofS);
    static final char[] DFA68_min = DFA.unpackEncodedStringToUnsignedChars(DFA68_minS);
    static final char[] DFA68_max = DFA.unpackEncodedStringToUnsignedChars(DFA68_maxS);
    static final short[] DFA68_accept = DFA.unpackEncodedString(DFA68_acceptS);
    static final short[] DFA68_special = DFA.unpackEncodedString(DFA68_specialS);
    static final short[][] DFA68_transition;

    static {
        int numStates = DFA68_transitionS.length;
        DFA68_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA68_transition[i] = DFA.unpackEncodedString(DFA68_transitionS[i]);
        }
    }

    class DFA68 extends DFA {

        public DFA68(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 68;
            this.eot = DFA68_eot;
            this.eof = DFA68_eof;
            this.min = DFA68_min;
            this.max = DFA68_max;
            this.accept = DFA68_accept;
            this.special = DFA68_special;
            this.transition = DFA68_transition;
        }
        public String getDescription() {
            return "478:1: primaryExpression : ( literal | callExpression | classLiteralExpression | thisCallExpression | thisExpression | superCallExpression | superExpression | primaryIdentifier | newClassExpression | newArrayExpression | '(' expression ')' );";
        }
    }
    static final String DFA73_eotS =
        "\11\uffff";
    static final String DFA73_eofS =
        "\11\uffff";
    static final String DFA73_minS =
        "\1\152\1\5\1\54\1\33\1\5\1\uffff\1\5\1\uffff\1\33";
    static final String DFA73_maxS =
        "\1\152\1\164\2\150\1\167\1\uffff\1\5\1\uffff\1\150";
    static final String DFA73_acceptS =
        "\5\uffff\1\2\1\uffff\1\1\1\uffff";
    static final String DFA73_specialS =
        "\11\uffff}>";
    static final String[] DFA73_transitionS = {
            "\1\1",
            "\1\3\147\uffff\10\2",
            "\1\5\73\uffff\1\4",
            "\1\6\20\uffff\1\5\73\uffff\1\4",
            "\7\7\34\uffff\1\7\66\uffff\2\7\2\uffff\5\7\1\uffff\1\5\16\7",
            "",
            "\1\10",
            "",
            "\1\6\20\uffff\1\5\73\uffff\1\4"
    };

    static final short[] DFA73_eot = DFA.unpackEncodedString(DFA73_eotS);
    static final short[] DFA73_eof = DFA.unpackEncodedString(DFA73_eofS);
    static final char[] DFA73_min = DFA.unpackEncodedStringToUnsignedChars(DFA73_minS);
    static final char[] DFA73_max = DFA.unpackEncodedStringToUnsignedChars(DFA73_maxS);
    static final short[] DFA73_accept = DFA.unpackEncodedString(DFA73_acceptS);
    static final short[] DFA73_special = DFA.unpackEncodedString(DFA73_specialS);
    static final short[][] DFA73_transition;

    static {
        int numStates = DFA73_transitionS.length;
        DFA73_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA73_transition[i] = DFA.unpackEncodedString(DFA73_transitionS[i]);
        }
    }

    class DFA73 extends DFA {

        public DFA73(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 73;
            this.eot = DFA73_eot;
            this.eof = DFA73_eof;
            this.min = DFA73_min;
            this.max = DFA73_max;
            this.accept = DFA73_accept;
            this.special = DFA73_special;
            this.transition = DFA73_transition;
        }
        public String getDescription() {
            return "526:1: newArrayExpression : ( 'new' typeName concreteDimensions ( dimensions )? | 'new' typeName ( dimensions )? arrayInitializer );";
        }
    }
    static final String DFA74_eotS =
        "\32\uffff";
    static final String DFA74_eofS =
        "\1\2\31\uffff";
    static final String DFA74_minS =
        "\1\31\1\0\30\uffff";
    static final String DFA74_maxS =
        "\1\151\1\0\30\uffff";
    static final String DFA74_acceptS =
        "\2\uffff\1\2\26\uffff\1\1";
    static final String DFA74_specialS =
        "\1\uffff\1\0\30\uffff}>";
    static final String[] DFA74_transitionS = {
            "\1\2\1\uffff\2\2\14\uffff\3\2\1\uffff\1\2\17\uffff\1\2\6\uffff"+
            "\41\2\3\uffff\1\1\1\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA74_eot = DFA.unpackEncodedString(DFA74_eotS);
    static final short[] DFA74_eof = DFA.unpackEncodedString(DFA74_eofS);
    static final char[] DFA74_min = DFA.unpackEncodedStringToUnsignedChars(DFA74_minS);
    static final char[] DFA74_max = DFA.unpackEncodedStringToUnsignedChars(DFA74_maxS);
    static final short[] DFA74_accept = DFA.unpackEncodedString(DFA74_acceptS);
    static final short[] DFA74_special = DFA.unpackEncodedString(DFA74_specialS);
    static final short[][] DFA74_transition;

    static {
        int numStates = DFA74_transitionS.length;
        DFA74_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA74_transition[i] = DFA.unpackEncodedString(DFA74_transitionS[i]);
        }
    }

    class DFA74 extends DFA {

        public DFA74(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 74;
            this.eot = DFA74_eot;
            this.eof = DFA74_eof;
            this.min = DFA74_min;
            this.max = DFA74_max;
            this.accept = DFA74_accept;
            this.special = DFA74_special;
            this.transition = DFA74_transition;
        }
        public String getDescription() {
            return "()+ loopback of 532:5: ( concreteDimension )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA74_1 = input.LA(1);

                         
                        int index74_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred146_RatsJava()) ) {s = 25;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index74_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 74, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_packageDeclaration_in_compilationUnit42 = new BitSet(new long[]{0x000010FFE6000010L});
    public static final BitSet FOLLOW_importDeclaration_in_compilationUnit45 = new BitSet(new long[]{0x000010FFE6000010L});
    public static final BitSet FOLLOW_declaration_in_compilationUnit48 = new BitSet(new long[]{0x000010FFE2000010L});
    public static final BitSet FOLLOW_CTRLZ_in_compilationUnit51 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_compilationUnit54 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_packageDeclaration68 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_qualifiedIdentifier_in_packageDeclaration70 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_packageDeclaration72 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_importDeclaration86 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_qualifiedIdentifier_in_importDeclaration88 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_dotStarTail_in_importDeclaration90 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_importDeclaration96 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_dotStarTail110 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_dotStarTail112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_name126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifierList_in_modifiers140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifier_in_modifierList154 = new BitSet(new long[]{0x000000FFE0000002L});
    public static final BitSet FOLLOW_set_in_modifier0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableModifiers_in_formalParameter243 = new BitSet(new long[]{0x0000000000000020L,0x001FE00000000000L});
    public static final BitSet FOLLOW_type_in_formalParameter245 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_Identifier_in_formalParameter247 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
    public static final BitSet FOLLOW_dimensions_in_formalParameter249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_finalModifier_in_variableModifiers264 = new BitSet(new long[]{0x000000FFE0000000L});
    public static final BitSet FOLLOW_modifiers_in_variableModifiers266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifiers_in_variableModifiers272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_finalModifier286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_formalParameters300 = new BitSet(new long[]{0x000000FFE0000000L});
    public static final BitSet FOLLOW_formalParameter_in_formalParameters302 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_41_in_formalParameters311 = new BitSet(new long[]{0x000000FFE0000000L});
    public static final BitSet FOLLOW_formalParameter_in_formalParameters313 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_42_in_formalParameters320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_formalParameters326 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_formalParameters328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_name_in_declarator342 = new BitSet(new long[]{0x0000080000000002L,0x0000010000000000L});
    public static final BitSet FOLLOW_dimensions_in_declarator344 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_43_in_declarator354 = new BitSet(new long[]{0x0000110000000FE0L,0x00FFFCF980000000L});
    public static final BitSet FOLLOW_variableInitializer_in_declarator356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarator_in_declarators375 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_declarators384 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_declarator_in_declarators386 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_44_in_classBody405 = new BitSet(new long[]{0x000030FFE2000000L});
    public static final BitSet FOLLOW_declaration_in_classBody407 = new BitSet(new long[]{0x000030FFE2000000L});
    public static final BitSet FOLLOW_45_in_classBody410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldDeclaration_in_declaration424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodDeclaration_in_declaration430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constructorDeclaration_in_declaration436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDeclaration_in_declaration442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interfaceDeclaration_in_declaration448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blockDeclaration_in_declaration454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_emptyDeclaration_in_declaration460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifiers_in_fieldDeclaration474 = new BitSet(new long[]{0x0000000000000020L,0x001FE00000000000L});
    public static final BitSet FOLLOW_type_in_fieldDeclaration476 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_declarators_in_fieldDeclaration478 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_fieldDeclaration480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifiers_in_methodDeclaration494 = new BitSet(new long[]{0x0000000000000020L,0x001FF00000000000L});
    public static final BitSet FOLLOW_resultType_in_methodDeclaration496 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_name_in_methodDeclaration498 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_formalParameters_in_methodDeclaration500 = new BitSet(new long[]{0x0001100102000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_dimensions_in_methodDeclaration502 = new BitSet(new long[]{0x0001100102000000L});
    public static final BitSet FOLLOW_throwsClause_in_methodDeclaration508 = new BitSet(new long[]{0x0000100102000000L});
    public static final BitSet FOLLOW_block_in_methodDeclaration518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_methodDeclaration526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifiers_in_constructorDeclaration544 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_name_in_constructorDeclaration546 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_formalParameters_in_constructorDeclaration548 = new BitSet(new long[]{0x0001100100000000L});
    public static final BitSet FOLLOW_throwsClause_in_constructorDeclaration550 = new BitSet(new long[]{0x0000100100000000L});
    public static final BitSet FOLLOW_block_in_constructorDeclaration553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifiers_in_classDeclaration567 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_classDeclaration569 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_name_in_classDeclaration571 = new BitSet(new long[]{0x0006100000000000L});
    public static final BitSet FOLLOW_extension_in_classDeclaration573 = new BitSet(new long[]{0x0006100000000000L});
    public static final BitSet FOLLOW_implementation_in_classDeclaration579 = new BitSet(new long[]{0x0006100000000000L});
    public static final BitSet FOLLOW_classBody_in_classDeclaration582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifiers_in_interfaceDeclaration596 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_interfaceDeclaration598 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_name_in_interfaceDeclaration600 = new BitSet(new long[]{0x0006100000000000L});
    public static final BitSet FOLLOW_extension_in_interfaceDeclaration602 = new BitSet(new long[]{0x0006100000000000L});
    public static final BitSet FOLLOW_classBody_in_interfaceDeclaration605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_blockDeclaration626 = new BitSet(new long[]{0x0000100100000000L});
    public static final BitSet FOLLOW_block_in_blockDeclaration633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_emptyDeclaration647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_throwsClause661 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_qualifiedIdentifier_in_throwsClause663 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_throwsClause672 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_qualifiedIdentifier_in_throwsClause674 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_49_in_extension693 = new BitSet(new long[]{0x0000000000000020L,0x001FE00000000000L});
    public static final BitSet FOLLOW_type_in_extension695 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_extension704 = new BitSet(new long[]{0x0000000000000020L,0x001FE00000000000L});
    public static final BitSet FOLLOW_type_in_extension706 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_50_in_implementation725 = new BitSet(new long[]{0x0000000000000020L,0x001FE00000000000L});
    public static final BitSet FOLLOW_type_in_implementation727 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_implementation736 = new BitSet(new long[]{0x0000000000000020L,0x001FE00000000000L});
    public static final BitSet FOLLOW_type_in_implementation738 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_44_in_block757 = new BitSet(new long[]{0x89E831FFE2000FE0L,0x00FFFCF98000000FL});
    public static final BitSet FOLLOW_declarationOrStatement_in_block759 = new BitSet(new long[]{0x89E831FFE2000FE0L,0x00FFFCF98000000FL});
    public static final BitSet FOLLOW_45_in_block762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inBlockDeclaration_in_declarationOrStatement776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_declarationOrStatement782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclaration_in_inBlockDeclaration796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDeclaration_in_inBlockDeclaration802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_interfaceDeclaration_in_inBlockDeclaration808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableModifiers_in_variableDeclaration822 = new BitSet(new long[]{0x0000000000000020L,0x001FE00000000000L});
    public static final BitSet FOLLOW_type_in_variableDeclaration824 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_declarators_in_variableDeclaration826 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_variableDeclaration828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_statement844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalStatement_in_statement850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forStatement_in_statement856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStatement_in_statement862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_doWhileStatement_in_statement868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tryCatchFinallyStatement_in_statement874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_switchStatement_in_statement880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_synchronizedStatement_in_statement886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_returnStatement_in_statement892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_throwStatement_in_statement898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_breakStatement_in_statement904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_continueStatement_in_statement910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_labeledStatement_in_statement916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionStatement_in_statement922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assertStatement_in_statement928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_emptyStatement_in_statement934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_conditionalStatement948 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_parExpression_in_conditionalStatement950 = new BitSet(new long[]{0x89E811FFE2000FE0L,0x00FFFCF98000000FL});
    public static final BitSet FOLLOW_statement_in_conditionalStatement952 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_conditionalStatement954 = new BitSet(new long[]{0x89E811FFE2000FE0L,0x00FFFCF98000000FL});
    public static final BitSet FOLLOW_statement_in_conditionalStatement956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_conditionalStatement962 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_parExpression_in_conditionalStatement964 = new BitSet(new long[]{0x89E811FFE2000FE0L,0x00FFFCF98000000FL});
    public static final BitSet FOLLOW_statement_in_conditionalStatement966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_forStatement980 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_forStatement982 = new BitSet(new long[]{0x000011FFE2000FE0L,0x00FFFCF980000000L});
    public static final BitSet FOLLOW_forControl_in_forStatement984 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_forStatement986 = new BitSet(new long[]{0x89E811FFE2000FE0L,0x00FFFCF98000000FL});
    public static final BitSet FOLLOW_statement_in_forStatement988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_basicForControl_in_forControl1002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableModifiers_in_basicForControl1016 = new BitSet(new long[]{0x0000000000000020L,0x001FE00000000000L});
    public static final BitSet FOLLOW_type_in_basicForControl1018 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_declarators_in_basicForControl1020 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_basicForControl1022 = new BitSet(new long[]{0x0000110002000FE0L,0x00FFFCF980000000L});
    public static final BitSet FOLLOW_expression_in_basicForControl1024 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_basicForControl1030 = new BitSet(new long[]{0x0000110000000FE2L,0x00FFFCF980000000L});
    public static final BitSet FOLLOW_expressionList_in_basicForControl1032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionList_in_basicForControl1039 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_basicForControl1042 = new BitSet(new long[]{0x0000110002000FE0L,0x00FFFCF980000000L});
    public static final BitSet FOLLOW_expression_in_basicForControl1044 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_basicForControl1050 = new BitSet(new long[]{0x0000110000000FE2L,0x00FFFCF980000000L});
    public static final BitSet FOLLOW_expressionList_in_basicForControl1052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_whileStatement1067 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_parExpression_in_whileStatement1069 = new BitSet(new long[]{0x89E811FFE2000FE0L,0x00FFFCF98000000FL});
    public static final BitSet FOLLOW_statement_in_whileStatement1071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_doWhileStatement1085 = new BitSet(new long[]{0x89E811FFE2000FE0L,0x00FFFCF98000000FL});
    public static final BitSet FOLLOW_statement_in_doWhileStatement1087 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_doWhileStatement1089 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_parExpression_in_doWhileStatement1091 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_doWhileStatement1093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_parExpression1107 = new BitSet(new long[]{0x0000110000000FE0L,0x00FFFCF980000000L});
    public static final BitSet FOLLOW_expression_in_parExpression1109 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_parExpression1111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_tryCatchFinallyStatement1125 = new BitSet(new long[]{0x0000100100000000L});
    public static final BitSet FOLLOW_block_in_tryCatchFinallyStatement1127 = new BitSet(new long[]{0x0600000000000000L});
    public static final BitSet FOLLOW_catchClause_in_tryCatchFinallyStatement1129 = new BitSet(new long[]{0x0600000000000000L});
    public static final BitSet FOLLOW_57_in_tryCatchFinallyStatement1132 = new BitSet(new long[]{0x0000100100000000L});
    public static final BitSet FOLLOW_block_in_tryCatchFinallyStatement1134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_tryCatchFinallyStatement1140 = new BitSet(new long[]{0x0000100100000000L});
    public static final BitSet FOLLOW_block_in_tryCatchFinallyStatement1142 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_catchClause_in_tryCatchFinallyStatement1144 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_58_in_catchClause1159 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_catchClause1161 = new BitSet(new long[]{0x000000FFE0000000L});
    public static final BitSet FOLLOW_formalParameter_in_catchClause1163 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_catchClause1165 = new BitSet(new long[]{0x0000100100000000L});
    public static final BitSet FOLLOW_block_in_catchClause1167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_switchStatement1181 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_parExpression_in_switchStatement1183 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_switchStatement1185 = new BitSet(new long[]{0x5000200000000000L});
    public static final BitSet FOLLOW_switchClause_in_switchStatement1187 = new BitSet(new long[]{0x5000200000000000L});
    public static final BitSet FOLLOW_45_in_switchStatement1193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_caseClause_in_switchClause1207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_defaultClause_in_switchClause1213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_caseClause1227 = new BitSet(new long[]{0x0000110000000FE0L,0x00FFFCF980000000L});
    public static final BitSet FOLLOW_expression_in_caseClause1229 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_caseClause1231 = new BitSet(new long[]{0x89E811FFE2000FE2L,0x00FFFCF98000000FL});
    public static final BitSet FOLLOW_declarationOrStatement_in_caseClause1233 = new BitSet(new long[]{0x89E811FFE2000FE2L,0x00FFFCF98000000FL});
    public static final BitSet FOLLOW_62_in_defaultClause1248 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_defaultClause1250 = new BitSet(new long[]{0x89E811FFE2000FE2L,0x00FFFCF98000000FL});
    public static final BitSet FOLLOW_declarationOrStatement_in_defaultClause1252 = new BitSet(new long[]{0x89E811FFE2000FE2L,0x00FFFCF98000000FL});
    public static final BitSet FOLLOW_36_in_synchronizedStatement1267 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_parExpression_in_synchronizedStatement1269 = new BitSet(new long[]{0x0000100100000000L});
    public static final BitSet FOLLOW_block_in_synchronizedStatement1271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_returnStatement1285 = new BitSet(new long[]{0x0000110002000FE0L,0x00FFFCF980000000L});
    public static final BitSet FOLLOW_expression_in_returnStatement1287 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_returnStatement1290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_throwStatement1304 = new BitSet(new long[]{0x0000110000000FE0L,0x00FFFCF980000000L});
    public static final BitSet FOLLOW_expression_in_throwStatement1306 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_throwStatement1308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_breakStatement1322 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_Identifier_in_breakStatement1324 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_breakStatement1327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_continueStatement1341 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_Identifier_in_continueStatement1343 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_continueStatement1346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_labeledStatement1360 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_labeledStatement1362 = new BitSet(new long[]{0x89E811FFE2000FE0L,0x00FFFCF98000000FL});
    public static final BitSet FOLLOW_statement_in_labeledStatement1364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionStatement1378 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_expressionStatement1380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_assertStatement1394 = new BitSet(new long[]{0x0000110000000FE0L,0x00FFFCF980000000L});
    public static final BitSet FOLLOW_expression_in_assertStatement1396 = new BitSet(new long[]{0x2000000002000000L});
    public static final BitSet FOLLOW_61_in_assertStatement1405 = new BitSet(new long[]{0x0000110000000FE0L,0x00FFFCF980000000L});
    public static final BitSet FOLLOW_expression_in_assertStatement1407 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_assertStatement1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_emptyStatement1428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionList1442 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_expressionList1451 = new BitSet(new long[]{0x0000110000000FE0L,0x00FFFCF980000000L});
    public static final BitSet FOLLOW_expression_in_expressionList1453 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_conditionalExpression_in_expression1472 = new BitSet(new long[]{0x0000080000000000L,0x0000000000007FF0L});
    public static final BitSet FOLLOW_assignmentOperator_in_expression1474 = new BitSet(new long[]{0x0000110000000FE0L,0x00FFFCF980000000L});
    public static final BitSet FOLLOW_expression_in_expression1476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalExpression_in_expression1482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_assignmentOperator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalOrExpression_in_conditionalExpression1576 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_conditionalExpression1578 = new BitSet(new long[]{0x0000110000000FE0L,0x00FFFCF980000000L});
    public static final BitSet FOLLOW_expression_in_conditionalExpression1580 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_conditionalExpression1582 = new BitSet(new long[]{0x0000010000000FE0L,0x00FFFCF980000000L});
    public static final BitSet FOLLOW_conditionalExpression_in_conditionalExpression1587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalOrExpression_in_conditionalExpression1593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalAndExpression_in_logicalOrExpression1607 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_logicalOrExpression1610 = new BitSet(new long[]{0x0000010000000FE0L,0x00FFFCF980000000L});
    public static final BitSet FOLLOW_logicalAndExpression_in_logicalOrExpression1612 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_bitwiseOrExpression_in_logicalAndExpression1628 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_logicalAndExpression1631 = new BitSet(new long[]{0x0000010000000FE0L,0x00FFFCF980000000L});
    public static final BitSet FOLLOW_bitwiseOrExpression_in_logicalAndExpression1633 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_bitwiseXorExpression_in_bitwiseOrExpression1649 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_bitwiseOrExpression1652 = new BitSet(new long[]{0x0000010000000FE0L,0x00FFFCF980000000L});
    public static final BitSet FOLLOW_bitwiseXorExpression_in_bitwiseOrExpression1654 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_bitwiseAndExpression_in_bitwiseXorExpression1670 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_bitwiseXorExpression1673 = new BitSet(new long[]{0x0000010000000FE0L,0x00FFFCF980000000L});
    public static final BitSet FOLLOW_bitwiseAndExpression_in_bitwiseXorExpression1675 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_equalityExpression_in_bitwiseAndExpression1691 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_bitwiseAndExpression1694 = new BitSet(new long[]{0x0000010000000FE0L,0x00FFFCF980000000L});
    public static final BitSet FOLLOW_equalityExpression_in_bitwiseAndExpression1696 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_instanceOfExpression_in_equalityExpression1712 = new BitSet(new long[]{0x0000000000000002L,0x0000000000600000L});
    public static final BitSet FOLLOW_equalityOperator_in_equalityExpression1715 = new BitSet(new long[]{0x0000010000000FE0L,0x00FFFCF980000000L});
    public static final BitSet FOLLOW_instanceOfExpression_in_equalityExpression1717 = new BitSet(new long[]{0x0000000000000002L,0x0000000000600000L});
    public static final BitSet FOLLOW_set_in_equalityOperator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relationalExpression_in_instanceOfExpression1753 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_instanceOfExpression1755 = new BitSet(new long[]{0x0000000000000020L,0x001FE00000000000L});
    public static final BitSet FOLLOW_type_in_instanceOfExpression1757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relationalExpression_in_instanceOfExpression1763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_shiftExpression_in_relationalExpression1777 = new BitSet(new long[]{0x0000000000000002L,0x000000000F000000L});
    public static final BitSet FOLLOW_relationalOperator_in_relationalExpression1780 = new BitSet(new long[]{0x0000010000000FE0L,0x00FFFCF980000000L});
    public static final BitSet FOLLOW_shiftExpression_in_relationalExpression1782 = new BitSet(new long[]{0x0000000000000002L,0x000000000F000000L});
    public static final BitSet FOLLOW_set_in_relationalOperator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_additiveExpression_in_shiftExpression1830 = new BitSet(new long[]{0x0000000000000002L,0x0000000070000000L});
    public static final BitSet FOLLOW_shiftOperator_in_shiftExpression1833 = new BitSet(new long[]{0x0000010000000FE0L,0x00FFFCF980000000L});
    public static final BitSet FOLLOW_additiveExpression_in_shiftExpression1835 = new BitSet(new long[]{0x0000000000000002L,0x0000000070000000L});
    public static final BitSet FOLLOW_set_in_shiftOperator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1877 = new BitSet(new long[]{0x0000000000000002L,0x0000000180000000L});
    public static final BitSet FOLLOW_additiveOperator_in_additiveExpression1880 = new BitSet(new long[]{0x0000010000000FE0L,0x00FFFCF980000000L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1882 = new BitSet(new long[]{0x0000000000000002L,0x0000000180000000L});
    public static final BitSet FOLLOW_set_in_additiveOperator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1918 = new BitSet(new long[]{0x0000000010000002L,0x0000000600000000L});
    public static final BitSet FOLLOW_multiplicativeOperator_in_multiplicativeExpression1921 = new BitSet(new long[]{0x0000010000000FE0L,0x00FFFCF980000000L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1923 = new BitSet(new long[]{0x0000000010000002L,0x0000000600000000L});
    public static final BitSet FOLLOW_set_in_multiplicativeOperator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_unaryExpression1965 = new BitSet(new long[]{0x0000010000000FE0L,0x00FFFCF980000000L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_unaryExpression1973 = new BitSet(new long[]{0x0000010000000FE0L,0x00FFFCF980000000L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_unaryExpression1981 = new BitSet(new long[]{0x0000010000000FE0L,0x00FFFCF980000000L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_unaryExpression1989 = new BitSet(new long[]{0x0000010000000FE0L,0x00FFFCF980000000L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpression1997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bitwiseNegationExpression_in_unaryExpressionNotPlusMinus2011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalNegationExpression_in_unaryExpressionNotPlusMinus2017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_basicCastExpression_in_unaryExpressionNotPlusMinus2023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_castExpression_in_unaryExpressionNotPlusMinus2029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfixExpression_in_unaryExpressionNotPlusMinus2035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_bitwiseNegationExpression2049 = new BitSet(new long[]{0x0000010000000FE0L,0x00FFFCF980000000L});
    public static final BitSet FOLLOW_unaryExpression_in_bitwiseNegationExpression2051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_logicalNegationExpression2065 = new BitSet(new long[]{0x0000010000000FE0L,0x00FFFCF980000000L});
    public static final BitSet FOLLOW_unaryExpression_in_logicalNegationExpression2067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_basicCastExpression2081 = new BitSet(new long[]{0x0000000000000000L,0x001FE00000000000L});
    public static final BitSet FOLLOW_primitiveType_in_basicCastExpression2083 = new BitSet(new long[]{0x0000040000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_dimensions_in_basicCastExpression2085 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_basicCastExpression2088 = new BitSet(new long[]{0x0000010000000FE0L,0x00FFFCF980000000L});
    public static final BitSet FOLLOW_unaryExpression_in_basicCastExpression2090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_castExpression2104 = new BitSet(new long[]{0x0000000000000020L,0x001FE00000000000L});
    public static final BitSet FOLLOW_type_in_castExpression2106 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_castExpression2108 = new BitSet(new long[]{0x0000010000000FE0L,0x00FFFCF980000000L});
    public static final BitSet FOLLOW_unaryExpressionNotPlusMinus_in_castExpression2110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpression_in_postfixExpression2122 = new BitSet(new long[]{0x0000000008000002L,0x0000011800000000L});
    public static final BitSet FOLLOW_27_in_postfixExpression2128 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_name_in_postfixExpression2130 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_arguments_in_postfixExpression2132 = new BitSet(new long[]{0x0000000008000002L,0x0000011800000000L});
    public static final BitSet FOLLOW_27_in_postfixExpression2138 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_103_in_postfixExpression2140 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_arguments_in_postfixExpression2142 = new BitSet(new long[]{0x0000000008000002L,0x0000011800000000L});
    public static final BitSet FOLLOW_27_in_postfixExpression2148 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_103_in_postfixExpression2150 = new BitSet(new long[]{0x0000000008000002L,0x0000011800000000L});
    public static final BitSet FOLLOW_27_in_postfixExpression2157 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_name_in_postfixExpression2159 = new BitSet(new long[]{0x0000000008000002L,0x0000011800000000L});
    public static final BitSet FOLLOW_104_in_postfixExpression2166 = new BitSet(new long[]{0x0000110000000FE0L,0x00FFFCF980000000L});
    public static final BitSet FOLLOW_expression_in_postfixExpression2168 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_105_in_postfixExpression2170 = new BitSet(new long[]{0x0000000008000002L,0x0000011800000000L});
    public static final BitSet FOLLOW_99_in_postfixExpression2178 = new BitSet(new long[]{0x0000000008000002L,0x0000011800000000L});
    public static final BitSet FOLLOW_100_in_postfixExpression2186 = new BitSet(new long[]{0x0000000008000002L,0x0000011800000000L});
    public static final BitSet FOLLOW_27_in_postfixExpression2194 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_106_in_postfixExpression2196 = new BitSet(new long[]{0x0000000000000020L,0x001FE00000000000L});
    public static final BitSet FOLLOW_typeName_in_postfixExpression2198 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_arguments_in_postfixExpression2200 = new BitSet(new long[]{0x0006100008000002L,0x0000011800000000L});
    public static final BitSet FOLLOW_classBody_in_postfixExpression2202 = new BitSet(new long[]{0x0000000008000002L,0x0000011800000000L});
    public static final BitSet FOLLOW_literal_in_primaryExpression2222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callExpression_in_primaryExpression2228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classLiteralExpression_in_primaryExpression2234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_thisCallExpression_in_primaryExpression2240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_thisExpression_in_primaryExpression2246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_superCallExpression_in_primaryExpression2252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_superExpression_in_primaryExpression2258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryIdentifier_in_primaryExpression2264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_newClassExpression_in_primaryExpression2270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_newArrayExpression_in_primaryExpression2276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_primaryExpression2282 = new BitSet(new long[]{0x0000110000000FE0L,0x00FFFCF980000000L});
    public static final BitSet FOLLOW_expression_in_primaryExpression2284 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_primaryExpression2286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_name_in_callExpression2300 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_arguments_in_callExpression2302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_resultType_in_classLiteralExpression2316 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_classLiteralExpression2318 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_classLiteralExpression2320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_thisCallExpression2334 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_arguments_in_thisCallExpression2336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualifiedIdentifier_in_thisExpression2358 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_thisExpression2360 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_thisExpression2367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_superCallExpression2381 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_arguments_in_superCallExpression2383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_superExpression2398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_primaryIdentifier2412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_newClassExpression2426 = new BitSet(new long[]{0x0000000000000020L,0x001FE00000000000L});
    public static final BitSet FOLLOW_typeName_in_newClassExpression2428 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_arguments_in_newClassExpression2430 = new BitSet(new long[]{0x0006100000000002L});
    public static final BitSet FOLLOW_classBody_in_newClassExpression2432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_newArrayExpression2447 = new BitSet(new long[]{0x0000000000000020L,0x001FE00000000000L});
    public static final BitSet FOLLOW_typeName_in_newArrayExpression2449 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_concreteDimensions_in_newArrayExpression2451 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
    public static final BitSet FOLLOW_dimensions_in_newArrayExpression2453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_newArrayExpression2460 = new BitSet(new long[]{0x0000000000000020L,0x001FE00000000000L});
    public static final BitSet FOLLOW_typeName_in_newArrayExpression2462 = new BitSet(new long[]{0x0000100000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_dimensions_in_newArrayExpression2464 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_arrayInitializer_in_newArrayExpression2467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_concreteDimension_in_concreteDimensions2480 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
    public static final BitSet FOLLOW_104_in_concreteDimension2494 = new BitSet(new long[]{0x0000110000000FE0L,0x00FFFCF980000000L});
    public static final BitSet FOLLOW_expression_in_concreteDimension2496 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_105_in_concreteDimension2498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_arrayInitializer2512 = new BitSet(new long[]{0x0000110000000FE0L,0x00FFFCF980000000L});
    public static final BitSet FOLLOW_variableInitializer_in_arrayInitializer2514 = new BitSet(new long[]{0x0000220000000000L});
    public static final BitSet FOLLOW_41_in_arrayInitializer2523 = new BitSet(new long[]{0x0000110000000FE0L,0x00FFFCF980000000L});
    public static final BitSet FOLLOW_variableInitializer_in_arrayInitializer2525 = new BitSet(new long[]{0x0000220000000000L});
    public static final BitSet FOLLOW_41_in_arrayInitializer2539 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_arrayInitializer2546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_arrayInitializer2552 = new BitSet(new long[]{0x0000220000000000L});
    public static final BitSet FOLLOW_41_in_arrayInitializer2561 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_arrayInitializer2568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayInitializer_in_variableInitializer2582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_variableInitializer2588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_arguments2602 = new BitSet(new long[]{0x0000110000000FE0L,0x00FFFCF980000000L});
    public static final BitSet FOLLOW_expression_in_arguments2604 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_41_in_arguments2613 = new BitSet(new long[]{0x0000110000000FE0L,0x00FFFCF980000000L});
    public static final BitSet FOLLOW_expression_in_arguments2615 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_42_in_arguments2622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_arguments2628 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_arguments2630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_voidType_in_resultType2644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_resultType2650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_voidType2664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeName_in_type2678 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
    public static final BitSet FOLLOW_dimensions_in_type2680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_typeName2695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classType_in_typeName2701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_primitiveType0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualifiedIdentifier_in_classType2771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_dimensions2792 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_105_in_dimensions2794 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
    public static final BitSet FOLLOW_FloatingPointLiteral_in_literal2813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerLiteral_in_literal2819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CharacterLiteral_in_literal2825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_literal2831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_literal2837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nullLiteral_in_literal2843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_integerLiteral0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_booleanLiteral0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_119_in_nullLiteral2905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_qualifiedIdentifier2919 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_qualifiedIdentifier2928 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_Identifier_in_qualifiedIdentifier2930 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_finalModifier_in_synpred18_RatsJava264 = new BitSet(new long[]{0x000000FFE0000000L});
    public static final BitSet FOLLOW_modifiers_in_synpred18_RatsJava266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_synpred61_RatsJava948 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_parExpression_in_synpred61_RatsJava950 = new BitSet(new long[]{0x89E811FFE2000FE0L,0x00FFFCF98000000FL});
    public static final BitSet FOLLOW_statement_in_synpred61_RatsJava952 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_synpred61_RatsJava954 = new BitSet(new long[]{0x89E811FFE2000FE0L,0x00FFFCF98000000FL});
    public static final BitSet FOLLOW_statement_in_synpred61_RatsJava956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_synpred69_RatsJava1125 = new BitSet(new long[]{0x0000100100000000L});
    public static final BitSet FOLLOW_block_in_synpred69_RatsJava1127 = new BitSet(new long[]{0x0600000000000000L});
    public static final BitSet FOLLOW_catchClause_in_synpred69_RatsJava1129 = new BitSet(new long[]{0x0600000000000000L});
    public static final BitSet FOLLOW_57_in_synpred69_RatsJava1132 = new BitSet(new long[]{0x0000100100000000L});
    public static final BitSet FOLLOW_block_in_synpred69_RatsJava1134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalExpression_in_synpred80_RatsJava1472 = new BitSet(new long[]{0x0000080000000000L,0x0000000000007FF0L});
    public static final BitSet FOLLOW_assignmentOperator_in_synpred80_RatsJava1474 = new BitSet(new long[]{0x0000110000000FE0L,0x00FFFCF980000000L});
    public static final BitSet FOLLOW_expression_in_synpred80_RatsJava1476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalOrExpression_in_synpred92_RatsJava1576 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_synpred92_RatsJava1578 = new BitSet(new long[]{0x0000110000000FE0L,0x00FFFCF980000000L});
    public static final BitSet FOLLOW_expression_in_synpred92_RatsJava1580 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_synpred92_RatsJava1582 = new BitSet(new long[]{0x0000010000000FE0L,0x00FFFCF980000000L});
    public static final BitSet FOLLOW_conditionalExpression_in_synpred92_RatsJava1587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relationalExpression_in_synpred100_RatsJava1753 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_synpred100_RatsJava1755 = new BitSet(new long[]{0x0000000000000020L,0x001FE00000000000L});
    public static final BitSet FOLLOW_type_in_synpred100_RatsJava1757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_basicCastExpression_in_synpred119_RatsJava2023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_castExpression_in_synpred120_RatsJava2029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_concreteDimension_in_synpred146_RatsJava2480 = new BitSet(new long[]{0x0000000000000002L});

}

package dk.sdu.mmmi.mdsd.ide.contentassist.antlr.internal;

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
import dk.sdu.mmmi.mdsd.services.MathGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMathParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'*'", "'/'", "'var'", "'='", "'+'", "'-'", "'let'", "'in'", "'end'", "'('", "')'"
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
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMathParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMathParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMathParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMath.g"; }


    	private MathGrammarAccess grammarAccess;

    	public void setGrammarAccess(MathGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleMathExp"
    // InternalMath.g:53:1: entryRuleMathExp : ruleMathExp EOF ;
    public final void entryRuleMathExp() throws RecognitionException {
        try {
            // InternalMath.g:54:1: ( ruleMathExp EOF )
            // InternalMath.g:55:1: ruleMathExp EOF
            {
             before(grammarAccess.getMathExpRule()); 
            pushFollow(FOLLOW_1);
            ruleMathExp();

            state._fsp--;

             after(grammarAccess.getMathExpRule()); 
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
    // $ANTLR end "entryRuleMathExp"


    // $ANTLR start "ruleMathExp"
    // InternalMath.g:62:1: ruleMathExp : ( ( rule__MathExp__MathAssignment )* ) ;
    public final void ruleMathExp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:66:2: ( ( ( rule__MathExp__MathAssignment )* ) )
            // InternalMath.g:67:2: ( ( rule__MathExp__MathAssignment )* )
            {
            // InternalMath.g:67:2: ( ( rule__MathExp__MathAssignment )* )
            // InternalMath.g:68:3: ( rule__MathExp__MathAssignment )*
            {
             before(grammarAccess.getMathExpAccess().getMathAssignment()); 
            // InternalMath.g:69:3: ( rule__MathExp__MathAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMath.g:69:4: rule__MathExp__MathAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__MathExp__MathAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getMathExpAccess().getMathAssignment()); 

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
    // $ANTLR end "ruleMathExp"


    // $ANTLR start "entryRuleStatement"
    // InternalMath.g:78:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalMath.g:79:1: ( ruleStatement EOF )
            // InternalMath.g:80:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalMath.g:87:1: ruleStatement : ( ( rule__Statement__Group__0 ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:91:2: ( ( ( rule__Statement__Group__0 ) ) )
            // InternalMath.g:92:2: ( ( rule__Statement__Group__0 ) )
            {
            // InternalMath.g:92:2: ( ( rule__Statement__Group__0 ) )
            // InternalMath.g:93:3: ( rule__Statement__Group__0 )
            {
             before(grammarAccess.getStatementAccess().getGroup()); 
            // InternalMath.g:94:3: ( rule__Statement__Group__0 )
            // InternalMath.g:94:4: rule__Statement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getGroup()); 

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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleExp"
    // InternalMath.g:103:1: entryRuleExp : ruleExp EOF ;
    public final void entryRuleExp() throws RecognitionException {
        try {
            // InternalMath.g:104:1: ( ruleExp EOF )
            // InternalMath.g:105:1: ruleExp EOF
            {
             before(grammarAccess.getExpRule()); 
            pushFollow(FOLLOW_1);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getExpRule()); 
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
    // $ANTLR end "entryRuleExp"


    // $ANTLR start "ruleExp"
    // InternalMath.g:112:1: ruleExp : ( ( rule__Exp__Alternatives ) ) ;
    public final void ruleExp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:116:2: ( ( ( rule__Exp__Alternatives ) ) )
            // InternalMath.g:117:2: ( ( rule__Exp__Alternatives ) )
            {
            // InternalMath.g:117:2: ( ( rule__Exp__Alternatives ) )
            // InternalMath.g:118:3: ( rule__Exp__Alternatives )
            {
             before(grammarAccess.getExpAccess().getAlternatives()); 
            // InternalMath.g:119:3: ( rule__Exp__Alternatives )
            // InternalMath.g:119:4: rule__Exp__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Exp__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpAccess().getAlternatives()); 

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
    // $ANTLR end "ruleExp"


    // $ANTLR start "entryRulePlusMinus"
    // InternalMath.g:128:1: entryRulePlusMinus : rulePlusMinus EOF ;
    public final void entryRulePlusMinus() throws RecognitionException {
        try {
            // InternalMath.g:129:1: ( rulePlusMinus EOF )
            // InternalMath.g:130:1: rulePlusMinus EOF
            {
             before(grammarAccess.getPlusMinusRule()); 
            pushFollow(FOLLOW_1);
            rulePlusMinus();

            state._fsp--;

             after(grammarAccess.getPlusMinusRule()); 
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
    // $ANTLR end "entryRulePlusMinus"


    // $ANTLR start "rulePlusMinus"
    // InternalMath.g:137:1: rulePlusMinus : ( ( rule__PlusMinus__Group__0 ) ) ;
    public final void rulePlusMinus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:141:2: ( ( ( rule__PlusMinus__Group__0 ) ) )
            // InternalMath.g:142:2: ( ( rule__PlusMinus__Group__0 ) )
            {
            // InternalMath.g:142:2: ( ( rule__PlusMinus__Group__0 ) )
            // InternalMath.g:143:3: ( rule__PlusMinus__Group__0 )
            {
             before(grammarAccess.getPlusMinusAccess().getGroup()); 
            // InternalMath.g:144:3: ( rule__PlusMinus__Group__0 )
            // InternalMath.g:144:4: rule__PlusMinus__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PlusMinus__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPlusMinusAccess().getGroup()); 

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
    // $ANTLR end "rulePlusMinus"


    // $ANTLR start "entryRuleTerm"
    // InternalMath.g:153:1: entryRuleTerm : ruleTerm EOF ;
    public final void entryRuleTerm() throws RecognitionException {
        try {
            // InternalMath.g:154:1: ( ruleTerm EOF )
            // InternalMath.g:155:1: ruleTerm EOF
            {
             before(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_1);
            ruleTerm();

            state._fsp--;

             after(grammarAccess.getTermRule()); 
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
    // $ANTLR end "entryRuleTerm"


    // $ANTLR start "ruleTerm"
    // InternalMath.g:162:1: ruleTerm : ( ( rule__Term__Group__0 ) ) ;
    public final void ruleTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:166:2: ( ( ( rule__Term__Group__0 ) ) )
            // InternalMath.g:167:2: ( ( rule__Term__Group__0 ) )
            {
            // InternalMath.g:167:2: ( ( rule__Term__Group__0 ) )
            // InternalMath.g:168:3: ( rule__Term__Group__0 )
            {
             before(grammarAccess.getTermAccess().getGroup()); 
            // InternalMath.g:169:3: ( rule__Term__Group__0 )
            // InternalMath.g:169:4: rule__Term__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Term__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTermAccess().getGroup()); 

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
    // $ANTLR end "ruleTerm"


    // $ANTLR start "entryRulePrimary"
    // InternalMath.g:178:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalMath.g:179:1: ( rulePrimary EOF )
            // InternalMath.g:180:1: rulePrimary EOF
            {
             before(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getPrimaryRule()); 
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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalMath.g:187:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:191:2: ( ( ( rule__Primary__Alternatives ) ) )
            // InternalMath.g:192:2: ( ( rule__Primary__Alternatives ) )
            {
            // InternalMath.g:192:2: ( ( rule__Primary__Alternatives ) )
            // InternalMath.g:193:3: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // InternalMath.g:194:3: ( rule__Primary__Alternatives )
            // InternalMath.g:194:4: rule__Primary__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getAlternatives()); 

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
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleLet"
    // InternalMath.g:203:1: entryRuleLet : ruleLet EOF ;
    public final void entryRuleLet() throws RecognitionException {
        try {
            // InternalMath.g:204:1: ( ruleLet EOF )
            // InternalMath.g:205:1: ruleLet EOF
            {
             before(grammarAccess.getLetRule()); 
            pushFollow(FOLLOW_1);
            ruleLet();

            state._fsp--;

             after(grammarAccess.getLetRule()); 
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
    // $ANTLR end "entryRuleLet"


    // $ANTLR start "ruleLet"
    // InternalMath.g:212:1: ruleLet : ( ( rule__Let__Group__0 ) ) ;
    public final void ruleLet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:216:2: ( ( ( rule__Let__Group__0 ) ) )
            // InternalMath.g:217:2: ( ( rule__Let__Group__0 ) )
            {
            // InternalMath.g:217:2: ( ( rule__Let__Group__0 ) )
            // InternalMath.g:218:3: ( rule__Let__Group__0 )
            {
             before(grammarAccess.getLetAccess().getGroup()); 
            // InternalMath.g:219:3: ( rule__Let__Group__0 )
            // InternalMath.g:219:4: rule__Let__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Let__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLetAccess().getGroup()); 

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
    // $ANTLR end "ruleLet"


    // $ANTLR start "entryRuleNumber"
    // InternalMath.g:228:1: entryRuleNumber : ruleNumber EOF ;
    public final void entryRuleNumber() throws RecognitionException {
        try {
            // InternalMath.g:229:1: ( ruleNumber EOF )
            // InternalMath.g:230:1: ruleNumber EOF
            {
             before(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_1);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getNumberRule()); 
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
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // InternalMath.g:237:1: ruleNumber : ( ( rule__Number__ValueAssignment ) ) ;
    public final void ruleNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:241:2: ( ( ( rule__Number__ValueAssignment ) ) )
            // InternalMath.g:242:2: ( ( rule__Number__ValueAssignment ) )
            {
            // InternalMath.g:242:2: ( ( rule__Number__ValueAssignment ) )
            // InternalMath.g:243:3: ( rule__Number__ValueAssignment )
            {
             before(grammarAccess.getNumberAccess().getValueAssignment()); 
            // InternalMath.g:244:3: ( rule__Number__ValueAssignment )
            // InternalMath.g:244:4: rule__Number__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Number__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNumberAccess().getValueAssignment()); 

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
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleParenthesis"
    // InternalMath.g:253:1: entryRuleParenthesis : ruleParenthesis EOF ;
    public final void entryRuleParenthesis() throws RecognitionException {
        try {
            // InternalMath.g:254:1: ( ruleParenthesis EOF )
            // InternalMath.g:255:1: ruleParenthesis EOF
            {
             before(grammarAccess.getParenthesisRule()); 
            pushFollow(FOLLOW_1);
            ruleParenthesis();

            state._fsp--;

             after(grammarAccess.getParenthesisRule()); 
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
    // $ANTLR end "entryRuleParenthesis"


    // $ANTLR start "ruleParenthesis"
    // InternalMath.g:262:1: ruleParenthesis : ( ( rule__Parenthesis__Group__0 ) ) ;
    public final void ruleParenthesis() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:266:2: ( ( ( rule__Parenthesis__Group__0 ) ) )
            // InternalMath.g:267:2: ( ( rule__Parenthesis__Group__0 ) )
            {
            // InternalMath.g:267:2: ( ( rule__Parenthesis__Group__0 ) )
            // InternalMath.g:268:3: ( rule__Parenthesis__Group__0 )
            {
             before(grammarAccess.getParenthesisAccess().getGroup()); 
            // InternalMath.g:269:3: ( rule__Parenthesis__Group__0 )
            // InternalMath.g:269:4: rule__Parenthesis__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parenthesis__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParenthesisAccess().getGroup()); 

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
    // $ANTLR end "ruleParenthesis"


    // $ANTLR start "entryRuleVariableUse"
    // InternalMath.g:278:1: entryRuleVariableUse : ruleVariableUse EOF ;
    public final void entryRuleVariableUse() throws RecognitionException {
        try {
            // InternalMath.g:279:1: ( ruleVariableUse EOF )
            // InternalMath.g:280:1: ruleVariableUse EOF
            {
             before(grammarAccess.getVariableUseRule()); 
            pushFollow(FOLLOW_1);
            ruleVariableUse();

            state._fsp--;

             after(grammarAccess.getVariableUseRule()); 
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
    // $ANTLR end "entryRuleVariableUse"


    // $ANTLR start "ruleVariableUse"
    // InternalMath.g:287:1: ruleVariableUse : ( ( rule__VariableUse__RefAssignment ) ) ;
    public final void ruleVariableUse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:291:2: ( ( ( rule__VariableUse__RefAssignment ) ) )
            // InternalMath.g:292:2: ( ( rule__VariableUse__RefAssignment ) )
            {
            // InternalMath.g:292:2: ( ( rule__VariableUse__RefAssignment ) )
            // InternalMath.g:293:3: ( rule__VariableUse__RefAssignment )
            {
             before(grammarAccess.getVariableUseAccess().getRefAssignment()); 
            // InternalMath.g:294:3: ( rule__VariableUse__RefAssignment )
            // InternalMath.g:294:4: rule__VariableUse__RefAssignment
            {
            pushFollow(FOLLOW_2);
            rule__VariableUse__RefAssignment();

            state._fsp--;


            }

             after(grammarAccess.getVariableUseAccess().getRefAssignment()); 

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
    // $ANTLR end "ruleVariableUse"


    // $ANTLR start "rule__Exp__Alternatives"
    // InternalMath.g:302:1: rule__Exp__Alternatives : ( ( rulePlusMinus ) | ( ruleVariableUse ) );
    public final void rule__Exp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:306:1: ( ( rulePlusMinus ) | ( ruleVariableUse ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_INT||LA2_0==17||LA2_0==20) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMath.g:307:2: ( rulePlusMinus )
                    {
                    // InternalMath.g:307:2: ( rulePlusMinus )
                    // InternalMath.g:308:3: rulePlusMinus
                    {
                     before(grammarAccess.getExpAccess().getPlusMinusParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePlusMinus();

                    state._fsp--;

                     after(grammarAccess.getExpAccess().getPlusMinusParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMath.g:313:2: ( ruleVariableUse )
                    {
                    // InternalMath.g:313:2: ( ruleVariableUse )
                    // InternalMath.g:314:3: ruleVariableUse
                    {
                     before(grammarAccess.getExpAccess().getVariableUseParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleVariableUse();

                    state._fsp--;

                     after(grammarAccess.getExpAccess().getVariableUseParserRuleCall_1()); 

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
    // $ANTLR end "rule__Exp__Alternatives"


    // $ANTLR start "rule__PlusMinus__Alternatives_1_0"
    // InternalMath.g:323:1: rule__PlusMinus__Alternatives_1_0 : ( ( ( rule__PlusMinus__Group_1_0_0__0 ) ) | ( ( rule__PlusMinus__Group_1_0_1__0 ) ) );
    public final void rule__PlusMinus__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:327:1: ( ( ( rule__PlusMinus__Group_1_0_0__0 ) ) | ( ( rule__PlusMinus__Group_1_0_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
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
                    // InternalMath.g:328:2: ( ( rule__PlusMinus__Group_1_0_0__0 ) )
                    {
                    // InternalMath.g:328:2: ( ( rule__PlusMinus__Group_1_0_0__0 ) )
                    // InternalMath.g:329:3: ( rule__PlusMinus__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getPlusMinusAccess().getGroup_1_0_0()); 
                    // InternalMath.g:330:3: ( rule__PlusMinus__Group_1_0_0__0 )
                    // InternalMath.g:330:4: rule__PlusMinus__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PlusMinus__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPlusMinusAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMath.g:334:2: ( ( rule__PlusMinus__Group_1_0_1__0 ) )
                    {
                    // InternalMath.g:334:2: ( ( rule__PlusMinus__Group_1_0_1__0 ) )
                    // InternalMath.g:335:3: ( rule__PlusMinus__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getPlusMinusAccess().getGroup_1_0_1()); 
                    // InternalMath.g:336:3: ( rule__PlusMinus__Group_1_0_1__0 )
                    // InternalMath.g:336:4: rule__PlusMinus__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PlusMinus__Group_1_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPlusMinusAccess().getGroup_1_0_1()); 

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
    // $ANTLR end "rule__PlusMinus__Alternatives_1_0"


    // $ANTLR start "rule__Term__OpAlternatives_1_0_1_0"
    // InternalMath.g:344:1: rule__Term__OpAlternatives_1_0_1_0 : ( ( '*' ) | ( '/' ) );
    public final void rule__Term__OpAlternatives_1_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:348:1: ( ( '*' ) | ( '/' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            else if ( (LA4_0==12) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMath.g:349:2: ( '*' )
                    {
                    // InternalMath.g:349:2: ( '*' )
                    // InternalMath.g:350:3: '*'
                    {
                     before(grammarAccess.getTermAccess().getOpAsteriskKeyword_1_0_1_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getTermAccess().getOpAsteriskKeyword_1_0_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMath.g:355:2: ( '/' )
                    {
                    // InternalMath.g:355:2: ( '/' )
                    // InternalMath.g:356:3: '/'
                    {
                     before(grammarAccess.getTermAccess().getOpSolidusKeyword_1_0_1_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getTermAccess().getOpSolidusKeyword_1_0_1_0_1()); 

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
    // $ANTLR end "rule__Term__OpAlternatives_1_0_1_0"


    // $ANTLR start "rule__Primary__Alternatives"
    // InternalMath.g:365:1: rule__Primary__Alternatives : ( ( ruleNumber ) | ( ruleParenthesis ) | ( ruleLet ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:369:1: ( ( ruleNumber ) | ( ruleParenthesis ) | ( ruleLet ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt5=1;
                }
                break;
            case 20:
                {
                alt5=2;
                }
                break;
            case 17:
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
                    // InternalMath.g:370:2: ( ruleNumber )
                    {
                    // InternalMath.g:370:2: ( ruleNumber )
                    // InternalMath.g:371:3: ruleNumber
                    {
                     before(grammarAccess.getPrimaryAccess().getNumberParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleNumber();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getNumberParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMath.g:376:2: ( ruleParenthesis )
                    {
                    // InternalMath.g:376:2: ( ruleParenthesis )
                    // InternalMath.g:377:3: ruleParenthesis
                    {
                     before(grammarAccess.getPrimaryAccess().getParenthesisParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleParenthesis();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getParenthesisParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMath.g:382:2: ( ruleLet )
                    {
                    // InternalMath.g:382:2: ( ruleLet )
                    // InternalMath.g:383:3: ruleLet
                    {
                     before(grammarAccess.getPrimaryAccess().getLetParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleLet();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getLetParserRuleCall_2()); 

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
    // $ANTLR end "rule__Primary__Alternatives"


    // $ANTLR start "rule__Statement__Group__0"
    // InternalMath.g:392:1: rule__Statement__Group__0 : rule__Statement__Group__0__Impl rule__Statement__Group__1 ;
    public final void rule__Statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:396:1: ( rule__Statement__Group__0__Impl rule__Statement__Group__1 )
            // InternalMath.g:397:2: rule__Statement__Group__0__Impl rule__Statement__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Statement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group__1();

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
    // $ANTLR end "rule__Statement__Group__0"


    // $ANTLR start "rule__Statement__Group__0__Impl"
    // InternalMath.g:404:1: rule__Statement__Group__0__Impl : ( 'var' ) ;
    public final void rule__Statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:408:1: ( ( 'var' ) )
            // InternalMath.g:409:1: ( 'var' )
            {
            // InternalMath.g:409:1: ( 'var' )
            // InternalMath.g:410:2: 'var'
            {
             before(grammarAccess.getStatementAccess().getVarKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getVarKeyword_0()); 

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
    // $ANTLR end "rule__Statement__Group__0__Impl"


    // $ANTLR start "rule__Statement__Group__1"
    // InternalMath.g:419:1: rule__Statement__Group__1 : rule__Statement__Group__1__Impl rule__Statement__Group__2 ;
    public final void rule__Statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:423:1: ( rule__Statement__Group__1__Impl rule__Statement__Group__2 )
            // InternalMath.g:424:2: rule__Statement__Group__1__Impl rule__Statement__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Statement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group__2();

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
    // $ANTLR end "rule__Statement__Group__1"


    // $ANTLR start "rule__Statement__Group__1__Impl"
    // InternalMath.g:431:1: rule__Statement__Group__1__Impl : ( ( rule__Statement__NameAssignment_1 ) ) ;
    public final void rule__Statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:435:1: ( ( ( rule__Statement__NameAssignment_1 ) ) )
            // InternalMath.g:436:1: ( ( rule__Statement__NameAssignment_1 ) )
            {
            // InternalMath.g:436:1: ( ( rule__Statement__NameAssignment_1 ) )
            // InternalMath.g:437:2: ( rule__Statement__NameAssignment_1 )
            {
             before(grammarAccess.getStatementAccess().getNameAssignment_1()); 
            // InternalMath.g:438:2: ( rule__Statement__NameAssignment_1 )
            // InternalMath.g:438:3: rule__Statement__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Statement__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Statement__Group__1__Impl"


    // $ANTLR start "rule__Statement__Group__2"
    // InternalMath.g:446:1: rule__Statement__Group__2 : rule__Statement__Group__2__Impl rule__Statement__Group__3 ;
    public final void rule__Statement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:450:1: ( rule__Statement__Group__2__Impl rule__Statement__Group__3 )
            // InternalMath.g:451:2: rule__Statement__Group__2__Impl rule__Statement__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Statement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group__3();

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
    // $ANTLR end "rule__Statement__Group__2"


    // $ANTLR start "rule__Statement__Group__2__Impl"
    // InternalMath.g:458:1: rule__Statement__Group__2__Impl : ( '=' ) ;
    public final void rule__Statement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:462:1: ( ( '=' ) )
            // InternalMath.g:463:1: ( '=' )
            {
            // InternalMath.g:463:1: ( '=' )
            // InternalMath.g:464:2: '='
            {
             before(grammarAccess.getStatementAccess().getEqualsSignKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getEqualsSignKeyword_2()); 

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
    // $ANTLR end "rule__Statement__Group__2__Impl"


    // $ANTLR start "rule__Statement__Group__3"
    // InternalMath.g:473:1: rule__Statement__Group__3 : rule__Statement__Group__3__Impl ;
    public final void rule__Statement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:477:1: ( rule__Statement__Group__3__Impl )
            // InternalMath.g:478:2: rule__Statement__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group__3__Impl();

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
    // $ANTLR end "rule__Statement__Group__3"


    // $ANTLR start "rule__Statement__Group__3__Impl"
    // InternalMath.g:484:1: rule__Statement__Group__3__Impl : ( ( rule__Statement__ExpAssignment_3 ) ) ;
    public final void rule__Statement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:488:1: ( ( ( rule__Statement__ExpAssignment_3 ) ) )
            // InternalMath.g:489:1: ( ( rule__Statement__ExpAssignment_3 ) )
            {
            // InternalMath.g:489:1: ( ( rule__Statement__ExpAssignment_3 ) )
            // InternalMath.g:490:2: ( rule__Statement__ExpAssignment_3 )
            {
             before(grammarAccess.getStatementAccess().getExpAssignment_3()); 
            // InternalMath.g:491:2: ( rule__Statement__ExpAssignment_3 )
            // InternalMath.g:491:3: rule__Statement__ExpAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Statement__ExpAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getExpAssignment_3()); 

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
    // $ANTLR end "rule__Statement__Group__3__Impl"


    // $ANTLR start "rule__PlusMinus__Group__0"
    // InternalMath.g:500:1: rule__PlusMinus__Group__0 : rule__PlusMinus__Group__0__Impl rule__PlusMinus__Group__1 ;
    public final void rule__PlusMinus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:504:1: ( rule__PlusMinus__Group__0__Impl rule__PlusMinus__Group__1 )
            // InternalMath.g:505:2: rule__PlusMinus__Group__0__Impl rule__PlusMinus__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__PlusMinus__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlusMinus__Group__1();

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
    // $ANTLR end "rule__PlusMinus__Group__0"


    // $ANTLR start "rule__PlusMinus__Group__0__Impl"
    // InternalMath.g:512:1: rule__PlusMinus__Group__0__Impl : ( ruleTerm ) ;
    public final void rule__PlusMinus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:516:1: ( ( ruleTerm ) )
            // InternalMath.g:517:1: ( ruleTerm )
            {
            // InternalMath.g:517:1: ( ruleTerm )
            // InternalMath.g:518:2: ruleTerm
            {
             before(grammarAccess.getPlusMinusAccess().getTermParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleTerm();

            state._fsp--;

             after(grammarAccess.getPlusMinusAccess().getTermParserRuleCall_0()); 

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
    // $ANTLR end "rule__PlusMinus__Group__0__Impl"


    // $ANTLR start "rule__PlusMinus__Group__1"
    // InternalMath.g:527:1: rule__PlusMinus__Group__1 : rule__PlusMinus__Group__1__Impl ;
    public final void rule__PlusMinus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:531:1: ( rule__PlusMinus__Group__1__Impl )
            // InternalMath.g:532:2: rule__PlusMinus__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusMinus__Group__1__Impl();

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
    // $ANTLR end "rule__PlusMinus__Group__1"


    // $ANTLR start "rule__PlusMinus__Group__1__Impl"
    // InternalMath.g:538:1: rule__PlusMinus__Group__1__Impl : ( ( rule__PlusMinus__Group_1__0 )* ) ;
    public final void rule__PlusMinus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:542:1: ( ( ( rule__PlusMinus__Group_1__0 )* ) )
            // InternalMath.g:543:1: ( ( rule__PlusMinus__Group_1__0 )* )
            {
            // InternalMath.g:543:1: ( ( rule__PlusMinus__Group_1__0 )* )
            // InternalMath.g:544:2: ( rule__PlusMinus__Group_1__0 )*
            {
             before(grammarAccess.getPlusMinusAccess().getGroup_1()); 
            // InternalMath.g:545:2: ( rule__PlusMinus__Group_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=15 && LA6_0<=16)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMath.g:545:3: rule__PlusMinus__Group_1__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__PlusMinus__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getPlusMinusAccess().getGroup_1()); 

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
    // $ANTLR end "rule__PlusMinus__Group__1__Impl"


    // $ANTLR start "rule__PlusMinus__Group_1__0"
    // InternalMath.g:554:1: rule__PlusMinus__Group_1__0 : rule__PlusMinus__Group_1__0__Impl rule__PlusMinus__Group_1__1 ;
    public final void rule__PlusMinus__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:558:1: ( rule__PlusMinus__Group_1__0__Impl rule__PlusMinus__Group_1__1 )
            // InternalMath.g:559:2: rule__PlusMinus__Group_1__0__Impl rule__PlusMinus__Group_1__1
            {
            pushFollow(FOLLOW_9);
            rule__PlusMinus__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlusMinus__Group_1__1();

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
    // $ANTLR end "rule__PlusMinus__Group_1__0"


    // $ANTLR start "rule__PlusMinus__Group_1__0__Impl"
    // InternalMath.g:566:1: rule__PlusMinus__Group_1__0__Impl : ( ( rule__PlusMinus__Alternatives_1_0 ) ) ;
    public final void rule__PlusMinus__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:570:1: ( ( ( rule__PlusMinus__Alternatives_1_0 ) ) )
            // InternalMath.g:571:1: ( ( rule__PlusMinus__Alternatives_1_0 ) )
            {
            // InternalMath.g:571:1: ( ( rule__PlusMinus__Alternatives_1_0 ) )
            // InternalMath.g:572:2: ( rule__PlusMinus__Alternatives_1_0 )
            {
             before(grammarAccess.getPlusMinusAccess().getAlternatives_1_0()); 
            // InternalMath.g:573:2: ( rule__PlusMinus__Alternatives_1_0 )
            // InternalMath.g:573:3: rule__PlusMinus__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__PlusMinus__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getPlusMinusAccess().getAlternatives_1_0()); 

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
    // $ANTLR end "rule__PlusMinus__Group_1__0__Impl"


    // $ANTLR start "rule__PlusMinus__Group_1__1"
    // InternalMath.g:581:1: rule__PlusMinus__Group_1__1 : rule__PlusMinus__Group_1__1__Impl ;
    public final void rule__PlusMinus__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:585:1: ( rule__PlusMinus__Group_1__1__Impl )
            // InternalMath.g:586:2: rule__PlusMinus__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusMinus__Group_1__1__Impl();

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
    // $ANTLR end "rule__PlusMinus__Group_1__1"


    // $ANTLR start "rule__PlusMinus__Group_1__1__Impl"
    // InternalMath.g:592:1: rule__PlusMinus__Group_1__1__Impl : ( ( rule__PlusMinus__RightAssignment_1_1 ) ) ;
    public final void rule__PlusMinus__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:596:1: ( ( ( rule__PlusMinus__RightAssignment_1_1 ) ) )
            // InternalMath.g:597:1: ( ( rule__PlusMinus__RightAssignment_1_1 ) )
            {
            // InternalMath.g:597:1: ( ( rule__PlusMinus__RightAssignment_1_1 ) )
            // InternalMath.g:598:2: ( rule__PlusMinus__RightAssignment_1_1 )
            {
             before(grammarAccess.getPlusMinusAccess().getRightAssignment_1_1()); 
            // InternalMath.g:599:2: ( rule__PlusMinus__RightAssignment_1_1 )
            // InternalMath.g:599:3: rule__PlusMinus__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__PlusMinus__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPlusMinusAccess().getRightAssignment_1_1()); 

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
    // $ANTLR end "rule__PlusMinus__Group_1__1__Impl"


    // $ANTLR start "rule__PlusMinus__Group_1_0_0__0"
    // InternalMath.g:608:1: rule__PlusMinus__Group_1_0_0__0 : rule__PlusMinus__Group_1_0_0__0__Impl rule__PlusMinus__Group_1_0_0__1 ;
    public final void rule__PlusMinus__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:612:1: ( rule__PlusMinus__Group_1_0_0__0__Impl rule__PlusMinus__Group_1_0_0__1 )
            // InternalMath.g:613:2: rule__PlusMinus__Group_1_0_0__0__Impl rule__PlusMinus__Group_1_0_0__1
            {
            pushFollow(FOLLOW_10);
            rule__PlusMinus__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlusMinus__Group_1_0_0__1();

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
    // $ANTLR end "rule__PlusMinus__Group_1_0_0__0"


    // $ANTLR start "rule__PlusMinus__Group_1_0_0__0__Impl"
    // InternalMath.g:620:1: rule__PlusMinus__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__PlusMinus__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:624:1: ( ( () ) )
            // InternalMath.g:625:1: ( () )
            {
            // InternalMath.g:625:1: ( () )
            // InternalMath.g:626:2: ()
            {
             before(grammarAccess.getPlusMinusAccess().getPlusLeftAction_1_0_0_0()); 
            // InternalMath.g:627:2: ()
            // InternalMath.g:627:3: 
            {
            }

             after(grammarAccess.getPlusMinusAccess().getPlusLeftAction_1_0_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusMinus__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__PlusMinus__Group_1_0_0__1"
    // InternalMath.g:635:1: rule__PlusMinus__Group_1_0_0__1 : rule__PlusMinus__Group_1_0_0__1__Impl ;
    public final void rule__PlusMinus__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:639:1: ( rule__PlusMinus__Group_1_0_0__1__Impl )
            // InternalMath.g:640:2: rule__PlusMinus__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusMinus__Group_1_0_0__1__Impl();

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
    // $ANTLR end "rule__PlusMinus__Group_1_0_0__1"


    // $ANTLR start "rule__PlusMinus__Group_1_0_0__1__Impl"
    // InternalMath.g:646:1: rule__PlusMinus__Group_1_0_0__1__Impl : ( '+' ) ;
    public final void rule__PlusMinus__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:650:1: ( ( '+' ) )
            // InternalMath.g:651:1: ( '+' )
            {
            // InternalMath.g:651:1: ( '+' )
            // InternalMath.g:652:2: '+'
            {
             before(grammarAccess.getPlusMinusAccess().getPlusSignKeyword_1_0_0_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPlusMinusAccess().getPlusSignKeyword_1_0_0_1()); 

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
    // $ANTLR end "rule__PlusMinus__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__PlusMinus__Group_1_0_1__0"
    // InternalMath.g:662:1: rule__PlusMinus__Group_1_0_1__0 : rule__PlusMinus__Group_1_0_1__0__Impl rule__PlusMinus__Group_1_0_1__1 ;
    public final void rule__PlusMinus__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:666:1: ( rule__PlusMinus__Group_1_0_1__0__Impl rule__PlusMinus__Group_1_0_1__1 )
            // InternalMath.g:667:2: rule__PlusMinus__Group_1_0_1__0__Impl rule__PlusMinus__Group_1_0_1__1
            {
            pushFollow(FOLLOW_7);
            rule__PlusMinus__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlusMinus__Group_1_0_1__1();

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
    // $ANTLR end "rule__PlusMinus__Group_1_0_1__0"


    // $ANTLR start "rule__PlusMinus__Group_1_0_1__0__Impl"
    // InternalMath.g:674:1: rule__PlusMinus__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__PlusMinus__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:678:1: ( ( () ) )
            // InternalMath.g:679:1: ( () )
            {
            // InternalMath.g:679:1: ( () )
            // InternalMath.g:680:2: ()
            {
             before(grammarAccess.getPlusMinusAccess().getMinusLeftAction_1_0_1_0()); 
            // InternalMath.g:681:2: ()
            // InternalMath.g:681:3: 
            {
            }

             after(grammarAccess.getPlusMinusAccess().getMinusLeftAction_1_0_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusMinus__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__PlusMinus__Group_1_0_1__1"
    // InternalMath.g:689:1: rule__PlusMinus__Group_1_0_1__1 : rule__PlusMinus__Group_1_0_1__1__Impl ;
    public final void rule__PlusMinus__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:693:1: ( rule__PlusMinus__Group_1_0_1__1__Impl )
            // InternalMath.g:694:2: rule__PlusMinus__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusMinus__Group_1_0_1__1__Impl();

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
    // $ANTLR end "rule__PlusMinus__Group_1_0_1__1"


    // $ANTLR start "rule__PlusMinus__Group_1_0_1__1__Impl"
    // InternalMath.g:700:1: rule__PlusMinus__Group_1_0_1__1__Impl : ( '-' ) ;
    public final void rule__PlusMinus__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:704:1: ( ( '-' ) )
            // InternalMath.g:705:1: ( '-' )
            {
            // InternalMath.g:705:1: ( '-' )
            // InternalMath.g:706:2: '-'
            {
             before(grammarAccess.getPlusMinusAccess().getHyphenMinusKeyword_1_0_1_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPlusMinusAccess().getHyphenMinusKeyword_1_0_1_1()); 

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
    // $ANTLR end "rule__PlusMinus__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__Term__Group__0"
    // InternalMath.g:716:1: rule__Term__Group__0 : rule__Term__Group__0__Impl rule__Term__Group__1 ;
    public final void rule__Term__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:720:1: ( rule__Term__Group__0__Impl rule__Term__Group__1 )
            // InternalMath.g:721:2: rule__Term__Group__0__Impl rule__Term__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Term__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Term__Group__1();

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
    // $ANTLR end "rule__Term__Group__0"


    // $ANTLR start "rule__Term__Group__0__Impl"
    // InternalMath.g:728:1: rule__Term__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__Term__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:732:1: ( ( rulePrimary ) )
            // InternalMath.g:733:1: ( rulePrimary )
            {
            // InternalMath.g:733:1: ( rulePrimary )
            // InternalMath.g:734:2: rulePrimary
            {
             before(grammarAccess.getTermAccess().getPrimaryParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getTermAccess().getPrimaryParserRuleCall_0()); 

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
    // $ANTLR end "rule__Term__Group__0__Impl"


    // $ANTLR start "rule__Term__Group__1"
    // InternalMath.g:743:1: rule__Term__Group__1 : rule__Term__Group__1__Impl ;
    public final void rule__Term__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:747:1: ( rule__Term__Group__1__Impl )
            // InternalMath.g:748:2: rule__Term__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Term__Group__1__Impl();

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
    // $ANTLR end "rule__Term__Group__1"


    // $ANTLR start "rule__Term__Group__1__Impl"
    // InternalMath.g:754:1: rule__Term__Group__1__Impl : ( ( rule__Term__Group_1__0 )* ) ;
    public final void rule__Term__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:758:1: ( ( ( rule__Term__Group_1__0 )* ) )
            // InternalMath.g:759:1: ( ( rule__Term__Group_1__0 )* )
            {
            // InternalMath.g:759:1: ( ( rule__Term__Group_1__0 )* )
            // InternalMath.g:760:2: ( rule__Term__Group_1__0 )*
            {
             before(grammarAccess.getTermAccess().getGroup_1()); 
            // InternalMath.g:761:2: ( rule__Term__Group_1__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=11 && LA7_0<=12)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMath.g:761:3: rule__Term__Group_1__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Term__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getTermAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Term__Group__1__Impl"


    // $ANTLR start "rule__Term__Group_1__0"
    // InternalMath.g:770:1: rule__Term__Group_1__0 : rule__Term__Group_1__0__Impl rule__Term__Group_1__1 ;
    public final void rule__Term__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:774:1: ( rule__Term__Group_1__0__Impl rule__Term__Group_1__1 )
            // InternalMath.g:775:2: rule__Term__Group_1__0__Impl rule__Term__Group_1__1
            {
            pushFollow(FOLLOW_9);
            rule__Term__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Term__Group_1__1();

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
    // $ANTLR end "rule__Term__Group_1__0"


    // $ANTLR start "rule__Term__Group_1__0__Impl"
    // InternalMath.g:782:1: rule__Term__Group_1__0__Impl : ( ( rule__Term__Group_1_0__0 ) ) ;
    public final void rule__Term__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:786:1: ( ( ( rule__Term__Group_1_0__0 ) ) )
            // InternalMath.g:787:1: ( ( rule__Term__Group_1_0__0 ) )
            {
            // InternalMath.g:787:1: ( ( rule__Term__Group_1_0__0 ) )
            // InternalMath.g:788:2: ( rule__Term__Group_1_0__0 )
            {
             before(grammarAccess.getTermAccess().getGroup_1_0()); 
            // InternalMath.g:789:2: ( rule__Term__Group_1_0__0 )
            // InternalMath.g:789:3: rule__Term__Group_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__Term__Group_1_0__0();

            state._fsp--;


            }

             after(grammarAccess.getTermAccess().getGroup_1_0()); 

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
    // $ANTLR end "rule__Term__Group_1__0__Impl"


    // $ANTLR start "rule__Term__Group_1__1"
    // InternalMath.g:797:1: rule__Term__Group_1__1 : rule__Term__Group_1__1__Impl ;
    public final void rule__Term__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:801:1: ( rule__Term__Group_1__1__Impl )
            // InternalMath.g:802:2: rule__Term__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Term__Group_1__1__Impl();

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
    // $ANTLR end "rule__Term__Group_1__1"


    // $ANTLR start "rule__Term__Group_1__1__Impl"
    // InternalMath.g:808:1: rule__Term__Group_1__1__Impl : ( ( rule__Term__RightAssignment_1_1 ) ) ;
    public final void rule__Term__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:812:1: ( ( ( rule__Term__RightAssignment_1_1 ) ) )
            // InternalMath.g:813:1: ( ( rule__Term__RightAssignment_1_1 ) )
            {
            // InternalMath.g:813:1: ( ( rule__Term__RightAssignment_1_1 ) )
            // InternalMath.g:814:2: ( rule__Term__RightAssignment_1_1 )
            {
             before(grammarAccess.getTermAccess().getRightAssignment_1_1()); 
            // InternalMath.g:815:2: ( rule__Term__RightAssignment_1_1 )
            // InternalMath.g:815:3: rule__Term__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Term__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTermAccess().getRightAssignment_1_1()); 

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
    // $ANTLR end "rule__Term__Group_1__1__Impl"


    // $ANTLR start "rule__Term__Group_1_0__0"
    // InternalMath.g:824:1: rule__Term__Group_1_0__0 : rule__Term__Group_1_0__0__Impl rule__Term__Group_1_0__1 ;
    public final void rule__Term__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:828:1: ( rule__Term__Group_1_0__0__Impl rule__Term__Group_1_0__1 )
            // InternalMath.g:829:2: rule__Term__Group_1_0__0__Impl rule__Term__Group_1_0__1
            {
            pushFollow(FOLLOW_11);
            rule__Term__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Term__Group_1_0__1();

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
    // $ANTLR end "rule__Term__Group_1_0__0"


    // $ANTLR start "rule__Term__Group_1_0__0__Impl"
    // InternalMath.g:836:1: rule__Term__Group_1_0__0__Impl : ( () ) ;
    public final void rule__Term__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:840:1: ( ( () ) )
            // InternalMath.g:841:1: ( () )
            {
            // InternalMath.g:841:1: ( () )
            // InternalMath.g:842:2: ()
            {
             before(grammarAccess.getTermAccess().getTermLeftAction_1_0_0()); 
            // InternalMath.g:843:2: ()
            // InternalMath.g:843:3: 
            {
            }

             after(grammarAccess.getTermAccess().getTermLeftAction_1_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1_0__0__Impl"


    // $ANTLR start "rule__Term__Group_1_0__1"
    // InternalMath.g:851:1: rule__Term__Group_1_0__1 : rule__Term__Group_1_0__1__Impl ;
    public final void rule__Term__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:855:1: ( rule__Term__Group_1_0__1__Impl )
            // InternalMath.g:856:2: rule__Term__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Term__Group_1_0__1__Impl();

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
    // $ANTLR end "rule__Term__Group_1_0__1"


    // $ANTLR start "rule__Term__Group_1_0__1__Impl"
    // InternalMath.g:862:1: rule__Term__Group_1_0__1__Impl : ( ( rule__Term__OpAssignment_1_0_1 ) ) ;
    public final void rule__Term__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:866:1: ( ( ( rule__Term__OpAssignment_1_0_1 ) ) )
            // InternalMath.g:867:1: ( ( rule__Term__OpAssignment_1_0_1 ) )
            {
            // InternalMath.g:867:1: ( ( rule__Term__OpAssignment_1_0_1 ) )
            // InternalMath.g:868:2: ( rule__Term__OpAssignment_1_0_1 )
            {
             before(grammarAccess.getTermAccess().getOpAssignment_1_0_1()); 
            // InternalMath.g:869:2: ( rule__Term__OpAssignment_1_0_1 )
            // InternalMath.g:869:3: rule__Term__OpAssignment_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Term__OpAssignment_1_0_1();

            state._fsp--;


            }

             after(grammarAccess.getTermAccess().getOpAssignment_1_0_1()); 

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
    // $ANTLR end "rule__Term__Group_1_0__1__Impl"


    // $ANTLR start "rule__Let__Group__0"
    // InternalMath.g:878:1: rule__Let__Group__0 : rule__Let__Group__0__Impl rule__Let__Group__1 ;
    public final void rule__Let__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:882:1: ( rule__Let__Group__0__Impl rule__Let__Group__1 )
            // InternalMath.g:883:2: rule__Let__Group__0__Impl rule__Let__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Let__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Let__Group__1();

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
    // $ANTLR end "rule__Let__Group__0"


    // $ANTLR start "rule__Let__Group__0__Impl"
    // InternalMath.g:890:1: rule__Let__Group__0__Impl : ( 'let' ) ;
    public final void rule__Let__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:894:1: ( ( 'let' ) )
            // InternalMath.g:895:1: ( 'let' )
            {
            // InternalMath.g:895:1: ( 'let' )
            // InternalMath.g:896:2: 'let'
            {
             before(grammarAccess.getLetAccess().getLetKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getLetAccess().getLetKeyword_0()); 

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
    // $ANTLR end "rule__Let__Group__0__Impl"


    // $ANTLR start "rule__Let__Group__1"
    // InternalMath.g:905:1: rule__Let__Group__1 : rule__Let__Group__1__Impl rule__Let__Group__2 ;
    public final void rule__Let__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:909:1: ( rule__Let__Group__1__Impl rule__Let__Group__2 )
            // InternalMath.g:910:2: rule__Let__Group__1__Impl rule__Let__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Let__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Let__Group__2();

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
    // $ANTLR end "rule__Let__Group__1"


    // $ANTLR start "rule__Let__Group__1__Impl"
    // InternalMath.g:917:1: rule__Let__Group__1__Impl : ( ( rule__Let__NameAssignment_1 ) ) ;
    public final void rule__Let__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:921:1: ( ( ( rule__Let__NameAssignment_1 ) ) )
            // InternalMath.g:922:1: ( ( rule__Let__NameAssignment_1 ) )
            {
            // InternalMath.g:922:1: ( ( rule__Let__NameAssignment_1 ) )
            // InternalMath.g:923:2: ( rule__Let__NameAssignment_1 )
            {
             before(grammarAccess.getLetAccess().getNameAssignment_1()); 
            // InternalMath.g:924:2: ( rule__Let__NameAssignment_1 )
            // InternalMath.g:924:3: rule__Let__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Let__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLetAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Let__Group__1__Impl"


    // $ANTLR start "rule__Let__Group__2"
    // InternalMath.g:932:1: rule__Let__Group__2 : rule__Let__Group__2__Impl rule__Let__Group__3 ;
    public final void rule__Let__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:936:1: ( rule__Let__Group__2__Impl rule__Let__Group__3 )
            // InternalMath.g:937:2: rule__Let__Group__2__Impl rule__Let__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Let__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Let__Group__3();

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
    // $ANTLR end "rule__Let__Group__2"


    // $ANTLR start "rule__Let__Group__2__Impl"
    // InternalMath.g:944:1: rule__Let__Group__2__Impl : ( '=' ) ;
    public final void rule__Let__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:948:1: ( ( '=' ) )
            // InternalMath.g:949:1: ( '=' )
            {
            // InternalMath.g:949:1: ( '=' )
            // InternalMath.g:950:2: '='
            {
             before(grammarAccess.getLetAccess().getEqualsSignKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getLetAccess().getEqualsSignKeyword_2()); 

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
    // $ANTLR end "rule__Let__Group__2__Impl"


    // $ANTLR start "rule__Let__Group__3"
    // InternalMath.g:959:1: rule__Let__Group__3 : rule__Let__Group__3__Impl rule__Let__Group__4 ;
    public final void rule__Let__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:963:1: ( rule__Let__Group__3__Impl rule__Let__Group__4 )
            // InternalMath.g:964:2: rule__Let__Group__3__Impl rule__Let__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Let__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Let__Group__4();

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
    // $ANTLR end "rule__Let__Group__3"


    // $ANTLR start "rule__Let__Group__3__Impl"
    // InternalMath.g:971:1: rule__Let__Group__3__Impl : ( ( rule__Let__LetExpAssignment_3 ) ) ;
    public final void rule__Let__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:975:1: ( ( ( rule__Let__LetExpAssignment_3 ) ) )
            // InternalMath.g:976:1: ( ( rule__Let__LetExpAssignment_3 ) )
            {
            // InternalMath.g:976:1: ( ( rule__Let__LetExpAssignment_3 ) )
            // InternalMath.g:977:2: ( rule__Let__LetExpAssignment_3 )
            {
             before(grammarAccess.getLetAccess().getLetExpAssignment_3()); 
            // InternalMath.g:978:2: ( rule__Let__LetExpAssignment_3 )
            // InternalMath.g:978:3: rule__Let__LetExpAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Let__LetExpAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLetAccess().getLetExpAssignment_3()); 

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
    // $ANTLR end "rule__Let__Group__3__Impl"


    // $ANTLR start "rule__Let__Group__4"
    // InternalMath.g:986:1: rule__Let__Group__4 : rule__Let__Group__4__Impl rule__Let__Group__5 ;
    public final void rule__Let__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:990:1: ( rule__Let__Group__4__Impl rule__Let__Group__5 )
            // InternalMath.g:991:2: rule__Let__Group__4__Impl rule__Let__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Let__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Let__Group__5();

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
    // $ANTLR end "rule__Let__Group__4"


    // $ANTLR start "rule__Let__Group__4__Impl"
    // InternalMath.g:998:1: rule__Let__Group__4__Impl : ( 'in' ) ;
    public final void rule__Let__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1002:1: ( ( 'in' ) )
            // InternalMath.g:1003:1: ( 'in' )
            {
            // InternalMath.g:1003:1: ( 'in' )
            // InternalMath.g:1004:2: 'in'
            {
             before(grammarAccess.getLetAccess().getInKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getLetAccess().getInKeyword_4()); 

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
    // $ANTLR end "rule__Let__Group__4__Impl"


    // $ANTLR start "rule__Let__Group__5"
    // InternalMath.g:1013:1: rule__Let__Group__5 : rule__Let__Group__5__Impl rule__Let__Group__6 ;
    public final void rule__Let__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1017:1: ( rule__Let__Group__5__Impl rule__Let__Group__6 )
            // InternalMath.g:1018:2: rule__Let__Group__5__Impl rule__Let__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__Let__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Let__Group__6();

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
    // $ANTLR end "rule__Let__Group__5"


    // $ANTLR start "rule__Let__Group__5__Impl"
    // InternalMath.g:1025:1: rule__Let__Group__5__Impl : ( ( rule__Let__InExpAssignment_5 ) ) ;
    public final void rule__Let__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1029:1: ( ( ( rule__Let__InExpAssignment_5 ) ) )
            // InternalMath.g:1030:1: ( ( rule__Let__InExpAssignment_5 ) )
            {
            // InternalMath.g:1030:1: ( ( rule__Let__InExpAssignment_5 ) )
            // InternalMath.g:1031:2: ( rule__Let__InExpAssignment_5 )
            {
             before(grammarAccess.getLetAccess().getInExpAssignment_5()); 
            // InternalMath.g:1032:2: ( rule__Let__InExpAssignment_5 )
            // InternalMath.g:1032:3: rule__Let__InExpAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Let__InExpAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getLetAccess().getInExpAssignment_5()); 

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
    // $ANTLR end "rule__Let__Group__5__Impl"


    // $ANTLR start "rule__Let__Group__6"
    // InternalMath.g:1040:1: rule__Let__Group__6 : rule__Let__Group__6__Impl ;
    public final void rule__Let__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1044:1: ( rule__Let__Group__6__Impl )
            // InternalMath.g:1045:2: rule__Let__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Let__Group__6__Impl();

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
    // $ANTLR end "rule__Let__Group__6"


    // $ANTLR start "rule__Let__Group__6__Impl"
    // InternalMath.g:1051:1: rule__Let__Group__6__Impl : ( 'end' ) ;
    public final void rule__Let__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1055:1: ( ( 'end' ) )
            // InternalMath.g:1056:1: ( 'end' )
            {
            // InternalMath.g:1056:1: ( 'end' )
            // InternalMath.g:1057:2: 'end'
            {
             before(grammarAccess.getLetAccess().getEndKeyword_6()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getLetAccess().getEndKeyword_6()); 

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
    // $ANTLR end "rule__Let__Group__6__Impl"


    // $ANTLR start "rule__Parenthesis__Group__0"
    // InternalMath.g:1067:1: rule__Parenthesis__Group__0 : rule__Parenthesis__Group__0__Impl rule__Parenthesis__Group__1 ;
    public final void rule__Parenthesis__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1071:1: ( rule__Parenthesis__Group__0__Impl rule__Parenthesis__Group__1 )
            // InternalMath.g:1072:2: rule__Parenthesis__Group__0__Impl rule__Parenthesis__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Parenthesis__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parenthesis__Group__1();

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
    // $ANTLR end "rule__Parenthesis__Group__0"


    // $ANTLR start "rule__Parenthesis__Group__0__Impl"
    // InternalMath.g:1079:1: rule__Parenthesis__Group__0__Impl : ( '(' ) ;
    public final void rule__Parenthesis__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1083:1: ( ( '(' ) )
            // InternalMath.g:1084:1: ( '(' )
            {
            // InternalMath.g:1084:1: ( '(' )
            // InternalMath.g:1085:2: '('
            {
             before(grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_0()); 

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
    // $ANTLR end "rule__Parenthesis__Group__0__Impl"


    // $ANTLR start "rule__Parenthesis__Group__1"
    // InternalMath.g:1094:1: rule__Parenthesis__Group__1 : rule__Parenthesis__Group__1__Impl rule__Parenthesis__Group__2 ;
    public final void rule__Parenthesis__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1098:1: ( rule__Parenthesis__Group__1__Impl rule__Parenthesis__Group__2 )
            // InternalMath.g:1099:2: rule__Parenthesis__Group__1__Impl rule__Parenthesis__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Parenthesis__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parenthesis__Group__2();

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
    // $ANTLR end "rule__Parenthesis__Group__1"


    // $ANTLR start "rule__Parenthesis__Group__1__Impl"
    // InternalMath.g:1106:1: rule__Parenthesis__Group__1__Impl : ( ( rule__Parenthesis__ExpAssignment_1 ) ) ;
    public final void rule__Parenthesis__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1110:1: ( ( ( rule__Parenthesis__ExpAssignment_1 ) ) )
            // InternalMath.g:1111:1: ( ( rule__Parenthesis__ExpAssignment_1 ) )
            {
            // InternalMath.g:1111:1: ( ( rule__Parenthesis__ExpAssignment_1 ) )
            // InternalMath.g:1112:2: ( rule__Parenthesis__ExpAssignment_1 )
            {
             before(grammarAccess.getParenthesisAccess().getExpAssignment_1()); 
            // InternalMath.g:1113:2: ( rule__Parenthesis__ExpAssignment_1 )
            // InternalMath.g:1113:3: rule__Parenthesis__ExpAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Parenthesis__ExpAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParenthesisAccess().getExpAssignment_1()); 

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
    // $ANTLR end "rule__Parenthesis__Group__1__Impl"


    // $ANTLR start "rule__Parenthesis__Group__2"
    // InternalMath.g:1121:1: rule__Parenthesis__Group__2 : rule__Parenthesis__Group__2__Impl ;
    public final void rule__Parenthesis__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1125:1: ( rule__Parenthesis__Group__2__Impl )
            // InternalMath.g:1126:2: rule__Parenthesis__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parenthesis__Group__2__Impl();

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
    // $ANTLR end "rule__Parenthesis__Group__2"


    // $ANTLR start "rule__Parenthesis__Group__2__Impl"
    // InternalMath.g:1132:1: rule__Parenthesis__Group__2__Impl : ( ')' ) ;
    public final void rule__Parenthesis__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1136:1: ( ( ')' ) )
            // InternalMath.g:1137:1: ( ')' )
            {
            // InternalMath.g:1137:1: ( ')' )
            // InternalMath.g:1138:2: ')'
            {
             before(grammarAccess.getParenthesisAccess().getRightParenthesisKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getParenthesisAccess().getRightParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__Parenthesis__Group__2__Impl"


    // $ANTLR start "rule__MathExp__MathAssignment"
    // InternalMath.g:1148:1: rule__MathExp__MathAssignment : ( ruleStatement ) ;
    public final void rule__MathExp__MathAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1152:1: ( ( ruleStatement ) )
            // InternalMath.g:1153:2: ( ruleStatement )
            {
            // InternalMath.g:1153:2: ( ruleStatement )
            // InternalMath.g:1154:3: ruleStatement
            {
             before(grammarAccess.getMathExpAccess().getMathStatementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getMathExpAccess().getMathStatementParserRuleCall_0()); 

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
    // $ANTLR end "rule__MathExp__MathAssignment"


    // $ANTLR start "rule__Statement__NameAssignment_1"
    // InternalMath.g:1163:1: rule__Statement__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Statement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1167:1: ( ( RULE_ID ) )
            // InternalMath.g:1168:2: ( RULE_ID )
            {
            // InternalMath.g:1168:2: ( RULE_ID )
            // InternalMath.g:1169:3: RULE_ID
            {
             before(grammarAccess.getStatementAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Statement__NameAssignment_1"


    // $ANTLR start "rule__Statement__ExpAssignment_3"
    // InternalMath.g:1178:1: rule__Statement__ExpAssignment_3 : ( ruleExp ) ;
    public final void rule__Statement__ExpAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1182:1: ( ( ruleExp ) )
            // InternalMath.g:1183:2: ( ruleExp )
            {
            // InternalMath.g:1183:2: ( ruleExp )
            // InternalMath.g:1184:3: ruleExp
            {
             before(grammarAccess.getStatementAccess().getExpExpParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getExpExpParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Statement__ExpAssignment_3"


    // $ANTLR start "rule__PlusMinus__RightAssignment_1_1"
    // InternalMath.g:1193:1: rule__PlusMinus__RightAssignment_1_1 : ( ruleTerm ) ;
    public final void rule__PlusMinus__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1197:1: ( ( ruleTerm ) )
            // InternalMath.g:1198:2: ( ruleTerm )
            {
            // InternalMath.g:1198:2: ( ruleTerm )
            // InternalMath.g:1199:3: ruleTerm
            {
             before(grammarAccess.getPlusMinusAccess().getRightTermParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTerm();

            state._fsp--;

             after(grammarAccess.getPlusMinusAccess().getRightTermParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__PlusMinus__RightAssignment_1_1"


    // $ANTLR start "rule__Term__OpAssignment_1_0_1"
    // InternalMath.g:1208:1: rule__Term__OpAssignment_1_0_1 : ( ( rule__Term__OpAlternatives_1_0_1_0 ) ) ;
    public final void rule__Term__OpAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1212:1: ( ( ( rule__Term__OpAlternatives_1_0_1_0 ) ) )
            // InternalMath.g:1213:2: ( ( rule__Term__OpAlternatives_1_0_1_0 ) )
            {
            // InternalMath.g:1213:2: ( ( rule__Term__OpAlternatives_1_0_1_0 ) )
            // InternalMath.g:1214:3: ( rule__Term__OpAlternatives_1_0_1_0 )
            {
             before(grammarAccess.getTermAccess().getOpAlternatives_1_0_1_0()); 
            // InternalMath.g:1215:3: ( rule__Term__OpAlternatives_1_0_1_0 )
            // InternalMath.g:1215:4: rule__Term__OpAlternatives_1_0_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Term__OpAlternatives_1_0_1_0();

            state._fsp--;


            }

             after(grammarAccess.getTermAccess().getOpAlternatives_1_0_1_0()); 

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
    // $ANTLR end "rule__Term__OpAssignment_1_0_1"


    // $ANTLR start "rule__Term__RightAssignment_1_1"
    // InternalMath.g:1223:1: rule__Term__RightAssignment_1_1 : ( rulePrimary ) ;
    public final void rule__Term__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1227:1: ( ( rulePrimary ) )
            // InternalMath.g:1228:2: ( rulePrimary )
            {
            // InternalMath.g:1228:2: ( rulePrimary )
            // InternalMath.g:1229:3: rulePrimary
            {
             before(grammarAccess.getTermAccess().getRightPrimaryParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getTermAccess().getRightPrimaryParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Term__RightAssignment_1_1"


    // $ANTLR start "rule__Let__NameAssignment_1"
    // InternalMath.g:1238:1: rule__Let__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Let__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1242:1: ( ( RULE_ID ) )
            // InternalMath.g:1243:2: ( RULE_ID )
            {
            // InternalMath.g:1243:2: ( RULE_ID )
            // InternalMath.g:1244:3: RULE_ID
            {
             before(grammarAccess.getLetAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLetAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Let__NameAssignment_1"


    // $ANTLR start "rule__Let__LetExpAssignment_3"
    // InternalMath.g:1253:1: rule__Let__LetExpAssignment_3 : ( ruleExp ) ;
    public final void rule__Let__LetExpAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1257:1: ( ( ruleExp ) )
            // InternalMath.g:1258:2: ( ruleExp )
            {
            // InternalMath.g:1258:2: ( ruleExp )
            // InternalMath.g:1259:3: ruleExp
            {
             before(grammarAccess.getLetAccess().getLetExpExpParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getLetAccess().getLetExpExpParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Let__LetExpAssignment_3"


    // $ANTLR start "rule__Let__InExpAssignment_5"
    // InternalMath.g:1268:1: rule__Let__InExpAssignment_5 : ( ruleExp ) ;
    public final void rule__Let__InExpAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1272:1: ( ( ruleExp ) )
            // InternalMath.g:1273:2: ( ruleExp )
            {
            // InternalMath.g:1273:2: ( ruleExp )
            // InternalMath.g:1274:3: ruleExp
            {
             before(grammarAccess.getLetAccess().getInExpExpParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getLetAccess().getInExpExpParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Let__InExpAssignment_5"


    // $ANTLR start "rule__Number__ValueAssignment"
    // InternalMath.g:1283:1: rule__Number__ValueAssignment : ( RULE_INT ) ;
    public final void rule__Number__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1287:1: ( ( RULE_INT ) )
            // InternalMath.g:1288:2: ( RULE_INT )
            {
            // InternalMath.g:1288:2: ( RULE_INT )
            // InternalMath.g:1289:3: RULE_INT
            {
             before(grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Number__ValueAssignment"


    // $ANTLR start "rule__Parenthesis__ExpAssignment_1"
    // InternalMath.g:1298:1: rule__Parenthesis__ExpAssignment_1 : ( ruleExp ) ;
    public final void rule__Parenthesis__ExpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1302:1: ( ( ruleExp ) )
            // InternalMath.g:1303:2: ( ruleExp )
            {
            // InternalMath.g:1303:2: ( ruleExp )
            // InternalMath.g:1304:3: ruleExp
            {
             before(grammarAccess.getParenthesisAccess().getExpExpParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getParenthesisAccess().getExpExpParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Parenthesis__ExpAssignment_1"


    // $ANTLR start "rule__VariableUse__RefAssignment"
    // InternalMath.g:1313:1: rule__VariableUse__RefAssignment : ( ( RULE_ID ) ) ;
    public final void rule__VariableUse__RefAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1317:1: ( ( ( RULE_ID ) ) )
            // InternalMath.g:1318:2: ( ( RULE_ID ) )
            {
            // InternalMath.g:1318:2: ( ( RULE_ID ) )
            // InternalMath.g:1319:3: ( RULE_ID )
            {
             before(grammarAccess.getVariableUseAccess().getRefStatementCrossReference_0()); 
            // InternalMath.g:1320:3: ( RULE_ID )
            // InternalMath.g:1321:4: RULE_ID
            {
             before(grammarAccess.getVariableUseAccess().getRefStatementIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableUseAccess().getRefStatementIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getVariableUseAccess().getRefStatementCrossReference_0()); 

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
    // $ANTLR end "rule__VariableUse__RefAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000120030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000120020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});

}
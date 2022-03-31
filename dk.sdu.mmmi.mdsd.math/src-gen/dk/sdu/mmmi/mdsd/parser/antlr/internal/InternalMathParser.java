package dk.sdu.mmmi.mdsd.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import dk.sdu.mmmi.mdsd.services.MathGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMathParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'var'", "'='", "'+'", "'-'", "'*'", "'/'", "'let'", "'in'", "'end'", "'('", "')'"
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

        public InternalMathParser(TokenStream input, MathGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "MathExp";
       	}

       	@Override
       	protected MathGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleMathExp"
    // InternalMath.g:64:1: entryRuleMathExp returns [EObject current=null] : iv_ruleMathExp= ruleMathExp EOF ;
    public final EObject entryRuleMathExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMathExp = null;


        try {
            // InternalMath.g:64:48: (iv_ruleMathExp= ruleMathExp EOF )
            // InternalMath.g:65:2: iv_ruleMathExp= ruleMathExp EOF
            {
             newCompositeNode(grammarAccess.getMathExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMathExp=ruleMathExp();

            state._fsp--;

             current =iv_ruleMathExp; 
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
    // $ANTLR end "entryRuleMathExp"


    // $ANTLR start "ruleMathExp"
    // InternalMath.g:71:1: ruleMathExp returns [EObject current=null] : ( (lv_math_0_0= ruleStatement ) )* ;
    public final EObject ruleMathExp() throws RecognitionException {
        EObject current = null;

        EObject lv_math_0_0 = null;



        	enterRule();

        try {
            // InternalMath.g:77:2: ( ( (lv_math_0_0= ruleStatement ) )* )
            // InternalMath.g:78:2: ( (lv_math_0_0= ruleStatement ) )*
            {
            // InternalMath.g:78:2: ( (lv_math_0_0= ruleStatement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMath.g:79:3: (lv_math_0_0= ruleStatement )
            	    {
            	    // InternalMath.g:79:3: (lv_math_0_0= ruleStatement )
            	    // InternalMath.g:80:4: lv_math_0_0= ruleStatement
            	    {

            	    				newCompositeNode(grammarAccess.getMathExpAccess().getMathStatementParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_math_0_0=ruleStatement();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getMathExpRule());
            	    				}
            	    				add(
            	    					current,
            	    					"math",
            	    					lv_math_0_0,
            	    					"dk.sdu.mmmi.mdsd.Math.Statement");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleMathExp"


    // $ANTLR start "entryRuleStatement"
    // InternalMath.g:100:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalMath.g:100:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalMath.g:101:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalMath.g:107:1: ruleStatement returns [EObject current=null] : (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_exp_3_0= ruleExp ) ) ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_exp_3_0 = null;



        	enterRule();

        try {
            // InternalMath.g:113:2: ( (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_exp_3_0= ruleExp ) ) ) )
            // InternalMath.g:114:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_exp_3_0= ruleExp ) ) )
            {
            // InternalMath.g:114:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_exp_3_0= ruleExp ) ) )
            // InternalMath.g:115:3: otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_exp_3_0= ruleExp ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getStatementAccess().getVarKeyword_0());
            		
            // InternalMath.g:119:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMath.g:120:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMath.g:120:4: (lv_name_1_0= RULE_ID )
            // InternalMath.g:121:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getStatementAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getStatementAccess().getEqualsSignKeyword_2());
            		
            // InternalMath.g:141:3: ( (lv_exp_3_0= ruleExp ) )
            // InternalMath.g:142:4: (lv_exp_3_0= ruleExp )
            {
            // InternalMath.g:142:4: (lv_exp_3_0= ruleExp )
            // InternalMath.g:143:5: lv_exp_3_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getStatementAccess().getExpExpParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_exp_3_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStatementRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_3_0,
            						"dk.sdu.mmmi.mdsd.Math.Exp");
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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleExp"
    // InternalMath.g:164:1: entryRuleExp returns [EObject current=null] : iv_ruleExp= ruleExp EOF ;
    public final EObject entryRuleExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExp = null;


        try {
            // InternalMath.g:164:44: (iv_ruleExp= ruleExp EOF )
            // InternalMath.g:165:2: iv_ruleExp= ruleExp EOF
            {
             newCompositeNode(grammarAccess.getExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExp=ruleExp();

            state._fsp--;

             current =iv_ruleExp; 
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
    // $ANTLR end "entryRuleExp"


    // $ANTLR start "ruleExp"
    // InternalMath.g:171:1: ruleExp returns [EObject current=null] : (this_PlusMinus_0= rulePlusMinus | this_VariableUse_1= ruleVariableUse ) ;
    public final EObject ruleExp() throws RecognitionException {
        EObject current = null;

        EObject this_PlusMinus_0 = null;

        EObject this_VariableUse_1 = null;



        	enterRule();

        try {
            // InternalMath.g:177:2: ( (this_PlusMinus_0= rulePlusMinus | this_VariableUse_1= ruleVariableUse ) )
            // InternalMath.g:178:2: (this_PlusMinus_0= rulePlusMinus | this_VariableUse_1= ruleVariableUse )
            {
            // InternalMath.g:178:2: (this_PlusMinus_0= rulePlusMinus | this_VariableUse_1= ruleVariableUse )
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
                    // InternalMath.g:179:3: this_PlusMinus_0= rulePlusMinus
                    {

                    			newCompositeNode(grammarAccess.getExpAccess().getPlusMinusParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PlusMinus_0=rulePlusMinus();

                    state._fsp--;


                    			current = this_PlusMinus_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMath.g:188:3: this_VariableUse_1= ruleVariableUse
                    {

                    			newCompositeNode(grammarAccess.getExpAccess().getVariableUseParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableUse_1=ruleVariableUse();

                    state._fsp--;


                    			current = this_VariableUse_1;
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
    // $ANTLR end "ruleExp"


    // $ANTLR start "entryRulePlusMinus"
    // InternalMath.g:200:1: entryRulePlusMinus returns [EObject current=null] : iv_rulePlusMinus= rulePlusMinus EOF ;
    public final EObject entryRulePlusMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusMinus = null;


        try {
            // InternalMath.g:200:50: (iv_rulePlusMinus= rulePlusMinus EOF )
            // InternalMath.g:201:2: iv_rulePlusMinus= rulePlusMinus EOF
            {
             newCompositeNode(grammarAccess.getPlusMinusRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlusMinus=rulePlusMinus();

            state._fsp--;

             current =iv_rulePlusMinus; 
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
    // $ANTLR end "entryRulePlusMinus"


    // $ANTLR start "rulePlusMinus"
    // InternalMath.g:207:1: rulePlusMinus returns [EObject current=null] : (this_Term_0= ruleTerm ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleTerm ) ) )* ) ;
    public final EObject rulePlusMinus() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Term_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalMath.g:213:2: ( (this_Term_0= ruleTerm ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleTerm ) ) )* ) )
            // InternalMath.g:214:2: (this_Term_0= ruleTerm ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleTerm ) ) )* )
            {
            // InternalMath.g:214:2: (this_Term_0= ruleTerm ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleTerm ) ) )* )
            // InternalMath.g:215:3: this_Term_0= ruleTerm ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleTerm ) ) )*
            {

            			newCompositeNode(grammarAccess.getPlusMinusAccess().getTermParserRuleCall_0());
            		
            pushFollow(FOLLOW_7);
            this_Term_0=ruleTerm();

            state._fsp--;


            			current = this_Term_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMath.g:223:3: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleTerm ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=13 && LA4_0<=14)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMath.g:224:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleTerm ) )
            	    {
            	    // InternalMath.g:224:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0==13) ) {
            	        alt3=1;
            	    }
            	    else if ( (LA3_0==14) ) {
            	        alt3=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 3, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // InternalMath.g:225:5: ( () otherlv_2= '+' )
            	            {
            	            // InternalMath.g:225:5: ( () otherlv_2= '+' )
            	            // InternalMath.g:226:6: () otherlv_2= '+'
            	            {
            	            // InternalMath.g:226:6: ()
            	            // InternalMath.g:227:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getPlusMinusAccess().getPlusLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,13,FOLLOW_8); 

            	            						newLeafNode(otherlv_2, grammarAccess.getPlusMinusAccess().getPlusSignKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMath.g:239:5: ( () otherlv_4= '-' )
            	            {
            	            // InternalMath.g:239:5: ( () otherlv_4= '-' )
            	            // InternalMath.g:240:6: () otherlv_4= '-'
            	            {
            	            // InternalMath.g:240:6: ()
            	            // InternalMath.g:241:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getPlusMinusAccess().getMinusLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,14,FOLLOW_8); 

            	            						newLeafNode(otherlv_4, grammarAccess.getPlusMinusAccess().getHyphenMinusKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalMath.g:253:4: ( (lv_right_5_0= ruleTerm ) )
            	    // InternalMath.g:254:5: (lv_right_5_0= ruleTerm )
            	    {
            	    // InternalMath.g:254:5: (lv_right_5_0= ruleTerm )
            	    // InternalMath.g:255:6: lv_right_5_0= ruleTerm
            	    {

            	    						newCompositeNode(grammarAccess.getPlusMinusAccess().getRightTermParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_right_5_0=ruleTerm();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPlusMinusRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"dk.sdu.mmmi.mdsd.Math.Term");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // $ANTLR end "rulePlusMinus"


    // $ANTLR start "entryRuleTerm"
    // InternalMath.g:277:1: entryRuleTerm returns [EObject current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final EObject entryRuleTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerm = null;


        try {
            // InternalMath.g:277:45: (iv_ruleTerm= ruleTerm EOF )
            // InternalMath.g:278:2: iv_ruleTerm= ruleTerm EOF
            {
             newCompositeNode(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTerm=ruleTerm();

            state._fsp--;

             current =iv_ruleTerm; 
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
    // $ANTLR end "entryRuleTerm"


    // $ANTLR start "ruleTerm"
    // InternalMath.g:284:1: ruleTerm returns [EObject current=null] : (this_Primary_0= rulePrimary ( ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject ruleTerm() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMath.g:290:2: ( (this_Primary_0= rulePrimary ( ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // InternalMath.g:291:2: (this_Primary_0= rulePrimary ( ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // InternalMath.g:291:2: (this_Primary_0= rulePrimary ( ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            // InternalMath.g:292:3: this_Primary_0= rulePrimary ( ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getTermAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_9);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMath.g:300:3: ( ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=15 && LA6_0<=16)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMath.g:301:4: ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ) ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // InternalMath.g:301:4: ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) )
            	    // InternalMath.g:302:5: () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) )
            	    {
            	    // InternalMath.g:302:5: ()
            	    // InternalMath.g:303:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getTermAccess().getTermLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    // InternalMath.g:309:5: ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) )
            	    // InternalMath.g:310:6: ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) )
            	    {
            	    // InternalMath.g:310:6: ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) )
            	    // InternalMath.g:311:7: (lv_op_2_1= '*' | lv_op_2_2= '/' )
            	    {
            	    // InternalMath.g:311:7: (lv_op_2_1= '*' | lv_op_2_2= '/' )
            	    int alt5=2;
            	    int LA5_0 = input.LA(1);

            	    if ( (LA5_0==15) ) {
            	        alt5=1;
            	    }
            	    else if ( (LA5_0==16) ) {
            	        alt5=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 5, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // InternalMath.g:312:8: lv_op_2_1= '*'
            	            {
            	            lv_op_2_1=(Token)match(input,15,FOLLOW_8); 

            	            								newLeafNode(lv_op_2_1, grammarAccess.getTermAccess().getOpAsteriskKeyword_1_0_1_0_0());
            	            							

            	            								if (current==null) {
            	            									current = createModelElement(grammarAccess.getTermRule());
            	            								}
            	            								setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            							

            	            }
            	            break;
            	        case 2 :
            	            // InternalMath.g:323:8: lv_op_2_2= '/'
            	            {
            	            lv_op_2_2=(Token)match(input,16,FOLLOW_8); 

            	            								newLeafNode(lv_op_2_2, grammarAccess.getTermAccess().getOpSolidusKeyword_1_0_1_0_1());
            	            							

            	            								if (current==null) {
            	            									current = createModelElement(grammarAccess.getTermRule());
            	            								}
            	            								setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            							

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }

            	    // InternalMath.g:337:4: ( (lv_right_3_0= rulePrimary ) )
            	    // InternalMath.g:338:5: (lv_right_3_0= rulePrimary )
            	    {
            	    // InternalMath.g:338:5: (lv_right_3_0= rulePrimary )
            	    // InternalMath.g:339:6: lv_right_3_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getTermAccess().getRightPrimaryParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_right_3_0=rulePrimary();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTermRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"dk.sdu.mmmi.mdsd.Math.Primary");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // $ANTLR end "ruleTerm"


    // $ANTLR start "entryRulePrimary"
    // InternalMath.g:361:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalMath.g:361:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalMath.g:362:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalMath.g:368:1: rulePrimary returns [EObject current=null] : (this_Number_0= ruleNumber | this_Parenthesis_1= ruleParenthesis | this_Let_2= ruleLet ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        EObject this_Number_0 = null;

        EObject this_Parenthesis_1 = null;

        EObject this_Let_2 = null;



        	enterRule();

        try {
            // InternalMath.g:374:2: ( (this_Number_0= ruleNumber | this_Parenthesis_1= ruleParenthesis | this_Let_2= ruleLet ) )
            // InternalMath.g:375:2: (this_Number_0= ruleNumber | this_Parenthesis_1= ruleParenthesis | this_Let_2= ruleLet )
            {
            // InternalMath.g:375:2: (this_Number_0= ruleNumber | this_Parenthesis_1= ruleParenthesis | this_Let_2= ruleLet )
            int alt7=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt7=1;
                }
                break;
            case 20:
                {
                alt7=2;
                }
                break;
            case 17:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalMath.g:376:3: this_Number_0= ruleNumber
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getNumberParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Number_0=ruleNumber();

                    state._fsp--;


                    			current = this_Number_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMath.g:385:3: this_Parenthesis_1= ruleParenthesis
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getParenthesisParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Parenthesis_1=ruleParenthesis();

                    state._fsp--;


                    			current = this_Parenthesis_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMath.g:394:3: this_Let_2= ruleLet
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getLetParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Let_2=ruleLet();

                    state._fsp--;


                    			current = this_Let_2;
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
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleLet"
    // InternalMath.g:406:1: entryRuleLet returns [EObject current=null] : iv_ruleLet= ruleLet EOF ;
    public final EObject entryRuleLet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLet = null;


        try {
            // InternalMath.g:406:44: (iv_ruleLet= ruleLet EOF )
            // InternalMath.g:407:2: iv_ruleLet= ruleLet EOF
            {
             newCompositeNode(grammarAccess.getLetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLet=ruleLet();

            state._fsp--;

             current =iv_ruleLet; 
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
    // $ANTLR end "entryRuleLet"


    // $ANTLR start "ruleLet"
    // InternalMath.g:413:1: ruleLet returns [EObject current=null] : (otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_letExp_3_0= ruleExp ) ) otherlv_4= 'in' ( (lv_inExp_5_0= ruleExp ) ) otherlv_6= 'end' ) ;
    public final EObject ruleLet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_letExp_3_0 = null;

        EObject lv_inExp_5_0 = null;



        	enterRule();

        try {
            // InternalMath.g:419:2: ( (otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_letExp_3_0= ruleExp ) ) otherlv_4= 'in' ( (lv_inExp_5_0= ruleExp ) ) otherlv_6= 'end' ) )
            // InternalMath.g:420:2: (otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_letExp_3_0= ruleExp ) ) otherlv_4= 'in' ( (lv_inExp_5_0= ruleExp ) ) otherlv_6= 'end' )
            {
            // InternalMath.g:420:2: (otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_letExp_3_0= ruleExp ) ) otherlv_4= 'in' ( (lv_inExp_5_0= ruleExp ) ) otherlv_6= 'end' )
            // InternalMath.g:421:3: otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_letExp_3_0= ruleExp ) ) otherlv_4= 'in' ( (lv_inExp_5_0= ruleExp ) ) otherlv_6= 'end'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLetAccess().getLetKeyword_0());
            		
            // InternalMath.g:425:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMath.g:426:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMath.g:426:4: (lv_name_1_0= RULE_ID )
            // InternalMath.g:427:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLetAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLetRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getLetAccess().getEqualsSignKeyword_2());
            		
            // InternalMath.g:447:3: ( (lv_letExp_3_0= ruleExp ) )
            // InternalMath.g:448:4: (lv_letExp_3_0= ruleExp )
            {
            // InternalMath.g:448:4: (lv_letExp_3_0= ruleExp )
            // InternalMath.g:449:5: lv_letExp_3_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getLetAccess().getLetExpExpParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_10);
            lv_letExp_3_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLetRule());
            					}
            					set(
            						current,
            						"letExp",
            						lv_letExp_3_0,
            						"dk.sdu.mmmi.mdsd.Math.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getLetAccess().getInKeyword_4());
            		
            // InternalMath.g:470:3: ( (lv_inExp_5_0= ruleExp ) )
            // InternalMath.g:471:4: (lv_inExp_5_0= ruleExp )
            {
            // InternalMath.g:471:4: (lv_inExp_5_0= ruleExp )
            // InternalMath.g:472:5: lv_inExp_5_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getLetAccess().getInExpExpParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_11);
            lv_inExp_5_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLetRule());
            					}
            					set(
            						current,
            						"inExp",
            						lv_inExp_5_0,
            						"dk.sdu.mmmi.mdsd.Math.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getLetAccess().getEndKeyword_6());
            		

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
    // $ANTLR end "ruleLet"


    // $ANTLR start "entryRuleNumber"
    // InternalMath.g:497:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // InternalMath.g:497:47: (iv_ruleNumber= ruleNumber EOF )
            // InternalMath.g:498:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber; 
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
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // InternalMath.g:504:1: ruleNumber returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalMath.g:510:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalMath.g:511:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalMath.g:511:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalMath.g:512:3: (lv_value_0_0= RULE_INT )
            {
            // InternalMath.g:512:3: (lv_value_0_0= RULE_INT )
            // InternalMath.g:513:4: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getNumberRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

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
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleParenthesis"
    // InternalMath.g:532:1: entryRuleParenthesis returns [EObject current=null] : iv_ruleParenthesis= ruleParenthesis EOF ;
    public final EObject entryRuleParenthesis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesis = null;


        try {
            // InternalMath.g:532:52: (iv_ruleParenthesis= ruleParenthesis EOF )
            // InternalMath.g:533:2: iv_ruleParenthesis= ruleParenthesis EOF
            {
             newCompositeNode(grammarAccess.getParenthesisRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParenthesis=ruleParenthesis();

            state._fsp--;

             current =iv_ruleParenthesis; 
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
    // $ANTLR end "entryRuleParenthesis"


    // $ANTLR start "ruleParenthesis"
    // InternalMath.g:539:1: ruleParenthesis returns [EObject current=null] : (otherlv_0= '(' ( (lv_exp_1_0= ruleExp ) ) otherlv_2= ')' ) ;
    public final EObject ruleParenthesis() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_exp_1_0 = null;



        	enterRule();

        try {
            // InternalMath.g:545:2: ( (otherlv_0= '(' ( (lv_exp_1_0= ruleExp ) ) otherlv_2= ')' ) )
            // InternalMath.g:546:2: (otherlv_0= '(' ( (lv_exp_1_0= ruleExp ) ) otherlv_2= ')' )
            {
            // InternalMath.g:546:2: (otherlv_0= '(' ( (lv_exp_1_0= ruleExp ) ) otherlv_2= ')' )
            // InternalMath.g:547:3: otherlv_0= '(' ( (lv_exp_1_0= ruleExp ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_0());
            		
            // InternalMath.g:551:3: ( (lv_exp_1_0= ruleExp ) )
            // InternalMath.g:552:4: (lv_exp_1_0= ruleExp )
            {
            // InternalMath.g:552:4: (lv_exp_1_0= ruleExp )
            // InternalMath.g:553:5: lv_exp_1_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getParenthesisAccess().getExpExpParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
            lv_exp_1_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParenthesisRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_1_0,
            						"dk.sdu.mmmi.mdsd.Math.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getParenthesisAccess().getRightParenthesisKeyword_2());
            		

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
    // $ANTLR end "ruleParenthesis"


    // $ANTLR start "entryRuleVariableUse"
    // InternalMath.g:578:1: entryRuleVariableUse returns [EObject current=null] : iv_ruleVariableUse= ruleVariableUse EOF ;
    public final EObject entryRuleVariableUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableUse = null;


        try {
            // InternalMath.g:578:52: (iv_ruleVariableUse= ruleVariableUse EOF )
            // InternalMath.g:579:2: iv_ruleVariableUse= ruleVariableUse EOF
            {
             newCompositeNode(grammarAccess.getVariableUseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableUse=ruleVariableUse();

            state._fsp--;

             current =iv_ruleVariableUse; 
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
    // $ANTLR end "entryRuleVariableUse"


    // $ANTLR start "ruleVariableUse"
    // InternalMath.g:585:1: ruleVariableUse returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleVariableUse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalMath.g:591:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalMath.g:592:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalMath.g:592:2: ( (otherlv_0= RULE_ID ) )
            // InternalMath.g:593:3: (otherlv_0= RULE_ID )
            {
            // InternalMath.g:593:3: (otherlv_0= RULE_ID )
            // InternalMath.g:594:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getVariableUseRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getVariableUseAccess().getRefStatementCrossReference_0());
            			

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
    // $ANTLR end "ruleVariableUse"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000120030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000120020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});

}
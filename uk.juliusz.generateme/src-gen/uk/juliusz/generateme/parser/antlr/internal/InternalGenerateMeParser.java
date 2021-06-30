package uk.juliusz.generateme.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import uk.juliusz.generateme.services.GenerateMeGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGenerateMeParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'BusinessName'", "'Sender'", "'Author'", "'Introduction'", "'ContentPage'", "'{'", "'PageHeader'", "'}'", "'ContactUsPage'", "'GalleryPage'", "'Photo'", "'PhotoDescription'", "'PhotoFileName'"
    };
    public static final int RULE_STRING=4;
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalGenerateMeParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGenerateMeParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGenerateMeParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGenerateMe.g"; }



     	private GenerateMeGrammarAccess grammarAccess;

        public InternalGenerateMeParser(TokenStream input, GenerateMeGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "GenerateMeProgram";
       	}

       	@Override
       	protected GenerateMeGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleGenerateMeProgram"
    // InternalGenerateMe.g:64:1: entryRuleGenerateMeProgram returns [EObject current=null] : iv_ruleGenerateMeProgram= ruleGenerateMeProgram EOF ;
    public final EObject entryRuleGenerateMeProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenerateMeProgram = null;


        try {
            // InternalGenerateMe.g:64:58: (iv_ruleGenerateMeProgram= ruleGenerateMeProgram EOF )
            // InternalGenerateMe.g:65:2: iv_ruleGenerateMeProgram= ruleGenerateMeProgram EOF
            {
             newCompositeNode(grammarAccess.getGenerateMeProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGenerateMeProgram=ruleGenerateMeProgram();

            state._fsp--;

             current =iv_ruleGenerateMeProgram; 
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
    // $ANTLR end "entryRuleGenerateMeProgram"


    // $ANTLR start "ruleGenerateMeProgram"
    // InternalGenerateMe.g:71:1: ruleGenerateMeProgram returns [EObject current=null] : (otherlv_0= 'BusinessName' ( (lv_businessName_1_0= RULE_STRING ) ) ( (lv_config_2_0= ruleConfig ) ) ( (lv_homePage_3_0= ruleHomePage ) ) ( (lv_pages_4_0= rulePages ) )* ) ;
    public final EObject ruleGenerateMeProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_businessName_1_0=null;
        EObject lv_config_2_0 = null;

        EObject lv_homePage_3_0 = null;

        EObject lv_pages_4_0 = null;



        	enterRule();

        try {
            // InternalGenerateMe.g:77:2: ( (otherlv_0= 'BusinessName' ( (lv_businessName_1_0= RULE_STRING ) ) ( (lv_config_2_0= ruleConfig ) ) ( (lv_homePage_3_0= ruleHomePage ) ) ( (lv_pages_4_0= rulePages ) )* ) )
            // InternalGenerateMe.g:78:2: (otherlv_0= 'BusinessName' ( (lv_businessName_1_0= RULE_STRING ) ) ( (lv_config_2_0= ruleConfig ) ) ( (lv_homePage_3_0= ruleHomePage ) ) ( (lv_pages_4_0= rulePages ) )* )
            {
            // InternalGenerateMe.g:78:2: (otherlv_0= 'BusinessName' ( (lv_businessName_1_0= RULE_STRING ) ) ( (lv_config_2_0= ruleConfig ) ) ( (lv_homePage_3_0= ruleHomePage ) ) ( (lv_pages_4_0= rulePages ) )* )
            // InternalGenerateMe.g:79:3: otherlv_0= 'BusinessName' ( (lv_businessName_1_0= RULE_STRING ) ) ( (lv_config_2_0= ruleConfig ) ) ( (lv_homePage_3_0= ruleHomePage ) ) ( (lv_pages_4_0= rulePages ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGenerateMeProgramAccess().getBusinessNameKeyword_0());
            		
            // InternalGenerateMe.g:83:3: ( (lv_businessName_1_0= RULE_STRING ) )
            // InternalGenerateMe.g:84:4: (lv_businessName_1_0= RULE_STRING )
            {
            // InternalGenerateMe.g:84:4: (lv_businessName_1_0= RULE_STRING )
            // InternalGenerateMe.g:85:5: lv_businessName_1_0= RULE_STRING
            {
            lv_businessName_1_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_businessName_1_0, grammarAccess.getGenerateMeProgramAccess().getBusinessNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGenerateMeProgramRule());
            					}
            					setWithLastConsumed(
            						current,
            						"businessName",
            						lv_businessName_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalGenerateMe.g:101:3: ( (lv_config_2_0= ruleConfig ) )
            // InternalGenerateMe.g:102:4: (lv_config_2_0= ruleConfig )
            {
            // InternalGenerateMe.g:102:4: (lv_config_2_0= ruleConfig )
            // InternalGenerateMe.g:103:5: lv_config_2_0= ruleConfig
            {

            					newCompositeNode(grammarAccess.getGenerateMeProgramAccess().getConfigConfigParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_config_2_0=ruleConfig();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGenerateMeProgramRule());
            					}
            					set(
            						current,
            						"config",
            						lv_config_2_0,
            						"uk.juliusz.generateme.GenerateMe.Config");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGenerateMe.g:120:3: ( (lv_homePage_3_0= ruleHomePage ) )
            // InternalGenerateMe.g:121:4: (lv_homePage_3_0= ruleHomePage )
            {
            // InternalGenerateMe.g:121:4: (lv_homePage_3_0= ruleHomePage )
            // InternalGenerateMe.g:122:5: lv_homePage_3_0= ruleHomePage
            {

            					newCompositeNode(grammarAccess.getGenerateMeProgramAccess().getHomePageHomePageParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_homePage_3_0=ruleHomePage();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGenerateMeProgramRule());
            					}
            					set(
            						current,
            						"homePage",
            						lv_homePage_3_0,
            						"uk.juliusz.generateme.GenerateMe.HomePage");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGenerateMe.g:139:3: ( (lv_pages_4_0= rulePages ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15||(LA1_0>=19 && LA1_0<=20)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGenerateMe.g:140:4: (lv_pages_4_0= rulePages )
            	    {
            	    // InternalGenerateMe.g:140:4: (lv_pages_4_0= rulePages )
            	    // InternalGenerateMe.g:141:5: lv_pages_4_0= rulePages
            	    {

            	    					newCompositeNode(grammarAccess.getGenerateMeProgramAccess().getPagesPagesParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_pages_4_0=rulePages();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGenerateMeProgramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"pages",
            	    						lv_pages_4_0,
            	    						"uk.juliusz.generateme.GenerateMe.Pages");
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
    // $ANTLR end "ruleGenerateMeProgram"


    // $ANTLR start "entryRuleConfig"
    // InternalGenerateMe.g:162:1: entryRuleConfig returns [EObject current=null] : iv_ruleConfig= ruleConfig EOF ;
    public final EObject entryRuleConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfig = null;


        try {
            // InternalGenerateMe.g:162:47: (iv_ruleConfig= ruleConfig EOF )
            // InternalGenerateMe.g:163:2: iv_ruleConfig= ruleConfig EOF
            {
             newCompositeNode(grammarAccess.getConfigRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConfig=ruleConfig();

            state._fsp--;

             current =iv_ruleConfig; 
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
    // $ANTLR end "entryRuleConfig"


    // $ANTLR start "ruleConfig"
    // InternalGenerateMe.g:169:1: ruleConfig returns [EObject current=null] : (otherlv_0= 'Sender' ( (lv_sender_1_0= RULE_STRING ) ) otherlv_2= 'Author' ( (lv_author_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleConfig() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_sender_1_0=null;
        Token otherlv_2=null;
        Token lv_author_3_0=null;


        	enterRule();

        try {
            // InternalGenerateMe.g:175:2: ( (otherlv_0= 'Sender' ( (lv_sender_1_0= RULE_STRING ) ) otherlv_2= 'Author' ( (lv_author_3_0= RULE_STRING ) ) ) )
            // InternalGenerateMe.g:176:2: (otherlv_0= 'Sender' ( (lv_sender_1_0= RULE_STRING ) ) otherlv_2= 'Author' ( (lv_author_3_0= RULE_STRING ) ) )
            {
            // InternalGenerateMe.g:176:2: (otherlv_0= 'Sender' ( (lv_sender_1_0= RULE_STRING ) ) otherlv_2= 'Author' ( (lv_author_3_0= RULE_STRING ) ) )
            // InternalGenerateMe.g:177:3: otherlv_0= 'Sender' ( (lv_sender_1_0= RULE_STRING ) ) otherlv_2= 'Author' ( (lv_author_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getConfigAccess().getSenderKeyword_0());
            		
            // InternalGenerateMe.g:181:3: ( (lv_sender_1_0= RULE_STRING ) )
            // InternalGenerateMe.g:182:4: (lv_sender_1_0= RULE_STRING )
            {
            // InternalGenerateMe.g:182:4: (lv_sender_1_0= RULE_STRING )
            // InternalGenerateMe.g:183:5: lv_sender_1_0= RULE_STRING
            {
            lv_sender_1_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_sender_1_0, grammarAccess.getConfigAccess().getSenderSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConfigRule());
            					}
            					setWithLastConsumed(
            						current,
            						"sender",
            						lv_sender_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getConfigAccess().getAuthorKeyword_2());
            		
            // InternalGenerateMe.g:203:3: ( (lv_author_3_0= RULE_STRING ) )
            // InternalGenerateMe.g:204:4: (lv_author_3_0= RULE_STRING )
            {
            // InternalGenerateMe.g:204:4: (lv_author_3_0= RULE_STRING )
            // InternalGenerateMe.g:205:5: lv_author_3_0= RULE_STRING
            {
            lv_author_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_author_3_0, grammarAccess.getConfigAccess().getAuthorSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConfigRule());
            					}
            					setWithLastConsumed(
            						current,
            						"author",
            						lv_author_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleConfig"


    // $ANTLR start "entryRuleHomePage"
    // InternalGenerateMe.g:225:1: entryRuleHomePage returns [EObject current=null] : iv_ruleHomePage= ruleHomePage EOF ;
    public final EObject entryRuleHomePage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHomePage = null;


        try {
            // InternalGenerateMe.g:225:49: (iv_ruleHomePage= ruleHomePage EOF )
            // InternalGenerateMe.g:226:2: iv_ruleHomePage= ruleHomePage EOF
            {
             newCompositeNode(grammarAccess.getHomePageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHomePage=ruleHomePage();

            state._fsp--;

             current =iv_ruleHomePage; 
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
    // $ANTLR end "entryRuleHomePage"


    // $ANTLR start "ruleHomePage"
    // InternalGenerateMe.g:232:1: ruleHomePage returns [EObject current=null] : (otherlv_0= 'Introduction' ( (lv_Introduction_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleHomePage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_Introduction_1_0=null;


        	enterRule();

        try {
            // InternalGenerateMe.g:238:2: ( (otherlv_0= 'Introduction' ( (lv_Introduction_1_0= RULE_STRING ) ) ) )
            // InternalGenerateMe.g:239:2: (otherlv_0= 'Introduction' ( (lv_Introduction_1_0= RULE_STRING ) ) )
            {
            // InternalGenerateMe.g:239:2: (otherlv_0= 'Introduction' ( (lv_Introduction_1_0= RULE_STRING ) ) )
            // InternalGenerateMe.g:240:3: otherlv_0= 'Introduction' ( (lv_Introduction_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getHomePageAccess().getIntroductionKeyword_0());
            		
            // InternalGenerateMe.g:244:3: ( (lv_Introduction_1_0= RULE_STRING ) )
            // InternalGenerateMe.g:245:4: (lv_Introduction_1_0= RULE_STRING )
            {
            // InternalGenerateMe.g:245:4: (lv_Introduction_1_0= RULE_STRING )
            // InternalGenerateMe.g:246:5: lv_Introduction_1_0= RULE_STRING
            {
            lv_Introduction_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_Introduction_1_0, grammarAccess.getHomePageAccess().getIntroductionSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHomePageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"Introduction",
            						lv_Introduction_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleHomePage"


    // $ANTLR start "entryRulePages"
    // InternalGenerateMe.g:266:1: entryRulePages returns [EObject current=null] : iv_rulePages= rulePages EOF ;
    public final EObject entryRulePages() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePages = null;


        try {
            // InternalGenerateMe.g:266:46: (iv_rulePages= rulePages EOF )
            // InternalGenerateMe.g:267:2: iv_rulePages= rulePages EOF
            {
             newCompositeNode(grammarAccess.getPagesRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePages=rulePages();

            state._fsp--;

             current =iv_rulePages; 
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
    // $ANTLR end "entryRulePages"


    // $ANTLR start "rulePages"
    // InternalGenerateMe.g:273:1: rulePages returns [EObject current=null] : (this_ContentPage_0= ruleContentPage | this_GalleryPage_1= ruleGalleryPage | this_ContactUsPage_2= ruleContactUsPage ) ;
    public final EObject rulePages() throws RecognitionException {
        EObject current = null;

        EObject this_ContentPage_0 = null;

        EObject this_GalleryPage_1 = null;

        EObject this_ContactUsPage_2 = null;



        	enterRule();

        try {
            // InternalGenerateMe.g:279:2: ( (this_ContentPage_0= ruleContentPage | this_GalleryPage_1= ruleGalleryPage | this_ContactUsPage_2= ruleContactUsPage ) )
            // InternalGenerateMe.g:280:2: (this_ContentPage_0= ruleContentPage | this_GalleryPage_1= ruleGalleryPage | this_ContactUsPage_2= ruleContactUsPage )
            {
            // InternalGenerateMe.g:280:2: (this_ContentPage_0= ruleContentPage | this_GalleryPage_1= ruleGalleryPage | this_ContactUsPage_2= ruleContactUsPage )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt2=1;
                }
                break;
            case 20:
                {
                alt2=2;
                }
                break;
            case 19:
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
                    // InternalGenerateMe.g:281:3: this_ContentPage_0= ruleContentPage
                    {

                    			newCompositeNode(grammarAccess.getPagesAccess().getContentPageParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ContentPage_0=ruleContentPage();

                    state._fsp--;


                    			current = this_ContentPage_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGenerateMe.g:290:3: this_GalleryPage_1= ruleGalleryPage
                    {

                    			newCompositeNode(grammarAccess.getPagesAccess().getGalleryPageParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_GalleryPage_1=ruleGalleryPage();

                    state._fsp--;


                    			current = this_GalleryPage_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalGenerateMe.g:299:3: this_ContactUsPage_2= ruleContactUsPage
                    {

                    			newCompositeNode(grammarAccess.getPagesAccess().getContactUsPageParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ContactUsPage_2=ruleContactUsPage();

                    state._fsp--;


                    			current = this_ContactUsPage_2;
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
    // $ANTLR end "rulePages"


    // $ANTLR start "entryRuleContentPage"
    // InternalGenerateMe.g:311:1: entryRuleContentPage returns [EObject current=null] : iv_ruleContentPage= ruleContentPage EOF ;
    public final EObject entryRuleContentPage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContentPage = null;


        try {
            // InternalGenerateMe.g:311:52: (iv_ruleContentPage= ruleContentPage EOF )
            // InternalGenerateMe.g:312:2: iv_ruleContentPage= ruleContentPage EOF
            {
             newCompositeNode(grammarAccess.getContentPageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContentPage=ruleContentPage();

            state._fsp--;

             current =iv_ruleContentPage; 
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
    // $ANTLR end "entryRuleContentPage"


    // $ANTLR start "ruleContentPage"
    // InternalGenerateMe.g:318:1: ruleContentPage returns [EObject current=null] : (otherlv_0= 'ContentPage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'PageHeader' ( (lv_content_4_0= RULE_STRING ) ) otherlv_5= '}' ) ;
    public final EObject ruleContentPage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_content_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalGenerateMe.g:324:2: ( (otherlv_0= 'ContentPage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'PageHeader' ( (lv_content_4_0= RULE_STRING ) ) otherlv_5= '}' ) )
            // InternalGenerateMe.g:325:2: (otherlv_0= 'ContentPage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'PageHeader' ( (lv_content_4_0= RULE_STRING ) ) otherlv_5= '}' )
            {
            // InternalGenerateMe.g:325:2: (otherlv_0= 'ContentPage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'PageHeader' ( (lv_content_4_0= RULE_STRING ) ) otherlv_5= '}' )
            // InternalGenerateMe.g:326:3: otherlv_0= 'ContentPage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'PageHeader' ( (lv_content_4_0= RULE_STRING ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getContentPageAccess().getContentPageKeyword_0());
            		
            // InternalGenerateMe.g:330:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGenerateMe.g:331:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGenerateMe.g:331:4: (lv_name_1_0= RULE_ID )
            // InternalGenerateMe.g:332:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getContentPageAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContentPageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getContentPageAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getContentPageAccess().getPageHeaderKeyword_3());
            		
            // InternalGenerateMe.g:356:3: ( (lv_content_4_0= RULE_STRING ) )
            // InternalGenerateMe.g:357:4: (lv_content_4_0= RULE_STRING )
            {
            // InternalGenerateMe.g:357:4: (lv_content_4_0= RULE_STRING )
            // InternalGenerateMe.g:358:5: lv_content_4_0= RULE_STRING
            {
            lv_content_4_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_content_4_0, grammarAccess.getContentPageAccess().getContentSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContentPageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"content",
            						lv_content_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getContentPageAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleContentPage"


    // $ANTLR start "entryRuleContactUsPage"
    // InternalGenerateMe.g:382:1: entryRuleContactUsPage returns [EObject current=null] : iv_ruleContactUsPage= ruleContactUsPage EOF ;
    public final EObject entryRuleContactUsPage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContactUsPage = null;


        try {
            // InternalGenerateMe.g:382:54: (iv_ruleContactUsPage= ruleContactUsPage EOF )
            // InternalGenerateMe.g:383:2: iv_ruleContactUsPage= ruleContactUsPage EOF
            {
             newCompositeNode(grammarAccess.getContactUsPageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContactUsPage=ruleContactUsPage();

            state._fsp--;

             current =iv_ruleContactUsPage; 
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
    // $ANTLR end "entryRuleContactUsPage"


    // $ANTLR start "ruleContactUsPage"
    // InternalGenerateMe.g:389:1: ruleContactUsPage returns [EObject current=null] : (otherlv_0= 'ContactUsPage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'PageHeader' ( (lv_content_4_0= RULE_STRING ) ) otherlv_5= '}' ) ;
    public final EObject ruleContactUsPage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_content_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalGenerateMe.g:395:2: ( (otherlv_0= 'ContactUsPage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'PageHeader' ( (lv_content_4_0= RULE_STRING ) ) otherlv_5= '}' ) )
            // InternalGenerateMe.g:396:2: (otherlv_0= 'ContactUsPage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'PageHeader' ( (lv_content_4_0= RULE_STRING ) ) otherlv_5= '}' )
            {
            // InternalGenerateMe.g:396:2: (otherlv_0= 'ContactUsPage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'PageHeader' ( (lv_content_4_0= RULE_STRING ) ) otherlv_5= '}' )
            // InternalGenerateMe.g:397:3: otherlv_0= 'ContactUsPage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'PageHeader' ( (lv_content_4_0= RULE_STRING ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getContactUsPageAccess().getContactUsPageKeyword_0());
            		
            // InternalGenerateMe.g:401:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGenerateMe.g:402:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGenerateMe.g:402:4: (lv_name_1_0= RULE_ID )
            // InternalGenerateMe.g:403:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getContactUsPageAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContactUsPageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getContactUsPageAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getContactUsPageAccess().getPageHeaderKeyword_3());
            		
            // InternalGenerateMe.g:427:3: ( (lv_content_4_0= RULE_STRING ) )
            // InternalGenerateMe.g:428:4: (lv_content_4_0= RULE_STRING )
            {
            // InternalGenerateMe.g:428:4: (lv_content_4_0= RULE_STRING )
            // InternalGenerateMe.g:429:5: lv_content_4_0= RULE_STRING
            {
            lv_content_4_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_content_4_0, grammarAccess.getContactUsPageAccess().getContentSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContactUsPageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"content",
            						lv_content_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getContactUsPageAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleContactUsPage"


    // $ANTLR start "entryRuleGalleryPage"
    // InternalGenerateMe.g:453:1: entryRuleGalleryPage returns [EObject current=null] : iv_ruleGalleryPage= ruleGalleryPage EOF ;
    public final EObject entryRuleGalleryPage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGalleryPage = null;


        try {
            // InternalGenerateMe.g:453:52: (iv_ruleGalleryPage= ruleGalleryPage EOF )
            // InternalGenerateMe.g:454:2: iv_ruleGalleryPage= ruleGalleryPage EOF
            {
             newCompositeNode(grammarAccess.getGalleryPageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGalleryPage=ruleGalleryPage();

            state._fsp--;

             current =iv_ruleGalleryPage; 
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
    // $ANTLR end "entryRuleGalleryPage"


    // $ANTLR start "ruleGalleryPage"
    // InternalGenerateMe.g:460:1: ruleGalleryPage returns [EObject current=null] : (otherlv_0= 'GalleryPage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_photos_3_0= rulePhoto ) ) otherlv_4= '}' ) ;
    public final EObject ruleGalleryPage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_photos_3_0 = null;



        	enterRule();

        try {
            // InternalGenerateMe.g:466:2: ( (otherlv_0= 'GalleryPage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_photos_3_0= rulePhoto ) ) otherlv_4= '}' ) )
            // InternalGenerateMe.g:467:2: (otherlv_0= 'GalleryPage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_photos_3_0= rulePhoto ) ) otherlv_4= '}' )
            {
            // InternalGenerateMe.g:467:2: (otherlv_0= 'GalleryPage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_photos_3_0= rulePhoto ) ) otherlv_4= '}' )
            // InternalGenerateMe.g:468:3: otherlv_0= 'GalleryPage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_photos_3_0= rulePhoto ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getGalleryPageAccess().getGalleryPageKeyword_0());
            		
            // InternalGenerateMe.g:472:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGenerateMe.g:473:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGenerateMe.g:473:4: (lv_name_1_0= RULE_ID )
            // InternalGenerateMe.g:474:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getGalleryPageAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGalleryPageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getGalleryPageAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGenerateMe.g:494:3: ( (lv_photos_3_0= rulePhoto ) )
            // InternalGenerateMe.g:495:4: (lv_photos_3_0= rulePhoto )
            {
            // InternalGenerateMe.g:495:4: (lv_photos_3_0= rulePhoto )
            // InternalGenerateMe.g:496:5: lv_photos_3_0= rulePhoto
            {

            					newCompositeNode(grammarAccess.getGalleryPageAccess().getPhotosPhotoParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_11);
            lv_photos_3_0=rulePhoto();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGalleryPageRule());
            					}
            					add(
            						current,
            						"photos",
            						lv_photos_3_0,
            						"uk.juliusz.generateme.GenerateMe.Photo");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getGalleryPageAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleGalleryPage"


    // $ANTLR start "entryRulePhoto"
    // InternalGenerateMe.g:521:1: entryRulePhoto returns [EObject current=null] : iv_rulePhoto= rulePhoto EOF ;
    public final EObject entryRulePhoto() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePhoto = null;


        try {
            // InternalGenerateMe.g:521:46: (iv_rulePhoto= rulePhoto EOF )
            // InternalGenerateMe.g:522:2: iv_rulePhoto= rulePhoto EOF
            {
             newCompositeNode(grammarAccess.getPhotoRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePhoto=rulePhoto();

            state._fsp--;

             current =iv_rulePhoto; 
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
    // $ANTLR end "entryRulePhoto"


    // $ANTLR start "rulePhoto"
    // InternalGenerateMe.g:528:1: rulePhoto returns [EObject current=null] : (otherlv_0= 'Photo' ( (lv_photoTitle_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'PhotoDescription' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'PhotoFileName' ( (lv_fileName_6_0= RULE_STRING ) ) otherlv_7= '}' ) ;
    public final EObject rulePhoto() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_photoTitle_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;
        Token lv_fileName_6_0=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalGenerateMe.g:534:2: ( (otherlv_0= 'Photo' ( (lv_photoTitle_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'PhotoDescription' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'PhotoFileName' ( (lv_fileName_6_0= RULE_STRING ) ) otherlv_7= '}' ) )
            // InternalGenerateMe.g:535:2: (otherlv_0= 'Photo' ( (lv_photoTitle_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'PhotoDescription' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'PhotoFileName' ( (lv_fileName_6_0= RULE_STRING ) ) otherlv_7= '}' )
            {
            // InternalGenerateMe.g:535:2: (otherlv_0= 'Photo' ( (lv_photoTitle_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'PhotoDescription' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'PhotoFileName' ( (lv_fileName_6_0= RULE_STRING ) ) otherlv_7= '}' )
            // InternalGenerateMe.g:536:3: otherlv_0= 'Photo' ( (lv_photoTitle_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'PhotoDescription' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'PhotoFileName' ( (lv_fileName_6_0= RULE_STRING ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPhotoAccess().getPhotoKeyword_0());
            		
            // InternalGenerateMe.g:540:3: ( (lv_photoTitle_1_0= RULE_STRING ) )
            // InternalGenerateMe.g:541:4: (lv_photoTitle_1_0= RULE_STRING )
            {
            // InternalGenerateMe.g:541:4: (lv_photoTitle_1_0= RULE_STRING )
            // InternalGenerateMe.g:542:5: lv_photoTitle_1_0= RULE_STRING
            {
            lv_photoTitle_1_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            					newLeafNode(lv_photoTitle_1_0, grammarAccess.getPhotoAccess().getPhotoTitleSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPhotoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"photoTitle",
            						lv_photoTitle_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getPhotoAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getPhotoAccess().getPhotoDescriptionKeyword_3());
            		
            // InternalGenerateMe.g:566:3: ( (lv_description_4_0= RULE_STRING ) )
            // InternalGenerateMe.g:567:4: (lv_description_4_0= RULE_STRING )
            {
            // InternalGenerateMe.g:567:4: (lv_description_4_0= RULE_STRING )
            // InternalGenerateMe.g:568:5: lv_description_4_0= RULE_STRING
            {
            lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

            					newLeafNode(lv_description_4_0, grammarAccess.getPhotoAccess().getDescriptionSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPhotoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getPhotoAccess().getPhotoFileNameKeyword_5());
            		
            // InternalGenerateMe.g:588:3: ( (lv_fileName_6_0= RULE_STRING ) )
            // InternalGenerateMe.g:589:4: (lv_fileName_6_0= RULE_STRING )
            {
            // InternalGenerateMe.g:589:4: (lv_fileName_6_0= RULE_STRING )
            // InternalGenerateMe.g:590:5: lv_fileName_6_0= RULE_STRING
            {
            lv_fileName_6_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_fileName_6_0, grammarAccess.getPhotoAccess().getFileNameSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPhotoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"fileName",
            						lv_fileName_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_7=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getPhotoAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "rulePhoto"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000188002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});

}
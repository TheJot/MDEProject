/*
 * generated by Xtext 2.20.0
 */
package uk.juliusz.generateme.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class GenerateMeGrammarAccess extends AbstractGrammarElementFinder {
	
	public class GenerateMeProgramElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.juliusz.generateme.GenerateMe.GenerateMeProgram");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cConfigAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cConfigConfigParserRuleCall_0_0 = (RuleCall)cConfigAssignment_0.eContents().get(0);
		private final Assignment cHomePageAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cHomePageHomePageParserRuleCall_1_0 = (RuleCall)cHomePageAssignment_1.eContents().get(0);
		private final Assignment cPagesAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cPagesPagesParserRuleCall_2_0 = (RuleCall)cPagesAssignment_2.eContents().get(0);
		
		//GenerateMeProgram:
		//	config=Config
		//	homePage=HomePage
		//	pages+=Pages*;
		@Override public ParserRule getRule() { return rule; }
		
		//config=Config homePage=HomePage pages+=Pages*
		public Group getGroup() { return cGroup; }
		
		//config=Config
		public Assignment getConfigAssignment_0() { return cConfigAssignment_0; }
		
		//Config
		public RuleCall getConfigConfigParserRuleCall_0_0() { return cConfigConfigParserRuleCall_0_0; }
		
		//homePage=HomePage
		public Assignment getHomePageAssignment_1() { return cHomePageAssignment_1; }
		
		//HomePage
		public RuleCall getHomePageHomePageParserRuleCall_1_0() { return cHomePageHomePageParserRuleCall_1_0; }
		
		//pages+=Pages*
		public Assignment getPagesAssignment_2() { return cPagesAssignment_2; }
		
		//Pages
		public RuleCall getPagesPagesParserRuleCall_2_0() { return cPagesPagesParserRuleCall_2_0; }
	}
	public class ConfigElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.juliusz.generateme.GenerateMe.Config");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cBusinessNameKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cBusinessNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cBusinessNameSTRINGTerminalRuleCall_1_0 = (RuleCall)cBusinessNameAssignment_1.eContents().get(0);
		private final Keyword cSenderKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cSenderAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSenderSTRINGTerminalRuleCall_3_0 = (RuleCall)cSenderAssignment_3.eContents().get(0);
		private final Keyword cAuthorKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cAuthorAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cAuthorSTRINGTerminalRuleCall_5_0 = (RuleCall)cAuthorAssignment_5.eContents().get(0);
		
		//Config:
		//	'BusinessName' businessName=STRING
		//	'Sender' sender=STRING
		//	'Author' author=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//'BusinessName' businessName=STRING 'Sender' sender=STRING 'Author' author=STRING
		public Group getGroup() { return cGroup; }
		
		//'BusinessName'
		public Keyword getBusinessNameKeyword_0() { return cBusinessNameKeyword_0; }
		
		//businessName=STRING
		public Assignment getBusinessNameAssignment_1() { return cBusinessNameAssignment_1; }
		
		//STRING
		public RuleCall getBusinessNameSTRINGTerminalRuleCall_1_0() { return cBusinessNameSTRINGTerminalRuleCall_1_0; }
		
		//'Sender'
		public Keyword getSenderKeyword_2() { return cSenderKeyword_2; }
		
		//sender=STRING
		public Assignment getSenderAssignment_3() { return cSenderAssignment_3; }
		
		//STRING
		public RuleCall getSenderSTRINGTerminalRuleCall_3_0() { return cSenderSTRINGTerminalRuleCall_3_0; }
		
		//'Author'
		public Keyword getAuthorKeyword_4() { return cAuthorKeyword_4; }
		
		//author=STRING
		public Assignment getAuthorAssignment_5() { return cAuthorAssignment_5; }
		
		//STRING
		public RuleCall getAuthorSTRINGTerminalRuleCall_5_0() { return cAuthorSTRINGTerminalRuleCall_5_0; }
	}
	public class HomePageElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.juliusz.generateme.GenerateMe.HomePage");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cHomePageKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cPageHeaderKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cContentAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cContentSTRINGTerminalRuleCall_2_0 = (RuleCall)cContentAssignment_2.eContents().get(0);
		private final Keyword cIntroductionKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cIntroductionAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cIntroductionSTRINGTerminalRuleCall_4_0 = (RuleCall)cIntroductionAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//HomePage:
		//	'HomePage{'
		//	'PageHeader' content=STRING
		//	'Introduction' Introduction=STRING
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'HomePage{' 'PageHeader' content=STRING 'Introduction' Introduction=STRING '}'
		public Group getGroup() { return cGroup; }
		
		//'HomePage{'
		public Keyword getHomePageKeyword_0() { return cHomePageKeyword_0; }
		
		//'PageHeader'
		public Keyword getPageHeaderKeyword_1() { return cPageHeaderKeyword_1; }
		
		//content=STRING
		public Assignment getContentAssignment_2() { return cContentAssignment_2; }
		
		//STRING
		public RuleCall getContentSTRINGTerminalRuleCall_2_0() { return cContentSTRINGTerminalRuleCall_2_0; }
		
		//'Introduction'
		public Keyword getIntroductionKeyword_3() { return cIntroductionKeyword_3; }
		
		//Introduction=STRING
		public Assignment getIntroductionAssignment_4() { return cIntroductionAssignment_4; }
		
		//STRING
		public RuleCall getIntroductionSTRINGTerminalRuleCall_4_0() { return cIntroductionSTRINGTerminalRuleCall_4_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class PagesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.juliusz.generateme.GenerateMe.Pages");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cContentPageParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cGalleryPageParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cContactPageParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//Pages:
		//	ContentPage | GalleryPage | ContactPage;
		@Override public ParserRule getRule() { return rule; }
		
		//ContentPage | GalleryPage | ContactPage
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//ContentPage
		public RuleCall getContentPageParserRuleCall_0() { return cContentPageParserRuleCall_0; }
		
		//GalleryPage
		public RuleCall getGalleryPageParserRuleCall_1() { return cGalleryPageParserRuleCall_1; }
		
		//ContactPage
		public RuleCall getContactPageParserRuleCall_2() { return cContactPageParserRuleCall_2; }
	}
	public class ContentPageElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.juliusz.generateme.GenerateMe.ContentPage");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cContentPageKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cPageHeaderKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cHeaderAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cHeaderSTRINGTerminalRuleCall_4_0 = (RuleCall)cHeaderAssignment_4.eContents().get(0);
		private final Assignment cSectionAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cSectionSectionParserRuleCall_5_0 = (RuleCall)cSectionAssignment_5.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//ContentPage:
		//	'ContentPage' name=ID '{'
		//	'PageHeader' header=STRING
		//	section+=Section*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'ContentPage' name=ID '{' 'PageHeader' header=STRING section+=Section* '}'
		public Group getGroup() { return cGroup; }
		
		//'ContentPage'
		public Keyword getContentPageKeyword_0() { return cContentPageKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//'PageHeader'
		public Keyword getPageHeaderKeyword_3() { return cPageHeaderKeyword_3; }
		
		//header=STRING
		public Assignment getHeaderAssignment_4() { return cHeaderAssignment_4; }
		
		//STRING
		public RuleCall getHeaderSTRINGTerminalRuleCall_4_0() { return cHeaderSTRINGTerminalRuleCall_4_0; }
		
		//section+=Section*
		public Assignment getSectionAssignment_5() { return cSectionAssignment_5; }
		
		//Section
		public RuleCall getSectionSectionParserRuleCall_5_0() { return cSectionSectionParserRuleCall_5_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}
	public class SectionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.juliusz.generateme.GenerateMe.Section");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSectionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cTitleKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cTitleAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cTitleSTRINGTerminalRuleCall_4_0 = (RuleCall)cTitleAssignment_4.eContents().get(0);
		private final Keyword cContentKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cContentAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cContentSTRINGTerminalRuleCall_6_0 = (RuleCall)cContentAssignment_6.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//Section:
		//	'Section' name=ID '{'
		//	'Title' title=STRING
		//	'Content' content=STRING
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'Section' name=ID '{' 'Title' title=STRING 'Content' content=STRING '}'
		public Group getGroup() { return cGroup; }
		
		//'Section'
		public Keyword getSectionKeyword_0() { return cSectionKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//'Title'
		public Keyword getTitleKeyword_3() { return cTitleKeyword_3; }
		
		//title=STRING
		public Assignment getTitleAssignment_4() { return cTitleAssignment_4; }
		
		//STRING
		public RuleCall getTitleSTRINGTerminalRuleCall_4_0() { return cTitleSTRINGTerminalRuleCall_4_0; }
		
		//'Content'
		public Keyword getContentKeyword_5() { return cContentKeyword_5; }
		
		//content=STRING
		public Assignment getContentAssignment_6() { return cContentAssignment_6; }
		
		//STRING
		public RuleCall getContentSTRINGTerminalRuleCall_6_0() { return cContentSTRINGTerminalRuleCall_6_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
	}
	public class ContactPageElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.juliusz.generateme.GenerateMe.ContactPage");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cContactPageKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cPageHeaderKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cHeaderAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cHeaderSTRINGTerminalRuleCall_4_0 = (RuleCall)cHeaderAssignment_4.eContents().get(0);
		private final Keyword cSendFromKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cFromAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cFromSTRINGTerminalRuleCall_6_0 = (RuleCall)cFromAssignment_6.eContents().get(0);
		private final Keyword cSendToKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cToAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cToSTRINGTerminalRuleCall_8_0 = (RuleCall)cToAssignment_8.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_9 = (Keyword)cGroup.eContents().get(9);
		
		//ContactPage:
		//	'ContactPage' name=ID '{'
		//	'PageHeader' header=STRING
		//	'SendFrom' from=STRING
		//	'SendTo' to=STRING
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'ContactPage' name=ID '{' 'PageHeader' header=STRING 'SendFrom' from=STRING 'SendTo' to=STRING '}'
		public Group getGroup() { return cGroup; }
		
		//'ContactPage'
		public Keyword getContactPageKeyword_0() { return cContactPageKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//'PageHeader'
		public Keyword getPageHeaderKeyword_3() { return cPageHeaderKeyword_3; }
		
		//header=STRING
		public Assignment getHeaderAssignment_4() { return cHeaderAssignment_4; }
		
		//STRING
		public RuleCall getHeaderSTRINGTerminalRuleCall_4_0() { return cHeaderSTRINGTerminalRuleCall_4_0; }
		
		//'SendFrom'
		public Keyword getSendFromKeyword_5() { return cSendFromKeyword_5; }
		
		//from=STRING
		public Assignment getFromAssignment_6() { return cFromAssignment_6; }
		
		//STRING
		public RuleCall getFromSTRINGTerminalRuleCall_6_0() { return cFromSTRINGTerminalRuleCall_6_0; }
		
		//'SendTo'
		public Keyword getSendToKeyword_7() { return cSendToKeyword_7; }
		
		//to=STRING
		public Assignment getToAssignment_8() { return cToAssignment_8; }
		
		//STRING
		public RuleCall getToSTRINGTerminalRuleCall_8_0() { return cToSTRINGTerminalRuleCall_8_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_9() { return cRightCurlyBracketKeyword_9; }
	}
	public class GalleryPageElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.juliusz.generateme.GenerateMe.GalleryPage");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGalleryPageKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cPhotosAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cPhotosPhotoParserRuleCall_3_0 = (RuleCall)cPhotosAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//GalleryPage:
		//	'GalleryPage' name=ID '{'
		//	photos+=Photo*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'GalleryPage' name=ID '{' photos+=Photo* '}'
		public Group getGroup() { return cGroup; }
		
		//'GalleryPage'
		public Keyword getGalleryPageKeyword_0() { return cGalleryPageKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//photos+=Photo*
		public Assignment getPhotosAssignment_3() { return cPhotosAssignment_3; }
		
		//Photo
		public RuleCall getPhotosPhotoParserRuleCall_3_0() { return cPhotosPhotoParserRuleCall_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class PhotoElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.juliusz.generateme.GenerateMe.Photo");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPhotoKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cPhotoDescriptionKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cDescriptionAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cDescriptionSTRINGTerminalRuleCall_4_0 = (RuleCall)cDescriptionAssignment_4.eContents().get(0);
		private final Keyword cPhotoFileNameKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cFileNameAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cFileNameSTRINGTerminalRuleCall_6_0 = (RuleCall)cFileNameAssignment_6.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//Photo:
		//	'Photo' name=ID '{'
		//	'PhotoDescription' description=STRING
		//	'PhotoFileName' fileName=STRING
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'Photo' name=ID '{' 'PhotoDescription' description=STRING 'PhotoFileName' fileName=STRING '}'
		public Group getGroup() { return cGroup; }
		
		//'Photo'
		public Keyword getPhotoKeyword_0() { return cPhotoKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//'PhotoDescription'
		public Keyword getPhotoDescriptionKeyword_3() { return cPhotoDescriptionKeyword_3; }
		
		//description=STRING
		public Assignment getDescriptionAssignment_4() { return cDescriptionAssignment_4; }
		
		//STRING
		public RuleCall getDescriptionSTRINGTerminalRuleCall_4_0() { return cDescriptionSTRINGTerminalRuleCall_4_0; }
		
		//'PhotoFileName'
		public Keyword getPhotoFileNameKeyword_5() { return cPhotoFileNameKeyword_5; }
		
		//fileName=STRING
		public Assignment getFileNameAssignment_6() { return cFileNameAssignment_6; }
		
		//STRING
		public RuleCall getFileNameSTRINGTerminalRuleCall_6_0() { return cFileNameSTRINGTerminalRuleCall_6_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
	}
	
	
	private final GenerateMeProgramElements pGenerateMeProgram;
	private final ConfigElements pConfig;
	private final HomePageElements pHomePage;
	private final PagesElements pPages;
	private final ContentPageElements pContentPage;
	private final SectionElements pSection;
	private final ContactPageElements pContactPage;
	private final GalleryPageElements pGalleryPage;
	private final PhotoElements pPhoto;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public GenerateMeGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pGenerateMeProgram = new GenerateMeProgramElements();
		this.pConfig = new ConfigElements();
		this.pHomePage = new HomePageElements();
		this.pPages = new PagesElements();
		this.pContentPage = new ContentPageElements();
		this.pSection = new SectionElements();
		this.pContactPage = new ContactPageElements();
		this.pGalleryPage = new GalleryPageElements();
		this.pPhoto = new PhotoElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("uk.juliusz.generateme.GenerateMe".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//GenerateMeProgram:
	//	config=Config
	//	homePage=HomePage
	//	pages+=Pages*;
	public GenerateMeProgramElements getGenerateMeProgramAccess() {
		return pGenerateMeProgram;
	}
	
	public ParserRule getGenerateMeProgramRule() {
		return getGenerateMeProgramAccess().getRule();
	}
	
	//Config:
	//	'BusinessName' businessName=STRING
	//	'Sender' sender=STRING
	//	'Author' author=STRING;
	public ConfigElements getConfigAccess() {
		return pConfig;
	}
	
	public ParserRule getConfigRule() {
		return getConfigAccess().getRule();
	}
	
	//HomePage:
	//	'HomePage{'
	//	'PageHeader' content=STRING
	//	'Introduction' Introduction=STRING
	//	'}';
	public HomePageElements getHomePageAccess() {
		return pHomePage;
	}
	
	public ParserRule getHomePageRule() {
		return getHomePageAccess().getRule();
	}
	
	//Pages:
	//	ContentPage | GalleryPage | ContactPage;
	public PagesElements getPagesAccess() {
		return pPages;
	}
	
	public ParserRule getPagesRule() {
		return getPagesAccess().getRule();
	}
	
	//ContentPage:
	//	'ContentPage' name=ID '{'
	//	'PageHeader' header=STRING
	//	section+=Section*
	//	'}';
	public ContentPageElements getContentPageAccess() {
		return pContentPage;
	}
	
	public ParserRule getContentPageRule() {
		return getContentPageAccess().getRule();
	}
	
	//Section:
	//	'Section' name=ID '{'
	//	'Title' title=STRING
	//	'Content' content=STRING
	//	'}';
	public SectionElements getSectionAccess() {
		return pSection;
	}
	
	public ParserRule getSectionRule() {
		return getSectionAccess().getRule();
	}
	
	//ContactPage:
	//	'ContactPage' name=ID '{'
	//	'PageHeader' header=STRING
	//	'SendFrom' from=STRING
	//	'SendTo' to=STRING
	//	'}';
	public ContactPageElements getContactPageAccess() {
		return pContactPage;
	}
	
	public ParserRule getContactPageRule() {
		return getContactPageAccess().getRule();
	}
	
	//GalleryPage:
	//	'GalleryPage' name=ID '{'
	//	photos+=Photo*
	//	'}';
	public GalleryPageElements getGalleryPageAccess() {
		return pGalleryPage;
	}
	
	public ParserRule getGalleryPageRule() {
		return getGalleryPageAccess().getRule();
	}
	
	//Photo:
	//	'Photo' name=ID '{'
	//	'PhotoDescription' description=STRING
	//	'PhotoFileName' fileName=STRING
	//	'}';
	public PhotoElements getPhotoAccess() {
		return pPhoto;
	}
	
	public ParserRule getPhotoRule() {
		return getPhotoAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}

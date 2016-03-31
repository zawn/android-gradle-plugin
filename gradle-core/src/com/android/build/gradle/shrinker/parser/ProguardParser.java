// $ANTLR 3.5.2 Proguard.g 2016-03-28 17:44:37

package com.android.build.gradle.shrinker.parser;
import static org.objectweb.asm.Opcodes.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ProguardParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "LINE_COMMENT", "NAME", "NEGATOR", 
		"WS", "'%'", "'('", "')'", "','", "'-adaptclassstrings'", "'-adaptresourcefilecontents'", 
		"'-adaptresourcefilenames'", "'-allowaccessmodification'", "'-applymapping'", 
		"'-assumenosideeffects'", "'-basedirectory'", "'-classobfuscationdictionary'", 
		"'-dontnote'", "'-dontobfuscate'", "'-dontoptimize'", "'-dontpreverify'", 
		"'-dontshrink'", "'-dontskipnonpubliclibraryclasses'", "'-dontskipnonpubliclibraryclassmembers'", 
		"'-dontusemixedcaseclassnames'", "'-dontwarn'", "'-dump'", "'-flattenpackagehierarchy'", 
		"'-forceprocessing'", "'-ignorewarnings'", "'-include'", "'-injars'", 
		"'-keep'", "'-keepattributes'", "'-keepclasseswithmembernames'", "'-keepclasseswithmembers'", 
		"'-keepclassmembernames'", "'-keepclassmembers'", "'-keepdirectories'", 
		"'-keepnames'", "'-keeppackagenames'", "'-keepparameternames'", "'-libraryjars'", 
		"'-mergeinterfacesaggressively'", "'-microedition'", "'-obfuscationdictionary'", 
		"'-optimizationpasses'", "'-optimizations'", "'-outjars'", "'-overloadaggressively'", 
		"'-packageobfuscationdictionary'", "'-printconfiguration'", "'-printmapping'", 
		"'-printseeds'", "'-printusage'", "'-renamesourcefileattribute'", "'-repackageclasses'", 
		"'-skipnonpubliclibraryclasses'", "'-target'", "'-useuniqueclassmembernames'", 
		"'-verbose'", "'-whyareyoukeeping'", "':'", "';'", "'<fields>'", "'<init>'", 
		"'<methods>'", "'@'", "'[]'", "'\\''", "'abstract'", "'allowobfuscation'", 
		"'allowoptimization'", "'allowshrinking'", "'bridge'", "'class'", "'enum'", 
		"'extends'", "'final'", "'implements'", "'interface'", "'native'", "'private'", 
		"'protected'", "'public'", "'static'", "'strictfp'", "'synchronized'", 
		"'synthetic'", "'transient'", "'varargs'", "'volatile'", "'{'", "'}'"
	};
	public static final int EOF=-1;
	public static final int T__8=8;
	public static final int T__9=9;
	public static final int T__10=10;
	public static final int T__11=11;
	public static final int T__12=12;
	public static final int T__13=13;
	public static final int T__14=14;
	public static final int T__15=15;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int T__27=27;
	public static final int T__28=28;
	public static final int T__29=29;
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
	public static final int T__40=40;
	public static final int T__41=41;
	public static final int T__42=42;
	public static final int T__43=43;
	public static final int T__44=44;
	public static final int T__45=45;
	public static final int T__46=46;
	public static final int T__47=47;
	public static final int T__48=48;
	public static final int T__49=49;
	public static final int T__50=50;
	public static final int T__51=51;
	public static final int T__52=52;
	public static final int T__53=53;
	public static final int T__54=54;
	public static final int T__55=55;
	public static final int T__56=56;
	public static final int T__57=57;
	public static final int T__58=58;
	public static final int T__59=59;
	public static final int T__60=60;
	public static final int T__61=61;
	public static final int T__62=62;
	public static final int T__63=63;
	public static final int T__64=64;
	public static final int T__65=65;
	public static final int T__66=66;
	public static final int T__67=67;
	public static final int T__68=68;
	public static final int T__69=69;
	public static final int T__70=70;
	public static final int T__71=71;
	public static final int T__72=72;
	public static final int T__73=73;
	public static final int T__74=74;
	public static final int T__75=75;
	public static final int T__76=76;
	public static final int T__77=77;
	public static final int T__78=78;
	public static final int T__79=79;
	public static final int T__80=80;
	public static final int T__81=81;
	public static final int T__82=82;
	public static final int T__83=83;
	public static final int T__84=84;
	public static final int T__85=85;
	public static final int T__86=86;
	public static final int T__87=87;
	public static final int T__88=88;
	public static final int T__89=89;
	public static final int T__90=90;
	public static final int T__91=91;
	public static final int T__92=92;
	public static final int T__93=93;
	public static final int T__94=94;
	public static final int T__95=95;
	public static final int T__96=96;
	public static final int LINE_COMMENT=4;
	public static final int NAME=5;
	public static final int NEGATOR=6;
	public static final int WS=7;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public ProguardParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public ProguardParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return ProguardParser.tokenNames; }
	@Override public String getGrammarFileName() { return "Proguard.g"; }


	  @Override
	  public void emitErrorMessage(String msg) {
	    throw new RuntimeException(msg);
	  }



	// $ANTLR start "prog"
	// Proguard.g:34:1: prog[Flags flags, String baseDirectory] : ( ( '-basedirectory' baseDir= NAME ) | ( '-include' | '@' ) proguardFile= NAME | ( '-keepclassmembers' (keepModifier= keepOptionModifier )? classSpec= classSpecification ) | ( '-keepclasseswithmembers' (keepModifier= keepOptionModifier )? classSpec= classSpecification ) | ( '-keep' (keepModifier= keepOptionModifier )? classSpec= classSpecification ) | (igFlag= ignoredFlag ) | (nopFlag= noOpFlag ) | (unFlag= unsupportedFlag ) | ( '-dontwarn' filter[class_filter] ) | ( '-ignorewarnings' ) )* EOF ;
	public final void prog(Flags flags, String baseDirectory) throws RecognitionException {
		Token baseDir=null;
		Token proguardFile=null;
		KeepModifier keepModifier =null;
		ClassSpecification classSpec =null;
		ParserRuleReturnScope igFlag =null;
		ParserRuleReturnScope nopFlag =null;
		ParserRuleReturnScope unFlag =null;

		try {
			// Proguard.g:35:3: ( ( ( '-basedirectory' baseDir= NAME ) | ( '-include' | '@' ) proguardFile= NAME | ( '-keepclassmembers' (keepModifier= keepOptionModifier )? classSpec= classSpecification ) | ( '-keepclasseswithmembers' (keepModifier= keepOptionModifier )? classSpec= classSpecification ) | ( '-keep' (keepModifier= keepOptionModifier )? classSpec= classSpecification ) | (igFlag= ignoredFlag ) | (nopFlag= noOpFlag ) | (unFlag= unsupportedFlag ) | ( '-dontwarn' filter[class_filter] ) | ( '-ignorewarnings' ) )* EOF )
			// Proguard.g:36:3: ( ( '-basedirectory' baseDir= NAME ) | ( '-include' | '@' ) proguardFile= NAME | ( '-keepclassmembers' (keepModifier= keepOptionModifier )? classSpec= classSpecification ) | ( '-keepclasseswithmembers' (keepModifier= keepOptionModifier )? classSpec= classSpecification ) | ( '-keep' (keepModifier= keepOptionModifier )? classSpec= classSpecification ) | (igFlag= ignoredFlag ) | (nopFlag= noOpFlag ) | (unFlag= unsupportedFlag ) | ( '-dontwarn' filter[class_filter] ) | ( '-ignorewarnings' ) )* EOF
			{
			// Proguard.g:36:3: ( ( '-basedirectory' baseDir= NAME ) | ( '-include' | '@' ) proguardFile= NAME | ( '-keepclassmembers' (keepModifier= keepOptionModifier )? classSpec= classSpecification ) | ( '-keepclasseswithmembers' (keepModifier= keepOptionModifier )? classSpec= classSpecification ) | ( '-keep' (keepModifier= keepOptionModifier )? classSpec= classSpecification ) | (igFlag= ignoredFlag ) | (nopFlag= noOpFlag ) | (unFlag= unsupportedFlag ) | ( '-dontwarn' filter[class_filter] ) | ( '-ignorewarnings' ) )*
			loop4:
			while (true) {
				int alt4=11;
				switch ( input.LA(1) ) {
				case 18:
					{
					alt4=1;
					}
					break;
				case 33:
				case 70:
					{
					alt4=2;
					}
					break;
				case 40:
					{
					alt4=3;
					}
					break;
				case 38:
					{
					alt4=4;
					}
					break;
				case 35:
					{
					alt4=5;
					}
					break;
				case 12:
				case 13:
				case 14:
				case 15:
				case 16:
				case 17:
				case 19:
				case 30:
				case 46:
				case 48:
				case 49:
				case 50:
				case 52:
				case 53:
				case 58:
				case 59:
				case 62:
					{
					alt4=6;
					}
					break;
				case 20:
				case 21:
				case 22:
				case 23:
				case 24:
				case 25:
				case 26:
				case 27:
				case 36:
				case 37:
				case 39:
				case 42:
				case 43:
				case 44:
				case 60:
				case 63:
					{
					alt4=7;
					}
					break;
				case 29:
				case 31:
				case 34:
				case 41:
				case 45:
				case 47:
				case 51:
				case 54:
				case 55:
				case 56:
				case 57:
				case 61:
				case 64:
					{
					alt4=8;
					}
					break;
				case 28:
					{
					alt4=9;
					}
					break;
				case 32:
					{
					alt4=10;
					}
					break;
				}
				switch (alt4) {
				case 1 :
					// Proguard.g:37:5: ( '-basedirectory' baseDir= NAME )
					{
					// Proguard.g:37:5: ( '-basedirectory' baseDir= NAME )
					// Proguard.g:37:6: '-basedirectory' baseDir= NAME
					{
					match(input,18,FOLLOW_18_in_prog81); 
					baseDir=(Token)match(input,NAME,FOLLOW_NAME_in_prog85); 
					baseDirectory=(baseDir!=null?baseDir.getText():null);
					}

					}
					break;
				case 2 :
					// Proguard.g:38:7: ( '-include' | '@' ) proguardFile= NAME
					{
					if ( input.LA(1)==33||input.LA(1)==70 ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					proguardFile=(Token)match(input,NAME,FOLLOW_NAME_in_prog104); 
					GrammarActions.include((proguardFile!=null?proguardFile.getText():null), baseDirectory, flags);
					}
					break;
				case 3 :
					// Proguard.g:39:7: ( '-keepclassmembers' (keepModifier= keepOptionModifier )? classSpec= classSpecification )
					{
					// Proguard.g:39:7: ( '-keepclassmembers' (keepModifier= keepOptionModifier )? classSpec= classSpecification )
					// Proguard.g:39:8: '-keepclassmembers' (keepModifier= keepOptionModifier )? classSpec= classSpecification
					{
					match(input,40,FOLLOW_40_in_prog115); 
					// Proguard.g:39:40: (keepModifier= keepOptionModifier )?
					int alt1=2;
					int LA1_0 = input.LA(1);
					if ( (LA1_0==11) ) {
						alt1=1;
					}
					switch (alt1) {
						case 1 :
							// Proguard.g:39:40: keepModifier= keepOptionModifier
							{
							pushFollow(FOLLOW_keepOptionModifier_in_prog119);
							keepModifier=keepOptionModifier();
							state._fsp--;

							}
							break;

					}

					pushFollow(FOLLOW_classSpecification_in_prog124);
					classSpec=classSpecification();
					state._fsp--;

					GrammarActions.addKeepClassMembers(flags, classSpec, keepModifier);
					}

					}
					break;
				case 4 :
					// Proguard.g:40:7: ( '-keepclasseswithmembers' (keepModifier= keepOptionModifier )? classSpec= classSpecification )
					{
					// Proguard.g:40:7: ( '-keepclasseswithmembers' (keepModifier= keepOptionModifier )? classSpec= classSpecification )
					// Proguard.g:40:8: '-keepclasseswithmembers' (keepModifier= keepOptionModifier )? classSpec= classSpecification
					{
					match(input,38,FOLLOW_38_in_prog136); 
					// Proguard.g:40:46: (keepModifier= keepOptionModifier )?
					int alt2=2;
					int LA2_0 = input.LA(1);
					if ( (LA2_0==11) ) {
						alt2=1;
					}
					switch (alt2) {
						case 1 :
							// Proguard.g:40:46: keepModifier= keepOptionModifier
							{
							pushFollow(FOLLOW_keepOptionModifier_in_prog140);
							keepModifier=keepOptionModifier();
							state._fsp--;

							}
							break;

					}

					pushFollow(FOLLOW_classSpecification_in_prog145);
					classSpec=classSpecification();
					state._fsp--;

					GrammarActions.addKeepClassesWithMembers(flags, classSpec, keepModifier);
					}

					}
					break;
				case 5 :
					// Proguard.g:41:7: ( '-keep' (keepModifier= keepOptionModifier )? classSpec= classSpecification )
					{
					// Proguard.g:41:7: ( '-keep' (keepModifier= keepOptionModifier )? classSpec= classSpecification )
					// Proguard.g:41:8: '-keep' (keepModifier= keepOptionModifier )? classSpec= classSpecification
					{
					match(input,35,FOLLOW_35_in_prog157); 
					// Proguard.g:41:28: (keepModifier= keepOptionModifier )?
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0==11) ) {
						alt3=1;
					}
					switch (alt3) {
						case 1 :
							// Proguard.g:41:28: keepModifier= keepOptionModifier
							{
							pushFollow(FOLLOW_keepOptionModifier_in_prog161);
							keepModifier=keepOptionModifier();
							state._fsp--;

							}
							break;

					}

					pushFollow(FOLLOW_classSpecification_in_prog166);
					classSpec=classSpecification();
					state._fsp--;

					GrammarActions.addKeepClassSpecification(flags, classSpec, keepModifier);
					}

					}
					break;
				case 6 :
					// Proguard.g:42:7: (igFlag= ignoredFlag )
					{
					// Proguard.g:42:7: (igFlag= ignoredFlag )
					// Proguard.g:42:8: igFlag= ignoredFlag
					{
					pushFollow(FOLLOW_ignoredFlag_in_prog180);
					igFlag=ignoredFlag();
					state._fsp--;

					GrammarActions.ignoredFlag((igFlag!=null?input.toString(igFlag.start,igFlag.stop):null), true);
					}

					}
					break;
				case 7 :
					// Proguard.g:43:7: (nopFlag= noOpFlag )
					{
					// Proguard.g:43:7: (nopFlag= noOpFlag )
					// Proguard.g:43:8: nopFlag= noOpFlag
					{
					pushFollow(FOLLOW_noOpFlag_in_prog194);
					nopFlag=noOpFlag();
					state._fsp--;

					GrammarActions.ignoredFlag((nopFlag!=null?input.toString(nopFlag.start,nopFlag.stop):null), false);
					}

					}
					break;
				case 8 :
					// Proguard.g:44:7: (unFlag= unsupportedFlag )
					{
					// Proguard.g:44:7: (unFlag= unsupportedFlag )
					// Proguard.g:44:8: unFlag= unsupportedFlag
					{
					pushFollow(FOLLOW_unsupportedFlag_in_prog208);
					unFlag=unsupportedFlag();
					state._fsp--;

					GrammarActions.unsupportedFlag((unFlag!=null?input.toString(unFlag.start,unFlag.stop):null));
					}

					}
					break;
				case 9 :
					// Proguard.g:45:7: ( '-dontwarn' filter[class_filter] )
					{
					// Proguard.g:45:7: ( '-dontwarn' filter[class_filter] )
					// Proguard.g:45:8: '-dontwarn' filter[class_filter]
					{
					match(input,28,FOLLOW_28_in_prog220); 
					FilterSpecification class_filter = new FilterSpecification();
					pushFollow(FOLLOW_filter_in_prog224);
					filter(class_filter);
					state._fsp--;

					GrammarActions.dontWarn(flags, class_filter);
					}

					}
					break;
				case 10 :
					// Proguard.g:46:7: ( '-ignorewarnings' )
					{
					// Proguard.g:46:7: ( '-ignorewarnings' )
					// Proguard.g:46:8: '-ignorewarnings'
					{
					match(input,32,FOLLOW_32_in_prog237); 
					GrammarActions.ignoreWarnings(flags);
					}

					}
					break;

				default :
					break loop4;
				}
			}

			match(input,EOF,FOLLOW_EOF_in_prog249); 
			}

		}
		catch (RecognitionException e) {

			    throw e;
			  
		}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "prog"


	public static class noOpFlag_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "noOpFlag"
	// Proguard.g:54:9: private noOpFlag : ( '-verbose' | ( '-dontnote' filter[class_filter] ) | '-dontusemixedcaseclassnames' | '-dontskipnonpubliclibraryclasses' | '-dontskipnonpubliclibraryclassmembers' | '-skipnonpubliclibraryclasses' | '-keepparameternames' | ( '-keepnames' classSpec= classSpecification ) | ( '-keepclassmembernames' classSpec= classSpecification ) | ( '-keepclasseswithmembernames' classSpec= classSpecification ) | ( '-keepattributes' filter[attribute_filter] ) | ( '-keeppackagenames' filter[package_filter] ) | ( '-dontshrink' ) | ( '-dontoptimize' ) | ( '-dontpreverify' ) | ( '-dontobfuscate' ) ) ;
	public final ProguardParser.noOpFlag_return noOpFlag() throws RecognitionException {
		ProguardParser.noOpFlag_return retval = new ProguardParser.noOpFlag_return();
		retval.start = input.LT(1);

		ClassSpecification classSpec =null;

		try {
			// Proguard.g:55:3: ( ( '-verbose' | ( '-dontnote' filter[class_filter] ) | '-dontusemixedcaseclassnames' | '-dontskipnonpubliclibraryclasses' | '-dontskipnonpubliclibraryclassmembers' | '-skipnonpubliclibraryclasses' | '-keepparameternames' | ( '-keepnames' classSpec= classSpecification ) | ( '-keepclassmembernames' classSpec= classSpecification ) | ( '-keepclasseswithmembernames' classSpec= classSpecification ) | ( '-keepattributes' filter[attribute_filter] ) | ( '-keeppackagenames' filter[package_filter] ) | ( '-dontshrink' ) | ( '-dontoptimize' ) | ( '-dontpreverify' ) | ( '-dontobfuscate' ) ) )
			// Proguard.g:56:3: ( '-verbose' | ( '-dontnote' filter[class_filter] ) | '-dontusemixedcaseclassnames' | '-dontskipnonpubliclibraryclasses' | '-dontskipnonpubliclibraryclassmembers' | '-skipnonpubliclibraryclasses' | '-keepparameternames' | ( '-keepnames' classSpec= classSpecification ) | ( '-keepclassmembernames' classSpec= classSpecification ) | ( '-keepclasseswithmembernames' classSpec= classSpecification ) | ( '-keepattributes' filter[attribute_filter] ) | ( '-keeppackagenames' filter[package_filter] ) | ( '-dontshrink' ) | ( '-dontoptimize' ) | ( '-dontpreverify' ) | ( '-dontobfuscate' ) )
			{
			// Proguard.g:56:3: ( '-verbose' | ( '-dontnote' filter[class_filter] ) | '-dontusemixedcaseclassnames' | '-dontskipnonpubliclibraryclasses' | '-dontskipnonpubliclibraryclassmembers' | '-skipnonpubliclibraryclasses' | '-keepparameternames' | ( '-keepnames' classSpec= classSpecification ) | ( '-keepclassmembernames' classSpec= classSpecification ) | ( '-keepclasseswithmembernames' classSpec= classSpecification ) | ( '-keepattributes' filter[attribute_filter] ) | ( '-keeppackagenames' filter[package_filter] ) | ( '-dontshrink' ) | ( '-dontoptimize' ) | ( '-dontpreverify' ) | ( '-dontobfuscate' ) )
			int alt5=16;
			switch ( input.LA(1) ) {
			case 63:
				{
				alt5=1;
				}
				break;
			case 20:
				{
				alt5=2;
				}
				break;
			case 27:
				{
				alt5=3;
				}
				break;
			case 25:
				{
				alt5=4;
				}
				break;
			case 26:
				{
				alt5=5;
				}
				break;
			case 60:
				{
				alt5=6;
				}
				break;
			case 44:
				{
				alt5=7;
				}
				break;
			case 42:
				{
				alt5=8;
				}
				break;
			case 39:
				{
				alt5=9;
				}
				break;
			case 37:
				{
				alt5=10;
				}
				break;
			case 36:
				{
				alt5=11;
				}
				break;
			case 43:
				{
				alt5=12;
				}
				break;
			case 24:
				{
				alt5=13;
				}
				break;
			case 22:
				{
				alt5=14;
				}
				break;
			case 23:
				{
				alt5=15;
				}
				break;
			case 21:
				{
				alt5=16;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// Proguard.g:56:7: '-verbose'
					{
					match(input,63,FOLLOW_63_in_noOpFlag278); 
					}
					break;
				case 2 :
					// Proguard.g:57:7: ( '-dontnote' filter[class_filter] )
					{
					// Proguard.g:57:7: ( '-dontnote' filter[class_filter] )
					// Proguard.g:57:8: '-dontnote' filter[class_filter]
					{
					match(input,20,FOLLOW_20_in_noOpFlag287); 
					FilterSpecification class_filter = new FilterSpecification();
					pushFollow(FOLLOW_filter_in_noOpFlag291);
					filter(class_filter);
					state._fsp--;

					}

					}
					break;
				case 3 :
					// Proguard.g:59:7: '-dontusemixedcaseclassnames'
					{
					match(input,27,FOLLOW_27_in_noOpFlag306); 
					}
					break;
				case 4 :
					// Proguard.g:60:7: '-dontskipnonpubliclibraryclasses'
					{
					match(input,25,FOLLOW_25_in_noOpFlag314); 
					}
					break;
				case 5 :
					// Proguard.g:61:7: '-dontskipnonpubliclibraryclassmembers'
					{
					match(input,26,FOLLOW_26_in_noOpFlag322); 
					}
					break;
				case 6 :
					// Proguard.g:62:7: '-skipnonpubliclibraryclasses'
					{
					match(input,60,FOLLOW_60_in_noOpFlag330); 
					}
					break;
				case 7 :
					// Proguard.g:64:7: '-keepparameternames'
					{
					match(input,44,FOLLOW_44_in_noOpFlag343); 
					}
					break;
				case 8 :
					// Proguard.g:65:7: ( '-keepnames' classSpec= classSpecification )
					{
					// Proguard.g:65:7: ( '-keepnames' classSpec= classSpecification )
					// Proguard.g:65:8: '-keepnames' classSpec= classSpecification
					{
					match(input,42,FOLLOW_42_in_noOpFlag352); 
					pushFollow(FOLLOW_classSpecification_in_noOpFlag356);
					classSpec=classSpecification();
					state._fsp--;

					}

					}
					break;
				case 9 :
					// Proguard.g:66:7: ( '-keepclassmembernames' classSpec= classSpecification )
					{
					// Proguard.g:66:7: ( '-keepclassmembernames' classSpec= classSpecification )
					// Proguard.g:66:8: '-keepclassmembernames' classSpec= classSpecification
					{
					match(input,39,FOLLOW_39_in_noOpFlag367); 
					pushFollow(FOLLOW_classSpecification_in_noOpFlag371);
					classSpec=classSpecification();
					state._fsp--;

					}

					}
					break;
				case 10 :
					// Proguard.g:67:7: ( '-keepclasseswithmembernames' classSpec= classSpecification )
					{
					// Proguard.g:67:7: ( '-keepclasseswithmembernames' classSpec= classSpecification )
					// Proguard.g:67:8: '-keepclasseswithmembernames' classSpec= classSpecification
					{
					match(input,37,FOLLOW_37_in_noOpFlag383); 
					pushFollow(FOLLOW_classSpecification_in_noOpFlag387);
					classSpec=classSpecification();
					state._fsp--;

					}

					}
					break;
				case 11 :
					// Proguard.g:68:7: ( '-keepattributes' filter[attribute_filter] )
					{
					// Proguard.g:68:7: ( '-keepattributes' filter[attribute_filter] )
					// Proguard.g:68:8: '-keepattributes' filter[attribute_filter]
					{
					match(input,36,FOLLOW_36_in_noOpFlag399); 
					FilterSpecification attribute_filter = new FilterSpecification();
					pushFollow(FOLLOW_filter_in_noOpFlag403);
					filter(attribute_filter);
					state._fsp--;

					}

					}
					break;
				case 12 :
					// Proguard.g:69:7: ( '-keeppackagenames' filter[package_filter] )
					{
					// Proguard.g:69:7: ( '-keeppackagenames' filter[package_filter] )
					// Proguard.g:69:8: '-keeppackagenames' filter[package_filter]
					{
					match(input,43,FOLLOW_43_in_noOpFlag415); 
					FilterSpecification package_filter = new FilterSpecification();
					pushFollow(FOLLOW_filter_in_noOpFlag419);
					filter(package_filter);
					state._fsp--;

					}

					}
					break;
				case 13 :
					// Proguard.g:70:7: ( '-dontshrink' )
					{
					// Proguard.g:70:7: ( '-dontshrink' )
					// Proguard.g:70:8: '-dontshrink'
					{
					match(input,24,FOLLOW_24_in_noOpFlag431); 
					}

					}
					break;
				case 14 :
					// Proguard.g:71:7: ( '-dontoptimize' )
					{
					// Proguard.g:71:7: ( '-dontoptimize' )
					// Proguard.g:71:8: '-dontoptimize'
					{
					match(input,22,FOLLOW_22_in_noOpFlag442); 
					}

					}
					break;
				case 15 :
					// Proguard.g:72:7: ( '-dontpreverify' )
					{
					// Proguard.g:72:7: ( '-dontpreverify' )
					// Proguard.g:72:8: '-dontpreverify'
					{
					match(input,23,FOLLOW_23_in_noOpFlag454); 
					}

					}
					break;
				case 16 :
					// Proguard.g:73:7: ( '-dontobfuscate' )
					{
					// Proguard.g:73:7: ( '-dontobfuscate' )
					// Proguard.g:73:8: '-dontobfuscate'
					{
					match(input,21,FOLLOW_21_in_noOpFlag466); 
					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "noOpFlag"


	public static class ignoredFlag_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "ignoredFlag"
	// Proguard.g:77:9: private ignoredFlag : ( ( '-optimizations' filter[optimization_filter] ) | '-useuniqueclassmembernames' | '-allowaccessmodification' | ( '-optimizationpasses' NAME ) | ( '-assumenosideeffects' classSpecification ) | '-mergeinterfacesaggressively' | '-overloadaggressively' | ( '-renamesourcefileattribute' (sourceFile= NAME )? ) | ( '-adaptclassstrings' filter[filter] ) | ( '-applymapping' mapping= NAME ) | '-obfuscationdictionary' obfuscationDictionary= NAME | '-classobfuscationdictionary' classObfuscationDictionary= NAME | '-packageobfuscationdictionary' packageObfuscationDictionary= NAME | ( '-repackageclasses' ( '\\'' (newPackage= NAME )? '\\'' )? ) | ( '-flattenpackagehierarchy' ( '\\'' (newPackage= NAME )? '\\'' )? ) | ( '-adaptresourcefilenames' filter[file_filter] ) | ( '-adaptresourcefilecontents' filter[file_filter] ) ) ;
	public final ProguardParser.ignoredFlag_return ignoredFlag() throws RecognitionException {
		ProguardParser.ignoredFlag_return retval = new ProguardParser.ignoredFlag_return();
		retval.start = input.LT(1);

		Token sourceFile=null;
		Token mapping=null;
		Token obfuscationDictionary=null;
		Token classObfuscationDictionary=null;
		Token packageObfuscationDictionary=null;
		Token newPackage=null;

		try {
			// Proguard.g:78:3: ( ( ( '-optimizations' filter[optimization_filter] ) | '-useuniqueclassmembernames' | '-allowaccessmodification' | ( '-optimizationpasses' NAME ) | ( '-assumenosideeffects' classSpecification ) | '-mergeinterfacesaggressively' | '-overloadaggressively' | ( '-renamesourcefileattribute' (sourceFile= NAME )? ) | ( '-adaptclassstrings' filter[filter] ) | ( '-applymapping' mapping= NAME ) | '-obfuscationdictionary' obfuscationDictionary= NAME | '-classobfuscationdictionary' classObfuscationDictionary= NAME | '-packageobfuscationdictionary' packageObfuscationDictionary= NAME | ( '-repackageclasses' ( '\\'' (newPackage= NAME )? '\\'' )? ) | ( '-flattenpackagehierarchy' ( '\\'' (newPackage= NAME )? '\\'' )? ) | ( '-adaptresourcefilenames' filter[file_filter] ) | ( '-adaptresourcefilecontents' filter[file_filter] ) ) )
			// Proguard.g:79:3: ( ( '-optimizations' filter[optimization_filter] ) | '-useuniqueclassmembernames' | '-allowaccessmodification' | ( '-optimizationpasses' NAME ) | ( '-assumenosideeffects' classSpecification ) | '-mergeinterfacesaggressively' | '-overloadaggressively' | ( '-renamesourcefileattribute' (sourceFile= NAME )? ) | ( '-adaptclassstrings' filter[filter] ) | ( '-applymapping' mapping= NAME ) | '-obfuscationdictionary' obfuscationDictionary= NAME | '-classobfuscationdictionary' classObfuscationDictionary= NAME | '-packageobfuscationdictionary' packageObfuscationDictionary= NAME | ( '-repackageclasses' ( '\\'' (newPackage= NAME )? '\\'' )? ) | ( '-flattenpackagehierarchy' ( '\\'' (newPackage= NAME )? '\\'' )? ) | ( '-adaptresourcefilenames' filter[file_filter] ) | ( '-adaptresourcefilecontents' filter[file_filter] ) )
			{
			// Proguard.g:79:3: ( ( '-optimizations' filter[optimization_filter] ) | '-useuniqueclassmembernames' | '-allowaccessmodification' | ( '-optimizationpasses' NAME ) | ( '-assumenosideeffects' classSpecification ) | '-mergeinterfacesaggressively' | '-overloadaggressively' | ( '-renamesourcefileattribute' (sourceFile= NAME )? ) | ( '-adaptclassstrings' filter[filter] ) | ( '-applymapping' mapping= NAME ) | '-obfuscationdictionary' obfuscationDictionary= NAME | '-classobfuscationdictionary' classObfuscationDictionary= NAME | '-packageobfuscationdictionary' packageObfuscationDictionary= NAME | ( '-repackageclasses' ( '\\'' (newPackage= NAME )? '\\'' )? ) | ( '-flattenpackagehierarchy' ( '\\'' (newPackage= NAME )? '\\'' )? ) | ( '-adaptresourcefilenames' filter[file_filter] ) | ( '-adaptresourcefilecontents' filter[file_filter] ) )
			int alt11=17;
			switch ( input.LA(1) ) {
			case 50:
				{
				alt11=1;
				}
				break;
			case 62:
				{
				alt11=2;
				}
				break;
			case 15:
				{
				alt11=3;
				}
				break;
			case 49:
				{
				alt11=4;
				}
				break;
			case 17:
				{
				alt11=5;
				}
				break;
			case 46:
				{
				alt11=6;
				}
				break;
			case 52:
				{
				alt11=7;
				}
				break;
			case 58:
				{
				alt11=8;
				}
				break;
			case 12:
				{
				alt11=9;
				}
				break;
			case 16:
				{
				alt11=10;
				}
				break;
			case 48:
				{
				alt11=11;
				}
				break;
			case 19:
				{
				alt11=12;
				}
				break;
			case 53:
				{
				alt11=13;
				}
				break;
			case 59:
				{
				alt11=14;
				}
				break;
			case 30:
				{
				alt11=15;
				}
				break;
			case 14:
				{
				alt11=16;
				}
				break;
			case 13:
				{
				alt11=17;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}
			switch (alt11) {
				case 1 :
					// Proguard.g:79:7: ( '-optimizations' filter[optimization_filter] )
					{
					// Proguard.g:79:7: ( '-optimizations' filter[optimization_filter] )
					// Proguard.g:79:8: '-optimizations' filter[optimization_filter]
					{
					match(input,50,FOLLOW_50_in_ignoredFlag494); 
					FilterSpecification optimization_filter = new FilterSpecification();
					pushFollow(FOLLOW_filter_in_ignoredFlag498);
					filter(optimization_filter);
					state._fsp--;

					}

					}
					break;
				case 2 :
					// Proguard.g:80:7: '-useuniqueclassmembernames'
					{
					match(input,62,FOLLOW_62_in_ignoredFlag508); 
					}
					break;
				case 3 :
					// Proguard.g:81:7: '-allowaccessmodification'
					{
					match(input,15,FOLLOW_15_in_ignoredFlag516); 
					}
					break;
				case 4 :
					// Proguard.g:82:7: ( '-optimizationpasses' NAME )
					{
					// Proguard.g:82:7: ( '-optimizationpasses' NAME )
					// Proguard.g:82:8: '-optimizationpasses' NAME
					{
					match(input,49,FOLLOW_49_in_ignoredFlag525); 
					match(input,NAME,FOLLOW_NAME_in_ignoredFlag527); 
					}

					}
					break;
				case 5 :
					// Proguard.g:83:7: ( '-assumenosideeffects' classSpecification )
					{
					// Proguard.g:83:7: ( '-assumenosideeffects' classSpecification )
					// Proguard.g:83:8: '-assumenosideeffects' classSpecification
					{
					match(input,17,FOLLOW_17_in_ignoredFlag538); 
					pushFollow(FOLLOW_classSpecification_in_ignoredFlag540);
					classSpecification();
					state._fsp--;

					}

					}
					break;
				case 6 :
					// Proguard.g:84:7: '-mergeinterfacesaggressively'
					{
					match(input,46,FOLLOW_46_in_ignoredFlag549); 
					}
					break;
				case 7 :
					// Proguard.g:85:7: '-overloadaggressively'
					{
					match(input,52,FOLLOW_52_in_ignoredFlag557); 
					}
					break;
				case 8 :
					// Proguard.g:86:7: ( '-renamesourcefileattribute' (sourceFile= NAME )? )
					{
					// Proguard.g:86:7: ( '-renamesourcefileattribute' (sourceFile= NAME )? )
					// Proguard.g:86:8: '-renamesourcefileattribute' (sourceFile= NAME )?
					{
					match(input,58,FOLLOW_58_in_ignoredFlag566); 
					// Proguard.g:86:47: (sourceFile= NAME )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==NAME) ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// Proguard.g:86:47: sourceFile= NAME
							{
							sourceFile=(Token)match(input,NAME,FOLLOW_NAME_in_ignoredFlag570); 
							}
							break;

					}

					}

					}
					break;
				case 9 :
					// Proguard.g:87:7: ( '-adaptclassstrings' filter[filter] )
					{
					// Proguard.g:87:7: ( '-adaptclassstrings' filter[filter] )
					// Proguard.g:87:8: '-adaptclassstrings' filter[filter]
					{
					match(input,12,FOLLOW_12_in_ignoredFlag581); 
					FilterSpecification filter = new FilterSpecification();
					pushFollow(FOLLOW_filter_in_ignoredFlag585);
					filter(filter);
					state._fsp--;

					}

					}
					break;
				case 10 :
					// Proguard.g:88:7: ( '-applymapping' mapping= NAME )
					{
					// Proguard.g:88:7: ( '-applymapping' mapping= NAME )
					// Proguard.g:88:8: '-applymapping' mapping= NAME
					{
					match(input,16,FOLLOW_16_in_ignoredFlag596); 
					mapping=(Token)match(input,NAME,FOLLOW_NAME_in_ignoredFlag600); 
					}

					}
					break;
				case 11 :
					// Proguard.g:89:7: '-obfuscationdictionary' obfuscationDictionary= NAME
					{
					match(input,48,FOLLOW_48_in_ignoredFlag610); 
					obfuscationDictionary=(Token)match(input,NAME,FOLLOW_NAME_in_ignoredFlag614); 
					}
					break;
				case 12 :
					// Proguard.g:90:7: '-classobfuscationdictionary' classObfuscationDictionary= NAME
					{
					match(input,19,FOLLOW_19_in_ignoredFlag622); 
					classObfuscationDictionary=(Token)match(input,NAME,FOLLOW_NAME_in_ignoredFlag626); 
					}
					break;
				case 13 :
					// Proguard.g:91:7: '-packageobfuscationdictionary' packageObfuscationDictionary= NAME
					{
					match(input,53,FOLLOW_53_in_ignoredFlag634); 
					packageObfuscationDictionary=(Token)match(input,NAME,FOLLOW_NAME_in_ignoredFlag638); 
					}
					break;
				case 14 :
					// Proguard.g:92:7: ( '-repackageclasses' ( '\\'' (newPackage= NAME )? '\\'' )? )
					{
					// Proguard.g:92:7: ( '-repackageclasses' ( '\\'' (newPackage= NAME )? '\\'' )? )
					// Proguard.g:92:8: '-repackageclasses' ( '\\'' (newPackage= NAME )? '\\'' )?
					{
					match(input,59,FOLLOW_59_in_ignoredFlag647); 
					// Proguard.g:92:28: ( '\\'' (newPackage= NAME )? '\\'' )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==72) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// Proguard.g:92:29: '\\'' (newPackage= NAME )? '\\''
							{
							match(input,72,FOLLOW_72_in_ignoredFlag650); 
							// Proguard.g:92:44: (newPackage= NAME )?
							int alt7=2;
							int LA7_0 = input.LA(1);
							if ( (LA7_0==NAME) ) {
								alt7=1;
							}
							switch (alt7) {
								case 1 :
									// Proguard.g:92:44: newPackage= NAME
									{
									newPackage=(Token)match(input,NAME,FOLLOW_NAME_in_ignoredFlag654); 
									}
									break;

							}

							match(input,72,FOLLOW_72_in_ignoredFlag657); 
							}
							break;

					}

					}

					}
					break;
				case 15 :
					// Proguard.g:93:7: ( '-flattenpackagehierarchy' ( '\\'' (newPackage= NAME )? '\\'' )? )
					{
					// Proguard.g:93:7: ( '-flattenpackagehierarchy' ( '\\'' (newPackage= NAME )? '\\'' )? )
					// Proguard.g:93:8: '-flattenpackagehierarchy' ( '\\'' (newPackage= NAME )? '\\'' )?
					{
					match(input,30,FOLLOW_30_in_ignoredFlag670); 
					// Proguard.g:93:35: ( '\\'' (newPackage= NAME )? '\\'' )?
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0==72) ) {
						alt10=1;
					}
					switch (alt10) {
						case 1 :
							// Proguard.g:93:36: '\\'' (newPackage= NAME )? '\\''
							{
							match(input,72,FOLLOW_72_in_ignoredFlag673); 
							// Proguard.g:93:51: (newPackage= NAME )?
							int alt9=2;
							int LA9_0 = input.LA(1);
							if ( (LA9_0==NAME) ) {
								alt9=1;
							}
							switch (alt9) {
								case 1 :
									// Proguard.g:93:51: newPackage= NAME
									{
									newPackage=(Token)match(input,NAME,FOLLOW_NAME_in_ignoredFlag677); 
									}
									break;

							}

							match(input,72,FOLLOW_72_in_ignoredFlag680); 
							}
							break;

					}

					}

					}
					break;
				case 16 :
					// Proguard.g:94:7: ( '-adaptresourcefilenames' filter[file_filter] )
					{
					// Proguard.g:94:7: ( '-adaptresourcefilenames' filter[file_filter] )
					// Proguard.g:94:8: '-adaptresourcefilenames' filter[file_filter]
					{
					match(input,14,FOLLOW_14_in_ignoredFlag693); 
					FilterSpecification file_filter = new FilterSpecification();
					pushFollow(FOLLOW_filter_in_ignoredFlag697);
					filter(file_filter);
					state._fsp--;

					}

					}
					break;
				case 17 :
					// Proguard.g:95:7: ( '-adaptresourcefilecontents' filter[file_filter] )
					{
					// Proguard.g:95:7: ( '-adaptresourcefilecontents' filter[file_filter] )
					// Proguard.g:95:8: '-adaptresourcefilecontents' filter[file_filter]
					{
					match(input,13,FOLLOW_13_in_ignoredFlag709); 
					FilterSpecification file_filter = new FilterSpecification();
					pushFollow(FOLLOW_filter_in_ignoredFlag713);
					filter(file_filter);
					state._fsp--;

					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "ignoredFlag"


	public static class unsupportedFlag_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "unsupportedFlag"
	// Proguard.g:99:9: private unsupportedFlag : ( '-injars' inJars= classpath | '-outjars' outJars= classpath | '-libraryjars' libraryJars= classpath | ( '-target' NAME ) | '-forceprocessing' | ( '-printusage' NAME ) | ( '-whyareyoukeeping' classSpecification ) | '-microedition' | ( '-printconfiguration' ( NAME )? ) | ( '-dump' ( NAME )? ) | '-printmapping' (outputMapping= NAME )? | ( '-printseeds' (seedOutputFile= NAME )? ) | ( '-keepdirectories' filter[directory_filter] ) ) ;
	public final ProguardParser.unsupportedFlag_return unsupportedFlag() throws RecognitionException {
		ProguardParser.unsupportedFlag_return retval = new ProguardParser.unsupportedFlag_return();
		retval.start = input.LT(1);

		Token outputMapping=null;
		Token seedOutputFile=null;

		try {
			// Proguard.g:100:3: ( ( '-injars' inJars= classpath | '-outjars' outJars= classpath | '-libraryjars' libraryJars= classpath | ( '-target' NAME ) | '-forceprocessing' | ( '-printusage' NAME ) | ( '-whyareyoukeeping' classSpecification ) | '-microedition' | ( '-printconfiguration' ( NAME )? ) | ( '-dump' ( NAME )? ) | '-printmapping' (outputMapping= NAME )? | ( '-printseeds' (seedOutputFile= NAME )? ) | ( '-keepdirectories' filter[directory_filter] ) ) )
			// Proguard.g:101:3: ( '-injars' inJars= classpath | '-outjars' outJars= classpath | '-libraryjars' libraryJars= classpath | ( '-target' NAME ) | '-forceprocessing' | ( '-printusage' NAME ) | ( '-whyareyoukeeping' classSpecification ) | '-microedition' | ( '-printconfiguration' ( NAME )? ) | ( '-dump' ( NAME )? ) | '-printmapping' (outputMapping= NAME )? | ( '-printseeds' (seedOutputFile= NAME )? ) | ( '-keepdirectories' filter[directory_filter] ) )
			{
			// Proguard.g:101:3: ( '-injars' inJars= classpath | '-outjars' outJars= classpath | '-libraryjars' libraryJars= classpath | ( '-target' NAME ) | '-forceprocessing' | ( '-printusage' NAME ) | ( '-whyareyoukeeping' classSpecification ) | '-microedition' | ( '-printconfiguration' ( NAME )? ) | ( '-dump' ( NAME )? ) | '-printmapping' (outputMapping= NAME )? | ( '-printseeds' (seedOutputFile= NAME )? ) | ( '-keepdirectories' filter[directory_filter] ) )
			int alt16=13;
			switch ( input.LA(1) ) {
			case 34:
				{
				alt16=1;
				}
				break;
			case 51:
				{
				alt16=2;
				}
				break;
			case 45:
				{
				alt16=3;
				}
				break;
			case 61:
				{
				alt16=4;
				}
				break;
			case 31:
				{
				alt16=5;
				}
				break;
			case 57:
				{
				alt16=6;
				}
				break;
			case 64:
				{
				alt16=7;
				}
				break;
			case 47:
				{
				alt16=8;
				}
				break;
			case 54:
				{
				alt16=9;
				}
				break;
			case 29:
				{
				alt16=10;
				}
				break;
			case 55:
				{
				alt16=11;
				}
				break;
			case 56:
				{
				alt16=12;
				}
				break;
			case 41:
				{
				alt16=13;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}
			switch (alt16) {
				case 1 :
					// Proguard.g:101:5: '-injars' inJars= classpath
					{
					match(input,34,FOLLOW_34_in_unsupportedFlag739); 
					pushFollow(FOLLOW_classpath_in_unsupportedFlag743);
					classpath();
					state._fsp--;

					}
					break;
				case 2 :
					// Proguard.g:102:7: '-outjars' outJars= classpath
					{
					match(input,51,FOLLOW_51_in_unsupportedFlag751); 
					pushFollow(FOLLOW_classpath_in_unsupportedFlag755);
					classpath();
					state._fsp--;

					}
					break;
				case 3 :
					// Proguard.g:103:7: '-libraryjars' libraryJars= classpath
					{
					match(input,45,FOLLOW_45_in_unsupportedFlag763); 
					pushFollow(FOLLOW_classpath_in_unsupportedFlag767);
					classpath();
					state._fsp--;

					}
					break;
				case 4 :
					// Proguard.g:104:7: ( '-target' NAME )
					{
					// Proguard.g:104:7: ( '-target' NAME )
					// Proguard.g:104:8: '-target' NAME
					{
					match(input,61,FOLLOW_61_in_unsupportedFlag776); 
					match(input,NAME,FOLLOW_NAME_in_unsupportedFlag778); 
					}

					}
					break;
				case 5 :
					// Proguard.g:105:7: '-forceprocessing'
					{
					match(input,31,FOLLOW_31_in_unsupportedFlag788); 
					}
					break;
				case 6 :
					// Proguard.g:106:7: ( '-printusage' NAME )
					{
					// Proguard.g:106:7: ( '-printusage' NAME )
					// Proguard.g:106:8: '-printusage' NAME
					{
					match(input,57,FOLLOW_57_in_unsupportedFlag797); 
					match(input,NAME,FOLLOW_NAME_in_unsupportedFlag799); 
					}

					}
					break;
				case 7 :
					// Proguard.g:107:7: ( '-whyareyoukeeping' classSpecification )
					{
					// Proguard.g:107:7: ( '-whyareyoukeeping' classSpecification )
					// Proguard.g:107:8: '-whyareyoukeeping' classSpecification
					{
					match(input,64,FOLLOW_64_in_unsupportedFlag810); 
					pushFollow(FOLLOW_classSpecification_in_unsupportedFlag812);
					classSpecification();
					state._fsp--;

					}

					}
					break;
				case 8 :
					// Proguard.g:108:7: '-microedition'
					{
					match(input,47,FOLLOW_47_in_unsupportedFlag821); 
					}
					break;
				case 9 :
					// Proguard.g:109:7: ( '-printconfiguration' ( NAME )? )
					{
					// Proguard.g:109:7: ( '-printconfiguration' ( NAME )? )
					// Proguard.g:109:8: '-printconfiguration' ( NAME )?
					{
					match(input,54,FOLLOW_54_in_unsupportedFlag830); 
					// Proguard.g:109:30: ( NAME )?
					int alt12=2;
					int LA12_0 = input.LA(1);
					if ( (LA12_0==NAME) ) {
						alt12=1;
					}
					switch (alt12) {
						case 1 :
							// Proguard.g:109:30: NAME
							{
							match(input,NAME,FOLLOW_NAME_in_unsupportedFlag832); 
							}
							break;

					}

					}

					}
					break;
				case 10 :
					// Proguard.g:110:7: ( '-dump' ( NAME )? )
					{
					// Proguard.g:110:7: ( '-dump' ( NAME )? )
					// Proguard.g:110:8: '-dump' ( NAME )?
					{
					match(input,29,FOLLOW_29_in_unsupportedFlag844); 
					// Proguard.g:110:16: ( NAME )?
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( (LA13_0==NAME) ) {
						alt13=1;
					}
					switch (alt13) {
						case 1 :
							// Proguard.g:110:16: NAME
							{
							match(input,NAME,FOLLOW_NAME_in_unsupportedFlag846); 
							}
							break;

					}

					}

					}
					break;
				case 11 :
					// Proguard.g:111:7: '-printmapping' (outputMapping= NAME )?
					{
					match(input,55,FOLLOW_55_in_unsupportedFlag857); 
					// Proguard.g:111:36: (outputMapping= NAME )?
					int alt14=2;
					int LA14_0 = input.LA(1);
					if ( (LA14_0==NAME) ) {
						alt14=1;
					}
					switch (alt14) {
						case 1 :
							// Proguard.g:111:36: outputMapping= NAME
							{
							outputMapping=(Token)match(input,NAME,FOLLOW_NAME_in_unsupportedFlag861); 
							}
							break;

					}

					}
					break;
				case 12 :
					// Proguard.g:112:7: ( '-printseeds' (seedOutputFile= NAME )? )
					{
					// Proguard.g:112:7: ( '-printseeds' (seedOutputFile= NAME )? )
					// Proguard.g:112:8: '-printseeds' (seedOutputFile= NAME )?
					{
					match(input,56,FOLLOW_56_in_unsupportedFlag871); 
					// Proguard.g:112:36: (seedOutputFile= NAME )?
					int alt15=2;
					int LA15_0 = input.LA(1);
					if ( (LA15_0==NAME) ) {
						alt15=1;
					}
					switch (alt15) {
						case 1 :
							// Proguard.g:112:36: seedOutputFile= NAME
							{
							seedOutputFile=(Token)match(input,NAME,FOLLOW_NAME_in_unsupportedFlag875); 
							}
							break;

					}

					}

					}
					break;
				case 13 :
					// Proguard.g:113:7: ( '-keepdirectories' filter[directory_filter] )
					{
					// Proguard.g:113:7: ( '-keepdirectories' filter[directory_filter] )
					// Proguard.g:113:8: '-keepdirectories' filter[directory_filter]
					{
					match(input,41,FOLLOW_41_in_unsupportedFlag887); 
					FilterSpecification directory_filter = new FilterSpecification();
					pushFollow(FOLLOW_filter_in_unsupportedFlag891);
					filter(directory_filter);
					state._fsp--;

					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "unsupportedFlag"



	// $ANTLR start "classpath"
	// Proguard.g:117:9: private classpath : NAME ( ( ':' | ';' ) classpath )? ;
	public final void classpath() throws RecognitionException {
		try {
			// Proguard.g:118:3: ( NAME ( ( ':' | ';' ) classpath )? )
			// Proguard.g:118:6: NAME ( ( ':' | ';' ) classpath )?
			{
			match(input,NAME,FOLLOW_NAME_in_classpath913); 
			// Proguard.g:118:11: ( ( ':' | ';' ) classpath )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( ((LA17_0 >= 65 && LA17_0 <= 66)) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// Proguard.g:118:12: ( ':' | ';' ) classpath
					{
					if ( (input.LA(1) >= 65 && input.LA(1) <= 66) ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_classpath_in_classpath922);
					classpath();
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
			// do for sure before leaving
		}
	}
	// $ANTLR end "classpath"



	// $ANTLR start "filter"
	// Proguard.g:121:9: private filter[FilterSpecification filter] : ( nonEmptytFilter[filter] |);
	public final void filter(FilterSpecification filter) throws RecognitionException {
		try {
			// Proguard.g:122:3: ( nonEmptytFilter[filter] |)
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( ((LA18_0 >= NAME && LA18_0 <= NEGATOR)) ) {
				alt18=1;
			}
			else if ( (LA18_0==EOF||(LA18_0 >= 12 && LA18_0 <= 64)||LA18_0==70) ) {
				alt18=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}

			switch (alt18) {
				case 1 :
					// Proguard.g:123:3: nonEmptytFilter[filter]
					{
					pushFollow(FOLLOW_nonEmptytFilter_in_filter943);
					nonEmptytFilter(filter);
					state._fsp--;

					}
					break;
				case 2 :
					// Proguard.g:124:5: 
					{
					GrammarActions.filter(filter, false, "**");
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "filter"



	// $ANTLR start "nonEmptytFilter"
	// Proguard.g:128:9: private nonEmptytFilter[FilterSpecification filter] : ( ( NEGATOR )? NAME ( ',' nonEmptytFilter[filter] )? ) ;
	public final void nonEmptytFilter(FilterSpecification filter) throws RecognitionException {
		Token NAME1=null;


		  boolean negator = false;

		try {
			// Proguard.g:132:3: ( ( ( NEGATOR )? NAME ( ',' nonEmptytFilter[filter] )? ) )
			// Proguard.g:133:3: ( ( NEGATOR )? NAME ( ',' nonEmptytFilter[filter] )? )
			{
			// Proguard.g:133:3: ( ( NEGATOR )? NAME ( ',' nonEmptytFilter[filter] )? )
			// Proguard.g:133:4: ( NEGATOR )? NAME ( ',' nonEmptytFilter[filter] )?
			{
			// Proguard.g:133:4: ( NEGATOR )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==NEGATOR) ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// Proguard.g:133:5: NEGATOR
					{
					match(input,NEGATOR,FOLLOW_NEGATOR_in_nonEmptytFilter977); 
					negator=true;
					}
					break;

			}

			NAME1=(Token)match(input,NAME,FOLLOW_NAME_in_nonEmptytFilter983); 
			GrammarActions.filter(filter, negator, (NAME1!=null?NAME1.getText():null));
			// Proguard.g:133:91: ( ',' nonEmptytFilter[filter] )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==11) ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// Proguard.g:133:92: ',' nonEmptytFilter[filter]
					{
					match(input,11,FOLLOW_11_in_nonEmptytFilter988); 
					pushFollow(FOLLOW_nonEmptytFilter_in_nonEmptytFilter990);
					nonEmptytFilter(filter);
					state._fsp--;

					}
					break;

			}

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "nonEmptytFilter"



	// $ANTLR start "classSpecification"
	// Proguard.g:136:9: private classSpecification returns [ClassSpecification classSpec] : ( annotation )? cType= classModifierAndType[modifier] ( NEGATOR )? NAME (inheritanceSpec= inheritance )? ( members[classSpec] )? ;
	public final ClassSpecification classSpecification() throws RecognitionException {
		ClassSpecification classSpec = null;


		Token NAME2=null;
		ClassTypeSpecification cType =null;
		InheritanceSpecification inheritanceSpec =null;
		AnnotationSpecification annotation3 =null;


		  ModifierSpecification modifier = new ModifierSpecification();
		  boolean hasNameNegator = false;

		try {
			// Proguard.g:141:3: ( ( annotation )? cType= classModifierAndType[modifier] ( NEGATOR )? NAME (inheritanceSpec= inheritance )? ( members[classSpec] )? )
			// Proguard.g:142:3: ( annotation )? cType= classModifierAndType[modifier] ( NEGATOR )? NAME (inheritanceSpec= inheritance )? ( members[classSpec] )?
			{
			// Proguard.g:142:3: ( annotation )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==70) ) {
				int LA21_1 = input.LA(2);
				if ( ((LA21_1 >= NAME && LA21_1 <= NEGATOR)) ) {
					alt21=1;
				}
			}
			switch (alt21) {
				case 1 :
					// Proguard.g:142:4: annotation
					{
					pushFollow(FOLLOW_annotation_in_classSpecification1020);
					annotation3=annotation();
					state._fsp--;

					}
					break;

			}

			pushFollow(FOLLOW_classModifierAndType_in_classSpecification1028);
			cType=classModifierAndType(modifier);
			state._fsp--;

			// Proguard.g:144:3: ( NEGATOR )?
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==NEGATOR) ) {
				alt22=1;
			}
			switch (alt22) {
				case 1 :
					// Proguard.g:144:4: NEGATOR
					{
					match(input,NEGATOR,FOLLOW_NEGATOR_in_classSpecification1034); 
					hasNameNegator = true;
					}
					break;

			}

			NAME2=(Token)match(input,NAME,FOLLOW_NAME_in_classSpecification1040); 
			classSpec = GrammarActions.classSpec((NAME2!=null?NAME2.getText():null), hasNameNegator, cType, annotation3, modifier);
			// Proguard.g:145:3: (inheritanceSpec= inheritance )?
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==80||LA23_0==82) ) {
				alt23=1;
			}
			switch (alt23) {
				case 1 :
					// Proguard.g:145:4: inheritanceSpec= inheritance
					{
					pushFollow(FOLLOW_inheritance_in_classSpecification1049);
					inheritanceSpec=inheritance();
					state._fsp--;

					classSpec.setInheritance(inheritanceSpec);
					}
					break;

			}

			// Proguard.g:146:3: ( members[classSpec] )?
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==95) ) {
				alt24=1;
			}
			switch (alt24) {
				case 1 :
					// Proguard.g:146:3: members[classSpec]
					{
					pushFollow(FOLLOW_members_in_classSpecification1057);
					members(classSpec);
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
			// do for sure before leaving
		}
		return classSpec;
	}
	// $ANTLR end "classSpecification"



	// $ANTLR start "classModifierAndType"
	// Proguard.g:149:9: private classModifierAndType[ModifierSpecification modifier] returns [ClassTypeSpecification cType] : ( NEGATOR )? ( 'public' cmat= classModifierAndType[modifier] | 'abstract' cmat= classModifierAndType[modifier] | 'final' cmat= classModifierAndType[modifier] | classType ) ;
	public final ClassTypeSpecification classModifierAndType(ModifierSpecification modifier) throws RecognitionException {
		ClassTypeSpecification cType = null;


		ClassTypeSpecification cmat =null;
		int classType4 =0;


		  boolean hasNegator = false;

		try {
			// Proguard.g:153:3: ( ( NEGATOR )? ( 'public' cmat= classModifierAndType[modifier] | 'abstract' cmat= classModifierAndType[modifier] | 'final' cmat= classModifierAndType[modifier] | classType ) )
			// Proguard.g:154:3: ( NEGATOR )? ( 'public' cmat= classModifierAndType[modifier] | 'abstract' cmat= classModifierAndType[modifier] | 'final' cmat= classModifierAndType[modifier] | classType )
			{
			// Proguard.g:154:3: ( NEGATOR )?
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==NEGATOR) ) {
				alt25=1;
			}
			switch (alt25) {
				case 1 :
					// Proguard.g:154:4: NEGATOR
					{
					match(input,NEGATOR,FOLLOW_NEGATOR_in_classModifierAndType1086); 
					hasNegator = true;
					}
					break;

			}

			// Proguard.g:155:3: ( 'public' cmat= classModifierAndType[modifier] | 'abstract' cmat= classModifierAndType[modifier] | 'final' cmat= classModifierAndType[modifier] | classType )
			int alt26=4;
			switch ( input.LA(1) ) {
			case 87:
				{
				alt26=1;
				}
				break;
			case 73:
				{
				alt26=2;
				}
				break;
			case 81:
				{
				alt26=3;
				}
				break;
			case 70:
			case 78:
			case 79:
			case 83:
				{
				alt26=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 26, 0, input);
				throw nvae;
			}
			switch (alt26) {
				case 1 :
					// Proguard.g:156:3: 'public' cmat= classModifierAndType[modifier]
					{
					match(input,87,FOLLOW_87_in_classModifierAndType1098); 
					GrammarActions.addModifier(modifier, ACC_PUBLIC, hasNegator);
					pushFollow(FOLLOW_classModifierAndType_in_classModifierAndType1104);
					cmat=classModifierAndType(modifier);
					state._fsp--;

					cType = cmat;
					}
					break;
				case 2 :
					// Proguard.g:157:5: 'abstract' cmat= classModifierAndType[modifier]
					{
					match(input,73,FOLLOW_73_in_classModifierAndType1113); 
					GrammarActions.addModifier(modifier, ACC_ABSTRACT, hasNegator);
					pushFollow(FOLLOW_classModifierAndType_in_classModifierAndType1119);
					cmat=classModifierAndType(modifier);
					state._fsp--;

					cType = cmat;
					}
					break;
				case 3 :
					// Proguard.g:158:5: 'final' cmat= classModifierAndType[modifier]
					{
					match(input,81,FOLLOW_81_in_classModifierAndType1128); 
					GrammarActions.addModifier(modifier, ACC_FINAL, hasNegator);
					pushFollow(FOLLOW_classModifierAndType_in_classModifierAndType1134);
					cmat=classModifierAndType(modifier);
					state._fsp--;

					cType = cmat;
					}
					break;
				case 4 :
					// Proguard.g:159:5: classType
					{
					pushFollow(FOLLOW_classType_in_classModifierAndType1143);
					classType4=classType();
					state._fsp--;

					cType=GrammarActions.classType(classType4, hasNegator); 
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
			// do for sure before leaving
		}
		return cType;
	}
	// $ANTLR end "classModifierAndType"



	// $ANTLR start "classType"
	// Proguard.g:163:9: private classType returns [int type] : ( '@' )? ( 'interface' | 'enum' | 'class' ) ;
	public final int classType() throws RecognitionException {
		int type = 0;



		  type = 0;

		try {
			// Proguard.g:167:3: ( ( '@' )? ( 'interface' | 'enum' | 'class' ) )
			// Proguard.g:168:3: ( '@' )? ( 'interface' | 'enum' | 'class' )
			{
			// Proguard.g:168:3: ( '@' )?
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==70) ) {
				alt27=1;
			}
			switch (alt27) {
				case 1 :
					// Proguard.g:168:4: '@'
					{
					match(input,70,FOLLOW_70_in_classType1176); 
					type |= ACC_ANNOTATION;
					}
					break;

			}

			// Proguard.g:169:3: ( 'interface' | 'enum' | 'class' )
			int alt28=3;
			switch ( input.LA(1) ) {
			case 83:
				{
				alt28=1;
				}
				break;
			case 79:
				{
				alt28=2;
				}
				break;
			case 78:
				{
				alt28=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 28, 0, input);
				throw nvae;
			}
			switch (alt28) {
				case 1 :
					// Proguard.g:169:4: 'interface'
					{
					match(input,83,FOLLOW_83_in_classType1185); 
					type |= ACC_INTERFACE;
					}
					break;
				case 2 :
					// Proguard.g:170:5: 'enum'
					{
					match(input,79,FOLLOW_79_in_classType1193); 
					type |= ACC_ENUM;
					}
					break;
				case 3 :
					// Proguard.g:171:5: 'class'
					{
					match(input,78,FOLLOW_78_in_classType1201); 
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
			// do for sure before leaving
		}
		return type;
	}
	// $ANTLR end "classType"



	// $ANTLR start "members"
	// Proguard.g:175:9: private members[ClassSpecification classSpec] : '{' ( member[classSpec] )* '}' ;
	public final void members(ClassSpecification classSpec) throws RecognitionException {
		try {
			// Proguard.g:176:3: ( '{' ( member[classSpec] )* '}' )
			// Proguard.g:177:3: '{' ( member[classSpec] )* '}'
			{
			match(input,95,FOLLOW_95_in_members1224); 
			// Proguard.g:178:5: ( member[classSpec] )*
			loop29:
			while (true) {
				int alt29=2;
				int LA29_0 = input.LA(1);
				if ( ((LA29_0 >= NAME && LA29_0 <= NEGATOR)||LA29_0==8||(LA29_0 >= 67 && LA29_0 <= 70)||LA29_0==73||LA29_0==77||LA29_0==81||(LA29_0 >= 84 && LA29_0 <= 94)) ) {
					alt29=1;
				}

				switch (alt29) {
				case 1 :
					// Proguard.g:178:5: member[classSpec]
					{
					pushFollow(FOLLOW_member_in_members1230);
					member(classSpec);
					state._fsp--;

					}
					break;

				default :
					break loop29;
				}
			}

			match(input,96,FOLLOW_96_in_members1236); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "members"



	// $ANTLR start "member"
	// Proguard.g:182:9: private member[ClassSpecification classSpec] : ( annotation )? modifiers ( (typeSig= type )? name= ( NAME | '<init>' ) (signature= arguments |) | '<methods>' | '<fields>' ) ';' ;
	public final void member(ClassSpecification classSpec) throws RecognitionException {
		Token name=null;
		String typeSig =null;
		String signature =null;
		AnnotationSpecification annotation5 =null;
		ModifierSpecification modifiers6 =null;

		try {
			// Proguard.g:183:3: ( ( annotation )? modifiers ( (typeSig= type )? name= ( NAME | '<init>' ) (signature= arguments |) | '<methods>' | '<fields>' ) ';' )
			// Proguard.g:184:5: ( annotation )? modifiers ( (typeSig= type )? name= ( NAME | '<init>' ) (signature= arguments |) | '<methods>' | '<fields>' ) ';'
			{
			// Proguard.g:184:5: ( annotation )?
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==70) ) {
				alt30=1;
			}
			switch (alt30) {
				case 1 :
					// Proguard.g:184:5: annotation
					{
					pushFollow(FOLLOW_annotation_in_member1257);
					annotation5=annotation();
					state._fsp--;

					}
					break;

			}

			pushFollow(FOLLOW_modifiers_in_member1260);
			modifiers6=modifiers();
			state._fsp--;

			// Proguard.g:185:5: ( (typeSig= type )? name= ( NAME | '<init>' ) (signature= arguments |) | '<methods>' | '<fields>' )
			int alt33=3;
			switch ( input.LA(1) ) {
			case NAME:
			case 8:
			case 68:
				{
				alt33=1;
				}
				break;
			case 69:
				{
				alt33=2;
				}
				break;
			case 67:
				{
				alt33=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 33, 0, input);
				throw nvae;
			}
			switch (alt33) {
				case 1 :
					// Proguard.g:186:7: (typeSig= type )? name= ( NAME | '<init>' ) (signature= arguments |)
					{
					// Proguard.g:186:7: (typeSig= type )?
					int alt31=2;
					int LA31_0 = input.LA(1);
					if ( (LA31_0==8) ) {
						alt31=1;
					}
					else if ( (LA31_0==NAME) ) {
						int LA31_2 = input.LA(2);
						if ( (LA31_2==NAME||LA31_2==68||LA31_2==71) ) {
							alt31=1;
						}
					}
					switch (alt31) {
						case 1 :
							// Proguard.g:186:8: typeSig= type
							{
							pushFollow(FOLLOW_type_in_member1277);
							typeSig=type();
							state._fsp--;

							}
							break;

					}

					name=input.LT(1);
					if ( input.LA(1)==NAME||input.LA(1)==68 ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					// Proguard.g:186:44: (signature= arguments |)
					int alt32=2;
					int LA32_0 = input.LA(1);
					if ( (LA32_0==9) ) {
						alt32=1;
					}
					else if ( (LA32_0==66) ) {
						alt32=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 32, 0, input);
						throw nvae;
					}

					switch (alt32) {
						case 1 :
							// Proguard.g:186:45: signature= arguments
							{
							pushFollow(FOLLOW_arguments_in_member1292);
							signature=arguments();
							state._fsp--;

							GrammarActions.method(classSpec, annotation5, typeSig, (name!=null?name.getText():null), signature, modifiers6);
							}
							break;
						case 2 :
							// Proguard.g:187:21: 
							{
							GrammarActions.fieldOrAnyMember(classSpec, annotation5, typeSig, (name!=null?name.getText():null), modifiers6);
							}
							break;

					}

					}
					break;
				case 2 :
					// Proguard.g:188:9: '<methods>'
					{
					match(input,69,FOLLOW_69_in_member1327); 
					GrammarActions.method(classSpec, annotation5,
					          GrammarActions.getSignature("***", 0), "*", "("+ GrammarActions.getSignature("...", 0) + ")",
					          modifiers6);
					}
					break;
				case 3 :
					// Proguard.g:191:9: '<fields>'
					{
					match(input,67,FOLLOW_67_in_member1339); 
					GrammarActions.field(classSpec, annotation5, null, "*", modifiers6);
					}
					break;

			}

			match(input,66,FOLLOW_66_in_member1349); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "member"



	// $ANTLR start "annotation"
	// Proguard.g:195:9: private annotation returns [AnnotationSpecification annotSpec] : '@' ( NEGATOR )? NAME ;
	public final AnnotationSpecification annotation() throws RecognitionException {
		AnnotationSpecification annotSpec = null;


		Token NAME7=null;


		  boolean hasNameNegator = false;

		try {
			// Proguard.g:199:3: ( '@' ( NEGATOR )? NAME )
			// Proguard.g:199:6: '@' ( NEGATOR )? NAME
			{
			match(input,70,FOLLOW_70_in_annotation1373); 
			// Proguard.g:199:10: ( NEGATOR )?
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==NEGATOR) ) {
				alt34=1;
			}
			switch (alt34) {
				case 1 :
					// Proguard.g:199:11: NEGATOR
					{
					match(input,NEGATOR,FOLLOW_NEGATOR_in_annotation1376); 
					hasNameNegator = true;
					}
					break;

			}

			NAME7=(Token)match(input,NAME,FOLLOW_NAME_in_annotation1382); 
			annotSpec = GrammarActions.annotation((NAME7!=null?NAME7.getText():null), hasNameNegator);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return annotSpec;
	}
	// $ANTLR end "annotation"



	// $ANTLR start "modifiers"
	// Proguard.g:201:9: private modifiers returns [ModifierSpecification modifiers] : ( modifier[modifiers] )* ;
	public final ModifierSpecification modifiers() throws RecognitionException {
		ModifierSpecification modifiers = null;



		  modifiers = new ModifierSpecification();

		try {
			// Proguard.g:205:3: ( ( modifier[modifiers] )* )
			// Proguard.g:206:3: ( modifier[modifiers] )*
			{
			// Proguard.g:206:3: ( modifier[modifiers] )*
			loop35:
			while (true) {
				int alt35=2;
				int LA35_0 = input.LA(1);
				if ( (LA35_0==NEGATOR||LA35_0==73||LA35_0==77||LA35_0==81||(LA35_0 >= 84 && LA35_0 <= 94)) ) {
					alt35=1;
				}

				switch (alt35) {
				case 1 :
					// Proguard.g:206:3: modifier[modifiers]
					{
					pushFollow(FOLLOW_modifier_in_modifiers1406);
					modifier(modifiers);
					state._fsp--;

					}
					break;

				default :
					break loop35;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return modifiers;
	}
	// $ANTLR end "modifiers"



	// $ANTLR start "modifier"
	// Proguard.g:209:9: private modifier[ModifierSpecification modifiers] : ( NEGATOR )? ( 'public' | 'private' | 'protected' | 'static' | 'synchronized' | 'volatile' | 'native' | 'abstract' | 'strictfp' | 'final' | 'transient' | 'synthetic' | 'bridge' | 'varargs' ) ;
	public final void modifier(ModifierSpecification modifiers) throws RecognitionException {

		  boolean hasNegator = false;

		try {
			// Proguard.g:213:3: ( ( NEGATOR )? ( 'public' | 'private' | 'protected' | 'static' | 'synchronized' | 'volatile' | 'native' | 'abstract' | 'strictfp' | 'final' | 'transient' | 'synthetic' | 'bridge' | 'varargs' ) )
			// Proguard.g:214:3: ( NEGATOR )? ( 'public' | 'private' | 'protected' | 'static' | 'synchronized' | 'volatile' | 'native' | 'abstract' | 'strictfp' | 'final' | 'transient' | 'synthetic' | 'bridge' | 'varargs' )
			{
			// Proguard.g:214:3: ( NEGATOR )?
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==NEGATOR) ) {
				alt36=1;
			}
			switch (alt36) {
				case 1 :
					// Proguard.g:214:4: NEGATOR
					{
					match(input,NEGATOR,FOLLOW_NEGATOR_in_modifier1432); 
					hasNegator = true;
					}
					break;

			}

			// Proguard.g:215:3: ( 'public' | 'private' | 'protected' | 'static' | 'synchronized' | 'volatile' | 'native' | 'abstract' | 'strictfp' | 'final' | 'transient' | 'synthetic' | 'bridge' | 'varargs' )
			int alt37=14;
			switch ( input.LA(1) ) {
			case 87:
				{
				alt37=1;
				}
				break;
			case 85:
				{
				alt37=2;
				}
				break;
			case 86:
				{
				alt37=3;
				}
				break;
			case 88:
				{
				alt37=4;
				}
				break;
			case 90:
				{
				alt37=5;
				}
				break;
			case 94:
				{
				alt37=6;
				}
				break;
			case 84:
				{
				alt37=7;
				}
				break;
			case 73:
				{
				alt37=8;
				}
				break;
			case 89:
				{
				alt37=9;
				}
				break;
			case 81:
				{
				alt37=10;
				}
				break;
			case 92:
				{
				alt37=11;
				}
				break;
			case 91:
				{
				alt37=12;
				}
				break;
			case 77:
				{
				alt37=13;
				}
				break;
			case 93:
				{
				alt37=14;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 37, 0, input);
				throw nvae;
			}
			switch (alt37) {
				case 1 :
					// Proguard.g:216:5: 'public'
					{
					match(input,87,FOLLOW_87_in_modifier1446); 
					modifiers.addModifier(ACC_PUBLIC, hasNegator);
					}
					break;
				case 2 :
					// Proguard.g:217:7: 'private'
					{
					match(input,85,FOLLOW_85_in_modifier1456); 
					modifiers.addModifier(ACC_PRIVATE, hasNegator);
					}
					break;
				case 3 :
					// Proguard.g:218:7: 'protected'
					{
					match(input,86,FOLLOW_86_in_modifier1466); 
					modifiers.addModifier(ACC_PROTECTED, hasNegator);
					}
					break;
				case 4 :
					// Proguard.g:219:7: 'static'
					{
					match(input,88,FOLLOW_88_in_modifier1476); 
					modifiers.addModifier(ACC_STATIC, hasNegator);
					}
					break;
				case 5 :
					// Proguard.g:220:7: 'synchronized'
					{
					match(input,90,FOLLOW_90_in_modifier1486); 
					modifiers.addModifier(ACC_SYNCHRONIZED, hasNegator);
					}
					break;
				case 6 :
					// Proguard.g:221:7: 'volatile'
					{
					match(input,94,FOLLOW_94_in_modifier1496); 
					modifiers.addModifier(ACC_VOLATILE, hasNegator);
					}
					break;
				case 7 :
					// Proguard.g:222:7: 'native'
					{
					match(input,84,FOLLOW_84_in_modifier1506); 
					modifiers.addModifier(ACC_NATIVE, hasNegator);
					}
					break;
				case 8 :
					// Proguard.g:223:7: 'abstract'
					{
					match(input,73,FOLLOW_73_in_modifier1516); 
					modifiers.addModifier(ACC_ABSTRACT, hasNegator);
					}
					break;
				case 9 :
					// Proguard.g:224:7: 'strictfp'
					{
					match(input,89,FOLLOW_89_in_modifier1526); 
					modifiers.addModifier(ACC_STRICT, hasNegator);
					}
					break;
				case 10 :
					// Proguard.g:225:7: 'final'
					{
					match(input,81,FOLLOW_81_in_modifier1536); 
					modifiers.addModifier(ACC_FINAL, hasNegator);
					}
					break;
				case 11 :
					// Proguard.g:226:7: 'transient'
					{
					match(input,92,FOLLOW_92_in_modifier1546); 
					modifiers.addModifier(ACC_TRANSIENT, hasNegator);
					}
					break;
				case 12 :
					// Proguard.g:227:7: 'synthetic'
					{
					match(input,91,FOLLOW_91_in_modifier1556); 
					modifiers.addModifier(ACC_SYNTHETIC, hasNegator);
					}
					break;
				case 13 :
					// Proguard.g:228:7: 'bridge'
					{
					match(input,77,FOLLOW_77_in_modifier1566); 
					modifiers.addModifier(ACC_BRIDGE, hasNegator);
					}
					break;
				case 14 :
					// Proguard.g:229:7: 'varargs'
					{
					match(input,93,FOLLOW_93_in_modifier1576); 
					modifiers.addModifier(ACC_VARARGS, hasNegator);
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
			// do for sure before leaving
		}
	}
	// $ANTLR end "modifier"



	// $ANTLR start "inheritance"
	// Proguard.g:233:9: private inheritance returns [InheritanceSpecification inheritanceSpec] : ( 'extends' | 'implements' ) ( annotation )? ( NEGATOR )? NAME ;
	public final InheritanceSpecification inheritance() throws RecognitionException {
		InheritanceSpecification inheritanceSpec = null;


		Token NAME8=null;
		AnnotationSpecification annotation9 =null;


		  boolean hasNameNegator = false;

		try {
			// Proguard.g:237:3: ( ( 'extends' | 'implements' ) ( annotation )? ( NEGATOR )? NAME )
			// Proguard.g:238:3: ( 'extends' | 'implements' ) ( annotation )? ( NEGATOR )? NAME
			{
			if ( input.LA(1)==80||input.LA(1)==82 ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			// Proguard.g:239:3: ( annotation )?
			int alt38=2;
			int LA38_0 = input.LA(1);
			if ( (LA38_0==70) ) {
				alt38=1;
			}
			switch (alt38) {
				case 1 :
					// Proguard.g:239:3: annotation
					{
					pushFollow(FOLLOW_annotation_in_inheritance1617);
					annotation9=annotation();
					state._fsp--;

					}
					break;

			}

			// Proguard.g:239:15: ( NEGATOR )?
			int alt39=2;
			int LA39_0 = input.LA(1);
			if ( (LA39_0==NEGATOR) ) {
				alt39=1;
			}
			switch (alt39) {
				case 1 :
					// Proguard.g:239:16: NEGATOR
					{
					match(input,NEGATOR,FOLLOW_NEGATOR_in_inheritance1621); 
					hasNameNegator = true;
					}
					break;

			}

			NAME8=(Token)match(input,NAME,FOLLOW_NAME_in_inheritance1627); 
			inheritanceSpec = GrammarActions.createInheritance((NAME8!=null?NAME8.getText():null), hasNameNegator, annotation9);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return inheritanceSpec;
	}
	// $ANTLR end "inheritance"



	// $ANTLR start "arguments"
	// Proguard.g:241:9: private arguments returns [String signature] : '(' ( (parameterSig= type ( ',' parameterSig= type )* )? ) ')' ;
	public final String arguments() throws RecognitionException {
		String signature = null;


		String parameterSig =null;

		try {
			// Proguard.g:242:3: ( '(' ( (parameterSig= type ( ',' parameterSig= type )* )? ) ')' )
			// Proguard.g:243:3: '(' ( (parameterSig= type ( ',' parameterSig= type )* )? ) ')'
			{
			match(input,9,FOLLOW_9_in_arguments1647); 
			signature = "(";
			// Proguard.g:244:5: ( (parameterSig= type ( ',' parameterSig= type )* )? )
			// Proguard.g:245:7: (parameterSig= type ( ',' parameterSig= type )* )?
			{
			// Proguard.g:245:7: (parameterSig= type ( ',' parameterSig= type )* )?
			int alt41=2;
			int LA41_0 = input.LA(1);
			if ( (LA41_0==NAME||LA41_0==8) ) {
				alt41=1;
			}
			switch (alt41) {
				case 1 :
					// Proguard.g:246:9: parameterSig= type ( ',' parameterSig= type )*
					{
					pushFollow(FOLLOW_type_in_arguments1675);
					parameterSig=type();
					state._fsp--;

					signature += parameterSig;
					// Proguard.g:247:9: ( ',' parameterSig= type )*
					loop40:
					while (true) {
						int alt40=2;
						int LA40_0 = input.LA(1);
						if ( (LA40_0==11) ) {
							alt40=1;
						}

						switch (alt40) {
						case 1 :
							// Proguard.g:247:10: ',' parameterSig= type
							{
							match(input,11,FOLLOW_11_in_arguments1688); 
							pushFollow(FOLLOW_type_in_arguments1692);
							parameterSig=type();
							state._fsp--;

							signature += parameterSig;
							}
							break;

						default :
							break loop40;
						}
					}

					}
					break;

			}

			}

			match(input,10,FOLLOW_10_in_arguments1721); 
			signature += ")";
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return signature;
	}
	// $ANTLR end "arguments"



	// $ANTLR start "type"
	// Proguard.g:253:9: private type returns [String signature] : (typeName= '%' | (typeName= NAME ( '[]' )* ) ) ;
	public final String type() throws RecognitionException {
		String signature = null;


		Token typeName=null;


		  int dim = 0;

		try {
			// Proguard.g:257:3: ( (typeName= '%' | (typeName= NAME ( '[]' )* ) ) )
			// Proguard.g:258:3: (typeName= '%' | (typeName= NAME ( '[]' )* ) )
			{
			// Proguard.g:258:3: (typeName= '%' | (typeName= NAME ( '[]' )* ) )
			int alt43=2;
			int LA43_0 = input.LA(1);
			if ( (LA43_0==8) ) {
				alt43=1;
			}
			else if ( (LA43_0==NAME) ) {
				alt43=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 43, 0, input);
				throw nvae;
			}

			switch (alt43) {
				case 1 :
					// Proguard.g:259:5: typeName= '%'
					{
					typeName=(Token)match(input,8,FOLLOW_8_in_type1757); 
					String sig = (typeName!=null?typeName.getText():null); signature = GrammarActions.getSignature(sig == null ? "" : sig, 0);
					}
					break;
				case 2 :
					// Proguard.g:261:5: (typeName= NAME ( '[]' )* )
					{
					// Proguard.g:261:5: (typeName= NAME ( '[]' )* )
					// Proguard.g:261:6: typeName= NAME ( '[]' )*
					{
					typeName=(Token)match(input,NAME,FOLLOW_NAME_in_type1774); 
					// Proguard.g:261:20: ( '[]' )*
					loop42:
					while (true) {
						int alt42=2;
						int LA42_0 = input.LA(1);
						if ( (LA42_0==71) ) {
							alt42=1;
						}

						switch (alt42) {
						case 1 :
							// Proguard.g:261:21: '[]'
							{
							match(input,71,FOLLOW_71_in_type1777); 
							dim++;
							}
							break;

						default :
							break loop42;
						}
					}

					String sig = (typeName!=null?typeName.getText():null); signature = GrammarActions.getSignature(sig == null ? "" : sig, dim);
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
			// do for sure before leaving
		}
		return signature;
	}
	// $ANTLR end "type"



	// $ANTLR start "keepOptionModifier"
	// Proguard.g:265:9: private keepOptionModifier returns [KeepModifier modifier] : ',' ( 'allowshrinking' | 'allowoptimization' | 'allowobfuscation' ) ;
	public final KeepModifier keepOptionModifier() throws RecognitionException {
		KeepModifier modifier = null;


		try {
			// Proguard.g:266:3: ( ',' ( 'allowshrinking' | 'allowoptimization' | 'allowobfuscation' ) )
			// Proguard.g:266:5: ',' ( 'allowshrinking' | 'allowoptimization' | 'allowobfuscation' )
			{
			match(input,11,FOLLOW_11_in_keepOptionModifier1808); 
			// Proguard.g:267:3: ( 'allowshrinking' | 'allowoptimization' | 'allowobfuscation' )
			int alt44=3;
			switch ( input.LA(1) ) {
			case 76:
				{
				alt44=1;
				}
				break;
			case 75:
				{
				alt44=2;
				}
				break;
			case 74:
				{
				alt44=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 44, 0, input);
				throw nvae;
			}
			switch (alt44) {
				case 1 :
					// Proguard.g:267:4: 'allowshrinking'
					{
					match(input,76,FOLLOW_76_in_keepOptionModifier1813); 
					modifier = KeepModifier.ALLOW_SHRINKING;
					}
					break;
				case 2 :
					// Proguard.g:268:5: 'allowoptimization'
					{
					match(input,75,FOLLOW_75_in_keepOptionModifier1821); 
					}
					break;
				case 3 :
					// Proguard.g:269:5: 'allowobfuscation'
					{
					match(input,74,FOLLOW_74_in_keepOptionModifier1828); 
					modifier = KeepModifier.ALLOW_OBFUSCATION;
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
			// do for sure before leaving
		}
		return modifier;
	}
	// $ANTLR end "keepOptionModifier"

	// Delegated rules



	public static final BitSet FOLLOW_18_in_prog81 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_NAME_in_prog85 = new BitSet(new long[]{0xFFFFFFFFFFFFF000L,0x0000000000000041L});
	public static final BitSet FOLLOW_set_in_prog96 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_NAME_in_prog104 = new BitSet(new long[]{0xFFFFFFFFFFFFF000L,0x0000000000000041L});
	public static final BitSet FOLLOW_40_in_prog115 = new BitSet(new long[]{0x0000000000000840L,0x00000000008AC240L});
	public static final BitSet FOLLOW_keepOptionModifier_in_prog119 = new BitSet(new long[]{0x0000000000000040L,0x00000000008AC240L});
	public static final BitSet FOLLOW_classSpecification_in_prog124 = new BitSet(new long[]{0xFFFFFFFFFFFFF000L,0x0000000000000041L});
	public static final BitSet FOLLOW_38_in_prog136 = new BitSet(new long[]{0x0000000000000840L,0x00000000008AC240L});
	public static final BitSet FOLLOW_keepOptionModifier_in_prog140 = new BitSet(new long[]{0x0000000000000040L,0x00000000008AC240L});
	public static final BitSet FOLLOW_classSpecification_in_prog145 = new BitSet(new long[]{0xFFFFFFFFFFFFF000L,0x0000000000000041L});
	public static final BitSet FOLLOW_35_in_prog157 = new BitSet(new long[]{0x0000000000000840L,0x00000000008AC240L});
	public static final BitSet FOLLOW_keepOptionModifier_in_prog161 = new BitSet(new long[]{0x0000000000000040L,0x00000000008AC240L});
	public static final BitSet FOLLOW_classSpecification_in_prog166 = new BitSet(new long[]{0xFFFFFFFFFFFFF000L,0x0000000000000041L});
	public static final BitSet FOLLOW_ignoredFlag_in_prog180 = new BitSet(new long[]{0xFFFFFFFFFFFFF000L,0x0000000000000041L});
	public static final BitSet FOLLOW_noOpFlag_in_prog194 = new BitSet(new long[]{0xFFFFFFFFFFFFF000L,0x0000000000000041L});
	public static final BitSet FOLLOW_unsupportedFlag_in_prog208 = new BitSet(new long[]{0xFFFFFFFFFFFFF000L,0x0000000000000041L});
	public static final BitSet FOLLOW_28_in_prog220 = new BitSet(new long[]{0xFFFFFFFFFFFFF060L,0x0000000000000041L});
	public static final BitSet FOLLOW_filter_in_prog224 = new BitSet(new long[]{0xFFFFFFFFFFFFF000L,0x0000000000000041L});
	public static final BitSet FOLLOW_32_in_prog237 = new BitSet(new long[]{0xFFFFFFFFFFFFF000L,0x0000000000000041L});
	public static final BitSet FOLLOW_EOF_in_prog249 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_63_in_noOpFlag278 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_noOpFlag287 = new BitSet(new long[]{0x0000000000000060L});
	public static final BitSet FOLLOW_filter_in_noOpFlag291 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_27_in_noOpFlag306 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_noOpFlag314 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_noOpFlag322 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_60_in_noOpFlag330 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_44_in_noOpFlag343 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_noOpFlag352 = new BitSet(new long[]{0x0000000000000040L,0x00000000008AC240L});
	public static final BitSet FOLLOW_classSpecification_in_noOpFlag356 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_39_in_noOpFlag367 = new BitSet(new long[]{0x0000000000000040L,0x00000000008AC240L});
	public static final BitSet FOLLOW_classSpecification_in_noOpFlag371 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_noOpFlag383 = new BitSet(new long[]{0x0000000000000040L,0x00000000008AC240L});
	public static final BitSet FOLLOW_classSpecification_in_noOpFlag387 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_36_in_noOpFlag399 = new BitSet(new long[]{0x0000000000000060L});
	public static final BitSet FOLLOW_filter_in_noOpFlag403 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_noOpFlag415 = new BitSet(new long[]{0x0000000000000060L});
	public static final BitSet FOLLOW_filter_in_noOpFlag419 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_noOpFlag431 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_noOpFlag442 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_noOpFlag454 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_21_in_noOpFlag466 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_50_in_ignoredFlag494 = new BitSet(new long[]{0x0000000000000060L});
	public static final BitSet FOLLOW_filter_in_ignoredFlag498 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_62_in_ignoredFlag508 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_ignoredFlag516 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_ignoredFlag525 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_NAME_in_ignoredFlag527 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_ignoredFlag538 = new BitSet(new long[]{0x0000000000000040L,0x00000000008AC240L});
	public static final BitSet FOLLOW_classSpecification_in_ignoredFlag540 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_46_in_ignoredFlag549 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_ignoredFlag557 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_58_in_ignoredFlag566 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_NAME_in_ignoredFlag570 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_ignoredFlag581 = new BitSet(new long[]{0x0000000000000060L});
	public static final BitSet FOLLOW_filter_in_ignoredFlag585 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_ignoredFlag596 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_NAME_in_ignoredFlag600 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_ignoredFlag610 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_NAME_in_ignoredFlag614 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_ignoredFlag622 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_NAME_in_ignoredFlag626 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_ignoredFlag634 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_NAME_in_ignoredFlag638 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_59_in_ignoredFlag647 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
	public static final BitSet FOLLOW_72_in_ignoredFlag650 = new BitSet(new long[]{0x0000000000000020L,0x0000000000000100L});
	public static final BitSet FOLLOW_NAME_in_ignoredFlag654 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_72_in_ignoredFlag657 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_30_in_ignoredFlag670 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
	public static final BitSet FOLLOW_72_in_ignoredFlag673 = new BitSet(new long[]{0x0000000000000020L,0x0000000000000100L});
	public static final BitSet FOLLOW_NAME_in_ignoredFlag677 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_72_in_ignoredFlag680 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_ignoredFlag693 = new BitSet(new long[]{0x0000000000000060L});
	public static final BitSet FOLLOW_filter_in_ignoredFlag697 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_13_in_ignoredFlag709 = new BitSet(new long[]{0x0000000000000060L});
	public static final BitSet FOLLOW_filter_in_ignoredFlag713 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_34_in_unsupportedFlag739 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_classpath_in_unsupportedFlag743 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_51_in_unsupportedFlag751 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_classpath_in_unsupportedFlag755 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_45_in_unsupportedFlag763 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_classpath_in_unsupportedFlag767 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_61_in_unsupportedFlag776 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_NAME_in_unsupportedFlag778 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_31_in_unsupportedFlag788 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_57_in_unsupportedFlag797 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_NAME_in_unsupportedFlag799 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_64_in_unsupportedFlag810 = new BitSet(new long[]{0x0000000000000040L,0x00000000008AC240L});
	public static final BitSet FOLLOW_classSpecification_in_unsupportedFlag812 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_47_in_unsupportedFlag821 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_54_in_unsupportedFlag830 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_NAME_in_unsupportedFlag832 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_29_in_unsupportedFlag844 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_NAME_in_unsupportedFlag846 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_55_in_unsupportedFlag857 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_NAME_in_unsupportedFlag861 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_56_in_unsupportedFlag871 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_NAME_in_unsupportedFlag875 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_unsupportedFlag887 = new BitSet(new long[]{0x0000000000000060L});
	public static final BitSet FOLLOW_filter_in_unsupportedFlag891 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NAME_in_classpath913 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000006L});
	public static final BitSet FOLLOW_set_in_classpath916 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_classpath_in_classpath922 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nonEmptytFilter_in_filter943 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NEGATOR_in_nonEmptytFilter977 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_NAME_in_nonEmptytFilter983 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_11_in_nonEmptytFilter988 = new BitSet(new long[]{0x0000000000000060L});
	public static final BitSet FOLLOW_nonEmptytFilter_in_nonEmptytFilter990 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotation_in_classSpecification1020 = new BitSet(new long[]{0x0000000000000040L,0x00000000008AC240L});
	public static final BitSet FOLLOW_classModifierAndType_in_classSpecification1028 = new BitSet(new long[]{0x0000000000000060L});
	public static final BitSet FOLLOW_NEGATOR_in_classSpecification1034 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_NAME_in_classSpecification1040 = new BitSet(new long[]{0x0000000000000002L,0x0000000080050000L});
	public static final BitSet FOLLOW_inheritance_in_classSpecification1049 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
	public static final BitSet FOLLOW_members_in_classSpecification1057 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NEGATOR_in_classModifierAndType1086 = new BitSet(new long[]{0x0000000000000000L,0x00000000008AC240L});
	public static final BitSet FOLLOW_87_in_classModifierAndType1098 = new BitSet(new long[]{0x0000000000000040L,0x00000000008AC240L});
	public static final BitSet FOLLOW_classModifierAndType_in_classModifierAndType1104 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_73_in_classModifierAndType1113 = new BitSet(new long[]{0x0000000000000040L,0x00000000008AC240L});
	public static final BitSet FOLLOW_classModifierAndType_in_classModifierAndType1119 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_81_in_classModifierAndType1128 = new BitSet(new long[]{0x0000000000000040L,0x00000000008AC240L});
	public static final BitSet FOLLOW_classModifierAndType_in_classModifierAndType1134 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classType_in_classModifierAndType1143 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_70_in_classType1176 = new BitSet(new long[]{0x0000000000000000L,0x000000000008C000L});
	public static final BitSet FOLLOW_83_in_classType1185 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_79_in_classType1193 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_78_in_classType1201 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_95_in_members1224 = new BitSet(new long[]{0x0000000000000160L,0x000000017FF22278L});
	public static final BitSet FOLLOW_member_in_members1230 = new BitSet(new long[]{0x0000000000000160L,0x000000017FF22278L});
	public static final BitSet FOLLOW_96_in_members1236 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotation_in_member1257 = new BitSet(new long[]{0x0000000000000160L,0x000000007FF22238L});
	public static final BitSet FOLLOW_modifiers_in_member1260 = new BitSet(new long[]{0x0000000000000120L,0x0000000000000038L});
	public static final BitSet FOLLOW_type_in_member1277 = new BitSet(new long[]{0x0000000000000020L,0x0000000000000010L});
	public static final BitSet FOLLOW_set_in_member1283 = new BitSet(new long[]{0x0000000000000200L,0x0000000000000004L});
	public static final BitSet FOLLOW_arguments_in_member1292 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_69_in_member1327 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_67_in_member1339 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_66_in_member1349 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_70_in_annotation1373 = new BitSet(new long[]{0x0000000000000060L});
	public static final BitSet FOLLOW_NEGATOR_in_annotation1376 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_NAME_in_annotation1382 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_modifier_in_modifiers1406 = new BitSet(new long[]{0x0000000000000042L,0x000000007FF22200L});
	public static final BitSet FOLLOW_NEGATOR_in_modifier1432 = new BitSet(new long[]{0x0000000000000000L,0x000000007FF22200L});
	public static final BitSet FOLLOW_87_in_modifier1446 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_85_in_modifier1456 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_86_in_modifier1466 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_88_in_modifier1476 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_90_in_modifier1486 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_94_in_modifier1496 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_84_in_modifier1506 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_73_in_modifier1516 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_89_in_modifier1526 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_81_in_modifier1536 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_92_in_modifier1546 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_91_in_modifier1556 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_modifier1566 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_93_in_modifier1576 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_inheritance1607 = new BitSet(new long[]{0x0000000000000060L,0x0000000000000040L});
	public static final BitSet FOLLOW_annotation_in_inheritance1617 = new BitSet(new long[]{0x0000000000000060L});
	public static final BitSet FOLLOW_NEGATOR_in_inheritance1621 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_NAME_in_inheritance1627 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_9_in_arguments1647 = new BitSet(new long[]{0x0000000000000520L});
	public static final BitSet FOLLOW_type_in_arguments1675 = new BitSet(new long[]{0x0000000000000C00L});
	public static final BitSet FOLLOW_11_in_arguments1688 = new BitSet(new long[]{0x0000000000000120L});
	public static final BitSet FOLLOW_type_in_arguments1692 = new BitSet(new long[]{0x0000000000000C00L});
	public static final BitSet FOLLOW_10_in_arguments1721 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_8_in_type1757 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NAME_in_type1774 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
	public static final BitSet FOLLOW_71_in_type1777 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
	public static final BitSet FOLLOW_11_in_keepOptionModifier1808 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001C00L});
	public static final BitSet FOLLOW_76_in_keepOptionModifier1813 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_75_in_keepOptionModifier1821 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_74_in_keepOptionModifier1828 = new BitSet(new long[]{0x0000000000000002L});
}

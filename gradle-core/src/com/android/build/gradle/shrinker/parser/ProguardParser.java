// $ANTLR 3.5.2 /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g 2015-12-11 18:13:21

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
	@Override public String getGrammarFileName() { return "/usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g"; }



	// $ANTLR start "prog"
	// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:20:1: prog[Flags flags, String baseDirectory] : ( ( '-basedirectory' baseDir= NAME ) | ( '-include' | '@' ) proguardFile= NAME | ( '-keepclassmembers' (keepModifier= keepOptionModifier )? classSpec= classSpecification ) | ( '-keepclasseswithmembers' (keepModifier= keepOptionModifier )? classSpec= classSpecification ) | ( '-keep' (keepModifier= keepOptionModifier )? classSpec= classSpecification ) | (igFlag= ignoredFlag ) | (nopFlag= noOpFlag ) | (unFlag= unsupportedFlag ) | ( '-dontwarn' filter[class_filter] ) | ( '-ignorewarnings' ) )* EOF ;
	public final void prog(Flags flags, String baseDirectory) throws RecognitionException {
		Token baseDir=null;
		Token proguardFile=null;
		KeepModifier keepModifier =null;
		ClassSpecification classSpec =null;
		ParserRuleReturnScope igFlag =null;
		ParserRuleReturnScope nopFlag =null;
		ParserRuleReturnScope unFlag =null;

		try {
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:21:3: ( ( ( '-basedirectory' baseDir= NAME ) | ( '-include' | '@' ) proguardFile= NAME | ( '-keepclassmembers' (keepModifier= keepOptionModifier )? classSpec= classSpecification ) | ( '-keepclasseswithmembers' (keepModifier= keepOptionModifier )? classSpec= classSpecification ) | ( '-keep' (keepModifier= keepOptionModifier )? classSpec= classSpecification ) | (igFlag= ignoredFlag ) | (nopFlag= noOpFlag ) | (unFlag= unsupportedFlag ) | ( '-dontwarn' filter[class_filter] ) | ( '-ignorewarnings' ) )* EOF )
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:22:3: ( ( '-basedirectory' baseDir= NAME ) | ( '-include' | '@' ) proguardFile= NAME | ( '-keepclassmembers' (keepModifier= keepOptionModifier )? classSpec= classSpecification ) | ( '-keepclasseswithmembers' (keepModifier= keepOptionModifier )? classSpec= classSpecification ) | ( '-keep' (keepModifier= keepOptionModifier )? classSpec= classSpecification ) | (igFlag= ignoredFlag ) | (nopFlag= noOpFlag ) | (unFlag= unsupportedFlag ) | ( '-dontwarn' filter[class_filter] ) | ( '-ignorewarnings' ) )* EOF
			{
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:22:3: ( ( '-basedirectory' baseDir= NAME ) | ( '-include' | '@' ) proguardFile= NAME | ( '-keepclassmembers' (keepModifier= keepOptionModifier )? classSpec= classSpecification ) | ( '-keepclasseswithmembers' (keepModifier= keepOptionModifier )? classSpec= classSpecification ) | ( '-keep' (keepModifier= keepOptionModifier )? classSpec= classSpecification ) | (igFlag= ignoredFlag ) | (nopFlag= noOpFlag ) | (unFlag= unsupportedFlag ) | ( '-dontwarn' filter[class_filter] ) | ( '-ignorewarnings' ) )*
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
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:23:5: ( '-basedirectory' baseDir= NAME )
					{
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:23:5: ( '-basedirectory' baseDir= NAME )
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:23:6: '-basedirectory' baseDir= NAME
					{
					match(input,18,FOLLOW_18_in_prog66); 
					baseDir=(Token)match(input,NAME,FOLLOW_NAME_in_prog70); 
					baseDirectory=(baseDir!=null?baseDir.getText():null);
					}

					}
					break;
				case 2 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:24:7: ( '-include' | '@' ) proguardFile= NAME
					{
					if ( input.LA(1)==33||input.LA(1)==70 ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					proguardFile=(Token)match(input,NAME,FOLLOW_NAME_in_prog89); 
					GrammarActions.parse((proguardFile!=null?proguardFile.getText():null), baseDirectory, flags);
					}
					break;
				case 3 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:25:7: ( '-keepclassmembers' (keepModifier= keepOptionModifier )? classSpec= classSpecification )
					{
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:25:7: ( '-keepclassmembers' (keepModifier= keepOptionModifier )? classSpec= classSpecification )
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:25:8: '-keepclassmembers' (keepModifier= keepOptionModifier )? classSpec= classSpecification
					{
					match(input,40,FOLLOW_40_in_prog100); 
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:25:40: (keepModifier= keepOptionModifier )?
					int alt1=2;
					int LA1_0 = input.LA(1);
					if ( (LA1_0==11) ) {
						alt1=1;
					}
					switch (alt1) {
						case 1 :
							// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:25:40: keepModifier= keepOptionModifier
							{
							pushFollow(FOLLOW_keepOptionModifier_in_prog104);
							keepModifier=keepOptionModifier();
							state._fsp--;

							}
							break;

					}

					pushFollow(FOLLOW_classSpecification_in_prog109);
					classSpec=classSpecification();
					state._fsp--;

					GrammarActions.addKeepClassMembers(flags, classSpec, keepModifier);
					}

					}
					break;
				case 4 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:26:7: ( '-keepclasseswithmembers' (keepModifier= keepOptionModifier )? classSpec= classSpecification )
					{
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:26:7: ( '-keepclasseswithmembers' (keepModifier= keepOptionModifier )? classSpec= classSpecification )
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:26:8: '-keepclasseswithmembers' (keepModifier= keepOptionModifier )? classSpec= classSpecification
					{
					match(input,38,FOLLOW_38_in_prog121); 
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:26:46: (keepModifier= keepOptionModifier )?
					int alt2=2;
					int LA2_0 = input.LA(1);
					if ( (LA2_0==11) ) {
						alt2=1;
					}
					switch (alt2) {
						case 1 :
							// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:26:46: keepModifier= keepOptionModifier
							{
							pushFollow(FOLLOW_keepOptionModifier_in_prog125);
							keepModifier=keepOptionModifier();
							state._fsp--;

							}
							break;

					}

					pushFollow(FOLLOW_classSpecification_in_prog130);
					classSpec=classSpecification();
					state._fsp--;

					GrammarActions.addKeepClassesWithMembers(flags, classSpec, keepModifier);
					}

					}
					break;
				case 5 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:27:7: ( '-keep' (keepModifier= keepOptionModifier )? classSpec= classSpecification )
					{
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:27:7: ( '-keep' (keepModifier= keepOptionModifier )? classSpec= classSpecification )
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:27:8: '-keep' (keepModifier= keepOptionModifier )? classSpec= classSpecification
					{
					match(input,35,FOLLOW_35_in_prog142); 
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:27:28: (keepModifier= keepOptionModifier )?
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0==11) ) {
						alt3=1;
					}
					switch (alt3) {
						case 1 :
							// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:27:28: keepModifier= keepOptionModifier
							{
							pushFollow(FOLLOW_keepOptionModifier_in_prog146);
							keepModifier=keepOptionModifier();
							state._fsp--;

							}
							break;

					}

					pushFollow(FOLLOW_classSpecification_in_prog151);
					classSpec=classSpecification();
					state._fsp--;

					GrammarActions.addKeepClassSpecification(flags, classSpec, keepModifier);
					}

					}
					break;
				case 6 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:28:7: (igFlag= ignoredFlag )
					{
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:28:7: (igFlag= ignoredFlag )
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:28:8: igFlag= ignoredFlag
					{
					pushFollow(FOLLOW_ignoredFlag_in_prog165);
					igFlag=ignoredFlag();
					state._fsp--;

					GrammarActions.ignoredFlag((igFlag!=null?input.toString(igFlag.start,igFlag.stop):null), true);
					}

					}
					break;
				case 7 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:29:7: (nopFlag= noOpFlag )
					{
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:29:7: (nopFlag= noOpFlag )
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:29:8: nopFlag= noOpFlag
					{
					pushFollow(FOLLOW_noOpFlag_in_prog179);
					nopFlag=noOpFlag();
					state._fsp--;

					GrammarActions.ignoredFlag((nopFlag!=null?input.toString(nopFlag.start,nopFlag.stop):null), false);
					}

					}
					break;
				case 8 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:30:7: (unFlag= unsupportedFlag )
					{
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:30:7: (unFlag= unsupportedFlag )
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:30:8: unFlag= unsupportedFlag
					{
					pushFollow(FOLLOW_unsupportedFlag_in_prog193);
					unFlag=unsupportedFlag();
					state._fsp--;

					GrammarActions.unsupportedFlag((unFlag!=null?input.toString(unFlag.start,unFlag.stop):null));
					}

					}
					break;
				case 9 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:31:7: ( '-dontwarn' filter[class_filter] )
					{
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:31:7: ( '-dontwarn' filter[class_filter] )
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:31:8: '-dontwarn' filter[class_filter]
					{
					match(input,28,FOLLOW_28_in_prog205); 
					FilterSpecification class_filter = new FilterSpecification();
					pushFollow(FOLLOW_filter_in_prog209);
					filter(class_filter);
					state._fsp--;

					GrammarActions.dontWarn(flags, class_filter);
					}

					}
					break;
				case 10 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:32:7: ( '-ignorewarnings' )
					{
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:32:7: ( '-ignorewarnings' )
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:32:8: '-ignorewarnings'
					{
					match(input,32,FOLLOW_32_in_prog222); 
					GrammarActions.ignoreWarnings(flags);
					}

					}
					break;

				default :
					break loop4;
				}
			}

			match(input,EOF,FOLLOW_EOF_in_prog234); 
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
	// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:40:9: private noOpFlag : ( '-verbose' | ( '-dontnote' filter[class_filter] ) | '-dontusemixedcaseclassnames' | '-dontskipnonpubliclibraryclasses' | '-dontskipnonpubliclibraryclassmembers' | '-skipnonpubliclibraryclasses' | '-keepparameternames' | ( '-keepnames' classSpec= classSpecification ) | ( '-keepclassmembernames' classSpec= classSpecification ) | ( '-keepclasseswithmembernames' classSpec= classSpecification ) | ( '-keepattributes' filter[attribute_filter] ) | ( '-keeppackagenames' filter[package_filter] ) | ( '-dontshrink' ) | ( '-dontoptimize' ) | ( '-dontpreverify' ) | ( '-dontobfuscate' ) ) ;
	public final ProguardParser.noOpFlag_return noOpFlag() throws RecognitionException {
		ProguardParser.noOpFlag_return retval = new ProguardParser.noOpFlag_return();
		retval.start = input.LT(1);

		ClassSpecification classSpec =null;

		try {
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:41:3: ( ( '-verbose' | ( '-dontnote' filter[class_filter] ) | '-dontusemixedcaseclassnames' | '-dontskipnonpubliclibraryclasses' | '-dontskipnonpubliclibraryclassmembers' | '-skipnonpubliclibraryclasses' | '-keepparameternames' | ( '-keepnames' classSpec= classSpecification ) | ( '-keepclassmembernames' classSpec= classSpecification ) | ( '-keepclasseswithmembernames' classSpec= classSpecification ) | ( '-keepattributes' filter[attribute_filter] ) | ( '-keeppackagenames' filter[package_filter] ) | ( '-dontshrink' ) | ( '-dontoptimize' ) | ( '-dontpreverify' ) | ( '-dontobfuscate' ) ) )
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:42:3: ( '-verbose' | ( '-dontnote' filter[class_filter] ) | '-dontusemixedcaseclassnames' | '-dontskipnonpubliclibraryclasses' | '-dontskipnonpubliclibraryclassmembers' | '-skipnonpubliclibraryclasses' | '-keepparameternames' | ( '-keepnames' classSpec= classSpecification ) | ( '-keepclassmembernames' classSpec= classSpecification ) | ( '-keepclasseswithmembernames' classSpec= classSpecification ) | ( '-keepattributes' filter[attribute_filter] ) | ( '-keeppackagenames' filter[package_filter] ) | ( '-dontshrink' ) | ( '-dontoptimize' ) | ( '-dontpreverify' ) | ( '-dontobfuscate' ) )
			{
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:42:3: ( '-verbose' | ( '-dontnote' filter[class_filter] ) | '-dontusemixedcaseclassnames' | '-dontskipnonpubliclibraryclasses' | '-dontskipnonpubliclibraryclassmembers' | '-skipnonpubliclibraryclasses' | '-keepparameternames' | ( '-keepnames' classSpec= classSpecification ) | ( '-keepclassmembernames' classSpec= classSpecification ) | ( '-keepclasseswithmembernames' classSpec= classSpecification ) | ( '-keepattributes' filter[attribute_filter] ) | ( '-keeppackagenames' filter[package_filter] ) | ( '-dontshrink' ) | ( '-dontoptimize' ) | ( '-dontpreverify' ) | ( '-dontobfuscate' ) )
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
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:42:7: '-verbose'
					{
					match(input,63,FOLLOW_63_in_noOpFlag263); 
					}
					break;
				case 2 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:44:7: ( '-dontnote' filter[class_filter] )
					{
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:44:7: ( '-dontnote' filter[class_filter] )
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:44:8: '-dontnote' filter[class_filter]
					{
					match(input,20,FOLLOW_20_in_noOpFlag277); 
					FilterSpecification class_filter = new FilterSpecification();
					pushFollow(FOLLOW_filter_in_noOpFlag281);
					filter(class_filter);
					state._fsp--;

					}

					}
					break;
				case 3 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:46:7: '-dontusemixedcaseclassnames'
					{
					match(input,27,FOLLOW_27_in_noOpFlag296); 
					}
					break;
				case 4 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:47:7: '-dontskipnonpubliclibraryclasses'
					{
					match(input,25,FOLLOW_25_in_noOpFlag304); 
					}
					break;
				case 5 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:48:7: '-dontskipnonpubliclibraryclassmembers'
					{
					match(input,26,FOLLOW_26_in_noOpFlag312); 
					}
					break;
				case 6 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:49:7: '-skipnonpubliclibraryclasses'
					{
					match(input,60,FOLLOW_60_in_noOpFlag320); 
					}
					break;
				case 7 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:51:7: '-keepparameternames'
					{
					match(input,44,FOLLOW_44_in_noOpFlag333); 
					}
					break;
				case 8 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:52:7: ( '-keepnames' classSpec= classSpecification )
					{
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:52:7: ( '-keepnames' classSpec= classSpecification )
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:52:8: '-keepnames' classSpec= classSpecification
					{
					match(input,42,FOLLOW_42_in_noOpFlag342); 
					pushFollow(FOLLOW_classSpecification_in_noOpFlag346);
					classSpec=classSpecification();
					state._fsp--;

					}

					}
					break;
				case 9 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:53:7: ( '-keepclassmembernames' classSpec= classSpecification )
					{
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:53:7: ( '-keepclassmembernames' classSpec= classSpecification )
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:53:8: '-keepclassmembernames' classSpec= classSpecification
					{
					match(input,39,FOLLOW_39_in_noOpFlag357); 
					pushFollow(FOLLOW_classSpecification_in_noOpFlag361);
					classSpec=classSpecification();
					state._fsp--;

					}

					}
					break;
				case 10 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:54:7: ( '-keepclasseswithmembernames' classSpec= classSpecification )
					{
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:54:7: ( '-keepclasseswithmembernames' classSpec= classSpecification )
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:54:8: '-keepclasseswithmembernames' classSpec= classSpecification
					{
					match(input,37,FOLLOW_37_in_noOpFlag373); 
					pushFollow(FOLLOW_classSpecification_in_noOpFlag377);
					classSpec=classSpecification();
					state._fsp--;

					}

					}
					break;
				case 11 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:55:7: ( '-keepattributes' filter[attribute_filter] )
					{
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:55:7: ( '-keepattributes' filter[attribute_filter] )
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:55:8: '-keepattributes' filter[attribute_filter]
					{
					match(input,36,FOLLOW_36_in_noOpFlag389); 
					FilterSpecification attribute_filter = new FilterSpecification();
					pushFollow(FOLLOW_filter_in_noOpFlag393);
					filter(attribute_filter);
					state._fsp--;

					}

					}
					break;
				case 12 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:56:7: ( '-keeppackagenames' filter[package_filter] )
					{
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:56:7: ( '-keeppackagenames' filter[package_filter] )
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:56:8: '-keeppackagenames' filter[package_filter]
					{
					match(input,43,FOLLOW_43_in_noOpFlag405); 
					FilterSpecification package_filter = new FilterSpecification();
					pushFollow(FOLLOW_filter_in_noOpFlag409);
					filter(package_filter);
					state._fsp--;

					}

					}
					break;
				case 13 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:57:7: ( '-dontshrink' )
					{
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:57:7: ( '-dontshrink' )
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:57:8: '-dontshrink'
					{
					match(input,24,FOLLOW_24_in_noOpFlag421); 
					}

					}
					break;
				case 14 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:58:7: ( '-dontoptimize' )
					{
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:58:7: ( '-dontoptimize' )
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:58:8: '-dontoptimize'
					{
					match(input,22,FOLLOW_22_in_noOpFlag432); 
					}

					}
					break;
				case 15 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:59:7: ( '-dontpreverify' )
					{
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:59:7: ( '-dontpreverify' )
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:59:8: '-dontpreverify'
					{
					match(input,23,FOLLOW_23_in_noOpFlag444); 
					}

					}
					break;
				case 16 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:60:7: ( '-dontobfuscate' )
					{
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:60:7: ( '-dontobfuscate' )
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:60:8: '-dontobfuscate'
					{
					match(input,21,FOLLOW_21_in_noOpFlag456); 
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
	// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:64:9: private ignoredFlag : ( ( '-optimizations' filter[optimization_filter] ) | '-useuniqueclassmembernames' | '-allowaccessmodification' | ( '-optimizationpasses' NAME ) | ( '-assumenosideeffects' classSpecification ) | '-mergeinterfacesaggressively' | '-overloadaggressively' | ( '-renamesourcefileattribute' (sourceFile= NAME )? ) | ( '-adaptclassstrings' filter[filter] ) | ( '-applymapping' mapping= NAME ) | '-obfuscationdictionary' obfuscationDictionary= NAME | '-classobfuscationdictionary' classObfuscationDictionary= NAME | '-packageobfuscationdictionary' packageObfuscationDictionary= NAME | ( '-repackageclasses' ( '\\'' (newPackage= NAME )? '\\'' )? ) | ( '-flattenpackagehierarchy' ( '\\'' (newPackage= NAME )? '\\'' )? ) | ( '-adaptresourcefilenames' filter[file_filter] ) | ( '-adaptresourcefilecontents' filter[file_filter] ) ) ;
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
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:65:3: ( ( ( '-optimizations' filter[optimization_filter] ) | '-useuniqueclassmembernames' | '-allowaccessmodification' | ( '-optimizationpasses' NAME ) | ( '-assumenosideeffects' classSpecification ) | '-mergeinterfacesaggressively' | '-overloadaggressively' | ( '-renamesourcefileattribute' (sourceFile= NAME )? ) | ( '-adaptclassstrings' filter[filter] ) | ( '-applymapping' mapping= NAME ) | '-obfuscationdictionary' obfuscationDictionary= NAME | '-classobfuscationdictionary' classObfuscationDictionary= NAME | '-packageobfuscationdictionary' packageObfuscationDictionary= NAME | ( '-repackageclasses' ( '\\'' (newPackage= NAME )? '\\'' )? ) | ( '-flattenpackagehierarchy' ( '\\'' (newPackage= NAME )? '\\'' )? ) | ( '-adaptresourcefilenames' filter[file_filter] ) | ( '-adaptresourcefilecontents' filter[file_filter] ) ) )
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:66:3: ( ( '-optimizations' filter[optimization_filter] ) | '-useuniqueclassmembernames' | '-allowaccessmodification' | ( '-optimizationpasses' NAME ) | ( '-assumenosideeffects' classSpecification ) | '-mergeinterfacesaggressively' | '-overloadaggressively' | ( '-renamesourcefileattribute' (sourceFile= NAME )? ) | ( '-adaptclassstrings' filter[filter] ) | ( '-applymapping' mapping= NAME ) | '-obfuscationdictionary' obfuscationDictionary= NAME | '-classobfuscationdictionary' classObfuscationDictionary= NAME | '-packageobfuscationdictionary' packageObfuscationDictionary= NAME | ( '-repackageclasses' ( '\\'' (newPackage= NAME )? '\\'' )? ) | ( '-flattenpackagehierarchy' ( '\\'' (newPackage= NAME )? '\\'' )? ) | ( '-adaptresourcefilenames' filter[file_filter] ) | ( '-adaptresourcefilecontents' filter[file_filter] ) )
			{
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:66:3: ( ( '-optimizations' filter[optimization_filter] ) | '-useuniqueclassmembernames' | '-allowaccessmodification' | ( '-optimizationpasses' NAME ) | ( '-assumenosideeffects' classSpecification ) | '-mergeinterfacesaggressively' | '-overloadaggressively' | ( '-renamesourcefileattribute' (sourceFile= NAME )? ) | ( '-adaptclassstrings' filter[filter] ) | ( '-applymapping' mapping= NAME ) | '-obfuscationdictionary' obfuscationDictionary= NAME | '-classobfuscationdictionary' classObfuscationDictionary= NAME | '-packageobfuscationdictionary' packageObfuscationDictionary= NAME | ( '-repackageclasses' ( '\\'' (newPackage= NAME )? '\\'' )? ) | ( '-flattenpackagehierarchy' ( '\\'' (newPackage= NAME )? '\\'' )? ) | ( '-adaptresourcefilenames' filter[file_filter] ) | ( '-adaptresourcefilecontents' filter[file_filter] ) )
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
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:66:7: ( '-optimizations' filter[optimization_filter] )
					{
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:66:7: ( '-optimizations' filter[optimization_filter] )
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:66:8: '-optimizations' filter[optimization_filter]
					{
					match(input,50,FOLLOW_50_in_ignoredFlag484); 
					FilterSpecification optimization_filter = new FilterSpecification();
					pushFollow(FOLLOW_filter_in_ignoredFlag488);
					filter(optimization_filter);
					state._fsp--;

					}

					}
					break;
				case 2 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:67:7: '-useuniqueclassmembernames'
					{
					match(input,62,FOLLOW_62_in_ignoredFlag498); 
					}
					break;
				case 3 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:68:7: '-allowaccessmodification'
					{
					match(input,15,FOLLOW_15_in_ignoredFlag506); 
					}
					break;
				case 4 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:69:7: ( '-optimizationpasses' NAME )
					{
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:69:7: ( '-optimizationpasses' NAME )
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:69:8: '-optimizationpasses' NAME
					{
					match(input,49,FOLLOW_49_in_ignoredFlag515); 
					match(input,NAME,FOLLOW_NAME_in_ignoredFlag517); 
					}

					}
					break;
				case 5 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:70:7: ( '-assumenosideeffects' classSpecification )
					{
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:70:7: ( '-assumenosideeffects' classSpecification )
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:70:8: '-assumenosideeffects' classSpecification
					{
					match(input,17,FOLLOW_17_in_ignoredFlag528); 
					pushFollow(FOLLOW_classSpecification_in_ignoredFlag530);
					classSpecification();
					state._fsp--;

					}

					}
					break;
				case 6 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:71:7: '-mergeinterfacesaggressively'
					{
					match(input,46,FOLLOW_46_in_ignoredFlag539); 
					}
					break;
				case 7 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:72:7: '-overloadaggressively'
					{
					match(input,52,FOLLOW_52_in_ignoredFlag547); 
					}
					break;
				case 8 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:73:7: ( '-renamesourcefileattribute' (sourceFile= NAME )? )
					{
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:73:7: ( '-renamesourcefileattribute' (sourceFile= NAME )? )
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:73:8: '-renamesourcefileattribute' (sourceFile= NAME )?
					{
					match(input,58,FOLLOW_58_in_ignoredFlag556); 
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:73:47: (sourceFile= NAME )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==NAME) ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:73:47: sourceFile= NAME
							{
							sourceFile=(Token)match(input,NAME,FOLLOW_NAME_in_ignoredFlag560); 
							}
							break;

					}

					}

					}
					break;
				case 9 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:74:7: ( '-adaptclassstrings' filter[filter] )
					{
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:74:7: ( '-adaptclassstrings' filter[filter] )
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:74:8: '-adaptclassstrings' filter[filter]
					{
					match(input,12,FOLLOW_12_in_ignoredFlag571); 
					FilterSpecification filter = new FilterSpecification();
					pushFollow(FOLLOW_filter_in_ignoredFlag575);
					filter(filter);
					state._fsp--;

					}

					}
					break;
				case 10 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:75:7: ( '-applymapping' mapping= NAME )
					{
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:75:7: ( '-applymapping' mapping= NAME )
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:75:8: '-applymapping' mapping= NAME
					{
					match(input,16,FOLLOW_16_in_ignoredFlag586); 
					mapping=(Token)match(input,NAME,FOLLOW_NAME_in_ignoredFlag590); 
					}

					}
					break;
				case 11 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:76:7: '-obfuscationdictionary' obfuscationDictionary= NAME
					{
					match(input,48,FOLLOW_48_in_ignoredFlag600); 
					obfuscationDictionary=(Token)match(input,NAME,FOLLOW_NAME_in_ignoredFlag604); 
					}
					break;
				case 12 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:77:7: '-classobfuscationdictionary' classObfuscationDictionary= NAME
					{
					match(input,19,FOLLOW_19_in_ignoredFlag612); 
					classObfuscationDictionary=(Token)match(input,NAME,FOLLOW_NAME_in_ignoredFlag616); 
					}
					break;
				case 13 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:78:7: '-packageobfuscationdictionary' packageObfuscationDictionary= NAME
					{
					match(input,53,FOLLOW_53_in_ignoredFlag624); 
					packageObfuscationDictionary=(Token)match(input,NAME,FOLLOW_NAME_in_ignoredFlag628); 
					}
					break;
				case 14 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:79:7: ( '-repackageclasses' ( '\\'' (newPackage= NAME )? '\\'' )? )
					{
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:79:7: ( '-repackageclasses' ( '\\'' (newPackage= NAME )? '\\'' )? )
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:79:8: '-repackageclasses' ( '\\'' (newPackage= NAME )? '\\'' )?
					{
					match(input,59,FOLLOW_59_in_ignoredFlag637); 
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:79:28: ( '\\'' (newPackage= NAME )? '\\'' )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==72) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:79:29: '\\'' (newPackage= NAME )? '\\''
							{
							match(input,72,FOLLOW_72_in_ignoredFlag640); 
							// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:79:44: (newPackage= NAME )?
							int alt7=2;
							int LA7_0 = input.LA(1);
							if ( (LA7_0==NAME) ) {
								alt7=1;
							}
							switch (alt7) {
								case 1 :
									// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:79:44: newPackage= NAME
									{
									newPackage=(Token)match(input,NAME,FOLLOW_NAME_in_ignoredFlag644); 
									}
									break;

							}

							match(input,72,FOLLOW_72_in_ignoredFlag647); 
							}
							break;

					}

					}

					}
					break;
				case 15 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:80:7: ( '-flattenpackagehierarchy' ( '\\'' (newPackage= NAME )? '\\'' )? )
					{
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:80:7: ( '-flattenpackagehierarchy' ( '\\'' (newPackage= NAME )? '\\'' )? )
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:80:8: '-flattenpackagehierarchy' ( '\\'' (newPackage= NAME )? '\\'' )?
					{
					match(input,30,FOLLOW_30_in_ignoredFlag660); 
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:80:35: ( '\\'' (newPackage= NAME )? '\\'' )?
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0==72) ) {
						alt10=1;
					}
					switch (alt10) {
						case 1 :
							// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:80:36: '\\'' (newPackage= NAME )? '\\''
							{
							match(input,72,FOLLOW_72_in_ignoredFlag663); 
							// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:80:51: (newPackage= NAME )?
							int alt9=2;
							int LA9_0 = input.LA(1);
							if ( (LA9_0==NAME) ) {
								alt9=1;
							}
							switch (alt9) {
								case 1 :
									// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:80:51: newPackage= NAME
									{
									newPackage=(Token)match(input,NAME,FOLLOW_NAME_in_ignoredFlag667); 
									}
									break;

							}

							match(input,72,FOLLOW_72_in_ignoredFlag670); 
							}
							break;

					}

					}

					}
					break;
				case 16 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:81:7: ( '-adaptresourcefilenames' filter[file_filter] )
					{
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:81:7: ( '-adaptresourcefilenames' filter[file_filter] )
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:81:8: '-adaptresourcefilenames' filter[file_filter]
					{
					match(input,14,FOLLOW_14_in_ignoredFlag683); 
					FilterSpecification file_filter = new FilterSpecification();
					pushFollow(FOLLOW_filter_in_ignoredFlag687);
					filter(file_filter);
					state._fsp--;

					}

					}
					break;
				case 17 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:82:7: ( '-adaptresourcefilecontents' filter[file_filter] )
					{
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:82:7: ( '-adaptresourcefilecontents' filter[file_filter] )
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:82:8: '-adaptresourcefilecontents' filter[file_filter]
					{
					match(input,13,FOLLOW_13_in_ignoredFlag699); 
					FilterSpecification file_filter = new FilterSpecification();
					pushFollow(FOLLOW_filter_in_ignoredFlag703);
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
	// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:86:9: private unsupportedFlag : ( '-injars' inJars= classpath | '-outjars' outJars= classpath | '-libraryjars' libraryJars= classpath | ( '-target' NAME ) | '-forceprocessing' | ( '-printusage' NAME ) | ( '-whyareyoukeeping' classSpecification ) | '-microedition' | ( '-printconfiguration' ( NAME )? ) | ( '-dump' ( NAME )? ) | '-printmapping' (outputMapping= NAME )? | ( '-printseeds' (seedOutputFile= NAME )? ) | ( '-keepdirectories' filter[directory_filter] ) ) ;
	public final ProguardParser.unsupportedFlag_return unsupportedFlag() throws RecognitionException {
		ProguardParser.unsupportedFlag_return retval = new ProguardParser.unsupportedFlag_return();
		retval.start = input.LT(1);

		Token outputMapping=null;
		Token seedOutputFile=null;

		try {
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:87:3: ( ( '-injars' inJars= classpath | '-outjars' outJars= classpath | '-libraryjars' libraryJars= classpath | ( '-target' NAME ) | '-forceprocessing' | ( '-printusage' NAME ) | ( '-whyareyoukeeping' classSpecification ) | '-microedition' | ( '-printconfiguration' ( NAME )? ) | ( '-dump' ( NAME )? ) | '-printmapping' (outputMapping= NAME )? | ( '-printseeds' (seedOutputFile= NAME )? ) | ( '-keepdirectories' filter[directory_filter] ) ) )
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:88:3: ( '-injars' inJars= classpath | '-outjars' outJars= classpath | '-libraryjars' libraryJars= classpath | ( '-target' NAME ) | '-forceprocessing' | ( '-printusage' NAME ) | ( '-whyareyoukeeping' classSpecification ) | '-microedition' | ( '-printconfiguration' ( NAME )? ) | ( '-dump' ( NAME )? ) | '-printmapping' (outputMapping= NAME )? | ( '-printseeds' (seedOutputFile= NAME )? ) | ( '-keepdirectories' filter[directory_filter] ) )
			{
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:88:3: ( '-injars' inJars= classpath | '-outjars' outJars= classpath | '-libraryjars' libraryJars= classpath | ( '-target' NAME ) | '-forceprocessing' | ( '-printusage' NAME ) | ( '-whyareyoukeeping' classSpecification ) | '-microedition' | ( '-printconfiguration' ( NAME )? ) | ( '-dump' ( NAME )? ) | '-printmapping' (outputMapping= NAME )? | ( '-printseeds' (seedOutputFile= NAME )? ) | ( '-keepdirectories' filter[directory_filter] ) )
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
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:88:5: '-injars' inJars= classpath
					{
					match(input,34,FOLLOW_34_in_unsupportedFlag729); 
					pushFollow(FOLLOW_classpath_in_unsupportedFlag733);
					classpath();
					state._fsp--;

					}
					break;
				case 2 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:89:7: '-outjars' outJars= classpath
					{
					match(input,51,FOLLOW_51_in_unsupportedFlag741); 
					pushFollow(FOLLOW_classpath_in_unsupportedFlag745);
					classpath();
					state._fsp--;

					}
					break;
				case 3 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:90:7: '-libraryjars' libraryJars= classpath
					{
					match(input,45,FOLLOW_45_in_unsupportedFlag753); 
					pushFollow(FOLLOW_classpath_in_unsupportedFlag757);
					classpath();
					state._fsp--;

					}
					break;
				case 4 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:91:7: ( '-target' NAME )
					{
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:91:7: ( '-target' NAME )
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:91:8: '-target' NAME
					{
					match(input,61,FOLLOW_61_in_unsupportedFlag766); 
					match(input,NAME,FOLLOW_NAME_in_unsupportedFlag768); 
					}

					}
					break;
				case 5 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:92:7: '-forceprocessing'
					{
					match(input,31,FOLLOW_31_in_unsupportedFlag778); 
					}
					break;
				case 6 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:93:7: ( '-printusage' NAME )
					{
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:93:7: ( '-printusage' NAME )
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:93:8: '-printusage' NAME
					{
					match(input,57,FOLLOW_57_in_unsupportedFlag787); 
					match(input,NAME,FOLLOW_NAME_in_unsupportedFlag789); 
					}

					}
					break;
				case 7 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:94:7: ( '-whyareyoukeeping' classSpecification )
					{
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:94:7: ( '-whyareyoukeeping' classSpecification )
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:94:8: '-whyareyoukeeping' classSpecification
					{
					match(input,64,FOLLOW_64_in_unsupportedFlag800); 
					pushFollow(FOLLOW_classSpecification_in_unsupportedFlag802);
					classSpecification();
					state._fsp--;

					}

					}
					break;
				case 8 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:95:7: '-microedition'
					{
					match(input,47,FOLLOW_47_in_unsupportedFlag811); 
					}
					break;
				case 9 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:96:7: ( '-printconfiguration' ( NAME )? )
					{
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:96:7: ( '-printconfiguration' ( NAME )? )
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:96:8: '-printconfiguration' ( NAME )?
					{
					match(input,54,FOLLOW_54_in_unsupportedFlag820); 
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:96:30: ( NAME )?
					int alt12=2;
					int LA12_0 = input.LA(1);
					if ( (LA12_0==NAME) ) {
						alt12=1;
					}
					switch (alt12) {
						case 1 :
							// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:96:30: NAME
							{
							match(input,NAME,FOLLOW_NAME_in_unsupportedFlag822); 
							}
							break;

					}

					}

					}
					break;
				case 10 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:97:7: ( '-dump' ( NAME )? )
					{
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:97:7: ( '-dump' ( NAME )? )
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:97:8: '-dump' ( NAME )?
					{
					match(input,29,FOLLOW_29_in_unsupportedFlag834); 
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:97:16: ( NAME )?
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( (LA13_0==NAME) ) {
						alt13=1;
					}
					switch (alt13) {
						case 1 :
							// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:97:16: NAME
							{
							match(input,NAME,FOLLOW_NAME_in_unsupportedFlag836); 
							}
							break;

					}

					}

					}
					break;
				case 11 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:98:7: '-printmapping' (outputMapping= NAME )?
					{
					match(input,55,FOLLOW_55_in_unsupportedFlag847); 
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:98:36: (outputMapping= NAME )?
					int alt14=2;
					int LA14_0 = input.LA(1);
					if ( (LA14_0==NAME) ) {
						alt14=1;
					}
					switch (alt14) {
						case 1 :
							// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:98:36: outputMapping= NAME
							{
							outputMapping=(Token)match(input,NAME,FOLLOW_NAME_in_unsupportedFlag851); 
							}
							break;

					}

					}
					break;
				case 12 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:99:7: ( '-printseeds' (seedOutputFile= NAME )? )
					{
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:99:7: ( '-printseeds' (seedOutputFile= NAME )? )
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:99:8: '-printseeds' (seedOutputFile= NAME )?
					{
					match(input,56,FOLLOW_56_in_unsupportedFlag861); 
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:99:36: (seedOutputFile= NAME )?
					int alt15=2;
					int LA15_0 = input.LA(1);
					if ( (LA15_0==NAME) ) {
						alt15=1;
					}
					switch (alt15) {
						case 1 :
							// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:99:36: seedOutputFile= NAME
							{
							seedOutputFile=(Token)match(input,NAME,FOLLOW_NAME_in_unsupportedFlag865); 
							}
							break;

					}

					}

					}
					break;
				case 13 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:100:7: ( '-keepdirectories' filter[directory_filter] )
					{
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:100:7: ( '-keepdirectories' filter[directory_filter] )
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:100:8: '-keepdirectories' filter[directory_filter]
					{
					match(input,41,FOLLOW_41_in_unsupportedFlag877); 
					FilterSpecification directory_filter = new FilterSpecification();
					pushFollow(FOLLOW_filter_in_unsupportedFlag881);
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
	// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:104:9: private classpath : NAME ( ( ':' | ';' ) classpath )? ;
	public final void classpath() throws RecognitionException {
		try {
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:105:3: ( NAME ( ( ':' | ';' ) classpath )? )
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:105:6: NAME ( ( ':' | ';' ) classpath )?
			{
			match(input,NAME,FOLLOW_NAME_in_classpath903); 
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:105:11: ( ( ':' | ';' ) classpath )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( ((LA17_0 >= 65 && LA17_0 <= 66)) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:105:12: ( ':' | ';' ) classpath
					{
					if ( (input.LA(1) >= 65 && input.LA(1) <= 66) ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_classpath_in_classpath912);
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
	// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:108:9: private filter[FilterSpecification filter] : ( nonEmptytFilter[filter] |);
	public final void filter(FilterSpecification filter) throws RecognitionException {
		try {
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:109:3: ( nonEmptytFilter[filter] |)
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
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:110:3: nonEmptytFilter[filter]
					{
					pushFollow(FOLLOW_nonEmptytFilter_in_filter933);
					nonEmptytFilter(filter);
					state._fsp--;

					}
					break;
				case 2 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:111:5: 
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
	// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:115:9: private nonEmptytFilter[FilterSpecification filter] : ( ( NEGATOR )? NAME ( ',' nonEmptytFilter[filter] )? ) ;
	public final void nonEmptytFilter(FilterSpecification filter) throws RecognitionException {
		Token NAME1=null;


		  boolean negator = false;

		try {
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:119:3: ( ( ( NEGATOR )? NAME ( ',' nonEmptytFilter[filter] )? ) )
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:120:3: ( ( NEGATOR )? NAME ( ',' nonEmptytFilter[filter] )? )
			{
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:120:3: ( ( NEGATOR )? NAME ( ',' nonEmptytFilter[filter] )? )
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:120:4: ( NEGATOR )? NAME ( ',' nonEmptytFilter[filter] )?
			{
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:120:4: ( NEGATOR )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==NEGATOR) ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:120:5: NEGATOR
					{
					match(input,NEGATOR,FOLLOW_NEGATOR_in_nonEmptytFilter967); 
					negator=true;
					}
					break;

			}

			NAME1=(Token)match(input,NAME,FOLLOW_NAME_in_nonEmptytFilter973); 
			GrammarActions.filter(filter, negator, (NAME1!=null?NAME1.getText():null));
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:120:91: ( ',' nonEmptytFilter[filter] )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==11) ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:120:92: ',' nonEmptytFilter[filter]
					{
					match(input,11,FOLLOW_11_in_nonEmptytFilter978); 
					pushFollow(FOLLOW_nonEmptytFilter_in_nonEmptytFilter980);
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
	// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:123:9: private classSpecification returns [ClassSpecification classSpec] : ( annotation )? cType= classModifierAndType[modifier] ( NEGATOR )? NAME (inheritanceSpec= inheritance )? ( members[classSpec] )? ;
	public final ClassSpecification classSpecification() throws RecognitionException {
		ClassSpecification classSpec = null;


		Token NAME2=null;
		ClassTypeSpecification cType =null;
		InheritanceSpecification inheritanceSpec =null;
		AnnotationSpecification annotation3 =null;


		  ModifierSpecification modifier = new ModifierSpecification();
		  boolean hasNameNegator = false;

		try {
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:128:3: ( ( annotation )? cType= classModifierAndType[modifier] ( NEGATOR )? NAME (inheritanceSpec= inheritance )? ( members[classSpec] )? )
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:129:3: ( annotation )? cType= classModifierAndType[modifier] ( NEGATOR )? NAME (inheritanceSpec= inheritance )? ( members[classSpec] )?
			{
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:129:3: ( annotation )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==70) ) {
				alt21=1;
			}
			switch (alt21) {
				case 1 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:129:4: annotation
					{
					pushFollow(FOLLOW_annotation_in_classSpecification1010);
					annotation3=annotation();
					state._fsp--;

					}
					break;

			}

			pushFollow(FOLLOW_classModifierAndType_in_classSpecification1018);
			cType=classModifierAndType(modifier);
			state._fsp--;

			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:131:3: ( NEGATOR )?
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==NEGATOR) ) {
				alt22=1;
			}
			switch (alt22) {
				case 1 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:131:4: NEGATOR
					{
					match(input,NEGATOR,FOLLOW_NEGATOR_in_classSpecification1024); 
					hasNameNegator = true;
					}
					break;

			}

			NAME2=(Token)match(input,NAME,FOLLOW_NAME_in_classSpecification1030); 
			classSpec = GrammarActions.classSpec((NAME2!=null?NAME2.getText():null), hasNameNegator, cType, annotation3, modifier);
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:132:3: (inheritanceSpec= inheritance )?
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==80||LA23_0==82) ) {
				alt23=1;
			}
			switch (alt23) {
				case 1 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:132:4: inheritanceSpec= inheritance
					{
					pushFollow(FOLLOW_inheritance_in_classSpecification1039);
					inheritanceSpec=inheritance();
					state._fsp--;

					classSpec.setInheritance(inheritanceSpec);
					}
					break;

			}

			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:133:3: ( members[classSpec] )?
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==95) ) {
				alt24=1;
			}
			switch (alt24) {
				case 1 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:133:3: members[classSpec]
					{
					pushFollow(FOLLOW_members_in_classSpecification1047);
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
	// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:136:9: private classModifierAndType[ModifierSpecification modifier] returns [ClassTypeSpecification cType] : ( NEGATOR )? ( 'public' cmat= classModifierAndType[modifier] | 'abstract' cmat= classModifierAndType[modifier] | 'final' cmat= classModifierAndType[modifier] | classType ) ;
	public final ClassTypeSpecification classModifierAndType(ModifierSpecification modifier) throws RecognitionException {
		ClassTypeSpecification cType = null;


		ClassTypeSpecification cmat =null;
		int classType4 =0;


		  boolean hasNegator = false;

		try {
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:140:3: ( ( NEGATOR )? ( 'public' cmat= classModifierAndType[modifier] | 'abstract' cmat= classModifierAndType[modifier] | 'final' cmat= classModifierAndType[modifier] | classType ) )
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:141:3: ( NEGATOR )? ( 'public' cmat= classModifierAndType[modifier] | 'abstract' cmat= classModifierAndType[modifier] | 'final' cmat= classModifierAndType[modifier] | classType )
			{
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:141:3: ( NEGATOR )?
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==NEGATOR) ) {
				alt25=1;
			}
			switch (alt25) {
				case 1 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:141:4: NEGATOR
					{
					match(input,NEGATOR,FOLLOW_NEGATOR_in_classModifierAndType1076); 
					hasNegator = true;
					}
					break;

			}

			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:142:3: ( 'public' cmat= classModifierAndType[modifier] | 'abstract' cmat= classModifierAndType[modifier] | 'final' cmat= classModifierAndType[modifier] | classType )
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
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:143:3: 'public' cmat= classModifierAndType[modifier]
					{
					match(input,87,FOLLOW_87_in_classModifierAndType1088); 
					GrammarActions.addModifier(modifier, ACC_PUBLIC, hasNegator);
					pushFollow(FOLLOW_classModifierAndType_in_classModifierAndType1094);
					cmat=classModifierAndType(modifier);
					state._fsp--;

					cType = cmat;
					}
					break;
				case 2 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:144:5: 'abstract' cmat= classModifierAndType[modifier]
					{
					match(input,73,FOLLOW_73_in_classModifierAndType1103); 
					GrammarActions.addModifier(modifier, ACC_ABSTRACT, hasNegator);
					pushFollow(FOLLOW_classModifierAndType_in_classModifierAndType1109);
					cmat=classModifierAndType(modifier);
					state._fsp--;

					cType = cmat;
					}
					break;
				case 3 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:145:5: 'final' cmat= classModifierAndType[modifier]
					{
					match(input,81,FOLLOW_81_in_classModifierAndType1118); 
					GrammarActions.addModifier(modifier, ACC_FINAL, hasNegator);
					pushFollow(FOLLOW_classModifierAndType_in_classModifierAndType1124);
					cmat=classModifierAndType(modifier);
					state._fsp--;

					cType = cmat;
					}
					break;
				case 4 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:146:5: classType
					{
					pushFollow(FOLLOW_classType_in_classModifierAndType1133);
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
	// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:150:9: private classType returns [int type] : ( 'interface' | 'enum' | 'class' );
	public final int classType() throws RecognitionException {
		int type = 0;


		try {
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:151:3: ( 'interface' | 'enum' | 'class' )
			int alt27=3;
			switch ( input.LA(1) ) {
			case 83:
				{
				alt27=1;
				}
				break;
			case 79:
				{
				alt27=2;
				}
				break;
			case 78:
				{
				alt27=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 27, 0, input);
				throw nvae;
			}
			switch (alt27) {
				case 1 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:152:5: 'interface'
					{
					match(input,83,FOLLOW_83_in_classType1162); 
					type = ACC_INTERFACE;
					}
					break;
				case 2 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:153:5: 'enum'
					{
					match(input,79,FOLLOW_79_in_classType1170); 
					type = ACC_ENUM;
					}
					break;
				case 3 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:154:5: 'class'
					{
					match(input,78,FOLLOW_78_in_classType1178); 
					type = 0;
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
		return type;
	}
	// $ANTLR end "classType"



	// $ANTLR start "members"
	// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:157:9: private members[ClassSpecification classSpec] : '{' ( member[classSpec] )* '}' ;
	public final void members(ClassSpecification classSpec) throws RecognitionException {
		try {
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:158:3: ( '{' ( member[classSpec] )* '}' )
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:159:3: '{' ( member[classSpec] )* '}'
			{
			match(input,95,FOLLOW_95_in_members1199); 
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:160:5: ( member[classSpec] )*
			loop28:
			while (true) {
				int alt28=2;
				int LA28_0 = input.LA(1);
				if ( ((LA28_0 >= NAME && LA28_0 <= NEGATOR)||LA28_0==8||(LA28_0 >= 67 && LA28_0 <= 70)||LA28_0==73||LA28_0==77||LA28_0==81||(LA28_0 >= 84 && LA28_0 <= 94)) ) {
					alt28=1;
				}

				switch (alt28) {
				case 1 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:160:5: member[classSpec]
					{
					pushFollow(FOLLOW_member_in_members1205);
					member(classSpec);
					state._fsp--;

					}
					break;

				default :
					break loop28;
				}
			}

			match(input,96,FOLLOW_96_in_members1211); 
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
	// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:164:9: private member[ClassSpecification classSpec] : ( annotation )? modifiers ( (typeSig= type )? name= ( NAME | '<init>' ) (signature= arguments |) | '<methods>' | '<fields>' ) ';' ;
	public final void member(ClassSpecification classSpec) throws RecognitionException {
		Token name=null;
		String typeSig =null;
		String signature =null;
		AnnotationSpecification annotation5 =null;
		ModifierSpecification modifiers6 =null;

		try {
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:165:3: ( ( annotation )? modifiers ( (typeSig= type )? name= ( NAME | '<init>' ) (signature= arguments |) | '<methods>' | '<fields>' ) ';' )
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:166:5: ( annotation )? modifiers ( (typeSig= type )? name= ( NAME | '<init>' ) (signature= arguments |) | '<methods>' | '<fields>' ) ';'
			{
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:166:5: ( annotation )?
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==70) ) {
				alt29=1;
			}
			switch (alt29) {
				case 1 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:166:5: annotation
					{
					pushFollow(FOLLOW_annotation_in_member1232);
					annotation5=annotation();
					state._fsp--;

					}
					break;

			}

			pushFollow(FOLLOW_modifiers_in_member1235);
			modifiers6=modifiers();
			state._fsp--;

			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:167:5: ( (typeSig= type )? name= ( NAME | '<init>' ) (signature= arguments |) | '<methods>' | '<fields>' )
			int alt32=3;
			switch ( input.LA(1) ) {
			case NAME:
			case 8:
			case 68:
				{
				alt32=1;
				}
				break;
			case 69:
				{
				alt32=2;
				}
				break;
			case 67:
				{
				alt32=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 32, 0, input);
				throw nvae;
			}
			switch (alt32) {
				case 1 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:168:7: (typeSig= type )? name= ( NAME | '<init>' ) (signature= arguments |)
					{
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:168:7: (typeSig= type )?
					int alt30=2;
					int LA30_0 = input.LA(1);
					if ( (LA30_0==8) ) {
						alt30=1;
					}
					else if ( (LA30_0==NAME) ) {
						int LA30_2 = input.LA(2);
						if ( (LA30_2==NAME||LA30_2==68||LA30_2==71) ) {
							alt30=1;
						}
					}
					switch (alt30) {
						case 1 :
							// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:168:8: typeSig= type
							{
							pushFollow(FOLLOW_type_in_member1252);
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
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:168:44: (signature= arguments |)
					int alt31=2;
					int LA31_0 = input.LA(1);
					if ( (LA31_0==9) ) {
						alt31=1;
					}
					else if ( (LA31_0==66) ) {
						alt31=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 31, 0, input);
						throw nvae;
					}

					switch (alt31) {
						case 1 :
							// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:168:45: signature= arguments
							{
							pushFollow(FOLLOW_arguments_in_member1267);
							signature=arguments();
							state._fsp--;

							GrammarActions.method(classSpec, annotation5, typeSig, (name!=null?name.getText():null), signature, modifiers6);
							}
							break;
						case 2 :
							// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:169:21: 
							{
							GrammarActions.fieldOrAnyMember(classSpec, annotation5, typeSig, (name!=null?name.getText():null), modifiers6);
							}
							break;

					}

					}
					break;
				case 2 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:170:9: '<methods>'
					{
					match(input,69,FOLLOW_69_in_member1302); 
					GrammarActions.method(classSpec, annotation5,
					          GrammarActions.getSignature("***", 0), "*", "("+ GrammarActions.getSignature("...", 0) + ")",
					          modifiers6);
					}
					break;
				case 3 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:173:9: '<fields>'
					{
					match(input,67,FOLLOW_67_in_member1314); 
					GrammarActions.field(classSpec, annotation5, null, "*", modifiers6);
					}
					break;

			}

			match(input,66,FOLLOW_66_in_member1324); 
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
	// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:177:9: private annotation returns [AnnotationSpecification annotSpec] : '@' ( NEGATOR )? NAME ;
	public final AnnotationSpecification annotation() throws RecognitionException {
		AnnotationSpecification annotSpec = null;


		Token NAME7=null;


		  boolean hasNameNegator = false;

		try {
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:181:3: ( '@' ( NEGATOR )? NAME )
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:181:6: '@' ( NEGATOR )? NAME
			{
			match(input,70,FOLLOW_70_in_annotation1348); 
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:181:10: ( NEGATOR )?
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==NEGATOR) ) {
				alt33=1;
			}
			switch (alt33) {
				case 1 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:181:11: NEGATOR
					{
					match(input,NEGATOR,FOLLOW_NEGATOR_in_annotation1351); 
					hasNameNegator = true;
					}
					break;

			}

			NAME7=(Token)match(input,NAME,FOLLOW_NAME_in_annotation1357); 
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
	// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:183:9: private modifiers returns [ModifierSpecification modifiers] : ( modifier[modifiers] )* ;
	public final ModifierSpecification modifiers() throws RecognitionException {
		ModifierSpecification modifiers = null;



		  modifiers = new ModifierSpecification();

		try {
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:187:3: ( ( modifier[modifiers] )* )
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:188:3: ( modifier[modifiers] )*
			{
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:188:3: ( modifier[modifiers] )*
			loop34:
			while (true) {
				int alt34=2;
				int LA34_0 = input.LA(1);
				if ( (LA34_0==NEGATOR||LA34_0==73||LA34_0==77||LA34_0==81||(LA34_0 >= 84 && LA34_0 <= 94)) ) {
					alt34=1;
				}

				switch (alt34) {
				case 1 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:188:3: modifier[modifiers]
					{
					pushFollow(FOLLOW_modifier_in_modifiers1381);
					modifier(modifiers);
					state._fsp--;

					}
					break;

				default :
					break loop34;
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
	// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:191:9: private modifier[ModifierSpecification modifiers] : ( NEGATOR )? ( 'public' | 'private' | 'protected' | 'static' | 'synchronized' | 'volatile' | 'native' | 'abstract' | 'strictfp' | 'final' | 'transient' | 'synthetic' | 'bridge' | 'varargs' ) ;
	public final void modifier(ModifierSpecification modifiers) throws RecognitionException {

		  boolean hasNegator = false;

		try {
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:195:3: ( ( NEGATOR )? ( 'public' | 'private' | 'protected' | 'static' | 'synchronized' | 'volatile' | 'native' | 'abstract' | 'strictfp' | 'final' | 'transient' | 'synthetic' | 'bridge' | 'varargs' ) )
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:196:3: ( NEGATOR )? ( 'public' | 'private' | 'protected' | 'static' | 'synchronized' | 'volatile' | 'native' | 'abstract' | 'strictfp' | 'final' | 'transient' | 'synthetic' | 'bridge' | 'varargs' )
			{
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:196:3: ( NEGATOR )?
			int alt35=2;
			int LA35_0 = input.LA(1);
			if ( (LA35_0==NEGATOR) ) {
				alt35=1;
			}
			switch (alt35) {
				case 1 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:196:4: NEGATOR
					{
					match(input,NEGATOR,FOLLOW_NEGATOR_in_modifier1407); 
					hasNegator = true;
					}
					break;

			}

			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:197:3: ( 'public' | 'private' | 'protected' | 'static' | 'synchronized' | 'volatile' | 'native' | 'abstract' | 'strictfp' | 'final' | 'transient' | 'synthetic' | 'bridge' | 'varargs' )
			int alt36=14;
			switch ( input.LA(1) ) {
			case 87:
				{
				alt36=1;
				}
				break;
			case 85:
				{
				alt36=2;
				}
				break;
			case 86:
				{
				alt36=3;
				}
				break;
			case 88:
				{
				alt36=4;
				}
				break;
			case 90:
				{
				alt36=5;
				}
				break;
			case 94:
				{
				alt36=6;
				}
				break;
			case 84:
				{
				alt36=7;
				}
				break;
			case 73:
				{
				alt36=8;
				}
				break;
			case 89:
				{
				alt36=9;
				}
				break;
			case 81:
				{
				alt36=10;
				}
				break;
			case 92:
				{
				alt36=11;
				}
				break;
			case 91:
				{
				alt36=12;
				}
				break;
			case 77:
				{
				alt36=13;
				}
				break;
			case 93:
				{
				alt36=14;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 36, 0, input);
				throw nvae;
			}
			switch (alt36) {
				case 1 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:198:5: 'public'
					{
					match(input,87,FOLLOW_87_in_modifier1421); 
					modifiers.addModifier(ACC_PUBLIC, hasNegator);
					}
					break;
				case 2 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:199:7: 'private'
					{
					match(input,85,FOLLOW_85_in_modifier1431); 
					modifiers.addModifier(ACC_PRIVATE, hasNegator);
					}
					break;
				case 3 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:200:7: 'protected'
					{
					match(input,86,FOLLOW_86_in_modifier1441); 
					modifiers.addModifier(ACC_PROTECTED, hasNegator);
					}
					break;
				case 4 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:201:7: 'static'
					{
					match(input,88,FOLLOW_88_in_modifier1451); 
					modifiers.addModifier(ACC_STATIC, hasNegator);
					}
					break;
				case 5 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:202:7: 'synchronized'
					{
					match(input,90,FOLLOW_90_in_modifier1461); 
					modifiers.addModifier(ACC_SYNCHRONIZED, hasNegator);
					}
					break;
				case 6 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:203:7: 'volatile'
					{
					match(input,94,FOLLOW_94_in_modifier1471); 
					modifiers.addModifier(ACC_VOLATILE, hasNegator);
					}
					break;
				case 7 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:204:7: 'native'
					{
					match(input,84,FOLLOW_84_in_modifier1481); 
					modifiers.addModifier(ACC_NATIVE, hasNegator);
					}
					break;
				case 8 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:205:7: 'abstract'
					{
					match(input,73,FOLLOW_73_in_modifier1491); 
					modifiers.addModifier(ACC_ABSTRACT, hasNegator);
					}
					break;
				case 9 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:206:7: 'strictfp'
					{
					match(input,89,FOLLOW_89_in_modifier1501); 
					modifiers.addModifier(ACC_STRICT, hasNegator);
					}
					break;
				case 10 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:207:7: 'final'
					{
					match(input,81,FOLLOW_81_in_modifier1511); 
					modifiers.addModifier(ACC_FINAL, hasNegator);
					}
					break;
				case 11 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:208:7: 'transient'
					{
					match(input,92,FOLLOW_92_in_modifier1521); 
					modifiers.addModifier(ACC_TRANSIENT, hasNegator);
					}
					break;
				case 12 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:209:7: 'synthetic'
					{
					match(input,91,FOLLOW_91_in_modifier1531); 
					modifiers.addModifier(ACC_SYNTHETIC, hasNegator);
					}
					break;
				case 13 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:210:7: 'bridge'
					{
					match(input,77,FOLLOW_77_in_modifier1541); 
					modifiers.addModifier(ACC_BRIDGE, hasNegator);
					}
					break;
				case 14 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:211:7: 'varargs'
					{
					match(input,93,FOLLOW_93_in_modifier1551); 
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
	// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:215:9: private inheritance returns [InheritanceSpecification inheritanceSpec] : ( 'extends' | 'implements' ) ( annotation )? ( NEGATOR )? NAME ;
	public final InheritanceSpecification inheritance() throws RecognitionException {
		InheritanceSpecification inheritanceSpec = null;


		Token NAME8=null;
		AnnotationSpecification annotation9 =null;


		  boolean hasNameNegator = false;

		try {
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:219:3: ( ( 'extends' | 'implements' ) ( annotation )? ( NEGATOR )? NAME )
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:220:3: ( 'extends' | 'implements' ) ( annotation )? ( NEGATOR )? NAME
			{
			if ( input.LA(1)==80||input.LA(1)==82 ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:221:3: ( annotation )?
			int alt37=2;
			int LA37_0 = input.LA(1);
			if ( (LA37_0==70) ) {
				alt37=1;
			}
			switch (alt37) {
				case 1 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:221:3: annotation
					{
					pushFollow(FOLLOW_annotation_in_inheritance1592);
					annotation9=annotation();
					state._fsp--;

					}
					break;

			}

			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:221:15: ( NEGATOR )?
			int alt38=2;
			int LA38_0 = input.LA(1);
			if ( (LA38_0==NEGATOR) ) {
				alt38=1;
			}
			switch (alt38) {
				case 1 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:221:16: NEGATOR
					{
					match(input,NEGATOR,FOLLOW_NEGATOR_in_inheritance1596); 
					hasNameNegator = true;
					}
					break;

			}

			NAME8=(Token)match(input,NAME,FOLLOW_NAME_in_inheritance1602); 
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
	// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:223:9: private arguments returns [String signature] : '(' ( (parameterSig= type ( ',' parameterSig= type )* )? ) ')' ;
	public final String arguments() throws RecognitionException {
		String signature = null;


		String parameterSig =null;

		try {
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:224:3: ( '(' ( (parameterSig= type ( ',' parameterSig= type )* )? ) ')' )
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:225:3: '(' ( (parameterSig= type ( ',' parameterSig= type )* )? ) ')'
			{
			match(input,9,FOLLOW_9_in_arguments1622); 
			signature = "(";
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:226:5: ( (parameterSig= type ( ',' parameterSig= type )* )? )
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:227:7: (parameterSig= type ( ',' parameterSig= type )* )?
			{
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:227:7: (parameterSig= type ( ',' parameterSig= type )* )?
			int alt40=2;
			int LA40_0 = input.LA(1);
			if ( (LA40_0==NAME||LA40_0==8) ) {
				alt40=1;
			}
			switch (alt40) {
				case 1 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:228:9: parameterSig= type ( ',' parameterSig= type )*
					{
					pushFollow(FOLLOW_type_in_arguments1650);
					parameterSig=type();
					state._fsp--;

					signature += parameterSig;
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:229:9: ( ',' parameterSig= type )*
					loop39:
					while (true) {
						int alt39=2;
						int LA39_0 = input.LA(1);
						if ( (LA39_0==11) ) {
							alt39=1;
						}

						switch (alt39) {
						case 1 :
							// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:229:10: ',' parameterSig= type
							{
							match(input,11,FOLLOW_11_in_arguments1663); 
							pushFollow(FOLLOW_type_in_arguments1667);
							parameterSig=type();
							state._fsp--;

							signature += parameterSig;
							}
							break;

						default :
							break loop39;
						}
					}

					}
					break;

			}

			}

			match(input,10,FOLLOW_10_in_arguments1696); 
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
	// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:235:9: private type returns [String signature] : (typeName= '%' | (typeName= NAME ( '[]' )* ) ) ;
	public final String type() throws RecognitionException {
		String signature = null;


		Token typeName=null;


		  int dim = 0;

		try {
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:239:3: ( (typeName= '%' | (typeName= NAME ( '[]' )* ) ) )
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:240:3: (typeName= '%' | (typeName= NAME ( '[]' )* ) )
			{
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:240:3: (typeName= '%' | (typeName= NAME ( '[]' )* ) )
			int alt42=2;
			int LA42_0 = input.LA(1);
			if ( (LA42_0==8) ) {
				alt42=1;
			}
			else if ( (LA42_0==NAME) ) {
				alt42=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 42, 0, input);
				throw nvae;
			}

			switch (alt42) {
				case 1 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:241:5: typeName= '%'
					{
					typeName=(Token)match(input,8,FOLLOW_8_in_type1732); 
					String sig = (typeName!=null?typeName.getText():null); signature = GrammarActions.getSignature(sig == null ? "" : sig, 0);
					}
					break;
				case 2 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:243:5: (typeName= NAME ( '[]' )* )
					{
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:243:5: (typeName= NAME ( '[]' )* )
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:243:6: typeName= NAME ( '[]' )*
					{
					typeName=(Token)match(input,NAME,FOLLOW_NAME_in_type1749); 
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:243:20: ( '[]' )*
					loop41:
					while (true) {
						int alt41=2;
						int LA41_0 = input.LA(1);
						if ( (LA41_0==71) ) {
							alt41=1;
						}

						switch (alt41) {
						case 1 :
							// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:243:21: '[]'
							{
							match(input,71,FOLLOW_71_in_type1752); 
							dim++;
							}
							break;

						default :
							break loop41;
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
	// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:247:9: private keepOptionModifier returns [KeepModifier modifier] : ',' ( 'allowshrinking' | 'allowoptimization' | 'allowobfuscation' ) ;
	public final KeepModifier keepOptionModifier() throws RecognitionException {
		KeepModifier modifier = null;


		try {
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:248:3: ( ',' ( 'allowshrinking' | 'allowoptimization' | 'allowobfuscation' ) )
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:248:5: ',' ( 'allowshrinking' | 'allowoptimization' | 'allowobfuscation' )
			{
			match(input,11,FOLLOW_11_in_keepOptionModifier1783); 
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:249:3: ( 'allowshrinking' | 'allowoptimization' | 'allowobfuscation' )
			int alt43=3;
			switch ( input.LA(1) ) {
			case 76:
				{
				alt43=1;
				}
				break;
			case 75:
				{
				alt43=2;
				}
				break;
			case 74:
				{
				alt43=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 43, 0, input);
				throw nvae;
			}
			switch (alt43) {
				case 1 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:249:4: 'allowshrinking'
					{
					match(input,76,FOLLOW_76_in_keepOptionModifier1788); 
					modifier = KeepModifier.ALLOW_SHRINKING;
					}
					break;
				case 2 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:250:5: 'allowoptimization'
					{
					match(input,75,FOLLOW_75_in_keepOptionModifier1796); 
					}
					break;
				case 3 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/gradle-core/src/main/java/com/android/build/gradle/shrinker/parser/Proguard.g:251:5: 'allowobfuscation'
					{
					match(input,74,FOLLOW_74_in_keepOptionModifier1803); 
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



	public static final BitSet FOLLOW_18_in_prog66 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_NAME_in_prog70 = new BitSet(new long[]{0xFFFFFFFFFFFFF000L,0x0000000000000041L});
	public static final BitSet FOLLOW_set_in_prog81 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_NAME_in_prog89 = new BitSet(new long[]{0xFFFFFFFFFFFFF000L,0x0000000000000041L});
	public static final BitSet FOLLOW_40_in_prog100 = new BitSet(new long[]{0x0000000000000840L,0x00000000008AC240L});
	public static final BitSet FOLLOW_keepOptionModifier_in_prog104 = new BitSet(new long[]{0x0000000000000040L,0x00000000008AC240L});
	public static final BitSet FOLLOW_classSpecification_in_prog109 = new BitSet(new long[]{0xFFFFFFFFFFFFF000L,0x0000000000000041L});
	public static final BitSet FOLLOW_38_in_prog121 = new BitSet(new long[]{0x0000000000000840L,0x00000000008AC240L});
	public static final BitSet FOLLOW_keepOptionModifier_in_prog125 = new BitSet(new long[]{0x0000000000000040L,0x00000000008AC240L});
	public static final BitSet FOLLOW_classSpecification_in_prog130 = new BitSet(new long[]{0xFFFFFFFFFFFFF000L,0x0000000000000041L});
	public static final BitSet FOLLOW_35_in_prog142 = new BitSet(new long[]{0x0000000000000840L,0x00000000008AC240L});
	public static final BitSet FOLLOW_keepOptionModifier_in_prog146 = new BitSet(new long[]{0x0000000000000040L,0x00000000008AC240L});
	public static final BitSet FOLLOW_classSpecification_in_prog151 = new BitSet(new long[]{0xFFFFFFFFFFFFF000L,0x0000000000000041L});
	public static final BitSet FOLLOW_ignoredFlag_in_prog165 = new BitSet(new long[]{0xFFFFFFFFFFFFF000L,0x0000000000000041L});
	public static final BitSet FOLLOW_noOpFlag_in_prog179 = new BitSet(new long[]{0xFFFFFFFFFFFFF000L,0x0000000000000041L});
	public static final BitSet FOLLOW_unsupportedFlag_in_prog193 = new BitSet(new long[]{0xFFFFFFFFFFFFF000L,0x0000000000000041L});
	public static final BitSet FOLLOW_28_in_prog205 = new BitSet(new long[]{0xFFFFFFFFFFFFF060L,0x0000000000000041L});
	public static final BitSet FOLLOW_filter_in_prog209 = new BitSet(new long[]{0xFFFFFFFFFFFFF000L,0x0000000000000041L});
	public static final BitSet FOLLOW_32_in_prog222 = new BitSet(new long[]{0xFFFFFFFFFFFFF000L,0x0000000000000041L});
	public static final BitSet FOLLOW_EOF_in_prog234 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_63_in_noOpFlag263 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_noOpFlag277 = new BitSet(new long[]{0x0000000000000060L});
	public static final BitSet FOLLOW_filter_in_noOpFlag281 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_27_in_noOpFlag296 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_noOpFlag304 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_noOpFlag312 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_60_in_noOpFlag320 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_44_in_noOpFlag333 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_noOpFlag342 = new BitSet(new long[]{0x0000000000000040L,0x00000000008AC240L});
	public static final BitSet FOLLOW_classSpecification_in_noOpFlag346 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_39_in_noOpFlag357 = new BitSet(new long[]{0x0000000000000040L,0x00000000008AC240L});
	public static final BitSet FOLLOW_classSpecification_in_noOpFlag361 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_noOpFlag373 = new BitSet(new long[]{0x0000000000000040L,0x00000000008AC240L});
	public static final BitSet FOLLOW_classSpecification_in_noOpFlag377 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_36_in_noOpFlag389 = new BitSet(new long[]{0x0000000000000060L});
	public static final BitSet FOLLOW_filter_in_noOpFlag393 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_noOpFlag405 = new BitSet(new long[]{0x0000000000000060L});
	public static final BitSet FOLLOW_filter_in_noOpFlag409 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_noOpFlag421 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_noOpFlag432 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_noOpFlag444 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_21_in_noOpFlag456 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_50_in_ignoredFlag484 = new BitSet(new long[]{0x0000000000000060L});
	public static final BitSet FOLLOW_filter_in_ignoredFlag488 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_62_in_ignoredFlag498 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_ignoredFlag506 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_ignoredFlag515 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_NAME_in_ignoredFlag517 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_ignoredFlag528 = new BitSet(new long[]{0x0000000000000040L,0x00000000008AC240L});
	public static final BitSet FOLLOW_classSpecification_in_ignoredFlag530 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_46_in_ignoredFlag539 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_ignoredFlag547 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_58_in_ignoredFlag556 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_NAME_in_ignoredFlag560 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_ignoredFlag571 = new BitSet(new long[]{0x0000000000000060L});
	public static final BitSet FOLLOW_filter_in_ignoredFlag575 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_ignoredFlag586 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_NAME_in_ignoredFlag590 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_ignoredFlag600 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_NAME_in_ignoredFlag604 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_ignoredFlag612 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_NAME_in_ignoredFlag616 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_ignoredFlag624 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_NAME_in_ignoredFlag628 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_59_in_ignoredFlag637 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
	public static final BitSet FOLLOW_72_in_ignoredFlag640 = new BitSet(new long[]{0x0000000000000020L,0x0000000000000100L});
	public static final BitSet FOLLOW_NAME_in_ignoredFlag644 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_72_in_ignoredFlag647 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_30_in_ignoredFlag660 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
	public static final BitSet FOLLOW_72_in_ignoredFlag663 = new BitSet(new long[]{0x0000000000000020L,0x0000000000000100L});
	public static final BitSet FOLLOW_NAME_in_ignoredFlag667 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_72_in_ignoredFlag670 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_ignoredFlag683 = new BitSet(new long[]{0x0000000000000060L});
	public static final BitSet FOLLOW_filter_in_ignoredFlag687 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_13_in_ignoredFlag699 = new BitSet(new long[]{0x0000000000000060L});
	public static final BitSet FOLLOW_filter_in_ignoredFlag703 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_34_in_unsupportedFlag729 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_classpath_in_unsupportedFlag733 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_51_in_unsupportedFlag741 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_classpath_in_unsupportedFlag745 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_45_in_unsupportedFlag753 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_classpath_in_unsupportedFlag757 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_61_in_unsupportedFlag766 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_NAME_in_unsupportedFlag768 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_31_in_unsupportedFlag778 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_57_in_unsupportedFlag787 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_NAME_in_unsupportedFlag789 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_64_in_unsupportedFlag800 = new BitSet(new long[]{0x0000000000000040L,0x00000000008AC240L});
	public static final BitSet FOLLOW_classSpecification_in_unsupportedFlag802 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_47_in_unsupportedFlag811 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_54_in_unsupportedFlag820 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_NAME_in_unsupportedFlag822 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_29_in_unsupportedFlag834 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_NAME_in_unsupportedFlag836 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_55_in_unsupportedFlag847 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_NAME_in_unsupportedFlag851 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_56_in_unsupportedFlag861 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_NAME_in_unsupportedFlag865 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_unsupportedFlag877 = new BitSet(new long[]{0x0000000000000060L});
	public static final BitSet FOLLOW_filter_in_unsupportedFlag881 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NAME_in_classpath903 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000006L});
	public static final BitSet FOLLOW_set_in_classpath906 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_classpath_in_classpath912 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nonEmptytFilter_in_filter933 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NEGATOR_in_nonEmptytFilter967 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_NAME_in_nonEmptytFilter973 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_11_in_nonEmptytFilter978 = new BitSet(new long[]{0x0000000000000060L});
	public static final BitSet FOLLOW_nonEmptytFilter_in_nonEmptytFilter980 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotation_in_classSpecification1010 = new BitSet(new long[]{0x0000000000000040L,0x00000000008AC200L});
	public static final BitSet FOLLOW_classModifierAndType_in_classSpecification1018 = new BitSet(new long[]{0x0000000000000060L});
	public static final BitSet FOLLOW_NEGATOR_in_classSpecification1024 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_NAME_in_classSpecification1030 = new BitSet(new long[]{0x0000000000000002L,0x0000000080050000L});
	public static final BitSet FOLLOW_inheritance_in_classSpecification1039 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
	public static final BitSet FOLLOW_members_in_classSpecification1047 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NEGATOR_in_classModifierAndType1076 = new BitSet(new long[]{0x0000000000000000L,0x00000000008AC200L});
	public static final BitSet FOLLOW_87_in_classModifierAndType1088 = new BitSet(new long[]{0x0000000000000040L,0x00000000008AC200L});
	public static final BitSet FOLLOW_classModifierAndType_in_classModifierAndType1094 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_73_in_classModifierAndType1103 = new BitSet(new long[]{0x0000000000000040L,0x00000000008AC200L});
	public static final BitSet FOLLOW_classModifierAndType_in_classModifierAndType1109 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_81_in_classModifierAndType1118 = new BitSet(new long[]{0x0000000000000040L,0x00000000008AC200L});
	public static final BitSet FOLLOW_classModifierAndType_in_classModifierAndType1124 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classType_in_classModifierAndType1133 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_83_in_classType1162 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_79_in_classType1170 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_78_in_classType1178 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_95_in_members1199 = new BitSet(new long[]{0x0000000000000160L,0x000000017FF22278L});
	public static final BitSet FOLLOW_member_in_members1205 = new BitSet(new long[]{0x0000000000000160L,0x000000017FF22278L});
	public static final BitSet FOLLOW_96_in_members1211 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotation_in_member1232 = new BitSet(new long[]{0x0000000000000160L,0x000000007FF22238L});
	public static final BitSet FOLLOW_modifiers_in_member1235 = new BitSet(new long[]{0x0000000000000120L,0x0000000000000038L});
	public static final BitSet FOLLOW_type_in_member1252 = new BitSet(new long[]{0x0000000000000020L,0x0000000000000010L});
	public static final BitSet FOLLOW_set_in_member1258 = new BitSet(new long[]{0x0000000000000200L,0x0000000000000004L});
	public static final BitSet FOLLOW_arguments_in_member1267 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_69_in_member1302 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_67_in_member1314 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_66_in_member1324 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_70_in_annotation1348 = new BitSet(new long[]{0x0000000000000060L});
	public static final BitSet FOLLOW_NEGATOR_in_annotation1351 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_NAME_in_annotation1357 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_modifier_in_modifiers1381 = new BitSet(new long[]{0x0000000000000042L,0x000000007FF22200L});
	public static final BitSet FOLLOW_NEGATOR_in_modifier1407 = new BitSet(new long[]{0x0000000000000000L,0x000000007FF22200L});
	public static final BitSet FOLLOW_87_in_modifier1421 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_85_in_modifier1431 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_86_in_modifier1441 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_88_in_modifier1451 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_90_in_modifier1461 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_94_in_modifier1471 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_84_in_modifier1481 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_73_in_modifier1491 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_89_in_modifier1501 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_81_in_modifier1511 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_92_in_modifier1521 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_91_in_modifier1531 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_modifier1541 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_93_in_modifier1551 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_inheritance1582 = new BitSet(new long[]{0x0000000000000060L,0x0000000000000040L});
	public static final BitSet FOLLOW_annotation_in_inheritance1592 = new BitSet(new long[]{0x0000000000000060L});
	public static final BitSet FOLLOW_NEGATOR_in_inheritance1596 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_NAME_in_inheritance1602 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_9_in_arguments1622 = new BitSet(new long[]{0x0000000000000520L});
	public static final BitSet FOLLOW_type_in_arguments1650 = new BitSet(new long[]{0x0000000000000C00L});
	public static final BitSet FOLLOW_11_in_arguments1663 = new BitSet(new long[]{0x0000000000000120L});
	public static final BitSet FOLLOW_type_in_arguments1667 = new BitSet(new long[]{0x0000000000000C00L});
	public static final BitSet FOLLOW_10_in_arguments1696 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_8_in_type1732 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NAME_in_type1749 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
	public static final BitSet FOLLOW_71_in_type1752 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
	public static final BitSet FOLLOW_11_in_keepOptionModifier1783 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001C00L});
	public static final BitSet FOLLOW_76_in_keepOptionModifier1788 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_75_in_keepOptionModifier1796 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_74_in_keepOptionModifier1803 = new BitSet(new long[]{0x0000000000000002L});
}

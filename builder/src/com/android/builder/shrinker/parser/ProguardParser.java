// $ANTLR 3.5.2 /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g 2015-11-23 19:11:30

package com.android.builder.shrinker.parser;
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
	@Override public String getGrammarFileName() { return "/usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g"; }



	// $ANTLR start "prog"
	// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:20:1: prog[Flags flags, String baseDirectory] : ( ( '-basedirectory' baseDir= NAME ) | ( '-include' | '@' ) proguardFile= NAME | ( '-keepclassmembers' (keepModifier= keepOptionModifier )? classSpec= classSpecification ) | ( '-keepclasseswithmembers' (keepModifier= keepOptionModifier )? classSpec= classSpecification ) | ( '-keep' (keepModifier= keepOptionModifier )? classSpec= classSpecification ) | ( '-dontshrink' ) | ( '-dontoptimize' ) | ( '-dontpreverify' ) | ( '-dontobfuscate' ) | ignoredFlag | (unFlag= unsupportedFlag ) )* EOF ;
	public final void prog(Flags flags, String baseDirectory) throws RecognitionException {
		Token baseDir=null;
		Token proguardFile=null;
		KeepModifier keepModifier =null;
		ClassSpecification classSpec =null;
		ParserRuleReturnScope unFlag =null;

		try {
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:21:3: ( ( ( '-basedirectory' baseDir= NAME ) | ( '-include' | '@' ) proguardFile= NAME | ( '-keepclassmembers' (keepModifier= keepOptionModifier )? classSpec= classSpecification ) | ( '-keepclasseswithmembers' (keepModifier= keepOptionModifier )? classSpec= classSpecification ) | ( '-keep' (keepModifier= keepOptionModifier )? classSpec= classSpecification ) | ( '-dontshrink' ) | ( '-dontoptimize' ) | ( '-dontpreverify' ) | ( '-dontobfuscate' ) | ignoredFlag | (unFlag= unsupportedFlag ) )* EOF )
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:22:3: ( ( '-basedirectory' baseDir= NAME ) | ( '-include' | '@' ) proguardFile= NAME | ( '-keepclassmembers' (keepModifier= keepOptionModifier )? classSpec= classSpecification ) | ( '-keepclasseswithmembers' (keepModifier= keepOptionModifier )? classSpec= classSpecification ) | ( '-keep' (keepModifier= keepOptionModifier )? classSpec= classSpecification ) | ( '-dontshrink' ) | ( '-dontoptimize' ) | ( '-dontpreverify' ) | ( '-dontobfuscate' ) | ignoredFlag | (unFlag= unsupportedFlag ) )* EOF
			{
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:22:3: ( ( '-basedirectory' baseDir= NAME ) | ( '-include' | '@' ) proguardFile= NAME | ( '-keepclassmembers' (keepModifier= keepOptionModifier )? classSpec= classSpecification ) | ( '-keepclasseswithmembers' (keepModifier= keepOptionModifier )? classSpec= classSpecification ) | ( '-keep' (keepModifier= keepOptionModifier )? classSpec= classSpecification ) | ( '-dontshrink' ) | ( '-dontoptimize' ) | ( '-dontpreverify' ) | ( '-dontobfuscate' ) | ignoredFlag | (unFlag= unsupportedFlag ) )*
			loop4:
			while (true) {
				int alt4=12;
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
				case 24:
					{
					alt4=6;
					}
					break;
				case 22:
					{
					alt4=7;
					}
					break;
				case 23:
					{
					alt4=8;
					}
					break;
				case 21:
					{
					alt4=9;
					}
					break;
				case 15:
				case 20:
				case 25:
				case 26:
				case 27:
				case 28:
				case 36:
				case 37:
				case 39:
				case 42:
				case 44:
				case 62:
				case 63:
					{
					alt4=10;
					}
					break;
				case 12:
				case 13:
				case 14:
				case 16:
				case 17:
				case 19:
				case 29:
				case 30:
				case 31:
				case 32:
				case 34:
				case 41:
				case 43:
				case 45:
				case 46:
				case 47:
				case 48:
				case 49:
				case 50:
				case 51:
				case 52:
				case 53:
				case 54:
				case 55:
				case 56:
				case 57:
				case 58:
				case 59:
				case 60:
				case 61:
				case 64:
					{
					alt4=11;
					}
					break;
				}
				switch (alt4) {
				case 1 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:23:5: ( '-basedirectory' baseDir= NAME )
					{
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:23:5: ( '-basedirectory' baseDir= NAME )
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:23:6: '-basedirectory' baseDir= NAME
					{
					match(input,18,FOLLOW_18_in_prog66); 
					baseDir=(Token)match(input,NAME,FOLLOW_NAME_in_prog70); 
					baseDirectory=(baseDir!=null?baseDir.getText():null);
					}

					}
					break;
				case 2 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:24:7: ( '-include' | '@' ) proguardFile= NAME
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
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:25:7: ( '-keepclassmembers' (keepModifier= keepOptionModifier )? classSpec= classSpecification )
					{
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:25:7: ( '-keepclassmembers' (keepModifier= keepOptionModifier )? classSpec= classSpecification )
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:25:8: '-keepclassmembers' (keepModifier= keepOptionModifier )? classSpec= classSpecification
					{
					match(input,40,FOLLOW_40_in_prog100); 
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:25:40: (keepModifier= keepOptionModifier )?
					int alt1=2;
					int LA1_0 = input.LA(1);
					if ( (LA1_0==11) ) {
						alt1=1;
					}
					switch (alt1) {
						case 1 :
							// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:25:40: keepModifier= keepOptionModifier
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
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:26:7: ( '-keepclasseswithmembers' (keepModifier= keepOptionModifier )? classSpec= classSpecification )
					{
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:26:7: ( '-keepclasseswithmembers' (keepModifier= keepOptionModifier )? classSpec= classSpecification )
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:26:8: '-keepclasseswithmembers' (keepModifier= keepOptionModifier )? classSpec= classSpecification
					{
					match(input,38,FOLLOW_38_in_prog121); 
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:26:46: (keepModifier= keepOptionModifier )?
					int alt2=2;
					int LA2_0 = input.LA(1);
					if ( (LA2_0==11) ) {
						alt2=1;
					}
					switch (alt2) {
						case 1 :
							// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:26:46: keepModifier= keepOptionModifier
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
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:27:7: ( '-keep' (keepModifier= keepOptionModifier )? classSpec= classSpecification )
					{
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:27:7: ( '-keep' (keepModifier= keepOptionModifier )? classSpec= classSpecification )
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:27:8: '-keep' (keepModifier= keepOptionModifier )? classSpec= classSpecification
					{
					match(input,35,FOLLOW_35_in_prog142); 
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:27:28: (keepModifier= keepOptionModifier )?
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0==11) ) {
						alt3=1;
					}
					switch (alt3) {
						case 1 :
							// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:27:28: keepModifier= keepOptionModifier
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
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:28:7: ( '-dontshrink' )
					{
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:28:7: ( '-dontshrink' )
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:28:8: '-dontshrink'
					{
					match(input,24,FOLLOW_24_in_prog163); 
					flags.setShrink(false);
					}

					}
					break;
				case 7 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:29:7: ( '-dontoptimize' )
					{
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:29:7: ( '-dontoptimize' )
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:29:8: '-dontoptimize'
					{
					match(input,22,FOLLOW_22_in_prog175); 
					flags.setOptimize(false);
					}

					}
					break;
				case 8 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:30:7: ( '-dontpreverify' )
					{
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:30:7: ( '-dontpreverify' )
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:30:8: '-dontpreverify'
					{
					match(input,23,FOLLOW_23_in_prog188); 
					flags.setPreverify(false);
					}

					}
					break;
				case 9 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:31:7: ( '-dontobfuscate' )
					{
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:31:7: ( '-dontobfuscate' )
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:31:8: '-dontobfuscate'
					{
					match(input,21,FOLLOW_21_in_prog201); 
					flags.setObfuscate(false);
					}

					}
					break;
				case 10 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:32:7: ignoredFlag
					{
					pushFollow(FOLLOW_ignoredFlag_in_prog212);
					ignoredFlag();
					state._fsp--;

					}
					break;
				case 11 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:33:7: (unFlag= unsupportedFlag )
					{
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:33:7: (unFlag= unsupportedFlag )
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:33:8: unFlag= unsupportedFlag
					{
					pushFollow(FOLLOW_unsupportedFlag_in_prog223);
					unFlag=unsupportedFlag();
					state._fsp--;

					GrammarActions.unsupportedFlag((unFlag!=null?input.toString(unFlag.start,unFlag.stop):null));
					}

					}
					break;

				default :
					break loop4;
				}
			}

			match(input,EOF,FOLLOW_EOF_in_prog235); 
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



	// $ANTLR start "ignoredFlag"
	// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:41:9: private ignoredFlag : ( '-keepparameternames' | ( '-keepattributes' filter[attribute_filter] ) | ( '-keepclassmembernames' classSpec= classSpecification ) | ( '-keepclasseswithmembernames' classSpec= classSpecification ) | ( '-keepnames' classSpec= classSpecification ) | '-verbose' | '-dontusemixedcaseclassnames' | '-useuniqueclassmembernames' | ( '-dontnote' filter[class_filter] ) | ( '-dontwarn' filter[class_filter] ) | '-dontskipnonpubliclibraryclasses' | '-dontskipnonpubliclibraryclassmembers' | '-allowaccessmodification' ) ;
	public final void ignoredFlag() throws RecognitionException {
		ClassSpecification classSpec =null;

		try {
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:42:3: ( ( '-keepparameternames' | ( '-keepattributes' filter[attribute_filter] ) | ( '-keepclassmembernames' classSpec= classSpecification ) | ( '-keepclasseswithmembernames' classSpec= classSpecification ) | ( '-keepnames' classSpec= classSpecification ) | '-verbose' | '-dontusemixedcaseclassnames' | '-useuniqueclassmembernames' | ( '-dontnote' filter[class_filter] ) | ( '-dontwarn' filter[class_filter] ) | '-dontskipnonpubliclibraryclasses' | '-dontskipnonpubliclibraryclassmembers' | '-allowaccessmodification' ) )
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:43:3: ( '-keepparameternames' | ( '-keepattributes' filter[attribute_filter] ) | ( '-keepclassmembernames' classSpec= classSpecification ) | ( '-keepclasseswithmembernames' classSpec= classSpecification ) | ( '-keepnames' classSpec= classSpecification ) | '-verbose' | '-dontusemixedcaseclassnames' | '-useuniqueclassmembernames' | ( '-dontnote' filter[class_filter] ) | ( '-dontwarn' filter[class_filter] ) | '-dontskipnonpubliclibraryclasses' | '-dontskipnonpubliclibraryclassmembers' | '-allowaccessmodification' )
			{
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:43:3: ( '-keepparameternames' | ( '-keepattributes' filter[attribute_filter] ) | ( '-keepclassmembernames' classSpec= classSpecification ) | ( '-keepclasseswithmembernames' classSpec= classSpecification ) | ( '-keepnames' classSpec= classSpecification ) | '-verbose' | '-dontusemixedcaseclassnames' | '-useuniqueclassmembernames' | ( '-dontnote' filter[class_filter] ) | ( '-dontwarn' filter[class_filter] ) | '-dontskipnonpubliclibraryclasses' | '-dontskipnonpubliclibraryclassmembers' | '-allowaccessmodification' )
			int alt5=13;
			switch ( input.LA(1) ) {
			case 44:
				{
				alt5=1;
				}
				break;
			case 36:
				{
				alt5=2;
				}
				break;
			case 39:
				{
				alt5=3;
				}
				break;
			case 37:
				{
				alt5=4;
				}
				break;
			case 42:
				{
				alt5=5;
				}
				break;
			case 63:
				{
				alt5=6;
				}
				break;
			case 27:
				{
				alt5=7;
				}
				break;
			case 62:
				{
				alt5=8;
				}
				break;
			case 20:
				{
				alt5=9;
				}
				break;
			case 28:
				{
				alt5=10;
				}
				break;
			case 25:
				{
				alt5=11;
				}
				break;
			case 26:
				{
				alt5=12;
				}
				break;
			case 15:
				{
				alt5=13;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:43:7: '-keepparameternames'
					{
					match(input,44,FOLLOW_44_in_ignoredFlag264); 
					}
					break;
				case 2 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:44:7: ( '-keepattributes' filter[attribute_filter] )
					{
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:44:7: ( '-keepattributes' filter[attribute_filter] )
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:44:8: '-keepattributes' filter[attribute_filter]
					{
					match(input,36,FOLLOW_36_in_ignoredFlag273); 
					FilterSpecification attribute_filter = new FilterSpecification();
					pushFollow(FOLLOW_filter_in_ignoredFlag277);
					filter(attribute_filter);
					state._fsp--;

					}

					}
					break;
				case 3 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:45:7: ( '-keepclassmembernames' classSpec= classSpecification )
					{
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:45:7: ( '-keepclassmembernames' classSpec= classSpecification )
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:45:8: '-keepclassmembernames' classSpec= classSpecification
					{
					match(input,39,FOLLOW_39_in_ignoredFlag289); 
					pushFollow(FOLLOW_classSpecification_in_ignoredFlag293);
					classSpec=classSpecification();
					state._fsp--;

					}

					}
					break;
				case 4 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:46:7: ( '-keepclasseswithmembernames' classSpec= classSpecification )
					{
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:46:7: ( '-keepclasseswithmembernames' classSpec= classSpecification )
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:46:8: '-keepclasseswithmembernames' classSpec= classSpecification
					{
					match(input,37,FOLLOW_37_in_ignoredFlag305); 
					pushFollow(FOLLOW_classSpecification_in_ignoredFlag309);
					classSpec=classSpecification();
					state._fsp--;

					}

					}
					break;
				case 5 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:47:7: ( '-keepnames' classSpec= classSpecification )
					{
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:47:7: ( '-keepnames' classSpec= classSpecification )
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:47:8: '-keepnames' classSpec= classSpecification
					{
					match(input,42,FOLLOW_42_in_ignoredFlag321); 
					pushFollow(FOLLOW_classSpecification_in_ignoredFlag325);
					classSpec=classSpecification();
					state._fsp--;

					}

					}
					break;
				case 6 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:48:7: '-verbose'
					{
					match(input,63,FOLLOW_63_in_ignoredFlag335); 
					}
					break;
				case 7 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:49:7: '-dontusemixedcaseclassnames'
					{
					match(input,27,FOLLOW_27_in_ignoredFlag343); 
					}
					break;
				case 8 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:50:7: '-useuniqueclassmembernames'
					{
					match(input,62,FOLLOW_62_in_ignoredFlag351); 
					}
					break;
				case 9 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:52:7: ( '-dontnote' filter[class_filter] )
					{
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:52:7: ( '-dontnote' filter[class_filter] )
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:52:8: '-dontnote' filter[class_filter]
					{
					match(input,20,FOLLOW_20_in_ignoredFlag365); 
					FilterSpecification class_filter = new FilterSpecification();
					pushFollow(FOLLOW_filter_in_ignoredFlag369);
					filter(class_filter);
					state._fsp--;

					}

					}
					break;
				case 10 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:53:7: ( '-dontwarn' filter[class_filter] )
					{
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:53:7: ( '-dontwarn' filter[class_filter] )
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:53:8: '-dontwarn' filter[class_filter]
					{
					match(input,28,FOLLOW_28_in_ignoredFlag380); 
					FilterSpecification class_filter = new FilterSpecification();
					pushFollow(FOLLOW_filter_in_ignoredFlag384);
					filter(class_filter);
					state._fsp--;

					}

					}
					break;
				case 11 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:55:7: '-dontskipnonpubliclibraryclasses'
					{
					match(input,25,FOLLOW_25_in_ignoredFlag399); 
					}
					break;
				case 12 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:56:7: '-dontskipnonpubliclibraryclassmembers'
					{
					match(input,26,FOLLOW_26_in_ignoredFlag407); 
					}
					break;
				case 13 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:57:7: '-allowaccessmodification'
					{
					match(input,15,FOLLOW_15_in_ignoredFlag415); 
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
	// $ANTLR end "ignoredFlag"


	public static class unsupportedFlag_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "unsupportedFlag"
	// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:61:9: private unsupportedFlag : ( '-skipnonpubliclibraryclasses' | ( '-keepdirectories' filter[directory_filter] ) | ( '-target' NAME ) | '-forceprocessing' | ( '-printusage' NAME ) | ( '-whyareyoukeeping' classSpecification ) | ( '-optimizations' filter[optimization_filter] ) | ( '-optimizationpasses' NAME ) | ( '-assumenosideeffects' classSpecification ) | '-mergeinterfacesaggressively' | '-overloadaggressively' | '-microedition' | ( '-renamesourcefileattribute' (sourceFile= NAME )? ) | '-ignorewarnings' | ( '-printconfiguration' ( NAME )? ) | ( '-dump' ( NAME )? ) | ( '-adaptclassstrings' filter[filter] ) | ( '-applymapping' mapping= NAME ) | '-obfuscationdictionary' obfuscationDictionary= NAME | '-classobfuscationdictionary' classObfuscationDictionary= NAME | '-packageobfuscationdictionary' packageObfuscationDictionary= NAME | '-printmapping' (outputMapping= NAME )? | ( '-keeppackagenames' filter[package_filter] ) | ( '-repackageclasses' ( '\\'' (newPackage= NAME )? '\\'' )? ) | ( '-flattenpackagehierarchy' ( '\\'' (newPackage= NAME )? '\\'' )? ) | ( '-printseeds' (seedOutputFile= NAME )? ) | ( '-adaptresourcefilenames' filter[file_filter] ) | ( '-adaptresourcefilecontents' filter[file_filter] ) | '-injars' inJars= classpath | '-outjars' outJars= classpath | '-libraryjars' libraryJars= classpath ) ;
	public final ProguardParser.unsupportedFlag_return unsupportedFlag() throws RecognitionException {
		ProguardParser.unsupportedFlag_return retval = new ProguardParser.unsupportedFlag_return();
		retval.start = input.LT(1);

		Token sourceFile=null;
		Token mapping=null;
		Token obfuscationDictionary=null;
		Token classObfuscationDictionary=null;
		Token packageObfuscationDictionary=null;
		Token outputMapping=null;
		Token newPackage=null;
		Token seedOutputFile=null;

		try {
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:62:3: ( ( '-skipnonpubliclibraryclasses' | ( '-keepdirectories' filter[directory_filter] ) | ( '-target' NAME ) | '-forceprocessing' | ( '-printusage' NAME ) | ( '-whyareyoukeeping' classSpecification ) | ( '-optimizations' filter[optimization_filter] ) | ( '-optimizationpasses' NAME ) | ( '-assumenosideeffects' classSpecification ) | '-mergeinterfacesaggressively' | '-overloadaggressively' | '-microedition' | ( '-renamesourcefileattribute' (sourceFile= NAME )? ) | '-ignorewarnings' | ( '-printconfiguration' ( NAME )? ) | ( '-dump' ( NAME )? ) | ( '-adaptclassstrings' filter[filter] ) | ( '-applymapping' mapping= NAME ) | '-obfuscationdictionary' obfuscationDictionary= NAME | '-classobfuscationdictionary' classObfuscationDictionary= NAME | '-packageobfuscationdictionary' packageObfuscationDictionary= NAME | '-printmapping' (outputMapping= NAME )? | ( '-keeppackagenames' filter[package_filter] ) | ( '-repackageclasses' ( '\\'' (newPackage= NAME )? '\\'' )? ) | ( '-flattenpackagehierarchy' ( '\\'' (newPackage= NAME )? '\\'' )? ) | ( '-printseeds' (seedOutputFile= NAME )? ) | ( '-adaptresourcefilenames' filter[file_filter] ) | ( '-adaptresourcefilecontents' filter[file_filter] ) | '-injars' inJars= classpath | '-outjars' outJars= classpath | '-libraryjars' libraryJars= classpath ) )
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:63:3: ( '-skipnonpubliclibraryclasses' | ( '-keepdirectories' filter[directory_filter] ) | ( '-target' NAME ) | '-forceprocessing' | ( '-printusage' NAME ) | ( '-whyareyoukeeping' classSpecification ) | ( '-optimizations' filter[optimization_filter] ) | ( '-optimizationpasses' NAME ) | ( '-assumenosideeffects' classSpecification ) | '-mergeinterfacesaggressively' | '-overloadaggressively' | '-microedition' | ( '-renamesourcefileattribute' (sourceFile= NAME )? ) | '-ignorewarnings' | ( '-printconfiguration' ( NAME )? ) | ( '-dump' ( NAME )? ) | ( '-adaptclassstrings' filter[filter] ) | ( '-applymapping' mapping= NAME ) | '-obfuscationdictionary' obfuscationDictionary= NAME | '-classobfuscationdictionary' classObfuscationDictionary= NAME | '-packageobfuscationdictionary' packageObfuscationDictionary= NAME | '-printmapping' (outputMapping= NAME )? | ( '-keeppackagenames' filter[package_filter] ) | ( '-repackageclasses' ( '\\'' (newPackage= NAME )? '\\'' )? ) | ( '-flattenpackagehierarchy' ( '\\'' (newPackage= NAME )? '\\'' )? ) | ( '-printseeds' (seedOutputFile= NAME )? ) | ( '-adaptresourcefilenames' filter[file_filter] ) | ( '-adaptresourcefilecontents' filter[file_filter] ) | '-injars' inJars= classpath | '-outjars' outJars= classpath | '-libraryjars' libraryJars= classpath )
			{
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:63:3: ( '-skipnonpubliclibraryclasses' | ( '-keepdirectories' filter[directory_filter] ) | ( '-target' NAME ) | '-forceprocessing' | ( '-printusage' NAME ) | ( '-whyareyoukeeping' classSpecification ) | ( '-optimizations' filter[optimization_filter] ) | ( '-optimizationpasses' NAME ) | ( '-assumenosideeffects' classSpecification ) | '-mergeinterfacesaggressively' | '-overloadaggressively' | '-microedition' | ( '-renamesourcefileattribute' (sourceFile= NAME )? ) | '-ignorewarnings' | ( '-printconfiguration' ( NAME )? ) | ( '-dump' ( NAME )? ) | ( '-adaptclassstrings' filter[filter] ) | ( '-applymapping' mapping= NAME ) | '-obfuscationdictionary' obfuscationDictionary= NAME | '-classobfuscationdictionary' classObfuscationDictionary= NAME | '-packageobfuscationdictionary' packageObfuscationDictionary= NAME | '-printmapping' (outputMapping= NAME )? | ( '-keeppackagenames' filter[package_filter] ) | ( '-repackageclasses' ( '\\'' (newPackage= NAME )? '\\'' )? ) | ( '-flattenpackagehierarchy' ( '\\'' (newPackage= NAME )? '\\'' )? ) | ( '-printseeds' (seedOutputFile= NAME )? ) | ( '-adaptresourcefilenames' filter[file_filter] ) | ( '-adaptresourcefilecontents' filter[file_filter] ) | '-injars' inJars= classpath | '-outjars' outJars= classpath | '-libraryjars' libraryJars= classpath )
			int alt15=31;
			switch ( input.LA(1) ) {
			case 60:
				{
				alt15=1;
				}
				break;
			case 41:
				{
				alt15=2;
				}
				break;
			case 61:
				{
				alt15=3;
				}
				break;
			case 31:
				{
				alt15=4;
				}
				break;
			case 57:
				{
				alt15=5;
				}
				break;
			case 64:
				{
				alt15=6;
				}
				break;
			case 50:
				{
				alt15=7;
				}
				break;
			case 49:
				{
				alt15=8;
				}
				break;
			case 17:
				{
				alt15=9;
				}
				break;
			case 46:
				{
				alt15=10;
				}
				break;
			case 52:
				{
				alt15=11;
				}
				break;
			case 47:
				{
				alt15=12;
				}
				break;
			case 58:
				{
				alt15=13;
				}
				break;
			case 32:
				{
				alt15=14;
				}
				break;
			case 54:
				{
				alt15=15;
				}
				break;
			case 29:
				{
				alt15=16;
				}
				break;
			case 12:
				{
				alt15=17;
				}
				break;
			case 16:
				{
				alt15=18;
				}
				break;
			case 48:
				{
				alt15=19;
				}
				break;
			case 19:
				{
				alt15=20;
				}
				break;
			case 53:
				{
				alt15=21;
				}
				break;
			case 55:
				{
				alt15=22;
				}
				break;
			case 43:
				{
				alt15=23;
				}
				break;
			case 59:
				{
				alt15=24;
				}
				break;
			case 30:
				{
				alt15=25;
				}
				break;
			case 56:
				{
				alt15=26;
				}
				break;
			case 14:
				{
				alt15=27;
				}
				break;
			case 13:
				{
				alt15=28;
				}
				break;
			case 34:
				{
				alt15=29;
				}
				break;
			case 51:
				{
				alt15=30;
				}
				break;
			case 45:
				{
				alt15=31;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}
			switch (alt15) {
				case 1 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:63:4: '-skipnonpubliclibraryclasses'
					{
					match(input,60,FOLLOW_60_in_unsupportedFlag437); 
					}
					break;
				case 2 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:64:7: ( '-keepdirectories' filter[directory_filter] )
					{
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:64:7: ( '-keepdirectories' filter[directory_filter] )
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:64:8: '-keepdirectories' filter[directory_filter]
					{
					match(input,41,FOLLOW_41_in_unsupportedFlag446); 
					FilterSpecification directory_filter = new FilterSpecification();
					pushFollow(FOLLOW_filter_in_unsupportedFlag450);
					filter(directory_filter);
					state._fsp--;

					}

					}
					break;
				case 3 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:65:7: ( '-target' NAME )
					{
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:65:7: ( '-target' NAME )
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:65:8: '-target' NAME
					{
					match(input,61,FOLLOW_61_in_unsupportedFlag461); 
					match(input,NAME,FOLLOW_NAME_in_unsupportedFlag463); 
					}

					}
					break;
				case 4 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:66:7: '-forceprocessing'
					{
					match(input,31,FOLLOW_31_in_unsupportedFlag473); 
					}
					break;
				case 5 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:67:7: ( '-printusage' NAME )
					{
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:67:7: ( '-printusage' NAME )
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:67:8: '-printusage' NAME
					{
					match(input,57,FOLLOW_57_in_unsupportedFlag482); 
					match(input,NAME,FOLLOW_NAME_in_unsupportedFlag484); 
					}

					}
					break;
				case 6 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:68:7: ( '-whyareyoukeeping' classSpecification )
					{
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:68:7: ( '-whyareyoukeeping' classSpecification )
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:68:8: '-whyareyoukeeping' classSpecification
					{
					match(input,64,FOLLOW_64_in_unsupportedFlag495); 
					pushFollow(FOLLOW_classSpecification_in_unsupportedFlag497);
					classSpecification();
					state._fsp--;

					}

					}
					break;
				case 7 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:69:7: ( '-optimizations' filter[optimization_filter] )
					{
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:69:7: ( '-optimizations' filter[optimization_filter] )
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:69:8: '-optimizations' filter[optimization_filter]
					{
					match(input,50,FOLLOW_50_in_unsupportedFlag507); 
					FilterSpecification optimization_filter = new FilterSpecification();
					pushFollow(FOLLOW_filter_in_unsupportedFlag511);
					filter(optimization_filter);
					state._fsp--;

					}

					}
					break;
				case 8 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:70:7: ( '-optimizationpasses' NAME )
					{
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:70:7: ( '-optimizationpasses' NAME )
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:70:8: '-optimizationpasses' NAME
					{
					match(input,49,FOLLOW_49_in_unsupportedFlag522); 
					match(input,NAME,FOLLOW_NAME_in_unsupportedFlag524); 
					}

					}
					break;
				case 9 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:71:7: ( '-assumenosideeffects' classSpecification )
					{
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:71:7: ( '-assumenosideeffects' classSpecification )
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:71:8: '-assumenosideeffects' classSpecification
					{
					match(input,17,FOLLOW_17_in_unsupportedFlag535); 
					pushFollow(FOLLOW_classSpecification_in_unsupportedFlag537);
					classSpecification();
					state._fsp--;

					}

					}
					break;
				case 10 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:72:7: '-mergeinterfacesaggressively'
					{
					match(input,46,FOLLOW_46_in_unsupportedFlag546); 
					}
					break;
				case 11 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:73:7: '-overloadaggressively'
					{
					match(input,52,FOLLOW_52_in_unsupportedFlag554); 
					}
					break;
				case 12 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:74:7: '-microedition'
					{
					match(input,47,FOLLOW_47_in_unsupportedFlag562); 
					}
					break;
				case 13 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:75:7: ( '-renamesourcefileattribute' (sourceFile= NAME )? )
					{
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:75:7: ( '-renamesourcefileattribute' (sourceFile= NAME )? )
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:75:8: '-renamesourcefileattribute' (sourceFile= NAME )?
					{
					match(input,58,FOLLOW_58_in_unsupportedFlag571); 
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:75:47: (sourceFile= NAME )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==NAME) ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:75:47: sourceFile= NAME
							{
							sourceFile=(Token)match(input,NAME,FOLLOW_NAME_in_unsupportedFlag575); 
							}
							break;

					}

					}

					}
					break;
				case 14 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:76:7: '-ignorewarnings'
					{
					match(input,32,FOLLOW_32_in_unsupportedFlag585); 
					}
					break;
				case 15 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:77:7: ( '-printconfiguration' ( NAME )? )
					{
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:77:7: ( '-printconfiguration' ( NAME )? )
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:77:8: '-printconfiguration' ( NAME )?
					{
					match(input,54,FOLLOW_54_in_unsupportedFlag594); 
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:77:30: ( NAME )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0==NAME) ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:77:30: NAME
							{
							match(input,NAME,FOLLOW_NAME_in_unsupportedFlag596); 
							}
							break;

					}

					}

					}
					break;
				case 16 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:78:7: ( '-dump' ( NAME )? )
					{
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:78:7: ( '-dump' ( NAME )? )
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:78:8: '-dump' ( NAME )?
					{
					match(input,29,FOLLOW_29_in_unsupportedFlag608); 
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:78:16: ( NAME )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==NAME) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:78:16: NAME
							{
							match(input,NAME,FOLLOW_NAME_in_unsupportedFlag610); 
							}
							break;

					}

					}

					}
					break;
				case 17 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:79:7: ( '-adaptclassstrings' filter[filter] )
					{
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:79:7: ( '-adaptclassstrings' filter[filter] )
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:79:8: '-adaptclassstrings' filter[filter]
					{
					match(input,12,FOLLOW_12_in_unsupportedFlag622); 
					FilterSpecification filter = new FilterSpecification();
					pushFollow(FOLLOW_filter_in_unsupportedFlag626);
					filter(filter);
					state._fsp--;

					}

					}
					break;
				case 18 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:80:7: ( '-applymapping' mapping= NAME )
					{
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:80:7: ( '-applymapping' mapping= NAME )
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:80:8: '-applymapping' mapping= NAME
					{
					match(input,16,FOLLOW_16_in_unsupportedFlag637); 
					mapping=(Token)match(input,NAME,FOLLOW_NAME_in_unsupportedFlag641); 
					}

					}
					break;
				case 19 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:81:7: '-obfuscationdictionary' obfuscationDictionary= NAME
					{
					match(input,48,FOLLOW_48_in_unsupportedFlag651); 
					obfuscationDictionary=(Token)match(input,NAME,FOLLOW_NAME_in_unsupportedFlag655); 
					}
					break;
				case 20 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:82:7: '-classobfuscationdictionary' classObfuscationDictionary= NAME
					{
					match(input,19,FOLLOW_19_in_unsupportedFlag663); 
					classObfuscationDictionary=(Token)match(input,NAME,FOLLOW_NAME_in_unsupportedFlag667); 
					}
					break;
				case 21 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:83:7: '-packageobfuscationdictionary' packageObfuscationDictionary= NAME
					{
					match(input,53,FOLLOW_53_in_unsupportedFlag675); 
					packageObfuscationDictionary=(Token)match(input,NAME,FOLLOW_NAME_in_unsupportedFlag679); 
					}
					break;
				case 22 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:84:7: '-printmapping' (outputMapping= NAME )?
					{
					match(input,55,FOLLOW_55_in_unsupportedFlag687); 
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:84:36: (outputMapping= NAME )?
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0==NAME) ) {
						alt9=1;
					}
					switch (alt9) {
						case 1 :
							// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:84:36: outputMapping= NAME
							{
							outputMapping=(Token)match(input,NAME,FOLLOW_NAME_in_unsupportedFlag691); 
							}
							break;

					}

					}
					break;
				case 23 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:85:7: ( '-keeppackagenames' filter[package_filter] )
					{
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:85:7: ( '-keeppackagenames' filter[package_filter] )
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:85:8: '-keeppackagenames' filter[package_filter]
					{
					match(input,43,FOLLOW_43_in_unsupportedFlag701); 
					FilterSpecification package_filter = new FilterSpecification();
					pushFollow(FOLLOW_filter_in_unsupportedFlag705);
					filter(package_filter);
					state._fsp--;

					}

					}
					break;
				case 24 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:86:7: ( '-repackageclasses' ( '\\'' (newPackage= NAME )? '\\'' )? )
					{
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:86:7: ( '-repackageclasses' ( '\\'' (newPackage= NAME )? '\\'' )? )
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:86:8: '-repackageclasses' ( '\\'' (newPackage= NAME )? '\\'' )?
					{
					match(input,59,FOLLOW_59_in_unsupportedFlag717); 
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:86:28: ( '\\'' (newPackage= NAME )? '\\'' )?
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0==72) ) {
						alt11=1;
					}
					switch (alt11) {
						case 1 :
							// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:86:29: '\\'' (newPackage= NAME )? '\\''
							{
							match(input,72,FOLLOW_72_in_unsupportedFlag720); 
							// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:86:44: (newPackage= NAME )?
							int alt10=2;
							int LA10_0 = input.LA(1);
							if ( (LA10_0==NAME) ) {
								alt10=1;
							}
							switch (alt10) {
								case 1 :
									// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:86:44: newPackage= NAME
									{
									newPackage=(Token)match(input,NAME,FOLLOW_NAME_in_unsupportedFlag724); 
									}
									break;

							}

							match(input,72,FOLLOW_72_in_unsupportedFlag727); 
							}
							break;

					}

					}

					}
					break;
				case 25 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:87:7: ( '-flattenpackagehierarchy' ( '\\'' (newPackage= NAME )? '\\'' )? )
					{
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:87:7: ( '-flattenpackagehierarchy' ( '\\'' (newPackage= NAME )? '\\'' )? )
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:87:8: '-flattenpackagehierarchy' ( '\\'' (newPackage= NAME )? '\\'' )?
					{
					match(input,30,FOLLOW_30_in_unsupportedFlag740); 
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:87:35: ( '\\'' (newPackage= NAME )? '\\'' )?
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( (LA13_0==72) ) {
						alt13=1;
					}
					switch (alt13) {
						case 1 :
							// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:87:36: '\\'' (newPackage= NAME )? '\\''
							{
							match(input,72,FOLLOW_72_in_unsupportedFlag743); 
							// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:87:51: (newPackage= NAME )?
							int alt12=2;
							int LA12_0 = input.LA(1);
							if ( (LA12_0==NAME) ) {
								alt12=1;
							}
							switch (alt12) {
								case 1 :
									// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:87:51: newPackage= NAME
									{
									newPackage=(Token)match(input,NAME,FOLLOW_NAME_in_unsupportedFlag747); 
									}
									break;

							}

							match(input,72,FOLLOW_72_in_unsupportedFlag750); 
							}
							break;

					}

					}

					}
					break;
				case 26 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:88:7: ( '-printseeds' (seedOutputFile= NAME )? )
					{
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:88:7: ( '-printseeds' (seedOutputFile= NAME )? )
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:88:8: '-printseeds' (seedOutputFile= NAME )?
					{
					match(input,56,FOLLOW_56_in_unsupportedFlag763); 
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:88:36: (seedOutputFile= NAME )?
					int alt14=2;
					int LA14_0 = input.LA(1);
					if ( (LA14_0==NAME) ) {
						alt14=1;
					}
					switch (alt14) {
						case 1 :
							// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:88:36: seedOutputFile= NAME
							{
							seedOutputFile=(Token)match(input,NAME,FOLLOW_NAME_in_unsupportedFlag767); 
							}
							break;

					}

					}

					}
					break;
				case 27 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:89:7: ( '-adaptresourcefilenames' filter[file_filter] )
					{
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:89:7: ( '-adaptresourcefilenames' filter[file_filter] )
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:89:8: '-adaptresourcefilenames' filter[file_filter]
					{
					match(input,14,FOLLOW_14_in_unsupportedFlag779); 
					FilterSpecification file_filter = new FilterSpecification();
					pushFollow(FOLLOW_filter_in_unsupportedFlag783);
					filter(file_filter);
					state._fsp--;

					}

					}
					break;
				case 28 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:90:7: ( '-adaptresourcefilecontents' filter[file_filter] )
					{
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:90:7: ( '-adaptresourcefilecontents' filter[file_filter] )
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:90:8: '-adaptresourcefilecontents' filter[file_filter]
					{
					match(input,13,FOLLOW_13_in_unsupportedFlag795); 
					FilterSpecification file_filter = new FilterSpecification();
					pushFollow(FOLLOW_filter_in_unsupportedFlag799);
					filter(file_filter);
					state._fsp--;

					}

					}
					break;
				case 29 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:91:7: '-injars' inJars= classpath
					{
					match(input,34,FOLLOW_34_in_unsupportedFlag810); 
					pushFollow(FOLLOW_classpath_in_unsupportedFlag814);
					classpath();
					state._fsp--;

					}
					break;
				case 30 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:92:7: '-outjars' outJars= classpath
					{
					match(input,51,FOLLOW_51_in_unsupportedFlag822); 
					pushFollow(FOLLOW_classpath_in_unsupportedFlag826);
					classpath();
					state._fsp--;

					}
					break;
				case 31 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:93:7: '-libraryjars' libraryJars= classpath
					{
					match(input,45,FOLLOW_45_in_unsupportedFlag834); 
					pushFollow(FOLLOW_classpath_in_unsupportedFlag838);
					classpath();
					state._fsp--;

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
	// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:97:9: private classpath : NAME ( ( ':' | ';' ) classpath )? ;
	public final void classpath() throws RecognitionException {
		try {
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:98:3: ( NAME ( ( ':' | ';' ) classpath )? )
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:98:6: NAME ( ( ':' | ';' ) classpath )?
			{
			match(input,NAME,FOLLOW_NAME_in_classpath858); 
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:98:11: ( ( ':' | ';' ) classpath )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( ((LA16_0 >= 65 && LA16_0 <= 66)) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:98:12: ( ':' | ';' ) classpath
					{
					if ( (input.LA(1) >= 65 && input.LA(1) <= 66) ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_classpath_in_classpath867);
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
	// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:101:9: private filter[FilterSpecification filter] : ( nonEmptytFilter[filter] |);
	public final void filter(FilterSpecification filter) throws RecognitionException {
		try {
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:102:3: ( nonEmptytFilter[filter] |)
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( ((LA17_0 >= NAME && LA17_0 <= NEGATOR)) ) {
				alt17=1;
			}
			else if ( (LA17_0==EOF||(LA17_0 >= 12 && LA17_0 <= 64)||LA17_0==70) ) {
				alt17=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}

			switch (alt17) {
				case 1 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:103:3: nonEmptytFilter[filter]
					{
					pushFollow(FOLLOW_nonEmptytFilter_in_filter888);
					nonEmptytFilter(filter);
					state._fsp--;

					}
					break;
				case 2 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:104:5: 
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
	// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:108:9: private nonEmptytFilter[FilterSpecification filter] : ( ( NEGATOR )? NAME ( ',' nonEmptytFilter[filter] )? ) ;
	public final void nonEmptytFilter(FilterSpecification filter) throws RecognitionException {
		Token NAME1=null;


		  boolean negator = false;

		try {
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:112:3: ( ( ( NEGATOR )? NAME ( ',' nonEmptytFilter[filter] )? ) )
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:113:3: ( ( NEGATOR )? NAME ( ',' nonEmptytFilter[filter] )? )
			{
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:113:3: ( ( NEGATOR )? NAME ( ',' nonEmptytFilter[filter] )? )
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:113:4: ( NEGATOR )? NAME ( ',' nonEmptytFilter[filter] )?
			{
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:113:4: ( NEGATOR )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==NEGATOR) ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:113:5: NEGATOR
					{
					match(input,NEGATOR,FOLLOW_NEGATOR_in_nonEmptytFilter922); 
					negator=true;
					}
					break;

			}

			NAME1=(Token)match(input,NAME,FOLLOW_NAME_in_nonEmptytFilter928); 
			GrammarActions.filter(filter, negator, (NAME1!=null?NAME1.getText():null));
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:113:91: ( ',' nonEmptytFilter[filter] )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==11) ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:113:92: ',' nonEmptytFilter[filter]
					{
					match(input,11,FOLLOW_11_in_nonEmptytFilter933); 
					pushFollow(FOLLOW_nonEmptytFilter_in_nonEmptytFilter935);
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
	// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:116:9: private classSpecification returns [ClassSpecification classSpec] : ( annotation )? cType= classModifierAndType[modifier] ( NEGATOR )? NAME (inheritanceSpec= inheritance )? ( members[classSpec] )? ;
	public final ClassSpecification classSpecification() throws RecognitionException {
		ClassSpecification classSpec = null;


		Token NAME2=null;
		ClassTypeSpecification cType =null;
		InheritanceSpecification inheritanceSpec =null;
		AnnotationSpecification annotation3 =null;


		  ModifierSpecification modifier = new ModifierSpecification();
		  boolean hasNameNegator = false;

		try {
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:121:3: ( ( annotation )? cType= classModifierAndType[modifier] ( NEGATOR )? NAME (inheritanceSpec= inheritance )? ( members[classSpec] )? )
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:122:3: ( annotation )? cType= classModifierAndType[modifier] ( NEGATOR )? NAME (inheritanceSpec= inheritance )? ( members[classSpec] )?
			{
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:122:3: ( annotation )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==70) ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:122:4: annotation
					{
					pushFollow(FOLLOW_annotation_in_classSpecification965);
					annotation3=annotation();
					state._fsp--;

					}
					break;

			}

			pushFollow(FOLLOW_classModifierAndType_in_classSpecification973);
			cType=classModifierAndType(modifier);
			state._fsp--;

			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:124:3: ( NEGATOR )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==NEGATOR) ) {
				alt21=1;
			}
			switch (alt21) {
				case 1 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:124:4: NEGATOR
					{
					match(input,NEGATOR,FOLLOW_NEGATOR_in_classSpecification979); 
					hasNameNegator = true;
					}
					break;

			}

			NAME2=(Token)match(input,NAME,FOLLOW_NAME_in_classSpecification985); 
			classSpec = GrammarActions.classSpec((NAME2!=null?NAME2.getText():null), hasNameNegator, cType, annotation3, modifier);
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:125:3: (inheritanceSpec= inheritance )?
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==80||LA22_0==82) ) {
				alt22=1;
			}
			switch (alt22) {
				case 1 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:125:4: inheritanceSpec= inheritance
					{
					pushFollow(FOLLOW_inheritance_in_classSpecification994);
					inheritanceSpec=inheritance();
					state._fsp--;

					classSpec.setInheritance(inheritanceSpec);
					}
					break;

			}

			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:126:3: ( members[classSpec] )?
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==95) ) {
				alt23=1;
			}
			switch (alt23) {
				case 1 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:126:3: members[classSpec]
					{
					pushFollow(FOLLOW_members_in_classSpecification1002);
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
	// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:129:9: private classModifierAndType[ModifierSpecification modifier] returns [ClassTypeSpecification cType] : ( NEGATOR )? ( 'public' cmat= classModifierAndType[modifier] | 'abstract' cmat= classModifierAndType[modifier] | 'final' cmat= classModifierAndType[modifier] | classType ) ;
	public final ClassTypeSpecification classModifierAndType(ModifierSpecification modifier) throws RecognitionException {
		ClassTypeSpecification cType = null;


		ClassTypeSpecification cmat =null;
		int classType4 =0;


		  boolean hasNegator = false;

		try {
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:133:3: ( ( NEGATOR )? ( 'public' cmat= classModifierAndType[modifier] | 'abstract' cmat= classModifierAndType[modifier] | 'final' cmat= classModifierAndType[modifier] | classType ) )
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:134:3: ( NEGATOR )? ( 'public' cmat= classModifierAndType[modifier] | 'abstract' cmat= classModifierAndType[modifier] | 'final' cmat= classModifierAndType[modifier] | classType )
			{
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:134:3: ( NEGATOR )?
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==NEGATOR) ) {
				alt24=1;
			}
			switch (alt24) {
				case 1 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:134:4: NEGATOR
					{
					match(input,NEGATOR,FOLLOW_NEGATOR_in_classModifierAndType1031); 
					hasNegator = true;
					}
					break;

			}

			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:135:3: ( 'public' cmat= classModifierAndType[modifier] | 'abstract' cmat= classModifierAndType[modifier] | 'final' cmat= classModifierAndType[modifier] | classType )
			int alt25=4;
			switch ( input.LA(1) ) {
			case 87:
				{
				alt25=1;
				}
				break;
			case 73:
				{
				alt25=2;
				}
				break;
			case 81:
				{
				alt25=3;
				}
				break;
			case 78:
			case 79:
			case 83:
				{
				alt25=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				throw nvae;
			}
			switch (alt25) {
				case 1 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:136:3: 'public' cmat= classModifierAndType[modifier]
					{
					match(input,87,FOLLOW_87_in_classModifierAndType1043); 
					GrammarActions.addModifier(modifier, ACC_PUBLIC, hasNegator);
					pushFollow(FOLLOW_classModifierAndType_in_classModifierAndType1049);
					cmat=classModifierAndType(modifier);
					state._fsp--;

					cType = cmat;
					}
					break;
				case 2 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:137:5: 'abstract' cmat= classModifierAndType[modifier]
					{
					match(input,73,FOLLOW_73_in_classModifierAndType1058); 
					GrammarActions.addModifier(modifier, ACC_ABSTRACT, hasNegator);
					pushFollow(FOLLOW_classModifierAndType_in_classModifierAndType1064);
					cmat=classModifierAndType(modifier);
					state._fsp--;

					cType = cmat;
					}
					break;
				case 3 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:138:5: 'final' cmat= classModifierAndType[modifier]
					{
					match(input,81,FOLLOW_81_in_classModifierAndType1073); 
					GrammarActions.addModifier(modifier, ACC_FINAL, hasNegator);
					pushFollow(FOLLOW_classModifierAndType_in_classModifierAndType1079);
					cmat=classModifierAndType(modifier);
					state._fsp--;

					cType = cmat;
					}
					break;
				case 4 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:139:5: classType
					{
					pushFollow(FOLLOW_classType_in_classModifierAndType1088);
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
	// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:143:9: private classType returns [int type] : ( 'interface' | 'enum' | 'class' );
	public final int classType() throws RecognitionException {
		int type = 0;


		try {
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:144:3: ( 'interface' | 'enum' | 'class' )
			int alt26=3;
			switch ( input.LA(1) ) {
			case 83:
				{
				alt26=1;
				}
				break;
			case 79:
				{
				alt26=2;
				}
				break;
			case 78:
				{
				alt26=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 26, 0, input);
				throw nvae;
			}
			switch (alt26) {
				case 1 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:145:5: 'interface'
					{
					match(input,83,FOLLOW_83_in_classType1117); 
					type = ACC_INTERFACE;
					}
					break;
				case 2 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:146:5: 'enum'
					{
					match(input,79,FOLLOW_79_in_classType1125); 
					type = ACC_ENUM;
					}
					break;
				case 3 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:147:5: 'class'
					{
					match(input,78,FOLLOW_78_in_classType1133); 
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
	// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:150:9: private members[ClassSpecification classSpec] : '{' ( member[classSpec] )* '}' ;
	public final void members(ClassSpecification classSpec) throws RecognitionException {
		try {
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:151:3: ( '{' ( member[classSpec] )* '}' )
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:152:3: '{' ( member[classSpec] )* '}'
			{
			match(input,95,FOLLOW_95_in_members1154); 
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:153:5: ( member[classSpec] )*
			loop27:
			while (true) {
				int alt27=2;
				int LA27_0 = input.LA(1);
				if ( ((LA27_0 >= NAME && LA27_0 <= NEGATOR)||LA27_0==8||(LA27_0 >= 67 && LA27_0 <= 70)||LA27_0==73||LA27_0==77||LA27_0==81||(LA27_0 >= 84 && LA27_0 <= 94)) ) {
					alt27=1;
				}

				switch (alt27) {
				case 1 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:153:5: member[classSpec]
					{
					pushFollow(FOLLOW_member_in_members1160);
					member(classSpec);
					state._fsp--;

					}
					break;

				default :
					break loop27;
				}
			}

			match(input,96,FOLLOW_96_in_members1166); 
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
	// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:157:9: private member[ClassSpecification classSpec] : ( annotation )? modifiers ( (typeSig= type )? name= ( NAME | '<init>' ) (signature= arguments |) | '<methods>' | '<fields>' ) ';' ;
	public final void member(ClassSpecification classSpec) throws RecognitionException {
		Token name=null;
		String typeSig =null;
		String signature =null;
		AnnotationSpecification annotation5 =null;
		ModifierSpecification modifiers6 =null;

		try {
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:158:3: ( ( annotation )? modifiers ( (typeSig= type )? name= ( NAME | '<init>' ) (signature= arguments |) | '<methods>' | '<fields>' ) ';' )
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:159:5: ( annotation )? modifiers ( (typeSig= type )? name= ( NAME | '<init>' ) (signature= arguments |) | '<methods>' | '<fields>' ) ';'
			{
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:159:5: ( annotation )?
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==70) ) {
				alt28=1;
			}
			switch (alt28) {
				case 1 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:159:5: annotation
					{
					pushFollow(FOLLOW_annotation_in_member1187);
					annotation5=annotation();
					state._fsp--;

					}
					break;

			}

			pushFollow(FOLLOW_modifiers_in_member1190);
			modifiers6=modifiers();
			state._fsp--;

			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:160:5: ( (typeSig= type )? name= ( NAME | '<init>' ) (signature= arguments |) | '<methods>' | '<fields>' )
			int alt31=3;
			switch ( input.LA(1) ) {
			case NAME:
			case 8:
			case 68:
				{
				alt31=1;
				}
				break;
			case 69:
				{
				alt31=2;
				}
				break;
			case 67:
				{
				alt31=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 31, 0, input);
				throw nvae;
			}
			switch (alt31) {
				case 1 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:161:7: (typeSig= type )? name= ( NAME | '<init>' ) (signature= arguments |)
					{
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:161:7: (typeSig= type )?
					int alt29=2;
					int LA29_0 = input.LA(1);
					if ( (LA29_0==8) ) {
						alt29=1;
					}
					else if ( (LA29_0==NAME) ) {
						int LA29_2 = input.LA(2);
						if ( (LA29_2==NAME||LA29_2==68||LA29_2==71) ) {
							alt29=1;
						}
					}
					switch (alt29) {
						case 1 :
							// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:161:8: typeSig= type
							{
							pushFollow(FOLLOW_type_in_member1207);
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
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:161:44: (signature= arguments |)
					int alt30=2;
					int LA30_0 = input.LA(1);
					if ( (LA30_0==9) ) {
						alt30=1;
					}
					else if ( (LA30_0==66) ) {
						alt30=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 30, 0, input);
						throw nvae;
					}

					switch (alt30) {
						case 1 :
							// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:161:45: signature= arguments
							{
							pushFollow(FOLLOW_arguments_in_member1222);
							signature=arguments();
							state._fsp--;

							GrammarActions.method(classSpec, annotation5, typeSig, (name!=null?name.getText():null), signature, modifiers6);
							}
							break;
						case 2 :
							// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:162:21: 
							{
							GrammarActions.fieldOrAnyMember(classSpec, annotation5, typeSig, (name!=null?name.getText():null), modifiers6);
							}
							break;

					}

					}
					break;
				case 2 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:163:9: '<methods>'
					{
					match(input,69,FOLLOW_69_in_member1257); 
					GrammarActions.method(classSpec, annotation5,
					          GrammarActions.getSignature("***", 0), "*", "("+ GrammarActions.getSignature("...", 0) + ")",
					          modifiers6);
					}
					break;
				case 3 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:166:9: '<fields>'
					{
					match(input,67,FOLLOW_67_in_member1269); 
					GrammarActions.field(classSpec, annotation5, null, "*", modifiers6);
					}
					break;

			}

			match(input,66,FOLLOW_66_in_member1279); 
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
	// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:170:9: private annotation returns [AnnotationSpecification annotSpec] : '@' ( NEGATOR )? NAME ;
	public final AnnotationSpecification annotation() throws RecognitionException {
		AnnotationSpecification annotSpec = null;


		Token NAME7=null;


		  boolean hasNameNegator = false;

		try {
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:174:3: ( '@' ( NEGATOR )? NAME )
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:174:6: '@' ( NEGATOR )? NAME
			{
			match(input,70,FOLLOW_70_in_annotation1303); 
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:174:10: ( NEGATOR )?
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==NEGATOR) ) {
				alt32=1;
			}
			switch (alt32) {
				case 1 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:174:11: NEGATOR
					{
					match(input,NEGATOR,FOLLOW_NEGATOR_in_annotation1306); 
					hasNameNegator = true;
					}
					break;

			}

			NAME7=(Token)match(input,NAME,FOLLOW_NAME_in_annotation1312); 
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
	// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:176:9: private modifiers returns [ModifierSpecification modifiers] : ( modifier[modifiers] )* ;
	public final ModifierSpecification modifiers() throws RecognitionException {
		ModifierSpecification modifiers = null;



		  modifiers = new ModifierSpecification();

		try {
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:180:3: ( ( modifier[modifiers] )* )
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:181:3: ( modifier[modifiers] )*
			{
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:181:3: ( modifier[modifiers] )*
			loop33:
			while (true) {
				int alt33=2;
				int LA33_0 = input.LA(1);
				if ( (LA33_0==NEGATOR||LA33_0==73||LA33_0==77||LA33_0==81||(LA33_0 >= 84 && LA33_0 <= 94)) ) {
					alt33=1;
				}

				switch (alt33) {
				case 1 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:181:3: modifier[modifiers]
					{
					pushFollow(FOLLOW_modifier_in_modifiers1336);
					modifier(modifiers);
					state._fsp--;

					}
					break;

				default :
					break loop33;
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
	// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:184:9: private modifier[ModifierSpecification modifiers] : ( NEGATOR )? ( 'public' | 'private' | 'protected' | 'static' | 'synchronized' | 'volatile' | 'native' | 'abstract' | 'strictfp' | 'final' | 'transient' | 'synthetic' | 'bridge' | 'varargs' ) ;
	public final void modifier(ModifierSpecification modifiers) throws RecognitionException {

		  boolean hasNegator = false;

		try {
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:188:3: ( ( NEGATOR )? ( 'public' | 'private' | 'protected' | 'static' | 'synchronized' | 'volatile' | 'native' | 'abstract' | 'strictfp' | 'final' | 'transient' | 'synthetic' | 'bridge' | 'varargs' ) )
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:189:3: ( NEGATOR )? ( 'public' | 'private' | 'protected' | 'static' | 'synchronized' | 'volatile' | 'native' | 'abstract' | 'strictfp' | 'final' | 'transient' | 'synthetic' | 'bridge' | 'varargs' )
			{
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:189:3: ( NEGATOR )?
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==NEGATOR) ) {
				alt34=1;
			}
			switch (alt34) {
				case 1 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:189:4: NEGATOR
					{
					match(input,NEGATOR,FOLLOW_NEGATOR_in_modifier1362); 
					hasNegator = true;
					}
					break;

			}

			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:190:3: ( 'public' | 'private' | 'protected' | 'static' | 'synchronized' | 'volatile' | 'native' | 'abstract' | 'strictfp' | 'final' | 'transient' | 'synthetic' | 'bridge' | 'varargs' )
			int alt35=14;
			switch ( input.LA(1) ) {
			case 87:
				{
				alt35=1;
				}
				break;
			case 85:
				{
				alt35=2;
				}
				break;
			case 86:
				{
				alt35=3;
				}
				break;
			case 88:
				{
				alt35=4;
				}
				break;
			case 90:
				{
				alt35=5;
				}
				break;
			case 94:
				{
				alt35=6;
				}
				break;
			case 84:
				{
				alt35=7;
				}
				break;
			case 73:
				{
				alt35=8;
				}
				break;
			case 89:
				{
				alt35=9;
				}
				break;
			case 81:
				{
				alt35=10;
				}
				break;
			case 92:
				{
				alt35=11;
				}
				break;
			case 91:
				{
				alt35=12;
				}
				break;
			case 77:
				{
				alt35=13;
				}
				break;
			case 93:
				{
				alt35=14;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 35, 0, input);
				throw nvae;
			}
			switch (alt35) {
				case 1 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:191:5: 'public'
					{
					match(input,87,FOLLOW_87_in_modifier1376); 
					modifiers.addModifier(ACC_PUBLIC, hasNegator);
					}
					break;
				case 2 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:192:7: 'private'
					{
					match(input,85,FOLLOW_85_in_modifier1386); 
					modifiers.addModifier(ACC_PRIVATE, hasNegator);
					}
					break;
				case 3 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:193:7: 'protected'
					{
					match(input,86,FOLLOW_86_in_modifier1396); 
					modifiers.addModifier(ACC_PROTECTED, hasNegator);
					}
					break;
				case 4 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:194:7: 'static'
					{
					match(input,88,FOLLOW_88_in_modifier1406); 
					modifiers.addModifier(ACC_STATIC, hasNegator);
					}
					break;
				case 5 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:195:7: 'synchronized'
					{
					match(input,90,FOLLOW_90_in_modifier1416); 
					modifiers.addModifier(ACC_SYNCHRONIZED, hasNegator);
					}
					break;
				case 6 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:196:7: 'volatile'
					{
					match(input,94,FOLLOW_94_in_modifier1426); 
					modifiers.addModifier(ACC_VOLATILE, hasNegator);
					}
					break;
				case 7 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:197:7: 'native'
					{
					match(input,84,FOLLOW_84_in_modifier1436); 
					modifiers.addModifier(ACC_NATIVE, hasNegator);
					}
					break;
				case 8 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:198:7: 'abstract'
					{
					match(input,73,FOLLOW_73_in_modifier1446); 
					modifiers.addModifier(ACC_ABSTRACT, hasNegator);
					}
					break;
				case 9 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:199:7: 'strictfp'
					{
					match(input,89,FOLLOW_89_in_modifier1456); 
					modifiers.addModifier(ACC_STRICT, hasNegator);
					}
					break;
				case 10 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:200:7: 'final'
					{
					match(input,81,FOLLOW_81_in_modifier1466); 
					modifiers.addModifier(ACC_FINAL, hasNegator);
					}
					break;
				case 11 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:201:7: 'transient'
					{
					match(input,92,FOLLOW_92_in_modifier1476); 
					modifiers.addModifier(ACC_TRANSIENT, hasNegator);
					}
					break;
				case 12 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:202:7: 'synthetic'
					{
					match(input,91,FOLLOW_91_in_modifier1486); 
					modifiers.addModifier(ACC_SYNTHETIC, hasNegator);
					}
					break;
				case 13 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:203:7: 'bridge'
					{
					match(input,77,FOLLOW_77_in_modifier1496); 
					modifiers.addModifier(ACC_BRIDGE, hasNegator);
					}
					break;
				case 14 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:204:7: 'varargs'
					{
					match(input,93,FOLLOW_93_in_modifier1506); 
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
	// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:208:9: private inheritance returns [InheritanceSpecification inheritanceSpec] : ( 'extends' | 'implements' ) ( annotation )? ( NEGATOR )? NAME ;
	public final InheritanceSpecification inheritance() throws RecognitionException {
		InheritanceSpecification inheritanceSpec = null;


		Token NAME8=null;
		AnnotationSpecification annotation9 =null;


		  boolean hasNameNegator = false;

		try {
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:212:3: ( ( 'extends' | 'implements' ) ( annotation )? ( NEGATOR )? NAME )
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:213:3: ( 'extends' | 'implements' ) ( annotation )? ( NEGATOR )? NAME
			{
			if ( input.LA(1)==80||input.LA(1)==82 ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:214:3: ( annotation )?
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==70) ) {
				alt36=1;
			}
			switch (alt36) {
				case 1 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:214:3: annotation
					{
					pushFollow(FOLLOW_annotation_in_inheritance1547);
					annotation9=annotation();
					state._fsp--;

					}
					break;

			}

			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:214:15: ( NEGATOR )?
			int alt37=2;
			int LA37_0 = input.LA(1);
			if ( (LA37_0==NEGATOR) ) {
				alt37=1;
			}
			switch (alt37) {
				case 1 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:214:16: NEGATOR
					{
					match(input,NEGATOR,FOLLOW_NEGATOR_in_inheritance1551); 
					hasNameNegator = true;
					}
					break;

			}

			NAME8=(Token)match(input,NAME,FOLLOW_NAME_in_inheritance1557); 
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
	// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:216:9: private arguments returns [String signature] : '(' ( (parameterSig= type ( ',' parameterSig= type )* )? ) ')' ;
	public final String arguments() throws RecognitionException {
		String signature = null;


		String parameterSig =null;

		try {
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:217:3: ( '(' ( (parameterSig= type ( ',' parameterSig= type )* )? ) ')' )
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:218:3: '(' ( (parameterSig= type ( ',' parameterSig= type )* )? ) ')'
			{
			match(input,9,FOLLOW_9_in_arguments1577); 
			signature = "(";
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:219:5: ( (parameterSig= type ( ',' parameterSig= type )* )? )
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:220:7: (parameterSig= type ( ',' parameterSig= type )* )?
			{
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:220:7: (parameterSig= type ( ',' parameterSig= type )* )?
			int alt39=2;
			int LA39_0 = input.LA(1);
			if ( (LA39_0==NAME||LA39_0==8) ) {
				alt39=1;
			}
			switch (alt39) {
				case 1 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:221:9: parameterSig= type ( ',' parameterSig= type )*
					{
					pushFollow(FOLLOW_type_in_arguments1605);
					parameterSig=type();
					state._fsp--;

					signature += parameterSig;
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:222:9: ( ',' parameterSig= type )*
					loop38:
					while (true) {
						int alt38=2;
						int LA38_0 = input.LA(1);
						if ( (LA38_0==11) ) {
							alt38=1;
						}

						switch (alt38) {
						case 1 :
							// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:222:10: ',' parameterSig= type
							{
							match(input,11,FOLLOW_11_in_arguments1618); 
							pushFollow(FOLLOW_type_in_arguments1622);
							parameterSig=type();
							state._fsp--;

							signature += parameterSig;
							}
							break;

						default :
							break loop38;
						}
					}

					}
					break;

			}

			}

			match(input,10,FOLLOW_10_in_arguments1651); 
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
	// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:228:9: private type returns [String signature] : (typeName= '%' | (typeName= NAME ( '[]' )* ) ) ;
	public final String type() throws RecognitionException {
		String signature = null;


		Token typeName=null;


		  int dim = 0;

		try {
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:232:3: ( (typeName= '%' | (typeName= NAME ( '[]' )* ) ) )
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:233:3: (typeName= '%' | (typeName= NAME ( '[]' )* ) )
			{
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:233:3: (typeName= '%' | (typeName= NAME ( '[]' )* ) )
			int alt41=2;
			int LA41_0 = input.LA(1);
			if ( (LA41_0==8) ) {
				alt41=1;
			}
			else if ( (LA41_0==NAME) ) {
				alt41=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 41, 0, input);
				throw nvae;
			}

			switch (alt41) {
				case 1 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:234:5: typeName= '%'
					{
					typeName=(Token)match(input,8,FOLLOW_8_in_type1687); 
					String sig = (typeName!=null?typeName.getText():null); signature = GrammarActions.getSignature(sig == null ? "" : sig, 0);
					}
					break;
				case 2 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:236:5: (typeName= NAME ( '[]' )* )
					{
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:236:5: (typeName= NAME ( '[]' )* )
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:236:6: typeName= NAME ( '[]' )*
					{
					typeName=(Token)match(input,NAME,FOLLOW_NAME_in_type1704); 
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:236:20: ( '[]' )*
					loop40:
					while (true) {
						int alt40=2;
						int LA40_0 = input.LA(1);
						if ( (LA40_0==71) ) {
							alt40=1;
						}

						switch (alt40) {
						case 1 :
							// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:236:21: '[]'
							{
							match(input,71,FOLLOW_71_in_type1707); 
							dim++;
							}
							break;

						default :
							break loop40;
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
	// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:240:9: private keepOptionModifier returns [KeepModifier modifier] : ',' ( 'allowshrinking' | 'allowoptimization' | 'allowobfuscation' ) ;
	public final KeepModifier keepOptionModifier() throws RecognitionException {
		KeepModifier modifier = null;


		try {
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:241:3: ( ',' ( 'allowshrinking' | 'allowoptimization' | 'allowobfuscation' ) )
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:241:5: ',' ( 'allowshrinking' | 'allowoptimization' | 'allowobfuscation' )
			{
			match(input,11,FOLLOW_11_in_keepOptionModifier1738); 
			// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:242:3: ( 'allowshrinking' | 'allowoptimization' | 'allowobfuscation' )
			int alt42=3;
			switch ( input.LA(1) ) {
			case 76:
				{
				alt42=1;
				}
				break;
			case 75:
				{
				alt42=2;
				}
				break;
			case 74:
				{
				alt42=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 42, 0, input);
				throw nvae;
			}
			switch (alt42) {
				case 1 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:242:4: 'allowshrinking'
					{
					match(input,76,FOLLOW_76_in_keepOptionModifier1743); 
					modifier = KeepModifier.ALLOW_SHRINKING;
					}
					break;
				case 2 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:243:5: 'allowoptimization'
					{
					match(input,75,FOLLOW_75_in_keepOptionModifier1751); 
					}
					break;
				case 3 :
					// /usr/local/google/home/android-devtools-build/jenkins-slave-agent/workspace/tools-2.0-rel-publish/tools/base/build-system/builder/src/main/java/com/android/builder/shrinker/parser/Proguard.g:244:5: 'allowobfuscation'
					{
					match(input,74,FOLLOW_74_in_keepOptionModifier1758); 
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
	public static final BitSet FOLLOW_24_in_prog163 = new BitSet(new long[]{0xFFFFFFFFFFFFF000L,0x0000000000000041L});
	public static final BitSet FOLLOW_22_in_prog175 = new BitSet(new long[]{0xFFFFFFFFFFFFF000L,0x0000000000000041L});
	public static final BitSet FOLLOW_23_in_prog188 = new BitSet(new long[]{0xFFFFFFFFFFFFF000L,0x0000000000000041L});
	public static final BitSet FOLLOW_21_in_prog201 = new BitSet(new long[]{0xFFFFFFFFFFFFF000L,0x0000000000000041L});
	public static final BitSet FOLLOW_ignoredFlag_in_prog212 = new BitSet(new long[]{0xFFFFFFFFFFFFF000L,0x0000000000000041L});
	public static final BitSet FOLLOW_unsupportedFlag_in_prog223 = new BitSet(new long[]{0xFFFFFFFFFFFFF000L,0x0000000000000041L});
	public static final BitSet FOLLOW_EOF_in_prog235 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_44_in_ignoredFlag264 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_36_in_ignoredFlag273 = new BitSet(new long[]{0x0000000000000060L});
	public static final BitSet FOLLOW_filter_in_ignoredFlag277 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_39_in_ignoredFlag289 = new BitSet(new long[]{0x0000000000000040L,0x00000000008AC240L});
	public static final BitSet FOLLOW_classSpecification_in_ignoredFlag293 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_ignoredFlag305 = new BitSet(new long[]{0x0000000000000040L,0x00000000008AC240L});
	public static final BitSet FOLLOW_classSpecification_in_ignoredFlag309 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_ignoredFlag321 = new BitSet(new long[]{0x0000000000000040L,0x00000000008AC240L});
	public static final BitSet FOLLOW_classSpecification_in_ignoredFlag325 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_63_in_ignoredFlag335 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_27_in_ignoredFlag343 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_62_in_ignoredFlag351 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_ignoredFlag365 = new BitSet(new long[]{0x0000000000000060L});
	public static final BitSet FOLLOW_filter_in_ignoredFlag369 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_ignoredFlag380 = new BitSet(new long[]{0x0000000000000060L});
	public static final BitSet FOLLOW_filter_in_ignoredFlag384 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_ignoredFlag399 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_ignoredFlag407 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_ignoredFlag415 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_60_in_unsupportedFlag437 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_unsupportedFlag446 = new BitSet(new long[]{0x0000000000000060L});
	public static final BitSet FOLLOW_filter_in_unsupportedFlag450 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_61_in_unsupportedFlag461 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_NAME_in_unsupportedFlag463 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_31_in_unsupportedFlag473 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_57_in_unsupportedFlag482 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_NAME_in_unsupportedFlag484 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_64_in_unsupportedFlag495 = new BitSet(new long[]{0x0000000000000040L,0x00000000008AC240L});
	public static final BitSet FOLLOW_classSpecification_in_unsupportedFlag497 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_50_in_unsupportedFlag507 = new BitSet(new long[]{0x0000000000000060L});
	public static final BitSet FOLLOW_filter_in_unsupportedFlag511 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_unsupportedFlag522 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_NAME_in_unsupportedFlag524 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_unsupportedFlag535 = new BitSet(new long[]{0x0000000000000040L,0x00000000008AC240L});
	public static final BitSet FOLLOW_classSpecification_in_unsupportedFlag537 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_46_in_unsupportedFlag546 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_unsupportedFlag554 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_47_in_unsupportedFlag562 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_58_in_unsupportedFlag571 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_NAME_in_unsupportedFlag575 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_unsupportedFlag585 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_54_in_unsupportedFlag594 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_NAME_in_unsupportedFlag596 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_29_in_unsupportedFlag608 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_NAME_in_unsupportedFlag610 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_unsupportedFlag622 = new BitSet(new long[]{0x0000000000000060L});
	public static final BitSet FOLLOW_filter_in_unsupportedFlag626 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_unsupportedFlag637 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_NAME_in_unsupportedFlag641 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_unsupportedFlag651 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_NAME_in_unsupportedFlag655 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_unsupportedFlag663 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_NAME_in_unsupportedFlag667 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_unsupportedFlag675 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_NAME_in_unsupportedFlag679 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_55_in_unsupportedFlag687 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_NAME_in_unsupportedFlag691 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_unsupportedFlag701 = new BitSet(new long[]{0x0000000000000060L});
	public static final BitSet FOLLOW_filter_in_unsupportedFlag705 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_59_in_unsupportedFlag717 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
	public static final BitSet FOLLOW_72_in_unsupportedFlag720 = new BitSet(new long[]{0x0000000000000020L,0x0000000000000100L});
	public static final BitSet FOLLOW_NAME_in_unsupportedFlag724 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_72_in_unsupportedFlag727 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_30_in_unsupportedFlag740 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
	public static final BitSet FOLLOW_72_in_unsupportedFlag743 = new BitSet(new long[]{0x0000000000000020L,0x0000000000000100L});
	public static final BitSet FOLLOW_NAME_in_unsupportedFlag747 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_72_in_unsupportedFlag750 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_56_in_unsupportedFlag763 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_NAME_in_unsupportedFlag767 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_unsupportedFlag779 = new BitSet(new long[]{0x0000000000000060L});
	public static final BitSet FOLLOW_filter_in_unsupportedFlag783 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_13_in_unsupportedFlag795 = new BitSet(new long[]{0x0000000000000060L});
	public static final BitSet FOLLOW_filter_in_unsupportedFlag799 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_34_in_unsupportedFlag810 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_classpath_in_unsupportedFlag814 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_51_in_unsupportedFlag822 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_classpath_in_unsupportedFlag826 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_45_in_unsupportedFlag834 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_classpath_in_unsupportedFlag838 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NAME_in_classpath858 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000006L});
	public static final BitSet FOLLOW_set_in_classpath861 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_classpath_in_classpath867 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nonEmptytFilter_in_filter888 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NEGATOR_in_nonEmptytFilter922 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_NAME_in_nonEmptytFilter928 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_11_in_nonEmptytFilter933 = new BitSet(new long[]{0x0000000000000060L});
	public static final BitSet FOLLOW_nonEmptytFilter_in_nonEmptytFilter935 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotation_in_classSpecification965 = new BitSet(new long[]{0x0000000000000040L,0x00000000008AC200L});
	public static final BitSet FOLLOW_classModifierAndType_in_classSpecification973 = new BitSet(new long[]{0x0000000000000060L});
	public static final BitSet FOLLOW_NEGATOR_in_classSpecification979 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_NAME_in_classSpecification985 = new BitSet(new long[]{0x0000000000000002L,0x0000000080050000L});
	public static final BitSet FOLLOW_inheritance_in_classSpecification994 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
	public static final BitSet FOLLOW_members_in_classSpecification1002 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NEGATOR_in_classModifierAndType1031 = new BitSet(new long[]{0x0000000000000000L,0x00000000008AC200L});
	public static final BitSet FOLLOW_87_in_classModifierAndType1043 = new BitSet(new long[]{0x0000000000000040L,0x00000000008AC200L});
	public static final BitSet FOLLOW_classModifierAndType_in_classModifierAndType1049 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_73_in_classModifierAndType1058 = new BitSet(new long[]{0x0000000000000040L,0x00000000008AC200L});
	public static final BitSet FOLLOW_classModifierAndType_in_classModifierAndType1064 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_81_in_classModifierAndType1073 = new BitSet(new long[]{0x0000000000000040L,0x00000000008AC200L});
	public static final BitSet FOLLOW_classModifierAndType_in_classModifierAndType1079 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classType_in_classModifierAndType1088 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_83_in_classType1117 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_79_in_classType1125 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_78_in_classType1133 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_95_in_members1154 = new BitSet(new long[]{0x0000000000000160L,0x000000017FF22278L});
	public static final BitSet FOLLOW_member_in_members1160 = new BitSet(new long[]{0x0000000000000160L,0x000000017FF22278L});
	public static final BitSet FOLLOW_96_in_members1166 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotation_in_member1187 = new BitSet(new long[]{0x0000000000000160L,0x000000007FF22238L});
	public static final BitSet FOLLOW_modifiers_in_member1190 = new BitSet(new long[]{0x0000000000000120L,0x0000000000000038L});
	public static final BitSet FOLLOW_type_in_member1207 = new BitSet(new long[]{0x0000000000000020L,0x0000000000000010L});
	public static final BitSet FOLLOW_set_in_member1213 = new BitSet(new long[]{0x0000000000000200L,0x0000000000000004L});
	public static final BitSet FOLLOW_arguments_in_member1222 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_69_in_member1257 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_67_in_member1269 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_66_in_member1279 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_70_in_annotation1303 = new BitSet(new long[]{0x0000000000000060L});
	public static final BitSet FOLLOW_NEGATOR_in_annotation1306 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_NAME_in_annotation1312 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_modifier_in_modifiers1336 = new BitSet(new long[]{0x0000000000000042L,0x000000007FF22200L});
	public static final BitSet FOLLOW_NEGATOR_in_modifier1362 = new BitSet(new long[]{0x0000000000000000L,0x000000007FF22200L});
	public static final BitSet FOLLOW_87_in_modifier1376 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_85_in_modifier1386 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_86_in_modifier1396 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_88_in_modifier1406 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_90_in_modifier1416 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_94_in_modifier1426 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_84_in_modifier1436 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_73_in_modifier1446 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_89_in_modifier1456 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_81_in_modifier1466 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_92_in_modifier1476 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_91_in_modifier1486 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_modifier1496 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_93_in_modifier1506 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_inheritance1537 = new BitSet(new long[]{0x0000000000000060L,0x0000000000000040L});
	public static final BitSet FOLLOW_annotation_in_inheritance1547 = new BitSet(new long[]{0x0000000000000060L});
	public static final BitSet FOLLOW_NEGATOR_in_inheritance1551 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_NAME_in_inheritance1557 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_9_in_arguments1577 = new BitSet(new long[]{0x0000000000000520L});
	public static final BitSet FOLLOW_type_in_arguments1605 = new BitSet(new long[]{0x0000000000000C00L});
	public static final BitSet FOLLOW_11_in_arguments1618 = new BitSet(new long[]{0x0000000000000120L});
	public static final BitSet FOLLOW_type_in_arguments1622 = new BitSet(new long[]{0x0000000000000C00L});
	public static final BitSet FOLLOW_10_in_arguments1651 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_8_in_type1687 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NAME_in_type1704 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
	public static final BitSet FOLLOW_71_in_type1707 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
	public static final BitSet FOLLOW_11_in_keepOptionModifier1738 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001C00L});
	public static final BitSet FOLLOW_76_in_keepOptionModifier1743 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_75_in_keepOptionModifier1751 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_74_in_keepOptionModifier1758 = new BitSet(new long[]{0x0000000000000002L});
}

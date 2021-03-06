package de.pfannekuchen.forgenogradle;

/**
 * Eclipse Files stored in a string
 * @author Pancake
 */
public class Eclipse {

	/**
	 * .project
	 */
	public static final String PROJECT = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\r\n"
			+ "<projectDescription>\r\n"
			+ "	<name>%NAME%</name>\r\n"
			+ "	<comment></comment>\r\n"
			+ "	<projects>\r\n"
			+ "	</projects>\r\n"
			+ "	<buildSpec>\r\n"
			+ "		<buildCommand>\r\n"
			+ "			<name>org.eclipse.jdt.core.javabuilder</name>\r\n"
			+ "			<arguments>\r\n"
			+ "			</arguments>\r\n"
			+ "		</buildCommand>\r\n"
			+ "	</buildSpec>\r\n"
			+ "	<natures>\r\n"
			+ "		<nature>org.eclipse.jdt.core.javanature</nature>\r\n"
			+ "	</natures>\r\n"
			+ "</projectDescription>";
	
	/**
	 * .classpath
	 */
	public static final String CLASSPATH = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\r\n"
			+ "<classpath>\r\n"
			+ "	<classpathentry kind=\"src\" path=\"src\"/>\r\n"
			+ "	<classpathentry kind=\"src\" path=\"rsc\"/>\r\n"
			+ "	<classpathentry kind=\"con\" path=\"org.eclipse.jdt.launching.JRE_CONTAINER/org.eclipse.jdt.internal.debug.ui.launcher.StandardVMType/JavaSE-1.8\">\r\n"
			+ "		<attributes>\r\n"
			+ "			<attribute name=\"module\" value=\"false\"/>\r\n"
			+ "		</attributes>\r\n"
			+ "	</classpathentry>\r\n"
			+ "	<classpathentry kind=\"output\" path=\"build/bin\"/>\r\n"
			+ "	<classpathentry kind=\"src\" path=\"build/.apt_generated\">"
			+ "		<attributes>"
			+ "			<attribute name=\"optional\" value=\"true\"/>"
			+ "		</attributes>"
			+ "	</classpathentry>"
			+ "%INSERT%\r\n"
			+ "</classpath>";
	
	/**
	 * .gitignore
	 */
	public static final String GITIGNORE = "# Eclipse Files\r\n"
			+ "run-server/\r\n"
			+ "run/\r\n"
			+ "build/\r\n"
			+ "*.launch\r\n"
			+ ".settings/\r\n"
			+ ".factorypath\r\n"
			+ ".apt_generated\r\n"
			+ ".apt_generated_tests\r\n"
			+ ".classpath\r\n"
			+ ".project\r\n";
	
	public static final String FACTOY_PATH = "<factorypath><factorypathentry kind=\"EXTJAR\" id=\"%PROCESSOR%\" enabled=\"true\" runInBatchMode=\"false\"/></factorypath>";
	
	/**
	 * .settings/org.eclipse.jdt.core.prefs
	 */
	public static final String CORE_PREFS = "eclipse.preferences.version=1\r\n"
			+ "org.eclipse.jdt.core.compiler.codegen.inlineJsrBytecode=enabled\r\n"
			+ "org.eclipse.jdt.core.compiler.codegen.methodParameters=do not generate\r\n"
			+ "org.eclipse.jdt.core.compiler.codegen.targetPlatform=1.8\r\n"
			+ "org.eclipse.jdt.core.compiler.codegen.unusedLocal=preserve\r\n"
			+ "org.eclipse.jdt.core.compiler.compliance=1.8\r\n"
			+ "org.eclipse.jdt.core.compiler.debug.lineNumber=generate\r\n"
			+ "org.eclipse.jdt.core.compiler.processAnnotations=enabled\r\n"
			+ "org.eclipse.jdt.core.compiler.debug.localVariable=generate\r\n"
			+ "org.eclipse.jdt.core.compiler.debug.sourceFile=generate\r\n"
			+ "org.eclipse.jdt.core.compiler.problem.assertIdentifier=error\r\n"
			+ "org.eclipse.jdt.core.compiler.problem.enablePreviewFeatures=disabled\r\n"
			+ "org.eclipse.jdt.core.compiler.problem.enumIdentifier=error\r\n"
			+ "org.eclipse.jdt.core.compiler.problem.reportPreviewFeatures=warning\r\n"
			+ "org.eclipse.jdt.core.compiler.release=disabled\r\n"
			+ "org.eclipse.jdt.core.compiler.source=1.8";
	
	/**
	 * .settings/org.eclipse.jdt.apt.core.prefs
	 */
	public static final String APT_CORE_PREFS = "eclipse.preferences.version=1\r\n"
			+ "org.eclipse.jdt.apt.aptEnabled=true\r\n"
			+ "org.eclipse.jdt.apt.genSrcDir=.apt_generated\r\n"
			+ "org.eclipse.jdt.apt.genTestSrcDir=.apt_generated_tests\r\n"
			+ "org.eclipse.jdt.apt.processorOptions/outRefMapFile=refmap.json\r\n"
			+ "org.eclipse.jdt.apt.processorOptions/reobfSrgFile=%SRG%\r\n"
			+ "org.eclipse.jdt.apt.processorOptions/outSrgFile=searge.srg\r\n"
			+ "org.eclipse.jdt.apt.reconcileEnabled=true\r\n"
			+ "";
	
	
	/**
	 * native library for .classpath
	 */
	public static final String LIBRARY_NATIVE = "<classpathentry kind=\"lib\" path=\"%PATH%\">\r\n"
			+ "		<attributes>\r\n"
			+ "			<attribute name=\"org.eclipse.jdt.launching.CLASSPATH_ATTR_LIBRARY_PATH_ENTRY\" value=\"%NATIVES%\"/>\r\n"
			+ "		</attributes>\r\n"
			+ "	</classpathentry>";
	
	/**
	 * *.launch
	 */
	public static final String RUN = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>\r\n"
			+ "<launchConfiguration type=\"org.eclipse.jdt.launching.localJavaApplication\">\r\n"
			+ "    <stringAttribute key=\"org.eclipse.jdt.launching.MAIN_TYPE\" value=\"de.pfannekuchen.forgenogradleapi.PreMain\"/>\r\n"
			+ "    <stringAttribute key=\"org.eclipse.jdt.launching.MODULE_NAME\" value=\"%PROJECT%\"/>\r\n"
			+ "    <stringAttribute key=\"org.eclipse.jdt.launching.PROJECT_ATTR\" value=\"%PROJECT%\"/>\r\n"
			+ "    <stringAttribute key=\"org.eclipse.jdt.launching.PROGRAM_ARGUMENTS\" value=\"--tweakClass org.spongepowered.asm.launch.MixinTweaker --mixin mixin.json --assetsDir ../build/assets/\"/>\r\n"
			+ "    <stringAttribute key=\"org.eclipse.jdt.launching.VM_ARGUMENTS\" value=\"-Djava.library.path=../build/natives -javaagent:../build/%MIXIN% \"/>\r\n"
			+ "    <stringAttribute key=\"org.eclipse.jdt.launching.WORKING_DIRECTORY\" value=\"${workspace_loc:%PROJECT%}/run\"/>\r\n"
			+ "</launchConfiguration>";
	
	/**
	 * export-1.12.2.launch
	 */
	public static final String EXPORT = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>\r\n"
			+ "<launchConfiguration type=\"org.eclipse.jdt.launching.localJavaApplication\">\r\n"
			+ "    <stringAttribute key=\"org.eclipse.jdt.launching.MAIN_TYPE\" value=\"de.pfannekuchen.forgenogradleapi.ExportMain\"/>\r\n"
			+ "    <stringAttribute key=\"org.eclipse.jdt.launching.MODULE_NAME\" value=\"%PROJECT%\"/>\r\n"
			+ "    <stringAttribute key=\"org.eclipse.jdt.launching.PROJECT_ATTR\" value=\"%PROJECT%\"/>\r\n"
			+ "    <stringAttribute key=\"org.eclipse.jdt.launching.WORKING_DIRECTORY\" value=\"${workspace_loc:%PROJECT%}/build\"/>\r\n"
			+ "</launchConfiguration>";
	
	/**
	 * library for .classpath
	 */
	public static final String LIBRARY = "\t<classpathentry kind=\"lib\" path=\"%PATH%\"/>";
	
	/**
	 * library with source for .classpath
	 */
	public static final String LIBRARY_SOURCE = "\t<classpathentry kind=\"lib\" path=\"%PATH%\" sourcepath=\"%SOURCE%\" />";
	
	/**
	 * library with source for .classpath
	 */
	public static final String LIBRARY_FULL = "\t<classpathentry kind=\"lib\" path=\"%PATH%\" sourcepath=\"%SOURCE%\"><attributes><attribute name=\"javadoc_location\" value=\"jar:platform:%JAVADOC%!/\"/>></attributes></classpathentry>";
	
	
}

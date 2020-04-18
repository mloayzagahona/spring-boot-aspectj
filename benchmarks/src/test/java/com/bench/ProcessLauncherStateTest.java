package com.bench;

import static org.junit.Assert.assertTrue;

import org.junit.Ignore;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class ProcessLauncherStateTest {

	private static final Logger logger = LoggerFactory.getLogger(ProcessLauncherStateTest.class);

	private final String classpathResult = "file:/Users/lofidewanto/git/spring-boot-aspectj/benchmarks/target/test-classes/:file:/Users/lofidewanto/git/spring-boot-aspectj/benchmarks/target/classes/:file:/Users/lofidewanto/.m2/repository/org/springframework/boot/spring-boot-starter-actuator/2.2.4.RELEASE/spring-boot-starter-actuator-2.2.4.RELEASE.jar:file:/Users/lofidewanto/.m2/repository/org/springframework/boot/spring-boot-starter/2.2.4.RELEASE/spring-boot-starter-2.2.4.RELEASE.jar:file:/Users/lofidewanto/.m2/repository/org/springframework/boot/spring-boot/2.2.4.RELEASE/spring-boot-2.2.4.RELEASE.jar:file:/Users/lofidewanto/.m2/repository/org/springframework/boot/spring-boot-autoconfigure/2.2.4.RELEASE/spring-boot-autoconfigure-2.2.4.RELEASE.jar:file:/Users/lofidewanto/.m2/repository/org/springframework/boot/spring-boot-starter-logging/2.2.4.RELEASE/spring-boot-starter-logging-2.2.4.RELEASE.jar:file:/Users/lofidewanto/.m2/repository/ch/qos/logback/logback-classic/1.2.3/logback-classic-1.2.3.jar:file:/Users/lofidewanto/.m2/repository/ch/qos/logback/logback-core/1.2.3/logback-core-1.2.3.jar:file:/Users/lofidewanto/.m2/repository/org/apache/logging/log4j/log4j-to-slf4j/2.12.1/log4j-to-slf4j-2.12.1.jar:file:/Users/lofidewanto/.m2/repository/org/apache/logging/log4j/log4j-api/2.12.1/log4j-api-2.12.1.jar:file:/Users/lofidewanto/.m2/repository/org/slf4j/jul-to-slf4j/1.7.30/jul-to-slf4j-1.7.30.jar:file:/Users/lofidewanto/.m2/repository/jakarta/annotation/jakarta.annotation-api/1.3.5/jakarta.annotation-api-1.3.5.jar:file:/Users/lofidewanto/.m2/repository/org/yaml/snakeyaml/1.25/snakeyaml-1.25.jar:file:/Users/lofidewanto/.m2/repository/org/springframework/boot/spring-boot-actuator-autoconfigure/2.2.4.RELEASE/spring-boot-actuator-autoconfigure-2.2.4.RELEASE.jar:file:/Users/lofidewanto/.m2/repository/org/springframework/boot/spring-boot-actuator/2.2.4.RELEASE/spring-boot-actuator-2.2.4.RELEASE.jar:file:/Users/lofidewanto/.m2/repository/com/fasterxml/jackson/core/jackson-databind/2.10.2/jackson-databind-2.10.2.jar:file:/Users/lofidewanto/.m2/repository/com/fasterxml/jackson/core/jackson-annotations/2.10.2/jackson-annotations-2.10.2.jar:file:/Users/lofidewanto/.m2/repository/com/fasterxml/jackson/core/jackson-core/2.10.2/jackson-core-2.10.2.jar:file:/Users/lofidewanto/.m2/repository/org/springframework/spring-context/5.2.3.RELEASE/spring-context-5.2.3.RELEASE.jar:file:/Users/lofidewanto/.m2/repository/com/fasterxml/jackson/datatype/jackson-datatype-jsr310/2.10.2/jackson-datatype-jsr310-2.10.2.jar:file:/Users/lofidewanto/.m2/repository/io/micrometer/micrometer-core/1.3.2/micrometer-core-1.3.2.jar:file:/Users/lofidewanto/.m2/repository/org/hdrhistogram/HdrHistogram/2.1.11/HdrHistogram-2.1.11.jar:file:/Users/lofidewanto/.m2/repository/org/latencyutils/LatencyUtils/2.0.3/LatencyUtils-2.0.3.jar:file:/Users/lofidewanto/.m2/repository/org/springframework/boot/spring-boot-starter-aop/2.2.4.RELEASE/spring-boot-starter-aop-2.2.4.RELEASE.jar:file:/Users/lofidewanto/.m2/repository/org/springframework/spring-aop/5.2.3.RELEASE/spring-aop-5.2.3.RELEASE.jar:file:/Users/lofidewanto/.m2/repository/org/springframework/spring-beans/5.2.3.RELEASE/spring-beans-5.2.3.RELEASE.jar:file:/Users/lofidewanto/.m2/repository/org/aspectj/aspectjweaver/1.9.5/aspectjweaver-1.9.5.jar:file:/Users/lofidewanto/.m2/repository/org/springframework/boot/spring-boot-starter-web/2.2.4.RELEASE/spring-boot-starter-web-2.2.4.RELEASE.jar:file:/Users/lofidewanto/.m2/repository/org/springframework/boot/spring-boot-starter-json/2.2.4.RELEASE/spring-boot-starter-json-2.2.4.RELEASE.jar:file:/Users/lofidewanto/.m2/repository/com/fasterxml/jackson/datatype/jackson-datatype-jdk8/2.10.2/jackson-datatype-jdk8-2.10.2.jar:file:/Users/lofidewanto/.m2/repository/com/fasterxml/jackson/module/jackson-module-parameter-names/2.10.2/jackson-module-parameter-names-2.10.2.jar:file:/Users/lofidewanto/.m2/repository/org/springframework/boot/spring-boot-starter-tomcat/2.2.4.RELEASE/spring-boot-starter-tomcat-2.2.4.RELEASE.jar:file:/Users/lofidewanto/.m2/repository/org/apache/tomcat/embed/tomcat-embed-core/9.0.30/tomcat-embed-core-9.0.30.jar:file:/Users/lofidewanto/.m2/repository/org/apache/tomcat/embed/tomcat-embed-el/9.0.30/tomcat-embed-el-9.0.30.jar:file:/Users/lofidewanto/.m2/repository/org/apache/tomcat/embed/tomcat-embed-websocket/9.0.30/tomcat-embed-websocket-9.0.30.jar:file:/Users/lofidewanto/.m2/repository/org/springframework/boot/spring-boot-starter-validation/2.2.4.RELEASE/spring-boot-starter-validation-2.2.4.RELEASE.jar:file:/Users/lofidewanto/.m2/repository/jakarta/validation/jakarta.validation-api/2.0.2/jakarta.validation-api-2.0.2.jar:file:/Users/lofidewanto/.m2/repository/org/hibernate/validator/hibernate-validator/6.0.18.Final/hibernate-validator-6.0.18.Final.jar:file:/Users/lofidewanto/.m2/repository/org/jboss/logging/jboss-logging/3.4.1.Final/jboss-logging-3.4.1.Final.jar:file:/Users/lofidewanto/.m2/repository/com/fasterxml/classmate/1.5.1/classmate-1.5.1.jar:file:/Users/lofidewanto/.m2/repository/org/springframework/spring-web/5.2.3.RELEASE/spring-web-5.2.3.RELEASE.jar:file:/Users/lofidewanto/.m2/repository/org/springframework/spring-webmvc/5.2.3.RELEASE/spring-webmvc-5.2.3.RELEASE.jar:file:/Users/lofidewanto/.m2/repository/org/springframework/spring-expression/5.2.3.RELEASE/spring-expression-5.2.3.RELEASE.jar:file:/Users/lofidewanto/.m2/repository/org/springframework/boot/spring-boot-configuration-processor/2.2.4.RELEASE/spring-boot-configuration-processor-2.2.4.RELEASE.jar:file:/Users/lofidewanto/.m2/repository/org/springframework/boot/spring-boot-starter-test/2.2.4.RELEASE/spring-boot-starter-test-2.2.4.RELEASE.jar:file:/Users/lofidewanto/.m2/repository/org/springframework/boot/spring-boot-test/2.2.4.RELEASE/spring-boot-test-2.2.4.RELEASE.jar:file:/Users/lofidewanto/.m2/repository/org/springframework/boot/spring-boot-test-autoconfigure/2.2.4.RELEASE/spring-boot-test-autoconfigure-2.2.4.RELEASE.jar:file:/Users/lofidewanto/.m2/repository/com/jayway/jsonpath/json-path/2.4.0/json-path-2.4.0.jar:file:/Users/lofidewanto/.m2/repository/net/minidev/json-smart/2.3/json-smart-2.3.jar:file:/Users/lofidewanto/.m2/repository/net/minidev/accessors-smart/1.2/accessors-smart-1.2.jar:file:/Users/lofidewanto/.m2/repository/org/ow2/asm/asm/5.0.4/asm-5.0.4.jar:file:/Users/lofidewanto/.m2/repository/org/slf4j/slf4j-api/1.7.30/slf4j-api-1.7.30.jar:file:/Users/lofidewanto/.m2/repository/jakarta/xml/bind/jakarta.xml.bind-api/2.3.2/jakarta.xml.bind-api-2.3.2.jar:file:/Users/lofidewanto/.m2/repository/jakarta/activation/jakarta.activation-api/1.2.1/jakarta.activation-api-1.2.1.jar:file:/Users/lofidewanto/.m2/repository/org/junit/jupiter/junit-jupiter/5.5.2/junit-jupiter-5.5.2.jar:file:/Users/lofidewanto/.m2/repository/org/junit/jupiter/junit-jupiter-api/5.5.2/junit-jupiter-api-5.5.2.jar:file:/Users/lofidewanto/.m2/repository/org/opentest4j/opentest4j/1.2.0/opentest4j-1.2.0.jar:file:/Users/lofidewanto/.m2/repository/org/junit/platform/junit-platform-commons/1.5.2/junit-platform-commons-1.5.2.jar:file:/Users/lofidewanto/.m2/repository/org/junit/jupiter/junit-jupiter-params/5.5.2/junit-jupiter-params-5.5.2.jar:file:/Users/lofidewanto/.m2/repository/org/junit/jupiter/junit-jupiter-engine/5.5.2/junit-jupiter-engine-5.5.2.jar:file:/Users/lofidewanto/.m2/repository/org/junit/vintage/junit-vintage-engine/5.5.2/junit-vintage-engine-5.5.2.jar:file:/Users/lofidewanto/.m2/repository/org/apiguardian/apiguardian-api/1.1.0/apiguardian-api-1.1.0.jar:file:/Users/lofidewanto/.m2/repository/org/junit/platform/junit-platform-engine/1.5.2/junit-platform-engine-1.5.2.jar:file:/Users/lofidewanto/.m2/repository/junit/junit/4.12/junit-4.12.jar:file:/Users/lofidewanto/.m2/repository/org/mockito/mockito-junit-jupiter/3.1.0/mockito-junit-jupiter-3.1.0.jar:file:/Users/lofidewanto/.m2/repository/org/assertj/assertj-core/3.13.2/assertj-core-3.13.2.jar:file:/Users/lofidewanto/.m2/repository/org/hamcrest/hamcrest/2.1/hamcrest-2.1.jar:file:/Users/lofidewanto/.m2/repository/org/mockito/mockito-core/3.1.0/mockito-core-3.1.0.jar:file:/Users/lofidewanto/.m2/repository/net/bytebuddy/byte-buddy/1.10.6/byte-buddy-1.10.6.jar:file:/Users/lofidewanto/.m2/repository/net/bytebuddy/byte-buddy-agent/1.10.6/byte-buddy-agent-1.10.6.jar:file:/Users/lofidewanto/.m2/repository/org/objenesis/objenesis/2.6/objenesis-2.6.jar:file:/Users/lofidewanto/.m2/repository/org/skyscreamer/jsonassert/1.5.0/jsonassert-1.5.0.jar:file:/Users/lofidewanto/.m2/repository/com/vaadin/external/google/android-json/0.0.20131108.vaadin1/android-json-0.0.20131108.vaadin1.jar:file:/Users/lofidewanto/.m2/repository/org/springframework/spring-core/5.2.3.RELEASE/spring-core-5.2.3.RELEASE.jar:file:/Users/lofidewanto/.m2/repository/org/springframework/spring-jcl/5.2.3.RELEASE/spring-jcl-5.2.3.RELEASE.jar:file:/Users/lofidewanto/.m2/repository/org/springframework/spring-test/5.2.3.RELEASE/spring-test-5.2.3.RELEASE.jar:file:/Users/lofidewanto/.m2/repository/org/xmlunit/xmlunit-core/2.6.3/xmlunit-core-2.6.3.jar:file:/Users/lofidewanto/.m2/repository/org/openjdk/jmh/jmh-core/1.23/jmh-core-1.23.jar:file:/Users/lofidewanto/.m2/repository/net/sf/jopt-simple/jopt-simple/4.6/jopt-simple-4.6.jar:file:/Users/lofidewanto/.m2/repository/org/apache/commons/commons-math3/3.2/commons-math3-3.2.jar:file:/Users/lofidewanto/.m2/repository/org/openjdk/jmh/jmh-generator-annprocess/1.23/jmh-generator-annprocess-1.23.jar:file:/Applications/SpringToolSuite4.app/Contents/Eclipse/configuration/org.eclipse.osgi/1841/0/.cp/:file:/Applications/SpringToolSuite4.app/Contents/Eclipse/configuration/org.eclipse.osgi/1839/0/.cp/:file:/Applications/SpringToolSuite4.app/Contents/Eclipse/configuration/org.eclipse.osgi/1638/0/.cp/";

	@BeforeEach
	void setUp() throws Exception {
	}

	@Ignore
	void testGetClasspathJdk8() {
		ProcessLauncherState processLauncherState = new ProcessLauncherState("", "");
		String classpathName = processLauncherState.getClasspathJdk8();

		logger.info(classpathName);
	}

	@Test
	void testGetClasspathJdk9() {
		ProcessLauncherState processLauncherState = new ProcessLauncherState("", "");
		String classpathName = processLauncherState.getClasspathJdk9();

		logger.info(classpathName);

		assertTrue(classpathResult.contains(classpathName));
	}

}

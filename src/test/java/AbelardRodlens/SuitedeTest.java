package AbelardRodlens;

import org.junit.platform.suite.api.IncludeClassNamePatterns;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

@Suite
@SuiteDisplayName("JUnit Platform Suite Demo")
@SelectPackages({"AbelardRodlens"})
//@IncludeClassNamePatterns({.VoitureTest.class, .Statistique_implTest.class})


public class SuitedeTest {
}

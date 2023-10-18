import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;
import org.junit.platform.suite.api.SelectClasses;

@Suite
@SuiteDisplayName("This is a suite")
@SelectClasses( { ValidTest.class, PassportTest.class } )
public class TestSuite {}

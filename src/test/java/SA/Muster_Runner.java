package SA;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import n3qa.WD.customrunner.CustomAbstractTestNGCucumberTests;

@CucumberOptions (
        features = "src/test/resources/SAfeatureFiles",
        glue = {"SA.stepDefinitions"},
        dryRun = false,
        monochrome = true,
        plugin = { "pretty","json:target/report.json",
                            "html:target/ALL_Report.xml"}

)

//D:\AUTOMATION\BnVFW\V5\src\main\java\n3qa\WD\customrunner\CustomAbstractTestNGCucumberTests.java
public class Muster_Runner extends AbstractTestNGCucumberTests {

}

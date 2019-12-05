package SA.Runner;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions (
        features = "src/test/resources/SAfeatureFiles/Registration.feature",
        glue = {"SA.stepDefinitions.Registration", "n3qa.WD.support.GenericHelper"},
        dryRun = false,
        monochrome = true,
        plugin = { "pretty","html:target/HTMLReports/REG_Report.xml"}

)

public class REG_Runner extends AbstractTestNGCucumberTests {

}

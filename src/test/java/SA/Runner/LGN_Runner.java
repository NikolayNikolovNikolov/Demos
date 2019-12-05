package SA.Runner;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions (
        features = "src/test/resources/SAfeatureFiles/Login.feature",

        glue = {"SA.stepDefinitions.Login", "n3qa.WD.support.GenericHelper"},
        dryRun = false,
        monochrome = true,
        plugin = { "pretty","html:target/HTMLReports/LGN_Report.xml"}

)

public class LGN_Runner extends AbstractTestNGCucumberTests {

}

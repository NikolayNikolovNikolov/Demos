package SA.stepDefinitions.Registration;


import SA.POM.HomePageClass;
import SA.POM.RegistrationPageClass;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.Transform;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import n3qa.DDT.transform.ExcelDataToDataTable;
import n3qa.WD.support.DriverSvS;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;
import java.util.Map;

public class REGstepDefinitions {
    private WebDriver driver;
    private WebElement element;
    private WebDriverWait wait;
    private DriverSvS services;
    private n3qa.WD.settings.SA SA;


    public  String regPassword ;
    public  String confPass ;

    public REGstepDefinitions(DriverSvS services, n3qa.WD.settings.SA SA) {
        this.services = services;
        this.driver = services.getDriver();
        this.SA = SA;
    }


    @Given("^A guest user lunches the SA registration page with with URL \"([^\"]*)\"$")
    public void a_guest_user_lunches_the_sa_registration_page_with_with_url_something(String url) throws Throwable {
        driver.get(url);
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, "http://localhost:8080/register" );

        SA.registrationPage = new RegistrationPageClass(driver);
        SA.registrationPage.hardWait(777);

    }

    @When("^The user enters new userName as \"([^\"]*)\"$")
    public void the_user_enters_new_username_as_something(String username) throws Throwable {
        String ranGen = RandomStringUtils.randomAlphanumeric(3);
        System.out.println(ranGen);
        SA.registrationPage.REG_UsernameFIELD.sendKeys(username+ranGen);
    }

    @When("^The user enters new email as \"([^\"]*)\"$")
    public void the_user_enters_new_email_as_something(String email) throws Throwable {
        String ranGen = RandomStringUtils.randomAlphanumeric(3);
        System.out.println(ranGen);

        SA.registrationPage.REG_EmailFIELD.sendKeys(email+"@"+ranGen+".com");
    }

    @When("^The user enters password as \"([^\"]*)\"$")
    public void the_user_enters_new_password_as_something(String password) throws InterruptedException {

        String ranGen = RandomStringUtils.randomAlphanumeric(3);
        regPassword = password+ranGen+ranGen;
        System.out.println("The user`s registration password is: "+regPassword);
        SA.registrationPage.REG_PasswordFIELD.sendKeys(regPassword);
        confPass = regPassword;
    }


    @When("^The user reenters the password$")
    public void theUserReentersThePasswordAs() throws InterruptedException {


        System.out.println("The user`s confirm the password with: "+confPass);
        SA.registrationPage.REG_ConfirmPassword.sendKeys(confPass);
    }

    @And("^The user clicks on the registration form submit button$")
    public void the_user_clicks_on_the_registration_form_submit_button() throws Throwable  {

        SA.registrationPage.hardWait(1500);
        SA.registrationPage.REG_FormSubmitBTN.click();

    }

    @Then("^The user is successfully registered in SA$")
    public void the_user_is_successfully_registered_in_sa()   {
        SA.homePage = new HomePageClass(driver);
       String txt = SA.homePage.HM_successful_registrationMSG.getText();

       Assert.assertEquals(txt,"Successful registration.");
    }

    @Then("^A welcome message is shown at the home page$")
    public void a_welcome_message_is_shown_at_the_home_page() throws Throwable {
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, "http://localhost:8080/" );
    }

    @Then("^The browser is closed by the user$")
    public void theUserClosesTheBrowser() {
        driver.close();
        driver.quit();
    }

    @Given("^The user is on the registration page$")
    public void theUserIsOnTheRegistrationPage() throws Throwable{
        driver.get("http://localhost:8080/register");
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, "http://localhost:8080/register" );

        SA.registrationPage = new RegistrationPageClass(driver);
        SA.registrationPage.hardWait(777);
    }

    @When("^The user enters valid/invalid data in the registration form must field fields provided by \"([^\"]*)\"$")
    public void theUserEntersValidInvalidDataInTheRegistrationFormMustFieldFieldsProvidedBy(@Transform(ExcelDataToDataTable.class) DataTable table) throws Throwable {
        String ranGen = RandomStringUtils.randomAlphanumeric(3);

        String ranPassword = ranGen+ranGen;

        List<Map<String, String>> dataList = table.asMaps(String.class, String.class);
        Map<String, String> dataMap = dataList.get(0);


        SA.registrationPage.REG_UsernameFIELD.clear();
        SA.registrationPage.REG_UsernameFIELD.sendKeys(dataMap.get("userName"));

        SA.registrationPage.REG_EmailFIELD.clear();
        SA.registrationPage.REG_EmailFIELD.sendKeys(dataMap.get("email")+ranGen+"@abv.com");

        SA.registrationPage.REG_PasswordFIELD.clear();
        SA.registrationPage.REG_PasswordFIELD.sendKeys(dataMap.get("password")+ranPassword);

        SA.registrationPage.REG_ConfirmPassword.clear();
        SA.registrationPage.REG_ConfirmPassword.sendKeys(dataMap.get("confirmPassword")+ranPassword);

        SA.registrationPage.hardWait(444);

    }


    @Then("^Then an error message is displayed and users is at the home page$")
    public void thenAnErrorMessageIsDisplayedAndUsersIsAtTheHomePage()  throws Throwable {
      String txt = SA.registrationPage.REG_userError.getText();
        System.out.println(txt);
        Assert.assertEquals(txt,"Username should be between 2 and 50 characters.");

        driver.close();
        driver.quit();

    }
}

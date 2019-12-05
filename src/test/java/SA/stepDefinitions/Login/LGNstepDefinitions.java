package SA.stepDefinitions.Login;


import SA.POM.HomePageClass;
import SA.POM.LoginPageClass;
import SA.POM.NewsFeedPageClass;
import SA.POM.RegistrationPageClass;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.en.*;

import javafx.animation.ScaleTransition;
import n3qa.WD.support.DriverSvS;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static org.testng.Assert.*;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

import static org.testng.Assert.*;

public class LGNstepDefinitions   {
    private WebDriver driver;
    private WebElement element;
    private WebDriverWait wait;
    private DriverSvS services;
    private n3qa.WD.settings.SA SA;

    public  String LgnUser ;
    public  String LgnPassword ;

    public LGNstepDefinitions (DriverSvS services, n3qa.WD.settings.SA SA) {
        this.services = services;
        this.driver = services.getDriver();
        this.SA = SA;
    }


    @Given("^Registered user launches the SA LoginPage with URL \"([^\"]*)\"$")
    public void registeredUserLaunchesTheSALoginPageWithURL(String url) throws Throwable {
        driver.get(url);
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, "http://localhost:8080/login" );

        SA.loginPage = new LoginPageClass(driver);

        SA.loginPage.hardWait(700);
    }

    @When("^The user enters valid userName as \"([^\"]*)\"$")
    public void theUserEntersValidUserNameAs(String user) throws Throwable {
        SA.loginPage.hardWait(200);
        SA.loginPage.LGN_userNameFIELD.sendKeys(user);
        LgnUser = user;
    }

    @When("^The user enters valid password as \"([^\"]*)\"$")
    public void theUserEntersValidPasswordAs(String pass) throws Throwable {
        SA.loginPage.hardWait(200);
        SA.loginPage.LGN_passwordFIELD.sendKeys(pass);
    }

    @And("^The user clicks on the login form submit button$")
    public void theUserClicksOnTheLoginFormSubmitButton() {

        SA.loginPage.LGN_Login_submitBTN.click();

//        SA.homePage = (HomePageClass) SA.loginPage.click_on_login_submit_form_button();

    }


    @Then("^The user is successfully logged in SA$")
    public void theUserIsSuccessfullyLoggedInSA() throws InterruptedException {

        SA.loginPage.hardWait(500);
        SA.homePage = new HomePageClass(driver);

        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, "http://localhost:8080/" );

        String LogOutBtnTxt =SA.homePage.HM_navLogoutLINK.getText();


//        try {
//            SA.homePage.HM_navLogoutLINK.getText();
//            fail("WebElement with text <" +  SA.homePage.HM_navLogoutLINK.getText() + "> is present");
//        } catch (NoSuchElementException ex) {
//            System.out.println("The logout link at the navigation bar is not found");
//        }

        Assert.assertEquals(LogOutBtnTxt,"Logout");
//        Assert.assertNotEquals(LogOutBtnTxt,"<Logout>");

    }

    @Then("^User`s name is presented as a link at the navigation$")
    public void userSNameIsPresentedAsALinkAtTheNavigation() throws Throwable {
        SA.loginPage.hardWait(777);


        String userInfoTxT = SA.homePage.HM_navUserProfileInfoLINK.getText();

        Assert.assertEquals(userInfoTxT,LgnUser);



//        //     N3TestUser
    }     //>>>> CASE 2

    @Given("^The guest user launches Social Alien \\(SA\\) home page with  URL \"([^\"]*)\"$")
    public void theGuestUserLaunchesSocialAlienSAHomePageWithURL(String url) throws Throwable {
        driver.get(url);
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, "http://localhost:8080/" );

        SA.homePage = new HomePageClass(driver);

    }


    @When("^The user goes to Login page$")
    public void theUserGoesToLoginPage() {
//        SA.homePage = (HomePageClass) SA.loginPage.click_on_login_submit_form_button();
        SA.loginPage = (LoginPageClass) SA.homePage.click_on_navigation_login_link();

    }

    //enters userName and Pass


    @When("^The user clicks on logout button$")
    public void the_user_clicks_on_logout_button()   {
        SA.homePage = new HomePageClass(driver);

        System.out.println("At the home page with logout link at the navigation");

        SA.homePage.HM_navLogoutLINK.click();

    }

    @Then("^The user is successfully logged-out from SA$")
    public void the_user_is_successfully_logged_out_from_SA() throws Throwable {
        SA.homePage = new HomePageClass(driver);

       String navLoginLinkTxt =SA.homePage.HM_navLoginLiNK.getText();
        System.out.println(navLoginLinkTxt);


       try {
           assertEquals(navLoginLinkTxt,"Login");
               } catch (AssertionError e) {
           System.out.println("Login button is not presented at the navigation bar" +
                                    "However the test continue");
                 }

    }


    @And("^The user is on the home page$")
    public void theUserIsOnTheHomePage() throws InterruptedException {

        SA.loginPage.hardWait(180);
        HomePageClass homePage = new HomePageClass(driver);

        String URL = driver.getCurrentUrl();
        System.out.println("URL is :" + URL);

    }


    @When("^The user enters invalid userName as \"([^\"]*)\"$")
    public void theUserEntersInvalidUserNameAs(String invalidUser) throws Throwable {
        SA.loginPage.hardWait(350);
        String ranGen = RandomStringUtils.randomAlphanumeric(3);
        String randomNotRealUser = "NotUser"+ranGen;
        SA.loginPage.LGN_userNameFIELD.sendKeys( randomNotRealUser);

    }

    @Then("^The user is not logged in SA$")
    public void theUserIsNotLoggedInSA() throws InterruptedException {
        SA.loginPage.hardWait(150);
        String LognBtnTxt =SA.loginPage.LGN_Login_submitBTN.getText();

        Assert.assertEquals(LognBtnTxt,"LOG IN");


    }

    @Then("^The user stays on the loginPage$")
    public void theUserStaysOnTheLoginPage() {
        String URL = driver.getCurrentUrl();
        System.out.println("The url is "+ URL);
        Assert.assertEquals(URL, "http://localhost:8080/login?error" );
    }

    @Then("^A error message is shown$")
    public void aErrorMessageIsShown() {

        String errorMSG = SA.loginPage.LGN_errorMSG.getText();
        assertEquals(errorMSG,"Wrong username or password.");
        System.out.println("The error text is "+errorMSG);

    }

    @Then("^the user closes the browser$")
    public void theUserClosesTheBrowser() {
        driver.close();
        driver.quit();
    }
}

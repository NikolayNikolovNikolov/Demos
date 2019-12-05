package SA.POM;

import gherkin.lexer.Pa;
import n3qa.WD.support.TextBox;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePageClass extends PageBase {

    //support
    private WebDriver driver;
    private WebDriverWait wait;
    private LoginPageClass loginPage;
    private RegistrationPageClass registrationPage;

    //constructor
    public HomePageClass(WebDriver driver) {
        super(driver);
        this.driver = driver;
      //  PageFactory.initElements(driver,this);
    }

    /*Wait was defined in PageBase due to RedGreenRefactor
    private WebDriverWait getWait() {
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.pollingEvery(250, TimeUnit.MILLISECONDS);
        wait.ignoring(NoSuchElementException.class);
        return wait;
    }
    */



    //****Web Elements****

    //public By HM_navHomeLINK = By.xpath("//a[@data-value='home']");
   // public By HM_navRegisterLINK = By.xpath("//a[text()='Register']");
   // public By HM_navLoginLINK = By.xpath("//a[@href='/login']");
    //public By HM_searchTextBox = By.xpath("//input[@name='sourceText']");
   // public By HM_searchSubmitBTN = By.xpath("//input[@value='Search Users']");
    //    public By HM_page_title = By.xpath("//title");

    //HomePage title
    @FindBy(how = How.XPATH, using = "//title" )
    public WebElement HM_page_title;

    //HomePage navigation
    @FindBy(how = How.XPATH, using = "//a[@data-value='login']" )
    public WebElement HM_navLoginLiNK;
    @FindBy(how = How.XPATH, using = "//a[@href='/logout']")
    public WebElement HM_navLogoutLINK;
    @FindBy(how = How.XPATH, using = "//a[@href='/']" )
    public WebElement HM_navHomeLINK;
    @FindBy(how = How.XPATH, using = "//a[text()='Register']" )
    public WebElement HM_navRegisterLINK;

    @FindBy(how = How.XPATH, using = "//a[@data-value='userProfile']")
    public WebElement HM_navUserProfileInfoLINK;

    //Search feature elements
    @FindBy(how = How.XPATH, using = "//input[@name='sourceText']")
    public WebElement HM_searchTextBox;
    @FindBy(how = How.XPATH, using = "//input[@value='Search Users']")
    public WebElement HM_searchSubmitBTN;


    //Messages

    //*[contains(text(),'Successful registration.')]
    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Successful registration.')]")
    public WebElement HM_successful_registrationMSG;




    //Post

    @FindBy(how = How.XPATH, using = "//*[@id=\"value\" and @placeholder='Write something to share with others']")
    WebElement HM_postTextFIELD;
    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Post')]")
    WebElement HM_postSubmitBTN;




    //Action
    public void search(){

    }

    //Navigation
    //If login is successful > then NSFP
    public void navigateToNewsFeedPage () {

   }
   /* RED -> Green -> REFACTOR ;)
    public LoginPageClass navigateToLoginPage () {
        LoginPageClass loginPage = new LoginPageClass(driver);

        driver.findElement(HM_navLoginLINK).click();
        WebDriverWait wait = getWait();
        wait.until(ExpectedConditions.visibilityOfElementLocated(loginPage.LNG_loginSubmitBTN));
        return loginPage;
    }
    */

    //Navigation
    ////a[@href='/logout']

    public PageBase click_on_navigation_logOUT_link () {
        HomePageClass homePage = new HomePageClass(driver);



        WebDriverWait wait =  getWait();
        wait.until(ExpectedConditions.visibilityOf(HM_searchTextBox));

        HM_navLogoutLINK.click();

        return homePage;

    }

    public PageBase click_on_navigation_login_link () {
        LoginPageClass loginPage = new LoginPageClass(driver);

         HM_navLoginLiNK.click();

        WebDriverWait wait =  getWait();
        wait.until(ExpectedConditions.visibilityOf(loginPage.LGN_Login_submitBTN));

        return loginPage;

    }


    public PageBase HM_redirectedToLoginPage () {
        LoginPageClass loginPage = new LoginPageClass(driver);

        WebDriverWait wait = getWait();
        wait.until(ExpectedConditions.visibilityOf(loginPage.LGN_Search_SubmitBTN));
        return loginPage;
    }

    public PageBase HM_redirectedToRegistrationPage () {
        RegistrationPageClass registrationPage = new RegistrationPageClass(driver);


        WebDriverWait wait = getWait();
        wait.until(
                ExpectedConditions.
                        visibilityOf(
                                registrationPage.REG_AddressFIELD));
        return registrationPage;
    }



    public PageBase navigateToRegistrationPage () {
        RegistrationPageClass registrationPage = new RegistrationPageClass(driver);

        HM_navRegisterLINK.click();

        WebDriverWait wait = getWait();
        wait.until(ExpectedConditions.elementToBeClickable(registrationPage.REG_FormSubmitBTN));
        return registrationPage;
    }


    public void hardWait(int timeOutInMiliSec) throws InterruptedException {

        Thread.sleep(timeOutInMiliSec);
    }

}

package SA.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

import static org.testng.Assert.fail;

public class LoginPageClass  extends PageBase {


    //support class
    private WebDriver driver;
    private WebElement element;
    private List<WebElement> listOfelements;

    //POM
    HomePageClass homePage ;
    RegistrationPageClass registrationPage;
    NewsFeedPageClass newsFeedPage;

    public LoginPageClass(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }



   /*Wait was defined in PageBase due to RedGreenRefactor
    private WebDriverWait getWait() {
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.pollingEvery(250, TimeUnit.MILLISECONDS);
        wait.ignoring(NoSuchElementException.class);
        return wait;
    }
    */

//
//public By LGN_userName = By.xpath("//input[@name='username']");
//public By LGN_password = By.xpath("//input[@name='password']");
//public By LNG_loginSubmitBTN = By.xpath("//button[text()='Log in']");
//    public By LNG_loginSubmitBTN = By.xpath("/html/body/div/div/div[2]/div/div[2]/form/button");
//
//public By LGN_registrationLINK = By.xpath("//a[@href='/register']");
//public By LGN_searchTextBox = By.xpath("//input[@name='sourceText']");
//public By LGN_searchSubmitBtn= By.xpath("//input[@value='Search Users']");
//public By LGN_navHomepageLINK = By.xpath("//a[@data-value='home']");
//public By LGN_navRegisterLINK = By.xpath("//a[text()='Register']");

    //PageTitle
    public By LGN_page_title = By.xpath("//title");

    //Navigation
    @FindBy(how = How.XPATH, using ="//a[@data-value='home']")
    public WebElement LGN_navHomepageLINK;
    @FindBy(how = How.XPATH, using ="//a[text()='Register']" )
    public WebElement LGN_navRegisterLINK;
    @FindBy(how = How.XPATH, using ="//a[@href='/register']")
    public WebElement LGN_registerLgn_Page_Link;



    //Login Fields
    @FindBy(how = How.XPATH, using ="//input[@name='username']")
    public WebElement LGN_userNameFIELD;
    @FindBy(how = How.XPATH, using ="//input[@name='password']")
    public WebElement LGN_passwordFIELD;
    @FindBy(how = How.XPATH, using ="//button[text()='Log in']")
    public WebElement LGN_Login_submitBTN;

    //Login page search users
    @FindBy(how = How.XPATH, using ="//input[@name='sourceText']")
    public WebElement LGN_searchTextBoxLGN_Page;
    @FindBy(how = How.XPATH, using ="//input[@value='Search Users']")
    public WebElement LGN_Search_SubmitBTN;


    //Error message
    @FindBy(how = How.XPATH, using ="//*[@class='error']")
    public WebElement LGN_errorMSG;


    //Actions



    public void enterValidUser (String user) {
        LGN_userNameFIELD.sendKeys(user);
    }

    public void enterValidPassword (String pass) {
         LGN_passwordFIELD.sendKeys(pass);
    }

//    SA.homePage = (HomePageClass) SA.loginPage.LGN_Search_SubmitBTN.click();



    // NAVIGATION VERY IMPORTANT - supporting the driver form one Page to Another
    public PageBase click_on_login_submit_form_button () {
       HomePageClass homePage = new HomePageClass(driver);

        LGN_Login_submitBTN.click();

        WebDriverWait wait =  getWait();
        wait.until(ExpectedConditions.visibilityOf(homePage.logout));

        return homePage;

    }

    public PageBase click_on_registration_link () {
        RegistrationPageClass registrationPage = new RegistrationPageClass(driver);

        LGN_navRegisterLINK.click();

        WebDriverWait wait =  getWait();
        wait.until(ExpectedConditions.visibilityOf(registrationPage.REG_FormSubmitBTN));

        return registrationPage;

    }


    public PageBase LGN_redirectedToNewsFeedPage () {
        NewsFeedPageClass newsFeedPage = new NewsFeedPageClass(driver);

        WebDriverWait wait = getWait();
        wait.until(ExpectedConditions.visibilityOf(newsFeedPage.NFP_navUserNameLINK));
        return newsFeedPage;
    }



    public PageBase LGN_redirectedToHomePagePage () {
        HomePageClass homePageClass = new HomePageClass(driver);

        WebDriverWait wait = getWait();
        wait.until(ExpectedConditions.visibilityOf(
                homePageClass.HM_navRegisterLINK));
        return homePageClass;
    }

    public PageBase LGN_redirectedToRegistrationPage () {
        RegistrationPageClass registrationPage = new RegistrationPageClass(driver);

        WebDriverWait wait = getWait();
        wait.until(ExpectedConditions.visibilityOf(registrationPage.REG_AddressFIELD));
        return registrationPage;
    }

    //Assertions support

    public static void assertNotPresented(WebDriver driver, WebElement element) {
        try {
            driver.findElement((By) element);
            fail("WebElement with text <" + element.getText() + "> is present");
        } catch (NoSuchElementException ex) {
            /* do nothing, link is not present, assert is passed */
        }
    }



}

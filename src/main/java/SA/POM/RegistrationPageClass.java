package SA.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.List;

public class RegistrationPageClass extends PageBase {
    //support class
    private WebDriver driver;
    private WebElement element;
    private List<WebElement> listOfelements;

    //POM connections
    HomePageClass homePage ;
    LoginPageClass loginPage;

    //Constructor
    public RegistrationPageClass(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


    //pageTitle
    @FindBy(how = How.XPATH, using ="//title" )
    public WebElement REG_page_title;
    //Navigation links
    @FindBy(how = How.XPATH, using ="//a[@href='/login']")
    public WebElement REG_LoginLINK;
    @FindBy(how = How.XPATH, using ="//a[@data-value='home']")
    public WebElement REG_navHomepageLINK;



    @FindBy(how = How.XPATH, using ="//button[text()='Register']" )
    public WebElement REG_FormSubmitBTN;
    //***MUST fields for the registration flow:***
    @FindBy(how = How.XPATH, using ="//input[@id='username']" )
    public WebElement REG_UsernameFIELD;
    @FindBy(how = How.XPATH, using ="//input[@id='email']")
    public WebElement REG_EmailFIELD;
    @FindBy(how = How.XPATH, using ="//input[@id='password']")
    public WebElement REG_PasswordFIELD;
    @FindBy(how = How.XPATH, using ="//input[@id='passwordConfirmation']")
    public WebElement REG_ConfirmPassword;
    //***OPTIONAL fields for the registration flow:***
    @FindBy(how = How.XPATH, using ="//input[@id='firstName']")
    public WebElement REG_FirstnameFIELD;
    @FindBy(how = How.XPATH, using ="//input[@id='lastName']")
    public WebElement REG_LastNameFIELD;
    @FindBy(how = How.XPATH, using ="//input[@id='birthDate']")
    public WebElement REG_BirthDateFIELD;
    @FindBy(how = How.XPATH, using ="//input[@id='address']")
    public WebElement REG_AddressFIELD;
    //***Planet location details:***
    @FindBy(how = How.XPATH, using ="//input[@id='cityOfBirth']")
    public WebElement REG_CityOfBirthFIELD;
    @FindBy(how = How.XPATH, using ="//input[@id='planetOfCityOfBirth']")
    public WebElement REG_PlanetByBirthFIELD;
    @FindBy(how = How.XPATH, using ="//input[@id='cityOfResidence']")
    public WebElement REG_CityOfResidenceFIELD;
    @FindBy(how = How.XPATH, using ="//input[@id='planetOfCityOfResidence']")
    public WebElement REG_PlanetOfResidenceFIELD;
    @FindBy(how = How.XPATH, using ="//input[@id='jobTitle']")
    public WebElement REG_JobTitleFIELD;
    @FindBy(how = How.XPATH, using ="//input[@id='educationLevel']")
    public WebElement REG_EducatonFIELD;

    // Error messages
    //*[contains(text(),'Username should be between 2 and 50 characters.')]
    @FindBy(how = How.XPATH, using ="//*[contains(text(),'Username should be between 2 and 50 characters.')]")
    public WebElement REG_userError;

    //Actions
    //Fill the text fields from the FORM
    //search users
    //go to Login page


    /// NAVIGATION FROM PAGE TO PAGE
    public PageBase click_on_navigation_home_link() {
        HomePageClass homePage= new HomePageClass(driver);
        REG_navHomepageLINK.click();

        WebDriverWait wait = getWait();
        wait.until(ExpectedConditions.elementToBeClickable(homePage.HM_searchSubmitBTN));
        return  homePage;
    }

    public PageBase click_on_login_link () {

        LoginPageClass loginPage = new LoginPageClass(driver);

        REG_LoginLINK.click();

        WebDriverWait wait =  getWait();
        wait.until(ExpectedConditions.visibilityOf(loginPage.LGN_Login_submitBTN));

        return loginPage;

    }





}

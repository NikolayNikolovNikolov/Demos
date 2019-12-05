package SA.POM;

import n3qa.WD.support.TextBox;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class NewsFeedPageClass extends PageBase {


    //Support class
    private WebDriver driver;
    private WebElement element;
    TextBox textBox;
    private List<WebElement> listOfelements; // will be used for the UserInteractions - POSTS/COMMENTS

    //POM classes
    HomePageClass homePage ; // After logIn is directing to NFP
    ProfileAdministrationPageClass PAPpage;


    //Constructor
    public NewsFeedPageClass(WebDriver driver) {
        super(driver);
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }

    //Page title
    @FindBy(how = How.XPATH, using = "//title")
    WebElement NFP_page_title;

    //Navigation bar
    @FindBy(how = How.XPATH, using = "//a[text()='Home']")
    WebElement NFP_navHomeLINK;
    @FindBy(how = How.XPATH, using = "//a[@href='/logout']")
    WebElement NFP_navLogoutLINK;
    @FindBy(how = How.XPATH, using = "//a[@data-value='userProfile']")
    WebElement NFP_navUserNameLINK;

    //Post

    @FindBy(how = How.XPATH, using = "//*[@id=\"value\" and @placeholder='Write something to share with others']")
    WebElement NFP_postTextFIELD;
    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Post')]")
    WebElement NFP_postSubmitBTN;


    public void get_TEXT_from_PageTitle() {
        String pageTitle =  NFP_page_title.getAttribute("value");
        System.out.println(pageTitle);

        String page_titleTagName =  NFP_page_title.getTagName();
        System.out.println("This is the TAGNAME: "+page_titleTagName);

        String pageTitleTXT =  NFP_page_title.getText();
        System.out.println(pageTitleTXT);
    }


    public void get_TEXT_from_navigation_bar_user_link() {
        String pageTitle =  NFP_navUserNameLINK.getAttribute("value");
        System.out.println("This is the VALUE: "+pageTitle);

        String pageTitleTXT =  NFP_navUserNameLINK.getText();
        System.out.println("This is the TEXT: "+pageTitleTXT);
    }

    public void typePOSTcontent() {

        TextBox.getInstance(driver);
//       textBox.clearTextBox(NFP_postTextFIELD);

        String pageTitleTXT =  NFP_navUserNameLINK.getText();
        System.out.println("This is the TEXT: "+pageTitleTXT);
    }




    //Elements
//public By NFP_navLogoutlink =  By.xpath("//a[@href='/logout']");
//public By NFP_navUserName_link = By.xpath("//a[@data-value='userProfile']"); // Better to be User Settings OR Profile Admin Page as pre reqmts
//public By NFP_searchTextBox = By.xpath("//input[@name='sourceText']");
//public By NFP_searchSubmitBTN = By.xpath("//input[@value='Search Users']");
//    public By NFP_page_title = By.xpath("//title");

    // Working on POST webElements
    //        //form[@method='post' and
    //       //*[@id="value" and @placeholder='Write something to share with others']

    //   if needed //button[contains(@type,'submit') - can be used for combined Xpath
    // //button[contains(text(),'Post')]

}

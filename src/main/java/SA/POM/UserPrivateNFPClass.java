package SA.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class UserPrivateNFPClass extends PageBase {

    //Support class
    private WebDriver driver;
    private WebElement element;
    private List<WebElement> listOfelements; // will be used for the UserInteractions - POSTS/COMMENTS

    //POM classes
    HomePageClass homePage ; // After logIn is directing to NFP
    ProfileAdministrationPageClass PAPpage;

    //Constructor
    public UserPrivateNFPClass(WebDriver driver) {
        super(driver);
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }




}

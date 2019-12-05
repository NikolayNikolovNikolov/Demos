package SA.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProfileAdministrationPageClass extends PageBase {

    //Support class
    private WebDriver driver;
    private WebElement element;
    private List<WebElement> listOfelements; // will be used for the UserInteractions

    //POM classes
    HomePageClass homePage ; // After logIn is directing to NFP



    /*Wait was defined in PageBase due to RedGreenRefactor
    private WebDriverWait getWait() {
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.pollingEvery(250, TimeUnit.MILLISECONDS);
        wait.ignoring(NoSuchElementException.class);
        return wait;
    }
    */

    public ProfileAdministrationPageClass(WebDriver driver) {
        super(driver);
        this.driver=driver;
        //PageFactory.initElements(driver,this);

    }
}

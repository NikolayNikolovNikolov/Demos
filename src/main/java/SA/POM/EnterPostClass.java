package SA.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EnterPostClass extends PageBase {

    //support
    private WebDriver driver;
    private WebDriverWait wait;
    private LoginPageClass loginPage;


    //constructor
    public EnterPostClass(WebDriver driver) {
        super(driver);
        this.driver = driver;
        //  PageFactory.initElements(driver,this);
    }
}

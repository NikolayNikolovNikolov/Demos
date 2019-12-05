package SA.POM;

import SA.POM.factory.CustomFactory;
import SA.POM.factory.PageName;
import n3qa.WD.support.n3Logger;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;



public class PageBase {
    private WebDriver driver;
//    public static final n3Loger LOG = LogManager.getRootLogger();
    public static final Logger LOG = n3Logger.getLogger(PageBase.class);


    @FindBy(how = How.XPATH, using = "//a[@href='/logout']")
    public WebElement logout;

    //Constructor
    public PageBase (WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }


    //General wait method
    public WebDriverWait getWait() {
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.pollingEvery(250, TimeUnit.MILLISECONDS);
        wait.ignoring(NoSuchElementException.class);
        return wait;
    }



    public HomePageClass  logoutFromSA() {
        logout.click();
        HomePageClass homePage = new HomePageClass(driver);

        return homePage;
    }

    protected PageBase navigateTo(PageName name, WebDriver driver, WebElement element){
        WebDriverWait wait = getWait();
        wait.until(ExpectedConditions.visibilityOf(element));
        return CustomFactory.getInstance(name, driver);

    }

    public void hardWait(int timeOutInMiliSec) throws InterruptedException {

        Thread.sleep(timeOutInMiliSec);
    }




}

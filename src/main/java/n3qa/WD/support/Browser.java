package n3qa.WD.support;

 import n3qa.WD.support.n3Logger;
 import org.apache.log4j.Logger;
 import org.openqa.selenium.WebDriver;

 import static n3qa.WD.support.n3Logger.*;

public class Browser {
	
	private static Browser browser;
	private static WebDriver wdDrvier;


	private Browser(WebDriver driver){
		wdDrvier = driver;
	}
	
	public static Browser getInstance(WebDriver driver){
		if(browser == null || wdDrvier.hashCode() != driver.hashCode())
			browser = new Browser(driver);

		return browser;
	}
	

	
	
	public void moveForward(){
		wdDrvier.navigate().forward();
	}
	
	public void moveBackword(){
		wdDrvier.navigate().back();
	}
	
	public void refresh(){
		wdDrvier.navigate().refresh();
	}
	
	public void maximize(){
		wdDrvier.manage().window().maximize();
	}

	public void hardWait(int timeOutInMiliSec) throws InterruptedException {

		Thread.sleep(timeOutInMiliSec);
	}

}

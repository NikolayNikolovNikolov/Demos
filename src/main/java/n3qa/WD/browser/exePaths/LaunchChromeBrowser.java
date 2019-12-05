package n3qa.WD.browser.exePaths;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\AUTOMATION\\BROWSERS\\ChromeDriver\\versions\\78\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); // web driver framework will launch the browser
		System.out.println(driver.toString());
	}

}

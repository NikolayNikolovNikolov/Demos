package n3qa.WD.support;

import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;

import n3qa.WD.browser.BrowserConfiguration;
import n3qa.WD.browser.CustomChromeDriver;
import n3qa.WD.browser.CustomFirefoxDriver;
import n3qa.WD.support.Alert;
import n3qa.WD.support.Browser;
import n3qa.WD.support.Button;
import n3qa.WD.support.Dropdown;
import n3qa.WD.support.GenericHelper;
import n3qa.WD.support.TextBox;
import n3qa.WD.support.Window;
import n3qa.WD.settings.IReader;
import n3qa.WD.settings.ReadConfigProperties;

public class DriverSvS implements Closeable {


    private WebDriver driver;
	private BrowserConfiguration browserConfiguration;
	


	private CustomChromeDriver chromeDriver;
	private Browser browser;
	private Button button;
	private Window window;
	private Alert alert;
	private TextBox textBox;
	private Dropdown dropDown;
	private GenericHelper genericHelper;
	private JavaScript js;



	public GenericHelper getGenericHelper() {
		return genericHelper;
	}

	private IReader reader;
	


	public void launchBrowser(){

		reader = new ReadConfigProperties();
		reader.setBrowserType();

		driver = getBrowserDriver();
		browser = Browser.getInstance(driver);
		button = Button.getInstance(driver);
		window = Window.getInstance(driver);
		alert = Alert.getInstance(driver);
		js = JavaScript.getInstance(driver);
		textBox = TextBox.getInstance(driver);
		dropDown = Dropdown.getInstance(driver);
		genericHelper = GenericHelper.getInstance(driver);
		driver.manage().timeouts().pageLoadTimeout(reader.getExplicitWait(), TimeUnit.SECONDS); //Page load time out
		browser.maximize();
	}
	
	private WebDriver getBrowserDriver() {

		switch (reader.getBrowserType()) {
		
		case BrowserType.CHROME:

			browserConfiguration = new CustomChromeDriver();
			return browserConfiguration.getBrowserDriver();
		
		case BrowserType.FIREFOX:

			browserConfiguration = new CustomFirefoxDriver();
			return browserConfiguration.getBrowserDriver();
			
		default:
			throw new RuntimeException("Invalid Browser Type : " + reader.getBrowserType());
		}
	}

	public DriverSvS() {
		launchBrowser();
	}

	@Override
	public void close() throws IOException {
		
	}
	public BrowserConfiguration getBrowserConfiguration() {
		return browserConfiguration;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public CustomChromeDriver getChromeDriver() {
		return chromeDriver;
	}

	public Browser getBrowser() {
		return browser;
	}

	public Button getButton() {
		return button;
	}

	public Window getWindow() {
		return window;
	}

	public Alert getAlert() {
		return alert;
	}


	public TextBox getTextBox() {
		return textBox;
	}

	public Dropdown getDropDown() {
		return dropDown;
	}

	public JavaScript getJs() {
		return js;
	}

	public IReader getReader() {
		return reader;
	}

	public Dropdown getDropDownHelper() {
		return dropDown;
	}

	public TextBox getTextBoxHelper() {
		return textBox;
	}
}

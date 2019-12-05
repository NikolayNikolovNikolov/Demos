package n3qa.WD.support;

import org.openqa.selenium.WebDriver;

import n3qa.WD.support.DriverSvS;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class GeneralHook {
	
	private DriverSvS services;
	private WebDriver driver;
	
	public GeneralHook(DriverSvS services) {
		this.services = services;
		this.driver = services.getDriver();
	}
	
	@Before(value="@regression",order = 2)
	public void setupForRegression(){
		System.out.println("==========================");
		System.out.println("V*V*V*V*V*V*V*V*V*V*V*V*V*V");
		System.out.println("R E G R E S I O N   S U I T E");
	}
	
	@Before(value="@smoke")
	public void setupForSmoke(){
		System.out.println("==========================");
		System.out.println("V*V*V*V*V*V*V*V*V*V*V*V*V*V");
		System.out.println("S M O K E    S U I T E");
	}
	
	@Before(order = 1)
	public void setup() {
		System.out.println("==========================");
		System.out.println("V*V*V*V*V*V*V*V*V*V*V*V*V*V");
		System.out.println(" T E S T   C A S E");
	}
	
	@After
	public void teardown(Scenario scenario) {
		if(scenario.isFailed()){
			captureScreenShot(scenario);
		}
		if(driver != null){
	    	driver.quit(); // it will close all the window and stop the web driver
	    }
		
	}

	private void captureScreenShot(Scenario scenario) {
		int random = (int)(Math.random() * 1000);
		services.getGenericHelper().takeScrenShot("Screenshot", "src" + random +".png");
		scenario.embed(services.getGenericHelper().takeScrenShot(), "image/png");
	}

}

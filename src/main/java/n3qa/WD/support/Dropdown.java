package n3qa.WD.support;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	
	private static Dropdown drodownHelper;
	private static WebDriver wdDrvier;
	
	private Dropdown(WebDriver driver){
		wdDrvier = driver;
	}
	
	public static Dropdown getInstance(WebDriver driver){
		if(drodownHelper == null || wdDrvier.hashCode() != driver.hashCode())
			drodownHelper = new Dropdown(driver);
		return drodownHelper;
	}
	

	public void selectByVisibleText(By locator,String visibleValue){
		Select select = new Select(wdDrvier.findElement(locator));
		select.selectByVisibleText(visibleValue);
	}
	

	public void selectByIndex(By locator,int index){
		Select select = new Select(wdDrvier.findElement(locator));
		select.selectByIndex(index);
		
	}

	public void selectByValue(By locator,String valueAttribute){
		Select select = new Select(wdDrvier.findElement(locator));
		select.selectByValue(valueAttribute);
	}
	
	public void selectByValue(WebElement element,String valueAttribute){
		Select select = new Select(element);
		select.selectByValue(valueAttribute);
	}
	

	public List<WebElement> getAllValues(By locator){
		Select select = new Select(wdDrvier.findElement(locator));
		return select.getOptions();
	}

}

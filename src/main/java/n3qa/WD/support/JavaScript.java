
package n3qa.WD.support;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;





public class JavaScript {

	private static JavaScript javaScript;
	private static WebDriver wdDrvier;

	JavaScript(WebDriver driver){
		wdDrvier = driver;
	}

	public static JavaScript getInstance(WebDriver driver){
		if(javaScript == null || wdDrvier.hashCode() != driver.hashCode())
			javaScript = new JavaScript(driver);
		return javaScript;
	}


	public Object executeScript(String script) {
		JavascriptExecutor exe = (JavascriptExecutor) wdDrvier;

		return exe.executeScript(script);
	}

	public Object executeScript(String script, Object... args) {
		JavascriptExecutor exe = (JavascriptExecutor) wdDrvier;

		return exe.executeScript(script, args);
	}

	public void scrollToElemet(WebElement element) {
		executeScript("window.scrollTo(arguments[0],arguments[1])",
				element.getLocation().x, element.getLocation().y);

	}

	public void scrollToElemet(By locator) {
		scrollToElemet(wdDrvier.findElement(locator));

	}

	public void scrollToElemetAndClick(By locator) {
		WebElement element = wdDrvier.findElement(locator);
		scrollToElemet(element);
		element.click();

	}

	public void scrollToElemetAndClick(WebElement element) {
		scrollToElemet(element);
		element.click();

	}

	public void scrollIntoView(WebElement element) {
		executeScript("arguments[0].scrollIntoView()", element);

	}

	public void scrollIntoView(By locator) {
		scrollIntoView(wdDrvier.findElement(locator));

	}

	public void scrollIntoViewAndClick(By locator) {
		WebElement element = wdDrvier.findElement(locator);
		scrollIntoView(element);
		element.click();

	}

	public void scrollIntoViewAndClick(WebElement element) {
		scrollIntoView(element);
		element.click();

	}
}

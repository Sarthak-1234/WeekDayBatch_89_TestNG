package utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import init.TestInitiator;

public class CommonFunctions {
	
	static JavascriptExecutor js;


	public static void scrollDownToPixels(int i) {
		js = (JavascriptExecutor)TestInitiator.driver;
		js.executeScript("window.scrollBy(0, "+i+")");
	}
	
	public static void moveToElementWithParticularPixels(WebElement ele, int x, int y) {
		Actions act = new Actions(TestInitiator.driver);
		act.moveToElement(ele, x, y).click().build().perform();
	}
	
	public static void clickUsingJavaSciptExecutor(WebElement locator) {
		js = (JavascriptExecutor)TestInitiator.driver;
		js.executeScript("arguments[0].click()", locator);
	}
	
	public static void typeUsingJavaScriptExecutor(String text, WebElement locator) {
		js = (JavascriptExecutor)TestInitiator.driver;
//		js.executeScript("arguments[0].value="+"'"+text+"'"+"", locator);
//		js.executeScript("arguments[0].value="+text+"", locator);
	}
	
	public static void scrollToParticularLocator(WebElement locator) {
		JavascriptExecutor js = (JavascriptExecutor)TestInitiator.driver;
		js.executeScript("arguments[0].scrollIntoView()", locator);
	}
	
	
	
	
//	public static void scrollToBottom() {
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("window.scrollByBottom...");
//	}

}

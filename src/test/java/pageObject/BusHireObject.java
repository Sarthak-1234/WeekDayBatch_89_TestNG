package pageObject;

import org.openqa.selenium.WebDriver;

public class BusHireObject {
	
   WebDriver driver;
	
	public BusHireObject(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getCurrentTitle() {
		return driver.getTitle();
	}

}

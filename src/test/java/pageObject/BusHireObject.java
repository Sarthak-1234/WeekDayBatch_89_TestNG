package pageObject;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BusHireObject {
	
   WebDriver driver;
   private static final Logger LOGGER = LoggerFactory.getLogger(BusHireObject.class);
	
	public BusHireObject(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getCurrentTitle() {
		LOGGER.info("Current Title = "+driver.getTitle());
		return driver.getTitle();
	}

}

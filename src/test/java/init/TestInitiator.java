package init;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pageObject.BusHireObject;
import pageObject.HomePageObject;

public class TestInitiator {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(TestInitiator.class);
	
	//This comment is added intentionally for git commit
	
	
	
	
	
	
	//ExtentReport Practice----------
	
	public static WebDriver driver;
	
	public HomePageObject homepage;
	public BusHireObject bushirepage;
	
	@BeforeClass
	public void launchBrowser() throws IOException {
		
		driver = WebDriverIniator.driverLaunch();
		pageObjects();
	}
	
	public void pageObjects() {
		LOGGER.info("Creating objects of pages");
		homepage = new HomePageObject(driver);
		bushirepage = new BusHireObject(driver);	
	}
	
	@BeforeMethod
	public void launchURL() {
		//System.out.println("Launching URL = " + System.getenv("URL"));
		LOGGER.info("Launching URL = "+ System.getenv("URL"));
		driver.get(System.getenv("URL"));
	}
	
	@AfterClass
	public void closeBrowser() {
		LOGGER.info("Closing Driver");
		driver.close();
	}
	
	
	
	
	
	//1. Testclass extend TestInitator -----> so that it can use BeforeMethod/BeforeClass
	//2. We have changed the access modifier of HomePageobject

}

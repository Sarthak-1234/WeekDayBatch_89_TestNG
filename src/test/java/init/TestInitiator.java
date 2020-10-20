package init;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pageObject.BusHireObject;
import pageObject.HomePageObject;

public class TestInitiator {
	
	//This comment is added intentionally for git commit
	
	WebDriver driver;
	
	public HomePageObject homepage;
	public BusHireObject bushirepage;
	
	@BeforeClass
	public void launchBrowser() throws IOException {
		
		driver = WebDriverIniator.driverLaunch();
		pageObjects();
	}
	
	public void pageObjects() {
		homepage = new HomePageObject(driver);
		bushirepage = new BusHireObject(driver);	
	}
	
	@BeforeMethod
	public void launchURL() {
		driver.get("https://www.google.com/");
	}
	
	@AfterClass
	public void closeBrowser() {
		//driver.close();
	}
	
	
	
	
	
	//1. Testclass extend TestInitator -----> so that it can use BeforeMethod/BeforeClass
	//2. We have changed the access modifier of HomePageobject

}

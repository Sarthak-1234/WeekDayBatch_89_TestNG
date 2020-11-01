package init;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import managers.PropertyFileReading;

public class WebDriverIniator {
	static WebDriver driver;
	private static final Logger LOGGER = LoggerFactory.getLogger(WebDriverIniator.class);
	
	public static WebDriver driverLaunch() throws IOException {
	    //reading browser from property file

//	String varBrowser = PropertyFileReading.getKey("config", "browser");	
//	if(varBrowser.equalsIgnoreCase("Chrome")) {
//	System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver_windows.exe");
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	} else if(varBrowser.equalsIgnoreCase("Firefox")) {
//		System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/geckodriver.exe");
//		driver = new FirefoxDriver();
//	} else if(varBrowser.equalsIgnoreCase("abc")) {
//		System.out.println("To be implemented");
//	} //Android + //OS ....
		
		
		String varBrowser = System.getenv("BROWSER");
		if(varBrowser.equalsIgnoreCase("Chrome")) {
			LOGGER.info("Launching Chrome Driver");	
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver_windows.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		} else if(varBrowser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		} else if(varBrowser.equalsIgnoreCase("abc")) {
			//System.out.println("To be implemented");
			LOGGER.info("To be implemented");
		} //Android + //OS ....
    
	
	
	return driver;
	}
	
	
	
	//Kisi class ka func ...1. Object 2. static 
	
	//if it is static ------  > Classname.functionname

}

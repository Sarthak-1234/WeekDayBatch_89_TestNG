package test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import init.TestInitiator;
import managers.PropertyFileReading;
import pageObject.HomePageObject;
import utils.Xls_Reader;

//@Listeners(utils.Listener.class)
public class HomePageTest extends TestInitiator
{
	
	private static final Logger LOGGER = LoggerFactory.getLogger(HomePageTest.class);
//	@Test
//	public void getTitleOfHomePage() {
//		Assert.assertEquals(homepage.getTitle(), "Book Bus Travels, AC Volvo Bus, rPool & Bus Hire - redBus India");
//	}
//	
//	@Test
//	public void checkHeaderComponents() {
//		Assert.assertEquals(homepage.checkColorOfLogo(), "rgba(0, 0, 238, 1)", "Logo Color is not matching");
//		Assert.assertTrue(homepage.checkRedBusLogo());
//		Assert.assertEquals(homepage.checkTextOfLogo(), "redbus", "Text of logo is not matching");
//		Assert.assertTrue(homepage.checkBusTicket());
//		Assert.assertTrue(homepage.checkrPool());
//		Assert.assertTrue(homepage.checkBusHire());
//		Assert.assertTrue(homepage.checkHelp());
//		Assert.assertTrue(homepage.checkManageBooking());
//		Assert.assertTrue(homepage.checkProfile());
//	}
	
//	@Test
//	public void checkSearchBus() throws InterruptedException {
//		homepage.enterFromCity();
//		homepage.enterTocity();
//		homepage.date();
//		homepage.searchButton();
	
	//Assertions....
//	}

	@Test
	public void bookTicket() throws InterruptedException, IOException {
		
		LOGGER.info("Running testcase of homepagetest");
		
		homepage.selectFromCity();
		homepage.selectToCity();
		homepage.selectDate();
		homepage.searchBusButton();
		homepage.closeSafetyPopup();
		homepage.viewSeats();
		homepage.clickSeatFromCanvas();
		homepage.selectTime();
		
		Assert.assertTrue(homepage.checkProceedToContinue());
	}
}

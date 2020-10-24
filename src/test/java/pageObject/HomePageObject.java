package pageObject;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.PropertyFileReading;
import utils.Xls_Reader;

public class HomePageObject {
	
	WebDriver driver;
	
	public HomePageObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//These are our locators of Homepage
	
	@FindBy(css="a.redbus-logo.home-redirect")
	public WebElement redBusLogo;
	
	@FindBy(css="a#redBus")
	public WebElement busTicket;
	
	@FindBy(css="a#cars")
	public WebElement rPool;
	
	@FindBy(css="a[id='redBus Bus Hire']")
	public WebElement busHire;
	
	@FindBy(xpath="//a[text()='Help']")
	public WebElement help;
	
	@FindBy(css="div#manageHeaderdd")
	public WebElement manageBooking;
	
	@FindBy(css="div#signin-block")
	public WebElement profileDropDown;
	
	
	
//	@FindBy(xpath="//a[]xxxxx")
//	public WebElement redBusLogo1;
//	
//	@FindBy(id="x")
//	public WebElement redBusLogo2;
	
	
	
	//These are functions of homepage

	public String getTitle() {
		return driver.getTitle();
	}

	public boolean checkRedBusLogo() {
		return redBusLogo.isDisplayed();
	}
	
	public String checkTextOfLogo() {
		return redBusLogo.getText();
	}
	
	public String checkColorOfLogo() {
		return redBusLogo.getCssValue("color");
	}
	
	public String checkBGColorOfLogo() {
		return redBusLogo.getCssValue("bg-color");
	}
	
	public boolean checkBusTicket() {
		return busTicket.isDisplayed();
	}

	public boolean checkrPool() {
		return rPool.isDisplayed();
	}

	public boolean checkBusHire() {
		return busHire.isDisplayed();
	}

	public boolean checkHelp() {
		return help.isDisplayed();
	}

	public boolean checkManageBooking() {
		return manageBooking.isDisplayed();
	}

	public boolean checkProfile() {
		return profileDropDown.isDisplayed();
	}

	

	
	
}

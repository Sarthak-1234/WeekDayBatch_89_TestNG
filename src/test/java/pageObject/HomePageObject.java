package pageObject;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import managers.PropertyFileReading;
import utils.CommonFunctions;

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
	
	
	@FindBy(css="input#src")
	public WebElement fromTextbox;
	
	@FindBy(css="ul.autoFill>li")
	public List<WebElement> dropDown;
	
	@FindBy(css="input#dest")
	public WebElement toTextbox;
	
	@FindBy(css="td.current.day")
	public WebElement date;
	
	@FindBy(css="button#search_btn")
	public WebElement searchBusButton;
	
	@FindBy(css="div.close")
	public WebElement closeSafetyPopup;
	
	@FindBy(xpath="(//div[text()='View Seats'])[1]")
	public WebElement viewSeats;
	
	@FindBy(css="canvas[data-type='lower']")
	public WebElement busCanvas;
	
	@FindBy(xpath="//button[text()='Proceed to book']")
	public WebElement proceedToContButton;
	

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

	public void selectFromCity() throws InterruptedException, IOException {
		String city = PropertyFileReading.getKey("homepageData", "fromCity");
		fromTextbox.sendKeys(city);
		Thread.sleep(2000);
		for(WebElement e: dropDown) {
			if(e.getText().contains(city)) {
				e.click();
				break;
			}
		}
	}

	public void selectToCity() throws InterruptedException, IOException {
		String cityTo = PropertyFileReading.getKey("homepageData", "toCity");
		toTextbox.sendKeys(cityTo);
		Thread.sleep(2000);
		for(WebElement e: dropDown) {
			if(e.getText().contains(cityTo)) {
				e.click();
				break;
			}
		}
		
	}

	public void selectDate() {
		date.click();
	}
	
	public void searchBusButton() {
		searchBusButton.click();
	}
	
	public void closeSafetyPopup() throws InterruptedException {
		
//		if(closeSafetyPopup.isDisplayed()) {
//			closeSafetyPopup.click();
//		} else {
//			System.out.println("Popup is not appeared");
//		}
		Thread.sleep(2000);
		
		try {
			//Garima is present in class -  -- Garima will teach  ----error
		} catch(Exception e) {
			System.out.println("Safura and Priyanka will teach");
		}
		
		
		try {
		closeSafetyPopup.click();
		}catch(Exception e) {
			System.out.println("Safety Popup is not appeared");
		}
	}

	public void viewSeats() {
		
		//div.result-sec>ul.bus-items:nth-child(2)>div:nth-child(1) div.button.view-seats.fr
		
		//(//div[text()='View Seats'])[1]
		
		
		//Scroll
		
//		TakesScreenshot ts = (TakesScreenshot)driver;
//		ts.getScreenshotAs(target)
		
		CommonFunctions.scrollDownToPixels(200);
		
		viewSeats.click();
		
	}

	

	public void clickSeatFromCanvas() throws InterruptedException {
		Thread.sleep(2000);
		CommonFunctions.moveToElementWithParticularPixels(busCanvas, 379, 105);
	}

	public void selectTime() {
		// TODO Auto-generated method stub
		
		//This you can implement
		
		//dummy -----CommonFunctions.scrollDownToPixels(600);
		
	}

	public boolean checkProceedToContinue() {
		return proceedToContButton.isDisplayed();
	}
	
	
//	public void clickOnLoginButton() {
//		CommonFunctions.clickUsingJavaSciptExecutor(viewSeats);
//	}
	
	
	public void enterSomeTextUsingjS() {
		CommonFunctions.typeUsingJavaScriptExecutor("abc", viewSeats);
	}

	

	

	
	
}

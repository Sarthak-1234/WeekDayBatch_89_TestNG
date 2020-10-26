package pageObject;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

	public void selectFromCity() throws InterruptedException {
		fromTextbox.sendKeys("Kashmiri Gate");
		Thread.sleep(2000);
		for(WebElement e: dropDown) {
			if(e.getText().contains("Kashmiri Gate")) {
				e.click();
				break;
			}
		}
	}

	public void selectToCity() throws InterruptedException {
		toTextbox.sendKeys("Chandigarh");
		Thread.sleep(2000);
		for(WebElement e: dropDown) {
			if(e.getText().contains("Chandigarh")) {
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
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 200)");
		
		viewSeats.click();
		
	}

	

	public void clickSeatFromCanvas() throws InterruptedException {
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		
		act.moveToElement(busCanvas, 379, 105).click().build().perform();
	}

	public void selectTime() {
		// TODO Auto-generated method stub
		
		//This you can implement
		
	}

	public boolean checkProceedToContinue() {
		return proceedToContButton.isDisplayed();
	}

	

	

	
	
}

package pageObject;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.PropertyFileReading;
import utils.Xls_Reader;



public class HomePageObject {
	
	WebDriver driver;
	
	public HomePageObject(WebDriver driver) {
		this.driver = driver;
	}
	
	//can function name same as constructor name
	
	//Locators

	//Functions
	public void enterTextInFromField(String fromVar) throws IOException {
		
		//Intentiaonally calling property file
		
		PropertyFileReading.getKey("", "");
		driver.findElement(By.id("src")).sendKeys(fromVar);
	}

	public void selectCityFromDropdown(String fromVar) {
		List<WebElement> allOptions = driver.findElements(By.xpath("//ul[@class='autoFill']/li"));
		
		for(WebElement e: allOptions) {
			//System.out.println(e.getText());
			if(e.getText().contains(fromVar)) {
				e.click();
				break;
				
				//break -----skip from for / foreach loop
				//continue -----skip the current iteration   ----for (int i=1;i<=5;i++)   ----if(i==4) = continue;
			}
		}
	}
	
	public void googleTextbox() throws InterruptedException {
		driver.findElement(By.name("q")).sendKeys("Automation Testing");
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//input[@aria-label='Google Search'])[1]"))));
		
		
	}
	
	//BDD = Cucumber
	
	//TDD = 

	public void writeSuggestionsInExcel() {
		
		
		List<WebElement> suggestions = driver.findElements(By.xpath("//ul[@class='erkvQe']//span"));
		Xls_Reader obj = new Xls_Reader("src\\test\\resources\\excelFiles\\Data.xlsx");
		System.out.println("Suggestions = "+suggestions.size());
		System.out.println(suggestions.get(2).getText());
		
		for(int i=2;i<=suggestions.size()+1;i++) {
			//obj.setCellData(sheetName, colName, rowNum, data)
		obj.setCellData("Sheet1", "G", i, suggestions.get(i-2).getText());
		}
		
	
		
	//	<li name="Submit" type="Submit" aria-label="Submit">Submit</li>
		
		
		
	}

	
}

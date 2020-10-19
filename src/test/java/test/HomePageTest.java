package test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import init.TestInitiator;
import managers.PropertyFileReading;
import pageObject.HomePageObject;
import utils.Xls_Reader;

public class HomePageTest extends TestInitiator
{
	
	//FunctionsCall + Assertions
	
	
	
	
	
	
	@Test
	public void bookTicket() throws IOException, InterruptedException {
		
		
		homepage.googleTextbox();
		homepage.writeSuggestionsInExcel();
		
		//System.out.println(obj.getCellData("Sheet1", "Name", 2)+"-------->"+obj.getCellData("Sheet1", "ID", 2));
		//System.out.println(obj.getCellData("Sheet1", "Name", 3)+"-------->"+obj.getCellData("Sheet1", "ID", 3));
		
		
		//To read full sheet
		
//		for(int i=2;i<=obj.getRowCount("Sheet1");i++) {
//		//System.out.println(obj.getCellData("Sheet1", "Name", i);
//		if(obj.getCellData("Sheet1", "Name", i).equalsIgnoreCase("Sarthak")) {
//			Assert.assertEquals("123.0", obj.getCellData("Sheet1", "ID", i));
//		}
//		}
		
		//if name =Java then id 232323
		
//		obj.setCellData("Sheet1", "Name", 4, "ABCC");
//		obj.setCellData("Sheet1", "ID", 4, "56");
//		
//		
//		System.out.println(obj.getCellData("Sheet1", "Name", 4)+"----->"+obj.getCellData("Sheet1", "ID", 4));
		
		
		
		
		
		


		
		
		
		
	
		//Function call + assertions
		//bushirepage.getCurrentTitle() ------this function belongs to bus hire object...and we are calling in HomePageTest
		
//		String cityVar = PropertyFileReading.getKey("homepageData","fromCity");
//		
//		homepage.enterTextInFromField(cityVar);
//		homepage.selectCityFromDropdown(cityVar);	
//		System.out.println(PropertyFileReading.getKey("homepageData", "toCity"));
		
		
		
	}

	
	
	
	
	
	
	


}

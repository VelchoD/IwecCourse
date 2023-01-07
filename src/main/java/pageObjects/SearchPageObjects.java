package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.Base;
import testData.TestD;

public class SearchPageObjects extends Base {
		
		TestD td = new TestD();
		
		//Web element locator searchbox Home page
		@FindBy(xpath = "//input[@id='small-searchterms']")
		WebElement searchbox;
		
		//Web element locator search bitton
		@FindBy(xpath = "//button[@type='submit']") 
		WebElement SearchBtn; 
		
		//Web element locator message
		@FindBy(xpath = "//div[@class='no-result'") 
		WebElement actualmessage;
		
 
public SearchPageObjects() {

			PageFactory.initElements(driver, this);
		}
		
		public void Search(String Product) {
			searchbox.sendKeys(Product);
			SearchBtn.click();
		}
		
		public void verifyProductListPage() {
			Assert.assertEquals(driver.getTitle(), td.SearchTitle);
		}
		
		public void verifyUnsuccessfulSearch() {
			Assert.assertEquals(actualmessage,td.expectedmessage);
		}
		
}



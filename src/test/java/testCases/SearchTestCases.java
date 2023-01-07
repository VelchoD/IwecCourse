package testCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Base;
import pageObjects.SearchPageObjects;
import testData.TestD;

public class SearchTestCases extends Base {
	
	SearchPageObjects sp;
	TestD td;

	@BeforeMethod
	public void start() {
		
		openApplication();
		sp = new SearchPageObjects();
		td = new TestD();	
	}
		
	@Test
	public void SearchValidProduct() {
		
		sp.Search(td.validProduct);
		sp.verifyProductListPage();
	    String actualurl = driver.getCurrentUrl();
		Assert.assertEquals(actualurl,td.ProductListPageURL);
		System.out.println(actualurl);
	}
	
	@Test
	public void SearchInvalidProduct() {
		sp.Search(td.invalidProduct);
		sp.verifyProductListPage();
		String actualmessage= driver.findElement(By.xpath("//div[@class='no-result']")).getText();
		Assert.assertEquals(actualmessage,td.expectedmessage);
		System.out.println(actualmessage);
	}
	
	@Test
	public void SearchProduct() {
		sp.Search(td.Product);
		sp.verifyProductListPage();
		String actualmessage= driver.findElement(By.xpath("//div[@class='warning']")).getText();
		Assert.assertEquals(actualmessage,td.expectedmessage1);
		System.out.println(actualmessage);
	}
	
@AfterMethod
public void end() throws InterruptedException {
	Thread.sleep(3000);
	driver.quit();
}
}
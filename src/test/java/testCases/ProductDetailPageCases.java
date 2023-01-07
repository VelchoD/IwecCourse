package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Base;
import pageObjects.HomePageObjects;
import pageObjects.ProductDetailPageObject;
import testData.TestD;

public class ProductDetailPageCases  extends Base {
	
	HomePageObjects hp;
	ProductDetailPageObject pdp;
	TestD td;

	@BeforeMethod
	public void start() {
		
		openApplication();
		pdp = new ProductDetailPageObject();
		td = new TestD();
	}
	
	@Test
	public void SearchComputers() {
		
		pdp.Product();
	    String actualurl = driver.getCurrentUrl();
		Assert.assertEquals(actualurl,td.expectedurl1);
		System.out.println(actualurl);
	}
	   
	@Test
	public void XButtonPicture() {
		
		pdp.Product1();
	    String actualurl = driver.getCurrentUrl();
		Assert.assertEquals(actualurl,td.expectedurl1);
		System.out.println(actualurl);

	}
	@Test
	public void Addtocart() {
		
		pdp.Product2();
		 WebDriverWait wait=new WebDriverWait(driver,80);
	 	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='content']")));
		 String actualmessage002=driver.findElement(By.xpath("//p[@class='content']")).getText();
		 Assert.assertEquals(actualmessage002,td.expectedmessage002);
		 System.out.println(actualmessage002);

	}
	
	@AfterMethod
	public void end() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
}

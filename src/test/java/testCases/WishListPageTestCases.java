package testCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Base;
import pageObjects.HomePageObjects;
import pageObjects.WishlistPageObjects;
import testData.TestD;

public class WishListPageTestCases  extends Base {
	
	HomePageObjects hp;
	WishlistPageObjects wlp;
	TestD td;

	@BeforeMethod
	public void start() {
		openApplication();
		wlp = new WishlistPageObjects();
		td = new TestD();
	}

	@Test
	public void wishlist() {
		
		wlp.Product();
	    String actualurl = driver.getCurrentUrl();
		Assert.assertEquals(actualurl,td.expectedurl2);
		System.out.println(actualurl);
	}
	
	
	@Test
	public void wishlistXButton() {
		
		wlp.Product1();
		String actualmessage=driver.findElement(By.xpath("//div[@class='no-data']")).getText();
		Assert.assertEquals(actualmessage,td.expectedmessage3);
		System.out.println(actualmessage);
	
	}
	
	@Test
	public void wishlistAddtocart() {
		
		wlp.Product3();
		String actualurl = driver.getCurrentUrl();
		Assert.assertEquals(actualurl,td.expectedurl5);
		System.out.println(actualurl);
	
	}
	
	@Test
	public void updatewishlist() {
		
		wlp.Product4();
		 String singleprice = driver.findElement(By.xpath("//span[@class='product-unit-price']")).getText();
		 Assert.assertEquals(singleprice,td.expectedprice);
		 System.out.println(singleprice);
		 String totalprice = driver.findElement(By.xpath("//span[@class='product-subtotal']")).getText();
		 Assert.assertEquals(totalprice,td.totalprice1);
		 System.out.println(totalprice);
	
	}
	
	@AfterMethod
	public void end() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
	}

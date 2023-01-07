package testCases;


import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Base;
import pageObjects.HomePageObjects;
import pageObjects.ProductListPage;
import testData.TestD;

public class ProductListPageTestCases  extends Base {
			
			HomePageObjects hp;
			ProductListPage plp;
			TestD td;

			@BeforeMethod
			public void start() {
				openApplication();
				plp = new ProductListPage();
				td = new TestD();
			}
	
			@Test
			public void SearchComputers() {
				
				plp.Product();
			    String actualurl = driver.getCurrentUrl();
				Assert.assertEquals(actualurl,td.expectedurl);
				System.out.println(actualurl);
			}
		
			@Test
			public void Search() {
				
				plp.Product1();
				String actualmessage2=driver.findElement(By.xpath("//*[@id='bar-notification']")).getText();
				Assert.assertEquals(actualmessage2,td.expectedmessage2);
				System.out.println(actualmessage2);
			}
			
			@Test
			public void AddToCartUnviable() {
				plp.Product2();
                Assert.assertTrue(true, "Add to cart is not displayed");
			}


@AfterMethod
public void end() throws InterruptedException {
	Thread.sleep(3000);
	driver.quit();
}
}
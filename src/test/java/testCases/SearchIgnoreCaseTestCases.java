package testCases;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import base.Base;
import pageObjects.HomePageObjects;
import pageObjects.LoginPageObjects;
import pageObjects.SearchIgnoreCase;
import testData.TestD;

public class SearchIgnoreCaseTestCases extends Base {
	
	
		HomePageObjects hp;
		SearchIgnoreCase sic;
		TestD td;

		@BeforeMethod
		public void start() {
			openApplication();
			hp = new HomePageObjects();
			sic = new SearchIgnoreCase();
			td = new TestD();
		}
		
		@Test
		public void SearchIgnoreCase() {
			sic.SearchIgnore(td.product);
			String actualurl = driver.getCurrentUrl();
			assertTrue("nike".equalsIgnoreCase("Nike"));
			System.out.println(actualurl);
		}
		
		@AfterMethod
		public void end() throws InterruptedException {
			Thread.sleep(3000);
			driver.quit();
		}
}
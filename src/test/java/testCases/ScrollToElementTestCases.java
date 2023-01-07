package testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Base;
import pageObjects.HomePageObjects;
import pageObjects.LoginPageObjects;
import pageObjects.ScrollToElement;
import testData.TestD;

public class ScrollToElementTestCases extends Base {
	
	
	HomePageObjects hp;
	ScrollToElement scroll;
	TestD td;

	@BeforeMethod
	public void start() {
		openApplication();
		hp = new HomePageObjects();
		scroll = new ScrollToElement();
		td = new TestD();
	}
		
	
	@Test
	public void LoginButton() {
		hp.navigateToLoginPage();
		scroll.LoginButton();
		Assert.assertEquals(driver.getTitle(), td.loginPageTitle);
		System.out.println(td.loginPageTitle);
	}
	
	@Test
	public void BottomofPage() {
		scroll.BottomofPage();
		Assert.assertEquals(driver.getTitle(), td.homePageTitle);
		System.out.println(td.homePageTitle);
	}
	
	@Test
	public void ContactUs() {
		scroll.ContactUs();
		Assert.assertEquals(driver.getTitle(), td.ContactUsPageTitle);
		System.out.println(td.ContactUsPageTitle);
}
	
	
	@AfterMethod
	public void end() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
}
}
package testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Base;
import pageObjects.HomePageObjects;
import pageObjects.RegisterPageObjects;
import testData.TestD;

public class RegisterPageTestCases extends Base {
		
		
		HomePageObjects hp;
		RegisterPageObjects rp;
		TestD td;

		@BeforeMethod
		public void start() {
			openApplication();
			hp = new HomePageObjects();
			rp = new RegisterPageObjects();
			td = new TestD();
		}
		
		@Test
		public void RegisterWithValidCredentials() {
			hp.navigateToRegisterPage();
			rp.RegisterUser1(td.firstname, td.lastname, td.validUserName, td.validPassword, td.confirmPassword);
			rp.verifyThatUserRegister();
			Assert.assertEquals(driver.getTitle(), td.registerPageTitle);
			System.out.println(td.registermessage);

		}
		
	   @Test
		public void loginWithInvalidCredentials() {
			hp.navigateToRegisterPage();
			rp.RegisterUser2(td.firstname, td.lastname, td.inValidUserName, td.inValidPassword, td.invalidconfirmPassword);
			Assert.assertEquals(driver.getTitle(), td.registerPageTitle);
			System.out.println(td.registerPageTitle);
		}
	   
	   @Test
	 		public void loginWithWrongEmail() {
	 			hp.navigateToRegisterPage();
	 			rp.RegisterUser3 (td.firstname, td.lastname, td.inValidUserName, td.validPassword, td.confirmPassword);
	 			Assert.assertEquals(driver.getTitle(), td.registerPageTitle);
	 			System.out.println(td.registerPageTitle);
	 		}
		
	
			@AfterMethod
			public void end() throws InterruptedException {
				Thread.sleep(3000);
				driver.quit();
		}
	}


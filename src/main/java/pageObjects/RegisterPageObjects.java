package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import base.Base;
import testData.TestD;

public class RegisterPageObjects extends Base {
	
	TestD td = new TestD();
	
	//Web element locator firstname
	@FindBy(xpath = "//input[@id='FirstName']")
	WebElement firstnameInputField;
	
	//Web element locator lastname
	@FindBy(xpath = "//input[@id='LastName']")
	WebElement lasttnameInputField;
	
	//Web element locator email field
	@FindBy(xpath = "//input[@id='Email']")
	WebElement emailInputField;
	
	//Web element locator password field
	@FindBy(xpath = "//input[@id='Password']") 
	WebElement passwordInputField;
	
	//Web element locator confirmpasswpprd field
	@FindBy(xpath = "//input[@id='ConfirmPassword']") 
	WebElement confirmpasswordInputField;
	
	//Web element locator register button
	@FindBy(xpath = "//button[@id='register-button']") 
	WebElement RegisterBtn; 
		
		
		
 public RegisterPageObjects() {
			PageFactory.initElements(driver, this);
		}
		
		public void RegisterUser1 ( String firstname, String lastname, String username, String password, String confirmpassword) {
			firstnameInputField.sendKeys(firstname);
			lasttnameInputField.sendKeys(lastname);
			emailInputField.sendKeys(username);
			passwordInputField.sendKeys(password);
			confirmpasswordInputField.sendKeys(confirmpassword);
			RegisterBtn.click();
		
		}
		
		public void RegisterUser2 ( String firstname, String lastname, String username, String password, String confirmpassword) {
			firstnameInputField.sendKeys(firstname);
			lasttnameInputField.sendKeys(lastname);
			emailInputField.sendKeys(username);
			passwordInputField.sendKeys(password);
			confirmpasswordInputField.sendKeys(confirmpassword);
			RegisterBtn.click();
		}
		
		public void RegisterUser3 ( String firstname, String lastname, String username, String password, String confirmpassword) {
			firstnameInputField.sendKeys(firstname);
			lasttnameInputField.sendKeys(lastname);
			emailInputField.sendKeys(username);
			passwordInputField.sendKeys(password);
			confirmpasswordInputField.sendKeys(confirmpassword);
			RegisterBtn.click();
		}
		
		public void verifyThatUserRegister() {
			Assert.assertEquals(driver.getTitle(), td.registerPageTitle);
		}
		
	   public void verifyUnsuccessfulLogin() {
			Assert.assertEquals(driver.getTitle(), td.registerPageTitle);
		}

}


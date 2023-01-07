package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.Base;
import testData.TestD;

public class LoginPageObjects extends Base {
	
	TestD td = new TestD();
	
	//Web element locator email field
	@FindBy(xpath = "//input[@class='email']")
	WebElement emailInputField;
	
	//Web element locator pasword field
	@FindBy(xpath = "//input[@class='password']") 
	WebElement passwordInputField;
	
	//Web element locator login button
	@FindBy(xpath = "//button[@class='button-1 login-button']") 
	WebElement loginBtn; 
	
	
	
	public LoginPageObjects() {
		PageFactory.initElements(driver, this);
	}
	
	public void loginUser(String username, String password ) {
		emailInputField.sendKeys(username);
		passwordInputField.sendKeys(password);
		loginBtn.click();
	
	}
	
	public void loginUser1(String username, String password ) {
		emailInputField.sendKeys(username);
		passwordInputField.sendKeys(password);
		loginBtn.click();
	
	}
	public void loginUser2(String username, String password ) {
		emailInputField.sendKeys(username);
		passwordInputField.sendKeys(password);
		loginBtn.click();
	
	}
	
	public void verifyThatUserLogin() {
		Assert.assertEquals(driver.getTitle(), td.homePageTitle);
	}
	
	public void verifyUnsuccessfulLogin() {
		Assert.assertEquals(driver.getTitle(), td.loginPageTitle);
	}
	
}

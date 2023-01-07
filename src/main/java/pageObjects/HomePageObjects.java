package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class HomePageObjects extends Base {

	//Web element locator login Home page
	
	@FindBy(xpath = "//a[@class='ico-login']")
	WebElement loginTopMenuLink;
	
	//Web element locator register Home page
	@FindBy(xpath = "//a[@class='ico-register']")
	WebElement registerTopMenuLink;
	
	//Web element locator Computers Home page
	@FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']")
	WebElement ComputersMenulink;
	
	//Init Elements
	public HomePageObjects() {
		PageFactory.initElements(driver, this);
	}
	
	//Methods realted to home page
	
	public void navigateToLoginPage() {
		loginTopMenuLink.click();
	}
	
	public void navigateToRegisterPage() {
		registerTopMenuLink.click();
	}
	
	
	
}

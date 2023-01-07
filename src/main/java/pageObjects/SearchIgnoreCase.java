package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.Base;
import testData.TestD;

public class SearchIgnoreCase extends Base {
	
	TestD td = new TestD();
	
	//Web element locator search
	@FindBy(xpath = "//input[@id='small-searchterms']")
	WebElement Search;
	
	//Web element locator search button
	@FindBy(xpath = "//button[@class='button-1 search-box-button']") 
	WebElement SearchButton;

public SearchIgnoreCase() {
	PageFactory.initElements(driver, this);
}


public void SearchIgnore(String product ) {
	Search.sendKeys(product);
	SearchButton.click();
	
 }
}
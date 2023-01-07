package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import base.Base;
import testData.TestD;

public class WishlistPageObjects extends Base {
	
	TestD td = new TestD();
	
	//Web element locator Books link menu
	@FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Books']") 
	WebElement BooksLink;
	
	//Web element locator heart button
	@FindBy(xpath = "//div[@class='products-wrapper']//div[2]//div[1]//div[2]//div[3]//div[2]//button[3]") 
	WebElement HeartButton;
	
	//Web element locator message
	@FindBy(xpath = "//p[@class='content']") 
	WebElement message;
	
	//Web element locator wishlistbutton
	@FindBy(xpath = "//span[@class='wishlist-label']") 
	WebElement WishlistButton;
	
	//Web element locator XButton
	@FindBy(xpath = "//button[@class='remove-btn']") 
	WebElement XButton;
	
	//Web element locator message
	@FindBy(xpath = "//div[@class='no-data']") 
	WebElement actualmessage;
	
	//Web element locator checkbox
	@FindBy(xpath = "//input[@name='addtocart']") 
	WebElement checkbox;
	
	//Web element locator addtocart
	@FindBy(xpath = "//button[@name='addtocartbutton']") 
	WebElement AddToCart;
	
	//Web element locator qty
	@FindBy(xpath = "//input[@class='qty-input']")
	WebElement qty;
	
	//Web element locator update wihlist
	@FindBy(xpath = "//button[@id='updatecart']")
	WebElement updatewishlist;
			

	
    public WishlistPageObjects() {
     	PageFactory.initElements(driver, this);
}

    public void Product() {
	  BooksLink.click();
	  HeartButton.click();
	  WishlistButton.click();
  }
    
    public void Product1() {
    	BooksLink.click();
    	HeartButton.click();
    	WishlistButton.click();
    	WebDriverWait wait=new WebDriverWait(driver,50);
	 	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='remove-btn']")));
    	XButton.click();
      }
    
    public void Product3() {
  	  BooksLink.click();
  	  HeartButton.click();
  	  WishlistButton.click();
  	  checkbox.click();
  	  AddToCart.click();
    }
    
    public void Product4() {
    	  BooksLink.click();
    	  HeartButton.click();
    	  WishlistButton.click();
    	  WebDriverWait wait=new WebDriverWait(driver,80);
  	 	  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='qty-input']"))).clear();
    	  qty.click();
  	 	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='qty-input']")));
    	  qty.sendKeys("5");
  	 	  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='updatecart']")));
    	  updatewishlist.click();
      }
}
package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import base.Base;
import testData.TestD;

public class ProductDetailPageObject extends Base {
	
	TestD td = new TestD();

	//Web element locator computer link menu
	@FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']")
	WebElement ComputersMenulink;
	
	//Web element locator Notebook picture subcategory
	@FindBy(xpath = "//img[@alt='Picture for category Notebooks']")
	WebElement NotebooksPicture;
	
	//Web element locator Product laptop
	@FindBy(xpath = "//img[@alt='Picture of Asus N551JK-XO076H Laptop']") 
	WebElement ProductPicture;
	
	//Web element locator picture product
	@FindBy(xpath = "//img[@title='Picture of Asus N551JK-XO076H Laptop']") 
	WebElement Picture;
	
	//Web element locator Xbutton picture
	@FindBy(xpath = "//*[@class='mfp-container mfp-image-holder mfp-s-ready']") 
	WebElement XButton;
	
	//Web element locator desktop sybcategory
		@FindBy(xpath = "//img[@alt='Picture for category Desktops']") 
		WebElement Desktops;
		
		//Web element locator buidl own computer
		@FindBy(xpath = "//img[@title='Show details for Build your own computer']") 
		WebElement BuillOwnComputer;
				
		//Web element locator  procesor
				@FindBy(xpath = "//select[@id='product_attribute_1']") 
				WebElement procesordrop;
				
				//Web element locator ram 
				@FindBy(xpath = "//select[@id='product_attribute_2']") 
				WebElement ramdrop;
				
				//Web element locator radiobutton1
				@FindBy(xpath = "//input[@id='product_attribute_3_7']") 
				WebElement radiobutton1;
				
				//Web element locator radiobutton2
				@FindBy(xpath = "//input[@id='product_attribute_4_8']") 
				WebElement radiobutton2;
				
				//Web element locator checkbox1
				@FindBy(xpath = "//input[@id='product_attribute_5_10']") 
				WebElement checkbox1;
				
				//Web element locator checkbox2
				@FindBy(xpath = "//input[@id='product_attribute_5_11']") 
				WebElement checkbox2;
				
				//Web element locator checkbox3
				@FindBy(xpath = "//input[@id='product_attribute_5_12']") 
				WebElement checkbox3;
				
				//Web element locator add to cart
				@FindBy(xpath = "//button[@id='add-to-cart-button-1']") 
				WebElement AddToCart;
				
	
	public ProductDetailPageObject() {
		PageFactory.initElements(driver, this);
	}
	
	public void Product() {
		ComputersMenulink.click();
		NotebooksPicture.click();
		ProductPicture.click();
	}
	
	public void Product1() {
		ComputersMenulink.click();
		NotebooksPicture.click();
		ProductPicture.click();
		Picture.click();
	    new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='mfp-container mfp-image-holder mfp-s-ready']"))).click();
		XButton.click();
	}
	
	public void Product2() {
		 ComputersMenulink.click();
		 Desktops.click();
		 BuillOwnComputer.click();
		 Select procesor=new Select(procesordrop);
		 procesor.selectByValue("2");	
		 Select ram=new Select(ramdrop);
		 ram.selectByValue("3");	
		 radiobutton1.click();
		 radiobutton2.click();
		 checkbox1.click();
		 checkbox2.click();
		 checkbox3.click();
		 AddToCart.click();
	    
	}
	
public void verify() {
		
		Assert.assertEquals(driver.getCurrentUrl(), td.expectedurl1);
	}
	
	public void verifyWishMessage() {
		Assert.assertEquals(driver.getTitle(), td.PageTitle);
	}
	
}

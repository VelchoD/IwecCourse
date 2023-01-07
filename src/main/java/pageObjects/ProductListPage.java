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

public class ProductListPage extends Base {
	
	TestD td = new TestD();
	
	//Web element locator Computer link menu
	@FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']")
	WebElement ComputersMenulink;
	
	//Web element locator Notebooks picture subcategory
	@FindBy(xpath = "//img[@alt='Picture for category Notebooks']")
	WebElement NotebooksPicture;
	
	//Web element locator Product
	@FindBy(xpath = "//img[@alt='Picture of HP Envy 6-1180ca 15.6-Inch Sleekbook']") 
	WebElement ProductPicture;
	
	//Web element locator Books link menu
	@FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Books']") 
	WebElement BooksLink;
	
	//Web element locator heart button
	@FindBy(xpath = "//button[@title='Add to wishlist']") 
	WebElement HeartButton;
	
	//Web element electronics category
	@FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']") 
	WebElement Electonics;
		
	//Web element photo subcategory
	@FindBy(xpath = "//img[@title='Show products in category Camera & photo']") 
	WebElement PhotoSubCategory;
		
	//Web element camera product
	@FindBy(xpath = "//img[@title='Show details for Apple iCam']") 
	WebElement AppleCam;
	
	//Web element add to cart
	@FindBy(xpath = "//div[@class='item-grid']//div[1]//div[1]//div[2]//div[3]//div[2]//button[1]") 
	WebElement AddToCart;
	

public ProductListPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void Product() {
		ComputersMenulink.click();
		NotebooksPicture.click();
		ProductPicture.click();
	}
	
	public void Product1() {
		BooksLink.click();
		HeartButton.click();
		WebDriverWait wait=new WebDriverWait(driver,30);
	 	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='bar-notification']")));
	}
	
	public void Product2() {
		Electonics.click();
		PhotoSubCategory.click();
		AppleCam.click();
		
	}
	
	public void verify() {
		
		Assert.assertEquals(driver.getCurrentUrl(), td.expectedurl);
	}
	
	
	public void verifyWishMessage() {
		Assert.assertEquals(driver.getTitle(), td.PageTitle);
	}
	
}
	
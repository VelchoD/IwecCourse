package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.Base;
import testData.TestD;

public class CheckoutPageObjects extends Base {
	
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
	
	//Web element locator add to cart
	@FindBy(xpath = "//button[@id='add-to-cart-button-5']") 
	WebElement AddToCart;
	
	//Web element locator shopping cart
	@FindBy(xpath = "//span[@class='cart-label']") 
	WebElement ShoppingCart;
	
	//Web element locator agree checkbox
	@FindBy(xpath = "//input[@id='termsofservice']") 
	WebElement agree;
	
	//Web element locator checkout
	@FindBy(xpath = "//button[@id='checkout']") 
	WebElement CheckoutButton;
	
	//Web element locator check out as guest
	@FindBy(xpath = "//button[@class='button-1 checkout-as-guest-button']") 
	WebElement CheckoutasGuest;

	//Web element locator first name
	@FindBy(xpath = "//input[@id='BillingNewAddress_FirstName']") 
	WebElement FirstNameField;
	
	//Web element locator last name
	@FindBy(xpath = "//input[@id='BillingNewAddress_LastName']") 
	WebElement LastNameField;
	
	//Web element locator email
	@FindBy(xpath = "//input[@id='BillingNewAddress_Email']") 
	WebElement EmailField;
	
	//Web element locator dropdown country
	@FindBy(xpath = "//select[@id='BillingNewAddress_CountryId']") 
	WebElement DropdownCountry;
		
	//Web element locator city
	@FindBy(xpath = "//input[@id='BillingNewAddress_City']") 
	WebElement City;
	
	//Web element locator adress
	@FindBy(xpath = "//input[@id='BillingNewAddress_Address1']") 
	WebElement AdressField;
	
	//Web element locator zip code
	@FindBy(xpath = "//input[@id='BillingNewAddress_ZipPostalCode']") 
	WebElement ZipCodeField;
	
	//Web element locator phone
	@FindBy(xpath = "//input[@id='BillingNewAddress_PhoneNumber']") 
	WebElement PhoneField;
	
	//Web element locator continue button
	@FindBy(xpath = "//button[@onclick='Billing.save()']") 
	WebElement ContinueButton;
	
	//Web element locator radio button
	@FindBy(xpath = "//input[@id='shippingoption_1']") 
	WebElement RadioButton;
	
	//Web element locator continue button
	@FindBy(xpath = "//button[@class='button-1 shipping-method-next-step-button']") 
	WebElement ContinueButton1;
	
	//Web element locator radio button
	@FindBy(xpath = "//input[@id='paymentmethod_0']") 
	WebElement RadioButton1;
	
	//Web element locator continue button
	@FindBy(xpath = "//button[@class='button-1 payment-method-next-step-button']") 
	WebElement ContinueButton2;
	
	//Web element locator continue button
	@FindBy(xpath = "//button[@class='button-1 payment-info-next-step-button']") 
	WebElement ContinueButton3;
	
	//Web element locator confirm button
	@FindBy(xpath = "//button[normalize-space()='Confirm']") 
	WebElement ConfirmButton;
	

    public CheckoutPageObjects() {
	  PageFactory.initElements(driver, this);
}
    public void Product(String firstname, String lastname, String email, String city, String adress, String zip, String phone) {
		ComputersMenulink.click();
		NotebooksPicture.click();
		ProductPicture.click();
		AddToCart.click();
		ShoppingCart.click();
		WebDriverWait wait=new WebDriverWait(driver,80);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='termsofservice']")));
		agree.click();
		CheckoutButton.click();
		CheckoutasGuest.click();
		FirstNameField.sendKeys(firstname);
		LastNameField.sendKeys(lastname);
		EmailField.sendKeys(email);
		Select selectcountry=new Select(DropdownCountry);
		selectcountry.selectByValue("3");
		City.sendKeys(city);
		AdressField.sendKeys(adress);
		ZipCodeField.sendKeys(zip);
		PhoneField.sendKeys(phone);
		ContinueButton.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='shippingoption_1']")));
		RadioButton.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='button-1 shipping-method-next-step-button']")));
		ContinueButton1.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='paymentmethod_0']")));
		RadioButton1.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='button-1 payment-method-next-step-button']")));
		ContinueButton2.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='button-1 payment-info-next-step-button']")));
		ContinueButton3.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Confirm']")));
		ConfirmButton.click();
	}  
    public void Product1(String firstname, String lastname, String email, String city, String adress, String zip, String phone) {
    
    	ComputersMenulink.click();
		NotebooksPicture.click();
		ProductPicture.click();
		AddToCart.click();
		ShoppingCart.click();
		WebDriverWait wait=new WebDriverWait(driver,80);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='termsofservice']")));
		agree.click();
		CheckoutButton.click();
		CheckoutasGuest.click();
		FirstNameField.sendKeys(firstname);
		LastNameField.sendKeys(lastname);
		EmailField.sendKeys(email);
		Select selectcountry=new Select(DropdownCountry);
		selectcountry.selectByValue("3");
		City.sendKeys(city);
		AdressField.sendKeys(adress);
		ZipCodeField.sendKeys(zip);
		PhoneField.sendKeys(phone);
		ContinueButton.click();
    
    }
    
    public void Product2() {
        
    	ComputersMenulink.click();
		NotebooksPicture.click();
		ProductPicture.click();
		AddToCart.click();
		ShoppingCart.click();
		WebDriverWait wait=new WebDriverWait(driver,80);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='termsofservice']")));
		CheckoutButton.click();
     } 
    
}
    
    
    
    
    
    
    
    
    
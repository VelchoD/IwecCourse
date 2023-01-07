package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import base.Base;
import testData.TestD;

public class ShoppingCartPageObjects  extends Base {
	
	TestD td = new TestD();
	
	//Web element locator add to cart
	@FindBy(xpath = "//div[@class='center-2']//div[3]//div[1]//div[2]//div[3]//div[2]//button[1]") 
	WebElement AddToCat;
	
	//Web element locator message
	 @FindBy(xpath = "//p[@class='content']") 
	 WebElement message;
	   
	//Web element locator Xmessage
	 @FindBy(xpath = "//span[@title='Close']") 
	 WebElement Xmessage;
	   
	 //Web element locator shopping cart
     @FindBy(xpath = "//span[@class='cart-label']") 
	 WebElement ShoppingCart;
			
	//Web element locator message
	@FindBy(xpath = "//div[@class='no-data']") 
	WebElement actualmessage;
		
	//Web element Appareal category
	@FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Apparel']") 
	WebElement Appareal;
		
	//Web element Clothing category
	@FindBy(xpath = "//img[@title='Show products in category Clothing']") 
	WebElement Clothing;
		
	//Web element Add to cart jeans
	@FindBy(xpath = "//div[@class='products-wrapper']//div[2]//div[1]//div[2]//div[3]//div[2]//button[1]") 
	WebElement AddToCart;
		
	//Web element Nike
	@FindBy(xpath = "//img[@title='Show details for Nike Tailwind Loose Short-Sleeve Running Shirt']") 
	WebElement Nike;
		
	//Web element Size
	@FindBy(xpath = "//select[@id='product_attribute_11']") 
	WebElement size;
		
	//Web element qty
	@FindBy(xpath = "//input[@id='product_enteredQuantity_27']") 
	WebElement qty;
		
	//Web element price
	@FindBy(xpath = "//span[@class='product-subtotal']") 
	WebElement price;
		
	//Web element sku
	@FindBy(xpath = "//span[@id='sku-27']") 
	WebElement sku;

	//Web element add to cart nike
	@FindBy(xpath = "//button[@id='add-to-cart-button-27']") 
	WebElement AddToCart1;
		
	//Web element Levis
	@FindBy(xpath = "//img[@title=\"Show details for Levi's 511 Jeans\"]") 
	WebElement levis;
	
	//Web element add cart levis
	@FindBy(xpath = "//button[@id='add-to-cart-button-30']") 
	WebElement AddToCart2;
	
	//Web element add cart tshirt
	@FindBy(xpath = "//div[@class='product-item']//img[@title='Show details for Oversized Women T-Shirt']") 
	WebElement tshirt;
		
	//Web element add cart add to cart
	@FindBy(xpath = "//button[@id='add-to-cart-button-28']") 
	WebElement AddToCart3;
				
	//Web element x button in shopping cart
	@FindBy(xpath = "//button[@class='remove-btn']") 
	WebElement XbuttonShopinCart;
		
	
	//Web element add cart qty1
	@FindBy(xpath = "//input[@class='qty-input']") 
	WebElement qty1;
	
	//Web element update
	@FindBy(xpath = "//button[@id='updatecart']") 
	WebElement update;
	
		
	public ShoppingCartPageObjects() {
	     	PageFactory.initElements(driver, this);
	}
   
	    public void Product2() {
	      Actions action = new Actions(driver);
	   	  action.moveToElement(Appareal).click().perform();
	   	  Clothing.click();
	      Nike.click();
	      WebDriverWait wait=new WebDriverWait(driver,80);
  	 	  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='product_attribute_11']")));
	      Select selectsize=new Select(size);
	      selectsize.selectByValue("31");
	      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='sku-27']")));
          sku.getText();
  	 	  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='product_enteredQuantity_27']"))).clear();
    	  qty.click();
  	 	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='qty-input']")));
    	  qty.sendKeys("4");
    	  AddToCart1.click();
    	  ShoppingCart.click();
	    }

	    
    	  public void Product3() {
  	    	Appareal.click();
  	    	Clothing .click();
  			levis.click();	
  			AddToCart2.click();
  			WebDriverWait wait=new WebDriverWait(driver,80);
  			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='cart-label']")));
  			ShoppingCart.click();
  			
  		    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='1']"))).clear();
  	    	qty1.click();
  	  	 	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='qty-input']")));
  	    	qty1.sendKeys("3");
  		    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='updatecart']")));
  		    update.click();
  	  	 	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='product-unit-price']")));
  	  	 
  	    	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='3']"))).clear();
  	    	qty1.click();
  	  	 	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='qty-input']")));
  	    	qty1.sendKeys("7");
  	    	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='updatecart']")));
  		    update.click();
  	  	 	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='product-unit-price']")));

  	    	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='7']"))).clear();
  	    	qty1.click();
  	  	 	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='qty-input']")));
  	    	qty1.sendKeys("10");
  	    	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='updatecart']")));
  		    update.click();
  	  	 	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='product-unit-price']")));
			      
}
    	  
    	  public void Product4() {
    	    	Appareal.click();
    	    	Clothing .click();
    			tshirt.click();	
    			AddToCart3.click();
    			WebDriverWait wait=new WebDriverWait(driver,80);
    			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='cart-label']")));
    			ShoppingCart.click();
    			XbuttonShopinCart.click();
    	  }
    	  
    	  public void VerifyProduct3 () {
    		 
  		        WebElement message =driver.findElement(By.xpath("//p[@class='content']"));
    		    Assert.assertEquals(message, td.expectedmessage6);

    		    WebElement price3 =driver.findElement(By.xpath("//span[@class='product-unit-price']"));
    		    Assert.assertEquals(price3.getText(), td.expectedmessage3);
    		
    			WebElement price7 =driver.findElement(By.xpath("//span[@class='product-unit-price']"));
    		    Assert.assertEquals(price7.getText(), td.expectedprice7);
    			
    			WebElement price10 =driver.findElement(By.xpath("//span[@class='product-unit-price']"));
    		    Assert.assertEquals(price10.getText(), td.expectedprice10);
    	  }
    	  
    	  
}
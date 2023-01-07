package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Base;
import pageObjects.HomePageObjects;
import pageObjects.ShoppingCartPageObjects;
import testData.TestD;

public class ShoppingCartPageTestCases  extends Base {
	
	HomePageObjects hp;
	ShoppingCartPageObjects scp;
	TestD td;

	@BeforeMethod
	public void start() {
		openApplication();
		scp = new ShoppingCartPageObjects();
		td = new TestD();
	}
	
	@Test
	public void AddToShoppingCartNike () {
		
		  scp.Product2();   
		  WebElement skuinshopingcart=  driver.findElement(By.xpath("//span[@class='sku-number']"));
  	      Assert.assertEquals(skuinshopingcart.getText(),td.expectedsku);
  	    
  	      WebElement size= driver.findElement(By.xpath("//td[@class='product']//div[@class='attributes'][normalize-space()='Size: 3X']"));
          size.getText();
  	      Assert.assertEquals(size.getText(), td.expectedsize);
  	      
  	      WebElement price=  driver.findElement(By.xpath("//span[@class='product-subtotal']"));
    	  price.getText();
  	      Assert.assertEquals(price.getText(), td.totalprice);
	}

	@Test
	public void AddToShoppingCartLevis () {
		
		scp.Product3();
		
  	  }
	
	@Test
	public void xbuttonshoppongcart () {
	
		scp.Product4();
		  WebElement actualmessage=  driver.findElement(By.xpath("//div[@class='no-data']"));
  	      Assert.assertEquals(actualmessage.getText(), td.expectedmessage8);
  	      System.out.println(actualmessage.getText());

  	  }
				
		@AfterMethod
		public void end() throws InterruptedException {
			Thread.sleep(3000);
			driver.quit();
	
	}
	
}

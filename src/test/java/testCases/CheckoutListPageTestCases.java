package testCases;

import org.testng.annotations.Test;

import base.Base;
import pageObjects.CheckoutPageObjects;
import testData.TestD;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class CheckoutListPageTestCases  extends Base {
	
	CheckoutPageObjects chout;
	TestD td;

  @BeforeMethod
  public void start() {
	  
    openApplication();
	chout = new CheckoutPageObjects();
	td = new TestD();
  }
  
  @Test
  public void CheckOut() {
  
  chout.Product(td.firstname, td.lastname, td.validUserName, td.city, td.adress, td.zip, td.phone);
  WebDriverWait wait=new WebDriverWait(driver,20);
  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//strong[normalize-space()='Your order has been successfully processed!']")));
  String actualmessage=driver.findElement(By.xpath("//strong[normalize-space()='Your order has been successfully processed!']")).getText();
  Assert.assertEquals(actualmessage,td.expectedmessageconfirm);
  System.out.println(actualmessage);
  }
  
  @Test
  public void invalidemail() {
  
  chout.Product1(td.firstname, td.lastname, td.inValidUserName, td.city, td.adress, td.zip, td.phone);
  WebDriverWait wait=new WebDriverWait(driver,20);
  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='BillingNewAddress_Email-error']")));
  String actualmessage=driver.findElement(By.xpath("//span[@id='BillingNewAddress_Email-error']")).getText();
  Assert.assertEquals(actualmessage,td.expectedmessageinvalidemail);
  System.out.println(actualmessage);
  }
  
  @Test
  public void noSelectAgree() {
  
  chout.Product2();
  String actualmessage=driver.findElement(By.xpath("//div[@id='terms-of-service-warning-box']")).getText();
  Assert.assertEquals(actualmessage,td.expectedmessagewindow);
  System.out.println(actualmessage);
  }
  
  @AfterMethod
  public void afterMethod() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
  
  }
}
                      /* Test Case1 
                 1. Click on Computers category menu
                 2. Click on Notebooks subcategory picture
                 3. Click on product image Asus N551JK-XO076H Laptop 
                 4. click on add to cart
                 5.click on shoping cart 
                 6.click agee checkbox
                 8.click on checkout
                 9.click on checkut as guest
                 10.enter required fields
                 11.click continue
                 12.select ext Day Air ($0.00)
                 13.Click continue
                 14.select  Check / Money Order
                 15.click continue
                 16.click continue
                 17.click confirm        expectet rezults "Your order has been successfully processed!" */

/* Test Case2
1. Click on Computers category menu
2. Click on Notebooks subcategory picture
3. Click on product image Asus N551JK-XO076H Laptop 
4. click on add to cart
5.click on shoping cart 
6.click agee checkbox
8.click on checkout
9.click on checkut as guest
10.enter required fields
11.enter invalid email
12.click continue
                                        expectet rezults "Wrong email"  */



/* Test Case3
1. Click on Computers category menu
2. Click on Notebooks subcategory picture
3. Click on product image Asus N551JK-XO076H Laptop 
4. click on add to cart
5.click on shoping cart 
6.click on checkout   expectet rezults "Please accept the terms of service before the next step." */

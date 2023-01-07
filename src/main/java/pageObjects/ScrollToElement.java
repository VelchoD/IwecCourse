package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.Base;
import testData.TestD;

public class ScrollToElement extends Base {
	
	TestD td = new TestD();
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	//Web element locator element
	@FindBy(xpath = "//button[normalize-space()='Log in']")
	WebElement Loginbutton;
	
	@FindBy(xpath = "//a[normalize-space()='Contact us']")
	WebElement ContactUs;
	
	public ScrollToElement() {
		PageFactory.initElements(driver, this);
	}
	
	public void LoginButton() {
		js.executeScript("arguments[0].scrollIntoView();", Loginbutton);
	}
	
	public void BottomofPage() {
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");	
	}
	
	public void ContactUs() {
		js.executeScript("arguments[0].scrollIntoView();", ContactUs);
		WebDriverWait wait=new WebDriverWait(driver,30);
	 	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Contact us']")));
		ContactUs.click();
 }
}
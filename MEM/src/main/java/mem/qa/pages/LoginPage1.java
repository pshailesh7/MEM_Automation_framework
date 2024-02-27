package mem.qa.pages;

import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import mem.qa.base.TestBase;

public class LoginPage1 extends TestBase{
	
//	Object Repository
	
		@FindBy(xpath = "//input[@id='account_email']")
		WebElement emailid;
		@FindBy(xpath = "//button[@name='commit']")
		WebElement continuebtn;
		@FindBy(xpath = "//input[@id='account_password']")
		WebElement password;
		@FindBy(xpath = "//h6[text()='codotp-demo']")
		WebElement store;
		@FindBy(xpath = "//button[@class='_SearchActivator_1uy1c_10']")
		WebElement searchstore;
//		@FindBy(xpath = "//a[@class='_Link_1rr1i_6']//div[text()='My Easy Monogram']")
//		WebElement selectstore;
		@FindBy(xpath = "//div[text()='My Easy Monogram - Staging']")
		WebElement myeasymonogram;
		@FindBy(xpath = "//span[text()='Apps']")
		WebElement appbtn;
		
		
	  public LoginPage1() 
	  {
		  PageFactory.initElements(driver, this);
	  }
	  public String checkTitle() 
	  {
		return driver.getTitle();
		  
	  }
	  
	 public MemDashboardPage checklogin(String user, String pass) {
		 WebDriverWait wait = new WebDriverWait(driver, 10);
		 wait.until(ExpectedConditions.visibilityOf(emailid)).sendKeys(user);
		 wait.until(ExpectedConditions.elementToBeClickable(continuebtn)).click();
		 wait.until(ExpectedConditions.visibilityOf(password)).sendKeys(pass);
		 wait.until(ExpectedConditions.elementToBeClickable(continuebtn)).click();
		return new MemDashboardPage();
	 }
	 
	 public  MemDashboardPage checksearchstore() throws InterruptedException 
		{
		 	String firstWindowHandle = driver.getWindowHandle();
			appbtn.click();
			Thread.sleep(2000);
			myeasymonogram.click();
			Set<String> allWindowHandles = driver.getWindowHandles();
			for (String windowHandle : allWindowHandles) {
			    if (!windowHandle.equals(firstWindowHandle)) {
			        driver.switchTo().window(windowHandle);
			        Thread.sleep(5000);
			        }
			}
			return new MemDashboardPage();
		}
	 }



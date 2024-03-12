package mem.qa.pages;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import mem.qa.base.TestBase;

public class MemSettingPage extends TestBase {
	
	// Account Section object repository
	@FindBy(xpath = "//div[text()='SETTINGS']")
	WebElement settingbtn;
	@FindBy(xpath = "//div[@class='header-title-container']")
	WebElement pagetitle;
	@FindBy(xpath = "(//div[text()='Account Settings'])[1]")
	WebElement accountsection;
	@FindBy(xpath = "(//div[text()='Global Pricing Rules'])[1]")
	WebElement rulessection;
	@FindBy(xpath = "//div[text()='Biling']")
	WebElement billingsection;
	@FindBy(xpath = "//div[text()='Order Processing']")
	WebElement ordersection;
	@FindBy(xpath = "//div[@class='main-header']")
	WebElement settingheading;
	@FindBy(xpath = "(//input[@class='ant-input ant-input-disabled css-p897kf ant-input-outlined'])[1]")
	WebElement shopname;
	@FindBy(xpath = "(//input[@class='ant-input ant-input-disabled css-p897kf ant-input-outlined'])[2]")
	WebElement shopurl;
	@FindBy(xpath = "(//input[@class='ant-input ant-input-disabled css-p897kf ant-input-outlined'])[3]")
	WebElement shopemail;
	@FindBy(xpath = "(//input[@class='ant-input ant-input-disabled css-p897kf ant-input-outlined'])[4]")
	WebElement shopifyplan;
	@FindBy(xpath = "//span[text()='Sign Out']")
	WebElement signoutbtn;
	
	// Global pricing rule Section object repository
	@FindBy(xpath = "(//div[text()='Global Pricing Rules'])[2]")
	WebElement titleglobalpricing;
	@FindBy(xpath = "//input[@id='basic_markup']")
	WebElement markup;
	@FindBy(xpath = "//input[@id='basic_markupType']")
	WebElement markuptype;
	@FindBy(xpath = "//input[@id='basic_compareAtMarkup']")
	WebElement comparemarkup;
	@FindBy(xpath = "//input[@id='basic_compareAtMarkupType']")
	WebElement comparemarkuptype;
	@FindBy(xpath = "//input[@id='basic_assignCents']")
	WebElement assigncent;
	@FindBy(xpath = "//div[@class='ant-notification-notice-message']")
	WebElement notificationmessage;
	@FindBy(xpath = "//span[text()='Save']")
	WebElement savebtn;
	@FindBy(xpath = "//span[text()='Save and Update']")
	WebElement saveandupdatebtn;
	@FindBy(xpath = "//span[text()='Confirm']")
	WebElement confirmbtn;
	@FindBy(xpath = "(//div[@title='Multiplier'])[1]")
	WebElement multiplier;
	@FindBy(xpath = "//div[@title='Fixed']")
	WebElement fixed;
	@FindBy(xpath = "(//div[text()='Multiplier'])[3]")
	WebElement multiplier1;
	@FindBy(xpath = "//span[@class='ant-notification-notice-close-x']")
	WebElement closebtn;
	@FindBy(xpath = "(//div[@class='ant-form-item-explain-error'])[1]")
	WebElement markupinputerror1;
	@FindBy(xpath = "(//div[@class='ant-form-item-explain-error'])[2]")
	WebElement markupinputerror2;
	
	//advance pricing rule
	@FindBy(xpath = "//span[@class='ant-switch-inner']")
	WebElement advancetoogle;
	@FindBy(xpath = "//input[@id='basic_from']")
	WebElement advpricefrom;
	@FindBy(xpath = "//input[@id='basic_to']")
	WebElement advpriceto;
	@FindBy(xpath = "(//input[@id='basic_markup'])[2]")
	WebElement advancemarkup;
	@FindBy(xpath = "(//span[@class='ant-select-selection-search'])[3]")
	WebElement advancemarkuptype;
	@FindBy(xpath = "//input[@id='basic_compareAtFrom']")
	WebElement compareAtFrom;
	@FindBy(xpath = "//input[@id='basic_compareAtTo']")
	WebElement compareAtTo;
	@FindBy(xpath = "//input[@id='basic_compareAtMarkup']")
	WebElement compareAtMarkup;
	@FindBy(xpath = "(//span[@class='ant-select-selection-search'])[4]")
	WebElement compareatmarkuptype;
	
	//Setting/Billing section repository
	@FindBy(xpath = "(//div[@class='ant-tabs-tab-btn'])[3]")
	WebElement billing;
	@FindBy(xpath = "//div[@class='main-header']")
	WebElement billpagetitle;
	@FindBy(xpath = "//input[@id='basic_cardNumber']")
	WebElement cardnumber;
	@FindBy(xpath = "//input[@id='basic_cardHolderName']")
	WebElement cardholdername;;
	@FindBy(xpath = "//input[@id='basic_expiryDate']")
	WebElement expirydate;
	@FindBy(xpath = "//input[@id='basic_cvv']")
	WebElement cardcvv;
	@FindBy(xpath = "//span[text()='Update Card']")
	WebElement updatecardbtn;
	@FindBy(xpath = "//span[@class='card-status-text']")
	WebElement cardstatus;
	
 //all Action Methods
	
	public MemSettingPage() 
	{
		PageFactory.initElements(driver, this);
	}
	public String checkPageTitle() throws InterruptedException 
	{
		settingbtn.click();
		Thread.sleep(100);
		return pagetitle.getText();
	}
	
	public String checkPageHeading() 
	{
		return settingheading.getText();
	}
	public String checkShopName() 
	{
		return shopname.getAttribute("value");
	}
	public String checkshopurl() 
	{
		return shopurl.getAttribute("value");
	}
	public String checkshopemail() 
	{
		return shopemail.getAttribute("value");
	}
	public String checkshopifyplan() 
	{
		return shopifyplan.getAttribute("value");
	}
	public boolean checksignoutbtn() 
	{
		return signoutbtn.isDisplayed();
	}
	public String checktitleglobalpricingrule() 
	{
		rulessection.click();
		return titleglobalpricing.getText();
	}
	public String checksavebtn() throws InterruptedException 
	{
		Actions action = new Actions(driver);
		markup.click();
		action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys("1").perform();
		action.moveToElement(markuptype).click().perform();
		action.moveByOffset(0, 50).click().perform();
		comparemarkup.click();
		action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys("2").perform();
		action.moveToElement(comparemarkuptype).click().perform();
		action.moveByOffset(0, 50).click().perform();
		assigncent.click();
		action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys("96").perform();
		savebtn.click();
		Thread.sleep(2000);
		return notificationmessage.getText();
	}
	public String checksaveandupdatebtn() throws InterruptedException 
	{
		closebtn.click();
		saveandupdatebtn.click();
		Thread.sleep(2000);
		confirmbtn.click();
		Thread.sleep(2000);
		return notificationmessage.getText();
	}
	public boolean checkvisibilitybtn() throws InterruptedException 
	{	
		Thread.sleep(3000);
		driver.navigate().refresh();
		return saveandupdatebtn.isSelected();
	}
	public String checkinvalidinput() 
	{
		Actions action = new Actions(driver);
		markup.click();
		action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys("abcd").perform();
		return markupinputerror1.getText();
	}
	public String checkblankinput() throws InterruptedException 
	{
		Actions action = new Actions(driver);
		markup.click();
		Thread.sleep(2000);
		action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).perform();
		return markupinputerror1.getText();
	}
	public String checkcommarkupinvalidinput() 
	{
		Actions action = new Actions(driver);
		comparemarkup.click();
		action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys("abcd").perform();
		return markupinputerror2.getText();
	}
	public String checkcommarkupblankinput() throws InterruptedException 
	{
		Actions action = new Actions(driver);
		comparemarkup.click();
		Thread.sleep(2000);
		action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).perform();
		return markupinputerror2.getText();
	}
	public String checkcentblankinput() throws InterruptedException 
	{
		Actions action = new Actions(driver);
		assigncent.click();
		Thread.sleep(2000);
		action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).perform();
		return markupinputerror1.getText();
	}
	public String checkadvancemarkup() throws InterruptedException 
	{
		WebDriverWait wait =new WebDriverWait(driver, 10);
		Actions action = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
        
		wait.until(ExpectedConditions.elementToBeClickable(advancetoogle)).click();
		js.executeScript("window.scrollBy(0,500)");
		
		wait.until(ExpectedConditions.elementToBeClickable(advpricefrom)).click();
		action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys("10").perform();
		
		wait.until(ExpectedConditions.elementToBeClickable(advpriceto)).click();
		action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys("20").perform();

		wait.until(ExpectedConditions.elementToBeClickable(advancemarkup)).click();
		action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys("2").perform();
		
		action.moveToElement(advancemarkuptype).click().perform();
		action.moveByOffset(0, 50).click().perform();
		
		wait.until(ExpectedConditions.elementToBeClickable(compareAtFrom)).click();
		action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys("15").perform();
		
		wait.until(ExpectedConditions.elementToBeClickable(compareAtTo)).click();
		action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys("25").perform();
		
		wait.until(ExpectedConditions.elementToBeClickable(compareAtMarkup)).click();
		action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys("3").perform();
		
		action.moveToElement(compareatmarkuptype).click().perform();
		action.moveByOffset(0, 50).click().perform();
		wait.until(ExpectedConditions.elementToBeClickable(savebtn)).click();
		
		Thread.sleep(2000);
		return notificationmessage.getText();
	}
	public String checkadvsaveandupdate() 
	{	
		closebtn.click();
		saveandupdatebtn.click();
		
		return notificationmessage.getText();
	}
	
	public String checkbillingpagetitle() 
	{
		billing.click();
		return billpagetitle.getText();
	}
	public String checkinvalidcarddetails() 
	{
		cardnumber.sendKeys("ssfgs");
		return markupinputerror1.getText();
	}
}

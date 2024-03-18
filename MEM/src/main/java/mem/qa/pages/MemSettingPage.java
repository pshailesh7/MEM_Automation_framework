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
	@FindBy(xpath = "(//div[@class='ant-form-item-explain-error'])[4]")
	WebElement markupinputerror4;
	@FindBy(xpath = "(//div[@class='ant-form-item-explain-error'])[6]")
	WebElement markupinputerror6;
	
	//advance pricing rule
	@FindBy(xpath = "//button[contains(@class,'ant-switch css-p897kf')]")
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
	@FindBy(xpath = "//span[@class='card-last-four-digit']")
	WebElement lastfourdigit;
	@FindBy(xpath = "(//span[@class='card-holder-name'])[1]")
	WebElement holdername;
	@FindBy(xpath = "//div[@class='ant-notification-notice-message']")
	WebElement noticmessage;
	@FindBy(xpath = "//div[@class='card-type-icon']//*[name()='svg']")
	WebElement cardtypeicon;
	@FindBy(xpath = "//div[@id='basic_cvv_help']")
	WebElement invaliderrormsg;
	@FindBy(xpath = "//div[@id='basic_expiryDate_help']")
	WebElement invalidexpirymsg;
	
	
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
		String currentStatus = advancetoogle.getAttribute("aria-checked");
		
		if(currentStatus.equals("false")) {
			advancetoogle.click();
		
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
		
		Thread.sleep(2000);}
		if(currentStatus.equals("true")) {
			
			advancetoogle.click();
			wait.until(ExpectedConditions.elementToBeClickable(savebtn)).click();
			driver.navigate().refresh();
			
			advancetoogle.click();
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
		}
		return notificationmessage.getText();
	}
	public String checkadvsaveandupdate() throws InterruptedException 
	{	
		closebtn.click();
		Thread.sleep(3000);
		saveandupdatebtn.click();
		Thread.sleep(1000);
		confirmbtn.click();
		Thread.sleep(3000);
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
	public String check_invalid_exp_date() throws InterruptedException 
	{
		expirydate.sendKeys("202305");
		Thread.sleep(2000);
		return invalidexpirymsg.getText();
	}
	public String check_invalid_cvv_no() throws InterruptedException 
	{
		cardcvv.sendKeys("a1b2");
		Thread.sleep(1000);
		return invaliderrormsg.getText();
	}
	public boolean check_blank_input_fields() 
	{
		cardnumber.clear();
		cardholdername.clear();
		expirydate.clear();
		cardcvv.clear();
		return updatecardbtn.isEnabled();
	}
	public String checkvalidcarddetails() throws InterruptedException 
	{
		Actions action = new Actions(driver);
		cardnumber.click();
		action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys("370000000000002").perform();
		cardholdername.click();
		action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys("LucentInnovation").perform();
		expirydate.click();
		action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys("202905").perform();
		cardcvv.click();
		action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys("1234").perform();
		Thread.sleep(2000);
		updatecardbtn.click();
		Thread.sleep(3000);
		return noticmessage.getText();
	}
	
	public String checklastfourdigit() 
	{
		return lastfourdigit.getText();
	}
	public String checkholdername() 
	{
		return holdername.getText();
	}
	public boolean checkcardtype() 
	{
		return cardtypeicon.isDisplayed();
	}
}

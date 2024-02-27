package mem.qa.pages;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
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
	@FindBy(xpath = "(//input[@class='ant-input ant-input-disabled css-6it8s5 ant-input-outlined'])[1]")
	WebElement shopname;
	@FindBy(xpath = "(//input[@class='ant-input ant-input-disabled css-6it8s5 ant-input-outlined'])[2]")
	WebElement shopurl;
	@FindBy(xpath = "(//input[@class='ant-input ant-input-disabled css-6it8s5 ant-input-outlined'])[3]")
	WebElement shopemail;
	@FindBy(xpath = "(//input[@class='ant-input ant-input-disabled css-6it8s5 ant-input-outlined'])[4]")
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
	@FindBy(xpath = "(//div[@title='Multiplier'])[2]")
	WebElement multiplier1;
	
	
	
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
		action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys("1.5").perform();
		markuptype.click();
		multiplier.click();
		comparemarkup.click();
		action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys("2").perform();
		comparemarkuptype.click();
		multiplier1.click();
		assigncent.click();
		action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys("99").perform();
		savebtn.click();
		Thread.sleep(1000);
		return notificationmessage.getText();
	}
	public String checksaveandupdatebtn() throws InterruptedException 
	{
		saveandupdatebtn.click();
		confirmbtn.click();
		Thread.sleep(1000);
		return notificationmessage.getText();
	}
	public boolean checkvisibilitybtn() throws InterruptedException 
	{
		driver.navigate().refresh();
		Thread.sleep(3000);
		return saveandupdatebtn.isSelected();
	}
}

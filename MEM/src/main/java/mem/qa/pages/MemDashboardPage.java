package mem.qa.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import mem.qa.base.TestBase;

public class MemDashboardPage extends TestBase {
	
	//Object Repository
	
	@FindBy(xpath = "(//a[@href='/app/dashboard'])[1]")
	WebElement brandlogo;
	@FindBy(xpath = "//p[text()='MyEasyMonogram']")
	WebElement pagetitle;
	@FindBy(xpath = "//div[@class='user-initials-container header-profile-container ant-flex css-p897kf ant-flex-align-center ant-flex-justify-center']")
	WebElement avatar;
	@FindBy(xpath = "//div[contains(text(),'Logout')]")
	WebElement profilename;
	@FindBy(xpath = "//div[text()='Total Revenue']")
	WebElement totalrevenue;
	@FindBy(xpath = "//*[name()='path' and contains(@d,'M33.652 20')]")
	WebElement revenuelogo;
	@FindBy(xpath = "//div[@class='header-title-container']")
	WebElement pageheading;
	@FindBy(xpath = "//div[text()='Total Profit']")
	WebElement totalprofit;
	@FindBy(xpath = "//*[name()='path' and contains(@d,'M28.646 11')]")
	WebElement profitlogo;
	@FindBy(xpath = "//div[contains(text(),'Total Orders')]")
	WebElement totalorders;
	@FindBy(xpath = "//*[name()='path' and contains(@d,'M7.04826 1')]")
	WebElement orderlogo;
	@FindBy(xpath = "//div[text()='Imported Products']")
	WebElement totalimportedproduct;
	@FindBy(xpath = "(//*[name()='svg'])[10]")
	WebElement impoproductlogo;
	@FindBy(xpath = "//div[text()='HOME']")
	WebElement homedbtn;
	@FindBy(xpath = "//div[text()='ORDERS']")
	WebElement ordersbtn;
	@FindBy(xpath = "//div[text()='PRODUCTS']")
	WebElement productsbtn;
	@FindBy(xpath = "//div[@class='ant-picker-input ant-picker-input-active']")
	WebElement calstartdate;
	@FindBy(xpath = "//div[@class='ant-picker-input']")
	WebElement calenddate;
	@FindBy(xpath = "(//span[@class='ant-typography pricing-section css-p897kf'])[1]")
	WebElement revenue;
	@FindBy(xpath = "(//span[@class='ant-typography pricing-section css-p897kf'])[2]")
	WebElement profit;
	@FindBy(xpath = "(//span[@class='ant-typography pricing-section css-p897kf'])[3]")
	WebElement orders;
	@FindBy(xpath = "(//span[@class='ant-typography pricing-section css-p897kf'])[4]")
	WebElement impproduct;
	@FindBy(xpath = "//span[text()='Anchor Family Name - Steel Sign']")
	WebElement topproduct;
	@FindBy(xpath = "//span[@class='pricing-section ']")
	WebElement salesreport;
	@FindBy(xpath = "(//span[@class='ant-typography comparison-section number-wrapper css-p897kf'])[1]")
	WebElement revenuepercentage;
	@FindBy(xpath = "(//span[@class='ant-typography comparison-section number-wrapper css-p897kf'])[2]")
	WebElement profitpercentage;
	@FindBy(xpath = "(//span[@class='ant-typography comparison-section number-wrapper css-p897kf'])[3]")
	WebElement orderpercentage;
	@FindBy(xpath = "(//span[@class='ant-typography comparison-section number-wrapper css-p897kf'])[4]")
	WebElement impproductpercentage;
	@FindBy(xpath = "(//div[@class='section-header'])[1]")
	WebElement profitchart;
	
	//Action Method's
	public MemDashboardPage() 
	{
		PageFactory.initElements(driver, this);
	}
	public boolean checkbrandlogo() 
	{
		return brandlogo.isDisplayed();
	}
	public String checkpageTitle() 
	{
		return driver.getTitle();
	}
	public String checkpageheading() 
	{
		return pageheading.getText();
	}
	public String checkprofilename() throws InterruptedException 
	{
		avatar.click();
		Thread.sleep(1000);
		return profilename.getText();
	}
	public String checkTotalProfit() 
	{
		return totalprofit.getText();
	}
	public boolean checkprofitlogo() 
	{
		return profitlogo.isDisplayed();
	}
	public String checkTotalrevenue() 
	{
		return totalrevenue.getText();
	}
	public boolean checkrevenuelogo() 
	{
		return revenuelogo.isDisplayed();
	}
	public String checkTotalOrder() 
	{
		return totalorders.getText();
	}
	public boolean checkorderlogo() 
	{
		return orderlogo.isDisplayed();
	}
	public String checkTotalImportedProduct() 
	{
		return totalimportedproduct.getText();
	}
	public boolean checkimpoproductlogo() 
	{
		return impoproductlogo.isDisplayed();
	}
	public boolean checkHomeButton() 
	{
		return homedbtn.isDisplayed();
	}
	public boolean checkProductBtn() 
	{
		return productsbtn.isDisplayed();
	}
	public String checkordersbtn() 
	{
		return ordersbtn.getText();
	}
	public void checkdateValidation() throws InterruptedException  
	{
		Actions actions = new Actions(driver);
		calstartdate.click();
	    actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys("01 Jan 2023").perform();
		calenddate.click();
		calstartdate.click();
		actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys("31 Dec 2023").sendKeys(Keys.ENTER).perform();
	}
	public String checkrevenuedatavalidation() 
	{
		return revenue.getText();
	}
	public String checkprofitdatavalidation() 
	{
		return profit.getText();
	}
	public String checkordersdatavalidation() 
	{
		return orders.getText();
	}
	public String checkimportproddatavalidation() 
	{
		return impproduct.getText();
	}
	public String checktopproductlist() 
	{
		return topproduct.getText();
	}
	public String checksalesreport() 
	{
		return salesreport.getText();
	}
	public String checkprofitreport() throws InterruptedException 
	{
		totalprofit.click();
		Thread.sleep(1000);
		return salesreport.getText();
	}
	public String checkrevenuepercentage() 
	{
		return revenuepercentage.getText();
	}
	public String checkprofitpercentage() 
	{
		return profitpercentage.getText();
	}
	public String checkorderpercentage() 
	{
		return orderpercentage.getText();
	}
	public String checkimpproductpercentage() 
	{
		return impproductpercentage.getText();
	}
	public String checkrevenuechartheader() throws InterruptedException 
	{	
		totalrevenue.click();
		Thread.sleep(1000);
		return profitchart.getText();
	}
	public String checkprofitchartheader() throws InterruptedException 
	{
		totalprofit.click();
		Thread.sleep(1000);
		return profitchart.getText();
	}
}

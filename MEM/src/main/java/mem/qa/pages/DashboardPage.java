package mem.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import mem.qa.base.TestBase;

public class DashboardPage extends TestBase {

//	Object Repository
	@FindBy(xpath = "//span[@class='user-id']")
	WebElement userIdLabel;
	
	@FindBy(xpath = "//div[@class='avatar']")
	WebElement userImage;

	@FindBy(xpath = "//span[@class='nickname']")
	WebElement nickname;
	
	@FindBy(xpath = "//input[@id='search-input']")
	WebElement searchMarket;
	
	@FindBy(xpath = "//ul[@class='search-result-list']//li/descendant::span/descendant::span[contains(text(), 'NSE')]/parent::span[@class='exchange']/preceding-sibling::span[contains(text(), 'HDFCBANK')]")
	WebElement searchMarketList;
	
	@FindBy(xpath = "//div[@class='vddl-list list-flat']//div/descendant::span[text()='ONGC']")
	WebElement searchONGC;
	
	@FindBy(xpath = "//div[@class='vddl-list list-flat']//div/descendant::span[text()='SBIN']")
	WebElement searchSBIN;
	
	@FindBy(xpath = "//button[@class='button-blue buy' and contains(text(),'B')]")
	WebElement btnBlue;
	
	@FindBy(xpath = "//div[@class='su-checkbox-group']//span[text()='Stoploss']//preceding-sibling::span")
	WebElement checkBox;
	
	@FindBy(xpath = "//div[@class='su-checkbox-group']//span[text()='Target']//preceding-sibling::span")
	WebElement checkBox2;
	
	@FindBy(xpath = "//button[contains(text(), 'C')]")
	WebElement btnCancel;
	
	@FindBy(xpath = "//div[@class='marketwatch-sidebar marketwatch-wrap']//ul[@class='marketwatch-selector list-flat']//li[contains(text(), '4')]")
	WebElement marketUL;
	
//	Initializing Page Objects
	public DashboardPage() {
		PageFactory.initElements(driver, this);
	}

//	Actions/Methods
	public String checkDTitle() {
		return driver.getTitle();
	}

	public Boolean checkUserImage() {
		return userImage.isDisplayed();
	}

	public String checkUserIdLabel() {
		return userIdLabel.getText();
	}

	public String checkNickname() {
		return nickname.getText();
	}
	
	public void checkMarketUL() {
		marketUL.click();
	}
	public void checkBtnBlue() throws InterruptedException {
		Actions action=new Actions(driver);
		action.moveToElement(searchSBIN).build().perform();
		Thread.sleep(3000);
		btnBlue.click();
		checkBox.click();
		checkBox2.click();
		Thread.sleep(3000);
		btnCancel.click();
	}
	public void checkSearchMarket() throws InterruptedException {
		searchMarket.sendKeys("Hdfc");
		Thread.sleep(3000);
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='search-result-list']//li/descendant::span/descendant::span[contains(text(), 'NSE')]/parent::span[@class='exchange']/preceding-sibling::span[contains(text(), 'HDFCBANK')]"));
		System.out.println("Total suggetions are: " + list.size());
		System.out.println();
		for (int i = 0; i < list.size(); i++) {
			String listitem = list.get(i).getText();
			System.out.println(listitem);
			if (listitem.contains("HDFCBANK")) {
				list.get(i).click();
				break;
			}
		}
	}
}
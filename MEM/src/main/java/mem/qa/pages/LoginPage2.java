package mem.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import mem.qa.base.TestBase;

public class LoginPage2 extends TestBase {
	
//	Object Repository
	@FindBy(xpath = "//*[@id=\"container\"]/div/div/div/form/div[2]/div/input")
	WebElement pin;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement continueButton;

	@FindBy(linkText = "Forgot 2FA?")
	WebElement forgotPasswordLink;

//	Initializing Page Objects
	public LoginPage2() {
		PageFactory.initElements(driver, this);
	}

//	Actions/Methods
	public String checkTitle() {
		return driver.getTitle();
	}

	public DashboardPage checkPin(String pinpass) {
		pin.sendKeys(pinpass);
		continueButton.click();
		return new DashboardPage();
	}

	public ForgotPasswordPage2 checkForgotPasswordLink() {
		forgotPasswordLink.click();
		return new ForgotPasswordPage2();
	}
}
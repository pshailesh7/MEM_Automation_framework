package mem.qa.testScripts;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import mem.qa.base.TestBase;
import mem.qa.pages.DashboardPage;
import mem.qa.pages.ForgotPasswordPage2;
import mem.qa.pages.LoginPage;
import mem.qa.pages.LoginPage2;

public class LoginPage2Test extends TestBase {

	DashboardPage dashboardPage;
	ForgotPasswordPage2 forgotPasswordPage2;
	LoginPage loginPage;
	LoginPage2 loginPage2;

//	defining child class constructor to call parent class constructor by using super() keyword for accessing config.properties file. 
	public LoginPage2Test() {
		super();
	}

//	!!!--- Pre Conditions ---!!!
	@BeforeMethod
	public void setup() {
		initialization();
		loginPage = new LoginPage();
		loginPage2 = loginPage.checkLogin(prop.getProperty("user"), prop.getProperty("pass"));
	}

//	!!!--- Test Scripts ---!!!
	@Test(priority = 1)
	public void checkTitleTest() {
		String s = loginPage2.checkTitle();
		System.out.println(s);
		Assert.assertEquals(s, "Kite - Zerodha's fast and elegant flagship trading platform", "Title of 2nd Login Page is incorrect..");
	}

	@Test(priority = 2)
	public void checkPinTest() {
		dashboardPage = loginPage2.checkPin(prop.getProperty("pin"));
	}

	@Test(priority = 3)
	public void checkForgotPasswordLinkTest() {
		forgotPasswordPage2 = loginPage2.checkForgotPasswordLink();
	}

//	!!!--- Post Conditions ---!!!
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}

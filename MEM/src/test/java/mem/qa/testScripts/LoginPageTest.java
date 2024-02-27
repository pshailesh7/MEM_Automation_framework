package mem.qa.testScripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import mem.qa.base.TestBase;
import mem.qa.pages.ForgotPasswordPage;
import mem.qa.pages.LoginPage;
import mem.qa.pages.LoginPage2;
import mem.qa.pages.SignUpPage;
import mem.qa.util.TestUtil;

public class LoginPageTest extends TestBase {

	LoginPage loginPage;
	LoginPage2 loginPage2;
	SignUpPage signUpPage;
	ForgotPasswordPage forgotPassword;

	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initialization();
		loginPage = new LoginPage();
	}

	@Test(priority = 1)
	public void checkTitleTest() {
		String title = loginPage.checkTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Kite - Zerodha's fast and elegant flagship trading platform",
				"Wrong Title, Try again later");
	}

	@Test(priority = 2)
	public void checkLogoTest() {
		Boolean b = loginPage.checkLogo();
		System.out.println(b);
		Assert.assertTrue(b);
	}

	@Test(priority = 3)
	public void checkHeaderTest() {
		String header = loginPage.checkHeader();
		System.out.println(header);
		Assert.assertEquals(header, "Login to Kite", "Wrong Header....!!!");
	}

	@Test(priority = 4)
	public String checkLoginTest() {
		
		loginPage2 = loginPage.checkLogin(prop.getProperty("user"), prop.getProperty("pass"));
		return checkLoginTest();
	}

	@Test(priority = 5)
	public void checkForgotPasswordLinkTest() {
		forgotPassword = loginPage.checkForgotPasswordLink();
	}

	@Test(priority = 6)
	public void checkSignUpTest() {
		signUpPage = loginPage.checkSignUp();
	}

//	!!!--- Post Conditions ---!!!
	@AfterMethod
	public static void takeScreenshot(ITestResult result) throws IOException {
		if (ITestResult.FAILURE == result.getStatus()) {
			TestUtil.takeScreenshot(driver, result.getName());
		}
		driver.quit();
	}
}
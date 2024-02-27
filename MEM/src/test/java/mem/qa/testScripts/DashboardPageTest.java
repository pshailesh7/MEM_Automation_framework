package mem.qa.testScripts;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import mem.qa.base.TestBase;
import mem.qa.pages.DashboardPage;
import mem.qa.pages.LoginPage;
import mem.qa.pages.LoginPage2;
import mem.qa.pages.OrdersPage;

public class DashboardPageTest extends TestBase {

	DashboardPage dashboardPage;
	LoginPage loginPage;
	LoginPage2 loginPage2;
	OrdersPage orderPage;

//	defining child class constructor to call parent class constructor by using super() keyword for accessing config.properties file.
	public DashboardPageTest() {
		super();
	}

//	!!!--- Pre Conditions ---!!!
	@BeforeMethod
	public void setup() {
		initialization();
		loginPage = new LoginPage();
		loginPage2 = new LoginPage2();
		dashboardPage = new DashboardPage();
		loginPage2 = loginPage.checkLogin(prop.getProperty("user"), prop.getProperty("pass"));
		System.out.println(prop.getProperty("pass"));
		dashboardPage = loginPage2.checkPin(prop.getProperty("pin"));
	}

//	!!!--- Test Scripts ---!!!
	@Test
	public void getTitleTest() {
		String title = driver.getTitle();
		System.out.println(title);
		
	}

	@Test
	public void checkUserImageTest() {
		Boolean b = dashboardPage.checkUserImage();
		System.out.println(b);
		Assert.assertTrue(b);
	}

	@Test
	public void checkUserIdLabelTest() {
		String s = dashboardPage.checkUserIdLabel();
		System.out.println(s);
		Assert.assertEquals(s, prop.getProperty("user"));
	}

	@Test
	public void checkNicknameTest() {
		String s = dashboardPage.checkNickname();
		System.out.println(s);
		Assert.assertEquals(s, "Ravi");
	}
	
	@Test
	public void checkBtnBlueTest() throws InterruptedException {
		dashboardPage.checkBtnBlue();
	}
	
	@Test
	public void checkSearchMarketTest() throws InterruptedException {
		dashboardPage.checkSearchMarket(); 
	}
	
	@Test
	public void checkMarketULTest() {
		dashboardPage.checkMarketUL(); 
	}

//	!!!--- Post Conditions ---!!!
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}

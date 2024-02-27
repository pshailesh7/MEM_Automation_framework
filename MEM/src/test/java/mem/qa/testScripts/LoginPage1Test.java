package mem.qa.testScripts;

import java.io.IOException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import mem.qa.base.TestBase;
import mem.qa.pages.LoginPage1;
import mem.qa.pages.MemDashboardPage;
import mem.qa.util.TestUtil;

public class LoginPage1Test extends TestBase {
	
	LoginPage1 loginPage1;
	MemDashboardPage memdashboardpage;
	
	public LoginPage1Test() {
		super();
	}
	
  @BeforeClass
  public void setup() {
	  initialization();
	  loginPage1 = new LoginPage1();
  }
  
  @Test (priority = 0)
  public void checkTitleTest() 
  {
	  String title= loginPage1.checkTitle();
	  Assert.assertEquals(title,"Log in — Shopify");
  }
  
  @Test(priority = 1)
  public void checkLoginTest() 
  {
	  memdashboardpage = loginPage1.checklogin(prop.getProperty("user"), prop.getProperty("pass"));
  }
  
  @Test(priority = 2)
	public void checkselectStore() throws InterruptedException
	{
	  loginPage1.checksearchstore();
	  
	}
  @AfterMethod
  public void takeScreenshot(ITestResult result) throws IOException {
		if (ITestResult.FAILURE == result.getStatus()) {
			TestUtil.takeScreenshot(driver, result.getName());
		}
}
}

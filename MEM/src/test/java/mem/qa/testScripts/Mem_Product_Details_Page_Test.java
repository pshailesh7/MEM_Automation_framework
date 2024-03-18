package mem.qa.testScripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import mem.qa.base.TestBase;
import mem.qa.pages.LoginPage1;
import mem.qa.pages.MemDashboardPage;
import mem.qa.pages.MemSettingPage;
import mem.qa.pages.Mem_Product_Details_Page;
import mem.qa.pages.Product_Landing_Page;
import mem.qa.util.TestUtil;

public class Mem_Product_Details_Page_Test extends  TestBase{
	LoginPage1 loginpage1;
	MemDashboardPage memdashboardpage;
	MemSettingPage memsettingpage;
	Product_Landing_Page productlandingpage;
	Mem_Product_Details_Page memproductDetailspage;
	
	public Mem_Product_Details_Page_Test() 
	{
		super();
	}
	@BeforeClass
	public void setup() 
	{
		loginpage1 = new LoginPage1();
		memdashboardpage = new MemDashboardPage();
		memsettingpage = new MemSettingPage();
		productlandingpage = new Product_Landing_Page();
		memproductDetailspage = new Mem_Product_Details_Page();
	}
	@Test(priority = 0)
	public void check_Page_Title_Test() 
	{
		Assert.assertEquals(memproductDetailspage.check_page_title(), "Product Details");
	}
	@Test(priority = 1)
	public void check_Product_Title_Test() 
	{
		Assert.assertEquals(memproductDetailspage.check_product_title(),"Family Name Plaque - Steel Sign");
	}
	@Test(priority = 2)
	public void check_Price_Label_Test()
	{
		
		Assert.assertEquals(memproductDetailspage.check_product_price(),"27 - 82");
	}	
	@Test(priority = 3)
	public void check_Color_Slection_Test() 
	{
		boolean select = memproductDetailspage.check_color_selection();
		Assert.assertTrue(select);
	}
	@AfterMethod
	public void takeScreenshot(ITestResult result) throws IOException {
			if (ITestResult.FAILURE == result.getStatus()) {
				TestUtil.takeScreenshot(driver, result.getName());
			}
	}
	 @AfterClass
	public void teardown() {
		driver.quit();
	}
	
}

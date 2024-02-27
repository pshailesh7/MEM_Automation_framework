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
import mem.qa.util.TestUtil;

public class MemDashboardPageTest extends TestBase {
	
	LoginPage1 loginpage1;
	MemDashboardPage memdashboardpage;
	
	//all Test Scripts
	
	public MemDashboardPageTest() 
	{
		super();
	}
	@BeforeClass
	public void setup() 
	{
		loginpage1 = new LoginPage1();
		memdashboardpage = new MemDashboardPage();

	}
	@Test(priority = 0)
	public void checkPageTitle() 
	{
		String s= memdashboardpage.checkpageTitle();
		Assert.assertEquals(s, "MyEasyMonogram");
	}
	@Test(priority = 1)
	public void checkPageHeadingTest() 
	{
		Assert.assertEquals(memdashboardpage.checkpageheading(), "Dashboard");
	}
	@Test(priority = 2)
	public void checkbrandlogoTest() 
	{
		boolean logo= memdashboardpage.checkbrandlogo();
		Assert.assertTrue(logo);
	}
	@Test(priority = 3)
	public void checkProfileNameTest() throws InterruptedException 
	{
		Assert.assertEquals(memdashboardpage.checkprofilename(), "Logout (memappdemo)");
	}
	@Test(priority = 4)
	public void checkTotalRevenueTest() 
	{
	String revenue = memdashboardpage.checkTotalrevenue();
	Assert.assertEquals(revenue, "Total Revenue");
	}
	@Test(priority = 5)
	public void checkProfitLogoTest() 
	{
		boolean revlogo = memdashboardpage.checkrevenuelogo();
		Assert.assertTrue(revlogo);
	}
	@Test(priority = 6)
	public void checkTotalProfitTest() 
	{
		String d= memdashboardpage.checkTotalProfit();
		Assert.assertEquals(d, "Total Profit");
	}
	@Test(priority = 7)
	public void checkProfitLogo() 
	{
		boolean profitlogo = memdashboardpage.checkprofitlogo();
		Assert.assertTrue(profitlogo);
	}
	@Test(priority = 8)
	public void checkTotalOrderTest() 
	{
	String order = memdashboardpage.checkTotalOrder();
	Assert.assertEquals(order, "Total Orders");
	}
	@Test(priority = 9)
	public void checkOrderLogoTest() 
	{
		boolean orderlogo = memdashboardpage.checkorderlogo();
		Assert.assertTrue(orderlogo);
	}
	@Test(priority = 10)
	public void checkImportedProductTest() 
	{
		String impproduct = memdashboardpage.checkTotalImportedProduct();
		Assert.assertEquals(impproduct, "Imported Products");
	}
	@Test(priority = 11)
	public void checkImportedProductLogo() 
	{
		boolean impproductlogo = memdashboardpage.checkimpoproductlogo();
		Assert.assertTrue(impproductlogo);
	}
	@Test(priority = 12)
	public void checkHomeButtonTest() 
	{
		boolean D = memdashboardpage.checkHomeButton();
		Assert.assertTrue(D);
	}
	@Test(priority = 13)
	public void checkProductBtnTest() 
	{
		boolean manageproduct = memdashboardpage. checkProductBtn();
		Assert.assertTrue(manageproduct);
	}
	@Test(priority = 14)
	public void checkOrdersBtnTest() 
	{
		String manageorder= memdashboardpage.checkordersbtn();
		Assert.assertEquals(manageorder, "ORDERS");
	}
	@Test(priority = 15)
	public void checkDateValidationTest() throws InterruptedException 
	{
		memdashboardpage.checkdateValidation();
	}
	@Test(priority = 16)
	public void checkProfitDataValidationTest() 
	{
		String totalprofit =  memdashboardpage.checkprofitdatavalidation();
		Assert.assertEquals(totalprofit, "$3488.75");
	}
	@Test(priority = 17)
	public void checkRevenueDataValidationTest() 
	{
		String totalrevenue = memdashboardpage.checkrevenuedatavalidation();
		Assert.assertEquals(totalrevenue, "$7242");
	}
	@Test(priority = 18)
	public void checkOrdersDataValidationTest() 
	{
		String totalorders = memdashboardpage.checkordersdatavalidation();
		Assert.assertEquals(totalorders, "48");
	}
	@Test(priority = 19)
	public void checkImportprodDataValidationTest() 
	{
		 String totalimportedproduct = memdashboardpage.checkimportproddatavalidation();
		 Assert.assertEquals(totalimportedproduct, "107");
	}
	@Test(priority = 20)
	public void checkTopProductListValidationTest() 
	{
		Assert.assertEquals(memdashboardpage.checktopproductlist(), "Anchor Family Name - Steel Sign");
	}
	@Test(priority = 21)
	public void checkSalesReportTest() 
	{
		Assert.assertEquals(memdashboardpage.checksalesreport(), "$605.13");
	}
	@Test(priority = 22)
	public void checkRevenuePercentageTest() 
	{
		Assert.assertEquals(memdashboardpage.checkrevenuepercentage(), "+657.85%");
	}
	@Test(priority = 23)
	public void checkProfitPercentageTest() 
	{
		Assert.assertEquals(memdashboardpage.checkprofitpercentage(), "+1030.51%");
	}
	@Test(priority = 24)
	public void checkOrderPercentageTest() 
	{
		Assert.assertEquals(memdashboardpage.checkorderpercentage(), "+200%");
	}
	@Test(priority = 25)
	public void checkImpProductPercentageTest() 
	{
		Assert.assertEquals(memdashboardpage.checkimpproductpercentage(), "+100%");
	}
	@Test(priority = 26)
	public void checkProfitReportTest() throws InterruptedException 
	{
		Assert.assertEquals(memdashboardpage.checkprofitreport(), "$291.51");
	}
	@Test(priority = 27)
	public void checkProfitChartHeader() throws InterruptedException 
	{
		Assert.assertEquals(memdashboardpage.checkprofitchartheader(),"Profit Report"); 
	}
	@Test
	public void checkSalesChartHeader() throws InterruptedException 
	{
		Assert.assertEquals(memdashboardpage.checkrevenuechartheader(), "Revenue Report");
	}
	
	
	
	 @AfterMethod
	public void takeScreenshot(ITestResult result) throws IOException {
			if (ITestResult.FAILURE == result.getStatus()) {
				TestUtil.takeScreenshot(driver, result.getName());
			}
	}
}

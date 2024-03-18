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
import mem.qa.pages.Product_Landing_Page;
import mem.qa.util.TestUtil;

public class MemProductLandingPageTest extends TestBase {
	
	LoginPage1 loginpage1;
	MemDashboardPage memdashboardpage;
	MemSettingPage memsettingpage;
	Product_Landing_Page product_landing_page;
	
	public MemProductLandingPageTest() 
	{
		super();
	}
	@BeforeClass
	public void setup() 
	{
		loginpage1 = new LoginPage1();
		memdashboardpage = new MemDashboardPage();
		memsettingpage = new MemSettingPage();
		product_landing_page = new Product_Landing_Page();
	}
  @Test(priority = 0)
  public void check_Page_Title_Test() 
  {  
	  Assert.assertEquals(product_landing_page.check_Page_Title(), "Products");
  }
  @Test(priority = 1)
  public void check_Active_Product_Test() throws InterruptedException 
  {
	  boolean active = product_landing_page.check_active_product();
	  Assert.assertTrue(active);
  }
  @Test(priority = 2)
  public void check_Active_Product_Filter_Test() 
  {
	  boolean filter = product_landing_page.check_active_product_filter();
	  Assert.assertTrue(filter);
  }
  @Test(priority = 3)
  public void check_Filter_25_To_50_Test() 
  {
	 int num =(int) product_landing_page.check_filter_25_50();
	  Assert.assertTrue(num > 25 && num < 50);
  }
  @Test(priority = 4)
  public void check_Active_Product_Sort_Test() 
  {
	  boolean sort = product_landing_page.check_active_product_sort();
	  Assert.assertTrue(sort);
  }
  
  @Test(priority = 5)
  public void check_Sort_Low_To_High_Test() throws InterruptedException 
  {
	  Assert.assertEquals(product_landing_page.check_sort_low_to_high(), "Christmas Monogram - Wood Ornament");
	 
  }
  @Test(priority = 6)
  public void check_sort_High_to_Low_Test() throws InterruptedException 
  {
	  Assert.assertEquals(product_landing_page.check_sort_high_to_low(), "sadasdasd");
  }
  @Test(priority = 7)
  public void check_Draft_Product_SortAtoZ_Test() throws InterruptedException 
  {
	  Assert.assertEquals(product_landing_page.check_draft_product_sortatoz(), "AA Lets Go Brandon - Wooden Keychain");
  }
  @Test(priority = 8)
  public void check_Draft_Product_SortZtoA_Test() throws InterruptedException 
  {
	  Assert.assertEquals(product_landing_page.check_draft_product_sortztoa(), "ZZ Sided Leather Bottle Opener");
  }
  @Test(priority = 9)
  public void check_Draft_Tag_Visibility_Test() 
  {
	  boolean tag = product_landing_page.check_darft_tag();
	  Assert.assertTrue(tag);
  }
  @Test(priority = 10)
  public void check_Costom_filter_Test() 
  {
	  int num =(int) product_landing_page.check_costom_filter();
	  Assert.assertTrue(num >= 1 && num < 10);
  }
  @Test(priority = 11)
  public void check_Error_Product_Test() 
  {
	  boolean errortag = product_landing_page.check_error_product();
	  Assert.assertTrue(errortag);
  }
  @Test(priority = 12)
  public void check_Best_Seller_Product_Test() 
  {
	  boolean bestseller = product_landing_page.check_best_seller_product();
	  Assert.assertTrue(bestseller);
  }
  @Test(priority = 13)
  public void check_Search_Product_Test() 
  {
	  Assert.assertEquals(product_landing_page.check_search_product(), "No products found");
  }
 @Test(priority = 14)
 public void check_Search_Draft_Product_Test() throws InterruptedException 
 {
	 Assert.assertEquals(product_landing_page.check_search_draft_product(), "Dachshund Monogram - Steel Sign");
 }
 @Test(priority = 14)
 public void check_Pagination_Test() throws InterruptedException 
 {
	 Assert.assertEquals(product_landing_page.check_pagination() ,"Showing 13 - 24 of total 48 products");
 }
 @Test(priority = 15)
 public void check_Sort_Filter_Product_Test() throws InterruptedException 
 {
	 Assert.assertEquals(product_landing_page.check_sort_filter_product(), "Fleur De Lis Initial - Steel Sign");
 }
 @Test(priority = 16)
 public void check_Filter_Price_Test() 
 {
	 int num =(int) product_landing_page.check_filter_price();
	  Assert.assertTrue(num > 25 && num < 50);
 }
  
}

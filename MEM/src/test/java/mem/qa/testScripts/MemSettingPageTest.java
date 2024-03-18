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
import mem.qa.util.TestUtil;

public class MemSettingPageTest extends TestBase{
	
	LoginPage1 loginpage1;
	MemDashboardPage memdashboardpage;
	MemSettingPage memsettingpage;
	
	public MemSettingPageTest() 
	{
		super();
	}
	@BeforeClass
	public void setup() 
	{
		loginpage1 = new LoginPage1();
		memdashboardpage = new MemDashboardPage();
		memsettingpage = new MemSettingPage();
	}
  @Test(priority = 0)
  public void checkPageTitleTest() throws InterruptedException 
  {
	  Assert.assertEquals(memsettingpage.checkPageTitle(), "Settings");
  }
  @Test(priority = 1)
  public void checkPageHeadingTest() 
  {
	  Assert.assertEquals(memsettingpage.checkPageHeading(), "Account Settings");
  }
  @Test(priority = 2)
  public void checkShopNameTest() 
  {
	  Assert.assertEquals(memsettingpage.checkShopName(), "memappdemo");
  }
  @Test(priority = 3)
  public void checkShopURLTest() 
  {
	  Assert.assertEquals(memsettingpage.checkshopurl(), "memappdemo.myshopify.com");
  }
  @Test(priority = 4)
  public void checkShopEmailTest() 
  {
	  Assert.assertEquals(memsettingpage.checkshopemail(), "shopifydev@lucentinnovation.com");
  }
  @Test(priority = 5)
  public void checkShopifyPlanTest() 
  {
	  Assert.assertEquals(memsettingpage.checkshopifyplan(), "Free");
  }
  @Test(priority = 6)
  public void checkSignOutBtnTest() 
  {
	  boolean Button = memsettingpage.checksignoutbtn();
	  Assert.assertTrue(Button);
  }
  @Test(priority = 7)
  public void checkTitleGlobalPricinTest() 
  {
	  Assert.assertEquals(memsettingpage.checktitleglobalpricingrule(), "Global Pricing Rules");
  }
  @Test(priority = 8)
  public void checkInvalidInputTest() 
  {
	  Assert.assertEquals(memsettingpage.checkinvalidinput(), "Please enter a valid number");
  }
  @Test(priority = 9)
  public void checkBlankInputTest() throws InterruptedException 
  {
	  Assert.assertEquals(memsettingpage.checkblankinput(), "Please enter markup");
  }
  @Test(priority = 10)
  public void checkCompMarkupInvalidInput() 
  {
	  Assert.assertEquals(memsettingpage.checkcommarkupinvalidinput(),"Please enter a valid number");
  }
  @Test(priority = 11)
  public void checkCompMarkupBlankInput() throws InterruptedException 
  {
	  Assert.assertEquals(memsettingpage.checkcommarkupblankinput(),"Please enter markup");
  }
  @Test(priority = 12)
  public void checkAssingCentInputTest() throws InterruptedException 
  {
	  Assert.assertEquals(memsettingpage.checkcentblankinput(), "Please enter markup");
  }
  @Test(priority = 13)
  public void checkSaveBtnTest() throws InterruptedException 
  {
	  Assert.assertEquals(memsettingpage.checksavebtn(), "Pricing updated successfully");
  }

  @Test(priority = 14)
  public void checkAdvancePricingRuleTest() throws InterruptedException 
  {
	  Assert.assertEquals(memsettingpage.checkadvancemarkup(),"Pricing updated successfully");
  }
  @Test(priority = 15)
  public void checkAdvSaveandUpdate() throws InterruptedException 
  {
	  Assert.assertEquals(memsettingpage.checkadvsaveandupdate(),"Pricing rules update in progress.");
  }

  @Test(priority = 16)
  public void checkbillingPageTitleTest() 
  {
	  Assert.assertEquals(memsettingpage.checkbillingpagetitle(), "Payment Integration");
  }
  @Test(priority = 17)
  public void check_Invalid_Card_number_Test() 
  {
	  Assert.assertEquals(memsettingpage.checkinvalidcarddetails(), "Please enter a valid card number (only numbers are allowed)");
  }
  @Test(priority = 18)
  public void check_Invalid_Exp_Date_Test() throws InterruptedException 
  {
	  Assert.assertEquals(memsettingpage.check_invalid_exp_date(), "Expiry date should be greater than the current date.");
  }
  @Test(priority = 19)
  public void check_Invalid_CVV_No_Test() throws InterruptedException
  {
	  Assert.assertEquals(memsettingpage.check_invalid_cvv_no(), "CVV can be of either 3 or 4 digits");
  }
  @Test(priority = 20)
  public void check_Blank_Input_Field_Test()
  {
	  boolean button = memsettingpage.check_blank_input_fields();
	  Assert.assertTrue(button);
  }
  @Test(priority = 21)
  public void check_Valid_Card_details_Test() throws InterruptedException 
  {
	  Assert.assertEquals(memsettingpage.checkvalidcarddetails(), "Card details updated successfully");
  }
  @Test(priority = 22)
  public void check_last_Four_digit_Test() 
  {
	  Assert.assertEquals(memsettingpage.checklastfourdigit(), "0002");
  }
  @Test(priority = 23)
  public void check_Holder_Name_Test() 
  {
	  Assert.assertEquals(memsettingpage.checkholdername(), "LucentInnovation  ");
  }
  @Test(priority = 24)
  public void check_Card_Type_Test() 
  {
	  boolean cardtype = memsettingpage.checkcardtype();
	  Assert.assertTrue(cardtype);
  }

  @AfterMethod
 	public void takeScreenshot(ITestResult result) throws IOException {
 			if (ITestResult.FAILURE == result.getStatus()) {
 				TestUtil.takeScreenshot(driver, result.getName());
 			}
 	}
}

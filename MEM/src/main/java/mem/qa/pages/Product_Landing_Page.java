package mem.qa.pages;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import mem.qa.base.TestBase;

public class Product_Landing_Page extends TestBase {

	//Object Repository
	@FindBy(xpath = "//div[text()='PRODUCTS']")
	WebElement productbtn;
	@FindBy(xpath = "//div[@class='header-title-container']")
	WebElement pagetitle;
	@FindBy(xpath = "(//p[text()='My Products'])[1]")
	WebElement myproducts;
	@FindBy(xpath = "(//p[text()='Active'])[1]")
	WebElement activeproduct;
	@FindBy(xpath = "(//p[text()='Draft'])[1]")
	WebElement draftproduct;
	@FindBy(xpath = "(//p[text()='Errors'])[1]")
	WebElement errorproduct;
	@FindBy(xpath = "//p[text()='All Products']")
	WebElement allproduct;
	@FindBy(xpath = "//p[text()='Best Sellers']")
	WebElement bestseller;
	@FindBy(xpath = "//p[text()='For Her']")
	WebElement forher;
	@FindBy(xpath = "(//p[text()='Draft'])[2]")
	WebElement drafttag;
	@FindBy(xpath = "(//p[text()='Active'])[2]")
	WebElement activtag;
	@FindBy(xpath = "(//p[contains(text(),'Errors')])[2]")
	WebElement errortag;
	@FindBy(xpath = "//input[@id='product-search-term-input']")
	WebElement searchbar;
	@FindBy(xpath = "(//div[@class='icon-container'])[2]")
	WebElement filter;
	@FindBy(xpath = "(//div[@class='icon-container'])[3]")
	WebElement sort;
	@FindBy(xpath = "//span[text()='$25 to $50']")
	WebElement $25to50;
	@FindBy(xpath = "//span[text()='Price Low to High']")
	WebElement pricetohigh;
	@FindBy(xpath = "//span[text()='Price High to Low']")
	WebElement pricehightolow;
	@FindBy(xpath = "(//span[text()='Apply Now'])[2]")
	WebElement applysort;
	@FindBy(xpath = "(//span[text()='Clear All'])[2]")
	WebElement clearsort;
	@FindBy(xpath = "(//span[text()='Apply Now'])[1]")
	WebElement applyfilter;
	@FindBy(xpath = "(//span[text()='Clear All'])[1]")
	WebElement clearfilter;
	@FindBy(xpath = "//p[text()='$25 to $50']")
	WebElement filtertab;
	@FindBy(xpath = "//p[text()='Price Low to High']")
	WebElement sorttab;
	@FindBy(xpath = "(//div[@class='product-price-range'])[1]")
	WebElement filterproduct;
	@FindBy(xpath = "(//div[@class='product-card-title ant-flex css-p897kf'])[1]")
	WebElement sortproduct;
	@FindBy(xpath = "//div[2]//div[2]//div[1]//div[2]//div[2]//p[2]//*[name()='svg']")
	WebElement closefiltertab;
	@FindBy(xpath = "//div[2]//div[2]//div[1]//div[2]//div[3]//p[2]//*[name()='svg']")
	WebElement closesorttab;
	@FindBy(xpath = "//span[text()='Products Name Alphabetically (A-Z)']")
	WebElement sortAtoZ;
	@FindBy(xpath = "//span[text()='Products Name Alphabetically (Z-A)']")
	WebElement sortZtoA;
	@FindBy(xpath = "//span[text()='Select a custom range']")
	WebElement costomfilter;
	@FindBy(xpath = "//input[@id='price-filter_Min']")
	WebElement minrange;
	@FindBy(xpath = "//input[@id='price-filter_Max']")
	WebElement maxrange;
	@FindBy(xpath = "(//div[@class='product-card-wrapper'])[1]")
	WebElement productframe;
	@FindBy(xpath = "//p[text()='No products found']")
	WebElement notfound;
	@FindBy(xpath = "//div[@class='pagination-btn']")
	WebElement nextpagebtn;
	@FindBy(xpath = "//p[@class='pagination-title']")
	WebElement pagestatus;
	@FindBy(xpath = "(//div[@class='product-price-range'])[11]")
	WebElement prodprice;
	@FindBy(xpath = "(//div[@class='product-card-title ant-flex css-p897kf'])[11]")
	WebElement prodtitle;
	
	//Action Method
	
	public Product_Landing_Page() 
	{
		PageFactory.initElements(driver, this);
	}
	public String check_Page_Title() 
	{
		productbtn.click();
		return pagetitle.getText();
	}
	public boolean check_active_product() throws InterruptedException 
	{
		
		Thread.sleep(2000);
		return activtag.isDisplayed();
	}
	public boolean check_active_product_filter() 
	{
		filter.click();
		$25to50.click();
		applyfilter.click();
		return filtertab.isDisplayed();
	}
	public int check_filter_25_50() 
	{
		String price = filterproduct.getText();
		String filterprice = price.replaceAll("[\\$\\s]", "");
		String arr[] = filterprice.split("-");
		int number= Integer.parseInt(arr[0]);
		return number;
	}
	public boolean check_active_product_sort() 
	{
		sort.click();
		pricetohigh.click();
		applysort.click();
		return sorttab.isDisplayed();
	}
	public String check_sort_low_to_high() throws InterruptedException 
	{
		filter.click();
		clearfilter.click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sort)).click();
		wait.until(ExpectedConditions.elementToBeClickable(pricetohigh)).click();
		wait.until(ExpectedConditions.elementToBeClickable(applysort)).click();
		Thread.sleep(5000);
		return sortproduct.getText();
	}
	public String check_sort_high_to_low() throws InterruptedException 
	{
		sort.click();
		clearsort.click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sort)).click();
		wait.until(ExpectedConditions.elementToBeClickable(pricehightolow)).click();
		wait.until(ExpectedConditions.elementToBeClickable(applysort)).click();
		Thread.sleep(5000);
		return sortproduct.getText();
	}
	
	public String check_draft_product_sortatoz() throws InterruptedException 
	{
		draftproduct.click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sort)).click();
		wait.until(ExpectedConditions.elementToBeClickable(sortAtoZ)).click();
		wait.until(ExpectedConditions.elementToBeClickable(applysort)).click();
		Thread.sleep(5000);
		return sortproduct.getText();
	}
	public String check_draft_product_sortztoa() throws InterruptedException 
	{
		sort.click();
		clearsort.click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(sort)).click();
		wait.until(ExpectedConditions.elementToBeClickable(sortZtoA)).click();
		wait.until(ExpectedConditions.elementToBeClickable(applysort)).click();
		Thread.sleep(5000);
		return sortproduct.getText();
	}
	public boolean check_darft_tag() 
	{
		return drafttag.isDisplayed();
	}
	public int check_costom_filter()
	{
		filter.click();
		costomfilter.click();
		minrange.sendKeys("1");
		maxrange.sendKeys("10");
		applyfilter.click();
		String price = filterproduct.getText();
		String filterprice = price.replaceAll("[\\$\\s]", "");
		String arr[] = filterprice.split("-");
		int number= Integer.parseInt(arr[0]);
		return number;
	}
	public boolean check_error_product() 
	{
		errorproduct.click();
		return errortag.isDisplayed();
	}
	public boolean check_best_seller_product() 
	{
		bestseller.click();
		return productframe.isDisplayed();
	}
	public boolean check_For_her_product() 
	{
		forher.click();
		return productframe.isDisplayed();
	}
	public String check_search_product() 
	{
		activeproduct.click();
		searchbar.sendKeys("']`");
		return notfound.getText();
	}
	public String check_search_draft_product() throws InterruptedException 
	{
		draftproduct.click();
		Thread.sleep(3000);
		searchbar.sendKeys("Dachshund Monogram - Steel Sign");
		Thread.sleep(5000);
		return sortproduct.getText();
	}
	public String check_pagination() throws InterruptedException 
	{
		activeproduct.click();
		nextpagebtn.click();
		Thread.sleep(5000);
		return pagestatus.getText();
	}
	public String check_sort_filter_product() throws InterruptedException 
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(bestseller)).click();
		wait.until(ExpectedConditions.elementToBeClickable(sort)).click();
		wait.until(ExpectedConditions.elementToBeClickable(sortAtoZ)).click();
		wait.until(ExpectedConditions.elementToBeClickable(applysort)).click();
		wait.until(ExpectedConditions.elementToBeClickable(filter)).click();
		wait.until(ExpectedConditions.elementToBeClickable($25to50)).click();
		wait.until(ExpectedConditions.elementToBeClickable(applyfilter)).click();
		Thread.sleep(3000);
		return sortproduct.getText();
	}
	public int check_filter_price() 
	{
		String price = filterproduct.getText();
		String filterprice = price.replaceAll("[\\$\\s]", "");
		String arr[] = filterprice.split("-");
		int number= Integer.parseInt(arr[0]);
		return number;
	}
	
}

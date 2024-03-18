package mem.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import mem.qa.base.TestBase;

public class Mem_Product_Details_Page extends TestBase {
	//Object Repository
	
@FindBy(xpath = "//div[text()='Product Details']")
WebElement pagetitle;
@FindBy(xpath = "//p[@class='product-title']")
WebElement producttitle;
@FindBy(xpath = "(//p[@class='product-label'])[1]")
WebElement price;
@FindBy(xpath = "(//p[@class='product-label'])[2]")
WebElement compareprice;
@FindBy(xpath = "(//p[@class='product-label'])[3]")
WebElement color;
@FindBy(xpath = "(//p[@class='product-label'])[4]")
WebElement size;
@FindBy(xpath = "(//p[@class='product-label'])[5]")
WebElement productdescription;
@FindBy(xpath = "//p[text()='Copper']")
WebElement copper;
@FindBy(xpath = "//p[text()='Black']")
WebElement black;
@FindBy(xpath = "//p[text()='Silver']")
WebElement silver;
@FindBy(xpath = "//p[text()='Gold']")
WebElement gold;
@FindBy(xpath = "//p[text()='White']")
WebElement white;
@FindBy(xpath = "//div[text()='Active']")
WebElement active;
@FindBy(xpath = "//div[text()='Error']")
WebElement error;
@FindBy(xpath = "//div[text()='Orders']")
WebElement orders;
@FindBy(xpath = "//div[text()='Draft']")
WebElement draft;
@FindBy(xpath = "//input[@class='ant-input css-p897kf']")
WebElement searchbar;
@FindBy(xpath = "//span[contains(text(),'Create New')]")
WebElement creatnewbtn;
@FindBy(xpath = "(//img[@class='bottomSwiper'])[1]")
WebElement blackimg;
@FindBy(xpath = "(//img[@class='bottomSwiper'])[2]")
WebElement copperimg;
@FindBy(xpath = "(//img[@class='bottomSwiper'])[3]")
WebElement silvereimg;
@FindBy(xpath = "(//img[@class='bottomSwiper'])[1]")
WebElement goldimg;
@FindBy(xpath = "(//img[@class='bottomSwiper'])[1]")
WebElement whiteimg;
@FindBy(xpath = "(//div[@class='product-card-title ant-flex css-p897kf'])[11]")
WebElement product;
@FindBy(xpath = "(//p[@class='product-info number-wrapper'])[1]")
WebElement prodprice;
@FindBy(xpath = "//div[text()='PRODUCTS']")
WebElement productbtn;

//Action Method
public Mem_Product_Details_Page() 
{
	PageFactory.initElements(driver, this);
}
public String check_page_title() 
{
	productbtn.click();
	product.click();
	return pagetitle.getText();
}
public String check_product_title() 
{
	return producttitle.getText();
}
public String check_product_price() 
{
	 String input = "$27.0 - $82.0";
     String output = input.replaceAll("[\\$\\.0]", "");
	return output;
}
public boolean check_color_selection() 
{
	silver.click();
	return silver.isSelected();
}
}



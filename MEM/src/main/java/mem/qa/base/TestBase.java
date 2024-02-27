package mem.qa.base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import mem.qa.listeners.WebEventListener;
import mem.qa.util.TestUtil;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	public static EventFiringWebDriver e_driver;
	public static WebEventListener eventListener;

//	Constructor for loading config.properties file
	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream("C:\\Users\\lucentinnovation\\eclipse-workspace\\MEM\\src\\main\\java\\mem\\qa\\config\\config.properties");
			prop.load(fis);
		} catch (Exception e) {
		}
	}

	public static void initialization() {
		String browser = prop.getProperty("browser");
		if (browser.equals("chrome")) {
			ChromeOptions option = new ChromeOptions();
//			option.addArguments("--headless");
			option.addArguments("--disable-notifications");
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\lucentinnovation\\eclipse-workspace\\MEM\\Driver\\chromedriver.exe");
			driver = new ChromeDriver(option);
		}
		else if (browser.equals("edge")) {
			System.setProperty("webdriver.edge.driver","C:\\Users\\lucentinnovation\\eclipse-workspace\\MEM\\Driver\\msedgedriver.exe");
			driver = new EdgeDriver();		}
		else if(browser.equals("firefox")) 
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\lucentinnovation\\eclipse-workspace\\MEM\\Driver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}

		e_driver = new EventFiringWebDriver(driver);
		eventListener = new WebEventListener();
		e_driver.register(eventListener);
		driver = e_driver;

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.page_load_timeout, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.implicit_wait, TimeUnit.SECONDS);
		driver.get(prop.getProperty("URL"));
	}
}

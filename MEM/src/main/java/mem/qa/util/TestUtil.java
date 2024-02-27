package mem.qa.util;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

import mem.qa.base.TestBase;

public class TestUtil extends TestBase {
	
	public static long page_load_timeout = 30;
	public static long implicit_wait = 20;
	public static ITestResult result;
	public static String screenshotName;
	public static WebDriver driver;
	
	public static void takeScreenshot(WebDriver driver, String screenshotName) throws IOException {
		try {
			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File("./screenshots/"+screenshotName+".png"));
			System.out.println("Screenshot taken");
			if (result != null) {
	            screenshotName = result.getName();
	        } 
			else 
			{
	            System.out.println("ITestResult 'result' is null. Unable to set screenshotName.");
	        }
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

package Generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Baseclass implements FrameWork_constrant
{
	public static WebDriver driver;
	@Parameters({"browser"})
	
	
	
	
	@BeforeMethod 
	public  void openbrowser(String browser)
	{ 
	 
		
	   
	if(browser.equals("chrome"))
	   {
		System.setProperty(chrome_key, chrome_value);
		driver=new ChromeDriver();
		
	   }
	   else
	   {
		   System.setProperty(gecko_key,gecko_value);
			driver=new FirefoxDriver();
	   }
	   
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    
	   
	   driver.get(url);
		driver.manage().window().maximize();
	}

	@AfterMethod
	public  void closerapp(ITestResult result) throws IOException
	{
		System.out.println(result);
	   if(ITestResult.FAILURE==result.getStatus())
	   {
		   System.out.println("the failed test case:"+result.getName());
		   Generic_screenshot.screenshot(driver);
		   
	   }
	driver.quit();
	}

}

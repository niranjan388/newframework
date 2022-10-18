package Generic;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Generic_screenshot 
{
	public static String screenshot(WebDriver driver) throws IOException
	{
		TakesScreenshot tss=(TakesScreenshot)driver;
		String photo="./photos/";
		Date d=new Date();
		String d1 = d.toString().replaceAll(":", "-");
		
		   File src = tss.getScreenshotAs(OutputType.FILE);
		  String path=""+photo+""+d1+""+".jpeg" ;
		  File dst = new File(path);
		   
		   FileHandler.copy(src, dst);
		   return path;
		
		
		
	}

}

package Generic;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.ArrayList;

import java.util.Set;

import org.openqa.selenium.WebDriver;



public class utilitymethods 
{
 

  public static Robot KeyBoardActions() throws AWTException
  {
	  Robot rbt=new Robot();
	  return rbt;
  }
 public static void explitwait()
 {
	

 }
 public static void windowswitch(WebDriver driver)
 
 {
	 Set<String> ids = driver.getWindowHandles();
	 ArrayList<String> arr= new ArrayList<String>(ids);
	 driver.switchTo().window(arr.get(1));
	
	
       
     
	
 
	 
 }

   
}

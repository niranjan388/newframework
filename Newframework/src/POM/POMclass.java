package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.Baseclass;

public class POMclass extends Baseclass
{
	@FindBy(xpath="//input[@type='text']")
	private WebElement searchTextfiled;
	@FindBy(xpath="//button[.='✕']")
	private WebElement canclebutton;
	@FindBy(xpath="//div[.='realme C31 (Light Silver, 32 GB)']")
	private WebElement relameMobile;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement searchbutton;
	@FindBy(xpath="//button[@type='button']")
	private WebElement BuyNow;

	public POMclass(WebDriver driver)
	{
		PageFactory.initElements(driver, this);

	}
	public  WebElement canclebutton()
	{
		return canclebutton;
		
	}
	public  WebElement searchTextfiled()
	{
		return searchTextfiled;
	}
	public  WebElement searchbutton()
	{
		return searchbutton;
	}
	
	public WebElement relameMobile()
	{
		return relameMobile;
		
	}
	public WebElement Buynow()
	{
		
	return	BuyNow;
		
	}


}

package bank.methods;

import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumOperations 
{
	public static WebDriver driver=null;
	public static Hashtable<String,Object> outputparameters= new Hashtable<String,Object>();
	
	public static Hashtable<String,Object> browserLaunch(Object[]inputparameters)
	{
		try {
			String strBrowserName=(String)inputparameters[0];
			String strBrowserPath=(String)inputparameters[1];
			if(strBrowserName.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", strBrowserPath);
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			}
			outputparameters.put("STATUS","PASS");
			outputparameters.put("MESSAGE","Action: Browser Launch, Input Given:"+inputparameters[0].toString());
		} 
		catch (Exception e) 
		{
			outputparameters.put("STATUS","FAIL");
			outputparameters.put("MESSAGE","Action: Browser Launch, Input Given:"+inputparameters[0].toString());
		}
		return outputparameters;
		
	}
	public static Hashtable<String,Object> openApplication(Object[]inputparameters)
	{
		try {
			String strUrl = (String)inputparameters[0];
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			driver.get(strUrl);
			outputparameters.put("STATUS","PASS");
			outputparameters.put("MESSAGE","Action: Browser Launch, Input Given:"+inputparameters[0].toString());
		} 
		catch (Exception e) 
		{
			outputparameters.put("STATUS","FAIL");
			outputparameters.put("MESSAGE","Action: Browser Launch, Input Given:"+inputparameters[0].toString());
		}
		
		return outputparameters;
	}
	public static Hashtable<String,Object>  credentials(Object[] inputparameters)
	{
		try {
			String xpath = (String) inputparameters[0];
			String value = (String) inputparameters[1];
			WebElement obj = driver.findElement(By.xpath(xpath));
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			obj.sendKeys(value);
			outputparameters.put("STATUS","PASS");
			outputparameters.put("MESSAGE","Action: Browser Launch, Input Given:"+inputparameters[1].toString());
		} 
		catch (Exception e) 
		{
			outputparameters.put("STATUS","FAIL");
			outputparameters.put("MESSAGE","Action: Browser Launch, Input Given:"+inputparameters[1].toString());
		}
		
		return outputparameters;
	}
	public static Hashtable<String,Object> Login(Object[] inputparameters)
	{
		try {
			String xpath = (String) inputparameters[0];
			WebElement obj =  driver.findElement(By.xpath(xpath));
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			obj.click();
			outputparameters.put("STATUS","PASS");
			outputparameters.put("MESSAGE","Action: Browser Launch, Input Given:"+inputparameters[0].toString());
		} 
		catch (Exception e) 
		{
			outputparameters.put("STATUS","FAIL");
			outputparameters.put("MESSAGE","Action: Browser Launch, Input Given:"+inputparameters[0].toString());
		}
		return outputparameters;
	}
	public static Hashtable<String,Object> Click(Object[] input2) 
	{
		try {
			String xpath = (String) input2[0];
			WebElement obj =  driver.findElement(By.xpath(xpath));
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			obj.click();
			outputparameters.put("STATUS","PASS");
			outputparameters.put("MESSAGE","Action: Browser Launch, Input Given:"+input2[0].toString());
		} 
		catch (Exception e) 
		{
			outputparameters.put("STATUS","FAIL");
			outputparameters.put("MESSAGE","Action: Browser Launch, Input Given:"+input2[0].toString());
		}
		
		return outputparameters;
	}
	public static Hashtable<String,Object> DropDown(Object[] inputparameters) 
	{
		try {
			String xpath = (String)inputparameters[0];
			String name = (String)inputparameters[1];
			
			Select obj = new Select(driver.findElement(By.xpath(xpath)));
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			obj.selectByVisibleText(name);
			outputparameters.put("STATUS","PASS");
			outputparameters.put("MESSAGE","Action: Browser Launch, Input Given:"+inputparameters[0].toString());
		} 
		catch (Exception e) 
		{
			outputparameters.put("STATUS","FAIL");
			outputparameters.put("MESSAGE","Action: Browser Launch, Input Given:"+inputparameters[0].toString());
		}
		return outputparameters;
		
	}
	public static Hashtable<String,Object> Search(Object[] input6) 
	{
		try {
			String xpath = (String) input6[0];
			WebElement obj =  driver.findElement(By.xpath(xpath));
			obj.click();
			outputparameters.put("STATUS","PASS");
			outputparameters.put("MESSAGE","Action: Browser Launch, Input Given:"+input6[0].toString());
		} 
		catch (Exception e) 
		{
			outputparameters.put("STATUS","FAIL");
			outputparameters.put("MESSAGE","Action: Browser Launch, Input Given:"+input6[0].toString());
		}
		return outputparameters;
		
	}
	
	
	
	

}

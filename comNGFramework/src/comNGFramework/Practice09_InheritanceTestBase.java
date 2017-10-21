package comNGFramework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Practice09_InheritanceTestBase {
	//changed this name and highlighted red error and clicked rename compilation unti to...
	
	/*	Add any reusable code to this page and methods can be used outside of the class on other pages.
	 * 	All you have to do is add extends at the end on the main public class, and then just add the 
	 * 	method's name to any class or function.
	 */
	
	
	public WebDriver driver;
	

	
	public void login() throws IOException 
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Paul\\eclipse-workspace\\comNGFramework\\src\\comNGFramework\\datadriven.properties");
	
		//had to throw declaration again (not instructed anywhere to do so (unike with fileinputstream
		prop.load(fis);
		
		System.out.println(prop.getProperty("username"));
		
		if (prop.getProperty("browser").equals("firefox"))
		{
			driver = new FirefoxDriver();
		}
		else if (prop.getProperty("browser").equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "c:\\Eclipse\\Webdrivers\\chromedriver.exe");
			driver = new ChromeDriver();
			//added path to chromedriver
		}
		else
		{
			System.setProperty("webdriver.ie.driver", "c:\\Eclipse\\Webdrivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		
		driver.get(prop.getProperty("url"));
		
	
	}
	
	
	public void ToIterateNavTitles()
	{
		int count = driver.findElements(By.xpath("//div[@class='header__navDesktop']/ul/child::*")).size();
		
		System.out.println(count);
		
		
		for (int i = 0; i < count; i++) 
		{			
			System.out.println(driver.findElements(By.xpath("//div[@class='header__navDesktop']/ul/child::*")).get(i).getAttribute("value"));			
		}
	
	
	}
	
	
	public void clickAllFooters() throws IOException
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Paul\\eclipse-workspace\\comNGFramework\\src\\comNGFramework\\datadriven.properties");	
		prop.load(fis);
		
		int count = driver.findElements(By.xpath("//div[@class='footerTop__social']/a")).size();
		// is there a way to use the datadriven properties for the findelement(s) method?
		
		System.out.println(count);
		
		
		for (int i = 0; i < count; i++) 
		{			
			driver.findElements(By.xpath(prop.getProperty("socialfooters"))).get(i).click();
		}
	
	}
	
}

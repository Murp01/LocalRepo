package comNGFramework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class Practice08_IfElseWebDrivers {
	public WebDriver driver;
	

	@Test
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
	
	
}

package comNGFramework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Practice07b_GllobalParamPlayAround {
	
	public String dataPropertyLocation = "C:\\\\Users\\\\Paul\\\\eclipse-workspace\\\\comNGFramework\\\\src\\\\comNGFramework\\\\datadriven.properties";
	public WebDriver driver;
	public Properties prop = new Properties();
	
	
	@BeforeTest
	public void initiateChromeLaunch() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "c:\\Eclipse\\Webdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		FileInputStream fis = new FileInputStream(dataPropertyLocation);
		prop.load(fis);
		driver.get(prop.getProperty("url"));

		
	}
	
	
	
	@Test
	public void login() throws IOException 
	{
		initiateChromeLaunch();
		FileInputStream fis = new FileInputStream(dataPropertyLocation);  //can this be done globally?
		prop.load(fis);
		
		driver.findElement(By.xpath(prop.getProperty("practices"))).click();
	
	}
	
	
}

package primaryNavigation;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class PM01_HomepageLink {
	public WebDriver driver;
	public String dataPropertyLocation = "C:\\Users\\Paul\\eclipse-workspace\\LatersWeb\\src\\test\\java\\homepage\\DataDrivenPropertiesHomePage";
	public Properties prop = new Properties();
	

	@Test
	public void clickHomePageIcon() throws IOException
	{
		FileInputStream fis = new FileInputStream(dataPropertyLocation);  //can this be do ne globally?
		prop.load(fis);
		
		driver.findElement(By.xpath(prop.getProperty("primaryNavLLLogo"))).click();
		//make an assertion that confirms the url is still the homepage. Perhaps, change page and assert too
		
		String URL = driver.getCurrentUrl();
		Assert.assertEquals(URL, "https://lpslive.linklaters.com/" );
	}
	
	
	@Test
	public void clickHomePagePracticePage() throws IOException
	{
		FileInputStream fis = new FileInputStream(dataPropertyLocation);  //can this be do ne globally?
		prop.load(fis);
		
		driver.findElement(By.xpath(prop.getProperty("practices"))).click();
		
		driver.findElement(By.xpath(prop.getProperty("primaryNavLLLogo"))).click();
		//make an assertion that confirms the url is still the homepage. Perhaps, change page and assert too
		
		String URL = driver.getCurrentUrl();
		Assert.assertEquals(URL, "https://lpslive.linklaters.com/" );
	}
	
	
	@BeforeTest
	public void invokeChromeDriver()
	{
		System.setProperty("webdriver.chrome.driver", "c:\\Eclipse\\Webdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://lpslive.linklaters.com/");
	}
	
	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}
	
	

}

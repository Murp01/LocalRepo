package comNGFramework;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Practice06_ParamatisingFromXML {
	
	public WebDriver driver;
	
	@BeforeTest
	public void InvokeWebDriver()
	{
		System.setProperty("webdriver.chrome.driver", "c:\\Eclipse\\Webdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		
	}
	
	
	
	//String PageURL = URLParameter;
	

	
	
	@Test
	@Parameters ({"LiveSite", "InsightLandingTitle"})
	public void testing(String SiteURL, String LinkSelect)
	{
		driver.get(SiteURL);
		driver.findElement(By.xpath(LinkSelect)).click();

	}
	
	
	
	
	
	/*
	
	
	
	
	//	Test tear up and down
	@BeforeTest
	public void InvokeWebDriver()
	{
		System.setProperty("webdriver.chrome.driver", "c:\\Eclipse\\Webdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://lpsuat.linklaters.com");

	}
	
	
	//@AfterTest
	public void TestTearDown()
	{
		driver.close();
	}
	
	*/

}

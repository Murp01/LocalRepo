package implementingAnnotations;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class insightsPracticeFilter {
	
	public WebDriver driver;
	String insightsTitle = "//div[@class='row']/div/ul/li[5]/a[@href='/en/insights']";
	String practiceDrop = "//div[@class='btn-group bootstrap-select show-tick']/button[@title='Practice']";
	String practiceList = "//button[@title='Practice']/../select[@name='practice']/option";
	String pracItems = "//form[@action='']/div/select[@class='selectpicker margin-bottom-10'][@name='practice']/../div/ul/li[0]/a/span[@class='text']";
	String pracNav = "//div[@class='header__navDesktop']/ul/li/a[@href='/en/practices']";
	//	Practice box
	String pracBox = "//nav[@class='is-active']";
	//	count in first column of practice box for getting size
	String pracBoxASize = "//nav[@class='is-active']/div/div[1]/ul[1]/li";
	//	first column in practice drop down box
	String pracBoxA = "//nav[@class='is-active']/div/div/ul/li/a";

	@BeforeTest
	public void invokeChromeDriver()
	{
		System.setProperty("webdriver.chrome.driver", "c:\\Eclipse\\Webdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://lpsuat.linklaters.com");
		driver.findElement(By.xpath(insightsTitle)).click();
		
	}
	
	
	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}
	
	
	

	public void assertInsightsFilters()
	{
		WebDriverWait d = new WebDriverWait(driver, 20);
		d.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(practiceDrop)));
		driver.findElement(By.xpath(practiceDrop)).click();
		int selPracCount = driver.findElements(By.xpath(practiceList)).size();
		System.out.println(selPracCount);
		
		
		List<String> list = new ArrayList<String>();
		// not filter but drop down
				
		for (int i = 1; i < selPracCount; i++)
		{					
			String getThis = driver.findElement(By.xpath("//form[@action='']/div/select[@class='selectpicker margin-bottom-10'][@name='practice']/../div/ul/li[" + i + "]/a/span")).getAttribute("innerText");
			list.add(getThis);
			System.out.println(getThis);	
		}
		

	}

}

 package sitemap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class SM01_SitemapPage {
	
	public WebDriver driver;
	

	@BeforeTest
	public void invokeChromeDriver()
	{
		System.setProperty("webdriver.chrome.driver", "c:\\Eclipse\\Webdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://lpslive.linklaters.com");
	}
	
	
	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}
	
	
	
	@Test
	public void assertSitemapPage()
	{
		String beforeClickingTitle = null;
		String afterClickingNew;
				
		WebElement globalFooter = driver.findElement(By.xpath("//div[@class='footerBottom']"));
		int footerSize = (globalFooter.findElements(By.tagName("a")).size());
		for (int i=0; i < footerSize; i++) {			
			System.out.println(globalFooter.findElements(By.tagName("a")).get(i).getText());
			if (globalFooter.findElements(By.tagName("a")).get(i).getText().contains("Sitemap")) {
				beforeClickingTitle = driver.getTitle();
				System.out.println("Before clicking on the link the title is '" + 
				beforeClickingTitle + "'");				
				globalFooter.findElements(By.tagName("a")).get(i).click();
				break;			
			}						
		}
		afterClickingNew = driver.getTitle();
		System.out.println("After clicking on the link the title is '" + afterClickingNew + "'");
		if (beforeClickingTitle != afterClickingNew) {			
			Boolean titleDisplayed = driver.findElement(By.xpath("//h1[text()='Sitemap']")).isDisplayed();
			if (titleDisplayed == true) {
			System.out.println("SUCCESS");
			}
		}
		else {			
			System.out.println("FAIL");
		}
	}
	

}

package comNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Practice04_GroupingTests {
	
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
	
	
	
	@Test (groups = {"Priority1"})	// argument attribute
	public void openContactForm()
	{
		int count = driver.findElements(By.xpath("//div[@class='header__navDesktop']/ul/child::*")).size();
		System.out.println(count);
		for (int i = 0; i < count; i++) {
			driver.findElements(By.xpath("//div[@class='header__navDesktop']/ul/child::*")).get(i).click();
		}		
	}
	
	
	
	@Test (groups = {"Priority1"})
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
	
	
	
	@Test (groups = {"Priority2"}) //	Separate group as to the other 2
	public void openSocialMedia() 
	{
		int count = driver.findElements(By.xpath("//div[@class='footerTop__social']/a")).size();		
		System.out.println(count);		
		for (int i = 0; i < count; i++) {			
			driver.findElements(By.xpath("//div[@class='footerTop__social']/a")).get(i).click();
			//	I need to find a way to close all other browser tabs
		}
	}
	

	
	
	

}

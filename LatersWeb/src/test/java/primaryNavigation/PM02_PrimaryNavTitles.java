 package primaryNavigation;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class PM02_PrimaryNavTitles {
	
	public WebDriver driver;
	String pracNav = "//div[@class='header__navDesktop']/ul/li/a[@href='/en/practices']";
	String pracBox = "//nav[@class='is-active']";
	String pracBoxASize = "//nav[@class='is-active']/div/div[1]/ul[1]/li";
	String listA;
	String listB;

	

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
	public void openContactForm()
	{
		int count = driver.findElements(By.xpath("//div[@class='header__navDesktop']/ul/child::*")).size();
		System.out.println(count);
		for (int i = 0; i < count; i++) {
			driver.findElements(By.xpath("//div[@class='header__navDesktop']/ul/child::*")).get(i).click();
		}		
	}
	
	
	
	@Test
	public void practiceDropDown()
	{
		WebDriverWait d = new WebDriverWait(driver, 20);

		Actions a = new Actions(driver);
		
		WebElement pracTitle = driver.findElement(By.xpath(pracNav));
		
		a.moveToElement(pracTitle).build().perform();
		
		d.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(pracBox)));
		
		int count = driver.findElements(By.xpath(pracBoxASize)).size();
		
		System.out.println(count);
		
		List<String> list = new ArrayList<String>();
		
		for (int i = 1; i < count; i++)
		{
			listA = driver.findElement(By.xpath("//nav[@class='is-active']/div/div/ul/li[" + i + "]/a")).getAttribute("innerText");
			list.add(listA);
			System.out.println(listA);
		}
		
		for (int i = 1; i < count; i++)
		{
			listB = driver.findElement(By.xpath("//nav[@class='is-active']/div/div/ul[2]/li[" + i + "]/a")).getAttribute("innerText");
			list.add(listB);
			System.out.println(listB);
		}
		
		System.out.println(listA);
		
	}
		

}

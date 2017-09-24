package externalWeblinkWidgets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class promoWidget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "c:\\Eclipse\\Webdrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://lpslive.linklaters.com");
		
		driver.manage().window().maximize();
		
		// WebElement insights = driver.findElement(By.xpath("//a[@href='/en/insights'][1]"));
		
		
		// Insights page
		driver.findElement(By.xpath("//a[@href='/en/insights'][1]")).click();
		
		driver.findElement(By.xpath("//span[text()='Download the Linklaters iPad app']")).click();
		
		String URL = driver.getCurrentUrl();
		Assert.assertEquals(URL, "https://itunes.apple.com/us/app/linklaters-insights/id635240348?mt=8&ign-mpt=uo%3D4");
		
		
		
		driver.close();

	}

}

package smokeTests;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assertPracticesPage {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Eclipse\\\\Webdrivers\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://lpslive.linklaters.com");
		
		driver.findElement(By.xpath("//a[@href='/en/practices']")).click();
		
		String URL = driver.getCurrentUrl();
		Assert.assertEquals(URL, "https://lpslive.linklaters.com/en/practices" );
		
		driver.close();
		
		//need to add catch & fail
		
		

	}

}

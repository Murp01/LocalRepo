package smokeTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assertBankingPage {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse\\Webdrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://lpslive.linklaters.com");
		
		driver.findElement(By.xpath("//a[@href='/en/practices']"));
		
		driver.findElement(By.xpath("//a[@href='/en/practices/banking']")).click();
		
	}

}

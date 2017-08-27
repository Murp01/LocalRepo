package actionsExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsRealTimeExample {

	public static void main(String[] args) {
		// https://www.udemy.com/selenium-real-time-examplesinterview-questions/learn/v4/t/lecture/1979328?start=0
		
		System.setProperty("webdriver.chrome.driver", "c:\\Eclipse\\Webdrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://amazon.com");
		
		Actions a = new Actions(driver);
		
		WebElement move = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		WebElement account = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		
		a.moveToElement(move).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		
		a.moveToElement(account).contextClick().build().perform();
		
		

	}

}

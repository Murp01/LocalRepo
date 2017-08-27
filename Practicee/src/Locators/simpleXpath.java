package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class simpleXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse\\Webdrivers\\chromedriver.exe");

		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://https://lpslive.linklaters.com/");
		
		driver.findElement(By.xpath("")).click();
				
		driver.findElement(By.xpath("//*[@id=\"ctl00_PlaceHolderSearchArea_SearchControl1_ctl01\"]")).sendKeys("careers");

	}

}

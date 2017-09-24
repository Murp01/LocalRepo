package smokeTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iterateToSpecificElement {

	public static void main(String[] args) {
		/* This class can be used when searching for a specific element that has not been given a unique
		 * id or name.  
		 */
		
		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse\\Webdrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://lpslive.linklaters.com");
		
		//The below variable will contain the amount of child elements within the 'header_navdesktop' class
		int count = driver.findElements(By.xpath("//div[@class='header__navDesktop']/ul/child::*")).size();
		
		//prints the contents of the variable which contains the amount of child elements.
		System.out.println(count);
		
		 /*
		  * 
		  */
		for (int i = 0; i < count; i++) {
			
			//need to find a way of finding the element?  href is the only value and this does not pick it up
			System.out.println(driver.findElements(By.xpath("//div[@class='header__navDesktop']/ul/child::*")).get(i).getAttribute("value"));
			
			
		}

	}

}

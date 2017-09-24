package socialMediaLinks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class footerLinks {

	public static void main(String[] args) {
		/* Step 1: open site
		 * Step 2: Use for loop to select first link.  While still in loop switch windows and assert
		 * correct page has opened
		 * Step 3: Close current window
		 * Step 4: Return to original windw
		 * Step 5: Back to begininning of loop
		 */
		
		System.setProperty("webdriver.chrome.driver", "c:\\Eclipse\\Webdrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://lpslive.linklaters.com");
		
		
		// create variable for global footer objects
		// WebElement socialBar = driver.findElement(By.xpath("//div[@class='footerTop__social']/a"));
		
		// get the size count of child elements in right global footer
		int count = driver.findElements(By.xpath("//div[@class='footerTop__social']/a")).size();
		
		System.out.println(count);
		
		for (int i = 0; i < count; i++) {
			
			
			driver.findElements(By.xpath("//div[@class='footerTop__social']/a")).get(i).click();
			
		}
				
		/* 2 ways to attempt this. Option 1, use and data source for the correct URLs.  Each iteration will
		 * asserts the page opened by clicking the icon (i.e. linkedin) matches that from the data source
		 * Option 2, iteration explained - https://www.udemy.com/selenium-real-time-examplesinterview-questions/learn/v4/t/lecture/2479956?start=0
		 * 
		 */

	}

}

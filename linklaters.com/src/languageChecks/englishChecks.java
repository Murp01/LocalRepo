package languageChecks;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class englishChecks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse\\Webdrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://lpslive.linklaters.com");
		
		
		/*I have used an xpath that starts at the head and traverses its way down to the practices menu button
		 * .This way I should be able to just change the li[1] number to [2] to find sectors, and then [3] to 
		 * move along etc.(see lessong 'Difference between relevant and absolute path'
		 */
		driver.findElement(By.xpath("//header/div/div/div/ul/li[1]/a")).click();
		//Assert the url for page
		String URL = driver.getCurrentUrl();
		Assert.assertEquals(URL, "https://lpslive.linklaters.com/en/practices" );
		
		
		/*Assert sectors page.  Basically took first page but updated [1] in relative path, and changed the
		 * variable name of url string to URL1 
		 */
		driver.findElement(By.xpath("//header/div/div/div/ul/li[2]/a")).click();
		//Assert the url for page
		String URL1 = driver.getCurrentUrl();
		Assert.assertEquals(URL1, "https://lpslive.linklaters.com/en/sectors" );
		
		
		driver.findElement(By.xpath("//header/div/div/div/ul/li[3]/a")).click();
		//Assert the url for page
		String URL2 = driver.getCurrentUrl();
		Assert.assertEquals(URL2, "https://lpslive.linklaters.com/en/lawyers" );
		
		
		driver.findElement(By.xpath("//header/div/div/div/ul/li[4]/a")).click();
		//Assert the url for page
		String URL3 = driver.getCurrentUrl();
		Assert.assertEquals(URL3, "https://lpslive.linklaters.com/en/locations" );
		
		
		driver.findElement(By.xpath("//header/div/div/div/ul/li[5]/a")).click();
		//Assert the url for page
		String URL4 = driver.getCurrentUrl();
		Assert.assertEquals(URL4, "https://lpslive.linklaters.com/en/insights" );
		
		
		driver.findElement(By.xpath("//header/div/div/div/ul/li[6]/a")).click();
		//Assert the url for page
		String URL5 = driver.getCurrentUrl();
		Assert.assertEquals(URL5, "https://lpslive.linklaters.com/en/our-firm" );
		
		
		
		driver.close();
		
		
		
		

	}

}

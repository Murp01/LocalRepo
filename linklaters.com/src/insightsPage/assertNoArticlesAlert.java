package insightsPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assertNoArticlesAlert {

	public static void main(String[] args) {
		/* Step 1. Verify the article is displayed
		 * Step 2. Enter text into search input box
		 * Step 4. Verify message appears stating no articles
		 */
		
		System.setProperty("webdriver.chrome.driver", "c:\\Eclipse\\Webdrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://lpslive.linklaters.com");
		
		driver.findElement(By.xpath("//a[@href='/en/insights'][1]")).click();
		
		//step 1. Verify the article is displayed
		System.out.println("Before any text is entered into search box.");
		System.out.println(driver.findElement(By.xpath("//a[@href='/en/our-firm/news-and-deals/news/2017/linklaters-to-expand-private-equity-practice-with-appointment-of-christopher-kellett']/h4")).isDisplayed());
		
		//step 2. Enter text into the search input box
		System.out.println("Entering text into search box.");
		driver.findElement(By.cssSelector("input[class='string-search']")).sendKeys("Testing");
		
		//step 3. verify message appears
		String noInsights = driver.findElement(By.xpath("//div[@class='col-xs-12']/p")).getText();
		System.out.println(noInsights);
		
		if (noInsights.equals("Your search did not return any results. Try your search again using the following methods:")) {
			System.out.println("The correct message appears on screen.");
		}
		else {
			System.out.println("The correct message does not appear on the screen.");
		}
		
		
		
		

	}

}

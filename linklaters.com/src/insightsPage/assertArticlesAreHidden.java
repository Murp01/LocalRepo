package insightsPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assertArticlesAreHidden {

	public static void main(String[] args) {
		/* Step 1. Verify the article is displayed
		 * Step 2. Enter text into search input box
		 * Step 3. Verify that the insights articl has been hidden
		 * Step 4. Remove text from input box - return after remove text lesson
		 * Step 5. Verify the article reappears
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
		
		/*step 3. Verify the insights articl (text) has been hidden
		 * isdisplayed will not work here.  so instead we add the amount of elements into 'Size' variable
		 * and check if size is equal to 0
		 */
		System.out.println("After text is entered into search box.");
		int size = driver.findElements(By.xpath("//a[@href='/en/our-firm/news-and-deals/news/2017/linklaters-to-expand-private-equity-practice-with-appointment-of-christopher-kellett']/h4")).size();
		if (size == 0) {
			System.out.println("Article is removed.");
		}
		else {
			System.out.print("Article is still present");
		}
	}

}

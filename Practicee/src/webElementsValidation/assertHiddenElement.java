package webElementsValidation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assertHiddenElement {

	public static void main(String[] args) {
		/* Step 1. Verify the article is displayed
		 * Step 2. Enter text into search input box
		 * Step 3. Verify that the insights articl has been hidden
		 * Step 4. Remove text from input box
		 * Step 5. Verify the article reappears
		 */
		
		System.setProperty("webdriver.chrome.driver", "c:\\Eclipse\\Webdrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/");
		
		//step 1. Verify the article is displayed

		System.out.println("Before any text is entered into search box.");
		System.out.println(driver.findElement(By.cssSelector("img[src='https://gos3.ibcdn.com/a7c69644a24511e6abc802bf5ac07431.jpg']")).isDisplayed());
		
		//image takes to long to appear.  Come back after the wait until lessons
		
		//step 2. Enter text into the search input box
		System.out.println("Entering text into search box.");
		driver.findElement(By.cssSelector("")).sendKeys("Madrid");
		
		/*step 3. Verify the insights articl (text) has been hidden
		 * isdisplayed will not work here.  Could be because site removes the article rather than hiding?
		 */
		System.out.println("After text is entered into search box.");

	}

}

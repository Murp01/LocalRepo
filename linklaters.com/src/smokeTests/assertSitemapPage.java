package smokeTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assertSitemapPage {

	public static void main(String[] args) {
		/*	Step 1. locate footer section
		 *	Step 2. loop through all footer links
		 * 	Step 3. when loop finds 'sitemap' click on link
		 *  Step 4. Assert Sitemap page opens by title name
		 *  Step 5. Count the links on sitemap page
		 *  Step 6. Print each link name
		 *  Step 7. Advanced - click on each link and assert the opened page.
		 *  		Assert by the URL also
		 */
		
		System.setProperty("webdriver.chrome.driver", "c:\\Eclipse\\Webdrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://lpslive.linklaters.com");
		
		String beforeClickingTitle = null;
		String afterClickingNew;
				
		/* globalFooter variable limits the scope of the page to that particular element (footer)
		 * this can then be used as an object with its own methods (type object, and type '.' for methods
		 */
		WebElement globalFooter = driver.findElement(By.xpath("//div[@class='footerBottom']"));
		
		// the footerSize variable will find each element in the footer (a) and hold the amount (size)
		int footerSize = (globalFooter.findElements(By.tagName("a")).size());
				
		/* The for loop below uses the footerSize variable to find the count of links within the footer
		 * and then will repeat the command within the braces until the i iteration is not below > 
		 * the size of the footerSize integer variable.  The system out method will use the i interger
		 * to find the order of each footer element, and will sequence through them through the loop
		 * The getText method will find the text string that is displayed on the page from xpath..
		 */
		for (int i=0; i < footerSize; i++) {
			
			System.out.println(globalFooter.findElements(By.tagName("a")).get(i).getText());
			
			/* if condition will use 'contains' method to compare current iteration element with
			 * the string 'sitemap'.  If there is a match it will carry out statement in curly
			 * bracket and click on current element.  Need to break out after so it doesn't try 
			 * to print rest of footer and fail 
			 */
			if (globalFooter.findElements(By.tagName("a")).get(i).getText().contains("Sitemap")) {
				
				//	Get title of page before clicking on sitemap.
				beforeClickingTitle = driver.getTitle();
				System.out.println("Before clicking on the link the title is '" + 
				beforeClickingTitle + "'");
				
				globalFooter.findElements(By.tagName("a")).get(i).click();
				
				/*	break command will break out all loops.  This includes the parent 'for' loop.
				 * 	break is used if for example you don't want to go through all links on the page
				 * 	If you want to return to page and go through all loops, use ...
				 */
				break;
				
			}
						
		}
		
		// grabs title after clicking on link
		afterClickingNew = driver.getTitle();
		System.out.println("After clicking on the link the title is '" + afterClickingNew + "'");
		
		// if the title before clicking is 'not' the same as the title after clicking print success
		if (beforeClickingTitle != afterClickingNew) {
			
			Boolean titleDisplayed = driver.findElement(By.xpath("//h1[text()='Sitemap']")).isDisplayed();
			if (titleDisplayed == true) {
			System.out.println("SUCCESS");
			}

		}
		else {
			
			System.out.println("FAIL");
		}
		
		driver.close();
	
	}

}

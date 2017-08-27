package automateWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class countLinksOnWebpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "c:\\Eclipse\\Webdrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://lpslive.linklaters.com");
		
		System.out.println("Amount of links on the homepage ");
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		
		// The below code will count the links within the global footer
		System.out.println("The amount of links in the footer section of the page");
		
		/* globalFooter variable limits the scope of the page to that particular element (footer)
		 * this can then be used as an object with its own methods (type object, and type '.' for methods
		 */
		WebElement globalFooter = driver.findElement(By.xpath("//div[@class='footerBottom']"));
		
		// the footerSize variable will find each element in the footer (a) and hold the amount (size)
		int footerSize = (globalFooter.findElements(By.tagName("a")).size());
		
		System.out.println(footerSize);
		
		
		/* The for loop below uses the footerSize variable to find the count of links within the footer
		 * and then will repeat the command within the braces until the i iteration is not below > 
		 * the size of the footerSize integer variable.  The system out method will use the i interger
		 * to find the order of each footer element, and will sequence through them through the loop
		 * The getText method will find the text string that is displayed on the page from xpath..
		 */
		for (int i=0; i < footerSize; i++) {
			
			System.out.println(globalFooter.findElements(By.tagName("a")).get(i).getText());
						
		}
		
		
		
		

		
		

	}

}

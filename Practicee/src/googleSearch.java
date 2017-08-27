import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class googleSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		//The object 'driver' now holds all the capabilities of the webdriver
		
		driver.get("https://www.google.com");
		/*'Type driver.' now you can see that driver has all the methods of the
		 * firefox webdriver
		 */
	}

}

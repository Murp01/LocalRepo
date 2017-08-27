package automateWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicRadioButtonSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse\\Webdrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		
		//creates a variable called 'count'.  'count' captures how many group1 elements are on page (e.g. 3)
		int count = driver.findElements(By.xpath("//input[@name='group1']")).size();
		
		/*for loop that will click each 'count' occurance. Variable 'i' is created and starts at '0'.  Each
		 * passing iteration will add one until variable 'i' number reaches variable 'count'.  The .get(i).click
		 * will pass the 'i' iteration count variable into its parameters and click on each one until the loop 
		 * closes.
		 */
		for (int i = 0; i < count; i++) {
			
			driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
		}
			
			
			

	}

}

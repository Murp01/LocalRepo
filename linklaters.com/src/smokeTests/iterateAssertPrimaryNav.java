package smokeTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iterateAssertPrimaryNav {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse\\Webdrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://lpslive.linklaters.com");
		
		//The below variable will contain the amount of child elements within the 'header_navdesktop' class
		int count = driver.findElements(By.xpath("//div[@class='header__navDesktop']/ul/child::*")).size();
		
		//prints the contents of the variable which contains the amount of child elements.
		System.out.println(count);
		
		/*for loop which will use the count variable and a iteration variable to cycle through each element
		 * while clicking on them
		 */
		for (int i = 0; i < count; i++) {
			driver.findElements(By.xpath("//div[@class='header__navDesktop']/ul/child::*")).get(i).click();
		}
	
		driver.close();
		
		
		//finish this by inserting 'assert' code for each url after each click iteration

	}

}

package forms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class contactUsFormE2E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse\\Webdrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://lpslive.linklaters.com");
		
		//Finding element by css selector.  Note: the path does not register is firebug firepath
		driver.findElement(By.cssSelector("a[href='/en/our-firm']")).click();
		
		//Clicking on element when knowing the class name using .classname
		driver.findElement(By.cssSelector(".icon-envelope.listCta__img")).click();
		
		driver.close();

	}

}

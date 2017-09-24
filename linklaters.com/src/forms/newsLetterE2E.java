package forms;

// import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
// import org.openqa.selenium.support.ui.ExpectedConditions;
// import org.openqa.selenium.support.ui.WebDriverWait;

public class newsLetterE2E {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://lpslive.linklaters.com");
		
		//Creating an Actions object called a.  By adding driver in parameters a also has driver methods
		Actions a = new Actions(driver);
		
		// WebDriverWait d = new WebDriverWait(driver, 20);
		
		a.moveToElement(driver.findElement(By.cssSelector("a[href='/en/our-firm']")))
		.moveToElement(driver.findElement(By.xpath("//a[text()='News and Deals']"))).click().build().perform();
		
		// 
		
		// d.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//a[text()='News and Deals']")));
		// d.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("//nav[@class='is-active']"));
		
		//driver.findElement(By.xpath("//a[text()='News and Deals']")).click();
		
		
		/*does this fail because it is being clicked on before the element actually appears on-screen?
		 * Maybe a sleep.thread java function as it will wait before clicking element?
		 * error says out of viewport which means something is not in view.  Usually means scroll down 
		 * but I think this is different.
		 */
		//a.click(driver.findElement(By.xpath("//a[text()='News and Deals']"))).perform();
		
		
		//This worked and now it wont
		//a.click(driver.findElement(By.xpath("html/body/nav/div/div[6]/ul[4]/li/a"))).perform();
		

		
		/*improvements
		 * Instead of selecting 'our firm' then finding news article, hover over our firm and select
		 * newsletter 
		 * href to news and deals is not unique.
		 */
	}

}

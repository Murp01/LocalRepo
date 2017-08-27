package automateWebElements;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "c:\\Eclipse\\Webdrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.path2usa.com/travel-companions");
		
		driver.findElement(By.xpath("//input[@id='travel_date']")).click();
		
		/*	First step is identifying the months uniquely.  Sometimes when you select the month changer
		 * 	in the calendar it will show multiple xpaths identifying it.  Needs to be unique.  Because
		 * date wasn't unique I had traversed back to parent node 
		 *	after finding unique month we extract the text so we can compare it in while loop
		 */
		while (!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']"))
		.getText().contains("April")) {
			
			/*	While condition is not true - while attribute can not be found on page, continue
			 * 	once the while condition is met the program will exit the loop.
			 */
			driver.findElement(By.cssSelector("[class='datepicker-days'] [class='next']")).click();
			
		}
		
		/* best use css next to find the class name of the days within the calendar.  For example on this
		 * website, each date shares the class name 'day'.  We will then be locating all the location and 
		 * gathering the list into a webelement.  Started this by creating webelement.  Due to it being
		 * a list it was an errors.  I hovered over element and selecte add LIST<WebElement>.
		 * Each website will have different common attributes shared between all dates.  These won't 
		 * necessarily be the class attribute.
		 */
		//	List<WebElement> dates = driver.findElements(By.className("day"));
		
		/* I now need to create a for loop that will iterated through a count the length of the size of
		 * the date list
		 */		
		int dateCount = driver.findElements(By.className("day")).size();
		
		for (int i = 0; i < dateCount; i++) {
			
			// This variable will get the text of the date that is indexed by .get(i) on each loop iteration
			String dateSelect = driver.findElements(By.className("day")).get(i).getText();
			
			//	If statement first looks in current calendar month for 23, and then clicks when located
			if (dateSelect.equalsIgnoreCase("23")) {
				
				driver.findElements(By.className("day")).get(i).click();
				
				break;
				
			}
			
		}
		

	}

}

package automateWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindPrintSpecificValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse\\Webdrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		
		//The below variable will contain the amount of child elements within the 'header_navdesktop' class
		int count = driver.findElements(By.xpath("//input[@name='group1']")).size();
		
		//prints the contents of the variable which contains the amount of child elements.
		System.out.println(count);
		
		 /*
		  * 
		  */
		for (int i = 0; i < count; i++) {
			
			//need to find a way of finding the element?  href is the only value and this does not pick it up
			System.out.println(driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value"));
			
			String text = driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
			
			//text == ("Cheese") did not work.  Had to use text.equals("Cheese") instead
			if (text.equals("Cheese")) {
				driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();				
			}
			
		}
		
		//driver.close();

	}

}

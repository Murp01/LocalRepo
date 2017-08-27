package automateWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaAlertClose {

	public static void main(String[] args) {
		/* To test the if else statement, if the text within the java alert is equal the window 
		 * will close.  If the text is not equal the window will remain open.  Just edit the text 
		 * to be incorrect to check else statement.  The selenium team have created the switchto 'class
		 * to deal with java pop up boxes
		 */
		
		
		
		System.setProperty("webdriver.chrome.driver", "c:\\Eclipse\\Webdrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		
		//finds button on website that will open the java alert window
		driver.findElement(By.xpath("//input[@value='Confirmation Alert']")).click();
		
		//driver uses switch to method and gettext to confirm text
		System.out.println(driver.switchTo().alert().getText());
		String text = driver.switchTo().alert().getText();
		
		//if the variable text contains the string, then accept
		if (text.equals("Are you sure you want to give us the deed to your house?")) {
				
		//driver then uses switchto class that points to .alert (java alert window), and then .accept()
		driver.switchTo().alert().accept();	
		driver.close();
		}
		
		else {
			driver.switchTo().alert().dismiss();
		}

	}

}

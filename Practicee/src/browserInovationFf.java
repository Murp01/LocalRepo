import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browserInovationFf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*try and add the directory from eclipse directory.  Once geckodrive.exe has been
		 * ran once it will be set up on your local machine.  This never has to be used
		 * again.  Hence why the below step has been commented out now and the webdriver 
		 * object can be used again
		 */
		//System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://google.com");
	}

}

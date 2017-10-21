package comNGFramework;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Practice10_InheritanceExtends extends  Practice09_InheritanceTestBase {
	public WebDriver driver;
	
	@Test
	public void openBrowser() throws IOException
	{
		login();
		clickAllFooters();
	}
	
	/*	This class inherits from the prac9_inherit class.  This means that it can use any of the methods 
	 * 	created in the class.  After typing the name for the login class an error occurred when highlighting the
	 * 	the red error line, I selected throws ioexception.  The login method can now be used on any other class
	 * 	I just need to add extends to the main class.
	 */

}

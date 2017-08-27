package comNGFramework;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Practice02_Annotations {
	
	
	@BeforeSuite
	private void installSoftware()
	{
		System.out.println("@Before Suite: Install software before any of the classes/tests are ran.");
	}
	
	@AfterSuite
	private void removeSoftware()
	{
		System.out.println("Uninstall Software");
	}

}

package comNGFramework;

import org.testng.annotations.Test;

public class Practice03_DependencyAnnotations {
	
	/*	This class shows how you add dependency attributes.  When a test fails that is a dependency for another
	 * 	the dependent test is failed instantly and not ran.
	 */
	
	@Test
	public void openBrowser()
	{
		System.out.println("Test1: Open the web browser");
	}
	
	@Test (dependsOnMethods={"openBrowser"}, alwaysRun=true)
	public void openTravelWebsite()
	{
		System.out.println("Open 'https://www.path2usa.com/'");
	}
	
	/* This attribute will disable the method so it won't be ran with the other tests. This is useful for 
	 * known issues that you choose to ignore
	 */
	
	@Test (enabled=false)
	public void knowIssueIgnore()
	{
		System.out.println("This is a known issue.  Disabled for the test run.");
	}
	
	@Test (timeOut=55000) //	This timeout is for 55 seconds I think (milliseconds)
	private void timeOutAttribute()
	{
		System.out.println("Timeout attribute during test while job is processing");
	}

}

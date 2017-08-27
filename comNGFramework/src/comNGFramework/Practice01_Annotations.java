package comNGFramework;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Practice01_Annotations {
	
	@BeforeTest
	public void preReq()
	{
		System.out.println("@BeforeTest: Delete cookies before execution");
	}
	
	@AfterTest
	public void delCookiesCloseBrowser()
	{
		System.out.println("@AfterTest: Delete Cookies and close browser");
	}

	@BeforeMethod
	public void userGeneratedID()
	{
		System.out.println("@BeforeMethod: Username/password added.");
	}	
	
	@AfterMethod
	public void postMethodResult()
	{
		System.out.println("@AfterMethod: This method is carried out after each method is carried out.");
	}
	
	@Test
	//Then define a method
	public void openingBrowser()
	{
		System.out.println("@Test: First test ran");
	}
	
	//	Add second test to be ran
	@Test
	public void printErrorMessage()
	{
		System.out.println("@Test: second test ran");
	}
	
	
	
	
}

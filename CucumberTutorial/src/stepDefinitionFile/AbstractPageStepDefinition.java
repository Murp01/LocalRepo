package stepDefinitionFile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AbstractPageStepDefinition {

	protected static WebDriver driver;
	
	
	protected WebDriver getDriver()	//can I add the select webdriver method here instead?
	{
		if (driver == null)
		{
			driver = new ChromeDriver();
		}
		return driver;
	}
	
	
}

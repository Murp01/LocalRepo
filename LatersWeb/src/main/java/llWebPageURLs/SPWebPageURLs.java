package llWebPageURLs;

import org.openqa.selenium.WebDriver;

public class SPWebPageURLs {
	
	WebDriver driver;
	public SPWebPageURLs(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	String FRHomePageURL = "https://lpslive.linklaters.com/fr-fr/locations/france";
	
	public String FRHomePageURL()
	{
		return FRHomePageURL;
	}

}

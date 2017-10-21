package llWebPageURLs;

import org.openqa.selenium.WebDriver;

public class FRWebPageURLs {
	
	WebDriver driver;
	public FRWebPageURLs(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	String FRHomePageURL = "https://lpslive.linklaters.com/fr-fr/locations/france";
	
	public String FRHomePageURL()
	{
		return FRHomePageURL;
	}

}

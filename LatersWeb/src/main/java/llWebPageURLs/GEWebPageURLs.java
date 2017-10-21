package llWebPageURLs;

import org.openqa.selenium.WebDriver;

public class GEWebPageURLs {
	
	WebDriver driver;
	public GEWebPageURLs(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	String FRHomePageURL = "https://lpslive.linklaters.com/fr-fr/locations/france";
	
	public String FRHomePageURL()
	{
		return FRHomePageURL;
	}

}

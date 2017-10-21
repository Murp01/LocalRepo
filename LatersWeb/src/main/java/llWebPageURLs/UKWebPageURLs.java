package llWebPageURLs;

import org.openqa.selenium.WebDriver;

public class UKWebPageURLs {
	
	WebDriver driver;
	public UKWebPageURLs (WebDriver driver)
	{
		this.driver = driver;
	}
	
	String UKhomePageURL = "https://lpslive.linklaters.com/";
	
	public String homePageURL()
	{
		return UKhomePageURL;	
	}

}

package homepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import llWebPageURLs.FRWebPageURLs;
import llWebPageURLs.UKWebPageURLs;
import pageObjectModels.HomePagePOM;

public class HPPOM_LocalOfficeWidget {
	
	@Test
	public void searchLowerCase()
	{
		System.setProperty("webdriver.chrome.driver", "c:\\Eclipse\\Webdrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//driver.get("https://lpslive.linklaters.com/");
		HomePagePOM homeP = new HomePagePOM(driver);
		UKWebPageURLs ukURL = new UKWebPageURLs(driver);
		FRWebPageURLs frURL = new FRWebPageURLs(driver);
		

		driver.get(ukURL.homePageURL());
		homeP.searchIcon().click();
		homeP.searchBar().click();
		homeP.searchBox().sendKeys("about us");
		driver.close();
	}
	
	//@Test
	public void searchLowerCapitial()
	{
		System.setProperty("webdriver.chrome.driver", "c:\\Eclipse\\Webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://lpslive.linklaters.com/");
		HomePagePOM homeP = new HomePagePOM(driver);
		homeP.searchIcon().click();
		homeP.searchBar().click();
		homeP.searchBox().sendKeys("ABOUT US");
		driver.close();
	}
	
	@Test
	public void openFranceLocation()
	{
		System.setProperty("webdriver.chrome.driver", "c:\\Eclipse\\Webdrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		FRWebPageURLs frURL = new FRWebPageURLs(driver);
		

		driver.get(frURL.FRHomePageURL());

	}


}

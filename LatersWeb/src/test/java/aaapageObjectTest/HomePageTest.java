package aaapageObjectTest;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageObjectModels.AboutUsPOM;
import pageObjectModels.HomePagePOM;

public class HomePageTest {
	
	
	@Test
	public void OpenAndSearch()
	{
		System.setProperty("webdriver.chrome.driver", "c:\\Eclipse\\Webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://lpslive.linklaters.com/");
		HomePagePOM homeP = new HomePagePOM(driver);
		AboutUsPOM aboutP = new AboutUsPOM(driver);
		homeP.searchIcon().click();
		homeP.searchBar().click();
		homeP.searchBox().sendKeys("about us");
		homeP.searchIcon().click();
		homeP.aboutUsTitle().click();
		aboutP.Accordian02().click();
		aboutP.AboutUsHomeLogo().click();
	}
	


}

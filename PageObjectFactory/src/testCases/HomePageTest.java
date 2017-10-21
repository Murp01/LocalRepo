package testCases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectRepository.HomePagePOF;

public class HomePageTest {
	
	
	@Test
	public void OpenAndSearch()
	{
		System.setProperty("webdriver.chrome.driver", "c:\\Eclipse\\Webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HomePagePOF homePOF = new HomePagePOF(driver);
		driver.get(homePOF.homePageURL());		
		homePOF.searchIcon().click();
		homePOF.searchBar().click();
		homePOF.searchBox().sendKeys("about us");
		homePOF.searchIcon().click();
		homePOF.aboutUsTitle().click();
		

	}

}

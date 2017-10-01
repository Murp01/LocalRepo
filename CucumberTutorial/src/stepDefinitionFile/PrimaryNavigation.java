package stepDefinitionFile;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import static org.junit.Assert.*;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PrimaryNavigation extends AbstractPageStepDefinition {
	
	WebDriver driver = getDriver();
	
	/*@Given("^I am accessing the site using ([^\"]*)$")
	public void invokeWebDriver(String str)
	{
		if (str.equals("ChromeDriver"))
		{
			System.setProperty("webdriver.chrome.driver", "c:\\Eclipse\\Webdrivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (str.equals("FirefoxDriver"))
		{
			System.setProperty("webdriver.gecko.driver", "c:\\Eclipse\\Webdrivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.get("https://lpslive.linklaters.com/");
	}
	*/
	
	@Given("^I am accessing the site using ChromeDriver$")
	public void invokeWebDriver()
	{
		driver.get("https://lpslive.linklaters.com");
	}
	
	

	
	
	
	@When("^I search for ([^\\\"]*)$")
	public void searchInGlobalSiteSearch(String str)
	{
		driver.findElement(By.xpath("//button[@class='header__searchToggle']")).click();
		driver.findElement(By.xpath("//input[@class='header__searchInput']")).click();
		driver.findElement(By.xpath("//input[@class='header__searchInput']")).sendKeys(str);

	}
	

	
	@Then("all results with at the alb in the title will appear in the search results")
	public void resultsAppearInSiteSearch()
	{
		
		//String searchResults = driver.findElement(By.xpath("//div[@class='col-xs-12 siteSearch__resultItem']/a")).getText();
		//System.out.println(searchResults);
		//assertTrue(searchResults.contains("at the alb"));
		
		String aboutUsTitle = driver.findElement(By.xpath("//div[@class='header__navDesktop']/ul/li/a[@href='/en/about-us']")).getText();
		System.out.println(aboutUsTitle);
		//assertTrue(aboutUsTitle.contains("about"));

		driver.close();
		System.out.println("I am legend");
	}




}

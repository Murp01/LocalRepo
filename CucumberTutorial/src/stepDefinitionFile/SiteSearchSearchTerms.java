package stepDefinitionFile;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SiteSearchSearchTerms {
	public WebDriver driver;
	
	
	@Given("^I am accessing the site using ([^\"]*)$")
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
	
	
	
	@When("^I search for ([^\\\"]*)$")
	public void searchInGlobalSiteSearch(String str)
	{
		driver.findElement(By.xpath("//button[@class='header__searchToggle']")).click();
		driver.findElement(By.xpath("//input[@class='header__searchInput']")).click();
		driver.findElement(By.xpath("//input[@class='header__searchInput']")).sendKeys(str);
	}
	
	
	
	@Then("the article will appear in the search results")
	public void resultsAppearInSiteSearch()
	{
		driver.close();
		System.out.println("I am legend");
	}

}

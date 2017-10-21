package featureFiles;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class TempStepDefinition {
	
	WebDriver driver = null;
	
	
	@Given("^The user is on the Linklaters\\.com homepage$")
	public void openOnLinksHomePage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "c:\\Eclipse\\Webdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://lpslive.linklaters.com");
	}
	

	@When("^Clicking on the first link within the banner$")
	public void clickOnFirstBannerLink() throws Throwable {
		//driver.findElement(By.xpath("//div[@class='col-sm-5']/div[1]/a")).click();
	}
	
	
	@When("^Clicking on the \"([^\"]*)\" link in the primary navigation$")
	public void shouldClickOnLinkParameters(String link) throws Throwable {
		switch(link) {
		case "About Us":
			driver.findElement(By.xpath("//a[@href='/en/about-us'][1]")).click();
			break;
		case "Client Services":
			driver.findElement(By.xpath("//a[@href='/en/client-services'][1]")).click();
			break;
		case "Sectors":
			driver.findElement(By.xpath("//a[@href='/en/sectors'][1]")).click();
			break;
		case "Find a Lawyer":
			driver.findElement(By.xpath("//a[@href='/en/find-a-lawyer'][1]")).click();
			break;
		case "Locations":
			driver.findElement(By.xpath("//a[@href='/en/locations'][1]")).click();
			break;
		case "Insights":
			driver.findElement(By.xpath("//a[@href='/en/insights'][1]")).click();
			break;
		case "Careers":
			driver.findElement(By.xpath("//a[@href='/en/careers'][1]")).click();
			break;	
		}
	}
	
	
	@Then("^Assert that the url contains \"([^\"]*)\"$")
	public void assertTitleContainsParameter(String title) throws Throwable {
		Assert.assertTrue(driver.getTitle().contains(title));
		
	}
	

	@When("^Clicking on the ([^\"]*) link in the primary navigation DT$")
	public void clickingAllLinksInPrimaryNav(String Link) throws Throwable {	
		switch(Link) {
		case "About Us":
			driver.findElement(By.xpath("//a[@href='/en/about-us'][1]")).click();
			break;
		case "Client Services":
			driver.findElement(By.xpath("//a[@href='/en/client-services'][1]")).click();
			break;
		case "Sectors":
			driver.findElement(By.xpath("//a[@href='/en/sectors'][1]")).click();
			break;
		case "Find a Lawyer":
			driver.findElement(By.xpath("//a[@href='/en/find-a-lawyer'][1]")).click();
			break;
		case "Locations":
			driver.findElement(By.xpath("//a[@href='/en/locations'][1]")).click();
			break;
		case "Insights":
			driver.findElement(By.xpath("//a[@href='/en/insights'][1]")).click();
			break;
		case "Careers":
			driver.findElement(By.xpath("//a[@href='/en/careers'][1]")).click();
			break;			
		}
	}

	
	@Then("^Assert that the url contains ([^\"]*) DT$")
	public void assertAllTitlesPrimaryNav(String Title) throws Throwable {		
		Assert.assertTrue(driver.getTitle().contains(Title));		
	}


	@Then("^I close the web page$")
	public void closeBrowser() throws Throwable {
		driver.close();
	}
}

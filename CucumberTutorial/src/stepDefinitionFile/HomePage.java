package stepDefinitionFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;




public class HomePage extends AbstractPageStepDefinition{
	
	WebDriver driver = getDriver();
	
	
	@When("^I click on Load More from the featured content widget$")
	public void featuredContentLoadMoreButton()
	{
		driver.findElement(By.xpath("//a[@href='/en/about-us']")).click();
		
	}
	
	
	@When("^I click on each main title from the primary navigation$")
	public void clickEachPrimaryNavTitle()
	{
		/*int count = driver.findElements(By.xpath("//div[@class='header__navDesktop']/ul/child::*")).size();
		System.out.println(count);
		for (int i = 0; i < count; i++) {
			driver.findElements(By.xpath("//div[@class='header__navDesktop']/ul/child::*")).get(i).click();
		}	
		*/
		System.out.println("Success");  //this works so why doesn't method?
	}
	
	

	
	
	@Then("more articles will be displayed below")
	public void moreArticlesAppearBelow() 
	{
		
	}


}

package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePagePOM {
	
	
	
	WebDriver driver;
	public HomePagePOM(WebDriver driver)
	{
		this.driver = driver;
	}
	
	//locator can also be name or another tag
	String homePageURL = "https://lpslive.linklaters.com/";
	By LinklatersLogo = By.xpath("//a[@class='header__brand']");
	By aboutUsTitle = By.xpath("//a[@href='/en/about-us'][1]");
	By searchBar = By.xpath("//input[@class='header__searchInput']");
	By searchbox = By.xpath("//input[@class='header__searchInput']");
	By searchIcon = By.xpath("//button[@class='header__searchToggle']");

	
	public String homePageURL()
	{
		return homePageURL;	
	}
	
	public WebElement searchBox()
	{
		return driver.findElement(searchbox);
	}
	
	public WebElement searchBar()
	{
		return driver.findElement(searchBar);
	}
	
	public WebElement searchIcon()
	{
		return driver.findElement(searchIcon);
	}
	
	public WebElement LinklatersLogo()
	{
		return driver.findElement(LinklatersLogo);
	}
	
	public WebElement aboutUsTitle()
	{
		return driver.findElement(aboutUsTitle);
	}
	
	
	

}

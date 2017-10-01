package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePOF {
	
	
	
	WebDriver driver;
	public HomePagePOF(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	String homePageURL = "https://lpslive.linklaters.com/";
	
	@FindBy(xpath="//a[@class='header__brand']")
	WebElement LinklatersLogo;
	
	@FindBy(xpath="//a[@href='/en/about-us'][1]")
	WebElement aboutUsTitle;
	
	@FindBy(xpath="//input[@class='header__searchInput']")
	WebElement searchBar;
	
	@FindBy(xpath="//input[@class='header__searchInput']")
	WebElement searchbox;
	
	@FindBy(xpath="//button[@class='header__searchToggle']")
	WebElement searchIcon;

	
	public String homePageURL()
	{
		return homePageURL;	
	}
	
	public WebElement searchBox()
	{
		return searchbox;
	}
	
	public WebElement searchBar()
	{
		return searchBar;
	}
	
	public WebElement searchIcon()
	{
		return searchIcon;
	}
	
	public WebElement LinklatersLogo()
	{
		return LinklatersLogo;
	}
	
	public WebElement aboutUsTitle()
	{
		return aboutUsTitle;
	}
	
	
	

}

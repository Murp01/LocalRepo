package pageObjectModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AboutUsPOM {
	
	WebDriver driver;
	public AboutUsPOM(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By AboutUsHomeLogo = By.xpath("//a[@class='header__brand']");
	By Accordian01 = By.xpath("//h2[@id='ui-id-1']");
	By Accordian02 = By.xpath("//h2[@id='ui-id-3']");
	By ContactUsWidget = By.xpath("span[@class='listCta__subtitle listCta__subtitle--topBottom listCta__subtitle--font20']");
	
	public WebElement AboutUsHomeLogo()
	{
		return driver.findElement(AboutUsHomeLogo);
	}
	
	public WebElement Accordian01()
	{
		return driver.findElement(Accordian01);
	}
	
	public WebElement Accordian02()
	{
		return driver.findElement(Accordian02);
	}
	
	public WebElement ContactUsWidget()
	{
		return driver.findElement(ContactUsWidget);
	}

}

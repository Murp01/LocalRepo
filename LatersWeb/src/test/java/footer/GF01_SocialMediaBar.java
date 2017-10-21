package footer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class GF01_SocialMediaBar {
	
	public WebDriver driver;
	
	@Test
	public void openSocialMedia()
	{
		int count = driver.findElements(By.xpath("//div[@class='footerTop__social']/a")).size();		
		System.out.println(count);		
		for (int i = 0; i < count; i++) {			
			driver.findElements(By.xpath("//div[@class='footerTop__social']/a")).get(i).click();
			//	I need to find a way to close all other browser tabs
		}
	}
	


}

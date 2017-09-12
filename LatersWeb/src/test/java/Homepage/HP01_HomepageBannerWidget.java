package homepage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HP01_HomepageBannerWidget {
	
	public WebDriver driver;
	public String dataPropertyLocation = "C:\\Users\\Paul\\eclipse-workspace\\LatersWeb\\src\\test\\java\\homepage\\DataDrivenPropertiesHomePage";
	public Properties prop = new Properties();
	
	
	@BeforeTest
	public void invokeChromeDriver()
	{
		System.setProperty("webdriver.chrome.driver", "c:\\Eclipse\\Webdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://lpslive.linklaters.com");
	}
	
	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}
	
	
	
	@Test
	public void countAndClickTopicsSlides() throws IOException	
	{
		FileInputStream fis = new FileInputStream(dataPropertyLocation);  //can this be done globally?
		prop.load(fis);
		
		int counter = driver.findElements(By.xpath(prop.getProperty("topicCount"))).size();
		System.out.println(counter);
		
		
		for (int i = 1; i < counter + 1; ++i)
		{
			driver.findElement(By.xpath(prop.getProperty("topicCount") + "[" + i + "]")).click();
		}
		
		/*
		 * is there a more elegant way to do the for loop?  I have had to start the i at 1 because [1]
		 * is the first topic in the list.  Due to this I have had to + 1 to the counter.
		 * Next step is to assert a new slide has appeared.  Uness there is a way to check each new topic 
		 * opens a new background this test is pretty redundant
		 */
	}
	
	
	@Test
	public void clickAllSlidersInEachTopic() throws IOException	
	{
		FileInputStream fis = new FileInputStream(dataPropertyLocation);  //can this be done globally?
		prop.load(fis);
		
		int counter = driver.findElements(By.xpath(prop.getProperty("topicCount"))).size();
		System.out.println(counter);
		
		
		for (int i = 1; i < counter + 1; ++i)
		{
			driver.findElement(By.xpath(prop.getProperty("topicCount") + "[" + i + "]")).click();
			if (driver.findElements(By.xpath(prop.getProperty("topicSlides"))).size() !=0)	//if topic contains any sides then count slides and click on each one
			{
				int slideCount = driver.findElements(By.xpath(prop.getProperty("topicSlideClick"))).size(); //finding 5 in each topic
				System.out.println("There are " + slideCount + " Slides in this topic");
			}
			
			/*
			 * It is very difficult to single out just the slides within the current topic.  TBC
			 */
		}
		

	}
	
	
	
	
	
	
	
	/*
	 * •	Contains up to 5 topics of content. Each topic can have up to 3 slides of content
o	Users can navigate between each topic using tabs at the bottom of the banner
o	Users can navigate between each slide within a topic by using functionality within the banner or the ar-rows at the sides of the banner
•	Per slide of content within a topic:
o	Image
o	Optional title
o	Optional description text
o	Optional opacity overlay
o	Optional CTA button:
	Text/ label
	Button destination link

	 */
	
	

}

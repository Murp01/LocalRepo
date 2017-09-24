package xPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class shortcutNewsletterForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse\\Webdrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://lpslive.linklaters.com/en/our-firm/news-and-deals");
		
		driver.findElement(By.xpath("//*[text()='Sign up for Newsletters']")).click();
		
		//Click on the publications article checkbox(this is attached to the label)
		driver.findElement(By.cssSelector("label[for='Publications']")).click();
		//System.out.println(driver.findElement(By.cssSelector("label[for='Publications']")).isSelected()); 
		
		//Click continue
		driver.findElement(By.xpath("//span[text()='Continue']")).click();
				
		//Click drop down box and select index item 1
		Select s = new Select(driver.findElement(By.cssSelector("#wffm690d526a236f4b90ba9e8ed53fe4abcc_Sections_1__Fields_0__Value")));
		s.selectByIndex(1);
		
		//Enter first name
		driver.findElement(By.cssSelector("#wffm690d526a236f4b90ba9e8ed53fe4abcc_Sections_2__Fields_0__Value")).sendKeys("Jack");
		
		//Enter surname
		driver.findElement(By.cssSelector("#wffm690d526a236f4b90ba9e8ed53fe4abcc_Sections_2__Fields_1__Value")).sendKeys("Burton");

		//Enter Job Title/role
		driver.findElement(By.cssSelector("#wffm690d526a236f4b90ba9e8ed53fe4abcc_Sections_3__Fields_0__Value")).sendKeys("Testing");
		
		//Enter Company type
		driver.findElement(By.cssSelector("#wffm690d526a236f4b90ba9e8ed53fe4abcc_Sections_3__Fields_1__Value")).sendKeys("Test");

		//Click Company type drop down box and select index item 1
		Select s1 = new Select(driver.findElement(By.cssSelector("#wffm690d526a236f4b90ba9e8ed53fe4abcc_Sections_4__Fields_0__Value")));
		s1.selectByIndex(1);
				
		//Enter email address
		driver.findElement(By.cssSelector("#wffm690d526a236f4b90ba9e8ed53fe4abcc_Sections_6__Fields_0__Value")).sendKeys("Test@testing.com");
		
		//Enter address 1
		driver.findElement(By.cssSelector("#wffm690d526a236f4b90ba9e8ed53fe4abcc_Sections_6__Fields_1__Value")).sendKeys("17 Testing Road");

		//Enter country
		driver.findElement(By.cssSelector("#wffm690d526a236f4b90ba9e8ed53fe4abcc_Sections_9__Fields_1__Value")).sendKeys("United Kingdom");		
				
		//Click checkbox for remember contact details
		driver.findElement(By.xpath("//label[@for='Remember my contact details so I do not have to re enter them when I next subscribe to a publication']")).click();
		
		//Click checkbox for i would like to receive information
		driver.findElement(By.cssSelector("label[for='I would like to receive relevant information about seminars corporate events and other publications']")).click();
		
		//Click on submit
		driver.findElement(By.xpath("//*[@id='wffm690d526a236f4b90ba9e8ed53fe4abcc']/div[14]/div/div/button[2]")).click();
		
		//Last step is to assert the 'thank you' page.
		
		driver.close();
		
		
		
		

	}

}

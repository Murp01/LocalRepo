package implementingAnnotations;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LL_DataDrivenGetList {
	
	
	public WebDriver driver;
	String InsightsNavLink = 		"//div[@class='row']/div/ul/li[5]/a[@href='/en/insights']";
	String PracticeFilterButton = 	"//div[@class='btn-group bootstrap-select show-tick']/button[@title='Practice']";
	String PracticeAllSelection = 	"//button[@title='Practice']/../select[@name='practice']/option";
	//String PracticeSelIteration =	"//form[@action='']/div/select[@class='selectpicker margin-bottom-10'][@name='practice']/../div/ul/li[";	// iterator and end of xpath in test case
	String PracticeSelIteration =	"//button[@title='Practice']/../div/ul/li[";
	
	String SectorFilterButton =		"//div[@class='btn-group bootstrap-select show-tick']/button[@title='Sector']";
	String SectorAllSelection =		"//button[@title='Sector']/../select[@title='Sector']/option";												//tricky thing switched @name to @tite
	String SectorSelIteration =		"//button[@title='Sector']/../div/ul/li[";

	
	@DataProvider
	public Object [][] FilterPointers()
	{	
		Object[][] data = new Object[2][4];				//	[1] = iterations, [2] = how many parameters are used
		data[0][0] = InsightsNavLink;					//	[0] = 1st iteration, [0] = 1st data parameter
		data[0][1] = PracticeFilterButton;				//	[0] = still first iteration, [1] = 2nd data parameter
		data[0][2] = PracticeAllSelection;				//	[0] = Still first iteration, [2] = 3rd data parameter
		data[0][3] = PracticeSelIteration;				//	[0] = Still first iteration, [3] = 4th data parameter
		
		
		data[1][0] = InsightsNavLink;					//	[0] = 1st iteration, [0] = 1st data parameter
		data[1][1] = SectorFilterButton;				//	[0] = still first iteration, [1] = 2nd data parameter
		data[1][2] = SectorAllSelection;				//	[0] = Still first iteration, [2] = 3rd data parameter
		data[1][3] = SectorSelIteration;				//	[0] = Still first iteration, [3] = 4th data parameter
		
		return data;
	}
	
	@Test (dataProvider = "FilterPointers")
	public void ListAllFilterItems(String LandingPageLink, String FilterLocation, String FilterSelCount, String SelNameList)
	{	
		//	Step 2: Cick on filter option
		driver.findElement(By.xpath(LandingPageLink)).click();
		WebDriverWait d = new WebDriverWait(driver, 20);
		d.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(FilterLocation)));
		driver.findElement(By.xpath(FilterLocation)).click();
		
		//	Step 3: Add all items from filter into a list (using data driven variable to locate items)
		int SelectionCount = driver.findElements(By.xpath(FilterSelCount)).size();
		System.out.println(SelectionCount);
		
		//	3b add items into list
		List<String> list = new ArrayList<String>();
		for (int i = 1; i < SelectionCount; i++)
		{					
			String getThis = driver.findElement(By.xpath(SelNameList + i + "]/a/span")).getAttribute("innerText");
			list.add(getThis);
			System.out.println(getThis);	
		}
		
	}
	
	
	//	Step1:	Open Insights page
	//	Step2:	Click on Practice filter using data driven variable
	//	Step3:	Add all items from filter into a list (using data driven variable to locate items)
	//	Step4:	Print out filter items
	
	
	
	
	
	
	//	Test tear up and down
	@BeforeTest
	public void InvokeWebDriver()
	{
		System.setProperty("webdriver.chrome.driver", "c:\\Eclipse\\Webdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://lpsuat.linklaters.com");
	}
	
	/*
	@AfterTest
	public void TestTearDown()
	{
		driver.close();
	}
	
	*/
	

	
}

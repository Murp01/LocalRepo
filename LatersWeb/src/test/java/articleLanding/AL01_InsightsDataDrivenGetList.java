package articleLanding;

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

public class AL01_InsightsDataDrivenGetList {
	
	
	public WebDriver driver;
	String InsightsNavLink = 			"//div[@class='row']/div/ul/li[5]/a[@href='/en/insights']";
	String PracticePreText =			"Practice Filter Selection count is ";
	String PracticeFilterButton = 		"//div[@class='btn-group bootstrap-select show-tick']/button[@title='Practice']";
	String PracticeAllSelection = 		"//button[@title='Practice']/../select[@name='practice']/option";
	String PracticeSelIteration =		"//button[@title='Practice']/../div/ul/li[";
	
	String SectorPreText =				"Sector Filter Selection count is ";
	String SectorFilterButton =			"//div[@class='btn-group bootstrap-select show-tick']/button[@title='Sector']";
	String SectorAllSelection =			"//button[@title='Sector']/../select[@title='Sector']/option";												//tricky thing switched @name to @tite
	String SectorSelIteration =			"//button[@title='Sector']/../div/ul/li[";
	
	String YearPreText =				"Year Filter Selection count is ";
	String YearFilterButton =			"//button[@title='Year']";
	String YearAllSelection =			"//button[@title='Year']/../select[@title='Year']/option";
	String YearSelIteration =			"//button[@title='Year']/../div/ul/li[";
	
	String MonthPreText =				"Month Filter Selection count is ";
	String MonthFilterButton =			"//button[@title='Month']";
	String MonthAllSelection =			"//button[@title='Month']/../select[@title='Month']/option";
	String MonthSelIteration =			"//button[@title='Month']/../div/ul/li[";
	
	String TypePreText =				"Type Filter Selection count is ";
	String TypeFilterButton =			"//button[@title='Type']";
	String TypeAllSelection =			"//button[@title='Type']/../select[@title='Type']/option";
	String TypeSelIteration =			"//button[@title='Type']/../div/ul/li[";
	
	String JurisdictionPreText =		"Jurisdiction Filter Selection count is ";
	String JurisdictionFilterButton =	"//button[@title='Jurisdiction']";
	String JurisdictionAllSelection =	"//button[@title='Jurisdiction']/../select[@title='Jurisdiction']/option";
	String JurisdictionSelIteration =	"//button[@title='Jurisdiction']/../div/ul/li[";
	
	String InsightsSearchBox =			"//input[@class='string-search']";
	
	String PublicationSearchTerm =		"FCA";
	String PublicationArticleConfirm =	"//div[@class='card__info']"; //advanced work out how many.  Must if condition to load more
	
	String NonsenseString =				"922jsdgug";
	String ConfirmNoResults =			"";	//"//*[contains(text(), 'My Button')]"
	

	
	@DataProvider
	public Object [][] FilterPointers()
	{	
		Object[][] data = new Object[6][5];				//	[1] = iterations, [2] = how many parameters are used
		data[0][0] = InsightsNavLink;					//	[0] = 1st iteration, [0] = 1st data parameter
		data[0][1] = PracticeFilterButton;				//	[0] = still first iteration, [1] = 2nd data parameter
		data[0][2] = PracticeAllSelection;				//	[0] = Still first iteration, [2] = 3rd data parameter
		data[0][3] = PracticeSelIteration;				//	[0] = Still first iteration, [3] = 4th data parameter
		data[0][4] = PracticePreText;
			
		data[1][0] = InsightsNavLink;					
		data[1][1] = SectorFilterButton;				
		data[1][2] = SectorAllSelection;				
		data[1][3] = SectorSelIteration;
		data[1][4] = SectorPreText;
		
		data[2][0] = InsightsNavLink;					
		data[2][1] = YearFilterButton;				
		data[2][2] = YearAllSelection;				
		data[2][3] = YearSelIteration;	
		data[2][3] = YearSelIteration;
		data[2][4] = YearPreText;
		
		data[3][0] = InsightsNavLink;					
		data[3][1] = MonthFilterButton;				
		data[3][2] = MonthAllSelection;				
		data[3][3] = MonthSelIteration;	
		data[3][4] = MonthPreText;
		
		data[4][0] = InsightsNavLink;					
		data[4][1] = TypeFilterButton;				
		data[4][2] = TypeAllSelection;				
		data[4][3] = TypeSelIteration;	
		data[4][4] = TypePreText;
		
		data[5][0] = InsightsNavLink;					
		data[5][1] = JurisdictionFilterButton;				
		data[5][2] = JurisdictionAllSelection;				
		data[5][3] = JurisdictionSelIteration;
		data[5][4] = JurisdictionPreText;
	
		return data;
	}
	
	@Test (dataProvider = "FilterPointers")		//	add an extra sing that will annount "Filter is and has 20 selections"
	public void ListAllFilterItems(String LandingPageLink, String FilterLocation, String FilterSelCount, String SelNameList,
			String PreMessage)
	{	
		//	Step 2: Cick on filter option
		driver.findElement(By.xpath(LandingPageLink)).click();
		WebDriverWait d = new WebDriverWait(driver, 20);
		d.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(FilterLocation)));
		driver.findElement(By.xpath(FilterLocation)).click();
		
		//	Step 3: Add all items from filter into a list (using data driven variable to locate items)
		int SelectionCount = driver.findElements(By.xpath(FilterSelCount)).size();
		System.out.println(PreMessage + SelectionCount);
		
		//	3b add items into list
		List<String> list = new ArrayList<String>();
		for (int i = 1; i < SelectionCount + 1; i++)	//Something wrong with the counter.  I added + 1 as a short term measure (counter hs to start at i=1, instead of i=0?
		{					
			String getThis = driver.findElement(By.xpath(SelNameList + i + "]/a/span")).getAttribute("innerText");
			list.add(getThis);
			System.out.println(getThis);	
		}
		
		//	Step1:	Open Insights page
		//	Step2:	Click on Practice filter using data driven variable
		//	Step3:	Add all items from filter into a list (using data driven variable to locate items)
		//	Step4:	Print out filter items		
	}
	
	@DataProvider
	public Object[][] LandingPageSearchData()
	{
		Object[][] data = new Object[1][3];
		data[0][0] = InsightsNavLink;
		data[0][1] = PublicationSearchTerm;
		data[0][2] = InsightsSearchBox;
		return data;
	}

	
	@Test (dataProvider = "LandingPageSearchData")
	public void LandingPageSearch(String LandingPageLink, String SearchTerm, String InsightsSearchBox)
	{
		driver.findElement(By.xpath(LandingPageLink)).click();
		driver.findElement(By.xpath(InsightsSearchBox)).sendKeys(SearchTerm);
		//	Confirm article first with assertion
		
		driver.findElement(By.xpath(InsightsSearchBox)).clear();
		
	
		//	Step1:	Open Insights page
		//	Step2:	Click in the search button
		//	Step3:	Enter Search term
		//	Step4:	Assert result
		//	Step4:	Non search term no result found test (separate test?)
	}
	
	
	
	
	
	
	//	Test tear up and down
	@BeforeTest
	public void InvokeWebDriver()
	{
		System.setProperty("webdriver.chrome.driver", "c:\\Eclipse\\Webdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://lpsuat.linklaters.com");
	}
	
	
	@AfterTest
	public void TestTearDown()
	{
		driver.close();
	}
	
	

	
}

package comNGFramework;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Practice05_DataDrivenMethod {
	
	public WebDriver driver;
	String practiceDrop = "//div[@class='btn-group bootstrap-select show-tick']/button[@title='Practice']";
	String practiceList = "//button[@title='Practice']/../select[@name='practice']/option";



	
	@Test (dataProvider="countDropItems")
	public void testCountDropMethod(String dDClick, String dDCountSize)
	{
		
		System.out.println("String added into the test case " + dDClick);
		System.out.println("String added into the test case " + dDCountSize);

	}
	
	@DataProvider
	public Object [][] countDropItems()
	{
		//	left is how many time test case iterates,
		//	right is how many parameters are used for each run
		Object [][] data = new Object[3][2];
		
		//	Declare object's values
		data [0][0] = practiceDrop;
		data [0][1] = practiceList;
		
		//	Second run
		data [1][0] = "Second run just a string passed";
		data [1][1] = "First bracket has the iteration number, other is the second parameter";
		
		//	Third iteration
		data [2][0] = "";
		data [2][1] = "";
		return data;
	}
	


/*	Step1: 
 * 	Step2: 
 * 	Step3:
 * 	Step4: 
 * 	Step5: 
 */

	
	

}

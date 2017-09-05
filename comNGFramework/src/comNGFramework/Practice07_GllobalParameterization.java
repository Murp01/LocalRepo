package comNGFramework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Practice07_GllobalParameterization {

	@Test
	public void login() throws IOException 
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Paul\\eclipse-workspace\\comNGFramework\\src\\comNGFramework\\datadriven.properties");
	
		//had to throw declaration again (not instructed anywhere to do so (unike with fileinputstream
		prop.load(fis);
		
		System.out.println(prop.getProperty("username"));
	
	}
	
	
}

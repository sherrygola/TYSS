package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Base implements IAUTOCONSTANTS {

	public static WebDriver driver=null;
	
	static {
		System.setProperty(CHROME_KEY,CHROME_VALUE);
		
	}
	@BeforeMethod
	public void openBrowser() {
		driver=new ChromeDriver();
		driver.get(URL);
	}
	
	@AfterMethod
	public void closeBrowser()
	{
//		driver.close();
	}
	
}

package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Gnr {
	
	public WebDriver driver;
	@BeforeMethod
	public void OpenApplcation()
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver12.exe" );
		 driver =new ChromeDriver();	
		 driver.get("https://opensource-demo.orangehrmlive.com/dashboard/index");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
		
		
	}
	@AfterMethod
	public void closeApplcation()
	{
		driver.close();
	}


}

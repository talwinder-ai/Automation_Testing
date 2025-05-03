package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utils.Log;



public class BaseTest {
	
	protected  WebDriver driver;
	
	@BeforeMethod
	public void setup () {
		Log.info("Webdriver is Starting");
		driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 Log.info("navigating to browser");
		 driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
	}
	@AfterMethod
	public void teardown () {
		if(driver !=null) {
			//driver.quit();
		}
	}
	
	
	
	
	

}

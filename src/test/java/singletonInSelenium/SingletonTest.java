package singletonInSelenium;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SingletonTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		DriverInitialization instance=DriverInitialization.getInstance();
		driver=instance.launchBrowser();
	}
 
	@Test
	public void test() {
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}

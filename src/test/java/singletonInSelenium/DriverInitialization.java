package singletonInSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class DriverInitialization {
	private static DriverInitialization driverInitializationInstance=null; 
	private WebDriver driver;
	
	private DriverInitialization() {
		
	}
	
	public  WebDriver launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:/mytools/chromedriver.exe");
		driver=new ChromeDriver();
		return driver;
	}
	
	public static DriverInitialization getInstance() {
		
		if(driverInitializationInstance==null)
			driverInitializationInstance=new DriverInitialization();
		return driverInitializationInstance;
		
	}

}

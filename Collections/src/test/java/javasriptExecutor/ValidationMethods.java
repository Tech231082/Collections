package javasriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ValidationMethods {
	WebDriver driver;
	public boolean isDisplayedMethod() {
		boolean b=driver.findElement(By.id("username")).isDisplayed();
		return b;
	}
	
	public boolean isEnabledMethod() {
		boolean b=driver.findElement(By.xpath("//a[@class='m-left-1']")).isEnabled();
		return b;
	}
	
	public boolean isSelectedMethod() {
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		boolean b=driver.findElement(By.xpath("//div//label//span[@class='private-checkbox__icon private-checkbox__dash']//svg[@role='presentation']")).isSelected();
		return b;
	}
	
	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver", "C:/mytools/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://app.hubspot.com/login/?_ga=2.266506507.401545528.1569505508-1624782347.1568217989");
		System.out.println(isDisplayedMethod());
		System.out.println(driver.getWindowHandle());
		System.out.println(isEnabledMethod());
		//System.out.println(isSelectedMethod());
	}

}

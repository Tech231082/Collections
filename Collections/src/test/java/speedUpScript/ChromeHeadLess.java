package speedUpScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class ChromeHeadLess {
	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver", "C:/mytools/chromedriver.exe");
		ChromeOptions ops=new ChromeOptions();
		ops.addArguments("headless");;
		
		
		WebDriver driver=new ChromeDriver(ops);
		driver.get("http://wwww.amazon.com");
		System.out.println(driver.getTitle());
	}
	

}

package speedUpScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class HtmlUnitDriverTest {
	@Test
	public void test() {
		//very fast
		//headless
		//not applicable for Actions class
		//also called ghost driver
		//not available in selenium so we need to download htmlunitdriver jar file and add to the build path
		//HtmlUnitDriver is a class implementing WebDriver interface
		
		System.setProperty("webdriver.chrome.driver", "C:/mytools/chromedriver.exe");
		WebDriver driver=new HtmlUnitDriver();
		driver.get("http://wwww.amazon.com");
		System.out.println(driver.getTitle());
	}
	

}

package speedUpScript;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.Test;

public class SpeedUpScript {
	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver", "C:/mytools/chromedriver.exe");
		ChromeOptions op=new ChromeOptions();
		HashMap<String,Object> images=new HashMap<String,Object>();
		images.put("images", 2);
		HashMap<String,Object> prefs=new HashMap<String,Object>();
		prefs.put("profile.default_content_setting_values", images);
		op.setExperimentalOption("prefs", prefs);
		
		WebDriver driver=new ChromeDriver(op);
		driver.get("http://wwww.amazon.com");
		System.out.println(driver.getTitle());
	}
	
	@Test
	public void test1() {
		System.setProperty("webdriver.gecko.driver", "C:/mytools/geckodriver.exe");
		FirefoxOptions op=new FirefoxOptions();
		FirefoxProfile ff=new FirefoxProfile();
		ff.setPreference("permissions.default.image", 2);;
		op.setProfile(ff);
		op.setCapability(FirefoxDriver.PROFILE, ff);
		
		WebDriver driver=new FirefoxDriver(op);
		driver.get("http://wwww.amazon.com");
		System.out.println(driver.getTitle());
		
	}

}

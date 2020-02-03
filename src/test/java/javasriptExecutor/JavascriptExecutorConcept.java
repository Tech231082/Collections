package javasriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JavascriptExecutorConcept {
	WebDriver driver;
	public void generateAlert(WebDriver driver,String message) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("alert('"+message+"')");
	}
	
	public void refreshBrowser(WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("history.go(0)");
	}
	
	public String getTitleByJS(WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String title= js.executeScript("return document.title").toString();
	return title;
		
	}
	
	public String getInnerText(WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String innerText=js.executeScript("return document.documentElement.innerText;").toString();
		return innerText;
	}
	
	public void scrolldown(WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollto(0,document.body.scrollHeight)");
	}
	
	public void scrollToView(WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement element=driver.findElement(By.id("create-first-contact-anchor"));
		js.executeScript("arguments[0].scrollIntoView(true);",element);
	}
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:/mytools/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		
	}
	@Test
	public void test() throws InterruptedException {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		driver.get("https://app.hubspot.com/login/?_ga=2.266506507.401545528.1569505508-1624782347.1568217989");
		
		WebElement email=driver.findElement(By.xpath("//input[@id='username']"));
		email.sendKeys("sush.rinwa@gmail.com");
		js.executeScript("arguments[0].style.border='5px solid red'", email);
		//Thread.sleep(1000);
		WebElement pass=driver.findElement(By.xpath("//input[@id='password']"));
		pass.sendKeys("Sushila231082");
		js.executeScript("arguments[0].style.border='5px solid green'", pass);
		
		//generateAlert(driver,"Border has been drawn");
		
		//Alert alert=driver.switchTo().alert();
		//System.out.println(alert.getText());
		//alert.accept();
		//click on element by js
		WebElement loginButton=driver.findElement(By.xpath("//button[@id='loginBtn']"));
		js.executeScript("arguments[0].click();",loginButton);
		
		//refresh page
		//driver.navigate().refresh();
		//refreshBrowser(driver);
		
		//get title of page by js
		System.out.println(getTitleByJS(driver));
		
		//get inner text of page by js 
		System.out.println(getInnerText(driver));
		
		//scroll down
		//scrolldown(driver);
		//scroll into view 
		//scrollToView(driver);
		
	}
	public void tearDown() {
		//driver.quit();
	}
	

}

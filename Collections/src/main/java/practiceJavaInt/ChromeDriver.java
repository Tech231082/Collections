package practiceJavaInt;

public class ChromeDriver implements WebDriver{
	public ChromeDriver() {
		System.out.println("launch chrome");
	}

	@Override
	public void close() {
		System.out.println("close the browser");
		
	}

	@Override
	public void quit() {
		System.out.println("quit the browser");
		
	}

	@Override
	public void sendKeys() {
		System.out.println("sendKeys");
		
	}

	@Override
	public void get(String url) {
		System.out.println("launch url"+url);
		
	}

}

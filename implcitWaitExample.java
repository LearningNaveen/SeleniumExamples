package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class implcitWaitExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Naveen\\sampleWorkspace\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http:www.google.com");
	}

}

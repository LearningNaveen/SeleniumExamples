package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class explicitWaitExample {

WebDriver driver;	
	
@BeforeTest
public void setup() {
	System.setProperty("webdriver.chrome.driver", "C:\\Naveen\\sampleWorkspace\\Drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://www.yahoo.com");
}

@Test
public void Test1() {
	
	driver.findElement(By.id("uh-signin")).click();	
	System.out.println("Waiting for 10 seconds START");
	WebDriverWait wait = new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"hotspot_main\"]/img")));
	System.out.println("After 10 seconds wait");
	driver.findElement(By.xpath("//*[@id=\"hotspot_main\"]/img")).click();
}

@AfterTest
public void tearDown() {
	driver.quit();
}
	
}

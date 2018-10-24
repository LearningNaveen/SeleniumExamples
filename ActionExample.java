package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeOptions;

public class ActionExample {
	
	WebDriver driver;
	String URL = "http://medialize.github.io//jQuery-contextMenu///demo.html";
	
@BeforeTest
public void setUp() {
	System.setProperty("webdriver.chrome.driver", "C:\\Naveen\\sampleWorkspace\\Drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get(URL);
	driver.manage().window().maximize();
	WebElement elem = driver.findElement(By.xpath("/html/body/div/section"));
	driver.switchTo().frame(elem);
	
}


@Test
public void rightClickTest() {
	By locator = By.xpath("/html/body/div/section/div/div/div/p/span");
	//explict Wait example
	WebDriverWait wait = new WebDriverWait(driver, 25);
	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	WebElement element = driver.findElement(locator);
	rightClick(element);
}

public void rightClick(WebElement element) {
	
try {
	Actions action = new Actions(driver).contextClick(element);
	action.build().perform();
}
catch (Exception e)
{
	
}
	
}

@AfterTest
public void tearDown() {
	driver.quit();
}
	
}

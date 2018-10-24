package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PreCEN_Registration {

	public static void main(String[] args) {
		System.out.println("launching chrome browser");
		System.setProperty("webdriver.chrome.driver", "C:\\Naveen\\sampleWorkspace\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://wwwqa.etis.ford.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"responsive-wrapper\"]/div[3]/div/div/div[2]/div/div/a/p")).click();
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/button[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"licenseCheckBox\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"acceptLicense\"]")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[5]/div/div/div/form/div[3]/div[2]/div[2]/input")).sendKeys("legal797");
		driver.findElement(By.xpath("/html/body/div[4]/div[5]/div/div/div/form/div[3]/div[4]/div[2]/input")).sendKeys("legal797");
		driver.findElement(By.xpath("/html/body/div[4]/div[5]/div/div/div/form/div[3]/div[6]/div[2]/input")).sendKeys("tnaveen2@ford.com");
		WebElement element = driver.findElement(By.name("country"));
		Select oSelect = new Select(element);
		oSelect.selectByVisibleText("United Kingdom");
		driver.findElement(By.xpath("/html/body/div[4]/div[5]/div/div/div/form/div[3]/div[13]/div[2]/input")).sendKeys("Test797");
		driver.findElement(By.name("password")).sendKeys("legal797");
		driver.findElement(By.name("passwordConfirmation")).sendKeys("legal797");
		driver.findElement(By.xpath("//input[@value='Register']")).click();
		
		//Enter Company Details
		driver.findElement(By.xpath("//input[@name='registeredAddress.companyName']")).sendKeys("Company Registered Address 797");
		driver.findElement(By.xpath("//input[@name='registeredAddress.addressLine1']")).sendKeys("london");
		driver.findElement(By.xpath("//input[@name='registeredAddress.addressLine4']")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@name='registeredAddress.phone']")).sendKeys("0123456789");
		//driver.findElement(By.xpath("//input[@name='registeredAddress.email']")).sendKeys("tnaveen2@ford.com");
		driver.findElement(By.xpath("//input[@name='sameAddress']")).click();
		driver.findElement(By.xpath("//input[@value='Add']")).click();
		
		
		
		
		
		
		
		
	}

}

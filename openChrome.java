package selenium;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class openChrome {
	
 
	public static void main(String []args) {
		System.out.println("launching chrome browser");
		System.setProperty("webdriver.chrome.driver", "C:\\Naveen\\sampleWorkspace\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://wwwqa.etis.ford.com");
		/*driver.findElement(By.xpath("//*[@id=\"responsive-wrapper\"]/div[3]/div/div/div[2]/div/div/a/p")).click();
		driver.findElement(By.xpath("//*[@id=\"login\"]/div/div/div/div[2]/div/button[2]")).click();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
		driver.findElement(By.linkText("ADFS")).click();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;   
		driver.findElement(By.xpath("/html/body/div[4]/div[4]/div[2]/div/div/div/ul/li[4]/a")).click();*/
		driver.findElement(By.xpath("//*[@id=\"responsive-wrapper\"]/div[4]/div[2]/div/div/div/ul/li[5]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"countrydropdown__result\"]")).click();
		//driver.findElement(By.xpath("//*[@id=\"countryoption\"]")).click();
		
		
		// Sample code for processing number of elements
		List<WebElement> list = driver.findElements(By.xpath("//*[@id=\"countryoption\"]"));
		Iterator<WebElement> i = list.iterator();
		while(i.hasNext()) {
		    WebElement wel = i.next();    
		    if(wel.getText().contains("United Kingdom"))
		    	{
		    		wel.click();
		    	}
		} 
		
		driver.findElement(By.xpath("//*[@id=\"optionsForm\"]/div/div[5]/input")).click();
	}
}

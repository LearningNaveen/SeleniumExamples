package selenium;

import java.util.List;
import java.util.Set;
import java.util.HashSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class checkDuplicateItemsInDropdown {
	public static void main(String args[]) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Naveen\\sampleWorkspace\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
	WebElement element = driver.findElement(By.id("select-demo"));
	boolean status = isSelectOptionsRepeating(element);
	System.out.println(status);
	driver.quit();
	}
	
	
	public static boolean isSelectOptionsRepeating(WebElement dropdown)
	{
	    Select s = new Select(dropdown);
	    List<WebElement> list = s.getOptions();
	    Set<String> listNames = new HashSet<String>(list.size());
	    for (WebElement w : list) {
	        listNames.add(w.getText().trim());
	    }

	    System.out.println(listNames);
	    if(list.size()== listNames.size())
	        return true;
	    else
	        return false;
	}
}

package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class ChromeProfile {
	
	public static void main(String args[]) {

	//System.setProperty("webdriver.chrome.driver", "C:\\Naveen\\sampleWorkspace\\Drivers\\chromedriver.exe");
	String userProfile= "C:\\Users\\tnaveen2\\AppData\\Local\\Google\\Chrome\\User Data\\";
	ChromeOptions options = new ChromeOptions();
	options.addArguments("user-data-dir="+userProfile);
	options.addArguments("--start-maximized");
	WebDriver driver = new ChromeDriver(options);
	driver.get("http://www.google.com");	
	
	//Another code for setting UntrustedSSLCertificate true:
	
	ChromeOptions opt = new ChromeOptions();
	
	
	ProfilesIni pro = new ProfilesIni();
	FirefoxProfile p = pro.getProfile("myClass");
	p.setAcceptUntrustedCertificates(true);
	
	}
}

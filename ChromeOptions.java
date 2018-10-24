package selenium;

import java.util.Collection;
import java.util.Properties;

public class ChromeOptions {

	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "C:\\Naveen\\sampleWorkspace\\Drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		System.out.println(options);
		
		Properties prop = System.getProperties();
		prop.list(System.out);
		
		
		System.out.println(System.getProperties());
	}
	
}

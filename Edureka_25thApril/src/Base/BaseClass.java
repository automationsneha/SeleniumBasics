package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseClass {

	public static WebDriver driver;
	
	public static void StartBrowser(String browserName) {
		
		try {
			if(browserName.equalsIgnoreCase("Chrome")) 
			{
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\abhre\\Documents\\GSync\\PCSync\\Drivers\\chromedriver.exe");
				driver = new ChromeDriver();
			}
			else if(browserName.equalsIgnoreCase("Firefox")) 
			{
				System.setProperty("webdriver.gecko.driver",
						"C:\\Users\\abhre\\Documents\\GSync\\PCSync\\Drivers\\geckodriver.exe");
				driver = new FirefoxDriver();
			}
			else if(browserName.equalsIgnoreCase("ie")) 
			{
				System.setProperty("webdriver.ie.driver",
						"C:\\Users\\abhre\\Documents\\GSync\\PCSync\\Drivers\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			}
			
		} catch (WebDriverException e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	
}

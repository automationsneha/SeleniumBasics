package module10.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseClass {

	public static WebDriver driver;
	
	public static void startBrowser(String browserName) {
		
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
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
		} catch (WebDriverException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void openAUT() {		
		driver.get("https://seleniumautomationpractice.blogspot.com/2017/10/automation-testing-sample_28.html");
	}
}

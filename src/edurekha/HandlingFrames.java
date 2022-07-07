package edurekha;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingFrames {
	
	public static WebDriver driver=null;
	public static WebDriverWait wait=null;
	
	public static void main(String[] args) {
	
   System.setProperty("webdriver.gecko.driver","C:\\Users\\Sneha\\eclipse-workspace1\\EdurekhaSelenium\\drivers\\geckodriver.exe");
    driver=new FirefoxDriver();
    wait=new WebDriverWait(driver,10);
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    driver.get("http://demo.guru99.com/V1/");
	}

}

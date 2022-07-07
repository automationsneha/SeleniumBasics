package aravindh_IT;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sneha\\eclipse-workspace1\\EdurekhaSelenium\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get("https://testautomationpractice.blogspot.com/");
        WebElement fname=driver.findElement(By.id("//input[@id='RESULT_TextField-1']"));
        fname.sendKeys("RONNIE");
        Thread.sleep(3000);
        //driver.findElement(By.xpath("//input[@id='RESULT_TextField-1']//input[@name='RESULT_TextField-1']")).sendKeys("ronnie");
        
        
	}

}

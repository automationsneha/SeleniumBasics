
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginToGmail {

	public static WebDriver driver=null;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sneha\\eclipse-workspace1\\EdurekhaSelenium\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		driver.get("https://www.gmail.com");
		//driver.wait(2000);
		//WebElement email=driver.findElement(By.xpath("//div[@class='wLBAL'][1]"));
		//email.click();
		WebElement mail=driver.findElement(By.id("identifierId"));
		mail.sendKeys("sneharoshna@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
    
	}

}

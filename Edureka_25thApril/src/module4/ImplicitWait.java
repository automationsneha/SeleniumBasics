package module4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
	
		
		// Open Chrome Browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abhre\\Documents\\GSync\\PCSync\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Open AUT
		driver.get("http://newtours.demoaut.com/");
	
		
		// Implicitly wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.findElement(By.name("userame")).sendKeys("tutorial");// 0-10
		driver.findElement(By.name("password")).sendKeys("tutorial");// 0-10
		driver.findElement(By.name("login")).click();// 0-10

		driver.findElement(By.linkText("PROFILE")).click();//0-10

		driver.quit();
		
}
}

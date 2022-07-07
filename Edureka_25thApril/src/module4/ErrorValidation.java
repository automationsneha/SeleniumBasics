package module4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ErrorValidation {

	public static void main(String[] args) {

		// Open Browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abhre\\Documents\\GSync\\PCSync\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Get URL
		driver.get("https://www.naukri.com/nlogin/login");
		//Manage synchronization of execution process
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Only Click on the email textBox 
		driver.findElement(By.id("usernameField")).sendKeys("*");
		/*only click on the password which will generate error on the Username Field
		 * if the email id is blank it would throw error. 
		*/
		driver.findElement(By.id("passwordField")).click();
		
		WebElement errmsg = driver.findElement(By.id("usernameField_err"));
		
		String Err = errmsg.getText();
		
		System.out.println(Err);
		
		boolean ErrorMessage = Err.equals("Email ID/Username cannot be left blank");
		
		System.out.println(ErrorMessage);	
	}
}

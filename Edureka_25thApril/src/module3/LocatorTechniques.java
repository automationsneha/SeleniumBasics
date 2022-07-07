package module3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorTechniques {

	public static void main(String[] args) {
		
		//Open the Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhre\\Documents\\GSync\\PCSync\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Open the AUT
		driver.get("https://www.facebook.com/");
		
		//Locators
			//ID
			//driver.findElement(By.id("u_0_m")).sendKeys("Abhresh");
		
			//Name
			//driver.findElement(By.name("lastname")).sendKeys("Sugandhi");
			
			//Classname
			//driver.findElement(By.className("_8esh")).click();
			//driver.findElement(By.className("inputtext login_form_input_box")).sendKeys("Abhresh");
					
			//LinkText
			//driver.findElement(By.linkText("Forgotten account?")).click();
			
			//navigation backword
			//driver.navigate().back();
			
			//PartialLinktext
			//driver.findElement(By.partialLinkText("en ac")).click();
			
			//tagName
			//driver.findElement(By.tagName(""));
			
			//Css
			driver.findElement(By.cssSelector("")).sendKeys("");
			
			//Xpath
			driver.findElement(By.xpath("//input[@aria-label='First name']")).sendKeys("Edureka");
			
			driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div/div/div/div[2]/div/div[2]/div/div/div/div[1]/form/div[1]/div[1]/div[1]/div[2]/div/div[1]/input")).sendKeys("Training");
				
		//Quit
		
	}
}
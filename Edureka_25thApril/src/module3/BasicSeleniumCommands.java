package module3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicSeleniumCommands {

	public static void main(String[] args) {

		// Single Line Comments

		/*
		 * Multi Line Comments Next Line
		 */

		// Instantiate a Browser
		// Chrome
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhre\\Documents\\GSync\\PCSync\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\abhre\\Documents\\GSync\\PCSync\\Drivers\\geckodriver.exe");
		WebDriver driver1 = new FirefoxDriver();
		
		
		// Close and Quit
		driver.close();	// this will close the current active window during this instance
		driver.quit();// this will close all the windows (active and non-active) and also kills the
		// driver.exe file executed during this instance

		// Get Commands
		driver.get("URL");// this to open the URL on the Browser
		driver.getTitle(); // to get the current title of the page
		driver.getCurrentUrl();	// this will get the current URL on the Page
		

		// Navigation
		driver.navigate().back(); // to go to the previous page from the history
		driver.navigate().forward(); // to go to the next page from the history
		driver.navigate().refresh(); // to refresh page

		// Element Handling
		driver.findElement(By.id("u_0_m")).click();// Click
		driver.findElement(By.id("u_0_m")).sendKeys("");// Type
		driver.findElement(By.id("u_0_m")).clear();// Clear
		driver.findElement(By.id("u_0_m")).getText();// Get Text

	}

}

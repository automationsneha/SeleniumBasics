package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisabledElement {

	public static void main(String[] args) throws Exception {
		// OpenBrowser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abhre\\Documents\\GSync\\PCSync\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Get AUT URL
		driver.get(
				"https://seleniumautomationpractice.blogspot.com/2020/04/how-to-enabledisable-all-input-controls.html");
		// Define WebElement
		
		WebElement element = driver.findElement(By.xpath("//*[@type='text']"));

		// Verify the check box is Enabled or not?
		boolean Validate = element.isEnabled();

		// Print the result of the elements state.
		System.out.println("Element is Enabled--" + Validate);

		Thread.sleep(5000);
		
		driver.findElement(By.id("myButton1")).click();

		// Verify the check box is Enabled or not?
		boolean Validate1 = element.isEnabled();

		// Print the result of the elements state.
		System.out.println("Element is Enabled--" + Validate1);

	}
}

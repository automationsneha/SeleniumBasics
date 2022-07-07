package module3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {

		// Open Chrome Browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abhre\\Documents\\GSync\\PCSync\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Open AUT
		driver.get(
				"https://seleniumautomationpractice.blogspot.com/2017/10/functionisogramigoogleanalyticsobjectri.html");

		// enter into data text box
		driver.findElement(By.xpath("//*[@id='datepicker']")).sendKeys("30/11/1986");

		Thread.sleep(3000);
		
		// Using Date TextBox interacting with Selenium IDE Checkbox
		driver.findElement(By.xpath("//*[@id='datepicker']//following::input[5]")).click();
		
		Thread.sleep(3000);

		// Using Date TextBox interacting with Male Radio button
		driver.findElement(By.xpath("//*[@id='datepicker']//preceding::input[9]")).click();
		
		Thread.sleep(3000);

		// interacting with heading of the page
		String Heading = driver.findElement(By.xpath("//*[contains(text(), 'n For')]")).getText();

		System.out.println(Heading);

		boolean Result = Heading.equals("Practice Automation Form");
		System.out.println(Result);

		Thread.sleep(3000);
		
		// Using Date TextBox interacting with the linktext "Test File to Download"
		driver.findElement(By.xpath("//*[text()='Test File to Download']")).click();
		
		// Close the Browser
		// driver.close();

	}

}

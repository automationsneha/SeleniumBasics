package module4;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class DisplayofElement{

	public static void main(String[] args) {
		//OpenBrowser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abhre\\Documents\\GSync\\PCSync\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Get AUT URL
		driver.get("https://seleniumautomationpractice.blogspot.com/2020/04/hiddenelement_3.html");
		//Define WebElement
		WebElement element = driver.findElement(By.xpath("//input[@onclick=\"hideElement()\"]"));
		
		//Select the Check box of Automation Tester
		driver.findElement(By.xpath("//*[@id=\"post-body-5030516189862580847\"]/center/button[2]")).click();		
		
		//Verify the check box is Displayed or not?
		boolean Validate = element.isEnabled();
		
		//Print the result of the elements state.
		System.out.println("The element is displayed--"+ Validate);

		
	}
}

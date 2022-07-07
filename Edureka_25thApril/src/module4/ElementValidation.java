package module4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ElementValidation{

	public static void main(String[] args) {
		//OpenBrowser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abhre\\Documents\\GSync\\PCSync\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Get AUT URL
		driver.get("https://seleniumautomationpractice.blogspot.com/2017/10/functionisogramigoogleanalyticsobjectri.html");
		//Define WebElement
		WebElement element = driver.findElement(By.id("profession-1"));
		//Select the Check box of Automation Tester
		element.click();
		//Verify the check box is Selected or not?	
		boolean Validate = element.isSelected();
		//Print the result of the elements state.
		System.out.println("Result--"+ Validate);	
	}
}

package edurekha;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingAlerts {

	public static WebDriver driver=null;
	public static WebDriverWait wait=null;
	
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Sneha\\eclipse-workspace1\\EdurekhaSelenium\\drivers\\chromedriver.exe ");
    driver = new ChromeDriver();
    wait=new WebDriverWait(driver,10);
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    driver.get("http://demo.automationtesting.in/Alerts.html");
    driver.findElement(By.xpath("//button[text()='click the button to display an alert box:']")).click();
    Alert alert=driver.switchTo().alert();
    System.out.println(alert.getText());
    alert.accept();
	}

}

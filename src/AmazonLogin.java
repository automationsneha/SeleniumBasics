import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonLogin {

	public static WebDriver driver=null;
	public static WebDriverWait wait=null;
	
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Sneha\\eclipse-workspace1\\EdurekhaSelenium\\drivers\\chromedriver.exe");	
	driver=new ChromeDriver();
	wait=new WebDriverWait(driver,10);
    driver.manage().window().maximize();
	//driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://www.amazon.com");
    System.out.println(driver.getTitle());
	//driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
    driver.findElement(By.xpath("//span[text()='Hello, Sign in']")).click();
   
	//driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
	//driver.findElement(By.id("ap_email")).sendKeys("m.anilreddy@gmail.com");
    driver.findElement(By.id("ap_email")).sendKeys("m.anilreddy@gmail.com");
    driver.findElement(By.id("continue")).click();
    
    
    //driver.wait(2000);
    driver.findElement(By.id("ap_password")).sendKeys("Swamy@0803");
    driver.findElement(By.id("signInSubmit")).click();
    
    
    System.out.println(driver.getTitle());
    
    wait.until(ExpectedConditions.titleContains("Amazon.com. Spend less"));
    String signIn=driver.getTitle();
    if(signIn.contains("Amazon.com. Spend less"))
    {
    	System.out.println("signIn successful");
    }
    	else
    	{
    		System.out.println("signIn failed");
    }
    }

}

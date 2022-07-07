package guru99_Ecommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class MobileListSortByName {
	public static WebDriver driver=null;

	public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","C:\\Users\\Sneha\\eclipse-workspace\\Temp\\seleniumdrivers\\geckodriver.exe");
    driver=new FirefoxDriver();
    driver.manage().window().maximize();
    driver.get("http://live.techpanda.org/index.php/");
    String title=driver.getTitle();
    System.out.println(title);
    if(title.contains("Home page"))
    {
    	System.out.println("Application Lanuched Successfully");
    }
    	else
    	{
    	System.out.println("Application Launch Failed");
    	}
    driver.findElement(By.xpath("//a[contains(text(),'Mobile')]")).click();
    
    String title1=driver.getTitle();
    System.out.println(title1);
    if(title1.contains("Mobile"))
    {
    	System.out.println("you are on Mobile page");
    }
    	else
    	{
    	System.out.println("navigation failed");
    	}
   driver.findElement(By.tagName("select#Mobile")).click();

    }
}
    

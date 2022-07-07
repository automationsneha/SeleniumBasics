package aravindh_IT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class DropDown {

	public static void main(String[] args) throws InterruptedException    {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sneha\\eclipse-workspace1\\EdurekhaSelenium\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        /*driver.get("https://omayo.blogspot.com/");
        WebElement dropdown=driver.findElement(By.xpath("//select[@name='SiteMap']"));
        Select drop=new Select(dropdown);
        //drop.selectByIndex(1);
        //drop.selectByValue("abc");
        drop.selectByVisibleText("doc 3");
        //drop.deselectByVisibleText("doc 3");
        System.out.println(drop.isMultiple());  */
        
        driver.get("https://demoqa.com/select-menu");
        WebElement dropdown=driver.findElement(By.id ("cars"));
        Select drop=new Select(dropdown);
        drop.selectByVisibleText("Volvo");
        drop.selectByVisibleText("Saab");
        drop.selectByVisibleText("Opel");
        drop.selectByVisibleText("Audi");
		Thread.sleep(3000);
	    drop.deselectByVisibleText("Volvo");
        Thread.sleep(3000);
        drop.deselectAll();;
        
        
	}

}

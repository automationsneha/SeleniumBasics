package aravindh_IT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxRadioButton {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sneha\\eclipse-workspace1\\EdurekhaSelenium\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@value='male']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@value='female']")).click();
        Thread.sleep(3000);
        WebElement orange_checkbox=driver.findElement(By.xpath("//input[@value='orange']"));
        System.out.println(orange_checkbox.isSelected());
        if(!orange_checkbox.isSelected())
        {
        orange_checkbox.click();
        }
        Thread.sleep(3000);
        WebElement blue_checkbox=driver.findElement(By.xpath("//input[@value='blue']"));
        System.out.println(blue_checkbox.isSelected());
        if(!blue_checkbox.isSelected())
        {
        blue_checkbox.click();	
        }
	}

}

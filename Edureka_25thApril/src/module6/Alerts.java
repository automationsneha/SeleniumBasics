package module6;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Base.BaseClass;


public class Alerts extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		
		StartBrowser("chrome");
		
		driver.get("https://seleniumautomationpractice.blogspot.com/2018/01/blog-post.html");
		
		Thread.sleep(5000);

		WebElement msg = driver.findElement(By.xpath("//*[@id='msg']"));
		
		Alert alert = driver.switchTo().alert();

		//simple alert
		
		driver.findElement(By.id("alert")).click();
			
		alert.accept();
		
		System.out.println(msg.getText());
		
		//confirmation alert
		
		driver.findElement(By.id("confirm")).click();
		
		
		alert.dismiss();
		
		System.out.println(msg.getText());
		
		
		//prompt Alert
		
		driver.findElement(By.id("prompt")).click();
		
		alert.sendKeys("Abhresh");
		
		alert.accept();
		
		System.out.println(msg.getText());
		
	}

}

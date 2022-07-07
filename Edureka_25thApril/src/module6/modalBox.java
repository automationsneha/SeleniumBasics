package module6;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import Base.BaseClass;

public class modalBox extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		
		StartBrowser("chrome");

		driver.get("https://www.flipkart.com/");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@class='_2zrpKA _1dBPDZ']")).sendKeys("Edureka");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@class='_2AkmmA _29YdH8']")).click();
	}

}


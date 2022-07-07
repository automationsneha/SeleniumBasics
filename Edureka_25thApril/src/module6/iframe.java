package module6;

import org.openqa.selenium.By;

import Base.BaseClass;

public class iframe extends BaseClass{

	public static void main(String[] args) throws Exception {
		
		StartBrowser("chrome");
		
		driver.get("https://seleniumautomationpractice.blogspot.com/2019/07/example-of-html-iframe-alternative.html");
		
		driver.switchTo().frame("ID_Frame1");
		
		Thread.sleep(5000);
		driver.findElement(By.id("ts_first_name")).sendKeys("Abhresh");
		
		Thread.sleep(3000);
		driver.switchTo().parentFrame();
		
		Thread.sleep(3000);
		driver.switchTo().frame("ID_Frame2");
		
		
		driver.findElement(By.name("lastname")).sendKeys("Sugandhi");
		
		
	}

}

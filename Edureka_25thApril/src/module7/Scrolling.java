package module7;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import Base.BaseClass;


public class Scrolling extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		
		StartBrowser("Chrome");

		driver.get("https://seleniumautomationpractice.blogspot.com/");
		
		Thread.sleep(5000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;	
		
		WebElement e = driver.findElement(By.xpath("//*[contains(text(),'IframesDoc')]"));

		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		js.executeScript("arguments[0].scrollIntoView();", e);
		 
		
	}

}

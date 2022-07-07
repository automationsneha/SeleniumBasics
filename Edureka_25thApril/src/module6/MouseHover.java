package module6;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Base.BaseClass;

public class MouseHover extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
	
		StartBrowser("Chrome");
		
		driver.get("https://www.myntra.com");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement searchbar = driver.findElement(By.xpath("//input[@class='desktop-searchBar']"));
		
		searchbar.sendKeys("Jackets");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[@class=\"desktop-submit\"]")).click();

		WebElement hover = driver.findElement(By.xpath("//*[@title=\"Campus Sutra Men Blue Solid Denim Jacket\"]"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(hover).perform();
		
		
		
	}

}

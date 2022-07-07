package module6;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Base.BaseClass;


public class KeyboardMouseMovement extends BaseClass {

	public static void main(String[] args) {

		StartBrowser("Chrome");
			
		driver.get("https://seleniumautomationpractice.blogspot.com/2017/10/automation-testing-sample_28.html");
			
		WebElement fName = driver.findElement(By.name("ts_first_name"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(fName)
			.keyDown(fName, Keys.SHIFT)
			.sendKeys("abhresh")
			.keyUp(fName, Keys.SHIFT)
			.build()
			.perform();
			
		act.moveToElement(fName)
		.contextClick()
		.build()
		.perform();
	}

}




package module6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Base.BaseClass;

public class ToolTip extends BaseClass{

	public static void main(String[] args) {
		
		StartBrowser("Chrome");
		
		driver.get("https://seleniumautomationpractice.blogspot.com/2020/04/tooltip.html");
		
		WebElement tt = driver.findElement(By.className("tooltip"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(tt).perform();
		
		System.out.println(tt.getText());

	}

}

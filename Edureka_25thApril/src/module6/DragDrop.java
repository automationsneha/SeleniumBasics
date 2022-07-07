package module6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Base.BaseClass;

public class DragDrop extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		
		StartBrowser("Chrome");
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		
		WebElement Source = driver.findElement(By.id("draggable"));
		
		WebElement Target = driver.findElement(By.id("droppable"));

		Thread.sleep(5000);
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(Source, Target).perform();
		
		
	}

}

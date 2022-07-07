package module7;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import Base.BaseClass;

public class DropDown extends BaseClass{

	public static void main(String[] args) throws InterruptedException {

		StartBrowser("Chrome");

		driver.get(
				"https://seleniumautomationpractice.blogspot.com/2017/10/functionisogramigoogleanalyticsobjectri.html");

		// Initialize the Select Class and navigate to the dropdown element
		Select s = new Select(driver.findElement(By.id("continents")));
				
		
		// Select Africa using Visibletext option
		s.selectByVisibleText("Africa");
		
		Thread.sleep(5000);

		// Select South America using Index Value
		s.selectByIndex(14);
		
		Thread.sleep(5000);
		
		// Select Antartica using Value
		s.selectByValue("g");
			
	}

}

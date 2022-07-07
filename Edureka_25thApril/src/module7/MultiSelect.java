package module7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Base.BaseClass;

public class MultiSelect extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		StartBrowser("Chrome");
		
		driver.get(
				"https://seleniumautomationpractice.blogspot.com/2017/10/functionisogramigoogleanalyticsobjectri.html");

		// Initialize the Select Class and focus on the webelement
		Select s = new Select(driver.findElement(By.name("selenium_commands")));

		//Part 1
		// Select and Deselect Switch Commands
		s.selectByIndex(2);
		
		Thread.sleep(5000);
		
		s.deselectByVisibleText("Switch Commands");
				
		//Part 2
		// To run the loop to select all the options one by one or in one go I need the total count.
		List<WebElement> oL = s.getOptions();	
		
		// this will help me to count the options from oL and give me the total options
		int itotaloptions = oL.size(); 
		
		System.out.println(itotaloptions);
		
		/* Start a loop where I am going to select and Deselect multiple options and
		then I will come out of the loop*/
		
		for(int i=0; i<itotaloptions; i++)
		{	
			// to get the text of the option available
			String oValue = oL.get(i).getText();
			
			// print the text of the option
			System.out.println(oValue);
				
			// select option based on index value
			s.selectByIndex(i);
			
			Thread.sleep(5000);
			
			s.deselectByIndex(i);
			
			Thread.sleep(5000);
			
		}	
			
		//deselect all
		//s.deselectAll();
		
	}
}
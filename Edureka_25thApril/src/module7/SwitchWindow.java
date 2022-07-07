package module7;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import Base.BaseClass;

public class SwitchWindow extends BaseClass  {

	public static void main(String[] args) throws InterruptedException {

		StartBrowser("Chrome");

		driver.get("https://seleniumautomationpractice.blogspot.com/2019/04/new-window.html");

		Dimension d = new Dimension(600, 650);
		driver.manage().window().setSize(d);
		
		// Part 1
		// Get the main window name
		String mw = driver.getWindowHandle();
		
		System.out.println("Main window name is:- "+ mw);
		System.out.println("=============================================================");

		// Part 2
		// Click on the button to open a new window
		driver.findElement(By.xpath("//*[@onclick='myFunction()']")).click();

		
		//Part 3
		// Get and store both window handles in array
		Set<String> AWH = driver.getWindowHandles();
	
		System.out.println("All window name is:- "+ AWH);
		System.out.println("=============================================================");
		
        //Using array and positions define each window name with a name
		String window1 = (String) AWH.toArray()[0]; 
		System.out.println("Window 1 name is:- "+ window1);
		System.out.println("=============================================================");
		
		String window2 = (String) AWH.toArray()[1]; 
		System.out.println("Window 2 name is:- "+ window2);
		System.out.println("=============================================================");
		
		
		String checkcurentwindow = driver.getWindowHandle();
		System.out.println(checkcurentwindow);
		
	
		// Switch between the windows
				
		driver.switchTo().window(window2);
				
		driver.findElement(By.name("q")).sendKeys("Selenium");
		
		driver.findElement(By.name("q")).submit();
		
		//driver.close();

		driver.switchTo().window(window1);
		
		Thread.sleep(5000);
		
		driver.quit();
		
	}
}

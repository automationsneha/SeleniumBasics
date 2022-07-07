package module7;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import Base.BaseClass;

public class Tabs3 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		
		StartBrowser("Chrome");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://seleniumautomationpractice.blogspot.com/2020/04/click-button-to-open-google.html");

		String checkmaintab = driver.getWindowHandle();
		System.out.println(checkmaintab);
		
		// Click to open the new tab
		driver.findElement(By.xpath("//*[@onclick='Open()']")).click();

		String checkcurenttab = driver.getWindowHandle();
		System.out.println(checkcurenttab);
		
		// Get and store both window handles in array
		Set<String> AWH = driver.getWindowHandles();

		System.out.println("All window name is:- " + AWH);
		System.out.println("=============================================================");

		// Using array and positions define each window name with a name
		String tab1 = (String) AWH.toArray()[0];
		System.out.println("Tab1 name is:- " + tab1);
		System.out.println("=============================================================");

		String tab2 = (String) AWH.toArray()[1];
		System.out.println("Tab2 name is:- " + tab2);
		System.out.println("=============================================================");


		// Switch to the respective tab
		driver.switchTo().window(tab2);

		// opening the google.com and search something
		driver.findElement(By.name("q")).sendKeys("Selenium");

		driver.findElement(By.name("q")).submit();
		
		driver.close();
		
		driver.switchTo().window(tab1);

		Thread.sleep(5000);
		
		driver.close();
	
	}
}
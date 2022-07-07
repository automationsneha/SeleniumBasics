package module8;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import org.openqa.selenium.By;

import com.sun.glass.events.KeyEvent;

import Base.BaseClass;


public class RobotClass extends BaseClass{	

	  public static void main(String[] args) throws Exception {	
		  
    	  StartBrowser("Chrome");
  
  		// Open AUT
  		driver.get("http://the-internet.herokuapp.com/");
  		

		// Click on the element to reach to the correct page of Upload feature
		driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[18]/a")).click();
		Thread.sleep(3000);

		// Clicking on choose-file button
		driver.findElement(By.xpath("//*[@id=\"drag-drop-upload\"]")).click();

		/*
		 * Now Native pop-up will be visible. Robot class will be use to handle the same
		 * the selected file on the below given file-path will be uploaded
		 */
		// Define the path of the file
		String filePath = "C:\\Users\\abhre\\Pictures\\Saved Pictures\\125.JPG";

		// Store the location of the file in clipboard
		// StringSelection is a class which has the capabilityies to transfer a string
		StringSelection sel = new StringSelection(filePath);

		// Copy the path to the Clip board
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel, null);

		/*
		 * Initialize the object of Robot class and paste the file path which we copied
		 * and then click the Open button by press Enter Key
		 */

		//Create an object for robot class
		Robot robot = new Robot();
		
		//Control key in the keyboard
		
		// Press Enter
		robot.keyPress(KeyEvent.VK_ENTER);
		
		// Release Enter
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		// Press CTRL+V
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		// Release CTRL+V
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		//Press Enter
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		// click the Upload button by Selenium Web driver API
		// driver.findElement(By.xpath("//*[@id=\"file-submit\"]")).click();

		// driver.quit();
      }
}
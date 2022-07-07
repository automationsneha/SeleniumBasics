package module9;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Base.BaseClass;

public class IDEExpertedScript extends BaseClass {

	@BeforeSuite
	public void Browser(){
		StartBrowser("Chrome");
	}
	 @Test
	  public void test1() {
	    driver.get("https://www.calculator.net/");
	    driver.manage().window().setSize(new Dimension(648, 639));
	    driver.findElement(By.xpath("//span[@onclick=\'r(8)\']")).click();
	    driver.findElement(By.xpath("//span[@onclick=\'r(5)\']")).click();
	    driver.findElement(By.xpath("//span[@onclick=\"r(\'*\')\"]")).click();
	    driver.findElement(By.xpath("//span[@onclick=\'r(5)\']")).click();
	    driver.findElement(By.xpath("//span[@onclick=\"r(\'=\')\"]")).click();
	    
	    
	      WebElement element = driver.findElement(By.xpath("//html"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).clickAndHold().perform();
	  
	      WebElement element2 = driver.findElement(By.xpath("//html"));
	      Actions builder2 = new Actions(driver);
	      builder2.moveToElement(element2).perform();
	  
	  
	      WebElement element1 = driver.findElement(By.xpath("//html"));
	      Actions builder1 = new Actions(driver);
	      builder1.moveToElement(element1).release().perform();
	  
	    driver.findElement(By.linkText("Percentage Calculator")).click();
	    driver.findElement(By.id("cpar1")).click();
	    driver.findElement(By.id("cpar1")).sendKeys("258");
	    driver.findElement(By.id("cpar2")).click();
	    driver.findElement(By.id("cpar2")).sendKeys("10000");
	    driver.findElement(By.xpath("//input[@value=\'Calculate\']")).click();

}
}
package module5;

import org.openqa.selenium.By;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.BaseClass;

public class DemoAnnotations extends BaseClass {

	
	//To validate the Login of GitHub.com
	
	//Open the Browser - @BeforeSuite
	//Open the URL - @BeforeTest
	//Validate the URL - @BeforeMethod
	//Enter the credentials on the Login Page - @Test 
	//LogOut - @AfterTest
	//Quit the browser - @AfterSuite
	

	
	@BeforeSuite
	public void InitiateBrowser() {
		StartBrowser("Chrome");
	}

	@BeforeTest
	public void OpenAUT() {
		driver.get("http://github.com");
	}
	
	@BeforeMethod
	public void ClickLoginLink() {
		
		driver.findElement(By.xpath("//*[@href='/login']")).click();
		
	}
	
	@Test
	public void Login() throws InterruptedException {
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("login_field")).sendKeys("abhiseleniumdemo@gmail.com");
		
		driver.findElement(By.id("password")).sendKeys("!Teach123");
		
		driver.findElement(By.name("commit")).click();

	}
	
	@AfterTest
	public void Logout() throws InterruptedException {

		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@aria-label='View profile and more' and @aria-haspopup='menu']")).click();
		
		driver.findElement(By.xpath("//*[@aria-label='View profile and more' and @aria-haspopup='menu']//following::button[15]")).click();
				
	}

	@AfterSuite
	public void CloseTestCase() throws InterruptedException {

		Thread.sleep(3000);
		
		driver.quit();	
	}

	@BeforeClass
	public void URLValidation() {
		
		String URL = driver.getCurrentUrl();
		boolean Result = URL.equals("https://github.com/");
		System.out.println(Result);
	}		
}


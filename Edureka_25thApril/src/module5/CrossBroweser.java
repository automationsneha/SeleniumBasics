package module5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Base.BaseClass;


public class CrossBroweser extends BaseClass {

	@Parameters("BrowserName")
	@Test(priority = 0)
	public void InitiateBrowser(String browserName) {
		try {
			if(browserName.equalsIgnoreCase("Chrome")) 
			{
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\abhre\\Documents\\GSync\\PCSync\\Drivers\\chromedriver.exe");
				driver = new ChromeDriver();
			}
			else if(browserName.equalsIgnoreCase("Firefox")) 
			{
				System.setProperty("webdriver.gecko.driver",
						"C:\\Users\\abhre\\Documents\\GSync\\PCSync\\Drivers\\geckodriver.exe");
				driver = new FirefoxDriver();
			}
			else if(browserName.equalsIgnoreCase("ie")) 
			{
				System.setProperty("webdriver.ie.driver",
						"C:\\Users\\abhre\\Documents\\GSync\\PCSync\\Drivers\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			}
			
		} catch (WebDriverException e) {
			System.out.println(e.getMessage());
		}
	
	}

	@Test(priority = 1)
	public void OpenAUT() {
		driver.get("http://github.com");
	}



	@Test(priority = 2)
	public void Login() throws InterruptedException {

		driver.findElement(By.xpath("//*[@href='/login']")).click();

		Thread.sleep(3000);

		driver.findElement(By.id("login_field")).sendKeys("abhiseleniumdemo@gmail.com");

		driver.findElement(By.id("password")).sendKeys("!Teach123");

		driver.findElement(By.name("commit")).click();

	}

	@Test(priority = 3)
	public void Logout() throws InterruptedException {

		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@aria-label='View profile and more' and @aria-haspopup='menu']")).click();

		driver.findElement(
				By.xpath("//*[@aria-label='View profile and more' and @aria-haspopup='menu']//following::button[15]"))
				.click();

	}

	@AfterSuite
	public void QuitTestCase() throws InterruptedException {

		Thread.sleep(3000);

		driver.quit();
	}

}

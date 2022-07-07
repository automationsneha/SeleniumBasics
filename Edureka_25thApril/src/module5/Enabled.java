package module5;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Base.BaseClass;

public class Enabled extends BaseClass{

	@Test(priority = 1)
	public void InitiateBrowser() {
		StartBrowser("Chrome");
	}

	@Test(priority = 2)
	public void OpenAUT() {
		driver.get("http://github.com");
	}

	@Test(priority = 4)
	public void ClickLoginLink() {

		driver.findElement(By.xpath("//*[@href='/login']")).click();
	}

	@Test(priority = 5, dependsOnMethods = "ClickLoginLink")
	public void Login() throws InterruptedException {

		Thread.sleep(3000);

		driver.findElement(By.id("login_field")).sendKeys("abhiseleniumdemo@gmail.com");

		driver.findElement(By.id("password")).sendKeys("!Teach123");

		driver.findElement(By.name("commit")).click();

	}

	@Test(priority = 6, dependsOnMethods = "Login")
	public void Logout() throws InterruptedException {

		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@aria-label='View profile and more' and @aria-haspopup='menu']")).click();

		driver.findElement(
				By.xpath("//*[@aria-label='View profile and more' and @aria-haspopup='menu']//following::button[15]"))
				.click();

	}

	@Test(priority = 7)
	public void CloseTestCase() throws InterruptedException {

		Thread.sleep(3000);

		driver.quit();
	}

	@Test(priority = 3, enabled = false)
	public void URLValidation() {

		String URL = driver.getCurrentUrl();
		boolean Result = URL.equals("https://github.com/");
		System.out.println(Result);
	}

}

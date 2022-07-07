package module11.actions;

import org.openqa.selenium.By;

import Base.BaseClass;

public class ActionKeywords extends BaseClass {

	public static void openBrowser() {
		StartBrowser("Chrome");
	}

	public static void Navigate() {
		driver.get("https://www.google.com/");
	}

	public static void ClickGmail() throws InterruptedException {
		driver.findElement(By.linkText("Gmail")).click();
		Thread.sleep(5000);
	}

	public static void QuitBrowser() {
		driver.quit();
	}
}

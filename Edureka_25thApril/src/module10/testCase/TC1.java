package module10.testCase;

import Base.BaseClass;
import module10.pageObjects.FormPage;

public class TC1 extends BaseClass {

	public static void main(String[] args) {
		
		StartBrowser("Chrome");

		driver.get("https://seleniumautomationpractice.blogspot.com/2017/10/automation-testing-sample_28.html");
		
		FormPage fp = new FormPage(driver);
		
		fp.enterFName();
		fp.enterAdd();
		
	}

}

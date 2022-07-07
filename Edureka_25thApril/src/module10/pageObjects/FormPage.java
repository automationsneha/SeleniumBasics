package module10.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormPage {

	
	@FindBy(id = "ts_first_name")
	WebElement fName;
	
	@FindBy(id = "ts_last_name")
	WebElement lName;
	
	@FindBy(id = "ts_address")
	WebElement address;
	
	
	public FormPage(WebDriver driver) {	
		PageFactory.initElements(driver, this);
	}
	
	public void FormFill(String FName, String LName, String Add) {
		fName.clear();
		fName.sendKeys(FName);
		
		lName.clear();
		lName.sendKeys(LName);
		
		address.clear();
		address.sendKeys(Add);
		
	}
	
	public void enterFName() {
		fName.clear();
		fName.sendKeys("Abhresh");
	}
	
	public void enterLName() {
		lName.clear();
		lName.sendKeys("Sugandhi");
	}
	
	public void enterAdd() {
		address.clear();
		address.sendKeys("Pune");
	}
	
}

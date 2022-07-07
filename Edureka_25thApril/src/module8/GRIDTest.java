package module8;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GRIDTest {

	WebDriver driver = null;
		
	@Parameters("System")
	@Test(priority = 0)
	public void openBrowser(String device) throws MalformedURLException {
		if (device.equalsIgnoreCase("pc1")) {
			DesiredCapabilities cap = DesiredCapabilities.chrome();
			cap.setCapability("browserVersion", "80");
			driver = new RemoteWebDriver(new URL("http://192.168.1.161:5555/wd/hub"), cap);
			
		} else if (device.equalsIgnoreCase("pc2")) {
			DesiredCapabilities cap = DesiredCapabilities.firefox();
			driver = new RemoteWebDriver(new URL("http://192.168.1.161:5757/wd/hub"), cap);
		}
	}
	
	@Test(priority = 1)
	public void OpenAUT() {
		//Open the AUT
				driver.get("https://www.amazon.in/");
	}
	
	
	@Test(priority = 2)
	public void Validate() {
		// Capture the Title of the Page
		String Apptitle = driver.getTitle();
		System.out.println(Apptitle);

		// validate the actual title VS Expected Title
		boolean Result = Apptitle.equals("Amazon.in");

		System.out.println(Result);
	}

}
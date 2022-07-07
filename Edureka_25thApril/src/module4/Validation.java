package module4;

import Base.BaseClass;

public class Validation extends BaseClass {

	public static void main(String[] args) {
		
		//Open browser
	/*	System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abhre\\Documents\\GSync\\PCSync\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
*/
		StartBrowser("Firefox");
		
		//Open the URL
		driver.get("https://accounts.google.com/");
		
		//Validate Title
		String actualTitle = driver.getTitle();

		System.out.println(actualTitle);
		
		boolean TitleResult = actualTitle.equals("Sign in – Google accounts"); //Sign in – Google accounts
		
		System.out.println(TitleResult);

		//Validate URL
		String actualURL = driver.getCurrentUrl();
		
		System.out.println(actualURL);
		
		boolean URLResult = actualURL.equals("https://accounts.google.com/");
		
		System.out.println(URLResult);
			
		
		//driver.quit();
		
	}

}

package module10.testCase;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import module10.pageObjects.FormPage;
import module10.utility.BaseClass;

public class Execution extends BaseClass {

	Workbook wb;
	Sheet sh;
	int numrow;
	int numcol;

	@BeforeSuite
	public void setup() {

		startBrowser("chrome");

		openAUT();

	}

	@AfterSuite
	public void ShutDown() {

		driver.quit();

	}

	@Test(dataProvider = "testDataFeed")
	public void FormFill(String FName, String LName, String Add) {
		FormPage fp = new FormPage(driver);
		fp.FormFill(FName, LName, Add);
	}
/*
	@Test(dataProvider = "testDataFeed")
	public void FormFill(String FName, String LName, String Add) {
		
		driver.findElement(By.name("ts_first_name")).clear();
		driver.findElement(By.name("ts_first_name")).sendKeys(FName);
		driver.findElement(By.name("ts_last_name")).clear();
		driver.findElement(By.name("ts_last_name")).sendKeys(LName);
		driver.findElement(By.name("ts_address")).clear();
		driver.findElement(By.name("ts_address")).sendKeys(Add);
	}
*/
	
	@DataProvider
	public Object[][] testDataFeed() throws Exception {

		// to pass the path of the file
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\abhre\\Documents\\GSync\\PCSync\\Programs_WorkSpace\\Edureka_25thApril\\src\\module10\\dataSet\\TestData.xlsx");

		// Read the file as workbook
		wb = WorkbookFactory.create(fis);

		// define the sheet
		sh = wb.getSheet("Sheet1");

		// count the total no of rows
		numrow = sh.getLastRowNum() + 1;// 9+1=10

		// count the total no of columns
		numcol = sh.getRow(0).getLastCellNum(); // 3

		Object[][] formData = new Object[numrow][numcol];

		// run a loop to read each and every cell which has data into it
		for (int i = 0; i < numrow; i++) {
			for (int j = 0; j < numcol; j++) {
				// read the data from the cell which has been selected using Row and Column
				// combination
				formData[i][j] = sh.getRow(i).getCell(j).toString();
			}
		}

		return formData;
	}

}

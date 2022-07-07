package module11.utility;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel {

	static Workbook wb;
	static Sheet sh;

	// method one will define what is the file and where it is and which sheet i
	// want to read
	public static void setupExcel(String path, String sheetName) throws Exception {

		FileInputStream fis = new FileInputStream(path);

		wb = WorkbookFactory.create(fis);

		sh = wb.getSheet(sheetName);
	}

	// method is reading the data from the file
	public static String getData(int rownum, int colnum) {

		String data = sh.getRow(rownum).getCell(colnum).toString();

		return data;

	}
}

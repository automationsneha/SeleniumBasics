package module11.testCase;

import module11.actions.ActionKeywords;
import module11.utility.ReadExcel;

public class Execution {
	
	public static void main(String[] args) throws Exception {	

	String path = "C:\\Users\\abhre\\Documents\\GSync\\PCSync\\Programs_WorkSpace\\Edureka_25thApril\\src\\module11\\dataSet\\MyDataEngine.xlsx";
	
	ReadExcel.setupExcel(path, "Sheet1");
	
	for(int i=0; i<5; i++)
	{
		String kw = ReadExcel.getData(i, 1);
		if(kw.equalsIgnoreCase("OpenBrowser")) 
		{
			ActionKeywords.openBrowser();
		}
		else if(kw.equalsIgnoreCase("Navigate"))
		{
			ActionKeywords.Navigate();
		}
		else if(kw.equalsIgnoreCase("ClickGmail"))
		{
			ActionKeywords.ClickGmail();
		}
		else if(kw.equalsIgnoreCase("QuitBrowser"))
		{
			ActionKeywords.QuitBrowser();
		}	
	}
	}	
}

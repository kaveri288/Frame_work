package Generic_Script;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class Generic_Read_Excel  
{
	public static void fetch_data()
	{
		String val="";
		try
		{
			FileInputStream fis=new FileInputStream("./excel/HybridFW.xlsx");
			
			
		}
		catch (Exception e) {
			System.out.println("cannot handle");
		}
	}

}

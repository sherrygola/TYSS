package Generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Utils extends Base {


	public static String xlRead(String sheetname,int rowno,int cellno) throws Exception, IOException {
	
		Workbook wb=WorkbookFactory.create(new FileInputStream(XL_DATA_PATH));
		Sheet s = wb.getSheet(sheetname);
		Row r = s.getRow(rowno);
		Cell c = r.getCell(cellno,MissingCellPolicy.CREATE_NULL_AS_BLANK);
		
		String v = c.getStringCellValue();
		return v;
		
	}
	
	public static void xlWrite() {
		
	}
	
	public static int xlRowCount() throws Exception {
		
		Workbook wb=WorkbookFactory.create(new FileInputStream(XL_DATA_PATH));
		Sheet s = wb.getSheet("Logind");
		int rowcount =s.getLastRowNum();
		return rowcount;
	}
	
	public void TakeScreenShots()
	{
		
	}
}

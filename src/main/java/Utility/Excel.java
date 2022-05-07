package Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {
	public static String getTestData1 (int row,int cell,String sheetname) throws IOException {

		FileInputStream file =new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\Zerodha8jan\\src\\test\\resources\\TestData1.xlsx");	
		String value=WorkbookFactory.create(file).getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		return value;

		}

}

package selenium_related_PGM;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excel_file_read {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		String file_path = "D:\\Excel_data_read.xlsx.xlsx";

		FileInputStream fis = new FileInputStream(file_path);
		
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Sheet1");
//		Row row = sheet.getRow(0);
//		Cell cell = row.getCell(1);
//		String data = cell.getStringCellValue();

		
		
		int lastrow = sheet.getLastRowNum();
		for(int i = 1 ; i<=lastrow; i++) {
//			sheet.getRow(i).getCell(0);
			String username = sheet.getRow(i).getCell(0).getStringCellValue();
			String password = sheet.getRow(i).getCell(1).getStringCellValue();


			System.out.println(username + "  "+ password);
//			un.sendkeys(username);
//			pwd.sendkeys(password);
//			login.click();
			
			// logout function
			// loop will check for next iteration
			
		}
		
	}
}

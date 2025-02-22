package com.crmweb.genericfile_utilty;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {

//	public static void main(String[] args) throws Throwable {

	public String getDataFromExcelFile(String sheetName, int rowNum, int celNum) throws Throwable {

		String path = "./testdata/DWS_TestData_2.xlsx";
		FileInputStream fis = new FileInputStream(path);
		Workbook Wb = WorkbookFactory.create(fis);
		String data = Wb.getSheet(sheetName).getRow(rowNum).getCell(celNum).getStringCellValue();
		Wb.close();
		return data;
	}

	public int getRowcount(String sheetName) throws Throwable {
		
		String path = "./testdata/DWS_TestData_2.xlsx";
		FileInputStream fis = new FileInputStream(path);
		Workbook Wb = WorkbookFactory.create(fis);
		int rowCount = Wb.getSheet(sheetName).getLastRowNum();
		Wb.close();
		return rowCount;
	}

	public void setDataIntoExcel(String sheetName, int celNum, String data) throws Throwable {
		
		String path = "./testdata/DWS_TestData_2.xlsx";
		FileInputStream fis = new FileInputStream(path);
		Workbook Wb = WorkbookFactory.create(fis);
		
		FileOutputStream fos = new FileOutputStream(path);
		Wb.write(fos);
		Wb.close();
	}

}

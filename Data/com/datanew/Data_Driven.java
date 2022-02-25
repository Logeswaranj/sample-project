package com.datanew;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_Driven {
	public static void main(String[] args) throws Throwable {
		
		File  newdata = new File("C:\\\\Users\\\\Dell\\\\Documents//Data.xlsx");
		FileInputStream Data = new FileInputStream(newdata);
		Workbook Excel = new XSSFWorkbook(Data);
		Sheet sheetAt = Excel.getSheetAt(0);
		Row row = sheetAt.getRow(1);
		Cell cell = row.getCell(0);
		CellType cellType = cell.getCellType();
		if (cellType.equals(cellType.STRING)) {
			String stringCellValue = cell.getStringCellValue();
			System.out.println(stringCellValue);
			
		}else if (cellType.equals(cellType.NUMERIC)){
			double  numericCellValue = cell.getNumericCellValue();
			System.out.println(numericCellValue);
		}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}

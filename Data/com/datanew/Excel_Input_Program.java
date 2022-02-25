package com.datanew;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 
import com.microsoft.schemas.office.visio.x2012.main.CellType;

public class Excel_Input_Program {
	public static void main(String[] args) throws Throwable {
		
	
	
	File  newdata = new File("C:\\\\Users\\\\Dell\\\\Documents//Data.xlsx");
	FileInputStream Data = new FileInputStream(newdata);
	Workbook Excel = new XSSFWorkbook(Data);
	Sheet sheetAt = Excel.getSheetAt(0);
	int numberOfRows = sheetAt.getPhysicalNumberOfRows();
	for (int i = 0; i < numberOfRows; i++) {
		Row row = sheetAt.getRow(i);
		int cell = row.getPhysicalNumberOfCells();
		for (int j = 0; j < cell; j++) {
			Cell cellnew = row.getCell(j);
			org.apache.poi.ss.usermodel.CellType  cellType = cellnew.getCellType();
			if (cellType.equals(cellType.STRING)) {
				String stringCellValue = cellnew.getStringCellValue();
				System.out.println(stringCellValue);
			} else if (cellType.equals(cellType.NUMERIC)) {
				double numericCellValue = cellnew.getNumericCellValue();
				System.out.println(numericCellValue);
				int one= (int) numericCellValue;
				System.out.println(one);
			}
			
		}
		
		
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}

package com.datanew;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Loges {
	public static void main(String[] args) throws Throwable {
		File f= new File("C:\\Users\\Dell\\Documents\\Data.xlsx");
		FileInputStream inp = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(inp);
	   Sheet createSheet = wb.createSheet("adactin");
	   Row createRow = createSheet.createRow(0);
	   Row createRow2 = createSheet.createRow(1);
	   Cell createCell2 = createRow.createCell(4);
	   Cell createCell = createRow.createCell(0);
	   createCell.setCellValue("email");
		wb.getSheet("adactin").getRow(1).createCell(0).setCellValue("Ajith");
		wb.getSheet("adactin").getRow(1).createCell(4).setCellValue("Success");
		
		FileOutputStream fs= new FileOutputStream(f);
		wb.write(fs);
		wb.close();
		System.out.println("done");
	}

}

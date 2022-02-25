package com.datanew;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Program_input {
	public static void main(String[] args) throws Throwable {
		File project = new File("C:\\Users\\Dell\\Documents\\data.xlsx");
		FileInputStream data = new FileInputStream(project);
		Workbook Excel = new XSSFWorkbook(data);
	    Sheet createSheet = Excel.createSheet("pro");
		Row createRow = createSheet.createRow(0);
		Row createRow2 = createSheet.createRow(1);
		Cell createCell = createRow.createCell(0);
		
		 Excel.getSheet("pro").getRow(0).createCell(1).setCellValue("name");
		Excel.getSheet("pro").getRow(0).createCell(2).setCellValue("Ajith");
		Excel.getSheet("pro").getRow(1).createCell(0).setCellValue("Success");
		
		FileOutputStream name = new FileOutputStream(project);
		Excel.write(name);
		Excel.close();
		System.out.println("done");
	}
}

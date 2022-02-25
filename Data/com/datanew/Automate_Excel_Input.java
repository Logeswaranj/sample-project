package com.datanew;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.SpreadsheetVersion;
import org.apache.poi.ss.formula.udf.UDFFinder;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Name;
import org.apache.poi.ss.usermodel.PictureData;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.SheetVisibility;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Automate_Excel_Input {
	public static void main(String[] args) throws Throwable {
		File input = new File("c:/Users/Dell/eclipse-workspace/hotelbooking/Data.xlsx");
		FileInputStream name = new FileInputStream(input);
		Workbook newbook = new XSSFWorkbook(name); 
			Sheet createSheet = newbook.createSheet("Files");
		Row row = createSheet.createRow(0);
		Row createRow = createSheet.createRow(1);
		Row createRow2 = createSheet.createRow(2);
		//row 1
		Cell createCell = createRow.createCell(0);
		Cell createCell2 = createRow.createCell(1);
		Cell createCell3 = createRow.createCell(2);
		Cell createCell4 = createRow.createCell(3);
		Cell createCell5 = createRow.createCell(4);
		Cell createCell6 = createRow.createCell(5);
		//row 2
		Cell createCell7 = createRow2.createCell(0);
		Cell createCell8 = createRow2.createCell(1);
		Cell createCell9 = createRow2.createCell(2);
		Cell createCell10 = createRow2.createCell(3);
		Cell createCell11 = createRow2.createCell(4);
		Cell createCell12 = createRow2.createCell(5);
		
		newbook.getSheet("Files").getRow(0).createCell(0).setCellValue("name");
		newbook.getSheet("Files").getRow(1).createCell(0).setCellValue("Ajith");
		newbook.getSheet("Files").getRow(1).createCell(4).setCellValue("Valid");
		FileOutputStream output = new FileOutputStream(input);
		newbook.write(output);
		newbook.close();
		
		System.out.println("done");
		
		
		
		
		
		
		
		
	}

}

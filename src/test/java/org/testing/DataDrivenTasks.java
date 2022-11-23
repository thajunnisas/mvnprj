package org.testing;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class DataDrivenTasks {

	public static void main(String[] args) throws IOException {
		
		//to read the particular data
		//1.to read the excel file
				//FolderPath\\filename.extensions
		File  f= new File("C:\\Users\\Thajunnisa\\eclipse-workspace\\MavenProject\\ExcelSheet\\MavenDataDriven.xlsx");
		
		//to read a file
		FileInputStream rea=new FileInputStream(f);
		
		//to read exact file format
		Workbook w=new XSSFWorkbook(rea);
		
		//WORKBOOK---->SHEET--->ROW--->CELL--->DATAS
		Sheet MySheet = w.getSheet("Drive");
		
		//getRow()-m------>to fetch a particular row
		Row r=MySheet.getRow(1);
		Cell c1 = r.getCell(0);
		Cell c2 = r.getCell(1);
		System.out.println(c1);
		System.out.println(c2);
		
		//getCell()-m------>to fetch a particular cell
		Cell c=r.getCell(1);
		System.out.println(c);
		Row r1 = MySheet.getRow(0);
		Cell c3 = r1.getCell(0);
		Cell c4 = r1.getCell(1);
		System.out.println(c3);
		System.out.println(c4);
		
		//for (int i = 0; i < MySheet.getPhysicalNumberOfRows(); i++) {
			//Row r=MySheet.getRow(i);
			//for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
			//	Cell c=r.getCell(j);
				//System.out.println(c);
				
			//}
			
		//}
	}

}

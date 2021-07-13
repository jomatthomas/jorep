package maven_package;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read {
	XSSFSheet sh;
	public Excel_Read() throws IOException
	{
		FileInputStream f=new FileInputStream("F:\\Java\\workspace\\My_Maven1\\src\\main\\resources\\color.xlsx");
		XSSFWorkbook w=new XSSFWorkbook(f);
		sh=w.getSheet("Sheet1");	
	}
	
	public String readData(int i,int j) {
		Row r=sh.getRow(i);
		Cell c=r.getCell(j);
		int celltype=c.getCellType();
		switch(celltype) {
		case Cell.CELL_TYPE_NUMERIC:
		{
			double data=c.getNumericCellValue();
			return String.valueOf(data);
		}
		case Cell.CELL_TYPE_STRING:
		{
			String data=c.getStringCellValue();
			return data;
		}
		default:
			return null;
		}
	}
	public void readAll(){
		
		for (Row r : sh) {
			System.out.println();
			for (Cell c : r) {
				System.out.print(c+" ");
			}}
		
		
		/*
			for (Row r : sh) for (Cell c : r) {
				System.out.print(c+" ");
			}   */
		
		
		/* for (Row r : sh) {
			System.out.println();
			for (Cell c : r) {
				System.out.print(c+" ");
			}
			}   */
	}
	
}

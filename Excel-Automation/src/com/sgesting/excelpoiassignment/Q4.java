package com.sgesting.excelpoiassignment;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Q4 {

	public static void main(String[] args) {
		writeContent();

	}
	public static void writeContent()
	{
		FileOutputStream fout=null;
		Workbook w=null;
		Sheet s=null;
		Row r=null;
		Cell c=null;
		try
		{
			w=new XSSFWorkbook();
			s=w.createSheet("Sheet1");

			r=s.createRow(0);
			c=r.createCell(0);
			c.setCellValue("Flower_Names");
			c=r.createCell(1);
			c.setCellValue("Citynames");

			for(int i=1;i<=20;i++)
			{
				r=s.createRow(i);
				c=r.createCell(0);
				c.setCellValue("Flower"+i);
				c=r.createCell(1);
				c.setCellValue("CityName"+i);
			}

			fout=new FileOutputStream("E:\\EXCEL\\Assignment4.xlsx");
			w.write(fout);
		}catch(Exception e)
		{
			e.printStackTrace();
		}finally
		{
			try
			{
				fout.close();
				w.close();


			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}

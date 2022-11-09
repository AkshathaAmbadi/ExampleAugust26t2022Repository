package com.sgesting.excelpoiassignment;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Q5 {

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
			c.setCellValue("State Names");
			

			for(int i=1;i<=20;i++)
			{
				r=s.createRow(i);
				c=r.createCell(i);
				c.setCellValue("State"+i);	
			}
			fout=new FileOutputStream("E:\\EXCEL\\Assignment5.xlsx");
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

package com.sgesting.excelpoiassignment;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Q6 {

	public static void main(String[] args) {
		readContent();
		writeContent();
	}
	private static void readContent()
	{
		FileInputStream fin=null;
		Workbook wb=null;
		Sheet sh=null;
		Row row=null;
		Cell cell=null;
		try
		{
			fin=new FileInputStream("E:\\EXCEL\\Assignment6.xlsx");
			wb=new XSSFWorkbook(fin);
			sh=wb.getSheet("Sheet1");
			int rc=sh.getPhysicalNumberOfRows();
			for(int r=0;r<rc;r++)
			{
				row=sh.getRow(r);
				int cc=row.getPhysicalNumberOfCells();
				for(int c=0;c<cc;c++)
				{
					cell=row.getCell(c);
					String data=cell.getStringCellValue();
					System.out.printf("%-12s",data);
				}
				System.out.println();
			}
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fin.close();
				wb.close();
			}catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
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
			  s=w.createSheet("Sheet2");
			  r=s.createRow(0);
			  c=r.createCell(0);
			  c.setCellValue("Country Names");
			  
			 
			fout=new FileOutputStream("E:\\EXCEL\\Assignment6.xlsx");
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

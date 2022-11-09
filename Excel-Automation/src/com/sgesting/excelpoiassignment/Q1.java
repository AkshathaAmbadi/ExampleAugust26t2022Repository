package com.sgesting.excelpoiassignment;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Q1 {

	public static void main(String[] args) {
	 writeContent();

	}
  public static void  writeContent()
  {
	  FileOutputStream fout=null;
	  Workbook wb=null;
	  Sheet st=null;
	  Row r=null;
	  Cell c=null;
	  try
	  {
		  wb=new XSSFWorkbook();
		  st=wb.createSheet("Flowers");
		  r=st.createRow(0);
		  c=r.createCell(0);
		  c.setCellValue("FlowerNames");
		  for(int i=1;i<=20;i++)
		  {
			  r=st.createRow(i);
			  c=r.createCell(0);
			  c.setCellValue("Flower"+i);
		  }
		 
		  
		 /* r=st.createRow(1);
		  c=r.createCell(0);
		  c.setCellValue("Flower1");
		  
		  r=st.createRow(2);
		  c=r.createCell(0);
		  c.setCellValue("Flower2");
		  
		  r=st.createRow(3);
		  c=r.createCell(0);
		  c.setCellValue("Flower3");
		  
		  r=st.createRow(4);
		  c=r.createCell(0);
		  c.setCellValue("Flower4");
		  
		  r=st.createRow(5);
		  c=r.createCell(0);
		  c.setCellValue("Flower5");
		  
		  r=st.createRow(6);
		  c=r.createCell(0);
		  c.setCellValue("Flower6");
		  
		  r=st.createRow(7);
		  c=r.createCell(0);
		  c.setCellValue("Flower7");
		  
		  r=st.createRow(8);
		  c=r.createCell(0);
		  c.setCellValue("Flower8");
		 
		  r=st.createRow(9);
		  c=r.createCell(0);
		  c.setCellValue("Flower9");
		  
		  r=st.createRow(10);
		  c=r.createCell(0);
		  c.setCellValue("Flower10");
		  
		  r=st.createRow(11);
		  c=r.createCell(0);
		  c.setCellValue("Flower11");
		  
		  r=st.createRow(12);
		  c=r.createCell(0);
		  c.setCellValue("Flower12");
		  
		  r=st.createRow(13);
		  c=r.createCell(0);
		  c.setCellValue("Flower13");
		  
		  r=st.createRow(14);
		  c=r.createCell(0);
		  c.setCellValue("Flower14");
		  
		  r=st.createRow(15);
		  c=r.createCell(0);
		  c.setCellValue("Flower15");
		  
		  r=st.createRow(16);
		  c=r.createCell(0);
		  c.setCellValue("Flower16");
		  
		  r=st.createRow(17);
		  c=r.createCell(0);
		  c.setCellValue("Flower17");
		  
		  r=st.createRow(18);
		  c=r.createCell(0);
		  c.setCellValue("Flower18");
		  
		  r=st.createRow(19);
		  c=r.createCell(0);
		  c.setCellValue("Flower19");
		  
		  r=st.createRow(20);
		  c=r.createCell(0);
		  c.setCellValue("Flower20");*/
		  
		  fout=new FileOutputStream("E:\\EXCEL\\Flower_loop.xlsx");
		  wb.write(fout);
		  
	  }catch(Exception e)
	  {
		  e.printStackTrace();
	  }
	  finally
	  {
		  try
		  {
			  fout.close();
			  wb.close();
		  }catch(Exception e)
		  {
			  e.printStackTrace();
		  }
	  }
  }
}

package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelUtility {
	
	public FileInputStream fileinput;
	public XSSFWorkbook wb;
	public XSSFSheet sh;
	public XSSFRow row;
	public XSSFCell cell;
	
	String path;
	
	excelUtility(String path){
		this.path=path;
	}
	
	public int totalrows(String sheetname) throws IOException {
		
		fileinput=new FileInputStream(path);
		wb= new XSSFWorkbook(fileinput);
		sh=wb.getSheet(sheetname);
		int rowcount=sh.getLastRowNum();
		wb.close();
		fileinput.close();
		return rowcount;
		
	}

	
	public int totalcolums(String sheetname,int rownum) throws IOException {
		
		fileinput=new FileInputStream(path);
		wb= new XSSFWorkbook(fileinput);
		sh=wb.getSheet(sheetname);
		row=sh.getRow(rownum);
		int cellcount=row.getLastCellNum();
		wb.close();
		fileinput.close();
		return cellcount;
	}
	
	public String getcelldata(String sheetname, int rownum, int cellnum) throws IOException {
		
		System.out.println("inside excel utility class");
		fileinput =new FileInputStream(path);
		wb=new XSSFWorkbook(fileinput);
		sh=wb.getSheet(sheetname);
		row=sh.getRow(rownum);
		cell=row.getCell(cellnum);
		
		DataFormatter df=new DataFormatter();
		String data;
		try {
			data=df.formatCellValue(cell);
		}
		catch(Exception e){
			data="";
		}
		
		wb.close();
		fileinput.close();
		System.out.println(data);
		return data;
	}
		
	
}

package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelRead {
	
	HSSFWorkbook file;
	HSSFSheet sheet;
	public String readexcel(String path,int sheetNo,int r,int c) throws IOException {
		
		FileInputStream fin=new FileInputStream(path);
		file=new HSSFWorkbook(fin);
		sheet=file.getSheetAt(sheetNo);
		String data=sheet.getRow(r).getCell(c).getStringCellValue();
		return data;
	}
public static void main(String args[]) throws IOException {
	ExcelRead e=new ExcelRead();
	String result=e.readexcel("C:\\Users\\ARUN\\Desktop\\TestDataNew.xlsx",0, 1, 0);
	System.out.print(result);
	
}
}

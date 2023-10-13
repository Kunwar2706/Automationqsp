package com.actitime.generic1;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Filelib {
	/**
	 * this is generic method  for reading the data  
	 * @param key
	 * @return
	 * @throws IOException
	 */
public String getPropertyData(String key) throws IOException  {
	FileInputStream fis=new FileInputStream("./data/commondata.property");
	Properties p= new Properties();
	p.load(fis);
	String data = p.getProperty(key);
	return data;


}
/**
 * this is generic method  for reading the data from excel file 
 * @param sheetName
 * @param row
 * @param cell
 * @return
 * @throws EncryptedDocumentException
 * @throws IOException
 */

public String getExeldata(String sheetName,int row,int cell) throws EncryptedDocumentException, IOException{
	FileInputStream fis=new FileInputStream("./data/textscrit.xlsx");
	 Workbook wb=WorkbookFactory.create(fis);
	String data = wb.getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
	 return data;
}
/**
 * this is generic method  for writing the data  from excel file 
 * @param sheetName
 * @param row
 * @param cell
 * @param value
 * @throws IOException
 */

public void setExelData(String sheetName,int row,int cell,String value) throws IOException {
	FileInputStream fis=new FileInputStream("./data/textscrit.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	wb.getSheet(sheetName).getRow(row).getCell(cell).setCellValue(value);
	FileOutputStream fos=new FileOutputStream("./data/textscrit.xlsx");
	wb.write(fos);
	wb.close();
	
}
	
}


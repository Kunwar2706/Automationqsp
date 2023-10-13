package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("./data/textscrit.xlsx");
Workbook  wb=WorkbookFactory.create(fis);
 String data = wb.getSheet("sheet1").getRow(1).getCell(2).getStringCellValue();
System.out.println(data);
	}

}

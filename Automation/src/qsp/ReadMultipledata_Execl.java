package qsp;




import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipledata_Execl  {
	
 
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/textscrit.xlsx");
Workbook wb= WorkbookFactory.create(fis);
int count = wb.getSheet("invalid login").getLastRowNum();
System.out.println(count  );
               for(int i=1;i<=count;i++) 
               {
 String un = wb.getSheet("invalid login").getRow(i).getCell(0).getStringCellValue();
  String pw = wb.getSheet("invalid login").getRow(i).getCell(1).getStringCellValue();
 System.out.println(un+" " +pw);
	}
	}
}

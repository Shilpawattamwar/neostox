package excelapache;

import java.io.File;

//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Exceleg1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File myfile = new File("D:\\Important\\Shilpa\\eclipse workspace\\examples.xlsx");
		
	//	FileInputStream myexcel = new FileInputStream(myfile);
		
		 String value = WorkbookFactory.create(myfile).getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
		 System.out.println(value);
		 
		 String value1 = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		 System.out.println(value1);
		
	}

}

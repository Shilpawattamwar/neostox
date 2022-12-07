package excelapache;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Exceleg3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
	File myfile = new File("D:\\Important\\Shilpa\\eclipse workspace\\examples.xlsx");
		
		//	FileInputStream myexcel = new FileInputStream(myfile);
	Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet2");
	int lastrowno = mysheet.getLastRowNum();
	System.out.println(lastrowno);   //total no is 5 but it starting from 0to4 ie.5
    int totalnoofrows = lastrowno+1;
    System.out.println(totalnoofrows);
	}

}

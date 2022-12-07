package excelapache;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Exceleg2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		File myfile = new File("D:\\Important\\Shilpa\\eclipse workspace\\examples.xlsx");
		
		//	FileInputStream myexcel = new FileInputStream(myfile);
		 double value = WorkbookFactory.create(myfile).getSheet("Sheet2").getRow(0).getCell(0).getNumericCellValue();
		System.out.println(value);
		
		boolean value1 = WorkbookFactory.create(myfile).getSheet("Sheet2").getRow(1).getCell(1).getBooleanCellValue();
		System.out.println(value1);
		System.out.println("***********************************************************************");
		
		Workbook myworkbook = WorkbookFactory.create(myfile);
		Sheet mysheet = myworkbook.getSheet("Sheet2");
		Row myrow = mysheet.getRow(1);
		Cell mycell = myrow.getCell(0);
	//    CellType mytype = mycell.getCellType();
	//    System.out.println(mytype);
	   String value2 = mycell.getStringCellValue();
	   System.out.println(value2);
	   System.out.println("**********************************************************************");
	   
	  Row myrow1 = mysheet.getRow(3);
	  for(int i=0;i<=3;i++)
	  {
		  System.out.print(myrow1.getCell(i).getStringCellValue()+" ");
		  
	  }
	  System.out.println();
	  System.out.println("**************************************************************");
	  for(int j=3;j<=4;j++) 
	  {
	      for(int k=0;k<=3;k++)
	    {
		  System.out.print(mysheet.getRow(j).getCell(k).getStringCellValue()+" ");
	    }
	      System.out.println();
	}
	

	}
		

	}


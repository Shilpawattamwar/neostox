package excelapache;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Exceleg4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		File myfile = new File("D:\\Important\\Shilpa\\eclipse workspace\\examples.xlsx");
		
		//	FileInputStream myexcel = new FileInputStream(myfile);
		
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet2");
		int lastrowno = mysheet.getLastRowNum();
		System.out.println("last rw no is "+lastrowno);   //total no is 5 but it starting from 0to4 ie.5
	    int totalnoofrows = lastrowno+1;
	    System.out.println("total no of rows is "+totalnoofrows);
	    
	    System.out.println("*************************************************");
	    
	     int lastcellno = mysheet.getRow(3).getLastCellNum();
	    System.out.println(lastcellno);  //total no is4
	    int totalnoofcell = lastcellno;
		System.out.println("total no of cell is "+totalnoofcell);
	
		System.out.println("**************************************************");
		
		//to get cell dynamically
		totalnoofcell=mysheet.getRow(3).getLastCellNum()-1;

		for(int i=0;i<=totalnoofcell;i++ )
		{
			System.out.print(mysheet.getRow(3).getCell(i).getStringCellValue()+" ");
		}
		System.out.println();
		System.out.println("****************************************************");
		
		//to get total row dynamically
	        int lastrowno1 = mysheet.getLastRowNum();
	        for(int j=0;j<=lastrowno1;j++) 
	        {
	        	System.out.println(mysheet.getRow(j).getCell(0).getStringCellValue());
	        }
	        System.out.println("*************************************************");
	        
		//how to read complete excel sheet in dynamic way
	        int lastrow = mysheet.getLastRowNum();
	        int lastcell = mysheet.getRow(lastrow).getLastCellNum()-1;
	    //read complete excel using nested for loop
	        
	    //outer for loop---->rows--->vary from 0 to lastrow    
		    for(int i=0;i<=lastrow;i++) 
		    {
		    	//inner for loop for cells--->vary from 0 to last cell
		    	for(int j=0;j<=lastcell;j++) 
		    	{
		    		System.out.print(mysheet.getRow(i).getCell(j).getStringCellValue()+" ");
		    	}
		    	System.out.println();
		    }
		 System.out.println("**********************************************************");
	    
		
		
		
	
	}

}

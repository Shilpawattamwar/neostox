package excelapache;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ownexample {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		
		File myfile=new File("D:\\Important\\Shilpa\\eclipse workspace\\examples.xlsx");
		
		 Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet6");
		String mystring = mysheet.getRow(0).getCell(0).getStringCellValue();
		
        System.out.println("my string is " +mystring);
        
        for(int i=0;i<=2;i++) 
        {
        	for(int j=0;j<=2;j++) {
        		Cell mycell = mysheet.getRow(i).getCell(j);
				CellType type = mycell.getCellType();
				
				if(type==CellType.STRING) 
				{
					System.out.print(mycell.getStringCellValue()+" ");
				}
				else if(type==CellType.NUMERIC) 
				{
					System.out.print(mycell.getNumericCellValue()+" ");
				}
				else if(type==CellType.BOOLEAN) 
				{
					System.out.print(mycell.getBooleanCellValue()+" ");
				}
        	}
        	System.out.println();

        }
	}

}

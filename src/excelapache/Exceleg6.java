package excelapache;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Exceleg6 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
	       File myfile = new File("D:\\Important\\Shilpa\\eclipse workspace\\examples.xlsx");
			
			//	FileInputStream myexcel = new FileInputStream(myfile);
			
			Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet3");
		
	
			for(int i=0;i<=3;i++) 
			{
				for(int j=0;j<=3;j++) 
				{
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
					System.out.println();
				}
			}

	}

}

package excelapache;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel8 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		 File myfile = new File("D:\\Important\\Shilpa\\eclipse workspace\\examples.xlsx");
			
			//	FileInputStream myexcel = new FileInputStream(myfile);
			
			Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet4");
		
			Cell mycell = mysheet.getRow(4).getCell(0);  //it will returns cell
			CellType datatype = mycell.getCellType();    //it will returns celltype
			System.out.println("cell type is "+datatype);  //it will print what type of data saved into 4 th row and 0th cell
			//here we check datatype to the what type of data saved into field using if else condition 
			
			if(datatype==CellType.STRING) 
			{
				System.out.println(mycell.getStringCellValue());
			}
			else if(datatype==CellType.NUMERIC)
			{
				System.out.println(mycell.getNumericCellValue());
			}
			else if(datatype==CellType.BOOLEAN)
			{
				System.out.println(mycell.getBooleanCellValue());
			}
		
		
			}

}

package excelapache;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Exceleg5 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
       File myfile = new File("D:\\Important\\Shilpa\\eclipse workspace\\examples.xlsx");
		
		//	FileInputStream myexcel = new FileInputStream(myfile);
		
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet3");
		Cell cellvalue = mysheet.getRow(0).getCell(0);
		CellType typeofdata = cellvalue.getCellType();
		if(typeofdata==CellType.STRING) 
		{
			System.out.println(cellvalue.getStringCellValue());
		}
		else if(typeofdata==CellType.NUMERIC)
		{
			System.out.println(cellvalue.getNumericCellValue());
		}
		else if(typeofdata==CellType.BOOLEAN)
		{
			System.out.println(cellvalue.getBooleanCellValue());
		}

	}

}

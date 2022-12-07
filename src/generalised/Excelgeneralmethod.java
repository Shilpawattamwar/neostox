package generalised;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelgeneralmethod {
	
	public static void readdatafromexcel(int row,int cell) throws EncryptedDocumentException, IOException {
	File myfilefolder = new File("D:\\Important\\Shilpa\\eclipse workspace\\examples.xlsx");
	Sheet mysheet=WorkbookFactory.create(myfilefolder).getSheet("Sheet3");
	mysheet.getRow(row).getCell(cell).getStringCellValue();

}
}
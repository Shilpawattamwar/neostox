package excelapache;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel7 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		 File myfile = new File("D:\\Important\\Shilpa\\eclipse workspace\\examples.xlsx");
			
			//	FileInputStream myexcel = new FileInputStream(myfile);
			
			Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet4");
			int lastrowno = mysheet.getLastRowNum();
			System.out.println("last row no is "+lastrowno);
			
			int lastcellno = mysheet.getRow(0).getLastCellNum();
			System.out.println("last cell no is "+lastcellno);
			System.out.println("**********************************************");
			int totalrowno = lastrowno+1;
			int totalcellno = lastcellno;
			
			System.out.println("total row no "+totalrowno);
			System.out.println("total cell no "+totalcellno);
		
		
	}

}

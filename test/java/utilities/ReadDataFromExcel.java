package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel
{
public String  getDataFromExcel(String Sheet, int row , int cell )   throws Throwable 
{
	
	
    FileInputStream eu = new FileInputStream(C_Data.Edata)	;

    
     Workbook wb = WorkbookFactory.create(eu);
     
    org.apache.poi.ss.usermodel.Sheet sh = wb.getSheet(Sheet);
     
 /*  org.apache.poi.ss.usermodel.Sheet sh = wb.getSheet(Sheet);
   
   Row r = sh.getRow(row);
   
   Cell c = r.getCell(cell);
   
*/     
     
     DataFormatter df = new DataFormatter();
     
     String Data = df.formatCellValue(sh.getRow(row).getCell(cell));
   
 // String Data =   wb.getSheet(Sheet).getRow(row).getCell(cell).getStringCellValue();
   
      
    return Data ;
     
     
       
     
     
     
     
     

}
}

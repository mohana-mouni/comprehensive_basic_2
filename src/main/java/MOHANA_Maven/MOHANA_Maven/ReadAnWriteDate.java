package MOHANA_Maven.MOHANA_Maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadAnWriteDate {

	public static void main(String[] args) 
	{  
 try {
		File file = new File("C:\\Users\\Donato\\Desktop\\assignmentworkspace\\MOHANA-Maven\\src\\main\\resources\\Testdata\\AssignmentData.xlsx");   
		FileInputStream fis = new FileInputStream(file);   
		 
		XSSFWorkbook wb = new XSSFWorkbook(fis);   
		XSSFSheet sheet = wb.getSheetAt(0);     
		Iterator<Row> iterator=sheet.iterator();
	       
        while(iterator.hasNext()) {
           Row nextrow=iterator.next();
           Iterator<Cell> celliterator=nextrow.cellIterator();
           
           while(celliterator.hasNext()) {
               Cell cell=celliterator.next();
               switch(cell.getCellType())
               {
               case STRING:
                   System.out.print(cell.getStringCellValue()); break;

               case NUMERIC:
                   System.out.print(cell.getNumericCellValue()); break;

               }
               System.out.print("|");
           }
         System.out.println();
         
        }}
        catch (Exception e) {
        	  
            e.printStackTrace();
        }
        
		} }

		 
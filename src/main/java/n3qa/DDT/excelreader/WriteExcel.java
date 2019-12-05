package n3qa.DDT.excelreader;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {
	

	
	public static void main(String[] args)  throws IOException{
		
		File xlFile = new File("D:\\AUTOMATION\\BnVFW\\newFile.xlsx");
		FileOutputStream out = new FileOutputStream(xlFile);
		XSSFWorkbook book = new XSSFWorkbook(); // Create the work book

		
		XSSFSheet sheet = book.createSheet("Test Data Sheet");
		

		
		XSSFRow sheetRow = sheet.createRow(0);
		

		
		XSSFCell cel = sheetRow.createCell(0,CellType.STRING);
		
		cel.setCellValue("Test Data cell");
		
		book.write(out);
		
		book.close();
		out.close();
		
		
	}

}

package n3qa.DDT.datadriven.exceldriven;

import org.testng.annotations.Test;

public class TestExcelReader {

	@Test
	public void testExcel(){
		ExcelReaderHelper excelReader = new ExcelReaderHelper("D:\\AUTOMATION\\BnVFWv2\\src\\main\\java\\n3qa\\DDT\\datadriven\\exceldriven\\testfile\\ExcelOne.xlsx");
		System.out.println(excelReader.getData("Sheet1", 1, 3));
		System.out.println(excelReader.getData("Sheet1", 4, 2));
		System.out.println(excelReader.getData("Sheet2", 1, 4));
		System.out.println(excelReader.getData("Sheet2", 2, 4));
	}
}

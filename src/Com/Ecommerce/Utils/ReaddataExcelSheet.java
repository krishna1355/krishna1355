package Com.Ecommerce.Utils;


import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReaddataExcelSheet {
	public static List<String>GetDataFromExcelSheet(String Sheetname,int row)throws Exception{
		List<String>data=new ArrayList<>();
		String Filepath=".//resources//"+Sheetname+".xlsx";
		FileInputStream fis=new FileInputStream(Filepath);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		 int cellcount =sheet.getRow(row).getLastCellNum();
		 for(int i=0;i<cellcount;i++) {
			  String celldata=sheet.getRow(row).getCell(i).getStringCellValue();
			  data.add(celldata);
		 
		 }
			  return data;
		 }
	
	
	@Test
	public void display() throws Exception
	{
		
	
	List<String> data=ReaddataExcelSheet.GetDataFromExcelSheet("EcomerceLogin",1);
			
		
	System.out.println(data);
		

	}

}

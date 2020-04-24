package excelUtil;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class MapDataProvider 
{
	
	public static final String EXCELFILELOCATION = "C:\\Users\\senthkum\\eclipse-workspace\\com.TestNG\\src\\test\\java\\dataSheet\\TestData.xlsx";

	public static FileInputStream fis;
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	

	public static void loadDataSheet() throws Exception
	{
		File file = new File(EXCELFILELOCATION);
		fis = new FileInputStream(file);
		workbook = new XSSFWorkbook(fis);
		fis.close();
	}
	
	public static Map<Object, Object> loadSheetName(String sheetNames) throws IOException
	{
		Map<Object, Object> mapData = new HashMap<Object, Object>(); 
		
		if (sheet == null) 
		{
			try {
				loadDataSheet();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		int sheetCnt = workbook.getNumberOfSheets();
		for (int ii = 0; ii < sheetCnt; ii++) 
		{
			String sheetName = workbook.getSheetName(ii);
			if (sheetName.equalsIgnoreCase(sheetNames)) 
			{
				sheet = workbook.getSheetAt(ii);
				break;
			}
		}
		
		int rowCnt = sheet.getLastRowNum();
		int colCnt = sheet.getRow(0).getLastCellNum();
		

		Object[][] data = new Object[rowCnt][colCnt];
		
		for(int i=0; i<rowCnt; i++)
		{
			for(int j=0; j<colCnt; j++)
			{
				String colValue = sheet.getRow(0).getCell(j).toString();
				String rowValue = sheet.getRow(i+1).getCell(j).toString();
				mapData.put(colValue, rowValue);
				data[i][0] = mapData; 
			}				
		} 
		return mapData;
	}



	
	
/*	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub

		Map<Object, Object> mapData1 = loadSheetName("Books");
		
		System.out.println(mapData1.get("UserName").toString());
		System.out.println(mapData1.get("Password").toString());
	}*/
}

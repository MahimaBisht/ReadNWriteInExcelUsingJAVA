package getExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetExcelData {
	public static void main(String[] args) throws IOException {
		XSSFWorkbook workbook;
		FileInputStream file;
		try {
			file = new FileInputStream("C:\\Users\\mahbisht\\Documents\\WORK_SPACES_STS\\CORE_JAVA_PRACTICE\\javaPractice\\resources\\files\\writeInExcel.xlsx");
		
		
			workbook = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheet("New Sheet");
			int count = sheet.getPhysicalNumberOfRows();
			System.out.println("number of rows : "+count);
//			System.out.println(sheet.getTopRow());returns index of top row
			//print data of rows and columns
			for(int i=1;i<=count;i++) {
				int j=0;
				while (sheet.getRow(i-1).getCell(j)!=null) {
					System.out.print(sheet.getRow(i-1).getCell(j)+"\t");j++;
				}
				System.out.print("\n");
			}
			
			XSSFWorkbook workbook2 = new XSSFWorkbook();
			XSSFSheet newSheet = workbook2.createSheet("New Sheet");
			
			Map<Integer,Object[]> data = new TreeMap<Integer,Object[]>();
			
			data.put(1, new Object[]{"id","name"});
			data.put(2, new Object[]{"1","name3"});
			data.put(3, new Object[]{"2","name4"});
			
			for(Integer key: data.keySet()) {
				Row row = newSheet.createRow(key-1);
				Object obj[] = data.get(key);
				int cellCount=0;
				for(Object value: obj) {
					Cell newCell = row.createCell(cellCount++);
					 newCell.setCellValue((String)value);
					
				}
			}
			
			FileOutputStream out = new FileOutputStream(new File("writeInExcel.xlsx"));
			
				workbook.write(out);
				out.close();
			
//			FileInputStream File = new FileInputStream(new File("writeInExcel.xlsx"));
			 	
			
		} 
			catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				System.out.println("FileNotFoundException");
			}
	
		
	}
}
package support.dataProvider;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class DataHub {

	public static HashMap<String, String> DataMap(String worksheet, int rowCount) {
		HashMap<String, String> currentHash = new HashMap<String, String>();
		try {
			FileInputStream fs = new FileInputStream(
					System.getProperty("user.dir") + "\\src\\main\\java\\resources\\testdata\\testdata.xlsx");
			XSSFWorkbook workbook = new XSSFWorkbook(fs);
			XSSFSheet sheet = workbook.getSheet(worksheet);
			Row headerRow = sheet.getRow(0);
			Row currentRow = sheet.getRow(rowCount);
			for (int j = 0; j < currentRow.getPhysicalNumberOfCells(); j++) {
				currentHash.put(headerRow.getCell(j).getStringCellValue(), currentRow.getCell(j).getStringCellValue());
			}
			workbook.close();
			fs.close();

		} catch (Exception ioe) {
			ioe.printStackTrace();
		}
		return currentHash;
	}

	public static HashMap<String, String> DataMap(String key, String value) {
		HashMap<String, String> currentHash = new HashMap<String, String>();
		currentHash.put(key, value);
		return currentHash;
	}

}

package support.dataProvider;

import java.util.ArrayList;
import java.util.HashMap;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class ExcelReaderUtility {
	
	static Fillo fillo;
	static Connection connection;
	static String strQuery;
	
	public static HashMap<String, String> DataMap(String tableName, int rowNum) throws FilloException {
		HashMap<String, String> currentHash = new HashMap<>();
		fillo = new Fillo();
		connection = fillo.getConnection(System.getProperty("user.dir") + "\\src\\test\\resources\\testdata\\testdata.xlsx");

		strQuery = "Select * from " + tableName;		
		Recordset rs = connection.executeQuery(strQuery);

		ArrayList<String> abc = rs.getFieldNames();
		while (rs.next()) 
		{
			for(int i=0;i<abc.size();i++)
			{
				System.out.println(rs.getField(abc.get(i)));
				currentHash.put(abc.get(i), rs.getField(abc.get(i)));
			}
		}

		return currentHash;
	}
	
	public static HashMap<String, String> DataMap(String tableName, String columnName, String columnValue) throws FilloException {
		HashMap<String, String> currentHash = new HashMap<>();
		fillo = new Fillo();
		connection = fillo.getConnection(System.getProperty("user.dir") + "\\src\\test\\resources\\testdata\\testdata.xlsx");

		strQuery = "Select * from " + tableName+" where "+columnName+"='"+columnValue+"'";
		System.out.println(strQuery);
		Recordset rs = connection.executeQuery(strQuery);

		ArrayList<String> abc = rs.getFieldNames();
		while (rs.next()) 
		{
			for(int i=0;i<abc.size();i++)
			{
				System.out.println(rs.getField(abc.get(i)));
				currentHash.put(abc.get(i), rs.getField(abc.get(i)));
			}
		}

		return null;
	}

}

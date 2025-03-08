package utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviders {

	
	@DataProvider(name="logindata")
	public String [] [] logind() throws IOException{
		
		String path=".//Testdata/Excelufi.xlsx";
		
		System.out.println("inside data provider utility class");
		
		excelUtility et= new excelUtility(path);
		int rows=et.totalrows("Sheet1");
		int cell=et.totalcolums("Sheet1", 1);
		System.out.println(rows);
		System.out.println(cell);
		
		String data[][]=new String[rows][cell];
		
		for(int i=1;i<=rows;i++) {
			for(int j=0;j<=cell;j++) {
				data [i][j]=et.getcelldata("Sheet1", i, j);
				System.out.println(data[i][j]);
				System.out.println("total number of iterations is "+i);
				
			}
		}
		System.out.println("inside last line of dtat provider class");
		
		return data;
	}
}

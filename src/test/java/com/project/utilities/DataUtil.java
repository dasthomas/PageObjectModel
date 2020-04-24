package com.project.utilities;

import java.util.Hashtable;



public class DataUtil {

	
	public static Object[][] gettestdata(String testname, Xls_Reader xls){
		
		   int teststartrownum=1;
		   
		   while(!xls.getCellData("Data", 0, teststartrownum).equals(testname)) {
			   teststartrownum++;
		   }
		   System.out.println("Row num of testcase is:"+teststartrownum);
		   
		   int colstartrownum=teststartrownum+1;
		   int totalcols=0;
		   while(!xls.getCellData("Data", totalcols, colstartrownum).equals("")) {
			   totalcols++;
		   }
		   System.out.println("Cols are"+totalcols );
		   int datastartrownum=teststartrownum+2;
		   int totalrow=0;
		   while(!xls.getCellData("Data", 0, datastartrownum).equals("")) {
			totalrow++;
			datastartrownum++;
		   }
		   System.out.println("Row found"+totalrow);
		   
		   datastartrownum=teststartrownum+2;
		   int finalrow=datastartrownum+totalrow;
		   Object[][] testdata=new Object[totalrow][1];
		   int i=0;
		   Hashtable<String,String> table=null;
		   for(int rnum=datastartrownum;rnum<finalrow;rnum++) {
			   table=new Hashtable<String, String>();
			   for(int col=0;col<totalcols;col++) {
				   String data=xls.getCellData("Data", col, rnum);
				   String key=xls.getCellData("Data", col, colstartrownum);
				   table.put(key, data);
				   }
			   testdata[i][0]=table;
			   i++;
			   System.out.println(table);
			   System.out.println("---------------------------------");
		
	}
	return testdata;
	}
	
}

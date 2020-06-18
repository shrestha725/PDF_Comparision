package com.Netsweet.PDF.Comparision;

import java.io.IOException;


import de.redsix.pdfcompare.PdfComparator;
import utilities.FilesClass;

public class TestCompare {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		//String file1="C:\\Users\\ashrestha\\Desktop\\Before Updat5e Check\\Test1_BeforeUpdate.pdf";
		//String file2="C:\\Users\\ashrestha\\Desktop\\AfterUpdateCheck\\Test2-AfterUpdate.pdf";
		
//		String file1="C:\\Users\\ashrestha\\Desktop\\TEST-RESULT\\11713_2019-02-20_182502.pdf";// This is validated file
//		String file2="C:\\Users\\ashrestha\\Desktop\\AfterUpdateCheck\\11679_2019-02-18_111339.pdf";/// after fix needs validation by comparing to file1
//		String resultFile= "C:\\Users\\ashrestha\\Desktop\\Result\\result";
		
		
		String file1="C:\\Users\\ashrestha\\Desktop\\806131_2019-03-13_152342.pdf";// This is validated file
		String file2="C:\\Users\\ashrestha\\Desktop\\806132_2019-03-13_152906.pdf";/// after fix needs validation by comparing to file1
		String resultFile= "C:\\Users\\ashrestha\\Desktop\\Result\\result";
		
		
/*		String file1="C:\\Users\\ashrestha\\Desktop\\BeforeUpdat5eCheck\\Create_a_Payment_applying_Discount_ProcessPayment_downloadPDFforComparision\\11714_2019-02-20_183009.pdf";// This is validated file
		String file2="C:\\Users\\ashrestha\\Desktop\\AfterUpdateCheck\\Create_a_Payment_applying_Discount_ProcessPayment_downloadPDFforComparision\\11714_2019-02-20_183009.pdf";/// after fix needs validation by comparing to file1
		String resultFile= "C:\\Users\\ashrestha\\Desktop\\Result\\result";*/
		new PdfComparator(file1, file2).compare().writeTo(resultFile);
		
	}	
		
		
	
/*  public static void main(String[] args) throws Exception {
	  
  
	
	String a= FilesClass.getMyFileName("C:\\Users\\ashrestha\\Desktop\\AfterUpdateCheck\\Create_a_Payment_applying_Discount_ProcessPayment_downloadPDFforComparision");
	System.out.println("returned value"+a);
	*/
}
	
	
	
	
	


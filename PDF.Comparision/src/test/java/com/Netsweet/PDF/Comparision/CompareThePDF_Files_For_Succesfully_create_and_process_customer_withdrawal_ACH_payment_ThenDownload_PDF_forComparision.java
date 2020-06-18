package com.Netsweet.PDF.Comparision;

import de.redsix.pdfcompare.PdfComparator;
import utilities.FilesClass;

public class CompareThePDF_Files_For_Succesfully_create_and_process_customer_withdrawal_ACH_payment_ThenDownload_PDF_forComparision{
	
	
	public static void main(String[] args) throws Exception {
		////// TODO Auto-generated method stub
/*		String a= FilesClass.getMyFileName("C:\\Users\\ashrestha\\Desktop\\BeforeUpdat5eCheck\\Create_a_Payment_applying_Discount_ProcessPayment_downloadPDFforComparision");
		System.out.println("returned value"+a);
		
		
		String file1="C:\\Users\\ashrestha\\Desktop\\BeforeUpdat5eCheck\\Create_a_Payment_applying_Discount_ProcessPayment_downloadPDFforComparision\\"+a;
		System.out.println(file1);
		String file2="C:\\Users\\ashrestha\\Desktop\\AfterUpdateCheck\\11714_2019-02-20_183009.pdf";/// after fix needs validation by comparing to file1
		/////////String resultFile= "C:\\Users\\ashrestha\\Desktop\\Result\\"+"Create_a_Payment_applying_Discount_ProcessPayment_downloadPDFforComparision";
		String resultFile= "C:\\Users\\ashrestha\\Desktop\\Result\\"+a +"-Result--Compare_a_curentPDFPayments_Applying_Discount_WithPreviouslyVerifiedPDFfiles";
		///////String resultFile= "C:\\Users\\ashrestha\\Desktop\\Result\\"+a;
		new PdfComparator(file1, file2).compare().writeTo(resultFile);*/
		
		String a= FilesClass.getMyFileName("C:\\Users\\ashrestha\\Desktop\\CurentTestPDF\\Succesfully_create_and_process_customer_withdrawal_ACH_payment_ThenDownload_PDF_forComparision");
		System.out.println("returned value"+a);
		
		
		String file1="C:\\Users\\ashrestha\\Desktop\\CurentTestPDF\\Succesfully_create_and_process_customer_withdrawal_ACH_payment_ThenDownload_PDF_forComparision\\"+a;
		System.out.println("file1-"+file1);
		String file2="C:\\Users\\ashrestha\\Desktop\\ManuallyVerifiedPDF\\Succesfully_create_and_process_customer_withdrawal_ACH_payment_ThenDownload_PDF_forComparision\\11811_2019-02-26_111348.pdf";/// after fix needs validation by comparing to file1
		/////////String resultFile= "C:\\Users\\ashrestha\\Desktop\\Result\\"+"Create_a_Payment_applying_Discount_ProcessPayment_downloadPDFforComparision";
		String resultFile= "C:\\Users\\ashrestha\\Desktop\\Result\\"+a +"-Succesfully_create_and_process_customer_withdrawal_ACH_payment_ThenDownload_PDF_forComparision";
		System.out.println("file2-"+file2);
		new PdfComparator(file1, file2).compare().writeTo(resultFile);
		
		
	}

}

	
	
	
	
	
	
	



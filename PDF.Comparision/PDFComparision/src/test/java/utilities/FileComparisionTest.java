package utilities;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;
import org.testng.annotations.Test;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import de.redsix.pdfcompare.PdfComparator;
import utilities.FilesClass;

public class FileComparisionTest {
;


@Test



public void Create_a_Bill_Payment_With_Checks_Enter_JournalEntry_Discount_n_Credits_n_ProcessPayment_WhileApproval_isDissabled_ThenDownload_PDF_4() throws IOException

{
	FilesClass fileClass= new FilesClass();
	
	String testcaseName= "Create_a_Bill_Payment_With_Checks_Enter_JournalEntry_Discount_n_Credits_n_ProcessPayment_WhileApproval_isDissabled_ThenDownload_PDF_4";
	String ActualFileName= FilesClass.getMyFileName(fileClass.getactualdir()+testcaseName+"\\");
	System.out.println("returned value Actual file name: "+ActualFileName);
	String ExpectedFileName= FilesClass.getMyFileName(fileClass.getExpecteddir()+testcaseName+"\\");
	System.out.println("returned value expected file name: "+ExpectedFileName);
	String file1= 	fileClass.getactualdir()+testcaseName+"\\"+ActualFileName;
    String file2= 	fileClass.getExpecteddir()+testcaseName+"\\"+ExpectedFileName;// This is validated file
	String resultFile= fileClass.getCommonPath()+"\\PDF_Results\\"+testcaseName;
	//String ignoreFile= "C:\\Users\\"+fileClass.getSystemUser()+"\\eclipse\\eclipse-workspace\\PDF.Comparision\\PDFComparision\\ignore.conf";
	new PdfComparator(file1, file2).compare().writeTo(resultFile);
		
	
}

@Test



public void Create_a_Bill_Payment_With_Checks_Enter_JournalEntry_Discount_n_Credits_n_ProcessPayment_WhileApproval_isEnabled_ThenDownload_PDF_3() throws IOException

{
	FilesClass fileClass= new FilesClass();
	
	String testcaseName= "Create_a_Bill_Payment_With_Checks_Enter_JournalEntry_Discount_n_Credits_n_ProcessPayment_WhileApproval_isEnabled_ThenDownload_PDF_3";
	String ActualFileName= FilesClass.getMyFileName(fileClass.getactualdir()+testcaseName+"\\");
	System.out.println("returned value Actual file name: "+ActualFileName);
	String ExpectedFileName= FilesClass.getMyFileName(fileClass.getExpecteddir()+testcaseName+"\\");
	System.out.println("returned value expected file name: "+ExpectedFileName);
	String file1= 	fileClass.getactualdir()+testcaseName+"\\"+ActualFileName;
    String file2= 	fileClass.getExpecteddir()+testcaseName+"\\"+ExpectedFileName;// This is validated file
	String resultFile= fileClass.getCommonPath()+"\\PDF_Results\\"+testcaseName;
	//String ignoreFile= "C:\\Users\\"+fileClass.getSystemUser()+"\\eclipse\\eclipse-workspace\\PDF.Comparision\\PDFComparision\\ignore.conf";
	new PdfComparator(file1, file2).compare().writeTo(resultFile);
		
	
}


@Test



public void Successfully_Create_And_Process_Discount_For_Checks_Payment_While_Approval_isEnabled_PDF_1() throws IOException

{
	FilesClass fileClass= new FilesClass();
	
	String testcaseName= "Successfully_Create_And_Process_Discount_For_Checks_Payment_While_Approval_isEnabled_PDF_1";
	String ActualFileName= FilesClass.getMyFileName(fileClass.getactualdir()+testcaseName+"\\");
	System.out.println("returned value Actual file name: "+ActualFileName);
	String ExpectedFileName= FilesClass.getMyFileName(fileClass.getExpecteddir()+testcaseName+"\\");
	System.out.println("returned value expected file name: "+ExpectedFileName);
	String file1= 	fileClass.getactualdir()+testcaseName+"\\"+ActualFileName;
    String file2= 	fileClass.getExpecteddir()+testcaseName+"\\"+ExpectedFileName;// This is validated file
	String resultFile= fileClass.getCommonPath()+"\\PDF_Results\\"+testcaseName;
	//String ignoreFile= "C:\\Users\\"+fileClass.getSystemUser()+"\\eclipse\\eclipse-workspace\\PDF.Comparision\\PDFComparision\\ignore.conf";
	new PdfComparator(file1, file2).compare().writeTo(resultFile);
		
	
}
@Test



public void Create_a_Check_Payment_applying_Discount_n_ProcessPayment_ThenDownload_PDF_2() throws IOException

{
	FilesClass fileClass= new FilesClass();
	
	String testcaseName= "Create_a_Check_Payment_applying_Discount_n_ProcessPayment_ThenDownload_PDF_2";
	String ActualFileName= FilesClass.getMyFileName(fileClass.getactualdir()+testcaseName+"\\");
	System.out.println("returned value Actual file name: "+ActualFileName);
	String ExpectedFileName= FilesClass.getMyFileName(fileClass.getExpecteddir()+testcaseName+"\\");
	System.out.println("returned value expected file name: "+ExpectedFileName);
	String file1= 	fileClass.getactualdir()+testcaseName+"\\"+ActualFileName;
    String file2= 	fileClass.getExpecteddir()+testcaseName+"\\"+ExpectedFileName;// This is validated file
	String resultFile= fileClass.getCommonPath()+"\\PDF_Results\\"+testcaseName;
	//String ignoreFile= "C:\\Users\\"+fileClass.getSystemUser()+"\\eclipse\\eclipse-workspace\\PDF.Comparision\\PDFComparision\\ignore.conf";
	new PdfComparator(file1, file2).compare().writeTo(resultFile);
		
	
}
@Test



public void MEMO_Create_a_Bill_Payment_With_Checks_Enter_JournalEntry_Discount_n_Credits_n_ProcessPayment_WhileApproval_isDissabled_PDF_5() throws IOException

{
	FilesClass fileClass= new FilesClass();
	
	String testcaseName= "MEMO_Create_a_Bill_Payment_With_Checks_Enter_JournalEntry_Discount_n_Credits_n_ProcessPayment_WhileApproval_isDissabled_PDF_5";
	String ActualFileName= FilesClass.getMyFileName(fileClass.getactualdir()+testcaseName+"\\");
	System.out.println("returned value Actual file name: "+ActualFileName);
	String ExpectedFileName= FilesClass.getMyFileName(fileClass.getExpecteddir()+testcaseName+"\\");
	System.out.println("returned value expected file name: "+ExpectedFileName);
	String file1= 	fileClass.getactualdir()+testcaseName+"\\"+ActualFileName;
    String file2= 	fileClass.getExpecteddir()+testcaseName+"\\"+ExpectedFileName;// This is validated file
	String resultFile= fileClass.getCommonPath()+"\\PDF_Results\\"+testcaseName;
	//String ignoreFile= "C:\\Users\\"+fileClass.getSystemUser()+"\\eclipse\\eclipse-workspace\\PDF.Comparision\\PDFComparision\\ignore.conf";
	new PdfComparator(file1, file2).compare().writeTo(resultFile);
		
	
}
@Test



public void Create_a_Bill_Payment_With_Checks_Enter_Negative_JournalEntry_Discount_n_Credits_n_ProcessPayment_WhileApproval_isDissabled_PDF_6() throws IOException

{
	FilesClass fileClass= new FilesClass();
	
	String testcaseName= "Create_a_Bill_Payment_With_Checks_Enter_Negative_JournalEntry_Discount_n_Credits_n_ProcessPayment_WhileApproval_isDissabled_PDF_6";
	String ActualFileName= FilesClass.getMyFileName(fileClass.getactualdir()+testcaseName+"\\");
	System.out.println("returned value Actual file name: "+ActualFileName);
	String ExpectedFileName= FilesClass.getMyFileName(fileClass.getExpecteddir()+testcaseName+"\\");
	System.out.println("returned value expected file name: "+ExpectedFileName);
	String file1= 	fileClass.getactualdir()+testcaseName+"\\"+ActualFileName;
    String file2= 	fileClass.getExpecteddir()+testcaseName+"\\"+ExpectedFileName;// This is validated file
	String resultFile= fileClass.getCommonPath()+"\\PDF_Results\\"+testcaseName;
	//String ignoreFile= "C:\\Users\\"+fileClass.getSystemUser()+"\\eclipse\\eclipse-workspace\\PDF.Comparision\\PDFComparision\\ignore.conf";
	new PdfComparator(file1, file2).compare().writeTo(resultFile);
		
	
}
@Test



public void Successfully_Create_And_Process_Discount_For_ACH_Payment_While_Approval_isEnabled_VendorNoEmail_PDF_7() throws IOException

{
	FilesClass fileClass= new FilesClass();
	
	String testcaseName= "Successfully_Create_And_Process_Discount_For_ACH_Payment_While_Approval_isEnabled_VendorNoEmail_PDF_7";
	String ActualFileName= FilesClass.getMyFileName(fileClass.getactualdir()+testcaseName+"\\");
	System.out.println("returned value Actual file name: "+ActualFileName);
	String ExpectedFileName= FilesClass.getMyFileName(fileClass.getExpecteddir()+testcaseName+"\\");
	System.out.println("returned value expected file name: "+ExpectedFileName);
	String file1= 	fileClass.getactualdir()+testcaseName+"\\"+ActualFileName;
    String file2= 	fileClass.getExpecteddir()+testcaseName+"\\"+ExpectedFileName;// This is validated file
	String resultFile= fileClass.getCommonPath()+"\\PDF_Results\\"+testcaseName;
	//String ignoreFile= "C:\\Users\\"+fileClass.getSystemUser()+"\\eclipse\\eclipse-workspace\\PDF.Comparision\\PDFComparision\\ignore.conf";
	new PdfComparator(file1, file2).compare().writeTo(resultFile);
		
	
}
@Test



public void Succesfully_create_and_process_customer_withdrawal_ACH_payment_ThenDownload_PDF_8() throws IOException

{
	FilesClass fileClass= new FilesClass();
	
	String testcaseName= "Succesfully_create_and_process_customer_withdrawal_ACH_payment_ThenDownload_PDF_8";
	String ActualFileName= FilesClass.getMyFileName(fileClass.getactualdir()+testcaseName+"\\");
	System.out.println("returned value Actual file name: "+ActualFileName);
	String ExpectedFileName= FilesClass.getMyFileName(fileClass.getExpecteddir()+testcaseName+"\\");
	System.out.println("returned value expected file name: "+ExpectedFileName);
	String file1= 	fileClass.getactualdir()+testcaseName+"\\"+ActualFileName;
    String file2= 	fileClass.getExpecteddir()+testcaseName+"\\"+ExpectedFileName;// This is validated file
	String resultFile= fileClass.getCommonPath()+"\\PDF_Results\\"+testcaseName;
	//String ignoreFile= "C:\\Users\\"+fileClass.getSystemUser()+"\\eclipse\\eclipse-workspace\\PDF.Comparision\\PDFComparision\\ignore.conf";
	new PdfComparator(file1, file2).compare().writeTo(resultFile);
		
	
}
@Test



public void Create_an_ACH_Payment_VendorWithNoEmailAddress_n_ProcessPayment_WhileApproval_isEnabled_ThenCompare_PDF_9() throws IOException

{
	FilesClass fileClass= new FilesClass();
	
	String testcaseName= "Create_an_ACH_Payment_VendorWithNoEmailAddress_n_ProcessPayment_WhileApproval_isEnabled_ThenCompare_PDF_9";
	String ActualFileName= FilesClass.getMyFileName(fileClass.getactualdir()+testcaseName+"\\");
	System.out.println("returned value Actual file name: "+ActualFileName);
	String ExpectedFileName= FilesClass.getMyFileName(fileClass.getExpecteddir()+testcaseName+"\\");
	System.out.println("returned value expected file name: "+ExpectedFileName);
	String file1= 	fileClass.getactualdir()+testcaseName+"\\"+ActualFileName;
    String file2= 	fileClass.getExpecteddir()+testcaseName+"\\"+ExpectedFileName;// This is validated file
	String resultFile= fileClass.getCommonPath()+"\\PDF_Results\\"+testcaseName;
	//String ignoreFile= "C:\\Users\\"+fileClass.getSystemUser()+"\\eclipse\\eclipse-workspace\\PDF.Comparision\\PDFComparision\\ignore.conf";
	new PdfComparator(file1, file2).compare().writeTo(resultFile);
		
	
}
@Test



public void Create_an_Expense_Report_Process_Payment_No_ApprovalNeeded_PDF_10() throws IOException

{
	FilesClass fileClass= new FilesClass();
	
	String testcaseName= "Create_an_Expense_Report_Process_Payment_No_ApprovalNeeded_PDF_10";
	String ActualFileName= FilesClass.getMyFileName(fileClass.getactualdir()+testcaseName+"\\");
	System.out.println("returned value Actual file name: "+ActualFileName);
	String ExpectedFileName= FilesClass.getMyFileName(fileClass.getExpecteddir()+testcaseName+"\\");
	System.out.println("returned value expected file name: "+ExpectedFileName);
	String file1= 	fileClass.getactualdir()+testcaseName+"\\"+ActualFileName;
    String file2= 	fileClass.getExpecteddir()+testcaseName+"\\"+ExpectedFileName;// This is validated file
	String resultFile= fileClass.getCommonPath()+"\\PDF_Results\\"+testcaseName;
	//String ignoreFile= "C:\\Users\\"+fileClass.getSystemUser()+"\\eclipse\\eclipse-workspace\\PDF.Comparision\\PDFComparision\\ignore.conf";
	new PdfComparator(file1, file2).compare().writeTo(resultFile);
		
	
}



@Test



public void Successfully_Create_Process_a_Check_With_Memo_n_Expense_Memo_Edit_it_andAddItem_With_Quantity_TaxCode_n_Location_PDF11() throws IOException

{
	FilesClass fileClass= new FilesClass();
	
	String testcaseName= "Successfully_Create_Process_a_Check_With_Memo_n_Expense_Memo_Edit_it_andAddItem_With_Quantity_TaxCode_n_Location_PDF11";
	String ActualFileName= FilesClass.getMyFileName(fileClass.getactualdir()+testcaseName+"\\");
	System.out.println("returned value Actual file name: "+ActualFileName);
	String ExpectedFileName= FilesClass.getMyFileName(fileClass.getExpecteddir()+testcaseName+"\\");
	System.out.println("returned value expected file name: "+ExpectedFileName);
	String file1= 	fileClass.getactualdir()+testcaseName+"\\"+ActualFileName;
    String file2= 	fileClass.getExpecteddir()+testcaseName+"\\"+ExpectedFileName;// This is validated file
	String resultFile= fileClass.getCommonPath()+"\\PDF_Results\\"+testcaseName;
	//String ignoreFile= "C:\\Users\\"+fileClass.getSystemUser()+"\\eclipse\\eclipse-workspace\\PDF.Comparision\\PDFComparision\\ignore.conf";
	new PdfComparator(file1, file2).compare().writeTo(resultFile);
		
	
}




}

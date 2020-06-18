package utilities;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import javax.naming.spi.DirectoryManager;

import de.redsix.pdfcompare.PdfComparator;

public  class FilesClass
{
	
	

         private static void copyFileUsingJava7Files(File source, File dest) throws IOException {
                            Files.copy(source.toPath(), dest.toPath());
}
        
        private String sysUser = getSystemUser();
 		private String CommonPath= "C:\\Users\\"+sysUser+"\\source\\repos\\avidxchange-afn\\AFN-NetSuites-TestFramework";
 		private String actualdir= "C:\\Users\\"+sysUser+"\\source\\repos\\avidxchange-afn\\AFN-NetSuites-TestFramework\\Actual_PDF_Files\\";
 		private String Expecteddir= "C:\\Users\\"+sysUser+"\\source\\repos\\avidxchange-afn\\AFN-NetSuites-TestFramework\\Expected_PDF_Files\\";
	
 		public  String getCommonPath()
 		
 		{
 			
 			return this.CommonPath;
 		}
	
	  // public String gettestcaseName()
 		
 		//{
 			
 			//return this.testcaseName;
 		//}
	   
	   public String getactualdir()
		
	 		{
	 			
	 			return this.actualdir;
	 		}
	   
	   public String getExpecteddir()
		
		{
			
			return this.Expecteddir;
		}
  
	   public String getSystemUser()
	   
	   {
		   String systemUser= System.getProperty("user.name");
	
		   String systemUserL = systemUser.toLowerCase();// Trimed to lower case
		   System.out.println(systemUserL);
		   return systemUser;
		   
	   }
	   
	public  static String getMyFileName(String filePath)
	{
		String name=null;
         File folder = new File(filePath);
         File[] listOfFiles = folder.listFiles();

         for (int i = 0; i < listOfFiles.length; i++) {
           if (listOfFiles[i].isFile()) {
             /*System.out.println("File " + listOfFiles[i].getName());*/
        	  name= listOfFiles[i].getName();
           } else if (listOfFiles[i].isDirectory()) {
        	   System.out.println("Directory " + listOfFiles[i].getName());
           }
          
         }
		return name;
	
	
	
	
	
	
	
	
	
		

	/*		public void Copyfiles(String origin, String destiNation)
			{
				String[] filePaths = DirectoryManager.GetFiles(origin);
				foreach (var filename in filePaths)
				{
					string file = filename.ToString();

					//Do your job with "file"

					string str = destiNation + file.ToString();
					if (!File.Exists(str))
					{
						File.Copy(file, str);
					}
				}
			}




			public void Readfiles()
			{
				string[] filePaths = Directory.GetFiles("Your Path");
				foreach (var filename in filePaths)
				{
					string file = filename.ToString();

					//Do your job with "file"

					string str = "Your Destination" + file.ToString();
					if (!File.Exists(str))
					{
						File.Copy(file, str);
					}
				}
			}

			public void otherMethodCopyFile2()

			{


				string sourceDir = @"c:\Users\ashrestha\Downloads";
				string backupDir = @"c:\Users\ashrestha\Desktop\TEST-RESULT";

				//////////string sourceDir = @"c:\current";
				//////////string backupDir = @"c:\archives\2008";

				try
				{
					string[] picList = Directory.GetFiles(sourceDir, "*.pdf");
					string[] txtList = Directory.GetFiles(sourceDir, "*.txt");

					// Copy pdf files.
					foreach (string f in picList)
					{
						// Remove path from the file name.
						string fName = f.Substring(sourceDir.Length + 1);

						// Use the Path.Combine method to safely append the file name to the path.
						// Will overwrite if the destination file already exists.
						File.Copy(Path.Combine(sourceDir, fName), Path.Combine(backupDir, fName), true);
					}

					// Copy text files.
					foreach (string f in txtList)
					{

						// Remove path from the file name.
						string fName = f.Substring(sourceDir.Length + 1);

						try
						{
							// Will not overwrite if the destination file already exists.
							File.Copy(Path.Combine(sourceDir, fName), Path.Combine(backupDir, fName));
						}

						// Catch exception if the file was already copied.
						catch (IOException copyError)
						{
							Console.WriteLine(copyError.Message);
						}
					}

					// Delete source files that were copied.
					foreach (string f in txtList)
					{
						File.Delete(f);
					}
					foreach (string f in picList)
					{
						File.Delete(f);
					}
				}

				catch (DirectoryNotFoundException dirNotFound)
				{
					Console.WriteLine(dirNotFound.Message);
				}












			}
			public void otherMethodCopyFile(string sourceDir, string backupDir)

			{
				


				//string sourceDir = @"c:\Users\ashrestha\Downloads";
				//string backupDir = @"c:\Users\ashrestha\Desktop\TEST-RESULT";

				//////////string sourceDir = @"c:\current";
				//////////string backupDir = @"c:\archives\2008";

				try
				{
					string[] picList = Directory.GetFiles(sourceDir, "*.pdf");
					string[] txtList = Directory.GetFiles(sourceDir, "*.txt");

					// Copy pdf files.
					foreach (string f in picList)
					{
						// Remove path from the file name.
						string fName = f.Substring(sourceDir.Length + 1);

						// Use the Path.Combine method to safely append the file name to the path.
						// Will overwrite if the destination file already exists.
						File.Copy(Path.Combine(sourceDir, fName), Path.Combine(backupDir, fName), true);
					}

					// Copy text files.
					foreach (string f in txtList)
					{

						// Remove path from the file name.
						string fName = f.Substring(sourceDir.Length + 1);

						try
						{
							// Will not overwrite if the destination file already exists.
							File.Copy(Path.Combine(sourceDir, fName), Path.Combine(backupDir, fName));
						}

						// Catch exception if the file was already copied.
						catch (IOException copyError)
						{
							Console.WriteLine(copyError.Message);
						}
					}

					// Delete source files that were copied.
					foreach (string f in txtList)
					{
						File.Delete(f);
					}
					foreach (string f in picList)
					{
						File.Delete(f);
					}
				}

				catch (DirectoryNotFoundException dirNotFound)
				{
					Console.WriteLine(dirNotFound.Message);
				}


			}
				public void delFile(string myDirectory)

			{
				System.IO.DirectoryInfo di = new DirectoryInfo(myDirectory);//

				foreach (FileInfo file in di.GetFiles())
				{
					file.Delete();
				}
				foreach (DirectoryInfo dir in di.GetDirectories())
				{
					dir.Delete(true);
				}

			}

			public void Delete_All_files_FromGivenFolderPath()
			{
				Files file = new Files();

				//////////file.delFile("C:\\Users\\ashrestha\\Desktop\\TEST-RESULT");// From Test Result folder
				file.delFile("C:\\Users\\ashrestha\\Downloads");// from download folder
																//System.IO.DirectoryInfo di = new DirectoryInfo(myDirectory);//

				////////////foreach (FileInfo file in di.GetFiles())
				////////////{
				////////////	file.Delete();
				////////////}
				////////////foreach (DirectoryInfo dir in di.GetDirectories())
				////////////{
				////////////	dir.Delete(true);
				////////////}
			}

		


			public void Delete_All_files_FromDownloadsFolder()
			{
				Files file = new Files();

				//////////file.delFile("C:\\Users\\ashrestha\\Desktop\\TEST-RESULT");// From Test Result folder
				file.delFile("C:\\Users\\ashrestha\\Downloads");// from download folder
																//System.IO.DirectoryInfo di = new DirectoryInfo(myDirectory);//

				////////////foreach (FileInfo file in di.GetFiles())
				////////////{
				////////////	file.Delete();
				////////////}
				////////////foreach (DirectoryInfo dir in di.GetDirectories())
				////////////{
				////////////	dir.Delete(true);
				////////////}
			}

			//////public string GetFileName1()


			//////{
			//////	string dir = "C:\\Users\\ashrestha\\Desktop\\TEST-RESULT";

			
			//////string[] files = Directory.GetFiles(dir);
			//////	foreach (string file in files)
			//////	{
			//////		return Path.GetFileName(file);


			//////	}

			//////}

			public string GetItemValue()
			{
				string name = null;
				string dir = "C:\\Users\\ashrestha\\Desktop\\TEST-RESULT";


				string[] files = Directory.GetFiles(dir);
				foreach (string file in files)
				{
					name=Path.GetFileName(file);


				}
				
				return name; // Without overwriting it with this but the compiler requires me to return a value here
			}


			public string GetItemValueWithFolderPath(string dir)
			{
				string name = null;
				


				string[] files = Directory.GetFiles(dir);
				foreach (string file in files)
				{
					name = Path.GetFileName(file);


				}

				return name; // Without overwriting it with this but the compiler requires me to return a value here
			}

		}*/
	}
	
	
	
	public void ComparePdfFiles(String testcaseName) throws IOException                                                                      
	{                                                                                                                                       
	                                                                                                                                        
	FilesClass fileClass= new FilesClass();                                                                                                 
	////// TODO Auto-generated method stub;                                                                                                 
	                                                                                                                                        
	//String testcaseName= "";                                                                                                                
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

	
	
	
	
	
	
	
	
	



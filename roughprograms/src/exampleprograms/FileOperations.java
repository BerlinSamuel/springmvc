package exampleprograms;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class FileOperations {
	public static void main(String[] args) throws Exception {
		//fileCreate();
		//fileRename();
		//copyFile();
		//deleteFile();
		//appendDataToFile();
		//moveFile();
		//modifyDataInFile();
		readDataFromFile();
		}	
		public static void fileCreate() {
				try {
			File file= new File("D:\\rough program\\rough.txt");
			if(file.createNewFile()) {
				System.out.println("File Created"+file.getName());
			}else {
				System.out.println("File name already exsist");
			}
		}catch(IOException e) {
			System.out.println("An error Occured");
			e.printStackTrace();
		}	
		}
		public static void fileRename() {
			File file= new File("D:\\rough program\\rough.txt");
			File rename= new File("D:\\rough program\\rough1.txt");
			boolean flag=file.renameTo(rename);
			if(flag==true) {
		System.out.println("File Renamed Successfully");
	}else {
		System.out.println("File Cannot be Renamed");
	}
	}
		public static void deleteFile() {
			File file=new File("D:\\rough program\\rough.txt");
			if(file.delete()) {
				System.out.println("File deleted successfully");
			}else {
				System.out.println("File cannot be deleted");
			}
		}
		public static void copyFile() throws IOException {
			File file=new File("D:\\rough program\\rough1.txt");
			File copyFile=new File("D:\\rough program\\sample.txt");
			Files.copy(file.toPath(),copyFile.toPath());
		}
		public static void appendDataToFile() {
		try (  FileWriter f = new FileWriter("D:\\rough program\\sample.txt",true))
		{
            
            f.append(" Welcome To Chainsys ");
        } 
    catch (IOException i) {
    	i.printStackTrace(); 
    	}
        }
		
		public static void moveFile()
	    {
	        
	        String str = "D:\\rough program\\rough1.txt";
	        String str1 = "D:\\rough program\\moveto.txt";
	        Path path;
	        try {
	            path = Files.move(Paths.get(str), Paths.get(str1));
	            if(path != null) 
	            { 
	                System.out.println("File moved successfully"); 
	        } 
	            }
	        
	        catch (IOException e) {
	            System.out.println("Cannot able to move this file"); 
	            e.printStackTrace();
	        }
}
		public static void modifyDataInFile() throws Exception
	    {
	        
	        FileOutputStream fileOutputStream = new FileOutputStream("D:\\rough program\\moveto.txt");
	        
	        String modify = "Data is modified!!!";
	        byte[] b = modify.getBytes();
	        fileOutputStream.write(b);
	        fileOutputStream.close();
	        System.out.println("Modification is Successfully Completed");
	        
	        FileInputStream fileInputStream = new FileInputStream("D:\\rough program\\moveto.txt");
	        int i;
	        while((i=fileInputStream.read())!=-1)
	        {
	        System.out.print((char)i);
	        }
	        fileInputStream.close();
	    }
		 public static void readDataFromFile()
		    {
		         FileReader fileReader = null;
		         
		        try {
		            fileReader = new FileReader("D:\\rough program\\moveto.txt");
		            System.out.println("File is found!!");
		            
		        } 
		        catch (FileNotFoundException e) {
		            
		            System.out.println("File is not found!!");
		            e.printStackTrace();
		        }
		        
		        int i;
		        try {
		            while ((i = fileReader.read()) != -1)
		            System.out.print((char)i);
		            System.out.println("\n Data in file was readed successfully!!");
		        } catch (IOException e) {
		            System.out.println("Data not read!!");
		            e.printStackTrace();
		        }
		    }
		}
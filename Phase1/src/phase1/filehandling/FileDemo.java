package phase1.filehandling;

import java.io.File;
import java.io.IOException;

public class FileDemo {
	
	   public static void main(String args[])
	{
		   try 
		   {  
	       File file = new File("C://JS//FileDemo.txt");
	       
	       if (file.createNewFile())
	       {
	    	   System.out.println("File Created !!!");
	       }
	       
	       else if(file.exists())
	       {
	    	   System.out.println("File already exist");
	    	   System.out.println("File Name : " + file.getName());
	    	   System.out.println("File Parent : " + file.getParent());
	    	   System.out.println("File Path : " + file.getPath());
	    	   System.out.println("File Length : " + file.length());
	       }
	       
	       else
	       {
	    	   System.out.println("File Doesn't exist");
	       }
		   }catch (IOException e) {
			e.printStackTrace();
		}
	}

}

package phase1.Assessment;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;


public class Part1 {
	
	public static void main(String args[]) throws IOException,FileNotFoundException
	{
		Scanner scan = new Scanner(System.in);
		int choice;
		int sub,read;
		String newfile,deletefile;
		String[] dirfile;
		File dir = new File("C://JS");
		File[] files = dir.listFiles();
		char[] ch = null;
		
		System.out.println("*********** Phase-1 Assessment ***********");
		System.out.println("*********** File Handling Project ********");
		
		System.out.println("\n1. Retrieve File/Folder");
		System.out.println("2. File Handling");
		System.out.println("     - Add a new file");
		System.out.println("     - Delete an existing file");
		System.out.println("     - Search a file");
		System.out.println("3. Exit the Program");
		System.out.println("\nEnter Your Choice:");		
		choice = scan.nextInt();
		
		 switch(choice)
		 {    
         case 1:
        	 	
        	 	System.out.println("*** Below are the files ***");
        	 	TreeSet<String> test = new TreeSet<String>();
        	 	String[] filename = new String[10];
        	 	dirfile = dir.list();
        	 	int j=0;
        	 	for(int i = 0 ; i < files.length ; i++)
        	 	{
        	 		if(files[i].isFile())
        	 		{
        	 			filename[j] = files[i].toString();
        	 			j++;
        	 		}
        	 	}
        	 	
        	 	for(int i = 0 ; i < filename.length ; i++)
        	 	{
        	 		if(filename[i] != null)
        	 		test.add(filename[i].toString());
        	 	}
        	 	
        	 	
//        	 	Collections.addAll(test, dirfile);
        	 	for(String value:test)
        	 	{
        	 		System.out.println(value);
        	 	}
                break; 
                
         case 2:
         		System.out.println("   1. Add a new file");
         		System.out.println("   2. Delete an existing file");
         		System.out.println("   3. Search a file");
         		System.out.println("\nEnter Your Choice:");
         		sub = scan.nextInt();
         		
         		switch(sub)
         		{
         		case 1: 
         			System.out.println("Enter File Name with extension");
         			scan.nextLine();
         			newfile = scan.nextLine();
         			File file = new File("C://JS//"+newfile);
         			if(file.createNewFile())
         				System.out.println("File Created Successfully !!!");
         			else if(file.exists())
         				System.out.println("File already exist");
         			break;
         		
         		case 2:
         			System.out.println("Enter file to delete from the below list:"); 
            	 	dirfile = dir.list();
            	 	for(String value:dirfile)
            	 	{
            	 		System.out.println(value);
            	 	}
            	 	scan.nextLine();
            	 	deletefile = scan.nextLine();
            	 	File del = new File("C://JS//"+deletefile);
            	 	if(del.delete())
            	 		System.out.println("File Deleted Successfully");
            	 	else
            	 		System.out.println("Failed to delete "+deletefile);
            	 	break;
            	 	
         		case 3:
         			System.out.println("Enter Filename to search");
         			scan.nextLine();
         			String searchfile = scan.nextLine();
         			dirfile = dir.list();
         			
            	 	for(String value:dirfile)
            	 	{
            	 		if(value.equals(searchfile))
            	 		{
            	 			throw new FileNotFoundException("not valid");
//            	 			System.out.println("File found !!!");
            	 		}
            	 	}
         		}
         		
         		break;
         		
         case (int) 3: 
        	 	System.exit(0); 
         		break;
         		
         default : 
        	 	System.out.println("This is default");
		 }
		 
		class FileNotFoundException extends Exception{
			FileNotFoundException(String s){
				  super(s);  
				 }  
			} 
		
	}

}

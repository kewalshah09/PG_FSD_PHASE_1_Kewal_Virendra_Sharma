package phase1.Assessment;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class FileHandling {
	
	// ******************* Launcher Method Start ******************** //


		public static void main(String[] args) 
		{
			try{
				FileHandling obj=new FileHandling();
				MainMenu();
			
			Scanner scan=new Scanner(System.in);
			}catch(Exception e)
			{
				System.out.println("Exception in Main: "+e);
			}
		}
		
		// ******************* Launcher Method End ******************** //
		
		
		// ******************* Main Menu Start ******************** //
		
		public static void MainMenu() {
			try{
			System.out.println();
			System.out.println("Welcome to the FileHandling application");
			System.out.println("\nPlease select operations which you want");
			System.out.println("	1.Listout the Files");
			System.out.println("	2.User Interaction Operations");
			System.out.println("	3.Close the Application");
			System.out.println("\nEnter Your Choice : ");
			FileHandling obj=new FileHandling();
			Scanner scan=new Scanner(System.in);
			int option=scan.nextInt();
			switch(option) {
			case 1:
			{
				obj.ListFile();
				System.out.println("Enter 'c' to see the Main Menu or 'e' to exit");
				char cont;
				scan.nextLine();
				cont = scan.next().charAt(0);
				if(cont == 'c' || cont == 'C')
				{
				obj.MainMenu();
				} else if (cont == 'e' || cont == 'E')
				{
					Runtime.getRuntime().exit(0);
				}
				break;
			}
			case 2:
			{
				obj.FileHandling();
				break;
			}
			case 3:
			{
				System.out.println("Exiting System ... Thank You !!!");
				Runtime.getRuntime().exit(0);
				break;
			}
			}
				}
			catch(Exception e)
			{
				System.out.println("Exception catched in Menu page:"+e);
			}
		}
		
		// ******************* Main Menu End ******************** //		
		

		// ******************* List File Start ******************** //	
		
	private void ListFile()
	{
		
		  File directoryPath = new File("C://JS//");
		  File[] files = directoryPath.listFiles();
	      System.out.println("List of files :\n");
	      for(int i=0; i<files.length; i++) 
	      {
	    	  if(files[i].isFile())
	    	  {
	    		  System.out.println(files[i].getName());
	    	  }
	      }
	}
	
	
	// ******************* List File End ******************** //	
	
	
	// ******************* File Handling Start ******************** //
	
	private void FileHandling() {
		System.out.println();
		System.out.println("Please select which kind of file operation you want to perform");
		System.out.println("\n1.Add File");
		System.out.println("2.Delete File");
		System.out.println("3.Search File");
		System.out.println("4.Navigate to Main");
		System.out.println();
		Scanner scan=new Scanner(System.in);
		FileHandling obj=new FileHandling();
		int input=scan.nextInt();
		switch(input) {
		case 1:{
			try {
				obj.AddFile();
				break;
			} catch (Exception e) {
				e.printStackTrace();
			}	
		}
		case 2:{
			try {
				obj.DeleteFile();
				break;
			} catch (Exception e) {
				e.printStackTrace();
			}	
		}
		case 3:{
			try {
				obj.SearchFile();
				break;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		case 4:{
			try {
				obj.NavigateFile();
				break;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		}

	}
	
	
	
	// ******************* Add File Start ******************** //
	
	public void AddFile() throws IOException {
		System.out.println("Please enter Filename with format(e.g:.txt,.doc)");
		Scanner scan=new Scanner(System.in);
		String filename=scan.nextLine();
		if(filename.equals("e")||filename.equals("c")||filename.equals(""))
		{
			System.out.println("Please enter valid Filename");
			System.out.println();
			AddFile();
		}
		else {
			File file=new File("C://JS//"+filename);
			if(file.exists())
			{
				System.out.println("File Already Exist!");
				System.out.println();
				System.out.println("Enter 'e' to go back to main menu OR 'c' to add more files");
				char input=scan.next().charAt(0);
				if(input=='e') {
					FileHandling();
				}
				else if(input=='c') {
					AddFile();
				}
				else {
					System.out.println("invalid input!");
					MainMenu();
				}
			}else {
				file.createNewFile();
				System.out.println("File Created Successfully!");
				System.out.println();
				System.out.println("Enter 'e' to go back to main menu OR 'c' to add more files");
				char input=scan.next().charAt(0);
				if(input=='e') {
					FileHandling();
				}
				else if(input=='c'){
					AddFile();
				}
				else {
					System.out.println("invalid input!");
					MainMenu();
				}
			}	
		}
	}
	
	// ******************* Add File End ******************** //
	

	// ******************* Delete File Start ******************** //
	
	public void DeleteFile() {
		
		 File directoryPath = new File("C://JS//");
		 File[] files = directoryPath.listFiles();
	     System.out.println("List of files :\n");
		 for(int i=0; i<files.length; i++) 
	      {
	    	  if(files[i].isFile())
	    	  {
	    		  System.out.println(files[i].getName());
	    	  }
	      }
		
		System.out.println("\nPlease enter Filename to delete");
		Scanner scan=new Scanner(System.in);
		String filename=scan.nextLine();
		File file=new File("C://JS//"+filename);
		int count=0;
			if(file.delete())
			{
				System.out.println("File Deleted successfully");
				count=1;
				System.out.println();
				System.out.println("Enter 'e' to go back to main menu OR 'c' to delete more files");
				char input=scan.next().charAt(0);
				if(input=='e') {
					FileHandling();
				}
				else if(input=='c'){
					DeleteFile();
				}
				else {
					System.out.println("invalid input!");
					MainMenu();
				}
			}

		if(count==0) {
			System.out.println("File not found!!");
			System.out.println();
			System.out.println("Enter 'e' to go back to main menu OR 'c' to delete more files");
			char input=scan.next().charAt(0);
			if(input=='e') {
				FileHandling();
			}
			else if(input=='c'){
				DeleteFile();
			}
			else {
				System.out.println("invalid input!");
				MainMenu();
			}
		}
	}
	
	// ******************* Delete File End ******************** //
	

	// ******************* Navigate to Main Menu Start ******************** //
	
	public void NavigateFile() {
		FileHandling obj=new FileHandling();
		obj.MainMenu();
	}
	
	// ******************* Navigate to Main Menu Start ******************** //
	

	// ******************* Search File Start ******************** //
	
	public void SearchFile() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter File name you want to search");
		String input=scan.nextLine();
		File file=new File("C:\\JS\\"+input);
		if(file.exists())
		{
			System.out.println("File Founded!");
			System.out.println();
			System.out.println("Enter 'e' to go back to main menu OR 'c' to search more files");
			char check=scan.next().charAt(0);
			if(check=='e') {
				FileHandling();
			}
			else if(check=='c'){
				SearchFile();
			}
			else {
				System.out.println("invalid input!");
				MainMenu();
			}
		}
		else
		{
			System.out.println("File Not Found!");
			System.out.println();
			char check=scan.next().charAt(0);
			if(check=='e') {
				FileHandling();
			}
			else if(check=='c'){
				SearchFile();
			}
			else {
				System.out.println("invalid input!");
				MainMenu();
			}
		}
	}

	// ******************* Search File End ******************** //

	// ******************* File Handling End ******************** //
	
	}

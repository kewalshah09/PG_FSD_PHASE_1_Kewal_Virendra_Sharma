package phase1.filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteDemo {
	public static void main(String args[])
	{
		String data;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the data to write in a file");
		data = scanner.nextLine();
		
		try
		{
			FileWriter file = new FileWriter("C://JS//Filewriter.txt");
			
			file.write(data);
			System.out.println("Data written");
			
			file.close();
		} catch (IOException e)
		{
			e.getStackTrace();
		}
	}
}

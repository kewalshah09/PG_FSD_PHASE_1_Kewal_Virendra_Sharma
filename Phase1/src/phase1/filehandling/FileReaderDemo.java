package phase1.filehandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class FileReaderDemo {
	
	public static void main(String args[])
	{
		char[] array = new char[40];
		int ch;
		
		try
		{
			FileReader input = new FileReader("C://JS//Filewriter.txt");
			input.read(array);
			
			
			
//			for(char value:array) {
//				System.out.println("Data int he fil:" + value);
//				
//			}
			
//			System.out.println("Data in the File : " + Arrays.toString(array).toString());
			while((ch=input.read())!= -1)
			{
			System.out.println((char)ch);
			}
			input.close();
		}catch(IOException e)
		{
			e.getStackTrace();
		}
	}
}
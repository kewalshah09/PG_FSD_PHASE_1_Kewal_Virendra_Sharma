package phase1.filehandling;

import java.io.*;

public class FileInputStreamExample {
	
	public static void main(String args[]) throws IOException
	{
		FileInputStream fis = new FileInputStream("C://JS//abc.txt");
		int ch;
		
		while((ch=fis.read())!= -1)
			System.out.print((char)ch);
		fis.close();
	}
}
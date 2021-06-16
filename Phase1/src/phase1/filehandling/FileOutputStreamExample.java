package phase1.filehandling;

import java.io.BufferedOutputStream; 
import java.io.DataInputStream; 
import java.io.FileOutputStream; 
import java.io.IOException; 

public class FileOutputStreamExample {
	public static void main(String[] args) throws IOException  
    { 
        DataInputStream dis = new DataInputStream(System.in);
        FileOutputStream fos = new FileOutputStream("C://JS//abc.txt",true);      
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        
        System.out.println("Enter text (end with @)");
        
        char ch;
        
        while((ch=(char)dis.read()) != '@')
        {
        	bos.write(ch);
        }
        bos.close();
    }
}
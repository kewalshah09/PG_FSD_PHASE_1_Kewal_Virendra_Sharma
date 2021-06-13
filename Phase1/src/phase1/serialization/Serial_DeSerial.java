package phase1.serialization;

import java.io.*;

public class Serial_DeSerial {
	
	public static void main(String args[]) throws IOException
	{
		Student obj = new Student(10,"Kewal","Shah","USA",32);
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try
		{
			fos = new FileOutputStream("C://JS//serial.ser");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(obj);
			System.out.println("Serialization Done");
		}catch (IOException io)
		{
			System.out.println(io);
		}
		finally
		{
			fos.close();
			oos.close();
		}
		
		
		/////// Deserialize
		
		Student o=null;
	     try{
	       FileInputStream fis = new FileInputStream("C://JS//serial.ser");
	       ObjectInputStream ois = new ObjectInputStream(fis);
	       o = (Student)ois.readObject();
	       ois.close();
	       fis.close();
	     }
	     catch(IOException ioe)
	     {
	        ioe.printStackTrace();
	        return;
	     }catch(ClassNotFoundException cnfe)
	      {
	        System.out.println("Student Class is not found.");
	        cnfe.printStackTrace();
	        return;
	      }
	     System.out.println("Student Name:"+o.getRollno());
	     System.out.println("Student Age:"+o.getFirstName());
	     System.out.println("Student Roll No:"+o.getLastname());
	     System.out.println("Student Address:"+o.getLocation());
	     System.out.println("Student Height:"+o.getAge());
		
	}

}



class Student implements java.io.Serializable
{
	private int rollno;
	private String firstName;
	private transient String Lastname;  // transient is used to not serialize
	private String location;
	private int age;
	
	public Student(int rollno, String firstName, String Lastname, String location, int age)
	{
		this.rollno = rollno;
		this.firstName = firstName;
		this.Lastname = Lastname;
		this.location = location;
		this.age = age;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
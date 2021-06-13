package phase1.serialization;

import java.io.*;

public class SerialObj {
	
	public static void main(String args[])
	{
		Student1 obj[] = new Student1[5];
	}

}


class Student1 implements java.io.Serializable
{
	private int rollno;
	private String firstName;
	private transient String Lastname;  // transient is used to not serialize
	private String location;
	private int age;
	
	public Student1(int rollno, String firstName, String Lastname, String location, int age)
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

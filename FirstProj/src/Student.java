
public class Student {
	int rollno = 1;
	String name = "Test";
	static String college = "MGT";
	
	static void change() {
		college = "MGIT";
	}
	
	Student(){
		rollno = 11;
		name = "Test 123";
	}
	
	void display() {
		System.out.println(rollno + " " + name + " " + college);
	}
}

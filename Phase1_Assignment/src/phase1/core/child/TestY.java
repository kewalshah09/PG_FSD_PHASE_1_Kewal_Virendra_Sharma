package phase1.core.child;

import phase1.core.parent.TestM;
import phase1.core.parent.TestN;

public class TestY extends TestX {
	
	public static void main(String args[]) {
		
		new TestM().methodPublic();
		TestN obj = new TestN();
		System.out.println("-----------------------");
		obj.methodPublic();
		
		TestX x = new TestX();
		
		System.out.println("-----------------------");
		System.out.println("Variable of Class X in Y : "+ x.xc);
		System.out.println("Variable of Class X in Y : "+ x.xf);
		System.out.println("Variable of Class X in Y : "+ x.xl);
		x.publicMethod();
	}
	
	
	

}

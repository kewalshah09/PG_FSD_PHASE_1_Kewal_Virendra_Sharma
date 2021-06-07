package phase1.core.child;

import phase1.core.parent.TestM;
import phase1.core.parent.TestN;
import phase1.core.parent.TestP;

public class TestZ {
	
public static void main(String args[]) {
		
		new TestM().methodPublic();
		TestN obj = new TestN();
		System.out.println("-----------------------");
		obj.methodPublic();
		System.out.println("-----------------------");
		new TestP().methodP();
		
		TestX x = new TestX();
		
		System.out.println("-----------------------");
		System.out.println("Variable of Class X in Y : "+ x.xc);
		System.out.println("Variable of Class X in Y : "+ x.xf);
		System.out.println("Variable of Class X in Y : "+ x.xl);
		x.publicMethod();
}

}

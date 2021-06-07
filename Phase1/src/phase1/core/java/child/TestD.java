package phase1.core.java.child;

import phase1.core.java.TestB;


public class TestD extends TestB {

	public static void main(String[] args) {
		new TestB().methodPublic();
		
		//TestB  b = new TestB();
		//b.methodProtected(); // compile time error

		// works, accessing super class protected method using subclass
		new TestD().methodProtected();
		new TestB().methodPublic();

	}
}

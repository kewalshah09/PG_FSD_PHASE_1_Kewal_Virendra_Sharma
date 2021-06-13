package phase1.inheritance;


abstract class MNC {
	MNC() 
	{
		System.out.println("Constructor of MNC");
	}

	abstract void abstract_1(); // abstract method()
	abstract void abstract_2(); // abstract method()

	void generalMethod() // non-abstract method()
	{
		System.out.println("General Method in MNC");
	}
}

abstract class Infosys extends MNC {
	
	void abstract_1()
	{
		System.out.println("Abstract_1 in Infosys");
	}
}

class Hello extends Infosys {
	void infoNorm() 
	{
		System.out.println("Normal Method in Infosys");
	}
	
	void abstract_1() 
	{	
		System.out.println("Abstract_1 in Hello");
	}

	void abstract_2() 
	{	
		System.out.println("Abstract_2 in Hello");
	}
	
}

public class Abstract {
	public static void main(String args[])
	{
		Infosys info = new Hello();
		info.abstract_1();
		info.abstract_2();
		
		Hello hello = new Hello();
		hello.infoNorm();	
	}

}

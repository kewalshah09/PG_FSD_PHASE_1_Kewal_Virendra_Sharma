package phase1.core.java;

public class TestA {

	private int y= 99;
	long k = 1000; 
	
	public void methodPublic()
	{  
		methodPrivate();
	}
	
	protected void methodProtected()
	{
		methodPrivate();
	}
	
	void methodDefault()
	{   
		methodPrivate();
	}
	
	private void methodPrivate()
	{     // private method
		System.out.println("Class TestA: methodProtected");
		System.out.println("Value of private valye y"+ y);
		System.out.println("Value of long"+ k);
	}
}

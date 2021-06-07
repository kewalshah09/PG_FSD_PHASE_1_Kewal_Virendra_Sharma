package phase1.core.parent;


public class TestP extends TestM {
	
	public void methodPublic()
	{  
		System.out.println("Class P: methodPublic");
	}
	
	protected void methodProtected()
	{
		System.out.println("Class P: methodProtected");
	}
	
	void methodDefault()
	{   
		System.out.println("Class P: methodDefault");
	}
	
	private void methodPrivate()
	{
		System.out.println("Class P: methodPrivate");
	}
	
	
	public static void main(String args[])
	{
		new TestM().PrintVariableM();
		new TestN().PrintVariableN();
		
	}
}

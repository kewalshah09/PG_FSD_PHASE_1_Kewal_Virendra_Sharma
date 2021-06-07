package phase1.core.parent;

public class TestN {

	protected long np = 23232323;
	public int ni = 20;
	double nd = 12.12;
	
	public void methodPublic()
	{  
		System.out.println("Class N: methodPublic");
	}
	
	protected void methodProtected()
	{
		System.out.println("Class N: methodProtected");
	}
	
	void methodDefault()
	{   
		System.out.println("Class N: methodDefault");
	}
	
	private void methodPrivate()
	{
		System.out.println("Class N: methodPrivate");
	}
	
	public void PrintVariableN()
	{
		System.out.println("Long Protected of Class N : "+np);
		System.out.println("Int Public of Class N : "+ni);
		System.out.println("Double Default of Class N : "+nd);
	}
}

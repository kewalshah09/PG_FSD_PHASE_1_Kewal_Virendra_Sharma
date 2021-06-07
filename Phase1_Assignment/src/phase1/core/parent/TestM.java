package phase1.core.parent;

public class TestM {
	
	private int mi = 10;
	long ml = 12121212;
	protected float mf = 12.12f;
	
	public void methodPublic()
	{  
		System.out.println("Class M: methodPublic");
	}
	
	protected void methodProtected()
	{
		System.out.println("Class M: methodProtected");
	}
	
	void methodDefault()
	{   
		System.out.println("Class M: methodDefault");
	}
	
	private void methodPrivate()
	{
		System.out.println("Class M: methodPrivate");
	}
	
	public void PrintVariableM()
	{
		System.out.println("Int Private of Class M : "+mi);
		System.out.println("Long Default of Class M : "+ml);
		System.out.println("Float Protected of Class M : "+mi);
	}

}

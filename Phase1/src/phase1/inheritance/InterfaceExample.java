package phase1.inheritance;


interface Drawable
{
	int salary = 100;
	void draw();
	void show();
}

interface Shape
{
	int salary = 200;
	void shape();
	void show();
}

interface Demo extends Shape {}


public class InterfaceExample implements Shape,Drawable {
	
	int salary = 900;
	
	@Override
	public void draw() {
		System.out.println("Inside Draw");
	}

	@Override
	public void show() {
		System.out.println("Inside Show");
	}
	
	@Override
	public void shape() {
		System.out.println("Inside Shape");
	}
	
	public static void main(String args[])
	{
		InterfaceExample obj = new InterfaceExample();
		obj.shape();
		obj.show();
		obj.draw();
		
		Drawable d = new InterfaceExample();
		System.out.println(d.salary);
		
		Shape d1 = new InterfaceExample();
		System.out.println(d1.salary);
	}
}

package phase1.inheritance;

class Vehicle {
	
	int speed = 100;
	long distance = 10000;

	public void run()	{}
	
	public void stop()  {}
	
	public void fuel (int i)
	{
		System.out.println("Int of Vehicle " + i);
	}
	
	public void fuel (float f, String s)
	{
		System.out.println("Float of Vehicle " + f);
		System.out.println("String of Vehicle " + s);
	}
	
	public void fuel (char c, int i)
	{
		System.out.println("Char of Vehicle " + c);
		System.out.println("Int of Vehicle " + i);
	}
}

	class TwoWheeler extends Vehicle
	{
		int speed = 200;
		long distance = 20000;
		int nos_of_tyre = 2;
		
		public TwoWheeler() {}
		
		public void run()	{
			System.out.println("Run of TwoWheeler");
		}
		
		public void stop()  {
			System.out.println("Stop of TwoWheeler");
		}
		
		void display()
		{
			System.out.println("Speed of TwoVehicle : " + speed);
			System.out.println("Distance of TwoVehicle : " + distance);
			System.out.println("Number of Tyre : " + nos_of_tyre);
			
			System.out.println("Speed of Vehicle : " + super.speed);
			System.out.println("Distance of Vehicle : " + super.distance);
		}
		
	}
	
	class ThreeWheeler extends Vehicle
	{
		int speed = 300;
		long distance = 30000;
		int nos_of_tyre = 3;
		
		public ThreeWheeler() {}
		
		public void run()	{
			System.out.println("Run of ThreeWheeler");
		}
		
		public void stop()  {
			System.out.println("Stop of ThreeWheeler");
		}
		
		void display()
		{
			System.out.println("Speed of ThreeWheeler : " + speed);
			System.out.println("Distance of ThreeWheeler : " + distance);
			System.out.println("Number of Tyre : " + nos_of_tyre);
			
			System.out.println("Speed of Vehicle : " + super.speed);
			System.out.println("Distance of Vehicle : " + super.distance);
		}
		
	}
	
	class FourWheeler extends Vehicle
	{
		int speed = 400;
		long distance = 40000;
		int nos_of_tyre = 4;
		
		public FourWheeler() {}
		
		public void run()	{
			System.out.println("Run of FourWheeler");
		}
		
		public void stop()  {
			System.out.println("Stop of FourWheeler");
		}
		
		void display()
		{
			System.out.println("Speed of FourWheeler : " + speed);
			System.out.println("Distance of FourWheeler : " + distance);
			System.out.println("Number of Tyre : " + nos_of_tyre);
			
			System.out.println("Speed of Vehicle : " + super.speed);
			System.out.println("Distance of Vehicle : " + super.distance);
		}
		
	}
	
	class EightWheeler extends Vehicle
	{
		int speed = 800;
		long distance =80000;
		int nos_of_tyre = 8;
		
		public EightWheeler() {}
		
		public void run()	{
			System.out.println("Run of EightWheeler");
		}
		
		public void stop()  {
			System.out.println("Stop of EightWheeler");
		}
		
		void display()
		{
			System.out.println("Speed of EightWheeler : " + speed);
			System.out.println("Distance of EightWheeler : " + distance);
			System.out.println("Number of Tyre : " + nos_of_tyre);
			
			System.out.println("Speed of Vehicle : " + super.speed);
			System.out.println("Distance of Vehicle : " + super.distance);
		}
	}





public class VehiclesAssign {
	
	public static void main(String args[])
	{
		TwoWheeler two = new TwoWheeler();
		two.display();
		System.out.println("------------------------------");
		ThreeWheeler three = new ThreeWheeler();
		three.display();
		System.out.println("------------------------------");
		FourWheeler four = new FourWheeler();
		four.display();
		System.out.println("------------------------------");
		EightWheeler eight = new EightWheeler();
		eight.display();
		System.out.println("------------------------------");
		Vehicle v1 = new Vehicle();
		v1.fuel(4);
		v1.fuel(12.12f,"Honda");
		v1.fuel('H',2);
		System.out.println("------------------------------");
		Vehicle v;
		v = new TwoWheeler();
		v.run();
		v.stop();
		System.out.println("------------------------------");
		v = new ThreeWheeler();
		v.run();
		v.stop();
		System.out.println("------------------------------");
		v = new FourWheeler();
		v.run();
		v.stop();
		System.out.println("------------------------------");
		v = new EightWheeler();
		v.run();
		v.stop();
		System.out.println("------------------------------");
	}

}

package phase1.thread;


class myThread extends Thread
{
	public void run()
	{
	for (int i = 0 ; i < 10 ; i++)
	{
		try
		{
			System.out.println("Learning Java : "+i);
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
}

class yourThread extends Thread
{
	public void run()
	{
	for (int i = 0 ; i < 5 ; i++)
	{
		try
		{
			System.out.println("We are into Phase_1 : "+i);
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
}

public class MultiThread2 {

	public static void main(String[] args) 
	{
		myThread t1 = new myThread();
		t1.start();
		
		yourThread t2 = new yourThread();
		t2.start();
	}

}

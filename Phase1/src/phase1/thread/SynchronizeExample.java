package phase1.thread;

import java.io.*;

class Line
{
	synchronized public void getLine()
	{
		for (int i = 0;i<3 ; i++)
		{
			System.out.println(Thread.currentThread().getName() + "  " + i);
			try
			{
				Thread.sleep(400);
			}catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}


class Train extends Thread
{
	Line line;
	
	Train(Line line)
	{
		this.line = line;
	}
	
	public void run()
	{
		line.getLine();
	}
}


public class SynchronizeExample {
	
	public static void main(String args[])
	{
		Line obj = new Line();
		
		Train t1 = new Train(obj);
		Train t2 = new Train(obj);
		
		t1.setName("Train T1");
		t1.setName("Train T2");
		
		t1.start();
		t2.start();
	}

}

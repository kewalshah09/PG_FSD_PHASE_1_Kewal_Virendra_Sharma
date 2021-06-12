package phase1.thread;

public class ThreadExample extends Thread {
	
	public void run()
	{
		for(int i = 0 ; i<5 ; i++)
		{
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
	}
	
	public static void main(String args[])
	{
		ThreadExample t1=new ThreadExample();  
		t1.setName("Thread 1");
		t1.setPriority(MAX_PRIORITY);
		
		ThreadExample t2=new ThreadExample();  
		t1.setName("Thread 2");
		
		ThreadExample t3=new ThreadExample();  
		t1.setName("Thread 3");
		
		ThreadExample t4=new ThreadExample();  
		t1.setName("Thread 4");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		System.out.println(t1.getState());
		System.out.println(t2.getState());
		System.out.println(t3.getState());
		System.out.println(t4.getState());
	}
}

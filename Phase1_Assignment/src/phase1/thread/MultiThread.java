package phase1.thread;

public class MultiThread extends Thread {
	
	public void run()
	{
		System.out.println("Is Aliave?  : " + Thread.currentThread().isAlive());
		System.out.println("Thread Name : " + Thread.currentThread().getName());
		System.out.println("Current State : " + Thread.currentThread().getState());
	}

	public static void main(String[] args) {
		
		MultiThread t1 = new MultiThread();
		t1.setName("Thread 1");
		t1.setPriority(MAX_PRIORITY);
		
		MultiThread t2 = new MultiThread();
		t2.setName("Thread 2");
		t2.setPriority(MIN_PRIORITY);
		
		MultiThread t3 = new MultiThread();
		t3.setName("Thread 3");
		t3.setPriority(MIN_PRIORITY);
		
		MultiThread t4 = new MultiThread();
		t4.setName("Thread 4");
		t4.setPriority(NORM_PRIORITY);
		
		t4.setDaemon(true);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}

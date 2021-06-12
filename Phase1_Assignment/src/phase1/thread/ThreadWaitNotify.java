package phase1.thread;

import java.io.*;

class Customer{  
int amount=10000;  
  
	synchronized void withdraw(int amount){  
	System.out.println("Going to withdraw : "+ amount);  
	  
		if(this.amount<amount)
		{  
		System.out.println("Low balance; waiting for deposit");  		
		try{
			wait();
		   }
		catch(Exception e){}  
		}  
		this.amount-=amount;  
		System.out.println("Withdraw completed of " + amount + ". Balance : "+ this.amount);  
	}  
  
	synchronized void deposit(int amount){  
		System.out.println("Depositing the amount");  
		this.amount+=amount;  
		
		System.out.println("Deposit completed. Balance : " + this.amount);  
		notify();  
	}  
}



public class ThreadWaitNotify {
	
	public static void main(String args[]){  
		final Customer c=new Customer();  
		
		new Thread(){  
		  public void run()
		  {
			c.withdraw(5000);
		  }  
		}.start();  
		
		new Thread(){  
			  public void run()
			  {
				c.withdraw(4000);
			  }  
			}.start();
			
		new Thread(){  
				  public void run()
				  {
					c.withdraw(10000);
				  }  
				}.start();
				
		new Thread(){  
		  public void run()
		   {
			 c.deposit(20000);
		   }  
		}.start();  
	  
	}

}

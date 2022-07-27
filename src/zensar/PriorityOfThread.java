/* Program to examine the priorities of Thread by Pavan Butke*/


package zensar;


public class PriorityOfThread extends Thread {
	  
	
	public void run()  
	{  
  
	System.out.println("I'm running inside the run() method");  
	}  
	  
	  
	public static void main(String argvs[])  
	{  
	  
	PriorityOfThread th1 = new PriorityOfThread();  
	PriorityOfThread th2 = new PriorityOfThread();  
	PriorityOfThread th3 = new PriorityOfThread();  
	  
	System.out.println("hey I'm thread1 & my Priority is : " + th1.getPriority());  
	  

	System.out.println("hey I'm thread2 & my Priority is : " + th2.getPriority());  
	  
	
	System.out.println("Again ,Priority of the thread th2 is : " + th2.getPriority());  
	  
	
	th1.setPriority(6);  
	th2.setPriority(3);  
	th3.setPriority(9);  
	  
	
	System.out.println("hey I'm thread1 & my Priority is : " + th1.getPriority());  
	  
	// 3  
	System.out.println("hey I'm thread2 & my Priority is : " + th2.getPriority());  
	  
	// 9  
	System.out.println("hey I'm thread3 & my Priority is  : " + th3.getPriority());  
	  
	// Main thread  
	  
	// Displaying name of the currently executing thread   
	System.out.println("Currently Executing The Thread : " + Thread.currentThread().getName());  
	  
	System.out.println("Priority of the main thread is : " + Thread.currentThread().getPriority());  
	  
	// Priority of the main thread is 10 now  
	Thread.currentThread().setPriority(10);  
	  
	System.out.println("Priority of the main thread is : " + Thread.currentThread().getPriority());  
	}  
	}  



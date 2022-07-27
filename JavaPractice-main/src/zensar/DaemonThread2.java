/* Program to what happens when we start daemon thread by Pavan Butke*/

package xyz;

public class DaemonThread2 extends Thread {
	
		 public void run(){  
		  System.out.println(" Name: "+Thread.currentThread().getName());  
		  System.out.println(" Daemon: "+Thread.currentThread().isDaemon());  
		 }  
		  
		 public static void main(String[] args){  
			 DaemonThread2 thr1=new DaemonThread2();  
			 DaemonThread2 thr2=new DaemonThread2();  
		  thr1.start();  
		  thr1.setDaemon(true); 
		  thr2.start();  
		 }  
}  

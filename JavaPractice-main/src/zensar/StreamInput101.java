package xyz;
import java.io.*;

public class StreamInput101 {
	
	
	  public static void main(String args[])throws Exception{    
	   FileInputStream input1=new FileInputStream("E:\\javanotes\testin.txt");    
	   
	   
	   FileInputStream input2=new FileInputStream("E:\\javanotes\testout.txt");   
	   
	   
	   SequenceInputStream inst=new SequenceInputStream(input1, input2);    
	   int j;    
	   while((j=inst.read())!=-1){    
	    System.out.print((char)j);    
	    
	   }    
	   inst.close();    
	   input1.close();    
	   input2.close();    
	  }    
	}    


	


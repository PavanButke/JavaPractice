package xyz;
import java.util.Scanner;

class add {
		public static void main(String[] args)
			 {
			  
			  long bin1=10;
			  long bin2=100;
			  int i = 0, rem = 0;
			  int[] sum = new int[100];
			
			
			  
			  while (bin1 != 0 || bin2 != 0) 
			  {
			   sum[i++] = (int)((bin1 % 10 + bin2  % 10 + rem) % 2);
			   rem= (int)((bin1 % 10 + bin2 % 10 + rem) / 2);
			   bin1 = bin1 / 10;
			   bin2 = bin2 / 10;
			  }
			  if (rem != 0) {
			   sum[i++] = rem;
			  }
			  --i;
			  
			  System.out.print("Addition of Binary Numbers is ");
			  while (i >= 0) 
			  {
			   System.out.print(sum[i--]);
			  }
			   System.out.print("\n");  
			 }
			}



package xyz;

import java.util.*;

public class MultipleIn {


		// TODO Auto-generated method stub
		
		interface First {
			
			public void print_fiLetter();
		}
		
		interface Middle{
			
			public void print_miLetter();
		}
		
		interface Last extends First , Middle{
			
			
			public void print_laLetter();
		}
		
		
		public static class Name implements Last{
			
			
			
			public void print_fiLetter() {
				System.out.print("Na");
			}
			
			
			public void print_miLetter() {
				System.out.print("Ya");
				
			}
			
			public void print_laLetter() {
				System.out.print("Na");
				
			}
		}
		
		public static void main(String[] args) {
			Name n = new Name();
			n.print_fiLetter();
			n.print_miLetter();
			n.print_laLetter();
		
		
	}

}

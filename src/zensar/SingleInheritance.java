
package zensar;

import java.util.*;







//Driver Class
public class SingleInheritance {
	
	public static class First{
		public void print_firstLetter() {
		System.out.print("Na");
		}
	}
	
	public static class Last extends First{
		public void print_middleLetter() {
		System.out.print("ya");
		}
	}
	
	
	public static void main(String[] args) {
		Last l = new Last();
		
		l.print_firstLetter();
		l.print_middleLetter();
		l.print_firstLetter();
		
	}

}

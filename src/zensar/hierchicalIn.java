package zensar;

public class hierchicalIn {
	
	public static class First{
		public void print_fiLetter() {
			System.out.print("Na");
		}
	}
	
	public static class Middle extends First{
		public void  print_miLetter() {
			
			System.out.print("Ya");
		}
	}
	
	public static class Last extends First{
		/*...break...*/
	}
	
	
	public static void main(String[] args) {
		Last l = new Last();
		l.print_fiLetter();
		Middle m = new Middle();
		m.print_miLetter();
		l.print_fiLetter();
	}

}

package zensar;

public class MultiLevel_Inheritance {

	
	


	    public static class First {
	        public void print_letter() {
	            System.out.println("Na");
	        }
	    }

	    public static class Middle extends First {
	        public void print_miletter() {
	            System.out.println("Ya");
	        }
	    }

	    public static class Last extends Middle {
	        public void print_letter2() {
	            System.out.println("Na");
	        }
	    }

	    // Driver class
	    public static void main(String[] args) {
	        Last g = new Last();
	        g.print_letter2();
	        g.print_miletter();
	        g.print_letter();
	    }
	}
	
	


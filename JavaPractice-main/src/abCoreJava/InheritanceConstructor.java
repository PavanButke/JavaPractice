package abCoreJava;

class Dada{
	public Dada() {
		System.out.println("Baap ka bhi baap !");
	}
}

class Baapu extends Dada{
	
	public Baapu() {
		System.out.println("Baap bhi kisika beta hai !");
	}
	
}

class Chora extends Baapu {
	
	public Chora() {
	System.out.println("Bapse Bdhkar Beta! ");
	}
}



public class InheritanceConstructor {

	public static void main(String args[]) {
		
		Chora chu = new Chora();
//		Baapu beltwale = new Baapu();
		
	}
	
	
	
}

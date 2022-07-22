package abCoreJava;

public class StaticBlocks {
	
	static {
		System.out.println("Block1");
	}
	
	public static void main(String args[]) {
		
		System.out.println("Main");
	}
	
	static {
		System.out.println("Block2");
	}
	
}

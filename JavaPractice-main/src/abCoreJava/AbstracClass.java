package abCoreJava;


 abstract class Super{
	
	public Super() {
		System.out.println("This is a Super Class");
	}
	public void method1() {
			System.out.println("Method 1 of Super Class");
	
	}
	
	abstract void method2();
			
}
 
 class Sub extends Super{
	 
	 public void method2() {
		 System.out.println("Subclass Method 2");
	 }
 }

public class AbstracClass {

	public static void main(String args[]) {
		Super s1 = new Sub();
		s1.method1();
		s1.method2();
	}
	
	
}

package Interface;

public interface exampleInter1 {
	
	 void method1();
	 void method2();

}

class exampleInter2 implements  exampleInter1{
	public void method1() {System.out.println("Inside Method 1");}
	public void method2() {System.out.println("Inside Method 2");}
	public void method3() {System.out.println("Inside Method 3");}
}

class test{
	public static void  main(String[] args) {
		exampleInter1 e= new exampleInter2();
		e.method1();
		e.method2();
	}
}

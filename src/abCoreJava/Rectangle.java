package abCoreJava;

 class Methods {

	
	public double length;
	public double breadth;
	
	public double area(){
		
		return length*breadth ;
		
	}
	
	public double perimeter() {
		return length*breadth;
	}
	
	public boolean isSquare() {
		
		return  length==breadth?true:false;
	}
}	
	
public class Rectangle {
	public static void main(String args[]) {
		
		Methods m = new Methods();
		m.length=120;
		m.breadth=120;
	
		System.out.println("Area of Rect "+m.area());
		System.out.println("Permiter of Rect "+m.perimeter());
		System.out.println(m.isSquare()+" Rectangle is Square");
	}
}

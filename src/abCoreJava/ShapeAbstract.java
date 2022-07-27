package abCoreJava;

abstract class Shape{
	
	
	abstract public  double perimeter();
	abstract public  double area();
}

class Circle extends Shape{
	double rad;
	@Override
	public  double perimeter() {
		return 2*Math.PI*rad;
	}

	@Override
	public double area() {
		
		
		return Math.PI*rad*rad;
	}
	
}

 class Rectangle extends Shape{
	double len;
	double brd;
	
	@Override
	public double perimeter() {
		return 2*(len*brd);
	}

	@Override
	public double area() {
		
		return len*brd;
	}
}

public class ShapeAbstract {
	
	public static void main(String args[]) {
		Circle c= new Circle();
		c.rad = 10;
		
		Shape s=c;
		
		System.out.println(s.area() +" "+ s.perimeter());
		
		
	}
	
	

}

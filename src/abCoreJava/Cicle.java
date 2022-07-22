package abCoreJava;

class Cylinder{
	
	public double radius;
	public double height;
	
	public double lidArea(){
		
		return 	Math.PI * radius*radius;		
	}
	
	public double totalSurface(){
	
		return 2*lidArea()+circumference()*height ;
	}
	
	public double circumference(){
		
		return 2*Math.PI*radius;
	}
	
	public double volume() {
		
		return lidArea()*height;
	}
}


public class Cicle {

	public static void main(String args[]) {
	
		Cylinder c= new Cylinder();
		c.radius =132.21;
		c.height =124.11;
		
		System.out.println("lidArea "+c.lidArea());
		System.out.println("Surface is  "+c.totalSurface());
		System.out.println("Circumference is "+c.circumference());
		System.out.println("Volume is "+c.volume());
	
	}
}

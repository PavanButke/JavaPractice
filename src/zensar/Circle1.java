package zensar;

public class Circle1 {
	
	public static void main(String[] args) {
		
		Cylinder c= new Cylinder();
		
		c.radius=7;
		c.height=10;
		
		
		System.out.println("Volume Of Cylinder is "+c.volume());
		System.out.println("Area of Cylinder is "+c.area());
		
	}

}

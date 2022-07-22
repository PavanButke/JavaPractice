package abCoreJava;

 class Rectangle{
	
	int length;
	int breadth;
	
	Rectangle(){
		
		length= breadth= 1;
	}
		
	Rectangle(int l , int b){
		length =l;
		breadth =b;
	}
	
	
}

class Cuboid extends Rectangle{
	int height;
	
	Cuboid(){
		height=1;
	}
	
	Cuboid(int h){
		height =h;
		
	}
	
	int Volume() {
		return length*breadth*height;
	}
	
}



public class ParameterizedConstructor {
	
	public static void main(String args[]) {
		Cuboid c = new Cuboid();
		
		System.out.println(c.Volume());
	}

}

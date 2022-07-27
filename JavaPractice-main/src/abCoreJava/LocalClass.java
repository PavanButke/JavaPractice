package abCoreJava;

 class Outer {

	public void display(){
		
		class Inner{
			
			public void show() {
				
				System.out.println("Inside the Inner Class");
			}
		}
		new Inner().show();
	}
	
	
	
public class LocalClass{
		
		public static void main(String[] args) {
			Outer o = new Outer();
			o.display();
		}
	}
}

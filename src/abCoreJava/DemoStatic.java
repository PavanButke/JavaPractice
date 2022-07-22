package abCoreJava;

class Testing{
	
	static int i=0;;
	int j=1;
	
	void show(){
			System.out.println(i+":"+j);
		
	}
	
	static void display() {
		System.out.println(i);
	}
	
	
}


public class DemoStatic {
	
	public static void main(String args[])
	{
		Testing t1= new Testing();
		t1.show();
		
		Testing t2= new Testing();
		t2.show();
		
	}

}

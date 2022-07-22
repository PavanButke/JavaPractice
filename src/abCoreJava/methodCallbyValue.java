package abCoreJava;

//public class methodCallbyValue {
//	
//	static void  cbv(int z ,int x) {
//		
//		x= z-x;
//		System.out.println("Subtracting z-x= " + x);
//		
//		
//	}//method cbv --is a method which does substraction on value of z and x which are taken as formal argument in the form of z and x
//	
//	
//	public static void main(String[] args) {
//		int z=99 , x=21;
//		
//		cbv(z,x);
//		
//		System.out.println("Value of Z  "+z +" and X is "  +x);
//		// here you can see that value of Z and X is unchanged though we have changed the value
//		// method cbv will have its own copy of variable
//		
//		
//	
//	}
//
//}




public class methodCallbyValue{
	
	//make sure as we have static in our method , then we need to declare method as static only
	//to avoid these we have two ways; either declare a method as static or create obj in main and call the meth on that obj
	
	 int decbyten(int z) {
		
		
		return z-=10;
		
	}
	
	public static void main(String args[]) {
		
		int q=11 ;
		
		
		//let's make a object
		
		methodCallbyValue mcbv= new methodCallbyValue();
		
		//now lets call method up on object
		
		System.out.println(mcbv.decbyten(q));
		
	}
	
	
}

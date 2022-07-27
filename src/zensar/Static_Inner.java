package zensar;

class Static_Inner {

	    
	    static int alpha = 1;
	}
	 
	class OuterClass {

	    class InnerClass extends Static_Inner{
	           
	
	           static int beta= 2; 
	           
	 
	           static final int gamma = 3; 
	           
	          
	    }
	}
	
	
	
	

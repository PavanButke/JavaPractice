package zensar;

public class DeprecatedAnn {
	

		void m(){System.out.println("In m");}  
		  
		@Deprecated  
		void n(){System.out.println("In n");}  
		}  
		  
		class CheckAnnotation{  
		public static void main(String args[]){  
		  
			DeprecatedAnn a=new DeprecatedAnn();  
				a.n();  
		}

}

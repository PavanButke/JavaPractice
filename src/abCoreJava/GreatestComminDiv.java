package abCoreJava;

public class GreatestComminDiv {

	 int gcd(int m , int n) {
		
		while(m!=n) {
			if(m>n) m= m-n;
			else  n=n-m;
		}
		
		return m;
	}
	
	public static void main(String[] args) {
		GreatestComminDiv g= new GreatestComminDiv();
		System.out.println(g.gcd(35,56));
	}
}

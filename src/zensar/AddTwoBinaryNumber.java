package zensar;

public class AddTwoBinaryNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long bin1= 10; 
		long bin2= 100;
		int i=0; 
		int rem=0;
		int[] sum = new int[50]; //initializing arr of 56 length --pb
		
		while(bin1 != 0 || bin2 != 0) {
			
			sum[i++]= (int)((bin1 % 10 + bin2 %10 + rem) % 2); //typecasting the int 
			rem = (int)((bin1 % 10+ bin2 %10 + rem) % 2);
			
			bin1=bin1 /10; //shifting one place to right--pb
			bin2=bin2 /10; //shifting one place to right--pb
			
		}
		
		if(rem !=0) {
			sum[i++]= rem;
		}
		--i;
		
		System.out.println("Addition of two binary numbers is=" );
		
		while(i>=0) {
			System.out.println(sum[i--]);
			
		}
		System.out.println("\n");
		
	}

}

package abCoreJava;

import java.util.ArrayList;
import java.util.List;

public class LinkedList {
	
	public static void main(String[] args) {
		
		
		ArrayList<Integer> arrList1 = new  ArrayList<>(8);
		ArrayList<Integer> arrList2 = new  ArrayList<>(List.of(10,20,30,40));
		
		
		arrList1.add(10);
		
		for(int i=0 ; i< arrList2.size(); i++) {
			System.out.println(arrList2.add(i));
		}
	}

	
	

}

package xyz;
import java.util.*;

public class SuppressAnn {

	  
 
	@SuppressWarnings("unchecked")  
	public static void main(String args[]){  
	ArrayList backpack = new ArrayList();  
	backpack.add("Water Bottle");  
	backpack.add("TrackSuite");  
	backpack.add("Maggie");
	backpack.add("Firestick");
	
	  
	for(Object obj:backpack)  
	System.out.println(obj);  
	  
	}
	
	
}

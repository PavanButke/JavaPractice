package May30;

import java.util.*;
interface Sayable{  
    String say(String message);  
}  

public class MultipleState{  

	    public static void main(String[] args) {  
	      
	        
	        Sayable person = (message)-> {  
	            String str1 = "Pune is the Best City ,";  
	            String str2 = str1 + message;   
	            return str2;  
	        };  
	            System.out.println(person.say("in the World."));  
	     
	}  
} 
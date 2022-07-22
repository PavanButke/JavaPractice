package May26;
import java.util.*; 

public class ReverseBattingOrder {
	

 

public static void main(String args[]){  
  
ArrayList<String> CricTeam=new ArrayList<String>();  
        CricTeam.add("1.Sachin");    
        CricTeam.add("2.Gambhir");    
        CricTeam.add("3.Saurav");    
        CricTeam.add("4.Dravid");
        CricTeam.add("5.Yuvraj");
        CricTeam.add("6.MsDhoni");
        CricTeam.add("7.Irfan");
        CricTeam.add("8.Harbhajan");
        CricTeam.add("9.ZaheerK");
    
          
        Collections.sort(CricTeam,Collections.reverseOrder());  
        Iterator i=CricTeam.iterator();  
        while(i.hasNext())  
        {  
            System.out.println(i.next());  
        }  
}  
}  




package May31;

import java.util.Date;  
import java.util.Locale;  
import java.text.DateFormat;  
  
  
  
public class GetTimeInstance
{  
      
public static void main(String argvs[]) throws Exception   
{  
  

Locale lcl = Locale.FRENCH;  
  

Date d = new Date();  
  
  
DateFormat dFormat = DateFormat.getTimeInstance(DateFormat.SHORT, lcl);  
  
String str = dFormat.format(d);  
System.out.println(str);  
}  
}
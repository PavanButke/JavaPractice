package May31;

import java.time.*;  

public class JavaTimeDate {  
  public static void main(String[] args) {  
    LocalDate date = LocalDate.of(2017, 1, 13);  
    LocalDateTime datetime = date.atTime(1,50,9);      
    System.out.println(datetime);   
  }  
}  
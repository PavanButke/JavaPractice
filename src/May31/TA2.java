package May31;

import java.text.DateFormat;
import java.util.Date;
public class TA2{
 public static void main(String[] args) {
  Date currentDate = new Date();
  System.out.println("current Date:"+currentDate);
  String dateToStr=DateFormat.getDateInstance().format(currentDate);
  System.out.println("Date Format using getInstance():"+dateToStr);

   }
 }
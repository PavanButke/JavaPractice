package May30_2;

@FunctionalInterface
interface Converter
{
   double convert(double input);
}

public class Assignment2_2
{
   public static void main(String[] args)
   {
   
      System.out.println(convert(input -> (input-32)*5.0/9.0, 98.6));

      // Convert Kilometers to Miles
      System.out.println(convert(input -> input/1.609344, 8));
   }

   static double convert(Converter converter, double input)
   {
      return converter.convert(input);
   }
}
package May31;
import java.time.LocalDate;

public class JavaLocalTime1 {

	


		public static void  main(String[] args){
			LocalDate date =LocalDate.now();
			LocalDate yesterday=date.minusDays(1);
			LocalDate tomorrow =yesterday.plusDays(2);
			System.out.println("Date Today:"+date);
			System.out.println("Y'day's date:"+yesterday);
			System.out.println("Tomo's date:"+tomorrow);
		}
	
}

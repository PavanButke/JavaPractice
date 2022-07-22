package abCoreJava;

class Class10{
	
	public int roll;
	public String name;
	public String course;
	public int sub1;
	public int sub2;
	public int sub3;
	
	public  int total(){
		
		return sub1+sub2+sub3;
		
	}
	
	public double average() {
		return (double)total()/3;
	}
	
	public char grade(){
		
		if(total() >90)
			return 'A';
		if(total()<80 && total()>89) 
			return 'B';
		else 
			return 'F';

				
	}
	
	public String details() {
	
		return "Roll No."+ roll+"\n"+"Name of Student"+name+".";
		
	}
	
	
}


public class Vidyarthi {

	public static void main(String args[]) {
		
		Class10 c10 = new Class10();
		
		c10.name="dashgriva";
		c10.roll = 123;
		c10.course = "Science";
		c10.sub1=12;
		c10.sub2=34;
		c10.sub3= 35;
		
		System.out.println("Total is "+c10.total());
		System.out.println("Average is "+c10.average());
		System.out.println("Grade was "+c10.grade());
		System.out.println("Details are "+c10.details());
		
		
		
	}
}

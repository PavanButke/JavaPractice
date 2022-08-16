package com.oops.sm;

import java.nio.file.Files;

public class Student {
	
	
	
	
	static class StudentDetails{
		
		
		//During space allocation all data members are set to Java given default values
		//Parsing sets DataMembers to Class Creators' defaults (e.g maxscore and SchoolName here and growMultiple in ArrayList)
		int age;
		String name;
		int roll;
		String home;
		String schoolName;
		int maxScore;
		
		DBConnection dbconnection;
		//For class creator to initialize data members which are dynamic(e.g. reading from a file or a db )	
		StudentDetails(){
			dbconnection = new DBConnection("<ip addr>");
			studentFolder = Files.read("..");
		}
		

	StudentDetails(int age , int roll){
			this.age= age;
			this.roll= roll;
		}
	
	
	}

	
	public static void main(String []args) {
		StudentDetails s= new StudentDetails(10,12);
	}
}

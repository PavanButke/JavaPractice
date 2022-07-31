package com.collections;

import java.util.StringTokenizer;

public class StringTok {

	
	public static void main(String[] args) {
		
		String str = "name=Srk address=polyt country=ind dept=ece";
		
		StringTokenizer stk= new StringTokenizer(str,"= ");
	
		String s;
		
		while(stk.hasMoreTokens()) {
			s=stk.nextToken();
			System.out.println(s);
		}
		
	}
}

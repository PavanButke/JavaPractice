package zensar;

import java.util.*;

public class Wrapper2{



	public static void main(String[] args) {
		
		Boolean b1 = new Boolean(true);
		Boolean b2 = new Boolean("kadir");
		Boolean b3 = new Boolean("tRue");
		Boolean b4 = new Boolean("tRUe");
		Boolean b5 = new Boolean("FalSe");
		System.out.println("---Boolean---");
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(b5);
		
		Byte byte1 = new Byte((byte) 5);
		Byte byte2 = new Byte("50");
		System.out.println("---Byte---");
		System.out.println(byte1);
		System.out.println(byte2);
		
		Integer integer1 = new Integer(10);
		Integer integer2 = new Integer("15");
		System.out.println("---Integer---");
		Integer integer3 = integer1 + integer2 ;
		int int1 = integer1 + integer2;
		System.out.println(integer3);
		System.out.println(int1);
		
		Float float1 = new Float(4.4);
		Float float2 = new Float("5.6");
		Float float3 = new Float(4);
		Float float4 = new Float(6.4f);
		
		Float float5 = float2 + float4;
		System.out.println("---Float---");
		System.out.println(float1);
		System.out.println(float2);
		System.out.println(float3);
		System.out.println(float4);
		System.out.println(float5);
		
		Character character1 = new Character((char) 65);
		Character character2 = new Character('D');
		System.out.println("---Character---");
		System.out.println(character1);
		System.out.println(character2);
		
	}
}
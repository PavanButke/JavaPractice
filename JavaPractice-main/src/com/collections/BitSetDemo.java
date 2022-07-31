package com.collections;

import java.util.BitSet;

public class BitSetDemo {
	
	public static void main(String[] args) {
		
		BitSet bs = new BitSet();
		
		bs.set(0);
		bs.set(1);
		bs.set(2);
		bs.set(3);
		bs.set(4);
		bs.set(5);
		bs.set(6);
		bs.set(7);
		bs.set(8);
		bs.set(9);
		
		BitSet bs2 = new BitSet();
		
		bs2.set(0);
		bs2.set(1);
		bs2.set(5);
		bs2.set(6);
		bs2.set(7);
		bs2.set(8);
		
		
		bs.and(bs2);
		
		System.out.println(bs2);
	}

}

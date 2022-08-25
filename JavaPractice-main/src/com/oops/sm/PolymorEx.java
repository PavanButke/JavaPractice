package com.oops.sm;


public class PolymorEx {

	static class Parent{
		int daughter=10;
		int daughter1=100;
		
		
		void fun() {
			System.out.println("Parent Function");
		}
		
		void fun1() {
			System.out.println("Parent Function 1");
		}
		
	}
	
	
	static class Child extends Parent{
		
		int daughter=50;
		int daughter2=500;
		
		void fun() {
			System.out.println("Child's Function");
		}
		
		void fun2() {
			System.out.println("Child's Function 2");
		}
	}
	
	public static void main(String []args) {
		Child obj = new Child();
		
		System.out.println(obj.daughter); // resolve by ref==2
		
		System.out.println(obj.daughter1); // will pass
		
		System.out.println(obj.daughter2); // will not pass 
		
		

		
		obj.fun(); // resolve by ref=="Child's function" --> C overriden P's fun
		obj.fun1(); // will pass
		obj.fun2(); // will not pass

	}	
}

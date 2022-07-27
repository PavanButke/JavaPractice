package xyz;


class Annotations{  
void PlayCricket(){
		System.out.println("Playing Some Sports");
	}  
}  
  
class Dog extends Annotations{  
	@Override  
	void PlayCricket(){	
		System.out.println("Playing Cricket");
	}

}  
  
class TestAnnotation1{  
public static void main(String args[]){  
	Annotations a=new Dog();  
	a.PlayCricket();  
}}



package May30_2;

interface Sayable{    
  
    default void say(){    
        System.out.println("Hello, this is default method");    
    }    
  
    void sayMore(String msg);    
        
    static void sayLouder(String msg){    
        System.out.println(msg);    
    }    
}    
public class Absr implements Sayable{    
    public void sayMore(String msg){     // implementing abstract method    
        System.out.println(msg);    
    }    
    public static void main(String[] args) {    
        DefaultMethods dm = new DefaultMethods();    
        dm.say();                       // calling default method    
        dm.sayMore("Work is worship");      // calling abstract method    
        Sayable.sayLouder("Helloooo...");   // calling static method    
    }    
}    

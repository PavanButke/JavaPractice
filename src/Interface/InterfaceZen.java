package Interface;

interface Persons
{
    public void callback();
}

class Store
{
    Persons Personss[]=new Persons[10];
    int count=0;
       
    void register(Persons m)
    {
        Personss[count++]=m;
    }
    void inviteSale()
    {
        for(int i=0;i<count;i++)
            Personss[i].callback();
    }
    
}

class Customer implements Persons
{
    String name;
    
    Customer(String n)
    {
        name=n;
    }
    public void callback()
    {
        System.out.println("Let's meet ,"+name);
        
        
    }
    
}

public class InterfaceZen {

    
    public static void main(String[] args) 
    {
        Store s=new Store();
        Customer c1=new Customer("Anush");
        Customer c2=new Customer("Vanika");
        
        s.register(c1);
        s.register(c2);
        
        s.inviteSale();
    }
    
}
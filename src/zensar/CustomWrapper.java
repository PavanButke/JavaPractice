package zensar;

class meth
{  
    private int i;  
    meth(){}  
    meth(int i)
    {  
        this.i=i;  
    }  
    public int getValue()
    {  
        return i;  
    }  
    public void setter(int i)
    {  
        this.i=i;  
    }  
    
  
    public String toString() {  
      return Integer.toString(i);  
    }  
}  
 
public class CustomWrapper
{  
    public static void main(String[] args)
    {  
        meth i = new meth(79);  
        System.out.println("Value for Custom Class "+i);  
    }
}  
abstract class pen
{
 abstract void write();
 abstract void refill();
}
class writing extends pen
{
public void write()
{
System.out.println("writing");
} 

public void refill()
{
    System.out.println("refilling......");
}
}

public class P11_Abstract_Q1 {
    public static void main(String[] args)
    {
        writing s=new writing();
        s.write();
        s.refill();
    }
    
}

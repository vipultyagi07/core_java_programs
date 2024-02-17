abstract class Pen12
{
 abstract void write();
 abstract void refill();
 public void changenib()
 {
  System.out.println("changing nib 1");
 }
}
class FountainPen extends Pen12
{
public void write()
{
System.out.println("writing");
} 

public void refill()
{
    System.out.println("refilling......");
}
public void changenib()
 {
    
  System.out.println("changing nib 2"); 
 }
}

public class P11_Abstract_Q2 {
     public static void main(String[] args)
    {
       FountainPen s=new FountainPen();
        s.write();
        s.refill();
        s.changenib();
        
    }
    
}

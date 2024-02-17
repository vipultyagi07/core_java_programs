import java.util.Scanner;
class Rectangle1{
    private float l,b;
    Rectangle1()
    {
      l=1;
      b=1;

    }
    Rectangle1(float x)
    {
      l=2;
      b=2;

    }
    Rectangle1(float x,float y)
    {
      l=x;
      b=y;

    }
    public float getLength() {
        return l;
    }

    public float getBreadth() {
        return b;
    }

}

public class P9_AccessModifier_Q4 {
    public static void main(String[] args)
    { Scanner s=new Scanner(System.in);
        System.out.println("Enter the length");
        float a=s.nextFloat();
        System.out.println("Enter the breadth");
        float b=s.nextFloat();
        Rectangle1 vip=new Rectangle1(a,b);
        System.out.printf("\n the length is %f",vip.getLength());
        
        System.out.printf("\n the breadth is %f",vip.getBreadth());

    }
    
}

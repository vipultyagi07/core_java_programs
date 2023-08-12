import java.util.Scanner;
class Circle23
{   public float r;
    public void setr(float r)
    {
      this.r=r;
    }
    public float area()
    {
      float area=3.14f*r*r;
      return area;

    }
}
class Cylinder12 extends Circle23
{   public float h;
    Cylinder12(float r)
    {
        this.r=r;   // We can't pass the varibale in inheritance, although we can use the same variable in upper class(superclass)
    }
    public void seth(float h)
    {
        this.h=h;
    }
    public void area1()
    {
      float area=2*3.14f*this.r*this.h;
      
      System.out.printf("the area of cylinder is %.2f",area);

    }
    
    
}
public class P10_Inheritance_Q1 {
    public static void main(String[] args)
    {
       Scanner s=new Scanner(System.in);
       Circle23 c1=new Circle23();
       Cylinder12 c2=new Cylinder12(5.2f);
           
     c1.setr(5.0f);
     c2.seth(2.0f);
     c2.area1();
    



    }
    
}

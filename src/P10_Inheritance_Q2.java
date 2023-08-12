import java.util.Scanner;
class Rectangle12
{
float l,b;
Rectangle12(float l,float b)
{
    this.l=l;
    this.b=b;

}  
public void area1()
{
    System.out.printf("area of Rectangle is %.2f",this.l*this.b);
} 
}

class Cuboid1 extends Rectangle12
{  float h;


    Cuboid1(float l, float b, float h) 
    {
        super(l, b);
        this.h=h;
        //TODO Auto-generated constructor stub
    }

    public void area2()
    {
        System.out.printf("Area of the cuboid is %.2f ",this.l*this.b+this.b*this.h+this.l*this.h);
    }

   
}
public class P10_Inheritance_Q2 {
    public static void main(String[] args)
   {
    Scanner s=new Scanner(System.in);

    System.out.println("Enter the length and breadth of rectangle");
    float l=s.nextFloat();
    float b=s.nextFloat();
  
    Rectangle12 r=new Rectangle12(l, b);
    r.area1();

    System.out.println("Enter the height of cuboid");
    float h=s.nextFloat();
    Cuboid1 c=new Cuboid1(l, b, h);
    c.area1();
    c.area2();







   }
}

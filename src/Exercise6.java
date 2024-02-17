import java.util.*;
class rectangle0
{
	private int l,b;

	public void set(int l,int b)
	{
		this.l=l;
		this.b=b;
	}
	public int area()
	{
		int a;
		a=this.l*this.b;
        return a;
	}
}
/////////////////
class square0
{
	private int L;

	public void set(int L)
	{
		this.L=L;
	
	}
	public int area()
	{
		int ar;
		ar=this.L*this.L;
		return ar;

	}
}
/////////////////
class circle0
{
 double r;
public void set(double r)
{
  this.r=r;

}
public double getradius()
{   System.out.println(this.r);
	return this.r;
}
public double area()
{
 double area;
 return 3.14*this.r*this.r;
}
}
///////////////

class cylinder0 extends circle0
{
	private double height;

	public void set(double height)
	{
      this.height=height;

	}
	
	

	public double area()
	{   double are;
		are=2*3.14*this.height;
		
        return are;

	}
}
////////////////////

class sphere0 extends circle0
{
	public double area()
	{   double areaa;
		areaa=4*3.14*this.r*this.r;
		return areaa;

	}
}

public class Exercise6
{
	public static void main(String[] args)
	{
      Scanner s=new Scanner(System.in);
       rectangle0 r=new rectangle0();
       square0 sq=new square0();
       circle0 c=new cylinder0();
       cylinder0 cy=new cylinder0();
       sphere0 sp=new sphere0();

       System.out.println("enter the length and breadth of rectangle");
       int l=s.nextInt();
       int b=s.nextInt();

       r.set(l,b);
       System.out.println(r.area());
       System.out.println("Enter the side of square");

       int a=s.nextInt();
       sq.set(a);
       System.out.printf("Area of square is %d\n",sq.area());

       System.out.println("Enter the radius of circle");

       double ra=s.nextDouble();
       c.set(ra);
       System.out.print("Area of the circle is : ");
       System.out.print(c.area());
       System.out.println();

       System.out.println("Enter the height of cylinder   ");
       double h=s.nextDouble();
       cy.set(h);
       System.out.print("Area of the cylinder is : ");
       cy.getradius();
       System.out.println();
       
       System.out.print("Area of the sphere is : ");
       System.out.print(sp.area());
       System.out.println();



       
       







	}
}


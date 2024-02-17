import java.util.*;
class rectangle
{
	private int l,b;

	public void setlb(int l,int b)
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
class square
{
	private int L;

	public void setl(int L)
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
class circle
{
 double r;
public void setr(double r)
{
  this.r=r;

}
public double getradius()
{   //System.out.println(this.r);
	return this.r;
	
}
public double area()
{
 double area;
 return 3.14*this.r*this.r;
}
}
///////////////

class cylinder extends circle
{
	private double height;

	public void seth(double height)
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

class sphere extends circle
{
	public double area()
	{   double areaa;
		areaa=4*3.14*this.r*this.r;
		return areaa;

	}
}

public class Eercise6
{
	public static void main(String[] args)
	{
      Scanner s=new Scanner(System.in);
       rectangle r=new rectangle();
       square sq=new square();
       circle c=new circle();
       cylinder cy=new cylinder();
       sphere sp=new sphere();

       System.out.println("enter the length and breadth of rectangle");
       int l=s.nextInt();
       int b=s.nextInt();
	   

       r.setlb(l,b);
       System.out.println(r.area());
       System.out.println("Enter the side of square");

       int a=s.nextInt();
       sq.setl(a);
       System.out.printf("Area of square is %d\n",sq.area());

       System.out.println("Enter the radius of circle");
       double ra=s.nextDouble();
	   c.setr(ra);
       //cy.getradius();
       System.out.print("Area of the circle is : ");
       System.out.print(c.area());
       System.out.println();


       System.out.println("Enter the height of cylinder   ");
       double h=s.nextDouble();
       cy.seth(h);
	   System.out.println("Enter the height of cylinder   ");
       double rc=s.nextDouble();
       cy.setr(rc);
	   cy.getradius();
       System.out.print("Area of the cylinder is : ");
       System.out.println(cy.area()*cy.getradius());
       System.out.println();
       
       



       
       






	}
}


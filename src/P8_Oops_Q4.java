import java.util.Scanner;
class Rectangle{
 int side1,side2;
 Scanner s=new Scanner(System.in);
 public void getside()
 { System.out.println("Enter the sides of Rectangle");
   side1=s.nextInt();
   side2=s.nextInt();
 }

 public int area()
 {
   return side1*side2;
 }
 public int perimeter()
 {
   return 2*(side1+side2);
 }
 public void getdetail()
 { 
   
     
     

 }
 


}
public class P8_Oops_Q4 {
    public static void main(String[] args)
    {
      Rectangle sq=new Rectangle();
      sq.getside();
      sq.area();
      sq.perimeter();
      sq.getdetail();
      System.out.printf("\nArea is %d\n",sq.area());
     
      System.out.printf("\nperimeter =%d",sq.perimeter());

    }
    
}

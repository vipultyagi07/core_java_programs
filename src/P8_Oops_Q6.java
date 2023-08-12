import java.util.Scanner;
class Circle{
 float side1;
 Scanner s=new Scanner(System.in);
 public void getside()
 { System.out.println("Enter the radius of Circle");
   side1=s.nextFloat();
   
 }

 public float area()
 {
   return 22*side1*side1/7;
 }
 public float perimeter()
 {
   return 2*(side1*22)/7;
 }
 public void getdetail()
 { 
   
     
     

 }
 


}
public class P8_Oops_Q6 {

    public static void main(String[] args)
    {
      Circle sq=new Circle();
      sq.getside();
      sq.area();
      sq.perimeter();
      sq.getdetail();
      System.out.printf("\nArea is %.1f\n",sq.area());
     
      System.out.printf("\nperimeter =%.2f",sq.perimeter());

    }
    
}

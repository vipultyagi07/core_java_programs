import java.util.Scanner;
class Square{
 int side;
 Scanner s=new Scanner(System.in);
 public void getside()
 { System.out.println("Enter the side of square");
   side=s.nextInt();
 }

 public int area()
 {
   return side*side;
 }
 public int perimeter()
 {
   return 4*side;
 }
 public void getdetail()
 { 
   
     
     

 }
 


}

public class P8_Oops_Q3 {
    public static void main(String[] args)
    {
      Square sq=new Square();
      sq.getside();
      sq.area();
      sq.perimeter();
      sq.getdetail();
      System.out.printf("\nArea is %d\n",sq.area());
     
      System.out.printf("\nperimeter =%d",sq.perimeter());

    }
    
}

// WAP to print the multiplication table of a given no in reverse order.
import java.util.Scanner;
public class P5_loop_Q4 {
    public static void main(String[] args)
    {
     
     Scanner s=new Scanner(System.in);
     System.out.println("Enter the no, of whom you want to print the table");
     int n=s.nextInt();
     int i;
     for(i=10;i>=1;i--)
     {
         System.out.printf("\n%d*%d=%d",n,i,n*i);

     }    

    }
    
}

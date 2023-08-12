// WAP to print the sum of all the no's of multiplication table of a given no.
import java.util.Scanner;
public class P5_Loop_Q9 {

    public static void main(String[] args)
    {
     
     Scanner s=new Scanner(System.in);
     System.out.println("Enter the no, of whom you want to print the table");
     int n=s.nextInt();
     int i,sum=0;
     for(i=10;i>=1;i--)
     {
         System.out.printf("\n%d*%d=%d",n,i,n*i);
         sum=sum+n*i;

     }    
 System.out.printf("\rSum of all the no in %d table is %d",n,sum);
    }
    
}

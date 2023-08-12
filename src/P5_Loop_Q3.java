// WAP to print the multiplication table of a given no.
import java.util.Scanner;
public class P5_Loop_Q3 
{
    public static void main(String[] args)
    {
     
     Scanner s=new Scanner(System.in);
     System.out.println("Enter the no, of whom you want to print the table");
     int n=s.nextInt();
     int i;
     for(i=1;i<=10;i++)
     {
         System.out.printf("\n%d*%d=%d",n,i,n*i);

     }    

    }
}

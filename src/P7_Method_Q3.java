
// WAP to print the sum of n number using recursion method(function)
import java.util.Scanner;
public class P7_Method_Q3 
{
   static int sum(int a)
    {
     if(a==1)
     {
         return 1;
     }
     else{
         return a+sum(a-1);
     }
    }
    public static void main(String[] args)
    {
        int n;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the no");
        n=s.nextInt();
       System.out.printf("sum is %d",sum(n));



    }
    
}
 


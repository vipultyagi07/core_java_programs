// WAP to print the table of a no using methods(function)
import java.util.Scanner;
public class P7_Method_Q1 
{
    static void multiplytable(int a)
    {
     for(int i=1;i<=10;i++)
     {
         System.out.printf("%dX%d= %d\n",a,i,a*i);
     }
    }

    static  void multiplytable(float a)
    {

    }
    public static void main(String[] args)
    {
        int n;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the no");
        n=s.nextInt();
        multiplytable(n);


    }
    
}

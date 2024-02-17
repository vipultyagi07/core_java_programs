// WAP to print the nth no. of a fibonacci no using recursion
import java.util.Scanner;
public class P7_method_Q5 {
    static int fib(int a)
    {
        if(a==1||a==2)
        {
            return 1;

        }
        else
        {
         return fib(a-2)+fib(a-1);
        }


    }

    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the term of fibonacci");
        int n=s.nextInt();
        int i;
     System.out.printf("%d ",fib(n));
    }
    
    
}

    

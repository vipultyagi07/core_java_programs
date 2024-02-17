import java.util.Scanner;
public class P7Ch_Recursion_Fibonacci {
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
        System.out.println("enter the size of fibonacci");
        int n=s.nextInt();
        int i;
        for(i=1;i<=n;i++)
       { System.out.printf("%d ",fib(i));}
    }
    
}

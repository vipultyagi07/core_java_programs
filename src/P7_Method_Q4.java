// WAP to print the pattern of a size n using methods(function)
/*

*****
****
***
**
*


*/
import java.util.Scanner;
public class P7_Method_Q4 {
    static void pattern(int a)
    {
     for(int i=a;i>=1;i--)
     { for(int j=0;j<i;j++)
         {System.out.printf("*");
          }
          System.out.println();
     }
    }
    public static void main(String[] args)
    {
        int n;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of pattern");
        n=s.nextInt();
        pattern(n);


    }
    
}

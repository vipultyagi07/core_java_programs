//WAP to find factorial of a given number
import java.util.Scanner;
public class P5_Loop_Q5 
  {
    public static void main(String[] args)
    { System.out.println("Enter a no. for finding factorial");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1,fact=1;
        for(i=1;i<=n;i++)
        {
            fact*=i;

        }


   System.out.printf("factorial=%d",fact);
    }

    
  }

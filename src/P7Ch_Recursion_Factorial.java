import java.util.Scanner;
public class P7Ch_Recursion_Factorial 
{
 static int factorial(int a)
 {  if(a==1||a==0)
    {
        return 1;
    }
    else
    { int f;
    f=a*factorial(a-1);
    return f;}

 }  
 
 public static void main(String[] args)
 { Scanner s=new Scanner(System.in);
    System.out.println("Enter the no.");
    int x=s.nextInt();

    System.out.printf("Factorial of %d is %d",x,factorial(x));


 }
}

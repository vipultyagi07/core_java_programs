// WAP to add sum of all even no starting from 2 using while loop

import java.util.Scanner;
public class P5_Loop_Q2 
{
 public static void main(String[] args)
 {
   Scanner s=new Scanner(System.in);

   System.out.println("enter the last limit for sum");
   int n=s.nextInt();
   int sum=0,i=2;
   while(i<=n)
   {
     if(i%2==0)
     {
         sum+=i;
     }  
    i++;
   }
  System.out.printf("sum of even number upto %d is %d",n,sum);


 }
}

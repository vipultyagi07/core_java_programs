/* WAP to print the pattern of n(n being the no. of star in first line or no's of lines) size
*****
****
***
**
*    */
import java.util.Scanner;
public class P5_Loop_Q1 
{ public static void main(String[] args)
 {
Scanner s=new Scanner(System.in);
System.out.println("Enter the size of pattern");
int n=s.nextInt();
int i,j;
for(i=n;i>0;i--)
 {
   for(j=0;j<i;j++)
   {
       System.out.print("*");
   }
   System.out.println("");

 }


    
}
}
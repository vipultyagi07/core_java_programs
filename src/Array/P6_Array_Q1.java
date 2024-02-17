//WAP to enter 5 no's in an array and then find their sum
package Array;
import java.util.Scanner; 
public class P6_Array_Q1 {
    public static void main(String[] args)
    {
     float [] arr=new float[5];
     Scanner s =new Scanner(System.in);
     System.out.println("ENter 5 no's");
     
     int i,j;
     float sum=0;
     int n=arr.length;
     for(i=0;i<n;i++)
     {
         arr[i]=s.nextFloat();

     }
     for(j=0;j<n;j++)
     {
         sum=sum+arr[j];

     }
     System.out.printf("the sum of the array=%.3f",sum);

    }

    
}

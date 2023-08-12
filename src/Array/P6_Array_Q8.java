package Array;
import java.util.Scanner;
public class P6_Array_Q8 {

    public static void main(String[] args)
    {   int[]arr=new int[10];
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the size of array");
      int n=s.nextInt();
      System.out.printf("Enter the array of size %d",n);
      int i,count=0;
      
      for(i=0;i<n;i++) 
      {
          arr[i]=s.nextInt();

      }
      for(i=0;i<n;i++)
      {
        if(arr[i+1]>arr[i])
        {
            count++;
        }

      }
      if((count+1)==6)
      {
          System.out.println("array is sorted");
      
      }
      else
      System.out.println("array is not sorted");
    
    }

}

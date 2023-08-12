//WAP to find maximum element in an array
package Array;
import java.util.Scanner;
public class P6_Array_Q7 {

    public static void main(String[] args)
    {   int[]arr=new int[4];
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the array of size 4");
      int i,j,count;
      int n=arr.length;
      for(i=0;i<arr.length;i++)
      {
          arr[i]=s.nextInt();

      }
      for(i=0;i<arr.length;i++)
      {  count=0;
        for(j=0;j<arr.length;j++)
        {
            if(arr[i]<arr[j])
            {
                count++;
            }
  
        }
        
        if(count==(n-1))
        {
            System.out.printf("minimum no of this array is %d",arr[i]);
            break;
        }

      }
      

    }
    
}

package Array;
import java.util.*;


public class Sorting_Array {

    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int[] arr=new int[20];
      System.out.println("Enter the length of the array");
       int n=s.nextInt();
       int c;
       for(int i=0;i<n;i++)
       {
           arr[i]=s.nextInt();
       }
       
       for(int i=0;i<n;i++)
       {
           for(int j=i+1;j<n;j++)
           {
               if(arr[i]>arr[j])
               {
                  c=arr[i];
                  arr[i]=arr[j];
                  arr[j]=c;
               }
               else 
               {
                   continue;
               }
           } 
       }
       System.out.println();
for(int k = 0;k<n;k++)
{
    
    System.out.println(arr[k]);   
}


    }
    
    
}   

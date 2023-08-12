package String;
import java.util.*;

public class String_Sort {
    public static void main(String[] args)
   {
    Scanner s=new Scanner(System.in);

    System.out.printf("Enter a string");
    String str=s.nextLine();
    int n=str.length();
    char[] arr=new char[20];
    char c;

    arr=str.toCharArray();
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

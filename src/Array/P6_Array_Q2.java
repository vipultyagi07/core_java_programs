// WAP to find whether a no. is present in the array or not
package Array;
import java.util.Scanner;
public class P6_Array_Q2 {
    public static void main(String[] args)
    {   
        Scanner s=new Scanner(System.in);
        int [] arr=new int[5];
        System.out.println("Enter an array's no. of size 5");
        int i,num;
        for(i=0;i<arr.length;i++)
        {
            arr[i]=s.nextInt();

        }
        System.out.println("Enter the no. you want to find ");
        
        num=s.nextInt();
        int count=0;

        for(i=0;i<arr.length;i++)
        {
            if(arr[i]==num)
            {
                count++;
            }

        }
        if(count>0)
        {
            System.out.println("No is present in the array");
        }
        else
        {
            System.out.println("No is  NOT present in the array");
        }

    }
    
}

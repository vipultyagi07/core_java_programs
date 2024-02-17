import java.util.Scanner;
public class Print_Reverse_Array {

    public static void main(String[] args)
    { Scanner s=new Scanner(System.in);

       int [] arr=new int[5];
       
       System.out.print("Enter 5 no. ");

       int i=0;
       for(i=0;i<5;i++)
       {
        arr[i]=s.nextInt();
       }
       for(i=arr.length-1;i>=0;i--)
       {
         System.out.print(arr[i]);
         System.out.print(" ");
       }

    }


    
}

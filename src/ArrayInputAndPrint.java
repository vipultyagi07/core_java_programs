import java.util.Scanner;
public class ArrayInputAndPrint {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);

        int [][] arr=new int[3][3];

       System.out.printf("Enter 9 no's");
       
       int i,j;
        int n=arr.length;
       for(i=0;i<n;i++)
       {
        for(j=0;j<n;j++)
        {
            
         arr[i][j]=s.nextInt();

         
        }

       }

       for(i=0;i<n;i++)
       {
        for(j=0;j<n;j++)
        {
            
         System.out.printf("%d ",arr[i][j]);
        

         
        }
        System.out.println();

       }
    }
    
}

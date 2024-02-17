package Array;

//WAP to add two matrices
import java.util.Scanner;
public class P6_Array_Q4 {
    public static void main(String[] args)
    {

        Scanner s=new Scanner(System.in);
        int [][] arr1=new int[2][3];
        int [][] arr2=new int[2][3];
        int[][]sum= new int[2][3];
        int i,j;
        System.out.println("enter 6 element in first array");

        for(i=0;i<2;i++)
        {
            for(j=0;j<3;j++)
            {
                arr1[i][j]=s.nextInt();

            }

        }
        
        System.out.println("enter 6 element in first array");
        for(i=0;i<2;i++)
        {
            for(j=0;j<3;j++)
            {
                arr2[i][j]=s.nextInt();

            }

        }
        for(i=0;i<2;i++)
        {
            for(j=0;j<3;j++)
            {
                sum[i][j]=arr1[i][j]+arr2[i][j];

            }

        }
        for(i=0;i<2;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.printf("%d ",arr1[i][j]);

            }
            System.out.println();

        }
        System.out.println();
        System.out.println("+");
        
    for(i=0;i<2;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.printf("%d ",arr2[i][j]);

            }
            System.out.println();

        }
        System.out.println();
        System.out.println("=");
    
        for(i=0;i<2;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.printf("%d ",sum[i][j]);

            }
            System.out.println();

        }
    }
}
    


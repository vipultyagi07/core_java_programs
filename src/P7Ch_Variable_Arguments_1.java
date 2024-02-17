import java.util.Scanner;
public class P7Ch_Variable_Arguments_1 {

    public static int add(int ...arr)
    {
        int i,sum=0;
        int n=arr.length;
        for(i=0;i<n;i++)
        {
            sum=sum+arr[i];
        }
        return sum;
    }

    public static void main(String[] args)
    {
        int a=2,b=3,c=4,d=1;
       System.out.printf("the sum =%d",add(a,b,c,d));
    }
    


}

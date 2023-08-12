import java.util.Scanner;
public class P7Ch_Arrays_In_Method {

static int sum(int[]a,int n)
{
     int j,su=0;
     for(j=0;j<n;j++)
     {
       su=su+a[j];

     }
     return su;
    
}

public static void main(String[] args)
{
    Scanner s=new Scanner(System.in);
    int[]arr=new int[10];

    System.out.println("Enter the size of the array");
    int N=s.nextInt();

    int i;
    for(i=0;i<N;i++)
    {
        arr[i]=s.nextInt();

    }
    
    System.out.printf("sum of the element of the array = %d",sum(arr,N));


}


}

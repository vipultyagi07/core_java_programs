public class P7Ch_Variable_Arguments_2 {
    static int add(int a, int ...arr)
    {
        int i,sum=0;
        int n=arr.length;
        for(i=0;i<n;i++)
        {
            sum=sum+arr[i];
        }
        return sum+a;
    }
 
    public static void main(String[] args)
    {
        int A=9,b=3,c=4,d=1;
       System.out.printf("the sum =%d",add(A,b,c,d));
        //System.out.println(sum()); // this will throw the error
    }

       
    
}

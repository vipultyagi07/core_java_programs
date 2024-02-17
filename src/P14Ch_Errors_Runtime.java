public class P14Ch_Errors_Runtime {

    public static void main(String[] args)
    {
        System.out.println(1000/0);//Exception in thread "main" java.lang.ArithmeticException: / by zero

        int[] a={1,2,3,4};
        for(int i=0;i<=4;i++)
        {
            System.out.println(a[i]);//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
        }
    }
}

import java.util.*;
public class P14Ch_Errors_Exceptions {

    public static void main(String[] args)
    {
      // 1. null pointer exception
      
      
      /*
          // Initializing String variable with null value
           String ptr = null;
  
          // Checking if ptr.equals null or works fine.
      
          // This line of code throws NullPointerException
          // because ptr is null
         if (ptr.equals("gfg"))   //Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.equals(Object)" because "ptr" is null
          System.out.print("Same");
         else 
          System.out.print("Not Same");
         */

     // 2.  Arithmatic exception

     /*
     System.out.println(1000/0); //Exception in thread "main" java.lang.ArithmeticException: / by zero
     */

     // 3.  ArrayIndexOutOfBoundsException(it is also for strings or char[] array)

     /*
     int[] a={1,2,3,4};
     for(int i=0;i<=4;i++)
     {
         System.out.println(a[i]);//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
     }
     */


     // 4. InputMismatchException
     /*  
     Scanner s=new Scanner(System.in);
     
        System.out.println("enter your name n english");
      int a=s.nextInt();   //Exception in thread "main" java.util.InputMismatchException
      System.out.println(a);
     */

     // 5. NumberFormat Exception
       
        String s="1234a5";
        int i=Integer.valueOf(s);  // Exception in thread "main" java.lang.NumberFormatException: For input string: "123j5"
        System.out.println(i);


    }
    
}

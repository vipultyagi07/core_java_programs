import java.util.*;
public class P14Ch_Specific_Exception {
    public static void main(String[] args)
    {


     // 3.  ArrayIndexOutOfBoundsException(it is also for strings or char[] array)
    Scanner s=new Scanner(System.in);
     
     int[] a={1,2,3,4};
     System.out.println("Enter the index of array ");
     int i=s.nextInt();
     System.out.println("Enter the no' for dividing the index item");
     int n=s.nextInt();

         
     try{
        System.out.println(a[i]/n); 
        }
    
        catch (ArithmeticException e){
            System.out.println("ArithmeticException occured!");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occured!");
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println("Some other exception occured!");
            System.out.println(e);
        }

    }
}
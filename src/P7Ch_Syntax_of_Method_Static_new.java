// Java program to Illustrate Calling of a Static Method
 
// Class 1
// Helper class
class Helper1 {
 
    // Static method
    public static int sum(int a, int b)
    {
        // Simply returning the sum

        return a + b;
    }
}

public class P7Ch_Syntax_of_Method_Static_new {

    public static void main(String[] args)
    {
        // Custom values for integer
        // to be summed up
        int n = 3, m = 6;
 
        // Calling the static method of above class
        // and storing sum in integer variable
        int s = Helper1.sum(n, m);
 
        // Print and display the sum
        System.out.print("sum is = " + s);
    }
    
}

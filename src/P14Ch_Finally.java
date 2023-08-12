import java.util.ArrayList;
public class P14Ch_Finally {
    public static void main(String[] args)
    {
        for(int i=0;i<5;i++)
        {
           
        try
        {
            System.out.println(8/0);// try putting '0' or any non-zero no.
        }
        catch(Exception e)          // if we do not put catch block after try block "finally" n  
        {
            System.out.println(e);
            
        }


        finally
        {
            System.out.println("Wow you have come down to the end of program");// it doesn't matter whether "try" or "catch" block will run,
            // finally block will run in either case

            // **no matter what program or loop tells but finally block will
            // ***print the content
        }
        

        }
    }

}


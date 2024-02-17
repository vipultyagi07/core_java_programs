public class P14Ch_try_and_catch {

    public static void main(String[] args)
    { try{
        int[] a={1,2,3,4};
        for(int i=0;i<=4;i++)
        {
            System.out.println(a[i]);//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
        }
    }
    catch(Exception d)
    {
      System.out.println("You got fucked up! because of: "+d);

    }

    System.out.println("bye bye ");// this depicts that instead of having error in the program we can run the further program easily
    
    
    }

    
}

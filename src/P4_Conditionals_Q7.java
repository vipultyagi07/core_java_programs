import java.util.Scanner;
public class P4_Conditionals_Q7 
{
    public static void main(String[] args)
    {
        Scanner s =new Scanner(System.in);
        String str=s.next();
        if(str.endsWith(".com"))
        {
            System.out.println("It is a commercial website");
        
        }

        else if(str.endsWith(".org"))
        {
            System.out.println("It is an organisational website");
        }
        else if(str.endsWith(".in"))
        {
            System.out.println("It is an Indian website");
        }



    }

}

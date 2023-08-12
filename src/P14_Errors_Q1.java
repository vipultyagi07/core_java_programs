import java.util.*;

public class P14_Errors_Q1
{
	public static void main(String[] args)
	{   Scanner s=new Scanner(System.in);
		int a,b;
		System.out.println("Enter two no.s");
		a=s.nextInt();
		b=s.nextInt();


		

        try
        {
        	System.out.println(a/b);
        }
        catch(ArithmeticException e)
        {
        	System.out.println("he he he ");

        }
        catch(IllegalArgumentException e)
		{
			System.out.println("Haa Haa");
		}
	}
}
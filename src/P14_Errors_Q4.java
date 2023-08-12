import java.util.*;
 class MyError extends Exception
{

	@Override
	public String toString()
	{
		return "You have exceeded the limit of entering the index";
	}
}
public class P14_Errors_Q4
{
	public static void main(String[] args)
	{
	  Scanner s=new Scanner(System.in);
	int[] arr={1,2,3,5,6};
    int loop=0;
    int count=0;
    do{
    System.out.println("Enter the index of the array");
    int n=s.nextInt();
    
    
    try{
    	System.out.println(arr[n]);
    }
    catch(Exception e)
    {
      count++;
      loop=1;
      System.out.println(count);
    }
    if(count==5)
    {
    	try
    	{
    		throw new MyError();

    	}
    	catch(Exception e)
    	{
    		//System.out.println(e);
    		e.printStackTrace();
    	}
    	break;

    }
 }
 while(loop==1);	
	}
}
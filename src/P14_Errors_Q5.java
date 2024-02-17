import java.util.*;
class MyError1 extends Exception
{

  @Override
  public String toString()
  {
    return "You have exceeded the limit of entering the index";
  }
}

public class P14_Errors_Q5
{ public static void acess(int[] arr) throws MyError1
{Scanner s=new Scanner(System.in);
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
      System.out.println(e);
    }
    if(count==5)
    { 
        throw new MyError1();
     
     }
 }
 while(loop==1);
}
	public static void main(String[] args)
	{
	
	int[] arr={1,2,3,5,6};
   try{
   acess(arr);
 }
 catch(Exception e)
 {
  System.out.println(e);  
	}
 }
}
import java.util.*;
class MyException extends Exception{
@Override
public String toString()
{
    return "it is a negative no. please provide a positive no.";
}

public String getMessage()
{
    return "message: it is a negative no. please provide a positive no.";
}

}

public class P14Ch_Custom_Exception_Class {


    
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int r;
        System.out.println("Enter the side of square");
        r=s.nextInt();// but we know that the side should be positive, but complier and interpreter does not know about it, so they won't give
                      // exception, so we have to create our own exception.
         
        if(r<0)
        {
          try{
             throw new MyException();  
          }
          catch(Exception e)
          {
           System.out.println(e); // it will work like a Built-in API and print "e(Exception)" using System.out.println(e);
           System.out.println(e.getMessage()); // while it is a general method of printing any function
           e.printStackTrace();
          }
        }
     else
        {int area=r*r;
        System.out.println("area of the square is: "+area); 
        }
        System.out.println("The program also work after printing the error ");
    }
}

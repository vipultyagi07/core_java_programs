import java.util.*;
class NegativeNumber extends Exception{
    @Override
    public String toString()
    {
        return "it is a negative no. please provide a positive no.";
    }
    


    }
    
    
public class P14Ch_throw_throws {

    static double dividee(double a ,double b) throws NegativeNumber  
    {   if(a<0||b<0) 
       { 
           throw new NegativeNumber();
       }
        else{
            double c=a/b;
            return c;}

      }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
           System.out.println("Enter two no's for dividing");
           double a=s.nextDouble();
           double b=s.nextDouble();
            
           
     

            try{
                
            System.out.println("divide of two no's is"+ dividee(a,b));
            
               }
            catch(Exception e)
            {

                e.printStackTrace();
            }

    }
}

import java.util.Scanner;
import java.util.Random;
class GuessNo{
    
    GuessNo(int n){
        Random r=new Random();
        int p=r.nextInt(10);
        if(n>p)
        {
            System.out.println("No. is larger than generated no.");
        }
        else if(n<p)
        {
            System.out.println("No. is smaller than generated no.");
        }
        else if(n==p)
        {
            System.out.println("Hurray!!!! You Won,");
        }
      System.out.printf("\n\nGenerated no. is %d",p);
    }

}
public class P9Ch_Oops_GuessTheNo {
    public static void main(String[] args)
    {
        int n;
        Scanner s=new Scanner(System.in);   
        System.out.println("Enter a no. for guessing, between 0 and 10");
        n=s.nextInt();
        GuessNo vip=new  GuessNo(n);
        

    }
    
}

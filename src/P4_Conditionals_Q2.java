import java.util.Scanner;
public class P4_Conditionals_Q2 {

    public static void main(String[] args)
    {
      Scanner s= new Scanner(System.in);
      int a,b,c,sum;
      System.out.println("Enter the marks of 3 subjects");
      a=s.nextInt();
      b=s.nextInt();
      c=s.nextInt();
      sum=(a+b+c)/3;
      if(sum>=40&&a>=33&&b>=33&&c>=33)
      {

        System.out.println("Pass");

      }
      else
      {
        System.out.println("Fail");

      }


    }
    
}

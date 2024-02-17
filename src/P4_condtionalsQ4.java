import java.util.Scanner;
public class P4_condtionalsQ4 {

    public static void main(String[] args)
    {
        System.out.println("Enter Income in lakhs");
      Scanner s = new Scanner(System.in);
      float a;
      a=s.nextFloat();

      if(a<2.5)
      {
          System.out.println("No Tax");
      }

      else if(a>=2.5&&a<5)
      {
        System.out.println(a*5/100);
      }

      else if(a>=5&&a<10)
      {
        System.out.println(a*20/100);
      }
      else if(a>=10)
      {
        System.out.println(a*30/100);
      }


    }

    
}

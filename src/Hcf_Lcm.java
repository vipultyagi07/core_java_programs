import java.util.Scanner;
public class Hcf_Lcm {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter two no's");
        int a=s.nextInt();
        int b=s.nextInt();
        int i;
        for(i=a*b;i>=2;i--)
        {
            if((a%i==0)&&(b%i==0))
             {
                 System.out.printf("The hcf of %d and %d is %d",a,b,i);
                 break;
             }

             


        }
        for(i=2;i<=a*b;i++)
        {
            if((i%a==0)&&(i%b==0))
             {
                 System.out.printf("The lcm of %d and %d is %d",a,b,i);
                 break;
             }

             


        }

    }
    
}

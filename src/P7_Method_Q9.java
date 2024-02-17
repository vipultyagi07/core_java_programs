//WAP to convert celcius to farenheit
import java.util.Scanner;
public class P7_Method_Q9 {

    static float convert(float a)
    {
     float n;
     n=(9*a)/5+32;
     return n;
    }
    public static void main(String[] args)
    {
        float n;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the temprature");
        n=s.nextFloat();
        System.out.printf("Converted temprature in farenheit is %.1f",convert(n));


    }
    
}

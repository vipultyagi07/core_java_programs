//WAP to detect double and triple spaces
package String;
import java.util.Scanner;
public class String_Q4 {

    public static void main(String[] args)
    {
       Scanner s=new Scanner(System.in);

       System.out.println("Enter a Sentence");
       String str=s.nextLine();

       System.out.println(str.indexOf("  "));
        
       System.out.println(str.indexOf("   "));




    }



}

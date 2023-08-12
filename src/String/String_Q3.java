// WAP to write name in a given sentence
package String;
import java.util.Scanner;
public class String_Q3 {
    public static void main(String[] args)
    {   
        Scanner s=new Scanner(System.in);
        String str="Dear name , Thanks a lot";
        System.out.println("Enter an name");
        String name=s.next();

        String newstr=str.replace("name",name);
        
        System.out.println(newstr);




    }
    
}

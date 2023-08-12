//WAP to replace space in a string with underscore(_)
package String;
import java.util.Scanner;
public class String_Q2 
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("enter a sentence");
 String str =s.nextLine();

 String withoutspace=str.replace(' ','_');
 System.out.println(withoutspace);



}


    
}

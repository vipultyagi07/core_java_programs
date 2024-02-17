import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
import javax.swing.text.DefaultStyledDocument.ElementSpec;

public class P4_Conditionals_Q6 
{
 public static void main(String[] args)
 {

   Scanner s =new Scanner(System.in);
   int a =s.nextInt();
   if(a%4==0&&a%400==0&&a%100==0)
   {
    System.out.println("Entered year is a leap year");


   }
   
   else
   System.out.println("Not a leap year");


 }

}

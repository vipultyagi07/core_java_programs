import java.util.Scanner;
public class Printf_Format_Println {

    public static void main(String[] args)
    {  Scanner s=new Scanner(System.in);
        int a=4;
        float b=45.256f;
        String str=s.next();

       // System.out.println("the value of a :%d \n The value of b is %f",a,b);--> This method of print/println will 
       //not work with format specifiers, so we use printf instead;
       
      // System.out.printf("the value of a :%d \n The value of b is %.3f",a,b);
      // System.out.format("\n\nthe value of a :%d \n The value of b is %.3f",a,b);
       System.out.printf("%15d%3s%n",a,str);


    }
    
}

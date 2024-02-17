import java.util.Scanner;

public class CgpaProgram {

public static void main(String[] args)
{
    int a,b,c;
    float cgpa,sum;

    System.out.println("enter the marks of 3 suject");

    Scanner s = new Scanner(System.in);
    a=s.nextInt();
    b=s.nextInt();
    c=s.nextInt();

 System.out.println("three entered subjects marks are");

System.out.println(a);
 
System.out.println(b);
System.out.println(c);
sum=(a+b+c);
cgpa=(sum)/3;   // It still contain integer value because operation is done on integer value. To correct this problem take the marks of subject in float itself

System.out.println(cgpa);


}






}


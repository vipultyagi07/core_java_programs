import java.util.Scanner;

class printing
{
  public void print(int a)
  {
    System.out.printf("the no which was enterd by us using scanner class is %d",a);
  }

}

public class P12_AcessModifier_Q2

{

public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int a=s.nextInt();
printing p=new printing();

p.print(a); 
}
} 
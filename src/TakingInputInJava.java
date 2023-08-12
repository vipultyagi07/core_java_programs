import java.util.Scanner;

public class TakingInputInJava {
    public static void main(String[] args) {
    System.out.println("enter a no");
  
    Scanner s=new Scanner(System.in);
    s.close();

    int a=s.nextInt();
    System.out.println(a);

        
    }
}

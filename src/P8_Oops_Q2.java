import java.util.Scanner;
class CellPhone{

    public void ring()
    {
      System.out.println("ringing....ringing...");
    }
    public void vibrate()
    {
      System.out.println("vibrating....");
    }
    public void callfriend()
    {
      System.out.println("calling Akash budgandi");
    }
}
public class P8_Oops_Q2 {
    public static void main(String[] args)
    {

    CellPhone poco=new CellPhone();
    poco.ring();
    poco.vibrate();
    poco.callfriend();



    
}
}
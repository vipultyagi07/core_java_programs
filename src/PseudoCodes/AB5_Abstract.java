package PseudoCodes;
abstract class m{
public abstract void disp();

}
class n extends m{
  /*protected*/ /* */ public void disp()
    {
        System.out.println("Displaying the method");
    }
}
public class AB5_Abstract {
    public static void main(String[] args) {
        n a=new n();
        a.disp();
    }
}

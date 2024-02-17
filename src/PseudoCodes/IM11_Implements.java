package PseudoCodes;
interface A3 {
    void m1();
}
abstract class B3 implements A3 {
    public void m1(){
        System.out.println("One");
    }
}

public class IM11_Implements extends B3 {
    public void m1(){
        System.out.println("Two");
        //super.m1();
    }
    public static void main(String[] args){
        A3 a = new IM11_Implements ();
        a.m1();
        B3 b = new IM11_Implements ();
        b.m1();

    }
}

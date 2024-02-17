package PseudoCodes;

interface A19 {
    void m1(int x, double y);
}
abstract class B19 implements A19 {
    public void m1(double x, int y){
        System.out.println("One");
    }
}


public class IM8_Implements extends B19 {
    public void m1(double x, int y){
        System.out.println("Two");
        super.m1(20.5, 20);
    }
    public void m1(int x, double y){
        System.out.println("Three");
    }
    public static void main(String[] args){
        IM8_Implements t = new IM8_Implements();
        t.m1(20.5, 10);
        t.m1(10, 5.5);
    }

}

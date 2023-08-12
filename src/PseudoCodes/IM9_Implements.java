package PseudoCodes;
interface A20 {
   void m1(A20 a);
}
abstract class B20 implements A20 {
    void m1(B20 b){
        System.out.println("One");
    }
}
public class IM9_Implements extends B20 {
    public  void m1(A20 a){
        System.out.println("Two");
    }
    void m1(B20 b){
        System.out.println("Three");
    }
    public static void main(String[] args){
        A20 a = new IM9_Implements();
        a.m1(new IM9_Implements());
    }
}

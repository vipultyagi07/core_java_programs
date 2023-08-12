package PseudoCodes;
interface A99 {
    int x = 10;
    void m1();
}
class b99 implements A99 {
    int x = 20;
    public void m1(){
        System.out.println("One");
    }
}
public class IM5_Implements {
    public static void main(String[] args){
        A99 a = new b99();
        a.m1();
        System.out.println(a.x);
    }
}




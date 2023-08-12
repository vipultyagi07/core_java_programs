package PseudoCodes;

interface Aa {
    void m1();
    interface Bb {
        void m1();
    }
}
class Cc implements Aa.Bb {
    public void m1(){
        System.out.println("Green");
    }
}

public class IM14_Implements {
    public static void main(String[] args){
        // Aa a = new Cc(); // will give the error because of type mismatch

        Aa.Bb a=new Cc();
        a.m1();
    }
}

package PseudoCodes;

class demo1 {
    public int a1 = 1;
    public int b1 = 2;

    demo1(int a1, int b1) {
        a1 = a1;
        b1 = b1;

    }
}
public class P10_Constructor {
    public static void main(String[] args) {
        demo1 d=new demo1(20,40);
                                  // this will give an error
        System.out.println(d.a1);
        System.out.println(d.b1);

    }
}
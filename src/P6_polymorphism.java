class A24 {
    void m1(Object obj){
        System.out.println("One");
    }
}
class B24 extends A24{
    void m1(Object obj){
        super.m1(null);
        System.out.println("Two");
    }
    void m2(Object obj){
        System.out.println("Three");
        this.m1(null);
    }
}

public class P6_polymorphism {

    public static void main(String[] args){
        A24 a = new B24();
        a.m1(new A24());

        B24 b = new B24();
        b.m2(new B24());
    }
}

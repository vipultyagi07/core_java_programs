class Aas {
    public void m1(String x){
        System.out.println("One");
    }
}
class Bas extends Aas {
    public void m1(String x){
        System.out.println("Two");
        super.m1(null);
    }
}


public class P5_polymorphism{


    public static void main(String[] args) {
        Aas a = new Bas();
        a.m1("we");

    }

    }


package PseudoCodes;

class A
{
    private void disp()
    {
        System.out.println("Helloe world");
    }
}

public class A1_Acess_Modifier {

    public static void main(String[] args) {
        A a=new A();
         // a.disp(); // it has a private access

    }


}

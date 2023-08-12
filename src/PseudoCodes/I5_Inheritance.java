package PseudoCodes;

public class I5_Inheritance {
    private void disp()
    {
        System.out.println("Bank");
    }

    public static void main(String[] args) {
        I5_Inheritance a=new I5_Inheritance();
        a.disp();
    }
}

class B extends I5_Inheritance{

    public void disp()
    {
        System.out.println("MY Bank");
    }
}


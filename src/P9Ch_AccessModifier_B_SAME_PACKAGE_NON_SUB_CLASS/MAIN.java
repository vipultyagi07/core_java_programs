package P9Ch_AccessModifier_B_SAME_PACKAGE_NON_SUB_CLASS;

public class MAIN // Isme humne "EXTENDS" nahi lagaya qki ye ek non sub-class hai
{
    public static void main(String[] args) {

        VARIABLE vip=new VARIABLE();

        System.out.println("A ="+vip.a);
        System.out.println("B ="+vip.b);
        System.out.println("C ="+vip.c);
   //     System.out.println("D ="+vip.d);  // this will give error in the "SAME PACKAGE- SUBCLASS"
    }



}

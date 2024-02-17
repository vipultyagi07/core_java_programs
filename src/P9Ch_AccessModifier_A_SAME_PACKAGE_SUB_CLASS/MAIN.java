package P9Ch_AccessModifier_A_SAME_PACKAGE_SUB_CLASS;

public class MAIN extends VARIABLE  // isme "MAIN" subclass hai qki vo VARIABLE subclass ko extend kar rahi hai
{
    public static void main(String[] args) {

        VARIABLE vip=new VARIABLE();

        System.out.println("A ="+vip.a);
        System.out.println("B ="+vip.b);
        System.out.println("C ="+vip.c);
   //     System.out.println("D ="+vip.d);  // this will give error in the "SAME PACKAGE- SUBCLASS"
    }



}

package P9Ch_AccessModifier_C_DIFF_PACKAGE_SUB_CLASS.Package1;

import P9Ch_AccessModifier_C_DIFF_PACKAGE_SUB_CLASS.Package2.VARIABLEtwo;

public class MAIN extends VARIABLEtwo // Isme humne "EXTENDS" lagaya qki (MAIN)ye ek sub-class hai
{
    public static void main(String[] args) {

        MAIN m= new MAIN();
        System.out.println(m.protectedB);
    }



}

package P9Ch_accessModifier2_PROTECTED;

import P9Ch_accessModifier2_PROTECTED.Package1.one;
import P9Ch_accessModifier2_PROTECTED.Package1.oneplus;
import P9Ch_accessModifier2_PROTECTED.Package2.two;

public class main {
    public static void main(String[] args) {
        one first=new one();


       // System.out.println(first.a);   // 'a' has protected access so it can only be access in only one package

        oneplus firstplus=new oneplus();
        firstplus.disponeplus();


//        two second=new two();
//        second.disp();


    }

}

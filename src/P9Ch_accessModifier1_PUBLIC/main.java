package P9Ch_accessModifier1_PUBLIC;

import P9Ch_accessModifier1_PUBLIC.Package1.one;
import P9Ch_accessModifier1_PUBLIC.Package1.oneplus;
import P9Ch_accessModifier1_PUBLIC.Package2.two;

public class main {
    public static void main(String[] args) {
        one first=new one();


       System.out.println(first.a);   // 'a' has PUBLIC access, so it can be accessed in any package

        oneplus firstplus=new oneplus();
        firstplus.disponeplus();


         two second=new two();
            second.disp();


    }

}

package P9Ch_accessModifier3_DEFAULT;

import P9Ch_accessModifier3_DEFAULT.Package1.one;
import P9Ch_accessModifier3_DEFAULT.Package1.oneplus;
import P9Ch_accessModifier3_DEFAULT.Package2.two;

public class main {
    public static void main(String[] args) {
        one first=new one();


      // System.out.println(first.a);   // 'a' has DEFAULT access, so it can be accessed in only SINGLE package

        oneplus firstplus=new oneplus();
        firstplus.disponeplus();


         two second=new two();
            second.disp();


    }

}

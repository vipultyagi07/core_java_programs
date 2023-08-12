package P9Ch_accessModifier2_PROTECTED.Package2;


import P9Ch_accessModifier2_PROTECTED.Package1.one;

public class two extends one {

    public int b=22222;
    public void disp()
    {
        System.out.println("value of 'b' from package 2 is "+b);
        one fi=new one();

       // System.out.println("value of 'a' from package 1 in package 2 is "+fi.a);

        /*'a' has protected access, so it can only be access in only one package even tough we have instantiated a object for it\

        now how can we access it?

       ANS:-NO, Not even by extending that class "ONE"

         */

        //System.out.println("value of 'a' from package 1 in package 2 is "+fi.a);





    }


}

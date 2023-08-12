package P9Ch_accessModifier1_PUBLIC.Package2;


import P9Ch_accessModifier1_PUBLIC.Package1.one;

public class two extends one {

    public int b=22222;
    public void disp()
    {
        System.out.println("value of 'b' from package 2 is "+b);
        //one fi=new one(); // in PUBLIC we do not even need the object instatiation



        System.out.println("value of 'a' from package 1 in package 2 is "+a);





    }


}

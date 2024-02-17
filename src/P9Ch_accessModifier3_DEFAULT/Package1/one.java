package P9Ch_accessModifier3_DEFAULT.Package1;

//DEFAULT ka matlab hai ki "jitni bhi file is particular package mai hai sirf
// vo hi is  default variable ko access kar sakti hai"
public class one {

    int a=1111; // we made this variable DEFAULT

    public void disp()
    {
        System.out.println("value of 'a' from package 1 is "+a);

    }


}

public class P10_Z_Static_in_B_Block {
    static int a=10;
    static int b;
//  a=15;   // we can't initialize these static variables by default approach
//  b=a*5
    static {  // we have to use the static block to initialize them
        a=15;
        b=a*5;
        System.out.println("variables are initialized");

    }

    static {
        System.out.println("i am first");
    }
    public static void main(String[] args) {
        System.out.println(a+" "+b);
    }
}

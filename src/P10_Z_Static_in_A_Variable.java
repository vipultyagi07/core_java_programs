// Important points:-

/*1.  We can create static variables at the class level only.
  2.  static block and static variables are executed in the order they are present in a program.
*/


public class P10_Z_Static_in_A_Variable {

    static int a;

    public void disp()
    {
//        static int x;    // We can create static variables at the class level only.

    }

    public static void main(String[] args) {
            a=50;
            System.out.println(a);
    }
}

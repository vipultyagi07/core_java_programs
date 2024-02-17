// 1. They can only directly access static data.
// 2. They can only directly call other static methods.
  class demo
{  static int a=5;
    int b=6;
    static void disp()
    {  System.out.println("the number is "+a);
       // System.out.println("the number is "+b); // 1. They can only directly access static data.
        print();
    }
//    public  void  print()
//    {
//        System.out.println("the number in second method "); // 2. They can only directly call other static methods.
//    }

    public static void  print()
    {
        System.out.println("the number in second method ");
    }
}
public class P10_Z_Static_in_C_Method {
    public static void main(String[] args) {
      //demo d= new demo(); // we do not even need this

        demo.disp();
    } }

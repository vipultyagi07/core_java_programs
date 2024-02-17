

public class P10_Z_Static_in_D_NestedClass {

    private static String str = "Vipul";

    // Static class
    static class MyNestedClass {

        // non-static method
        public void disp(){
            System.out.println(str);
        }
    }


    public static void main(String args[])
    {
        P10_Z_Static_in_D_NestedClass.MyNestedClass obj= new P10_Z_Static_in_D_NestedClass.MyNestedClass();
        obj.disp();
    }
}



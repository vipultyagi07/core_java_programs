class ap{
      int x=1;
    public void a()
    {
        System.out.println("in A");
    }

     ap()
    {
        System.out.println("in constructor A");
    }
}

class bp extends ap{
    int x=2;
    public void a()
    {
        System.out.println("in B");
    }

     bp()
    {
        System.out.println("in constructor b");
    }

}

public class P10_Inheritance_Dynamic_Method_Dispatch2 {

    public static void main(String[] args) {

        ap a=new bp();

        a.a();
        System.out.println(a.x);

    }

}

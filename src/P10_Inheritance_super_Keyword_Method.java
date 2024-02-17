class First11{
    int a=1;
    public void disp()
    {
        System.out.println("in class First11");
    }


}
class Second11 extends First11{
    int a=2;
    public void disp()
    {
        System.out.println("in class second11");
    }
}
public class P10_Inheritance_super_Keyword_Method {
    public static void main(String[] args) {

        Second11 s=new Second11();
        s.disp();
    }
}

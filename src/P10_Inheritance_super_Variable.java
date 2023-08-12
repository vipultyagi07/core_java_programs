class First1{
    int a=1;
}
class Second1 extends First1{
    int a=2;
  public void disp()
   {   System.out.println(super.a);
       System.out.println(a);
       // what if we want to use the variable "a" of class "First1"  as well!

   }
}
public class P10_Inheritance_super_Variable {
    public static void main(String[] args) {
        Second1 s=new Second1();
        s.disp();
    }
}

class A{
public void m1()
{
  System.out.println("Class A");
}
}
class B
{
    public void m1()
    {
      System.out.println("Class B");
    }
}
/*class C extends A,B // suppose it works altough it gives an error in java*/
//  {}
public class P11Ch_Multiple_Inheritance_Not_good {
    public static void main(String[] args)
    {
     //C c=new C();
     // c.m1();
     // now which method it will call A or B, this is called ambiguity in inheritance

    }
    
}

class papa
{
  public void sum()
  {
     System.out.printf("Sum=%d",5+5);
  }
}
class beta extends papa
{ @Override  //    if we use override then
             // 1:- we can't overload the methods present in it, (@Override is just a precaution to do)
             // 2:- it protects the methods from being change(try to put "int n" in method sum,
             // 3:- If we remove the Superclass method then the method present in the subclass
             //     then you will find this @override will creating error)
  public void sum()
 {
    System.out.printf("Sum=%d",5+6);
 }
}
public class P10_inheritance_override {

     public static void main(String[] args)
    {
        papa p=new papa();
        beta b=new beta();

        b.sum();
        
    }
}               
 



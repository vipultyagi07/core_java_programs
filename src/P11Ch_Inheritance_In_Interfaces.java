interface one
{
  default void meth1()
 {
    System.out.println("In 1"); 
 }
 public void mymethod(); // we can't implement this method in any of the interface but in class only
}
interface two extends one
{
    default void meth2()
    {
       System.out.println("In 2"); 
    }
}
interface three extends two
{
    default void meth3()
    {
       System.out.println("In 3"); 
    }

}
class four implements three
{
    public void mymethod() // here in class  only, we can define the method of INTERFACE ONE
    {
        System.out.println("I am a method of ONE");

    }
}



public class P11Ch_Inheritance_In_Interfaces {
    public static void main(String[] args)
    {
        four a=new four();
        a.mymethod();

    }
    
}

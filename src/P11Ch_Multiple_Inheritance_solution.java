
interface aa
{ 
    /*public void show()
    {                                          // it throws an error in java so we have to add "default" instead of "public".
        System.out.println("in interface A");
    }*/

    default void show() // Default is the correct way of implementing method in Interface
{
    System.out.println("in interface A");
}


}
interface b
{
    default void show()
    {
        System.out.println("in interface B");
    }
}
class c2 implements aa,b
{
   public void abc()
   {
    System.out.println("in interface ABc");  
   }
   public void show()
    {
        aa.super.show();
    }
}
class cx implements aa{

}
public class P11Ch_Multiple_Inheritance_solution {
    public static void main(String[] args)
    {
      c2 obj=new c2();
     // obj.show();
      
      
    }
    
}

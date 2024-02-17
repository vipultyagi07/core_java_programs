class Arithmetic
{
  public int add(int a, int b)
  {
    return a+b;
  }
  
}
class Adder extends  Arithmetic
{
  public void kuch()
  {

  }
  
} 
public class Input_From_String_Args1
{
  public static void main(String[] args)
{
 Adder a=new Adder();
    int z;
    int x=Integer.parseInt(args[0]);

    int y=Integer.parseInt(args[1]);
    z=a.add(x,y);
    System.out.println(z);

}
}
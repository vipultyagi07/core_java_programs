package P9Ch_accessModifier4_PRIVATE;

class employee1
{
   private int id;
  private String name;

  public int getid()
{
    return id;
}
public void setid(int n)
{
    id=n;   
}
public void print()
{
    System.out.println(id);
}




}public class P9Ch_accessmodifer {
public static void main(String[] args)
{
employee1 vipul = new employee1();

//vipul.id=56;            //This shows error because of private access modifier
//vipul.name="Vipul";    //This shows error because of private access modifier

// we can use Getters and setters to input value in "id" and "name" in private access modifier


int n=5;
vipul.setid(n);


System.out.println(vipul.getid());






    
}

}


interface BasicAnimal
{
public void eat();
public void sleep();
}
class Monkey
{
    public void jump()
    {
     System.out.println("monkey can jump");
    }
    public void bite()
    {
     System.out.println("monkey can bite");
    }
}
class Human extends Monkey implements BasicAnimal
{
 public void eat()
 {
  System.out.println("animal eats");

 }
 public void sleep()
 {
  System.out.println("Animal also sleeps");
 }
}
public class P11_Abstract_Q3 {
    public static void main(String[] args)
    {
        Human h=new Human();
        h.sleep();
        h.bite();
        
    }
    
}

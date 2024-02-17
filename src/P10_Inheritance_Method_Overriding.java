import java.util.Scanner;
class Animal0
{
    private int n;
    public void set1(int a)
    {
     n=a;
    }
    public int get(int a)
    {
     return n;
    }

    public void getdetails()
    {
        System.out.println("this is animal class overridden method ");
    }
    public void getdetails1()
    {
        System.out.printf("\ntotal no of animal are %d\n",n);
        System.out.println("animal can make sound");
        System.out.printf("animal can move themself\n");
    }
}
class Dog0 extends Animal0{
    private int p;
    public void set2(int q)
    {
        p=q;
    }

    public void getdetails()
    {
        System.out.println("this is Dog class overridden method ");
    }
    public void getdetails2()
    {
        System.out.printf("\ntotal no of animal are %d\n",p);
      System.out.println("\nDog barks and can also walk");
    }

}
class Cat0 extends Dog0{
     

     
}
public class P10_Inheritance_Method_Overriding {

    public static void main(String[] args)
    { 

     Scanner s=new Scanner(System.in);
     //here we are using class "Animal", we can see that we can't update class dog by class "Animal" 
     Animal0 a=new Animal0();
     int n=s.nextInt();
     a.set1(n);
    
     a.getdetails1();

   
    Dog0 d=new Dog0();
     
      a.getdetails();   //if you make same methods in both the derived or base class,
     //                    that very class will be invoked which is called by reference variable of that class only.(Method overriding)
     //                    so better put different name for methods
      d.getdetails();
     // we can set values using subclass(DOG) in superclass(ANIMAL) but vice-versa is not possible
     
     d.set1(98);
     d.getdetails1();
     d.set2(95);
     d.getdetails2();
     
     
     
     
     Cat c=new Cat();
     c.set1(55);
     c.getdetails1();
     
//     c.set2(1022);
//     c.getdetails2();

     
     





    }

    
}

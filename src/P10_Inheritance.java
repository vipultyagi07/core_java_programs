import java.util.Scanner;
class Animal
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
    void getdetails1()
    {
        System.out.printf("\ntotal no of animal are %d\n",n);
        System.out.println("animal can make sound");
        System.out.printf("animal can move themself\n");
    }
}
   class Dog extends Animal{
    private int p;
    public void set2(int q)
    {
        p=q;
    }
    public  void getdetails2()
    {
        System.out.printf("\ntotal no of Dogs are %d\n",p);
        System.out.println("\nDog barks and can also walk");
    }

}
class  Cat extends Dog{

    // Altough this class doesn't have its own method, but it can use the method of "Animal" and " Dog" Class
    // just by extending the "Dog" class only
}

//class Cat extends Dog,Animal{}           // we can't inherit multiple classes



public class P10_Inheritance {
    public static void main(String[] args)
    { 

     Scanner s=new Scanner(System.in);
     //here we are using class "Animal", we can see that we can't update class dog by class "Animal" 
     Animal a=new Animal();

     a.set1(111);

     a.getdetails1();
     //a.getdetails();
   
    Dog d=new Dog();
     
     //  d.getdetails();   if you make same methods in both the derived or base class,
     //                    that very class will be invoked which is called by variable of that class only.(Method overriding)
     //                    so better put different name for methods  

     // we can set values using superclass(animal) in subclass(dog) but vice-versa is not possible
        System.out.println("This is dog class method display, it also can display the method of Animal class");
         d.set1(8080);
         d.getdetails1();
         d.set2(808080);
         d.getdetails2();



System.out.println("This is cat class method display, it also can display the method of Animal class by extending Dog");
     Cat c=new Cat();
     c.set1(1000);
     c.getdetails1();

     c.set2(1000);
     c.getdetails2();

     
     





    }
    
}

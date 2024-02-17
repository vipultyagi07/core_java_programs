import java.util.Scanner;
class Animal1
{
    private int n;

    Animal1()
    {
        System.out.println("I am in animal class");
    }
    Animal1(int x)
    {
        System.out.printf("I am in animal class %d %d\n",x,x);
    }
}
class Dog1 extends Animal1{
   
     
    Dog1(int x)
    {

        System.out.printf("\nI am in DOG class %d %d\n",x,x);
    }
    Dog1(int x,int y)
    {
     super(555);
        System.out.printf("\nI am in DOG class %d %d\n",x,y);
    }

    Dog1()
    {
     
        System.out.println("I am in DOG class");
    }

}
class Cat1 extends Dog1{
    
     Cat1()
     {
        super(5); // ALSO try to put two variable, because it will invoke the super present in Dog1(int x, int y)
      System.out.println("I am in Cat class");
     }

     
}
public class P10_Inheritance_Constructor {
    public static void main(String[] args)
    { 

     Scanner s=new Scanner(System.in);
     //Animal1 a=new Animal1();
     //Dog1 d=new Dog1();
     Cat1 c=new Cat1();



     }
    
}

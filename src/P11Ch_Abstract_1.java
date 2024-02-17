import java.util.Scanner;
abstract class mobile {
    //public void On();  // Missing method body, or declare abstract, it is not possible in java
     abstract public void On();
     abstract public void greet();
     public void hello()
     {
         System.out.println("aaooo thaakur....");  // * There might be some non-abstract methods in the abstract class
     }
}
  class fun extends mobile /* we can also use this */ //abstract class fun extends mobile
         {
             @Override
             public void On() {

                 System.out.println("turning ON");

             }
    public void greet()
    {
        System.out.println("greeting of the day");
    }
    public void hello1()
    {
        System.out.println("aaooo thaakur....Dobaara");
    }

}

public class P11Ch_Abstract_1 {
     public static void main(String[] args) 
    {

     //mobile m=new mobile();       // we can't instantiate the abstract class object, because it is only thought or
                                    // idea, it doesn't has any concrete existance. It is just a "KHAYALI PULAAV"
        fun m=new fun();
        m.hello();
        m.hello1();

      
    }
}

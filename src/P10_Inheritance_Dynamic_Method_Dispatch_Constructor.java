class Phone1
{
    Phone1()
    {
        System.out.println("PHONE CONSTRUCTOR");
    }
}

class SmartPhone1 extends Phone1
{
    SmartPhone1()
    {
        System.out.println("SMARTPHONE CONSTRUCTOR");
    }

}

public class P10_Inheritance_Dynamic_Method_Dispatch_Constructor {

    public static void main(String[] args)
    {
        Phone1 obj=  new SmartPhone1();    // Object creation by  DYNAMIC METHOD DISPATCH

        //SmartPhone obj1=  new Phone();   //    we can't point the object of subclass(smartphone) to superclass(phone)
        //    by  DYNAMIC METHOD DISPATCH




    }

}



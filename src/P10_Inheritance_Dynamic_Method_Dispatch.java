class Phone
{   int x=1;
    public void  welcome()
    {
        System.out.println("aapka swagat hai");
    }
    public void  on()
    {
        System.out.println("Turning ON Phone");
    }
}

class SmartPhone extends Phone
{   int x=2;
    public void  Music()
    {
        System.out.println("playing music....");
    }
    public void  on()
    {
        System.out.println("Turning ON SmartPhone");
    }

}
public class P10_Inheritance_Dynamic_Method_Dispatch {
    public static void main(String[] args)
    {
       Phone obj=  new SmartPhone();    // Oject creation by  DYNAMIC METHOD DISPATCH
     
     //SmartPhone obj1=  new Phone();   //    we can't point the object of subclass(smartphone) to superclass(phone)
                                        //    by  DYNAMIC METHOD DISPATCH


     //obj.Music();             // we can't call the methods of superclass, which are not common(overriden)
     
     //in short, we can say that we can only call common function(method)and methods defined in superclass only,
     // through DYNAMIC METHOD DISPATCH
     obj.on();
     obj.welcome();
     System.out.println(obj.x);    // this will print the variable of class phone(superclass) because "obj" is
                                   // a type of class "phone" and it is a object of class "smartphone" and "x"
                                   // is a  variable which can not be like  overriden method, so the first class
                                   // variable will be printed

    }
    
}

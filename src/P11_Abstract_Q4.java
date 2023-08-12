abstract class telephone
{
 abstract void ring();
 abstract void lift();  
 abstract void disconnect();
}
class smarttelephone extends telephone
{
public void ring()
{
    System.out.println("Ringing...");
}  

public void lift()
{
    System.out.println("hurry up, please lift the fucking phone");
}    

public void disconnect()
{
    System.out.println("enough with your bullshit.... fuck off");
}

public void recordvideo()
{
    System.out.println("recording adult videos,  hahaha....");
}
}

public class P11_Abstract_Q4 {
    public static void main(String[] args)
    {
    smarttelephone s=new smarttelephone();
    telephone t=new smarttelephone();// this demonstrate polymorphism


    s.ring();
    s.lift();
    s.disconnect();


    t.ring();
    t.lift();
    t.disconnect();
    //t.recordvideo(); // it gives an error because of dynamic method dispatch or polymorphism

    
    }
    
}

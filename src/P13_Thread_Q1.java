
class gm extends Thread{  // I make this program more interesting, in fisrt class I use extends thread
    @Override
    public void run()
    {
        while(true)
        {
            System.out.println("Good Morning.......");
        }
    }
}
class wel implements Runnable // while in 2nd class I use Runnable Thread
{
    @Override
    public void run()
    {
       
        while(true)
        {
            System.out.println("Welcome to java");
        } 
    }
}
public class P13_Thread_Q1 {
    public static void main(String[] args)
    {
      gm a=new gm();
      a.start();

      wel b=new wel();
      Thread g=new Thread(b);
      g.start();

    }
    
}

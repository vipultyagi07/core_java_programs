class gm1 extends Thread{  // I make this program more interesting, in fisrt class I use extends thread
    @Override
    public void run()
    {
        while(true)
        {  

            System.out.println("Good Morning.......");
        }
    }
}
class wel1 implements Runnable // while in 2nd class I use Runnable Thread
{
    @Override
    public void run()
    {
       
        while(true)
        {  try
            {Thread.sleep(2);}
            catch(Exception e)
            {
                System.out.println(e);
            }
            System.out.println("Welcome to java");
        } 
    }
}
public class P13_Thread_Q2 {
    public static void main(String[] args)
    {
      gm1 a=new gm1();
      a.start();

      wel1 b=new wel1();
      Thread g=new Thread(b);
      g.start();

    }
    
}

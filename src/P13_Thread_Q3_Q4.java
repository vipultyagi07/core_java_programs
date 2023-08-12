class gm12 extends Thread{  // I make this program more interesting, in fisrt class I use extends thread
    @Override
    public void run()
    { int i=0;
        while(i<5)
        {  

            System.out.println("Good Morning.......");
            i++;
        }
    }
}
class wel12 implements Runnable // while in 2nd class I use Runnable Thread
{
    @Override
    public void run()
    {int i=0;
        while(i<5)
        {  

            System.out.println("Welcome to java.......");
            i++;
        }
    }
}
public class P13_Thread_Q3_Q4 {
    public static void main(String[] args)
    {
      gm12 a=new gm12();
      //a.setPriority(8);
      System.out.println(a.getPriority());
      System.out.println(a.getState());
      
      //a.start();


      wel12 b=new wel12();
      Thread g=new Thread(b);
      
      //g.setPriority(10);
      System.out.println(g.getPriority());
      System.out.println(g.getState()); //it either returns "NEW" or either "RUNNABLE"
      System.out.println(g.currentThread());
     
      g.start();
      
    


    }

    
    
}

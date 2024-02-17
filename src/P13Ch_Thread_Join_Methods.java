class a123 extends Thread{
    @Override
    public void run()
    {
        int i=0;
        while(i<100)
        {
            System.out.println("1111111111111111111111111");
            i++;
        }
    }

}
class b123 extends Thread{
    @Override
    public void run()
    {
        int i=0;
        while(i<100)
        {
            System.out.println("222222");
            i++;
        }
    }

}
public class P13Ch_Thread_Join_Methods {
    
    public static void main(String[] args)
    {
        a123 a=new a123();
        b123 b=new b123(); 

        a.start();// so a & b will start accordingly but if we want to execute "a" first then b, then we will use "join()" method.
        try
        {
            a.join(); // we can't simply use join() in
        }
        catch(Exception f)
        {
            System.out.println(f);
        }
        b.start();
        
    }
}

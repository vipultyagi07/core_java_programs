//class a1234 extends Thread{
//    @Override
//    public void run()
//    {
//        int i=0;
//        {
//        while(true)
//        {
//            try {
//                Thread.sleep(2000);
//            } catch (Exception e) {
//
//                System.out.println(e);
//            }
//            System.out.println("1111111111111111111111111");
//
//        }
//    }
//
//}
//class b1234 extends Thread{
//    @Override
//    public void run()
//    {
//        int i=0;
//        while(true)
//        {
//            System.out.println("222222");
//            i++;
//        }
//    }
//
//}
//public class P13_Thread_Sleep_Method {
//    public static void main(String[] args)
//    {
//        a1234 a=new a1234();
//        b1234 b=new b1234();
//
//        a.start();// so a & b will start accordingly but if we want to execute "a" first then b, then we will use "join()" method.
//        try
//        {
//            a.join(); // we can't simply use join() in
//        }
//        catch(Exception f)
//        {
//            System.out.println(f);
//        }
//        b.start();
//
//    }
//
//}

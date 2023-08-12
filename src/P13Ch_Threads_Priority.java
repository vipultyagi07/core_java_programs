import java.util.jar.Attributes.Name;

import java.util.*;
class vip11 extends Thread{

public  vip11(String s)
{
   super(s);
}

}
public class P13Ch_Threads_Priority {
    public static void main(String[] args)
    { Scanner s=new Scanner(System.in);
       // String str=s.nextLine();
// STEP 1
      vip11 a1=new vip11("1111111111");
      vip11 a2=new vip11("2222222222");
      vip11 a3=new vip11("3333333333");
      vip11 a4=new vip11("4444444444");
      vip11 a5=new vip11("5555555555");
      vip11 a6=new vip11("6666666666");
      vip11 a7=new vip11("7777777777");
      vip11 a8=new vip11("8888888888");
      vip11 a9=new vip11("9999999999");
      vip11 a10=new vip11("AAAAAAAAA");
      vip11 a11=new vip11("BBBBBBBBB");
// STEP 3

      a10.setPriority(Thread.MAX_PRIORITY);
      a9.setPriority(9);
      a8.setPriority(8);
      a7.setPriority(7);
      a6.setPriority(6);
      a5.setPriority(5);
      a4.setPriority(4);
      a3.setPriority(3);
      a2.setPriority(2);
      a1.setPriority(1);
      


// STEP 2
    a1.start();
    System.out.println(a1.getName());
    a2.start();
    System.out.println(a2.getName());
    a3.start();
    System.out.println(a3.getName());
    a4.start();
    System.out.println(a4.getName());
    a5.start();
    System.out.println(a5.getName());
    a6.start();
    System.out.println(a6.getName());
    a7.start();
    System.out.println(a7.getName());
    a8.start();
    System.out.println(a8.getName());
    a9.start();
    System.out.println(a9.getName());
    a10.start();
    System.out.println(a10.getName());

    
 }
    
}
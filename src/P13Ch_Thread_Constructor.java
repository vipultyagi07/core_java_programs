import java.util.*;

class vipul1 extends Thread{
    
   public vipul1(String s)
   {
    super(s);// this super will call the method which is present in the "Thread" class which is not visible to use 
   }
    
}
public class P13Ch_Thread_Constructor { // Threads mai constructor limited hai ((String), (),(String,Runnable),(runnable) ) only
    
    public static void main(String[] args)
    { Scanner s=new Scanner(System.in);
        String str=s.nextLine();

        vipul1 v=new vipul1(str);
        System.out.println(v.getId()); // it will generate a random id wich is present in "Thread" 
        System.out.println(v.getName());



    }
}

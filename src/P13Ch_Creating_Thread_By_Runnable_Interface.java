class MyThread12 implements Runnable{
    @Override
    public void run(){
        int i =0;
        while(i<40000){
            System.out.println("Thread 12 is running");
            i++;
        }
    }
}
class MyThread22 implements Runnable{
    @Override
    public void run(){
        int i =0;
        while(i<40000){
            System.out.println("Thread22 is running");
            i++;
        }
    }
}
public class P13Ch_Creating_Thread_By_Runnable_Interface {
    public static void main(String[] args) {
        MyThread12 bullet1 = new MyThread12();
        Thread gun1=new Thread(bullet1);
        MyThread22 bullet2 = new MyThread22();
        Thread gun2=new Thread(bullet2); // ex:- here we create a gun and loaded with the bullet


        //t1.start();// here we can see actual t1.start() is not working because  t1 is just like bullet which needs a gun to fire,
                   // so we make changes above and create an object of thread to create a runnable object for t1
       // t2.start();

       gun1.start();
       gun2.start();// now we

      // actual use of threading , it work in conncurrency
                      //(Concurrency is about "dealing" with lots of things at once. Parallelism is about "doing" lots of things at once)
    
}
    
}

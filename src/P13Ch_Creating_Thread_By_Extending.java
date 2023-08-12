class Thread1 extends Thread{
    @Override
    public void run(){
        int i =0;
        while(i<40000){
            System.out.println("Thread 1 is Running");
            i++;
        }
    }
}
class Thread2 extends Thread{
    @Override
    public void run(){
        int i =0;
        while(i<40000){
            System.out.println("Thread 2  is running");
            i++;
        }
    }
}

public class P13Ch_Creating_Thread_By_Extending {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();
        t2.start();
    // when we run this program it will execute first thread but in the mean time it also execute the second thread, so this is the
    // actual use of threading , it work in conncurrency
                          //(Concurrency is about "dealing" with lots of things at once. Parallelism is about "doing" lots of things at once)
    
}
}
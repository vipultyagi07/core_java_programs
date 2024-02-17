class TestClass extends Thread{
    public void run(){
        if(Thread.currentThread().isDaemon()){
            System.out.println("it is a daemon thread");
        }
        else{
            System.out.println(" it is a normal thread ");
        }
    }
}

public class P13Ch_Z_Z_DaemonThread {

    public static void main(String[] args) {
        TestClass t1= new TestClass();
        TestClass t2= new TestClass();
        TestClass t3= new TestClass();

        t1.setDaemon(true);
        t1.start();
        t2.start();
        t3.start();
    }
}

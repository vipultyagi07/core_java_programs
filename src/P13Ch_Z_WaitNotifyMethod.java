
    class ThreadA extends Thread{
        int t=0;
        public void run(){

            synchronized (this){
                for (int i = 0; i < 10; i++) {
                    t = i + t;
                }
                this.notify();
            }

        }
    }

    public class P13Ch_Z_WaitNotifyMethod {

        public static void main(String[] args) throws InterruptedException {
            ThreadA a= new ThreadA();
            a.start();
            synchronized (a){
                System.out.println("Main Thread");
                a.wait();
                System.out.println("Main thread get notified");
                System.out.println("output is " + a.t);
            }
        }
    }

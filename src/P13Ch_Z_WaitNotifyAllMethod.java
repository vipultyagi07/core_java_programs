
    class ThreadAA extends Thread {
        private int threadId;
        private P13Ch_Z_WaitNotifyAllMethod example;

        public ThreadAA(int threadId, P13Ch_Z_WaitNotifyAllMethod example) {
            this.threadId = threadId;
            this.example = example;
        }

        public void run() {
            synchronized (example) {
                try {
                    System.out.println("Thread " + threadId + " is waiting.");
                    example.wait(); // Thread waits until notified
                    System.out.println("Thread " + threadId + " is awake.");
                } catch (InterruptedException e) {
                    // Handle the exception
                }
            }
        }
    }

    public class P13Ch_Z_WaitNotifyAllMethod {
        public static void main(String[] args) throws InterruptedException {
            P13Ch_Z_WaitNotifyAllMethod example = new P13Ch_Z_WaitNotifyAllMethod();

            // Create multiple ThreadA instances
            ThreadAA thread1 = new ThreadAA(1, example);
            ThreadAA thread2 = new ThreadAA(2, example);
            ThreadAA thread3 = new ThreadAA(3, example);

            // Start the threads
            thread1.start();
            thread2.start();
            thread3.start();

            Thread.sleep(2000); // Wait for some time before notifying threads

            synchronized (example) {
                System.out.println("Main Thread notifies all threads.");
                example.notifyAll(); // Notify all waiting threads
            }
        }
    }
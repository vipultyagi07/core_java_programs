    import java.util.concurrent.Callable;
    import java.util.concurrent.ExecutorService;
    import java.util.concurrent.Executors;
    import java.util.concurrent.Future;
    public class P13Ch_Creating_Thread_By_Z_Callable_Interface implements Callable<String> {
        @Override
        public String call() throws Exception {
            // Perform some computation or task
            Thread.sleep(2000);
            return "Callable task completed";
        }
        public static void main(String[] args) throws Exception {
            // Create an ExecutorService
            ExecutorService executorService = Executors.newSingleThreadExecutor();

            // Submit the Callable task for execution
            Future<String> future = executorService.submit(new P13Ch_Creating_Thread_By_Z_Callable_Interface());

            // Perform other operations while the Callable task is running

            // Get the result of the Callable task
            String result = future.get();
            System.out.println(result);

            // Shutdown the ExecutorService
            executorService.shutdown();
        }
    }


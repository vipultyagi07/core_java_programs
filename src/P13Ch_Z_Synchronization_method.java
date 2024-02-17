class PrintTabless{

    public synchronized void printTable(int x){

    for (int i = 1; i <= 10; i++) {
        System.out.println(i * x);
        try {
            Thread.sleep(400);
        } catch (Exception e) {
            System.out.println(e);
        }

       }
    }
}
class Thread111 extends Thread{
    PrintTable printTable;
    Thread111(PrintTable printTable){
        this.printTable=printTable;
    }
    @Override
    public void run(){
        printTable.printTable(2);
    }
}
class Thread2222 extends Thread{
    PrintTable printTable;

    Thread2222(PrintTable printTable){
        this.printTable=printTable;
    }

    @Override
    public void run(){
        printTable.printTable(5);
    }

}



public class P13Ch_Z_Synchronization_method {

    public static void main(String[] args) {

        PrintTable printTable=new PrintTable();
        Thread111 myThread1= new Thread111(printTable);
        Thread2222 myThread2= new Thread2222(printTable);

        myThread1.start();
        myThread2.start();
    }

}

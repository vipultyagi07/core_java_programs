class PrintTables{

    public void printTable(int x){

        synchronized (this){
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
}
class Thread11 extends Thread{
    PrintTable printTable;
    Thread11(PrintTable printTable){
        this.printTable=printTable;
    }
    @Override
    public void run(){
        printTable.printTable(2);
    }
}
class Thread222 extends Thread{
    PrintTable printTable;

    Thread222(PrintTable printTable){
        this.printTable=printTable;
    }

    @Override
    public void run(){
        printTable.printTable(5);
    }

}



public class P13Ch_Z_Synchronization_block {

    public static void main(String[] args) {

        PrintTable printTable=new PrintTable();
        Thread11 myThread1= new Thread11(printTable);
        Thread222 myThread2= new Thread222(printTable);

        myThread1.start();
        myThread2.start();
    }

}

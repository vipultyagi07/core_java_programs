class PrintTable{

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
class MyThreadA extends Thread{
    PrintTable printTable;
    MyThreadA(PrintTable printTable){
        this.printTable=printTable;
    }
    @Override
    public void run(){
        printTable.printTable(2);
    }
}
class MyThreadB extends Thread{
    PrintTable printTable;

    MyThreadB(PrintTable printTable){
        this.printTable=printTable;
    }

    @Override
    public void run(){
        printTable.printTable(5);
    }

}



public class P13Ch_WithoutSynchronization {

    public static void main(String[] args) {

        PrintTable printTable=new PrintTable();
        MyThreadA myThreadA= new MyThreadA(printTable);
        MyThreadB myThreadB= new MyThreadB(printTable);

        myThreadA.start();
        myThreadB.start();
    }

}

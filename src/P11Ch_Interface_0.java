interface bankoperation{
    public void run();
    public void stop();

}

abstract class branch  implements bankoperation{
    public void run()
    {
        System.out.println("bank is running");
    }

    public void stop()
    {
        System.out.println("Bank is stopped");
    }
}
public class P11Ch_Interface_0 extends branch{
    public static void main(String[] args) {
        bankoperation b= new P11Ch_Interface_0();
        b.run();


    }
}

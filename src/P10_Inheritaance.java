 class Vehicle{

    public void run(){
        System.out.println("vehicle can run");
    }
     public void stop(){
         System.out.println("vehicle can stop");
     }
}

class Bike extends Vehicle // Bike IS-A Vehicle
{
    @Override
    public void stop(){
        System.out.println("bike can stop");
    }
}

public class P10_Inheritaance {

    public static void main(String[] args) {
        Bike b= new Bike();
        b.run();   // vehicle can run
        b.stop();  // vehicle can stop
    }

}

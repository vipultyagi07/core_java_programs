class SimplePhone{

    public void calling()
    {
        System.out.println("dialing.....");
    }
    public void recieving()
    {
        System.out.println("recieving the call.....");
    }
}

interface gps{
    public void map();
}
interface Camer{
    public void capture();
}
interface mediaPlayer11{
    public void music();
}

class Smartphone11 extends SimplePhone implements gps,Camer,mediaPlayer11{


    @Override
    public void map() {
        System.out.println("Opening google map");
    }

    @Override
    public void capture() {
        System.out.println("Clickkkk......");
    }

    @Override
    public void music() {

        System.out.println("Bas bajna chaiye gaana");

    }
}


public class P11Ch_PolyMorphism {

    public static void main(String[] args) {

        // suppose hame sirf smartphone ka gps or (basic function) use karne hai to hum Smartphone ko q call karenge
        gps g= new Smartphone11();
        g.map();

        // suppose hame sirf smartphone ka camera or (basic function) use karne hai to hum Smartphone ko q call karenge
        Camer c= new Smartphone11();
         c.capture();

        // suppose hame sari functionality use karni hai  smartphone ki  Smartphone ka object create karenge

        Smartphone11 s= new Smartphone11();
        s.capture();
        s.map();
        s.music();
        s.calling();
        s.recieving();
    }
}

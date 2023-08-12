class Refer{
    public String name;
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
       return this.name;
    }
    public Refer(String name){
        this.name=name;
    }
}

public class P8_Oops_References {

    public static void main(String[] args) {
        Refer r= new Refer("vipul");
        System.out.println(r.getName());
        change(r);
        System.out.println(r.getName());

    }
    public static void change(Refer refer){

        refer.setName("Tyagi");
    }
}

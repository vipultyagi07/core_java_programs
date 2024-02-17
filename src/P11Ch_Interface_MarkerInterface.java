import java.io.Serializable;

interface Permission {


}

class Myprogram implements Permission {

    public void print(){
        System.out.println("Hello, I have permission");
    }
}


public class P11Ch_Interface_MarkerInterface {

    public static void main(String[] args) {
        Myprogram m= new Myprogram();
        if(m instanceof Permission){
            m.print();
        }
        else{
            System.out.println("hello, I dont have  permission");
        }
    }
}

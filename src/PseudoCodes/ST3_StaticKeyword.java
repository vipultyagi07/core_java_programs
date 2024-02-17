package PseudoCodes;
class printer{
    static {
        System.out.println("static block in printer class");
          }

    public static void display(String message){
        System.out.println(message);
    }
}
public class ST3_StaticKeyword {
    public static int var=1;

    static {
        System.out.println("Static block in Tester class");
           }

    public static void main(String[] args) {
        var++;
        printer p=null;
        System.out.println("In main");
        p.display("The value of sample variable is: " +var);
    }
}

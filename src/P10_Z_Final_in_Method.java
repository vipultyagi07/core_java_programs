class details
{ void mNumber()
    {
        System.out.println("9758492721");
    }
    final void atmpin()
    {
        System.out.println("8944");
    }
}
class theif extends details {
    @Override
    void mNumber() {
        System.out.println("9758492721");
    }
//      @Override
//    public void atmpin()   //it will show the error due to final keyword in declaring the method atmpin()
//                            // in theif cannot override atmpin() in details overridden method is fina
//    {
//        System.out.println("8944");
//    }
//    }
}
public class P10_Z_Final_in_Method {

    public static void main(String[] args) {
        theif b=new theif();
       b.atmpin();
    }
}

import java.sql.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class P15AdvJava_A_Iterable {

    public static void main(String[] args) {
        ArrayList a= new ArrayList();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);

       Iterator iterator = a.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

}




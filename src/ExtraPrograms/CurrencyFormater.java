import java.util.*;
import java.text.*;

import java.util.regex.*;

public class CurrencyFormater {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount");
    double payment = scanner.nextDouble();
    scanner.close();
    String us=NumberFormat.getCurrencyInstance(Locale.US).format(payment);
    System.out.println("US: "+ us);

    String India=NumberFormat.getCurrencyInstance(new Locale("en","in")).format(payment);
    System.out.println("India: "+ India);

    String china=NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
    System.out.println("China: "+ china);

    String france=NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
    System.out.println("France: "+ france);
        
         
    }
}
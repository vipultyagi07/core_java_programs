package PseudoCodes;

public class P6_dataTypeConversion {
    public static void main(String[] args) {
        int a=1000;
        float b=20.00f;
        double c=0.0;

        c=(double)(b+a*(7.0/100));
        System.out.println(c);
    }
}

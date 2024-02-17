package PseudoCodes;

import java.util.HashMap;

public class HM1_HashMap {

    public static void main(String[] args) {
        HashMap<String,Integer> m=new HashMap<>();

        m.put("101",82);
        m.put("102",89);
        m.put("103",84);
        m.put("104",85);
        m.replace("101",82,81);
        System.out.println(m);
    }

}

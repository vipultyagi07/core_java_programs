import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class P15AdvJava_A_Iterable_onMap {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        
//Iterating map over entries:
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " => " + value);
        }


//Iterating map over keys:
        for (String key : map.keySet()) {
            Integer value = map.get(key);
            System.out.println(key + " => " + value);
        }

//Iterating map over values:
        for (Integer value : map.values()) {
            System.out.println(value);
        }





    }
}

package ex_30_Collections_Framework.CF_04_MAP;

import java.util.HashMap;
import java.util.Map;

public class Lab217_Map_Iterate {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap();
        map.put("id", 1); // Keys, Values
        map.put("id", 2);
        map.put("id2", 100);
        map.put("id4", null);
        map.put("id5", null);
        map.put(null, 102);
        System.out.println(map); // {null=102, id2=100, id4=null, id=2, id5=null}
        System.out.println(map.size()); // 5 no duplicate included

        for (Map.Entry<String, Integer> item : map.entrySet()) {
            System.out.println(item.getKey() + " -> " + item.getValue());
/*            o/p
            null -> 102
            id2 -> 100
            id4 -> null
            id -> 2
            id5 -> null*/

        }
    }
}

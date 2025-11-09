package ex_30_Collections_Framework.CF_04_MAP;

import java.util.HashMap;
import java.util.Map;

public class Lab216_Map {
    public static void main(String[] args) {
       // Map map = new HashMap();
        HashMap map = new HashMap();
        map.put("id", 1); // Keys, Values
        map.put("id", 2);
        map.put("id2", 100);
        map.put("id4", null);
        map.put(null, 102);
        System.out.println(map); // {null=102, id2=100, id4=null, id=2}
        //HashMap stores key-value pairs.
        System.out.println(map.size()); // 4
        System.out.println(map.isEmpty()); // false
        System.out.println(map.containsKey("id2")); // true
        System.out.println(map.containsValue(99)); // false
        System.out.println(map.keySet()); // [null, id2, id4, id]
        System.out.println(map.values()); // [102, 100, null, 2]
        System.out.println(map.get("id2")); // 100

/*        Keys are unique. Values can be duplicated or null.
                One null key is allowed; multiple null values are allowed.
                Does not preserve insertion order.
        put() replaces the old value if the key exists.*/
    }
}

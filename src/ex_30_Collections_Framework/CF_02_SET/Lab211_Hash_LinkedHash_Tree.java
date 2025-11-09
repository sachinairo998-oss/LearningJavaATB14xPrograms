package ex_30_Collections_Framework.CF_02_SET;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab211_Hash_LinkedHash_Tree {
    public static void main(String[] args) {
        Set<String> hs = new HashSet();
        // Hashing mechanism to store element no order and no duplicates
        hs.add("Apple");
        hs.add("Orange");
        hs.add("WaterMelon");
        hs.add("WaterMelon");
      //  hs.add(123); data type assigned is String
        hs.add(null);
        System.out.println(hs); // [null, Apple, WaterMelon, Orange]

        System.out.println("--------------------------");

        Set<String> lhs = new LinkedHashSet();
        // LinkedList mechanism to store element, order will be maintained and no duplicates
        lhs.add("Apple");
        lhs.add("Orange");
        lhs.add("WaterMelon");
        lhs.add("WaterMelon");
        lhs.add(null);
        System.out.println(lhs); // [Apple, Orange, WaterMelon, null]
        System.out.println(lhs.isEmpty()); // false
        System.out.println(lhs.contains("Apple")); // true
        System.out.println(lhs.size()); // 4

        System.out.println("--------------------------");

        Set ts = new TreeSet();
        // Black and Tree mechanism to store the element
        // order will be maintained and Natural sorting is done
        ts.add("Apple");
        ts.add("Orange");
        ts.add("WaterMelon");
        ts.add("WaterMelon");
      //  ts.add(null); NullException
       // ts.add(123); ClassCatException
        System.out.println(ts); // [Apple, Orange, WaterMelon]







    }
}

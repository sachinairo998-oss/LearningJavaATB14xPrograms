package ex_30_Collections_Framework.CF_02_SET;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab210_Set {
    public static void main(String[] args) {
        Set hs = new HashSet();
        hs.add("Sachin");
        hs.add("Sachin");
        hs.add("MSachin");
        System.out.println(hs); // [MSachin, Sachin] No Duplicate allowed & No Insertion order maintainence

        Set lhs = new LinkedHashSet();
        lhs.add("Sachin");
        lhs.add("Sachin");
        lhs.add("MSachin");
        System.out.println(lhs); // [Sachin, MSachin] No Duplicate allowed & But Insertion order maintainence


        Set ts = new TreeSet();
        ts.add("Sachin");
        ts.add("Sachin");
        ts.add("MSachin");
        System.out.println(ts);
/*        [MSachin, Sachin] No Duplicate allowed & Natural Sorted Order
        Lexicographical order: "MSachin" comes before "Sachin" (because 'M' < 'S' in ASCII/Unicode).*/
    }
}

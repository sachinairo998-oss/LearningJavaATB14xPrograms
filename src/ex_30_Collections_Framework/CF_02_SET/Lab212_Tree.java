package ex_30_Collections_Framework.CF_02_SET;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Lab212_Tree {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet();
        set.add(9);
        set.add(3);
        set.add(1);
        System.out.println("Set Elements: " + set); // Set Elements: [1, 3, 9]

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
/*            o/p
            1
            3
            9*/
        }
    }
}

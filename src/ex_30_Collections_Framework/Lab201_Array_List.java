package ex_30_Collections_Framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab201_Array_List {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add("1");
        list.add("1");
        list.add("2");
        list.add("3");
        list.add(4);
        list.add(true);

        System.out.println(list); // o/p - [1, 1, 2, 3, 4, true]
        System.out.println(list.size()); // o/p - 6
        System.out.println(list.isEmpty()); // false
        System.out.println(list.contains(1)); // false
        System.out.println(list.contains("4")); // false
        System.out.println(list.indexOf("2")); // o/p - 2
        System.out.println(list.lastIndexOf("3")); // o/p - 3

        System.out.println("------");
        for (int i = 0; i < list.size() ; i++) {
            System.out.println(list.get(i));

            System.out.println("-------");
            for (Object o: list) {
                System.out.println(o);
                
            }

            System.out.println("------");
            Iterator iterator = list.iterator();
            while (iterator.hasNext()){
                System.out.println(iterator.next());
            }

/*            o/p
            1
            1
            2
            3
            4
            true*/


        }
    }
}

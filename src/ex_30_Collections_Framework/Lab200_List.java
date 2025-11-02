package ex_30_Collections_Framework;

import java.util.ArrayList;
import java.util.List;

public class Lab200_List {
    public static void main(String[] args) {
        List fruits = List.of("Orange","Apple");
        System.out.println(fruits); // o/p - [Orange, Apple]

        List arrayList = new ArrayList<>();
        arrayList.add("Sachin");
        arrayList.add(123);
        arrayList.add(true);
        arrayList.add(3.14);

        System.out.println(arrayList); // o/p - [Sachin, 123, true, 3.14]
        System.out.println(arrayList.size()); // o/p - 4
    }
}

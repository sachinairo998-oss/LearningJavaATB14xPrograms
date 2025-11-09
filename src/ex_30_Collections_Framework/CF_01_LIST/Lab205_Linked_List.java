package ex_30_Collections_Framework.CF_01_LIST;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lab205_Linked_List {
    public static void main(String[] args) {
        List mylist_a = new ArrayList();
        List mylist_b = new ArrayList(10);
        List mylist_c = List.of("12","33");

        List mylist = new LinkedList();
        mylist.add(1);
        mylist.add(2);
        mylist.add(3);
        mylist.add(4);
        mylist.add(4);
        System.out.println(mylist); // [1, 2, 3, 4, 4] duplicate allowed
    }
}

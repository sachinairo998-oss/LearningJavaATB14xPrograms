package ex_30_Collections_Framework.CF_01_LIST;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab206_ArrayList_Iteration {
    public static void main(String[] args) {
        List<String> mylist = new ArrayList();
        mylist.add("Sachin");
        mylist.add("SachinM");
        mylist.add("SachinMS");
        System.out.println(" - To Print ArrayList - ");

        for (String str : mylist) {
            System.out.println(str);
        }
        System.out.println(" - To Print ArrayList2 - ");
        // Iterator
        Iterator<String> iterator = mylist.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println(" - To Print ArrayList3 - ");
        for (int i = 0; i < mylist.size(); i++) {
            System.out.println(mylist.get(i));
/*            o/p
            Sachin
            SachinM
            SachinMS*/
        }

    }
}
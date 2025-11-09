package ex_30_Collections_Framework.CF_01_LIST;

import java.util.ArrayList;
import java.util.Collections;

public class Lab209_Interview {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        System.out.println(al); // [1, 2, 3, 4]
        Collections.sort(al,Collections.reverseOrder());

        for(Integer o : al){
            System.out.println(6*o);
/*            o/p
            24
            18
            12
            6*/
        }
    }
}

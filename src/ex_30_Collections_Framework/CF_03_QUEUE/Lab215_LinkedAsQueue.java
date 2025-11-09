package ex_30_Collections_Framework.CF_03_QUEUE;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Lab215_LinkedAsQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList();
        queue.add(6);
        queue.add(1);
        queue.add(8);

        Iterator<Integer> iterator = queue.iterator();
        while (iterator.hasNext()){
            Integer value = iterator.next();
            System.out.println(value);
/*            o/p
            6
            1
            8*/
        }

    }
}

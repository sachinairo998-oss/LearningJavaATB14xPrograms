package ex_30_Collections_Framework.CF_03_QUEUE;

import java.util.PriorityQueue;

public class Lab213_Queue {
    public static void main(String[] args) {
        // Queue - 0.0001% in automation
        // FIFO - First In First Out
        PriorityQueue q = new PriorityQueue();
        q.add("Sachin");
        q.add("M");
        System.out.println(q); // natural sorting o/p = [M, Sachin]
        System.out.println(q.peek()); // M
        System.out.println(q.poll()); // M
    }
}

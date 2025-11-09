package ex_30_Collections_Framework.CF_03_QUEUE;

import java.util.ArrayDeque;
import java.util.Deque;

public class Lab214_Array_Queue {
    public static void main(String[] args) {
        Deque<Integer> deck = new ArrayDeque();
        deck.push(5);
        deck.push(1);
        System.out.println(deck); // o/p - [1, 5]
    }
}

// Deque stands for Double-Ended Queue, which can act like both a stack and a queue.
// push() in a Deque adds elements to the front (like a stack's push).
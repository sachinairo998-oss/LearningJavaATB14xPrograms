package ex_30_Collections_Framework.CF_01_LIST;

import java.util.Stack;

public class Lab208_Stack {
    public static void main(String[] args) {
        // Stack = Last In First Out

        Stack s = new Stack();
        s.add("Sachin");
        s.add("MSachin");
        s.add("BSachin");
        System.out.println(s); // o/p - [Sachin, SachinM, SachinMS]
        System.out.println(s.size()); // 3
        System.out.println(s.peek()); // Looks at the top element of the stack without removing it 'BSachin'
        System.out.println(s.pop()); // Removes and returns the top element of the stack 'BSachin'
        System.out.println(s.add("MSS")); // true [Sachin, MSachin, MSS]
        s.add("Sac");
        s.add("Bunty");
        s.push("Vijay");
        System.out.println(s); // [Sachin, MSachin, MSS, Sac, Bunty, Vijay]
        System.out.println(s.get(0)); // Sachin
        System.out.println(s.get(1)); // MSachin
    }
}

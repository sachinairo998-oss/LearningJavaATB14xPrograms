package ex_09_ForLoop;

public class Lab68_Loop_Break {
    public static void main(String[] args) {
        for (int i = 0; i < 50 ; i++) {
            System.out.println(i); // o/p = 0 1 2 3 4 5
            if (i == 5) {
                break; // exits the loop once 5=5 as per if condition
            }
            System.out.println(i); // o/p = 0 1 2 3 4 5
        }
    }

}

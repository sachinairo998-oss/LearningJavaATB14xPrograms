package ex_09_ForLoop;

public class Lab69_Loop_Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) { // 5 will be skipped
                continue; // will go back to condition
            }
            System.out.println(i); // o/p = 0 to 4, 6 to 9
        }
    }
}

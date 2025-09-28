package ex_09_ForLoop;

public class Lab70_Loop_Continue_Even_Odd {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue; // even nos will be skipped and odd runs will be success
            }
            System.out.println(i); // o/p = 1 3 5 7 9
        }

        for (int i = 0; i < 5; i++) {
            if (i % 2 != 0) {
                continue; // odd nos will be skipped and odd runs will be success
            }
            System.out.println(i); // o/p = 0 2 4
        }
    }
}

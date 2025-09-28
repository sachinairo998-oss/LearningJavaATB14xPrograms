package ex_09_ForLoop;

public class Lab65_Loop_Decrement {
    public static void main(String[] args) {
        for (int i = -1; i < -10 ; i--) {
            System.out.println(i); // no o/p since condition fail -1 > -10
        }
        for (int i = -1; i > -10; i--) { // o/p = -1 to -9 no -10 bcoz -10 > -10 run fails
            System.out.println(i);

        }

        int i = 5;
        for (; i > 0; i--) {
            System.out.println(i); // o/p = 5 4 3 2 1 no 0 bcoz 0 > 0 run fails

        }
    }
}

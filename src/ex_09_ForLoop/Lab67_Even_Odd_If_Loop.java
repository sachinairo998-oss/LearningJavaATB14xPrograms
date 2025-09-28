package ex_09_ForLoop;

public class Lab67_Even_Odd_If_Loop {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            if (i % 2 == 0) { // even condition
                System.out.println("Even -> " +i); // o/p = Even -> 2 to 8
            }


            for (int j = 1; j < 10; j++) {
                if (j % 2 != 0){ // odd condition
                    System.out.println("Odd -> " +j); // o/p = Odd -> 1 to 9
                }

            }

        }
    }
}

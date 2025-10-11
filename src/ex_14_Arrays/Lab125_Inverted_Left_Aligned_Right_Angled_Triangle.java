package ex_14_Arrays;

import java.util.Scanner;

public class Lab125_Inverted_Left_Aligned_Right_Angled_Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value");
        int value = scanner.nextInt();
        for (int i = value; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
                // ***
                // **
                // * if value is 3
            }
            System.out.println("");

        }
    }
}

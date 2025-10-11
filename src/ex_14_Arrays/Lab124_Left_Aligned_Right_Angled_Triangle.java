package ex_14_Arrays;

import java.util.Scanner;

public class Lab124_Left_Aligned_Right_Angled_Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Value");
        int value = scanner.nextInt();

        for (int i = 0; i <= value; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
                // *
                // **
                // *** if number is 3
            }
            System.out.println("");
        }

    }
}

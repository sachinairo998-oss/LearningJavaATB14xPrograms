package ex_14_Arrays;

import java.util.Scanner;

public class Lab121_Inverted_Right_Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value");
        int value = scanner.nextInt();
        for (int i = value; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");

        }
    }
}

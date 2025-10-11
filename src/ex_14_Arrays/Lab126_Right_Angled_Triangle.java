package ex_14_Arrays;

import java.util.Scanner;

public class Lab126_Right_Angled_Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the num");
        int num = scanner.nextInt();

        for (int i = 0; i < num; i++) {
            for (int j = i; j < num-1; j++) {
                System.out.print("-");
            }
            for (int k = 0; k <= i ; k++) {
                System.out.print("*");
                // --*
                // -**
                // ***
            }
            System.out.println("");
        }
    }
}

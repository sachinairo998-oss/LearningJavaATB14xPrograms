package ex_10_While_Loop;

import java.util.Scanner;

public class Lab78_Factorial_IMP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number for Factorial program:"); // Enter number

        if (!scanner.hasNextInt()) {
            System.out.println("Enter a valid Integer value"); // if invalid number entered
        } else {
            int number = scanner.nextInt();
            int fact = 1;

            if (number < 0 || number > Integer.MAX_VALUE) {
                System.out.println("Cannot calculate factorial of a negative number!"); // if negative number entered
            } else if (number == 0) {
                System.out.println("Factorial = 1");
            } else {
                int i = 1;
                while (i <= number) {
                    fact = fact * i;
                    i++;
                }
                System.out.println(fact);
            }
        }
    }
}
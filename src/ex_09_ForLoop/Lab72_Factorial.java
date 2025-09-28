package ex_09_ForLoop;

import java.util.Scanner;

public class Lab72_Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no."); // we should enter number as scanner used
        int n = scanner.nextInt();
        int fact = 1;
        if (n == 0) {
        }
        for (int i = 1; i <= n ; i++) {
            fact = fact * i; // if entered value is 2 then 1 * 1 - 1 & 2 * 1 = 2 so the o/p will be 2
        }
        System.out.println(fact); // entered value 5 then 120 value
    }
}

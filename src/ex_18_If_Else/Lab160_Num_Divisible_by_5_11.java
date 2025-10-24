package ex_18_If_Else;

import java.awt.*;
import java.util.Scanner;

public class Lab160_Num_Divisible_by_5_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int num = scanner.nextInt();
        if (num % 5 == 0 && num % 11 == 0) {
            System.out.println(num + " divisible by 5 and 11");
        } else {
            System.out.println(num + " not divisible by 5 and 11");
        }
    }
}

/*Enter a number: 55
        55 is divisible by both 5 and 11.*/

/*If a number gives a remainder 0 when divided by 5 and also by 11 → divisible by both.
        Example: 55 % 5 == 0 and 55 % 11 == 0.*/

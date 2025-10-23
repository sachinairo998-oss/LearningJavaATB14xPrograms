package ex_18_If_Else;

import java.util.Scanner;

public class Lab153_Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 digit number: " );
        int num = scanner.nextInt();
        int first = num / 100;
        int last = num % 10;
        if (first == last) {
            System.out.println(num + " is Palindrome number"); // 121 is a Palindrome number.
        } else {
            System.out.println(num + " not a Palindrome number");
        }

    }
}

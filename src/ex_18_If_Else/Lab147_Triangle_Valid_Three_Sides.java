package ex_18_If_Else;

import java.util.Scanner;

public class Lab147_Triangle_Valid_Three_Sides {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three sides of triangle");
        int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();
        if (a + b > c && b + c > a && a + c > b) {
            System.out.println("Valid Triangle");
        } else {
            System.out.println("Invalid Triangle");
        }
    }
}

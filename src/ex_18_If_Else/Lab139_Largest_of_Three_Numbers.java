package ex_18_If_Else;

import java.util.Scanner;

public class Lab139_Largest_of_Three_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three nos.");
        int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();
        if (a > b && a > c) {
            System.out.println(a + " is Largest");
        } else if (b > a && b > c) {
            System.out.println(b + " is Largest");
        } else {
            System.out.println(c + " is Largest");
        }
    }
}

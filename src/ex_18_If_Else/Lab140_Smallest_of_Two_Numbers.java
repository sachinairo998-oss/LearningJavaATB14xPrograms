package ex_18_If_Else;

import java.util.Scanner;

public class Lab140_Smallest_of_Two_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two nos.");
        int a = scanner.nextInt(), b = scanner.nextInt();
        if (a < b) {
            System.out.println(a + " is Smallest");
        } else if (b < a) {
            System.out.println(b + " is Smallest");
        } else {
            System.out.println("Both nos are equal");
        }
    }
}

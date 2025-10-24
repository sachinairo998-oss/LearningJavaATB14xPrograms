package ex_18_If_Else;

import java.util.Scanner;

public class Lab163_Senoir_Citizen_age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age >= 0 && age <= 12) {
            System.out.println("Child.");
        } else if (age >= 13 && age <= 19) {
            System.out.println("Teenager.");
        } else if (age >= 20 && age <= 64) {
            System.out.println("Adult.");
        } else if (age >= 65) {
            System.out.println("Senior Citizen.");
        } else {
            System.out.println("Invalid age entered");
        }
    }
}
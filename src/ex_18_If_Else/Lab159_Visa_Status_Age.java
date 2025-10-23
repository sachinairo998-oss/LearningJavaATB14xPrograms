package ex_18_If_Else;

import java.util.Scanner;

public class Lab159_Visa_Status_Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // consume leftover newline

        System.out.print("Enter Visa Status (valid/invalid): ");
        String visa = scanner.nextLine();

        if (age >= 18) {
            if (visa.equalsIgnoreCase("valid")) {
                System.out.println("Person can travel");
            } else {
                System.out.println("Cannot travel - Visa invalid");
            }
        } else {
            System.out.println("Cannot travel - Age below 18");
        }
    }
}


/*
Enter Age: 25
Enter Visa Status (valid/invalid): valid
Person can travel

Enter Age: 16
Enter Visa Status (valid/invalid): valid
Cannot travel - Age below 18*/

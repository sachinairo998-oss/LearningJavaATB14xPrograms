package ex_18_If_Else;

import java.util.Scanner;

public class Lab155_Loan_Eligible {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Age: ");
        int age = scanner.nextInt();

        System.out.print("Enter Sal: ");
        double sal = scanner.nextDouble();

        System.out.print("Enter Credit Score: ");
        int credit_score = scanner.nextInt();

        if (age >= 18 && age <= 80) {
            if (sal >= 30000) {
                if (credit_score >= 650 && credit_score <= 850) {
                    System.out.println("Eligible for Loan");
                } else {
                    System.out.println("Low Credit Score");
                }
            } else {
                System.out.println("Less Salary");
            }
        } else {
            System.out.println("Age Not Eligible");
        }
    }
}
